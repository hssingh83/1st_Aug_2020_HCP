package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom005_VW_Tests_Tab;
import PageActions.pom007_VW_Script_Tabs;
import PageActions.pom008_VW_Variable_Tab;
import PageActions.pom010_VW_Notification_Tab;
import resources.basePropertiesFile;


//@Listeners(listeners.class)
public class TC0021_login_With_Exmpirix_Admin_Sanity_Flow_26_release extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0021_login_With_Exmpirix_Admin_Sanity_Flow_26_release.class.getName());

	
	@BeforeTest
public void applicationLaunch() throws IOException, InterruptedException {
		driver=intializeWebDriver();						
	  	VoiceWatch_login();	
		
							
	}
	
	@Test()
	public void gather_information () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		notify.Capture_Mandatory_details("Clinet");
	}	
	
	@Test(priority=1)
	public void createScript_and_run_using_button  () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		      
	    scriptTabs.Create_Delete_ScriptByScriptUpload_26();
		
	
	}
	
	@Test(priority=2)
	public void delete_script_using_deleteScript_AllData_option () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		scriptTabs.DeleteScriptAllData_26();
		
	}
	
	@Test(priority=3)
	public void delete_script_using_deleteScrip_deleteScript_only_option () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.DeleteScriptAllData_26();
	
	}
	
	@Test(priority=4)
	public void copyScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CopyScript_26();
	    
	    }
	
	@Test(priority=5)
	public void updateScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
	    scriptTabs.UpdateScript_26();
	
	}
	
	
	@Test(priority=6)
	public void createScript_by_ScriptUpload ()throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.Create_Delete_ScriptByScriptUpload_26();
	
	}

	
	@Test(priority=7)
	public void createScript_by_CSV () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CreateCSVTransformer();
	
	}
	
	@Test(priority=8)
	public void New_Test_Creation_Validation () throws IOException, InterruptedException {
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.CreateTest_using_button_26();
	
	}

	@Test(priority=9)
	public void Test_Deletion_Validation () throws IOException, InterruptedException {
		
	//	pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	 //   san.DeleteTest();
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.DeleteTest_26();
	
	}
	
	@Test(priority=10)
	public void Test_Update_Validation() throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.UpdateTest_26();
	}
	
	@Test(priority=11)
	public void Test_Now_Validation () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.Test_Now_Test_26();
		
	}
	
	
	@Test(priority=12)
	public void Create_Notification_Using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifiy=new pom010_VW_Notification_Tab(driver);
	      
	      notifiy.Create_Notifi_using_Email_with_Def_Template();     
	}
		

	@Test(priority=13)
	public void Create_Notification_using_User_with_Defaut_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Create_Notifi_using_User_with_Def_Template();	      
	}
	
	
	@Test(priority=14)
	public void Edit_Notification_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Edit_Notifi_using_Email_with_Def_Template(); 
	
	}

	
	@Test(priority=15)
	public void Delete_Notifi_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Delete_Notifi_using_Email_with_Def_Template(); 
	
	}
	
	@Test(priority=16)
	public void Create_Notifiion_using_Email_with_New_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_using_Email_with_New_Template();
	       
	}
	
	@Test(priority=17)
	public void Create_Notifion_with_New_Template_using_SaveAs_button() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_with_New_Template_using_SaveAs_button();
	       
	}
	
	
	
//	@Test(priority=18)
//	public void Delete_new_template_under_Notification() throws IOException, InterruptedException {
		
//		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
//		notifi.Delete_Email_Template(); 
	
//	}		
	

	
	@Test(priority=19)
	public void Notification_Mail_Validation() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Notifi_Mail_button_Validation();
	
	}
	
	@Test(priority=20)
	public void Notification_Assign_To_Test_with_default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_def_Template26();
	      
	
	}	
	
	@Test(priority=21)
	public void Notification_Assign_To_Test_with_new_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_New_Template_26();   
	
	}	
	
	
//	@Test(priority=22)
//	public void Email_Validation_On_Beta_Server () throws IOException, InterruptedException {
		
//		pom010_VoiceWatch_Notification_Tab notifi=new pom010_VoiceWatch_Notification_Tab(driver);
//		notifi.Email_Validation_on_Beta_Server();	       
	
//	}
	
	@Test(priority=23)
	public void Email_Validation_with_Test_assign_Notification_on_Beta_Server () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Email_Validation_with_test_on_Beta_Server_26();	       
	
	}	
	
	
	@Test(priority=24)
	public void CleaningTestData () throws Exception {
		
	
		pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
	//	pom008_VW_Variable_Tab variable_Tab=new pom008_VW_Variable_Tab(driver);
		
		sc.scriptdeletion_26();
		notify.Notifydeletion();
	//	variable_Tab.Variabledeletion();
	//	notify.EmailTemplatedeletion();
	 
	}
	
	@AfterTest
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
		
        }	
		
}
    
