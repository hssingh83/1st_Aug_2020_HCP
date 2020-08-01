package PageActions;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import resources.basePropertiesFile;

public class p00_reuseable_case extends basePropertiesFile{ 

//	private static Logger log =LogManager.getLogger(p00_reuseable_case.class.getName());
	
	private static Logger log =LogManager.getLogger(p00_reuseable_case.class.getName());
	
	/*@BeforeTest
	public void BrowserInitializer() throws IOException
	{
				
		driver=intializeDriver();
		
	}
	*/
	/*
	public void applicationVoiceWatchLaunch () throws InterruptedException, IOException {
	
	
		driver.get(prop.getProperty("url"));
		
		log.info("VoiceWatch loginPageAccess Successfully");	
			
		Thread.sleep(10000);
		  
		driver.manage().window().maximize();
		
		log.info("Maximise the Page successfully");	
			
		log.info("VoiceWatch Application Launched successfully");
		
	}*/
	
/*	public void loginCredetials () throws InterruptedException, IOException {
		
		log.info("Inserting Credentials");	
		
		dataDriven d=new dataDriven();
		  ArrayList<String> data=d.getData("login","Admin_login");
		  
		  pom001_logInPage l=new pom001_logInPage(driver); 
		  
		  l.getUsername().sendKeys(data.get(1));
		  
		  l.getPassword().sendKeys(data.get(2));
		  
		  l.getSignButton().click();	
		  
		 
	}
	*/
public void closeApplication () throws InterruptedException, IOException {
		
	Thread.sleep(10000);
	driver.close();	
	log.info("Closing Browser");
	}
	
	
	
	
	
	
	public p00_reuseable_case(WebDriver driver1) {
		this.driver=driver1;
	}	
	
	
	
}


