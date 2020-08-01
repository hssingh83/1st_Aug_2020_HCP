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
public class TC0021_login_With_Exmpirix_Admin_Sanity_Flow_27_release extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0021_login_With_Exmpirix_Admin_Sanity_Flow_27_release.class.getName());

	
	@BeforeTest
public void applicationLaunch() throws IOException, InterruptedException {
		driver=intializeWebDriver();						
	  	VoiceWatch_login();	
		
							
	}
	
/*	
	@Test()
	public void Client_creation () throws IOException, InterruptedException {
		
		pom015_VW_Client_Tab client_Tab=new pom015_VW_Client_Tab(driver);
		client_Tab.client_Creation();
	}	
	*/
	
	
	@Test(priority=0)
	public void gather_information () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		notify.Capture_Mandatory_details("Clinet");
	}	
	

	
	@Test(priority=1)
	public void CBM_Test_Scheduling () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notification_Tab=new pom010_VW_Notification_Tab(driver);
		notification_Tab.CBM_Test_scheduling();
		
	}
	
	
	@Test(priority=2)
	public void IVR_create_Script_and_run_using_button  () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		      
	    scriptTabs.Create_run_Script_using_button();		
	
	}
	
	
	
	@Test(priority=3)
	public void CBM_Test_Creation () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab CBMTest=new pom005_VW_Tests_Tab(driver);
		CBMTest.Create_CBM_Test();
		
	}
	
	
	
	@Test(priority=4)
	public void CBM_Test_Deletion () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab CBMTest=new pom005_VW_Tests_Tab(driver);
		CBMTest.Delete_CBM_Test();
		
	}
	
	
	@Test(priority=5)
	public void CBM_Test_Update () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab CBMTest=new pom005_VW_Tests_Tab(driver);
		CBMTest.Update_CBM_Test();
		
	}
	
	
	
	@Test(priority=6)
	public void CBM_Test_Now_Validation_Using_PKG1 () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.CBM_Test_Now_Using_CB_Asterisk_Meeting_PKG();
		
	}

	
	
	@Test(priority=7)
	public void CBM_Test_Now_Validation_Using_PKG2 () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.CBM_Test_Now_Using_CB_Webinar_Meeting_PKG();
		
	}
		
	
	@Test(priority=8)
	public void E2E_Script_Creation_and_run_using_button  () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		      
	    scriptTabs.Create_run_E2E_Script_using_button();
		
	
	}
	
	
	@Test(priority=9)
	public void IVR_delete_script_using_AllData_option () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		scriptTabs.DeleteScriptAllData();
		
	}
	
	@Test(priority=10)
	public void IVR_delete_script_using_deleteScript_only_option () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.DeleteScriptOnly();
	
	}
	
	@Test(priority=11)
	public void IVR_Script_Copy_Functionality() throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CopyScript();
	    
	    }
	
	@Test(priority=12)
	public void IVR_Script_Update_Functionality() throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
	    scriptTabs.UpdateScript();
	
	}
	
	
	
	@Test(priority=13)
	public void CallMaster_ScriptUpload_Functionality ()throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.Create_Delete_ScriptByScriptUpload();
	
	}

	
	@Test(priority=14)
	public void CSV_ScriptUpload_Functionality () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CreateCSVTransformer();
	
	}
	
	@Test(priority=15)
	public void IVR_New_Test_Creation_Functionality () throws IOException, InterruptedException {
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.CreateTest_using_button();
	
	}

	@Test(priority=16)
	public void IVR_New_Test_Deletion_Functionality () throws IOException, InterruptedException {
		
	//	pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	 //   san.DeleteTest();
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.DeleteTest();
	
	}
	
	@Test(priority=17)
	public void IVR_Test_Updation_Functionality() throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.UpdateTest();
	}
	
	@Test(priority=18)
	public void IVR_Test_Now_Functionality () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.Test_Now_Test();
		
	}	
	
	
	@Test(priority=19)
	public void Create_Notification_Using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Create_Notifi_using_Email_with_Def_Template();	   
	}
		

	
	
	@Test(priority=20)
	public void Notification_Assign_To_Test_with_default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_def_Template();
	      
	
	}	
	
	
	@Test(priority=21)
	public void Create_Notification_using_User_with_Defaut_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Create_Notifi_using_User_with_Def_Template();	      
	}
	
	
	
	@Test(priority=22)
	public void Edit_Notification_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Edit_Notifi_using_Email_with_Def_Template(); 
	
	}

	@Test(priority=23)
	public void Notification_Assign_To_Test_with_new_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_New_Template();   
	
	}	
	
	
	@Test(priority=24)
	public void Delete_Notifi_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Delete_Notifi_using_Email_with_Def_Template(); 
	
	}
	
	@Test(priority=25)
	public void Create_Notifiion_using_Email_with_New_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_using_Email_with_New_Template();
	       
	}
	
	@Test(priority=26)
	public void Create_Notifion_with_New_Template_using_SaveAs_button() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_with_New_Template_using_SaveAs_button();
	       
	}
	
	@Test(priority=27)
	public void Delete_new_template_under_Notification() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Delete_Email_Template(); 
	
	}		
	
	
	@Test(priority=28)
	public void Notification_Mail_Validation() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Notifi_Mail_button_Validation();
	
	}
	
	@Test(priority=29)
	public void CBM_Test_Assign_Notification () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notification_Tab=new pom010_VW_Notification_Tab(driver);
		notification_Tab.CBM_Test_Now_Assign_Notificaton();
		
	}
		
//	@Test(priority=30)
//	public void Email_Validation_On_Beta_Server () throws IOException, InterruptedException {
		
//		pom010_VoiceWatch_Notification_Tab notifi=new pom010_VoiceWatch_Notification_Tab(driver);
//		notifi.Email_Validation_on_Beta_Server();	       
	
//	}
	
	@Test(priority=31)
	public void Email_Validation_with_Test_assign_Notification_on_Beta_Server () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Email_Validation_with_test_on_Beta_Server();	       
	
	}	
	
	
	@Test(priority=32)
	public void IVR_CopyToAnotherScript_Functionality () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		scriptTabs.CopyToAnotherApp();
	}	
	
	
	
	@Test(priority=33)
	public void CleaningTestData () throws Exception {
		
	
		pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		pom008_VW_Variable_Tab variable_Tab=new pom008_VW_Variable_Tab(driver);
	//	pom005_VW_Tests_Tab tests_Tab=new pom005_VW_Tests_Tab(driver);
		sc.e2escriptdeletion();
		sc.scriptdeletion();		
		notify.Notifydeletion();
	//	tests_Tab.CBMTestdeletion();
	//	variable_Tab.Variabledeletion();
	//	notify.EmailTemplatedeletion();
	 
	}
	
	@Test(priority=34)
	public void Validating_CBM_Test_Scheduling () throws Exception {
		
	
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
	
		notify.CBM_Test_scheduling_Verification();
	 
	}	
	
	
	@AfterTest
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
		
        }	
		
}
    
