/*package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.p00_reuseable_case;
import PageActions.pom001_logInPage;
import resources.baseProperties;
import testCase_ClientPage.TC0003_Client_Created_Emprix_Admin;

public class driverScript extends baseProperties {
	
	private static Logger log =LogManager.getLogger(TC0003_Client_Created_Emprix_Admin.class.getName());
	
	//Browser Initialization
	
	@Test
	public void applicationLaunch() throws IOException, InterruptedException
	{
	log.info("VoiceWatch loginPageAccess TestCase Validation Started");
	driver=intializeDriver();
	log.info("Driver intilized successfully");
	driver.get(prop.getProperty("url"));
	Thread.sleep(10000);
	log.info("VoiceWatch Application Launched successfully");
	}
*/














































/*public class TC0000_reusable extends baseProperties{
	
	
	
	
	
	@BeforeTest
	public void loginToApplication () throws InterruptedException, IOException 
	
	{
	
	   
		p00_reuseable_case r=new p00_reuseable_case(driver);
	    
		baseProperties b=new baseProperties();
		
		b.BrowserInitializer();
		b.applicationVoiceWatchLaunch();
	//    b.loginCredetials();
	//	r.loginCredetials();
	    
		r.BrowserInitializer();	
		r.applicationVoiceWatchLaunch();
		l.logPageLabelVerification();
	    r.loginCredetials();
	    r.closeApplication();
	

	}	
			
	@Test
	public void testing () throws InterruptedException, IOException 
	
	{
	
		pom001_logInPage l=new pom001_logInPage(driver);
		l.logPageLabelVerification();
		
		
	}
	

}

*/