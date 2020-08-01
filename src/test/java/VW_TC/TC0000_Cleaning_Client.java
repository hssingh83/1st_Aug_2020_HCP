package VW_TC;

import java.io.IOException;
import java.util.ArrayList;

import javax.management.Notification;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
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
import PageActions.pom013_VW_User_Tab;
import resources.basePropertiesFile;
import resources.dataDriven;


public class TC0000_Cleaning_Client extends basePropertiesFile{
	
	

   
	
	
		private static Logger log =LogManager.getLogger(TC0000_Cleaning_Client.class.getName());
		public WebDriverWait wait;
		@BeforeTest
	public void applicationLaunch() throws IOException, InterruptedException {
				
					driver=intializeWebDriver();	
					
					VoiceWatch_login();							
		}
		
	


	
/*	@Test(priority=2)
	public void CleaningTestData_Under_Test_Tab () throws Exception {		
		
		pom005_VW_Tests_Tab tests_Tab=new pom005_VW_Tests_Tab(driver);
		tests_Tab.Testdeletion();
		
	 
	}
	

	@Test(priority=3)
	public void CleaningTestData_Under_Tag_Tab () throws Exception {	
		
		 pom006_VW_Tags_Tab tags_Tab=new pom006_VW_Tags_Tab(driver);
		tags_Tab.Tagdeletion();
	
	 
	}
	

	@Test(priority=4)
	public void CleaningTestData_Under_Script_Tab () throws Exception {	
			
		pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
		sc.scriptdeletion();	

	}
	
	@Test(priority=6)
	public void CleaningTestData_Under_Notify_Tab () throws Exception {	
		
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		
		
		notify.Notifydeletion();
			 
	}
	
	@Test(priority=5)
	public void CleaningTestData_Under_Variable_Tab () throws Exception {	
		
	
		pom008_VW_Variable_Tab variable_Tab=new pom008_VW_Variable_Tab(driver);
		
		
		variable_Tab.Variabledeletion();
	
	 
	}
	
	@Test(priority=1)
	public void CleaningTestData_Under_Specific_User_Tab () throws Exception {	
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
		user_Tab.DeleteUser("Client");

	 
	}
	
	@Test(priority=7)
	public void CleaningTestData_Under_All_User_Tab () throws Exception {	
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
	
		user_Tab.DeleteRemainingUser();
		
	//	notify.EmailTemplatedeletion();
	 
	}*/
	
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
	
	
	
   /* @AfterTest
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
    }*/
    }
