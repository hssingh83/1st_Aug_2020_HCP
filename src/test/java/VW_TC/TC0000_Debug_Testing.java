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
import PageActions.pom009_VW_Hammers_Tab;
import resources.basePropertiesFile;
import resources.dataDriven;


public class TC0000_Debug_Testing extends basePropertiesFile{

	
	
	
	private static Logger log =LogManager.getLogger(TC0000_Debug_Testing.class.getName());
	
	
	@Test(priority=1)
	public void logInWithExpirixAdmin () throws IOException, InterruptedException {		
		dataDriven d=new dataDriven();
		 ArrayList<String> data=d.getData("login","Empirix/Admin");
		
		
		pom001_VW_logIn_Page l=new pom001_VW_logIn_Page(driver);
					
		l.getUsername().sendKeys(data.get(1));
        l.getPassword().sendKeys(data.get(2));
	    l.getSignButton().click();
	    Thread.sleep(10);
	    log.debug("Waiting for launch VoiceWatch application using above creadetails");
	    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
	    log.debug("Verified that VoiceWatch Application login successfully with Empirix Admin creadetial");
	    log.debug("Validate the requiment as Aceess Level= Empirix & Role=Empirix Admin");
	}   
      
}
	/*
	@Test(priority=2)
	public void headerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.header();
	
	}
	
	@Test(priority=3)
	public void footerMandatoryDetails () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.footer();	
	}

		
	@Test(priority=4)
	public void TabAvailabilityValidation () throws IOException, InterruptedException {
		
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	    d.home_screen();

	
	}

	
	@Test(priority=5)
	public void dashBoardTabValidation () throws IOException, InterruptedException {
		
		pom003_VoiceWatch_Dashboard_Tab db=new pom003_VoiceWatch_Dashboard_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
				
		db.OverallPerfomance_section_dashboard();
		db.activetest_section_dashboard();
		d.header();
		d.footer();	
	}
	
	@Test(priority=6)
	public void alertTabValidation () throws IOException, InterruptedException {
		
		pom004_VoiceWatch_Alerts_Tab at=new pom004_VoiceWatch_Alerts_Tab (driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
		at.alertsValidations();		
		d.header();
		d.footer();
		
	}
	
	@Test(priority=7)
	public void testTabValidation () throws IOException, InterruptedException {
		
		pom005_VoiceWatch_Tests_Tab ts=new pom005_VoiceWatch_Tests_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
		ts.testsValidations();
		d.header();
		d.footer();
		ts.createTestbybutton();
		d.header();
		d.footer();
		ts.createTestbyLink();
		d.header();
		d.footer();
		
	}
	
	
	@Test(priority=8)
	public void tagTabValidation () throws IOException, InterruptedException {
		
		pom006_VoiceWatch_Tags_Tab tg=new pom006_VoiceWatch_Tags_Tab(driver);
		pom002_VoiceWatch_Home_Page d=new pom002_VoiceWatch_Home_Page(driver);	
	
	
		tg.tagsValidations();
		d.header();
		d.footer();
		tg.createTagbybutton();
		d.header();
		d.footer();
		tg.createNewTag();		
		d.header();
		d.footer();	
	}*/
	
	/*@Test(priority=9)
	public void scriptTabValidation () throws Exception {
		
		
		pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	
		
		
	  sc.goScriptBuilderTabValidation();
	   sc.createGSBbybuttonValidation();
		sc.createGSBbyLinkValidation();
		d.header();
		d.footer();
		sc.scriptUploadTabValidation();
		d.header();
		d.footer();
		sc.createSUbybutton();
		sc.createSUbyLink();
		sc.csvTabValidation();
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

	@Test(priority=11)
	public void hammerTabValidation () throws Exception {
		
		pom009_VW_Hammers_Tab hm=new pom009_VW_Hammers_Tab(driver);
		pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);
		
	    hm.hammerTabValidation();
		d.header();
		d.footer();	
	    hm.createHammerByButton();
	   hm.createHammerByLink();

	}
	
	
    @AfterTest
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
    }}*/
