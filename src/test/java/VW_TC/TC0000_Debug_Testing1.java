package VW_TC;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom001_VW_logIn_Page;
import PageActions.pom002_VW_Home_Page;
import PageActions.pom003_VW_Dashboard1_Tab;
import PageActions.pom004_VW_Alerts_Tab;
import PageActions.pom005_VW_Tests_Tab;
import PageActions.pom006_VW_Tags_Tab;
import PageActions.pom007_VW_Script_Tabs;
import PageActions.pom008_VW_Variable_Tab;
import PageActions.pom009_VW_Hammers_Tab;
import PageActions.pom010_VW_Notification_Tab;
import resources.basePropertiesFile;
import resources.dataDriven;


public class TC0000_Debug_Testing1 extends basePropertiesFile{

	
	
	
	private static Logger log =LogManager.getLogger(TC0000_Debug_Testing1.class.getName());
	

	
	
	@BeforeTest
public void applicationLaunch() throws IOException, InterruptedException {
		driver=intializeWebDriver();						
	  	VoiceWatch_login();	
		
							
	}
	

/*@Test(priority=8)
public void createScript_by_ScriptUpload ()throws IOException, InterruptedException {
	
	pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);

	scriptTabs.Create_Delete_ScriptByScriptUpload();

}
*/
	
	
	@Test(priority=26)
	public void CleaningTestData () throws Exception {
		
	
		pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		pom008_VW_Variable_Tab variable_Tab=new pom008_VW_Variable_Tab(driver);
		
		sc.e2escriptdeletion();
		sc.scriptdeletion();
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