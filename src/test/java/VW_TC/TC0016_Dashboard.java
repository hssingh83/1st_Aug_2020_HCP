package VW_TC;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom001_VW_logIn_Page;
import PageActions.pom002_VW_Home_Page;
import resources.basePropertiesFile;
import resources.dataDriven;

public class TC0016_Dashboard extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0016_Dashboard.class.getName());
	
	
	@BeforeTest
	
	public void initializer() throws IOException, InterruptedException
	{
		log.info("VoiceWatch loginPageAccess TestCase Validation Started");
		
		driver=intializeWebDriver();
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
		
		
		 dataDriven d=new dataDriven();
		  ArrayList<String> data=d.getData("login","Admin_login");
		  pom001_VW_logIn_Page l=new pom001_VW_logIn_Page(driver); 
		  l.getUsername().sendKeys(data.get(1));
		  
		  l.getPassword().sendKeys(data.get(2));
			
		  l.getSignButton().click();	
		
		
		pom002_VW_Home_Page dS=new pom002_VW_Home_Page(driver);
		
	//**LogIn Page Label verification Started//
//		 ds.home_screen();
	

		
	  driver.close();	
		
	    
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
		
		log.info("Trying to access application");*/
		
	//	Assert.assertEquals(driver.getTitle(), "OpenAM - Login");
		
	/*		
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
				log.info("VoiceWatch Application closed successfully");*/
			}
}

