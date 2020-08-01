package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom002_VW_Home_Page;
import PageActions.pom003_VW_Dashboard1_Tab;
import PageActions.pom004_VW_Alerts_Tab;
import PageActions.pom005_VW_Tests_Tab;
import PageActions.pom006_VW_Tags_Tab;
import PageActions.pom007_VW_Script_Tabs;
import PageActions.pom008_VW_Variable_Tab;
import PageActions.pom010_VW_Notification_Tab;
import PageActions.pom013_VW_User_Tab;
import PageActions.pom014_VW_Audit_Tab;
import PageActions.pom015_VW_Client_Tab;
import PageActions.pom016_VW_Admin_Tab;
import resources.basePropertiesFile;

public class TC0004_login_With_Partner_Customer_Admin extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0004_login_With_Partner_Customer_Admin.class.getName());
	
	@BeforeTest
	public void applicationLaunch() throws IOException, InterruptedException {
		
		driver=intializeWebDriver();						
	  	VoiceWatch_login();	
	  	wait=new WebDriverWait(driver,20);	
	  	
	}

	@Test(priority=0)
	public void Create_User () throws IOException, InterruptedException {		
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
		user_Tab.Clientselection("Partner");
		user_Tab.CreateUser("Partner Customer Admin","Customer Admin","hari@preempt.com");
		user_Tab.logoutUSER();
		user_Tab.loginUser("Partner Customer Admin");	
		
		log.debug("Waiting for launch VoiceWatch application using above creadetails");
	    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
	    log.debug("Verified that VoiceWatch Application login successfully with Partner_Customer Admin creadetial");
	    log.debug("Validate the requiment as Aceess Level= Partner & Role=Customer Admin");
			
	}
	
	
	@Test()
	public void gather_information () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		notify.Capture_Mandatory_details("Pt");
	}
	
	
	
	@Test(priority=1)
	public void TabValidation () throws IOException, InterruptedException {
		
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
		   d.Modified2Tab_Validation();
	}

	@Test(priority=2)
	public void headerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	    d.header();
	
	}
	
	@Test(priority=3)
	public void footerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	    d.footer();
	
	}	
	
	
	
	@Test(priority=4)
	public void dashBoardTabValidation () throws IOException, InterruptedException {
		
		pom003_VW_Dashboard1_Tab db=new pom003_VW_Dashboard1_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
				
		db.OverallPerfomance_section_dashboard();
		db.Tests_section_dashboard();
		d.header();
		d.footer();
		
			}
	
	@Test(priority=5)
	public void alertTabValidation () throws IOException, InterruptedException {
		
		pom004_VW_Alerts_Tab at=new pom004_VW_Alerts_Tab (driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
		at.alertsValidations();		
		d.header();
		d.footer();
		
	}
	
	/*@Test(priority=5)
	public void gather_information () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		notify.Capture_Mandatory_details("Pt");
	}*/
	
	@Test(priority=6)
	public void testTabValidation () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab ts=new pom005_VW_Tests_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	
		ts.TestsTabValidation();
		d.header();
		d.footer();	
		
	}
	
	@Test(priority=7)
	public void New_Test_Creation_Validation_Using_button () throws IOException, InterruptedException {
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.CreateTest_using_button();
	
	}
	
	@Test(priority=8)
	public void New_Test_Creation_Validation_using_Link () throws IOException, InterruptedException {
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.CreateTest_using_Link();
	
	}
	

	@Test(priority=9)
	public void Test_Update_Validation() throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.UpdateTest();
	}
	
	@Test(priority=10)
	public void Test_Now_Validation () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.Test_Now_Test();
		
	}
	
	
	@Test(priority=11)
	public void tagTabValidation () throws IOException, InterruptedException {
		
		pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	
		tg.tagsValidations();
		d.header();
		d.footer();
			
	}
	
	@Test(priority=12)
	public void CreateTag_By_button () throws IOException, InterruptedException {
		
		pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);
		
	tg.CreateTag_using_button();
		
	}
	
	@Test(priority=13)
	public void CreateTag_By_Link () throws IOException, InterruptedException {
		
		pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);
		
	
	tg.CreateTag_using_Link();
		
	}
	
	@Test(priority=14)
	public void Delete_Tag_feature () throws IOException, InterruptedException {
		
		pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);
		
	tg.Delete_Tag();
		
	}
	
	
//	@Test(priority=15)
//	public void Tag_Assign_Test () throws IOException, InterruptedException {
		
//		pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);
		
//	tg.Notify_Assign_To_Test();
		
//	}
	
	
	
	
	
	@Test(priority=16)
	public void scriptTabValidation () throws Exception {
		
		
		pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
			
		sc.ScriptTabValidation();
		d.header();
		d.footer();
		
			
	}
	
	@Test(priority=17)
	public void createScript_and_run_using_button () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		      
	    scriptTabs.Create_run_Script_using_button();
		
	
	}
		
	
	@Test(priority=18)
	public void createScript_and_run_using_Link () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		      
	    scriptTabs.Create_run_Script_using_Link();
		
	
	}
	
	
	
	
	@Test(priority=19)
	public void updateScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
	    scriptTabs.UpdateScript();
	
	}
	
	@Test(priority=20)
	public void copyScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CopyScript();
	    
	    }
	@Test(priority=21)
	public void createScript_by_CSV () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CreateCSVTransformer();
	
	}
	
	
	@Test(priority=22)
	public void variableTabValidation () throws Exception {
		
		
		pom008_VW_Variable_Tab vr=new pom008_VW_Variable_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);
		
		vr.VariableTabValidation();
		d.header();
		d.footer();

	}
	
	@Test(priority=23)
	public void createVariable_using_button () throws IOException, InterruptedException {
		
		pom008_VW_Variable_Tab VarTab=new pom008_VW_Variable_Tab(driver);
		VarTab.createVariableByButton();

	
	}
	
	@Test(priority=24)
	public void createVariable_using_Link () throws IOException, InterruptedException {
		
		pom008_VW_Variable_Tab VarTab=new pom008_VW_Variable_Tab(driver);
		VarTab.createVariableByLink();
	
	}
	
	@Test(priority=25)
	public void Variable_Integration_with_Test () throws IOException, InterruptedException {
		
		pom008_VW_Variable_Tab VarTab=new pom008_VW_Variable_Tab(driver);
		VarTab.Test_Now_With_Variable();
	
	}
	
	
	
	@Test(priority=26)
	public void NotificationTabValidation () throws Exception {
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.NotificationTabValidation();
	
	}

	/*@Test(priority=27,dependsOnMethods= {"gather_information"})
	public void Create_Notification_Using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Create_Notifi_using_Email_with_Def_Template();	      
	}
		

	@Test(priority=28,dependsOnMethods= {"gather_information"})
	public void Create_Notification_using_User_with_Defaut_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		
	
	      
	      notifi.Create_Notifi_using_User_with_Def_Template();	      
	}
	
	
	@Test(priority=29,dependsOnMethods= {"gather_information"})
	public void Edit_Notification_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Edit_Notifi_using_Email_with_Def_Template(); 
	
	}

	
	@Test(priority=30,dependsOnMethods= {"gather_information"})
	public void Delete_Notifi_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Delete_Notifi_using_Email_with_Def_Template(); 
	
	}
	
	@Test(priority=31,dependsOnMethods= {"gather_information"})
	public void Create_Notifiion_using_Email_with_New_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_using_Email_with_New_Template();
	       
	}
	
	@Test(priority=32,dependsOnMethods= {"gather_information"})
	public void Create_Notifion_with_New_Template_using_SaveAs_button() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_with_New_Template_using_SaveAs_button();
	       
	}
	
	@Test(priority=33,dependsOnMethods= {"gather_information"})
	public void Delete_new_template_under_Notification() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Delete_Email_Template(); 
	
	}		
	
	
	@Test(priority=34,dependsOnMethods= {"gather_information"})
	public void Notification_Mail_Validation() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Notifi_Mail_button_Validation();
	
	}
	
	@Test(priority=35,dependsOnMethods= {"gather_information"})
	public void Notification_Assign_To_Test_with_default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_def_Template();
	      
	
	}	
	
		@Test(priority=36,dependsOnMethods= {"gather_information"})
	public void Notification_Assign_To_Test_with_default_Template_Using_User() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_def_Template_Using_User();
	      
	
	}	
	
	
	
	@Test(priority=37,dependsOnMethods= {"gather_information"})
	public void Notification_Assign_To_Test_with_new_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_New_Template();   
	
	}	
	
	@Test(priority=38,dependsOnMethods= {"gather_information"})
	public void Notification_Assign_To_Test_with_new_Template_Using_User() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_New_Template_Using_User();   
	
	}		
	
	
//	@Test(priority=38)
//	public void Email_Validation_On_Beta_Server () throws IOException, InterruptedException {
		
//		pom010_VoiceWatch_Notification_Tab notifi=new pom010_VoiceWatch_Notification_Tab(driver);
//		notifi.Email_Validation_on_Beta_Server();	       
	
//	}
	
	@Test(priority=39,dependsOnMethods= {"gather_information"})
	public void Email_Validation_with_Test_assign_Notification_on_Beta_Server () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Email_Validation_with_test_on_Beta_Server();	       
	
	}		
	
	@Test(priority=40,dependsOnMethods= {"gather_information"})
	public void Email_Validation_with_Test_assign_Notification_on_Beta_Server_Using_User () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Email_Validation_with_test_on_Beta_Server_Using_User();	       
	
	}		*/
	
	@Test(priority=41)
	public void User_TabValidation () throws IOException, InterruptedException {
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver); 
		user_Tab.UserTabValidation("Partner");
	
	}	
	

		
	@Test(priority=42)
	public void New_User_Creation_using_button () throws IOException, InterruptedException {
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver); 
		user_Tab.CreateUserfunctinality_using_button("Partner","Customer Admin","hari@preempt.com");
	
	}		
	
	
	@Test(priority=43)
	public void New_User_Creation_using_Link () throws IOException, InterruptedException {
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver); 
		user_Tab.CreateUserfunctinality_using_Link("Partner","Customer Admin","hari@preempt.com");
	
	}		
	
	
	@Test(priority=44)
	public void New_User_Deletion () throws IOException, InterruptedException {
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver); 
		user_Tab.DeleteUserfunctinalty("Partner","Customer Admin","hari@preempt.com");
	
	}	
	
	@Test(priority=45)
	public void ClientsTabValidation () throws Exception {
		pom015_VW_Client_Tab client =new pom015_VW_Client_Tab(driver);
		client.ClientsTabValidation("Partner");
		
	}
	
	
	@Test(priority=46)
	public void Audit_Tab_Validation () throws IOException, InterruptedException {
		
     pom014_VW_Audit_Tab audit_tab=new pom014_VW_Audit_Tab(driver);
     audit_tab.AuditTabValidation("Partner");
   	
	}	
		
	@Test(priority=47)
	public void Audit_Tab_Search () throws IOException, InterruptedException {
		
     pom014_VW_Audit_Tab audit_tab=new pom014_VW_Audit_Tab(driver);
      audit_tab.AuditSearchFunctinality("Partner",pom013_VW_User_Tab.Partner_Cust_Admin,pom013_VW_User_Tab.UserEmail);
	
	}	
	
	@Test(priority=48)
	public void Admin_Tab_Validation () throws IOException, InterruptedException {
		
     pom016_VW_Admin_Tab admin_Tab=new pom016_VW_Admin_Tab(driver);
      admin_Tab.AdminTabValidation();
	
	}	
	
	@Test(priority=49)
	public void LoginAsAdmin () throws IOException, InterruptedException {
		
	driver.close();
     driver=intializeWebDriver();						
	 VoiceWatch_login();
		
	}	
	
	@Test(priority=50)
	public void Cleaning_User_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
		
	 pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
	
	 user_Tab.DeleteUser("Partner Customer Admin");
	
	}	
	
	@Test(priority=51)
	public void Cleaning_Test_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
		
	
	 pom005_VW_Tests_Tab tests_Tab=new pom005_VW_Tests_Tab(driver);
	 	
	 tests_Tab.Testdeletion();	
	
	}	
	
	@Test(priority=52)
	public void Cleaning_Tag_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
		
	 pom006_VW_Tags_Tab tags_Tab=new pom006_VW_Tags_Tab(driver);
	 tags_Tab.Tagdeletion();
	
	}	
	
	@Test(priority=53)
	public void Cleaning_Script_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
		
	 pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);

	
	 sc.scriptdeletion();	
	}	
	
	@Test(priority=54)
	public void Cleaning_Variable_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
		
	 pom008_VW_Variable_Tab variable_Tab=new pom008_VW_Variable_Tab(driver);
	
	 variable_Tab.Variabledeletion();
	
	}	
	
	/*@Test(priority=55)
	public void Cleaning_Notify_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
		
	 pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);		
	
	 notify.Notifydeletion();

	}	*/
	
	@Test(priority=56)
	public void Cleaning_AllUser_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
		
	 pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
	
	 user_Tab.DeleteRemainingUser();	
	}	
	
			
		
	@AfterTest
	public void applicationClose() throws InterruptedException {
		
	 	driver.close();
		log.info("Application closed successfully");
		
	}
	}	
