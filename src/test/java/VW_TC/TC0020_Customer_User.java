package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageActions.pom010_VW_Notification_Tab;
import PageActions.pom013_VW_User_Tab;
import resources.basePropertiesFile;



public class TC0020_Customer_User extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0020_Customer_User.class.getName());
	public WebDriverWait wait;
	@BeforeMethod
public void applicationLaunch() throws IOException, InterruptedException {
			
				driver=intializeWebDriver();	
				
			  	VoiceWatch_login();	
			  	
			  	
	}
	
	@Test(priority=1)
	public void NotificationTabValidation () throws IOException, InterruptedException {
		
		pom013_VW_User_Tab userTab=new pom013_VW_User_Tab(driver);
		
//		pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
	      
//		notifi.NotificationTabValidation();	
		
	//	userTab.CreateUser(null);
	//	userTab.DeleteUser();
	
	}
	
	
	
	
/*	@AfterMethod
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");	
}*/
}
	
