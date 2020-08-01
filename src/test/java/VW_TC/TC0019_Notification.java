package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageActions.pom010_VW_Notification_Tab;
import resources.basePropertiesFile;



public class TC0019_Notification extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0019_Notification.class.getName());
	public WebDriverWait wait;
	@BeforeMethod
public void applicationLaunch() throws IOException, InterruptedException {
			
				driver=intializeWebDriver();	
				
			  	VoiceWatch_login();	
			  	
			  	
	}
	
	@Test(priority=1)
	public void NotificationTabValidation () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
		notifi.NotificationTabValidation();	
	
	}
	
	
	/*@Test(priority=2)
	public void Create_Notification_Using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Create_Notifi_using_Email_with_Def_Template();	      
	}
		

//	@Test(priority=3)
//	public void Create_Notification_using_User_with_Defaut_Template() throws IOException, InterruptedException {
//		
//		pom010_VoiceWatch_Notification_Tab notifi=new pom010_VoiceWatch_Notification_Tab(driver);
//	      
//	      notifi.Create_Notifi_using_User_with_Def_Template();	      
//	}
	
	
	@Test(priority=4)
	public void Edit_Notification_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Edit_Notifi_using_Email_with_Def_Template(); 
	
	}

	
	@Test(priority=5)
	public void Delete_Notifi_using_Email_with_Default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Delete_Notifi_using_Email_with_Def_Template(); 
	
	}
	
	@Test(priority=6)
	public void Create_Notifiion_using_Email_with_New_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_using_Email_with_New_Template();
	       
	}
	
	@Test(priority=7)
	public void Create_Notifion_with_New_Template_using_SaveAs_button() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Create_Notifi_with_New_Template_using_SaveAs_button();
	       
	}
	
	@Test(priority=8)
	public void Delete_new_template_under_Notification() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Delete_Email_Template(); 
	
	}		
	
	
	@Test(priority=9)
	public void Notification_Mail_Validation() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
	      notifi.Notifi_Mail_button_Validation();
	
	}
	
	@Test(priority=10)
	public void Notification_Assign_To_Test_with_default_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_def_Template();
	      
	
	}	
	
	@Test(priority=11)
	public void Notification_Assign_To_Test_with_new_Template() throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Notify_Assign_To_Test_with_New_Template();   
	
	}	
	
	
//	@Test(priority=12)
//	public void Email_Validation_On_Beta_Server () throws IOException, InterruptedException {
		
//		pom010_VoiceWatch_Notification_Tab notifi=new pom010_VoiceWatch_Notification_Tab(driver);
//		notifi.Email_Validation_on_Beta_Server();	       
	
//	}
	
	@Test(priority=13)
	public void Email_Validation_with_Test_assign_Notification_on_Beta_Server () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
		notifi.Email_Validation_with_test_on_Beta_Server();	       
	
	}		
	*/
	
	@AfterMethod
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");	
}
}
	
