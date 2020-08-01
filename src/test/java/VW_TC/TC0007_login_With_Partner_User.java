package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
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
import PageActions.pom015_VW_Client_Tab;
import PageActions.pom016_VW_Admin_Tab;
import resources.basePropertiesFile;

public class TC0007_login_With_Partner_User extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0007_login_With_Partner_User.class.getName());
	

@BeforeTest
public void applicationLaunch() throws IOException, InterruptedException {
	
	driver=intializeWebDriver();						
  	VoiceWatch_login();	
  }		
	

		@Test(priority=0)
	public void Create_User () throws IOException, InterruptedException {
		
		pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
		user_Tab.Clientselection("Partner");
		user_Tab.CreateUser("Partner User","User","hsingh@preempt.com");
		user_Tab.logoutUSER();
		user_Tab.loginUser("Partner User");	
			
	}
		
		@Test()
		public void Geather_Infomation () throws IOException, InterruptedException {
			
			pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
			notify.Capture_Mandatory_details("Pt");
		}	
			
	

	@Test(priority=1)
	public void TabValidation () throws IOException, InterruptedException {
		
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);
		//   d.Tab_Validation();
		//d.ModifiedTab_Validation();
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
		public void alertTabValidation () throws Exception {
			
			pom004_VW_Alerts_Tab at=new pom004_VW_Alerts_Tab (driver);
			pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
			at.alertsValidations();		
			at.hammerColumn();
			d.header();
			d.footer();
			
		}
		
		/*@Test(priority=5)
		public void Geather_Infomation () throws IOException, InterruptedException {
			
			pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
			notify.Capture_Mandatory_details("Pt");
		}	*/
		
		
		@Test(priority=7)
		public void testTabValidation () throws IOException, InterruptedException {
			
			
			pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
			pom005_VW_Tests_Tab ts=new pom005_VW_Tests_Tab(driver);

			
			ts.TestsTabValidation();
			d.header();
			d.footer();
		}
		
		@Test(priority=8)
		public void variableTabValidation () throws Exception {
			
			pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);		
			pom008_VW_Variable_Tab vr=new pom008_VW_Variable_Tab(driver);		
			
			
			vr.VariableTabValidation();
			d.header();
			d.footer();
		}
		
		@Test(priority=9)
		public void NotificationTabValidation () throws Exception {
			pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
			pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
			notifi.NotificationTabValidation();
			d.header();
			d.footer();
			

		}
	//Testing compile error	
		@Test(priority=10)
		public void ClientsTabValidation () throws Exception {
			pom015_VW_Client_Tab client =new pom015_VW_Client_Tab(driver);
			pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
			client.ClientsTabValidation("Partner");
			d.header();
			d.footer();	

		}
		
		@Test(priority=11)
		public void AdminTabValidation () throws Exception {
			
			pom016_VW_Admin_Tab admin=new pom016_VW_Admin_Tab(driver);
			pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
			admin.AdminTabValidation();
			d.header();
			d.footer();
			

		}	
		
		@Test(priority=12)
		public void LoginAsAdmin () throws IOException, InterruptedException {
			
		driver.close();
	     driver=intializeWebDriver();						
		 VoiceWatch_login();
			
		}	
		
		@Test(priority=13)
		public void Cleaning_TestData_As_Partner_Customer_Admin () throws IOException, InterruptedException {
			
		 pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
			
		 user_Tab.DeleteUser("Partner User");
		
		}	
		
		
		
		@AfterTest
		public void applicationClose() {
		
			driver.close();
			log.info("Application closed successfully");
			
		}
}
	
	
	
	
	
	
	
	
	
