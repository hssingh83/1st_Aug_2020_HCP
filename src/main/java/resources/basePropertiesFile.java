package resources;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class basePropertiesFile {
	
	private By username = By.name("callback_0");
	private By password = By.name("callback_1");
	private By signIn = By.name("callback_2");
	private By Tab=By.xpath("//*[@id=\"wrapper\"]/header/section[2]");
	public WebDriverWait wait;
	public WebDriver driver;
	public Properties prop;
	
	private static Logger log =LogManager.getLogger(basePropertiesFile.class.getName());
	
	@SuppressWarnings("deprecation")
	public WebDriver intializeWebDriver() throws IOException, InterruptedException	{
	
		
		//Chrome
	String browserName=System.getProperty("Browser");		
	if(browserName.contains("Chrome"))	
			
		{
			WebDriverManager.chromedriver().setup(); 			
			System.setProperty("webdriver.chrome.silentOutput","true");
		 	ChromeOptions options=new ChromeOptions();		 		
			options.addArguments("disable-infobars");		
		  
			if(browserName.contains("headless"))	
			{
		    options.addArguments("--headless");
		        
			}
		    
			driver=new ChromeDriver(options);			
			log.debug("Chrome Driver intilized successfully");
			log.info("Chrome Browser selected & Launching");
		//	driver.manage().window().maximize();
		//	log.info("Screen maximized successfully");			
		}		
				
		//firefox

		else if (browserName.equals("Firefox"))
			
		{
//			
			WebDriverManager.firefoxdriver().setup();
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"null");
			
			FirefoxOptions options=new FirefoxOptions();
		//	driver.manage().deleteAllCookies();
			options.addArguments("disable-infobars");
			
			if(browserName.contains("headless"))	
			{

		    options.addArguments("--headless");
//			driver = new FirefoxDriver();
			}
			
			driver=new FirefoxDriver(options);
			
			log.info("Firefox Driver intilized successfully");
		    log.info("Firefox Browser selected & Launching");
		//    driver.manage().window().maximize();
		//	log.info("Screen maximized successfully");
			
		}
	

		//IE
		else if (browserName.equals("ie"))
		{
//			System.setProperty("webdriver.ie.driver","C:\\Users\\hsingh\\Frameworks\\Selenium_ECP_VW\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\drivers\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
			
			log.info("IE Driver intilized successfully");
		    log.info("IE Browser selected & Launch");
		}
		//kritika: Adding support for Edge browser
		else if(browserName.equals("Edge"))
		{
			String workingDir = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", workingDir+"\\WebDrivers\\msedgedriver.exe");
		//	System.setProperty("webdriver.chrome.driver", workingDir+"\\WebDrivers\\edgedriver_64.exe");
			
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge Beta\\Application\\msedge.exe");
		//	chromeOptions.setBinary("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
			EdgeOptions edgeOptions = new EdgeOptions().merge(chromeOptions);
			driver = new ChromeDriver(edgeOptions);
			for(int i=0; i<2; i++){
				driver.findElement(By.tagName("html")).sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
			}
			driver.manage().window().maximize();
			log.info("Edge Driver intilized successfully");
			log.info("Edge Browser selected & Launch");
		}
	      return driver;
	    }
	   
		//Timeout

	 public void VoiceWatch_login() {
		
		   
		 String URL=System.getProperty("URL");
		 	 
		   
			wait=new WebDriverWait(driver,10);
				String user=System.getProperty("Name");
					String pass=System.getProperty("Password"); 	   
		//	driver.manage().deleteAllCookies();
		//	log.info("Cookies cleaned");
			driver.manage().window().maximize();
			log.info("Screen maximized successfully");
			
		   	driver.get(URL);
		   	log.debug("URL provided");
		   	driver.navigate().refresh();		   	
			log.info("Refresing Page again");
			
		 if (driver.findElement(By.xpath("//div[@id='wrapper']")).isDisplayed())
			 
		 {
			 log.info("Loding so refersing page again");
			 driver.navigate().refresh();
		 }
								
			driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
			log.debug("implicit Wait Applied");
		  
		   	for(int i=1;i<10;)
		   	{		   		
		   		try
		   		{
		   		if(driver.findElements(username).size() > 0 && driver.findElements(username).get(0).isDisplayed())
		   		{
		   				   			
		   			log.debug("Webpage loading");
		   			driver.findElement(username).sendKeys(user);
		   			log.debug("User Name Provided");
		   		   	driver.findElement(password).sendKeys(pass);
		   		 log.debug("Password Provided");
		   		   	driver.findElement(signIn).click();
		   		 log.debug("Sign button clicked");
		   		log.debug("User logged in:"+user);
		   		   	wait.until( ExpectedConditions.presenceOfElementLocated(Tab));
		   		   	wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[@aria-label='dismiss cookie message']")))).click();
		   			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
					log.debug("implicit Wait Applied");
				  
		   		   	i=10;
		   		}
		   		else
		   		{
		   			log.debug("Page not loaded, retrial attempt: "+i);
		   			i++;
		   			
		   			driver.navigate().refresh();
		   			driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		   					   			
		   		}
		   		}
		   		catch(NoSuchElementException e)
		   		{
		   			log.debug("Exception occured: "+e);
		   		}	
		   	}
	   }
}

	/* public void failed() {
		 
		 File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			 String currentDir=System.getProperty("user.dir");
					 FileUtils.copyFile(srcFile, new File(currentDir + "/Screenshot/"+System.currentTimeMillis()+".png"));
		 } catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();		
		 }	 
	 } 

}		 */
		/*	FileUtils.copyFile(srcFile, new File(System"/Users/hsingh/Frameworks/test_suite/Selenium_ECP_VW/"
					+"/Screenshot/testFailure.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 } 
	   }*/
	 


	 
	
	
	
	
	
	
	
	
