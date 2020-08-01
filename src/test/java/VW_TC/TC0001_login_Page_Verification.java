package VW_TC;

import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import PageActions.pom001_VW_logIn_Page;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import resources.basePropertiesFile;

public class TC0001_login_Page_Verification extends basePropertiesFile{
	
	
		
		private static Logger log =LogManager.getLogger(TC0001_login_Page_Verification.class.getName());
	
	@BeforeTest
	
	public void applicationLaunch() throws IOException, InterruptedException {
		
		driver=intializeWebDriver();
	}
	
	@Test(priority = 1, description = "verifying login page title test")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test Case Description: Verify login page title test on Login Page")
	@Story("Story Name: To check login page title")
	
	public void logInScreenVerification () {
		
		pom001_VW_logIn_Page l=new pom001_VW_logIn_Page(driver);
		l.logPageLabelVerification();
		l.getCopyRightLink().click();
		log.info("Verified that 'Additional Copy Right' Link clickable");
		
		
		Assert.assertEquals(driver.findElement(By.id("additional-copyright-info")).getText(),"Copyright © 2010-14 ForgeRock AS, all rights reserved.");
		log.info("Verified that additinal infomation'Copyright © 2010-14 ForgeRock AS, all rights reserved.' appered after click link");
		
	}	
	
	
	@AfterTest
	public void applicationClose() {
	
		driver.close();
		log.info("Application closed successfully");
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	
	@Test
	public void loginToApplication () throws InterruptedException, IOException 
	
	{
		 p00_reuseable_case r=new p00_reuseable_case(driver);
		 pom001_logInPage l=new pom001_logInPage(driver);
		 
		 
		 r.BrowserInitializer();
		 
//		 l.logPageLabelVerification();
		 r.applicationVoiceWatchLaunch();
		 r.loginCredetials();
		
	}
	
}
*/
	/*@BeforeTest
	public void initializer() throws IOException
	{
		log.info("VoiceWatch loginPageAccess TestCase Validation Started");
		
		driver=intializeDriver();
		log.info("Driver intilized successfully");
	}
	
	
	//@Test(dataProvider="getData")
	
	//public void basePageNavigtion (String Username, String Password) throws InterruptedException
	
	@Test
	public void basePageLoginValidation () throws InterruptedException, IOException 
	
	{
	
		
	//	dataDriven d=new dataDriven();
	//	ArrayList<String> data=d.getData("login","Admin_login");
		
	//	driver.get(data.get(1));
				
		driver.get(prop.getProperty("url"));
		
		
		Thread.sleep(10000);
		  
		driver.manage().window().maximize();
		 
		
		log.info("VoiceWatch Application Launched successfully");
		
		
		pom001_logInPage l=new pom001_logInPage(driver);
		
		
		
		
	//**LogIn Page Label verification Started//
		l.logPageLabelVerification();
	
	//Additional Copyright Information
		
	//	l.getCopyRightLink().click();
	//	l.additional_copy();
	//Data Driven		
		
		
	  dataDriven d=new dataDriven();
	  ArrayList<String> data=d.getData("login","Admin_login");
	  
	  l.getUsername().sendKeys(data.get(1));
	  
	  l.getPassword().sendKeys(data.get(2));
		
	  l.getSignButton().click();	
		
	  Thread.sleep(10000);	
		
	  driver.close();	
	}*/
/*}*/
	    
	/*//	l.getUsername().sendKeys(prop.getProperty("AdminUsername"));
	    
	 //   dataDriven d=new dataDriven();
	 //   ArrayList<String> data=d.getData("login","login2");

//	    ArrayList<String> data=d.getData("login","Admin_login2");
       l.getUsername().sendKeys(data.get(1));
	    
		
		log.info("UserName inserting Successfully");
	//	l.getPassword().sendKeys(prop.getProperty("AdminPwd"));
		
		l.getPassword().sendKeys(data.get(2));
		
		log.info("Password inserting Successfully");
		
		l.getSignButton().click();
		
		log.info("Sigin button Clicked Successfully");
		
		Thread.sleep(10000);
		
		log.info("Trying to access application");
		
	//	Assert.assertEquals(driver.getTitle(), "OpenAM - Login");
		
			
		log.info("Validation Result");
	}	
					
	}
	
	///Parameter
			@DataProvider
	     public Object[][] getData()
	     {
	        Object[][] data=new Object[2][2];
	       // data[0][0]="https://vwqang2.empirix.com/";
	        data[0][0]="testHari1";
	        data[0][1]="Test@1234";
	        
	        log.info("User testHari1 trying to access");
	        
	        ///Second Data Type
	       // data[1][0]="https://abcd/";
	       // data[1][0]="Hari1";
	      //  data[1][1]="Hello1";
	        data[0][0]="testHari";
	        data[0][1]="Test@1234";
	        log.info("User testHari trying to access");
	        
	        return data;
	     }
		
			@AfterTest
			public void teardown()
			{
				driver.close();
				log.info("VoiceWatch Application closed successfully");
			}*/
		

