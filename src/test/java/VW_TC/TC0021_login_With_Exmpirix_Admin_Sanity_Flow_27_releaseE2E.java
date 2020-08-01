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
import PageActions.pom015_VW_Client_Tab;
import resources.basePropertiesFile;


//@Listeners(listeners.class)
public class TC0021_login_With_Exmpirix_Admin_Sanity_Flow_27_releaseE2E extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0021_login_With_Exmpirix_Admin_Sanity_Flow_27_releaseE2E.class.getName());

	
	@BeforeTest
public void applicationLaunch() throws IOException, InterruptedException {
		driver=intializeWebDriver();						
	  	VoiceWatch_login();	
		
							
	}
	
	
		
	
	@Test(priority=0)
	public void gather_information () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		notify.Capture_Mandatory_details("Clinet");
	}	
	

	
	
	
	@Test(priority=1)
	public void createScript_and_run_using_button  () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		      
	    scriptTabs.Create_run_E2E_Script_using_button();
		
	
	}
	
	
	/*@AfterTest
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
		
        }	*/
		
}
    
