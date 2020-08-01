package VW_TC;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom001_VW_logIn_Page;
import PageActions.pom002_VW_Home_Page;
import PageActions.pom003_VW_Dashboard1_Tab;
import PageActions.pom004_VW_Alerts_Tab;
import PageActions.pom005_VW_Tests_Tab;
import PageActions.pom006_VW_Tags_Tab;
import PageActions.pom007_VW_Script_Tabs;
import PageActions.pom008_VW_Variable_Tab;
import resources.basePropertiesFile;
import resources.dataDriven;

public class TC0009_login_With_Client_OR_Partner_Client_Developer extends basePropertiesFile{

	private static Logger log =LogManager.getLogger(TC0009_login_With_Client_OR_Partner_Client_Developer.class.getName());
	
	@BeforeTest
	
	public void applicationLaunch() throws IOException, InterruptedException {
		
		driver=intializeWebDriver();
	}

	/*@Test(priority=1)
	public void logInWithPartnerClient_Development () throws IOException, InterruptedException {
		
		pom001_VW_logIn_Page l=new pom001_VW_logIn_Page(driver);
		dataDriven d=new dataDriven();
		  ArrayList<String> data=d.getData("login","Client/Partner/Client_Developer");
			
		l.getUsername().sendKeys(data.get(1));
	    l.getPassword().sendKeys(data.get(2));
	    l.getSignButton().click();
	    Thread.sleep(10);
	    log.debug("Waiting for launch VoiceWatch application using above creadetails");
	    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
	    log.info("Verified that VoiceWatch Application login successfully with Client/Partner Clinet_Developer creadetial");
	    log.debug("Validate the requiment as Aceess Level= Client/Partner_Client & Role=Developer");
	    
	}	

	@Test(priority=2)
	public void headerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	    d.header();
	
	}
	
	@Test(priority=3)
	public void footerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	    d.footer();
	
	}
	@Test(priority=4)
	public void TabValidation () throws IOException, InterruptedException {
		
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
		   d.Tab_Validation();
	}
	@Test(priority=5)
	public void dashBoardTabValidation () throws IOException, InterruptedException {
		
		pom003_VW_Dashboard1_Tab db=new pom003_VW_Dashboard1_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
				
		db.OverallPerfomance_section_dashboard();
		db.Tests_section_dashboard();
		d.header();
		d.footer();
	}
	
	@Test(priority=6)
	public void alertTabValidation () throws IOException, InterruptedException {
		
		pom004_VW_Alerts_Tab at=new pom004_VW_Alerts_Tab (driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
		at.alertsValidations();		
		d.header();
		d.footer();
		
	}
	
	@Test(priority=7)
	public void testTabValidation () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab ts=new pom005_VW_Tests_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	
		ts.testsTabValidation();
		d.header();
		d.footer();
		ts.createTestValidationbybutton();
		d.header();
		d.footer();
		ts.createTestValidationbyLink();
		d.header();
		d.footer();
		
	}
	
	
	@Test(priority=8)
	public void tagTabValidation () throws IOException, InterruptedException {
		
		pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	
		tg.tagsValidations();
		d.header();
		d.footer();
		tg.createTagbybuttonValidation();
		d.header();
		d.footer();
		tg.createNewTagbyLinkValidation();
		d.header();
		d.footer();
		
	}
	
	@Test(priority=9)
	public void scriptTabValidation () throws Exception {
		
		
		pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
			
		sc.goScriptBuilderTabValidation();
		sc.createGSBbybuttonValidation();
		sc.createGSBbyLinkValidation();
		d.header();
		d.footer();
	//	sc.scriptUploadTabValidation();
		sc.csvTabValidation();
		d.header();
		d.footer();
	
	}
	@Test(priority=10)
	public void variableTabValidation () throws Exception {
		
		
		pom008_VW_Variable_Tab vr=new pom008_VW_Variable_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);
		
		vr.variableTabValidation();
		d.header();
		d.footer();
		vr.createVariableByButtonValidation();
		d.header();
		d.footer();
		vr.createVariableByLinkValidation();
		d.header();
		d.footer();	

	}
	
	@AfterTest
	public void applicationClose() {
	
		driver.close();
		log.info("Application closed successfully");
		
	}*/
	}
	