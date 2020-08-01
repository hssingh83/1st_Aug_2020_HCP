package VW_TC;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom001_VW_logIn_Page;
import resources.basePropertiesFile;
import resources.dataDriven;


public class linktest extends basePropertiesFile {
	
	private static Logger log =LogManager.getLogger(linktest.class.getName());
		
	@BeforeTest	
	public void navigateToAllLinks() throws IOException, InterruptedException	{
		
		driver=intializeWebDriver();
		
	}
	
		@Test(priority=1)
		public void logInWithExpirixAdmin () throws IOException, InterruptedException {
			
	//		pom001_VoiceWatch_logIn_Page l=new pom001_VoiceWatch_logIn_Page(driver);
			
			pom001_VW_logIn_Page l=new pom001_VW_logIn_Page(driver);
			
			dataDriven d=new dataDriven();
			
			
		    ArrayList<String> data=d.getData("login","Clinet/Partner_user");
			
			
			
						
			l.getUsername().sendKeys(data.get(1));
	        l.getPassword().sendKeys(data.get(2));
		    l.getSignButton().click();
		    Thread.sleep(1000);
		    log.debug("Waiting for launch VoiceWatch application using above creadetails");
		    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
		    log.debug("Verified that VoiceWatch Application login successfully with Empirix Admin creadetial");
		    log.debug("Validate the requiment as Aceess Level= Empirix & Role=Empirix Admin");	
		
		}
	
		@Test(priority=2)	
	public void linktest() {
	
			List<WebElement> linksize = driver.findElements(By.tagName("a"));
			int linksCount = linksize.size();
			System.out.println("Total no of links Available: " + linksCount);
			String[] links = new String[linksCount];
			System.out.println("List of links available:");
			
	//		System.out.println (“List of links Available: ");
			// print all the links from webpage
			for (int i = 0; i < linksCount; i++) {
			links[i] = linksize.get(i).getAttribute("href");
			System.out.println(linksize.get(i).getAttribute("href"));
			}
			
						 
			 }
			 
			}