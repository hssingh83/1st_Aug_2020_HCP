package PageActions;

import java.sql.Driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import resources.basePropertiesFile;

public class pom015_VW_Client_Tab extends basePropertiesFile {
	private static Logger log =LogManager.getLogger(pom015_VW_Client_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom002_VW_Home_Page HomeTab=new pom002_VW_Home_Page(driver);
	pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
	
	
	By ClinetFilter=By.xpath("//input[@placeholder='Filter by client name']");
	By ClientsLabel=By.xpath("//span[contains(text(),'Clients')]");
	By ClientLabel=By.xpath("//h4[contains(text(),'Client')]");
	By PleaseSelect=By.xpath("//span[@id='loading']");
	By ClientCreatLink=By.linkText("or Create New client");
	By ClientCreatBut=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");
	By ClientSave=By.xpath("//*[@ng-click='openDowngradeModal()']");
	By ClientSavedisabled=By.xpath("//*[@disabled='disabled' and @ng-click='openDowngradeModal()' ]");
	By ClientTypeLabel=By.xpath("//div[contains(text(),'Type')]");
	By ClientTypeField=By.xpath("//*[@ng-model='currentClient.client_type']");
	
	By ClientTypeFielddisabled=By.xpath("//*[@ng-model='currentClient.client_type' and @disabled='disabled']");
	By ClientSelectPartnerLabel=By.xpath("//div[contains(text(),'Select Partner')]");
	By ClientSelectPartnerFielddiabled=By.xpath("//*[@ng-model='currentClient.partner_id' and @disabled='disabled']");
	By ClientSelectPartnerField=By.xpath("//*[@ng-model='currentClient.partner_id']");
	By ClientPartnerClientNameLabel=By.xpath("//div[contains(text(),'Partnered Client Name')]");	
	By ClientPartnerClientNameField=By.xpath("//*[@ng-model='currentClient.name']");
	By ClientPartnerClientNameFielddisabled=By.xpath("//*[@ng-model='currentClient.name' and @disabled='disabled']");
	
	By ClientDescriptionLabel=By.xpath("//div[contains(text(),'Description')]");
	By ClientDescriptionField=By.xpath("//*[@ng-model='currentClient.description']");
	By ClientDescriptionFielddisabled=By.xpath("//*[@ng-model='currentClient.description' and @disabled='disabled']");
	By ClientDefHammerGroupLabel=By.xpath("//div[contains(text(),'Default Hammer Group')]");
	By ClientDefHammerGroupField=By.xpath("//*[@name='default_hammer_group_id']");
	By ClientDefHammerGroupFielddisabled=By.xpath("//*[@name='default_hammer_group_id'and @disabled='disabled']");
	
	By ClientLicensingLabel=By.xpath("//h4[contains(text(),'Licensing')]");
	
	By ClientCount=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']");
	By ClientCountNumber=By.xpath("//*[@class='panel-heading']");
	
	By ClientStartDateLabel=By.xpath("//div[contains(text(),'Start Date')]");
	By ClientStartDateField=By.xpath("//input[@name='sDate']");
	By ClientStartDateFielddisabled=By.xpath("//input[@name='sDate'and @disabled='disabled']");
	
	
	By ClientStartEndLabel=By.xpath("//div[contains(text(),'End Date')]");
	By ClientStartEndField=By.xpath("//input[@name='eDate']");
	By ClientStartEndFieldDisabled=By.xpath("//input[@name='eDate' and @disabled='disabled']");
	
	By ClientTieToPartnerCheckbox=By.xpath("//*[@ng-model='currentClient.partner_end_tied']");
	
//	By ClientTieToPartnerCheckbox=By.xpath("//input[@class='ng-valid ng-dirty ng-valid-parse ng-not-empty ng-touched']");
	
	
	
	By ClientTieToPartnerLabel=By.xpath("//*[@ng-model='currentClient.partner_end_tied']//following::label[1]");
	
	By ClientMinimumTestLabel=By.xpath("//div[contains(text(),'Minimum Test Schedule Period (mins)')]");
	By ClientMinimumTestField=By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-min ng-valid-max ng-valid-required ng-valid-maxlength']");
	By ClientMinimumTieToCheckbox=By.xpath("//input[@class='ng-pristine ng-untouched ng-valid ng-not-empty']");
	By ClientMinimumTieToPartnerLabel=By.xpath("//input[@class='ng-pristine ng-untouched ng-valid ng-not-empty']//following::label[1]");
	
	By ClientMaxTestLabel=By.xpath("//*[contains(text(),'Max Test')]");
	By ClientMaxChannel=By.xpath("//*[contains(text(),'Max Channels')]");
	
	By ClientVWLabel=By.xpath("//span[@class='ng-binding'][contains(text(),'VoiceWatch')]");
	By ClientVWMaxTestField=By.name("max_tests_allowed");
	By ClientHamerOnDemandQALabel=By.xpath("//*[@class='ng-binding'][contains(text(),'Hammer On Demand QA')]");
	By ClientHODQAMaxTestField=By.xpath("//input[@name='max_qa_tests']");
	By ClientHammerOnDemandPerfLabel=By.xpath("//*[@class='ng-binding'][contains(text(),'Hammer On Demand Performance')]");
	By ClientHODPrefMaxTestField=By.name("max_load_tests");
	By ClientHODMaxChn=By.xpath("//*[@ng-model='currentClient.max_qa_channels']");
	By ClientHODPrefChn=By.xpath("//*[@ng-model='currentClient.max_load_channels']");
	By ClientHammerLabels=By.xpath("//*[contains(text(),'Hammer Labels')]");
	
	
	By ClientScriptingLabels=By.xpath("//*[contains(text(),'Scripting')]");
	
	
	
	
	
//	By ClientGSBCheckbox=By.xpath("//div[@class='form-group']//span[1]//div[1]");
	By ClientGSBCheckbox=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[1]/form/section/div/div[18]/span[1]/div[1]/input");
	
	By ClientSUCheckbox=By.xpath("//div[@class='form-group']//span[3]//div[1]");
	
//	By ClientCSVCheckbox=By.xpath("//div[@class='form-group']//span[4]//div[1]");
	
	By ClientCSVCheckbox=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[1]/form/section/div/div[18]/span[4]/div[1]/input");
	
//	By ClientCBM=By.xpath("//div[@class='form-group']//span[5]//div[1]");
	
	By ClientCBM=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[1]/form/section/div/div[18]/span[5]/div[1]/input");
	
//	By ClientE2E=By.xpath("//div[@class='form-group']//span[6]//div[1]");
	
	By ClientE2E=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[1]/form/section/div/div[18]/span[6]/div[1]/input");
	
	
	
	By ClientProgressBar=By.xpath("//*[@class='progress-bar progress-bar-striped active']");
	
//	By ClientNameField=By.xpath("//input[@class='form-control ng-pristine ng-empty ng-invalid ng-invalid-required ng-valid-pattern ng-valid-maxlength ng-touched']");
	
	By ClientNameField=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[1]/form/section/div/div[2]/input");
	
	By HammerLabelCheckbox=By.xpath("//div[@class='form-group']//div[1]//div[2]//input[1]");
	
 
    
    
	//ContractorA
	
	public pom015_VW_Client_Tab(WebDriver driver) {
		this.driver=driver;
	}
	

	// Method for Verified Lables under Client Tab

//==================================================================================	

public void ClientsTabValidation(String TestCaseName) {
	
  wait =new WebDriverWait(driver, 30);
  
  wait.until(ExpectedConditions.elementToBeClickable(HomeTab.clientsTab)).click();
  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ClientLabel));
  
  Assert.assertTrue(driver.findElement(ClientsLabel).isDisplayed());
  log.info("Verified that Clients displayed under Clients Tab ");
  Assert.assertTrue(driver.findElement(ClientLabel).isDisplayed());
  log.info("Verified that Client displayed under Clients Tab ");
  Assert.assertTrue(driver.findElement(PleaseSelect).isDisplayed());
  
  String count=driver.findElement(ClientCountNumber).getText();
	//	log.debug("Client header contain "+count);
		String[] part = count.split("(?<=\\D)(?=\\d)");		
	//	log.debug("spilled value "+part[1]);	
		int Count=driver.findElements(ClientCount).size();
		log.debug("Client Count "+Count);	
		String ClientActualCount =String.valueOf(Count);	
	//	log.debug("integer converted as: "+UserActualCount);	
		
		Assert.assertEquals(part[1], ClientActualCount);		
		log.debug("Verified that Client count found correct: "+ClientActualCount);	
  
  
  
  
  if (driver.findElements(ClientCount).size()>0) {
	  
	  driver.findElement(ClientCount).click();
	  
	  wait.until(ExpectedConditions.invisibilityOfElementLocated(ClientProgressBar));
	  
	  Assert.assertTrue(driver.findElement(ClientTypeLabel).isDisplayed());
	  log.info("Verified that Client Type label displayed under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientTypeField).isDisplayed());
	  log.info("Verified that Client Type Field displayed under Clients Tab ");
	  Assert.assertFalse(driver.findElement(ClientTypeField).isEnabled());
	  log.info("Verified that Client Type Field disabled under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientSelectPartnerLabel).isDisplayed());
	  log.info("Verified that 'Select Partner'label displayed under Clients Tab ");  
	  Assert.assertTrue(driver.findElement(ClientSelectPartnerField).isDisplayed());
	  log.info("Verified that 'Select Partner'field displayed under Clients Tab ");
	  Assert.assertFalse(driver.findElement(ClientSelectPartnerField).isEnabled());
	  log.info("Verified that 'Select Partner'field disabled under Clients Tab ");	  
	  Assert.assertTrue(driver.findElement(ClientPartnerClientNameLabel).isDisplayed());
	  log.info("Verified that 'Partnered Client Name'label displayed under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientPartnerClientNameField).isDisplayed());
	  log.info("Verified that 'Partnered Client Name'field displayed under Clients Tab ");
	  Assert.assertFalse(driver.findElement(ClientPartnerClientNameField).isEnabled());
	  log.info("Verified that 'Partnered Client Name'field disabled under Clients Tab ");	  
	  Assert.assertTrue(driver.findElement(ClientDescriptionLabel).isDisplayed());
	  log.info("Verified that 'Description'label displayed under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientDescriptionField).isDisplayed());
	  log.info("Verified that 'Description'field displayed under Clients Tab ");
	  
	  if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User")))
	  		  
	  {
		  Assert.assertFalse(driver.findElement(ClientDescriptionField).isEnabled());	
		  log.info("Verified that 'Description'field disabled under Clients Tab ");
	  } else if (TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Customer Admin")) {
		  Assert.assertTrue(driver.findElement(ClientDescriptionField).isEnabled());	
		  log.info("Verified that 'Description'field enabled under Clients Tab ");		  
	  }

	   
	  Assert.assertTrue(driver.findElement(ClientDefHammerGroupLabel).isDisplayed());
	  log.info("Verified that 'Default Hammer Group'label displayed under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientDefHammerGroupField).isDisplayed());
	  log.info("Verified that 'Default Hammer Group' filed displayed under Clients Tab ");	  
	  Assert.assertFalse(driver.findElement(ClientDefHammerGroupField).isEnabled());
	  log.info("Verified that 'Default Hammer Group' filed disabled under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientLicensingLabel).isDisplayed());
	  log.info("Verified that 'Licensing' label displayed under Clients Tab ");	 	  
	  
	  Assert.assertTrue(driver.findElement(ClientStartDateLabel).isDisplayed());
	  log.info("Verified that 'Start Date' label displayed under Clients Tab ");
	   Assert.assertTrue(driver.findElement(ClientStartDateField).isDisplayed());
	  log.info("Verified that 'Start Date' field displayed under Clients Tab ");
	  if (TestCaseName.contains("Cnt")||(TestCaseName.contains("Pt")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User")||(TestCaseName.contains("Pt")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("User"))))
	  {
	  Assert.assertFalse(driver.findElement(ClientStartDateField).isEnabled());
	  log.info("Verified that 'Start Date' field disabled under Clients Tab ");	
	  } else if (TestCaseName.contains("Pt")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Partner Customer Admin")) {
		  Assert.assertTrue(driver.findElement(ClientStartDateField).isEnabled());
		  log.info("Verified that 'Start Date' field enabled under Clients Tab ");	
	  }
	  
	  
	  Assert.assertTrue(driver.findElement(ClientStartEndLabel).isDisplayed());
	  log.info("Verified that 'End Date' label displayed under Clients Tab ");	
	  Assert.assertTrue(driver.findElement(ClientStartEndField).isDisplayed());
	  log.info("Verified that 'End Date' field displayed under Clients Tab ");	
	  Assert.assertFalse(driver.findElement(ClientStartEndField).isEnabled());
	  log.info("Verified that 'End Date' field disabled under Clients Tab ");	
	  Assert.assertTrue(driver.findElement(ClientTieToPartnerLabel).isDisplayed());
	  log.info("Verified that 'Tie to Partner' label displayed under Clients Tab ");	  
	  
	  
	  Assert.assertTrue(driver.findElement(ClientTieToPartnerCheckbox).isDisplayed());
	  
	  log.info("Verified that 'Tie to Partner' checkbox displayed under Clients Tab ");	
	  
	  if (TestCaseName.contains("Cnt")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) {
       Assert.assertFalse(driver.findElement(ClientTieToPartnerCheckbox).isEnabled());	  
	  log.info("Verified that 'Tie to Partner' checkbox disabled under Clients Tab ");	
	  } else if (TestCaseName.contains("Pt")) {
		  Assert.assertTrue(driver.findElement(ClientTieToPartnerCheckbox).isEnabled());	  
		  log.info("Verified that 'Tie to Partner' checkbox enabled under Clients Tab ");	  
		 
	  }
	  
	  Assert.assertTrue(driver.findElement(ClientMinimumTestLabel).isDisplayed());
	  log.info("Verified that 'Minimum Test Schedule Period (mins)' label displayed under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientMinimumTestField).isDisplayed());
	  log.info("Verified that 'Minimum Test Schedule Period (mins)' filed displayed under Clients Tab ");
	  Assert.assertFalse(driver.findElement(ClientMinimumTestField).isEnabled());	
	  log.info("Verified that 'Minimum Test Schedule Period (mins)' field disabled under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientMinimumTieToCheckbox).isDisplayed());
	  log.info("Verified that 'Tie to Partner' checkbox displayed under Clients Tab ");	
	  if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) {
	   Assert.assertFalse(driver.findElement(ClientMinimumTieToCheckbox).isEnabled());
	  log.info("Verified that 'Tie to Partner' checkbox disabled under Clients Tab ");	
	  } else if (TestCaseName.contains("Pt")) {
		  Assert.assertTrue(driver.findElement(ClientMinimumTieToCheckbox).isEnabled());
		  log.info("Verified that 'Tie to Partner' checkbox enabled under Clients Tab ");	
	  }
	  Assert.assertTrue(driver.findElement(ClientMinimumTieToPartnerLabel).isDisplayed());
	  log.info("Verified that 'Tie to Partner' label disabled under Clients Tab ");
	  Assert.assertTrue(driver.findElement(ClientMaxTestLabel).isDisplayed());
	  log.info("Verified that 'Max Test' label displayed under Clients Tab ");	  
	  Assert.assertTrue(driver.findElement(ClientMaxChannel).isDisplayed());
	  log.info("Verified that 'Max Channel' label displayed under Clients Tab ");
	  
	  Assert.assertTrue(driver.findElement(ClientVWLabel).isDisplayed());
	  log.info("Verified that 'VoiceWatch' label displayed under Clients Tab ");	  
	  Assert.assertTrue(driver.findElement(ClientVWMaxTestField).isDisplayed());
	  log.info("Verified that 'VoiceWatch' max test field displayed under Clients Tab ");	
	  if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) {
	  Assert.assertFalse(driver.findElement(ClientVWMaxTestField).isEnabled());
	  log.info("Verified that 'VoiceWatch' max test field disabled under Clients Tab ");
	  } else if (TestCaseName.contains("Pt")) {
		  Assert.assertTrue(driver.findElement(ClientVWMaxTestField).isEnabled());
		  log.info("Verified that 'VoiceWatch' max test field enabled under Clients Tab ");
	  }
      Assert.assertTrue(driver.findElement(ClientHamerOnDemandQALabel).isDisplayed());	  
      log.info("Verified that 'Hammer On Demand QA' label displayed under Clients Tab ");
      
//=============================================================      
	  Assert.assertTrue(driver.findElement(ClientHODQAMaxTestField).isDisplayed());
	  log.info("Verified that 'Max Test of HODQA filed displayed under Clients Tab ");
	  if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) {
	  Assert.assertFalse(driver.findElement(ClientHODQAMaxTestField).isEnabled());
	  log.info("Verified that 'Max Test of HODQA filed disabled under Clients Tab ");
	  } else if (TestCaseName.contains("Pt")) {
		  Assert.assertTrue(driver.findElement(ClientHODQAMaxTestField).isEnabled());
		  log.info("Verified that 'Max Test of HODQA filed enabled under Clients Tab ");
	  }
      Assert.assertTrue(driver.findElement(ClientHODMaxChn).isDisplayed());
      log.info("Verified that 'Max Channel of HODQA filed displayed under Clients Tab ");
      if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) {     
	  Assert.assertFalse(driver.findElement(ClientHODMaxChn).isEnabled());
	  log.info("Verified that 'Max Channel of HODQA filed disabled under Clients Tab ");  
      } else if (TestCaseName.contains("Pt")) {
    	  Assert.assertTrue(driver.findElement(ClientHODMaxChn).isEnabled());
    	  log.info("Verified that 'Max Channel of HODQA filed enabled under Clients Tab ");  
      }
      Assert.assertTrue(driver.findElement(ClientHODPrefMaxTestField).isDisplayed());      
      log.info("Verified that 'Max Channel; of HOD Preference filed displayed under Clients Tab ");	  
      if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) {         
      Assert.assertFalse(driver.findElement(ClientHODPrefMaxTestField).isEnabled());      
      log.info("Verified that 'Max Channel; of HOD Preference filed disabled under Clients Tab ");
      } else if (TestCaseName.contains("Pt")) {
    	  Assert.assertTrue(driver.findElement(ClientHODPrefMaxTestField).isEnabled());      
          log.info("Verified that 'Max Channel; of HOD Preference filed enabled under Clients Tab ");
      }
      Assert.assertTrue(driver.findElement(ClientHODPrefMaxTestField).isDisplayed());
      log.info("Verified that 'Max Test; of HOD Preference filed displayed under Clients Tab ");
      if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) {          
      Assert.assertFalse(driver.findElement(ClientHODPrefMaxTestField).isEnabled());
      log.info("Verified that 'Max Test; of HOD Preference filed disabled under Clients Tab ");
      } else if  (TestCaseName.contains("Pt")) {    
    	  Assert.assertTrue(driver.findElement(ClientHODPrefMaxTestField).isEnabled());
          log.info("Verified that 'Max Test; of HOD Preference filed enabled under Clients Tab ");
      }
      Assert.assertTrue(driver.findElement(ClientHODPrefChn).isDisplayed());
      log.info("Verified that 'Max Channel of HOD Preference filed disabled under Clients Tab");
      if (TestCaseName.contains("Client")||(TestCaseName.contains("Partner")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User"))) { 
      Assert.assertFalse(driver.findElement(ClientHODPrefChn).isEnabled());
      log.info("Verified that 'Max Channel of HOD Preference filed disabled under Clients Tab");
      } else if  (TestCaseName.contains("Pt")) {  
    	  Assert.assertTrue(driver.findElement(ClientHODPrefChn).isEnabled());
          log.info("Verified that 'Max Channel of HOD Preference filed enabled under Clients Tab");    	  
      }
      Assert.assertTrue(driver.findElement(ClientHammerLabels).isDisplayed());
      log.info("Verified that 'HammerLabels' label is displayed under Clients Tab");
      
      
      Assert.assertTrue(driver.findElement(ClientScriptingLabels).isDisplayed());
      log.info("Verified that 'Scripting' label is displayed under Clients Tab");
      
      Assert.assertTrue(driver.findElement(ClientGSBCheckbox).isDisplayed());
      log.info("Verified that 'GoScript Builder' checkbox displayed under Clients Tab");
 //     Assert.assertFalse(driver.findElement(ClientGSBCheckbox).isEnabled());
 //     log.info("Verified that 'GoScript Builder' checkbox disabled under Clients Tab");
      
      Assert.assertTrue(driver.findElement(ClientSUCheckbox).isDisplayed());
      log.info("Verified that 'Script Upload' checkbox displayed under Clients Tab");
      Assert.assertTrue(driver.findElement(ClientSUCheckbox).isEnabled());
      log.info("Verified that 'Script Upload' checkbox disabled under Clients Tab");
      
      Assert.assertTrue(driver.findElement(ClientCSVCheckbox).isDisplayed());
      log.info("Verified that 'CSV' checkbox displayed under Clients Tab");
      Assert.assertTrue(driver.findElement(ClientCSVCheckbox).isEnabled());
      log.info("Verified that 'CSV' checkbox disabled under Clients Tab");
      
      Assert.assertTrue(driver.findElement(ClientSave).isDisplayed());
      log.info("Verified that 'Save' button displayed under Clients Tab");
      Assert.assertFalse(driver.findElement(ClientSave).isEnabled());
      log.info("Verified that 'Save' button disabled under Clients Tab");
     
	  
	  
  }else {
		
		log.info("No Client available");
	  
	  
  } 
  
	
}

//===========================================================================================================

public void client_Creation () throws InterruptedException {
	
	wait =new WebDriverWait(driver, 30);
	  
	  wait.until(ExpectedConditions.elementToBeClickable(HomeTab.clientsTab)).click();
	  wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(ClientLabel));
	  
	  driver.findElement(ClientCreatBut).click();
	  log.info("Clicked client creation button");
	  
	  String Client_Name="Automation_Release_"+pom000_Reuseable_Script_for_Page.getSaltString();
	     
	driver.findElement(ClientNameField).sendKeys(Client_Name);  
	log.info("Client Name "+Client_Name +"Created");
	driver.findElement(ClientStartEndField).clear();
	driver.findElement(ClientStartEndField).sendKeys("2034-07-07");
	log.info("Client Licensing date set as '2034-07-07'");
	driver.findElement(ClientVWMaxTestField).sendKeys("100");
	log.info("VoiceWatch Max Test Set as 100");
	driver.findElement(ClientHODQAMaxTestField).sendKeys("100");
	log.info("HOD QA Max Test Set as 100");
	driver.findElement(ClientHODPrefMaxTestField).sendKeys("100");
	log.info("HOD Preformance Test Set as 100");
	driver.findElement(ClientHODMaxChn).sendKeys("10");
	log.info("HOD QA Max Channel Set as 10");
	driver.findElement(ClientHODPrefChn).sendKeys("10");
	log.info("HOD Preformance Max Channel Set as 10");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	 js.executeScript("window.scrollBy(0,+500)");	
	
	
	driver.findElement(HammerLabelCheckbox).click();
	log.info("Hammer label checked");
	
	driver.findElement(ClientGSBCheckbox).click();
	
	log.info("Go Script checkbox checked");
	
	driver.findElement(ClientCSVCheckbox).click();
	log.info("CSV checkbox checked");
	driver.findElement(ClientCBM).click();
	log.info("CBM checkbox checked");
	
	driver.findElement(ClientE2E).click();
	log.info("E2E checkbox checked");
	
	js.executeScript("window.scrollBy(0,-500)");	
	
	
	driver.findElement(ClientSave).click();
	log.info("Save button clicked");
	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ClientProgressBar));
	log.info("Found load progress bar");
	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
    wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
    Thread.sleep(8000);	
	
    WebElement clinet_select = driver.findElement(dashboard.Clinetdropdown);	
	   Select Client_Selection=new Select(clinet_select);
	   Client_Selection.selectByVisibleText(Client_Name);
	   log.info("Client Seected");
	   
	   driver.findElement(dashboard.Savebutton).click();
	   
	   log.info("Newly created Client Selected");
	   
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(ClientProgressBar));
		log.info("Found load progress bar");
	   
	   
	
}




}

