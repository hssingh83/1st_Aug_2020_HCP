package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageActions.pom001_VW_logIn_Page;
import PageActions.pom007_VW_Script_Tabs;
import resources.basePropertiesFile;


public class TC0018_login_With_Exmpirix_Admin_Sanity2 extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0018_login_With_Exmpirix_Admin_Sanity2.class.getName());
	public WebDriverWait wait;
	@BeforeMethod
public void applicationLaunch() throws IOException, InterruptedException {
	//	wait=new WebDriverWait(driver,20);
			String user=System.getProperty("Name");
			String pass=System.getProperty("Password"); 		
				
				driver=intializeWebDriver();							
				
				pom001_VW_logIn_Page l=new pom001_VW_logIn_Page(driver);
							
				l.getUsername().sendKeys(user);
		       l.getPassword().sendKeys(pass);
			    l.getSignButton().click();
		//	    driver.navigate().refresh();
			   log.debug("Waiting for launch VoiceWatch application using above creadetails");
		//	   wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Back to top")));
			    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
			    log.debug("Verified that VoiceWatch Application login successfully with Empirix Admin creadetial");
			    log.debug("Validate the requiment as Aceess Level= Empirix & Role=Empirix Admin");
			}
	
// Script Creation functinality Validation	
	
	@Test(priority=1)
	public void createScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.Create_run_Script_using_button();
	
	}
	
	@Test(priority=2)
	public void deleteScript_AllData () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.DeleteScriptAllData();
	
	}
	
	@Test(priority=3)
	public void deleteScript_only () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.DeleteScriptOnly();
	
	}
	
	@Test(priority=4)
	public void copyScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.CopyScript();
	    
	    }
	
	@Test(priority=5)
	public void updateScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.UpdateScript();
	
	}
	
	
	@Test(priority=6)
	public void createScript_by_ScriptUpload ()throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.Create_Delete_ScriptByScriptUpload();
	
	}
	
	@Test(priority=7)
	public void deleteScript_by_ScriptUpload () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.deleteScriptUpload();
	
	}
	
	@Test(priority=8)
	public void createScript_by_CSV () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	    san.CreateCSVTransformer();
	
	}
	
	@Test(priority=9)
	public void createTest () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	//    san.CreateTest();
	
	}

	@Test(priority=10)
	public void deleteTest () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	 //   san.DeleteTest();
	
	}
	
	@Test(priority=11)
	public void updateTest () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs san=new pom007_VW_Script_Tabs(driver);
	
	 //   san.UpdateTest();
	
	}
	
		
	@AfterMethod
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
    }
    }
