package PageActions;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import resources.basePropertiesFile;

public class pom010_VW_Notification_Tab extends basePropertiesFile {
	private static Logger log =LogManager.getLogger(pom010_VW_Notification_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
	pom011_VW_Dashboard2_Tab dashboard2 =new pom011_VW_Dashboard2_Tab(driver);
	pom007_VW_Script_Tabs ScriptTab= new pom007_VW_Script_Tabs(driver);
	pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	pom002_VW_Home_Page homePage=new pom002_VW_Home_Page(driver);
    public static String UserName;
    public static String UserEmail;
    public static String UserFirstName;
    public static String UserLastName;
    public static String UserPermissionLevel;
    
    
    public String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
    
    
    public static String cbmtestscheduling="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
    
    public static String cbmNotifySech="NotifySchedule_"+pom000_Reuseable_Script_for_Page.getSaltString();
  
	
	By notifiTab=By.linkText("Notifications");
	By notifiNameLabel=By.xpath("//*[@class='input-group-addon']");
	By notifiNameField=By.xpath("//*[@ng-model='notification.name']");
	By notifiLabel=By.xpath("//h4[contains(text(),'Notification')]");
	By notifiSLabel=By.xpath("//span[contains (text(),'Notifications')]");
	By notifiFilter=By.xpath("//*[@placeholder='Filter by notification name']");
	By notifiPlusIcon=By.xpath("//*[@class='glyphicon glyphicon-plus-sign']");
//	By notifiCreatedLink=By.xpath("//u[contains(text(),'or create a new notification')]");
	By notifiCreatedLink=By.linkText("or create a new notification");
	
	
	
	
	By notifiSmallIcon=By.xpath("//*[@title='Choose either user or enter email addresses']");
	By notifiSaveButton=By.xpath("//*[@ng-click='saveNotifiWithEmailTemplate(notification.email_template)']");
	By notifiSaveASbutton=By.xpath("//*[@ng-click='saveAsFunction(notification.email_template)']");
	By notifiDeletButton=By.xpath("//*[@ng-click='deleteNotification()']");
	By notifiMailButton=By.xpath("//*[@ng-click='testNotification()']");
	By notifiUserLabel=By.xpath("//h4[contains (text(),'Users')]");
	By notifiAllButton=By.xpath("//button[contains (text(),'All')]");
	By notifiNoneButton=By.xpath("//button[contains (text(),'None')]");
	By notifiEmailLabel=By.xpath("//h4[contains (text(),'Email Addresses')]");
	By notifiEmailField=By.xpath("//*[@name='email_addresses']");
	By notifiEmailTemplateLabel=By.xpath("//*[@data-i18n='_emailTemplate_']");
	By notifiEmailTemplateDropdown=By.xpath("//*[@ng-change='selectEmailTemplate(notification.email_template)']");
	By notifiEditEmailTempButton=By.xpath("//*[@data-i18n='_edit_']");
	By notifiSaveEmailTempButton=By.xpath("//*[@ng-click='saveEmailTemplatePromise(notification.email_template)']");
	By notifiDeleteEmailTempButton=By.xpath("//*[@ng-click='deleteEmailTemplate(notification.email_template)']");
	By notifyTemplateName=By.xpath("//*[@ng-model='notification.email_template.name']");
	By notifyTemplateSubject=By.xpath("//*[@name='emailSubjectLine']");
	By notifyTemplateBody=By.xpath("//*[@name='emailBody']");	
	By notifiSecheduleLable=By.xpath("//h4[contains (text(),'Schedules')]");
	By notifiTimeZoneLabel=By.xpath("//*[@class='input-group-addon small-width']");
	By notifiTimeZoneDropdown=By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
    public By notifiProgress=By.xpath("//div[@class='progress-bar progress-bar-striped active']");
    By notififilterByName=By.xpath("//input[@placeholder='Filter by name' or @ng-model='query.name']");
    By notifiFirstSearch=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']");
    By notifiselect=By.xpath("//li[1][@class='nav nav-sidebar tests ng-binding ng-scope']");
    By notifiFirstActiveSearch=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope testActive']");
 //   By UserCheckBox=By.xpath("//span[text()='hari_admin1']/parent::span/child::input");    
    By MailAlert=By.xpath("//div[contains(@class,'alert alert-success')]");
    By MailText=By.xpath("//span[contains(text(),'Test email sent.')]");
    By MailClose=By.xpath("//*[@aria-hidden='true']");    
    By notifiTestDropdown=By.xpath("//*[@ng-model='notification.planid']"); 
    By cbm_notifiTestDropdown=By.xpath("//select[@class='form-control ng-pristine ng-valid ng-not-empty ng-touched']"); 
    
    
    
    
	By MailUserName=By.xpath("//*[@id='username' and @class='signInInputText']");
	By MailPassword=By.xpath("//*[@id='password' and @class='signInInputText']");
	By MailSignInButton=By.xpath("//span[contains(text(),'sign in')]");
	By SearchMail=By.xpath("//*[@class='_n_p1 ms-font-weight-semilight ms-font-color-neutralSecondary']");
	By MailTab=By.xpath("//span[@id='_ariaId_15']");
	By MailType=By.xpath("//*[@autoid='_n_7']");
//	By MailSearchButton=By.xpath("//*[@class='_fc_3 owaimg wf wf-size-x30 wf-owa-search wf-family-owa ms-font-color-themePrimary']");
	By MailSearchButton=By.xpath("//*[@class='_fc_3 owaimg wf wf-size-x20 wf-owa-search wf-family-owa ms-font-color-themePrimary']");
	
	
	By FirstMailClick=By.xpath("//*[@autoid='_n_G1')]");
	By UnreadMail=By.xpath("//*[contains(text(),'Mark as read')]");
  	By NotifyPattern=By.xpath("//*[@ng-model='notification.pattern']");
  	By NotifyCheckBox=By.xpath("//*[@ng-model='notification.togood']");
  	By mailNotFound=By.xpath("//span[@id='conv.mail_list_view_info_message']");
   	By processingBar2=By.xpath("//div[@class='progress-bar progress-bar-striped active']");
   	
   	
   //================================================================================
   	//Object 27.0
   	
   	By notifiSaveEmailTempButton27=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/form/span[3]/button[2]/span[2]");
   	
 

    
	//ContractorA
	
	public pom010_VW_Notification_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
//====================================================================================

	public void NotificationTabValidation() throws InterruptedException {			
		wait=new WebDriverWait(driver,30);	
		
		wait.until(ExpectedConditions.elementToBeClickable(homePage.notificationsTab)).click();
	//	driver.findElement(notifiTab).click();
		log.debug("Notification Tab clicked");	
		driver.navigate().refresh();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		wait.until(ExpectedConditions.elementToBeClickable(notifiLabel));
		
		
		
		if (driver.findElements(notifiPlusIcon).size()==0){
			
			log.debug("Notification create icon (+) not appeared, unable to create notification under this creadetials");	
			
		} else {		
		
		
			log.debug("Notification create icon (+) appeared");		
		wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
		log.debug("Notification icon clicked");	
		
		wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
		Assert.assertTrue(driver.findElement(notifiNameField).isDisplayed());
		log.debug("Verified that 'Notification' Name filed appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiNameField).isEnabled());
		log.debug("Verified that 'Notification' Name filed enabled under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'notifiSmallIcon' label appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isEnabled());
		log.debug("Verified that 'notifiSmallIcon' label enabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).isDisplayed());
		log.debug("Verified that 'Save' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).getText().contains("Save"));
		log.debug("Verified that 'Save' text appearedd on top of button on under Notification tab");
		
		
		Assert.assertTrue(driver.findElement(notifiDeletButton).isDisplayed());
		log.debug("Verified that 'Delete' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiDeletButton).getText().contains("Delete"));
		log.debug("Verified that 'Delete' text appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiMailButton).isDisplayed());
		log.debug("Verified that 'Mail' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiMailButton).getText().contains("Test"));
		log.debug("Verified that 'Test' label appearedd on top of button on under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'notifiSmallIcon' label appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isEnabled());
		log.debug("Verified that 'notifiSmallIcon' label enabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).isDisplayed());
		log.debug("Verified that 'Save' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).getText().contains("Save"));
		log.debug("Verified that 'Save' text appearedd on top of button on under Notification tab");
		
		
		Assert.assertTrue(driver.findElement(notifiDeletButton).isDisplayed());
		log.debug("Verified that 'Delete' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiDeletButton).getText().contains("Delete"));
		log.debug("Verified that 'Delete' text appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiMailButton).isDisplayed());
		log.debug("Verified that 'Mail' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiMailButton).getText().contains("Test"));
		log.debug("Verified that 'Test' label appearedd on top of button on under Notification tab");
		
	    Assert.assertTrue(driver.findElement(notifiUserLabel).isDisplayed());
		log.debug("Verified that 'User' button appeared under Notification tab");
		Assert.assertTrue(driver.findElement(notifiUserLabel).getText().contains("Users"));
		log.debug("Verified that 'Users' label appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiAllButton).isDisplayed());
		log.debug("Verified that 'All' button appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiAllButton).isEnabled());
		log.debug("Verified that 'All' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiAllButton).getText().contains("All"));
		log.debug("Verified that 'All' label appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiNoneButton).isDisplayed());
		log.debug("Verified that 'None' button appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiNoneButton).isEnabled());
		log.debug("Verified that 'None' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiNoneButton).getText().contains("None"));
		log.debug("Verified that 'None' label appearedd on top of button on under Notification tab");
		
		 Assert.assertTrue(driver.findElement(notifiEmailLabel).isDisplayed());
		log.debug("Verified that 'User' button appeared under Notification tab");
		Assert.assertTrue(driver.findElement(notifiEmailLabel).getText().contains("Email Addresses"));
		log.debug("Verified that 'Email Addresses' label appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiSaveButton).isDisplayed());
		log.debug("Verified that 'Save' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).getText().contains("Save"));
		log.debug("Verified that 'Save' text appeared on top of button on under Notification tab");
				
		 Assert.assertTrue(driver.findElement(notifiSecheduleLable).isDisplayed());
		log.debug("Verified that 'Schedules' label appeared under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSecheduleLable).getText().contains("Schedules"));
		log.debug("Verified that 'Schedules' label appeared on under Notification tab");
		
		 Assert.assertTrue(driver.findElement(notifiTimeZoneLabel).isDisplayed());
		log.debug("Verified that 'Notification Time Zone' label appeared under Notification tab");
	//	Assert.assertTrue(driver.findElement(notifiTimeZoneLabel).getText().contains("Time-zone"));
		log.debug("Verified that 'Time-zone' label appeared on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiTimeZoneDropdown).isDisplayed());
		log.debug("Verified that 'Sechedule' dropdown appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiTimeZoneDropdown).isEnabled());
		log.debug("Verified that 'Sechedule' dropdown enabled under Notification tab");
		
		}
		
		Assert.assertTrue(driver.findElement(notifiLabel).isDisplayed());
		log.debug("Verified that 'Notification' label appeared on left side of under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiLabel).isEnabled());
		log.debug("Verified that 'Notification' label enabled on left side of under Notification tab");
		Assert.assertEquals(driver.findElement(notifiLabel).getText(), "Notification");
		log.debug("Verified that 'Notification' label text appearedd on left side of under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiSLabel).isDisplayed());
		log.debug("Verified that 'Notifications' label appeared on left side of under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSLabel).isEnabled());
		log.debug("Verified that 'Notifications' label enabled on left side of under Notification tab");
		Assert.assertEquals(driver.findElement(notifiSLabel).getText(), "Notifications");
		log.debug("Verified that 'Notifications' text appearedd on left side of under Notification tab");
		driver.findElement(homePage.notificationsTab).click();
		
if (driver.findElements(notifiCreatedLink).size()==0){
			
			log.debug("Notification create link is not appeared, unable to create notification under this creadetials");	
			
		} else {		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
		log.debug("Notification icon clicked");	
		
		wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
		Assert.assertTrue(driver.findElement(notifiNameField).isDisplayed());
		log.debug("Verified that 'Notification' Name filed appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiNameField).isEnabled());
		log.debug("Verified that 'Notification' Name filed enabled under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'notifiSmallIcon' label appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isEnabled());
		log.debug("Verified that 'notifiSmallIcon' label enabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).isDisplayed());
		log.debug("Verified that 'Save' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).getText().contains("Save"));
		log.debug("Verified that 'Save' text appearedd on top of button on under Notification tab");
		
		
		Assert.assertTrue(driver.findElement(notifiDeletButton).isDisplayed());
		log.debug("Verified that 'Delete' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiDeletButton).getText().contains("Delete"));
		log.debug("Verified that 'Delete' text appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiMailButton).isDisplayed());
		log.debug("Verified that 'Mail' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiMailButton).getText().contains("Test"));
		log.debug("Verified that 'Test' label appearedd on top of button on under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'notifiSmallIcon' label appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSmallIcon).isEnabled());
		log.debug("Verified that 'notifiSmallIcon' label enabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).isDisplayed());
		log.debug("Verified that 'Save' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).getText().contains("Save"));
		log.debug("Verified that 'Save' text appearedd on top of button on under Notification tab");
		
		
		Assert.assertTrue(driver.findElement(notifiDeletButton).isDisplayed());
		log.debug("Verified that 'Delete' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiDeletButton).getText().contains("Delete"));
		log.debug("Verified that 'Delete' text appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiMailButton).isDisplayed());
		log.debug("Verified that 'Mail' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiMailButton).getText().contains("Test"));
		log.debug("Verified that 'Test' label appearedd on top of button on under Notification tab");
		
	    Assert.assertTrue(driver.findElement(notifiUserLabel).isDisplayed());
		log.debug("Verified that 'User' button appeared under Notification tab");
		Assert.assertTrue(driver.findElement(notifiUserLabel).getText().contains("Users"));
		log.debug("Verified that 'Users' label appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiAllButton).isDisplayed());
		log.debug("Verified that 'All' button appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiAllButton).isEnabled());
		log.debug("Verified that 'All' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiAllButton).getText().contains("All"));
		log.debug("Verified that 'All' label appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiNoneButton).isDisplayed());
		log.debug("Verified that 'None' button appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiNoneButton).isEnabled());
		log.debug("Verified that 'None' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiNoneButton).getText().contains("None"));
		log.debug("Verified that 'None' label appearedd on top of button on under Notification tab");
		
		 Assert.assertTrue(driver.findElement(notifiEmailLabel).isDisplayed());
		log.debug("Verified that 'User' button appeared under Notification tab");
		Assert.assertTrue(driver.findElement(notifiEmailLabel).getText().contains("Email Addresses"));
		log.debug("Verified that 'Email Addresses' label appearedd on top of button on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiSaveButton).isDisplayed());
		log.debug("Verified that 'Save' button appeared under Notification tab");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSaveButton).getText().contains("Save"));
		log.debug("Verified that 'Save' text appeared on top of button on under Notification tab");
				
		 Assert.assertTrue(driver.findElement(notifiSecheduleLable).isDisplayed());
		log.debug("Verified that 'Schedules' label appeared under Notification tab");
		Assert.assertTrue(driver.findElement(notifiSecheduleLable).getText().contains("Schedules"));
		log.debug("Verified that 'Schedules' label appeared on under Notification tab");
		
		 Assert.assertTrue(driver.findElement(notifiTimeZoneLabel).isDisplayed());
		log.debug("Verified that 'Notification Time Zone' label appeared under Notification tab");
	//	Assert.assertTrue(driver.findElement(notifiTimeZoneLabel).getText().contains("Time-zone"));
		log.debug("Verified that 'Time-zone' label appeared on under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiTimeZoneDropdown).isDisplayed());
		log.debug("Verified that 'Sechedule' dropdown appeared under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiTimeZoneDropdown).isEnabled());
		log.debug("Verified that 'Sechedule' dropdown enabled under Notification tab");
		
		}
		
		Assert.assertTrue(driver.findElement(notifiLabel).isDisplayed());
		log.debug("Verified that 'Notification' label appeared on left side of under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiLabel).isEnabled());
		log.debug("Verified that 'Notification' label enabled on left side of under Notification tab");
		Assert.assertEquals(driver.findElement(notifiLabel).getText(), "Notification");
		log.debug("Verified that 'Notification' label text appearedd on left side of under Notification tab");
		
		Assert.assertTrue(driver.findElement(notifiSLabel).isDisplayed());
		log.debug("Verified that 'Notifications' label appeared on left side of under Notification tab");	
		Assert.assertTrue(driver.findElement(notifiSLabel).isEnabled());
		log.debug("Verified that 'Notifications' label enabled on left side of under Notification tab");
		Assert.assertEquals(driver.findElement(notifiSLabel).getText(), "Notifications");
		log.debug("Verified that 'Notifications' text appearedd on left side of under Notification tab");
		
		
	}	
	
	
	
	public void Capture_Mandatory_details(String TestCaseName) throws InterruptedException  {	
		wait=new WebDriverWait(driver,30);	
		pom012_VW_Dashboard_Tab dashboard =new pom012_VW_Dashboard_Tab(driver);
        driver.navigate().refresh();
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
		log.debug("Profile dropdown clicked");	
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
	    log.debug("Profile Tab clicked");	
	    wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
	    Thread.sleep(8000);	
		UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");	
		log.debug("Profile UserEmail is: " +UserEmail);	
		UserName=driver.findElement(dashboard.profileUserName).getAttribute("value");
		 log.debug("Profile UserID is: " +UserName);

		 
		 if (TestCaseName.contains("Cnt")) {
			 Assert.assertTrue(UserName.contains("Cnt"));			 
			 log.debug("Verified User name does not Contain Client as : " +UserName);
			 			 
		 } else if (TestCaseName.contains("Pt")) {
			 
			 Assert.assertTrue(UserName.contains("Pt"));
			 log.debug("Verified User name Contain Partner as : " +UserName);
		
		 }	 else if (TestCaseName.contains("Patd")) {
			 
			 Assert.assertTrue(UserName.contains("Patd"));
			 log.debug("Verified User name Contain Partner as : " +UserName);
		
		 }	
		  
		 
		 
		 log.debug("Verified User name retrived as : " +UserName);
		 
		 
		 
		UserFirstName=driver.findElement(dashboard.firstName).getAttribute("value");
		 log.debug("Profile User First Name is: " +UserFirstName);
		UserLastName=driver.findElement(dashboard.LastName).getAttribute("value");
		log.debug("Profile User Last Name is: " +UserLastName);
		UserPermissionLevel=driver.findElement(dashboard.permissionLevel).getAttribute("value");
		 log.debug("Profile User Permission Level is: " +UserPermissionLevel);
		 
		 
}
		
//================================================Build 27.0==========================================	
	
	
	public void Create_Notifi_using_Email_with_Def_Template() throws InterruptedException  {	
		wait=new WebDriverWait(driver,30);	
//		pom012_VW_Dashboard_Tab dashboard =new pom012_VW_Dashboard_Tab(driver);
		/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
		log.debug("Profile dropdown clicked");	
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
	    log.debug("Profile Tab clicked");	
	    wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
	    Thread.sleep(6000);	
		UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");	
		UserName=driver.findElement(dashboard.profileUserName).getAttribute("value");
		
		
		 log.debug("Profile UserEmail is: " +UserEmail);	
		 log.debug("Profile UserName is: " +UserName);*/
	    wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	//	driver.findElement(notifiTab).click();
		log.debug("Notification Tab clicked");
		wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
		log.debug("Notification icon clicked");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");		
	//	String NotifiName= "Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.debug("Verified that 'Delete' button disabled under Notification tab");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
		Thread.sleep(1000);
		driver.findElement(notifiNameField).sendKeys(NotifiName);
		log.debug("Passing Random notification name under Notification tab"+NotifiName);
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");	
		 
		 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
		driver.findElement(notifiEmailField).sendKeys(UserEmail);
		log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
		
			
		 
		 // JavascriptExecutor js2 = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-500)");	
		 js.executeScript("window.scrollBy(0,-500)");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
		log.info("Save button clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		log.info("Found load progress bar");
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled after creating notification");
		Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
		Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button enabled after creating notification");
		Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button enabled after creating notification");
		log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
		driver.findElement(notifiFilter).sendKeys(NotifiName);
		log.debug("Retriving Notification");
		driver.findElement(notifiFirstSearch).click();
		log.debug("Click first search notify");
		driver.findElement(notifiDeletButton).click();
		log.debug("Clicked selected notify as delete");
		wait.until(ExpectedConditions.alertIsPresent());
		log.info("Alert is coming");
		driver.switchTo().alert().accept();
		log.info("Alert accepted");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		driver.navigate().refresh();
		
		log.debug("Notfication: "+NotifiName+" Delete Successfully");		
		
}
	
//===================================Build 27.0	
	
	public void Create_Notifi_using_User_with_Def_Template() throws InterruptedException  {	
//		pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
		wait=new WebDriverWait(driver,30);	
		/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
		log.debug("Profile dropdown clicked");	
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
	    log.debug("Profile Tab clicked");	
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.profileUserName));	
	    Thread.sleep(6000);	
	    UserName=driver.findElement(dashboard.profileUserName).getAttribute("value");*/
	    
		
		
    //	String UserName=Reuseable_Script_for_Test.Profile_UserName();
		
		 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();    
	//	driver.findElement(notifiTab).click();
		log.debug("Notification Tab clicked");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
		log.debug("Notification icon clicked");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");		
	//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.debug("Verified that 'Delete' button disabled under Notification tab");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
		Thread.sleep(1000);
		driver.findElement(notifiNameField).sendKeys(NotifiName);
		log.debug("Passing Random notification name under Notification tab"+NotifiName);
		
		By UserCheckBox=By.xpath("//span[text()='"+UserName+"']/parent::span/child::input");    		
		
		driver.findElement(UserCheckBox).click();		
		log.debug("Selecting User from checkbox");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-500)");	
		 js.executeScript("window.scrollBy(0,-500)");	
		 log.debug("Scrolling Up");
		wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
		log.info("Save button clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		log.info("Found load progress bar");
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled after creating notification");
		Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
		Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button enabled after creating notification");
		Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button enabled after creating notification");
		log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
		driver.findElement(notifiFilter).sendKeys(NotifiName);
		log.debug("Retriving Notification");
		driver.findElement(notififilterByName).click();
		log.debug("Click first search notify");
		driver.findElement(notifiDeletButton).click();
		log.debug("Clicked selected notify as delete");
		wait.until(ExpectedConditions.alertIsPresent());
		log.info("Alert is coming");
		driver.switchTo().alert().accept();
		log.info("Alert accepted");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		driver.navigate().refresh();
		log.debug("Notfication: "+NotifiName+" Delete Successfully");
		}
	
//==========================Build 27.0	
	public void Edit_Notifi_using_Email_with_Def_Template() throws InterruptedException  {	
//		pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
		wait=new WebDriverWait(driver,30);	
		/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
		log.debug("Profile dropdown clicked");	
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
	    log.debug("Profile Tab clicked");	
	    wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
	    Thread.sleep(6000);	
		String UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");			
		 log.debug("Profile Email is: " +UserEmail);	*/
	//	driver.findElement(notifiTab).click();
		 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
		log.debug("Notification Tab clicked");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
		log.debug("Notification icon clicked");	
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");		
	//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.debug("Verified that 'Delete' button disabled under Notification tab");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
		Thread.sleep(1000);
		driver.findElement(notifiNameField).sendKeys(NotifiName);
		log.debug("Passing Random notification name under Notification tab"+NotifiName);		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");			 
		 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
		driver.findElement(notifiEmailField).sendKeys(UserEmail);
		log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
		 js.executeScript("window.scrollBy(0,-500)");	
		 js.executeScript("window.scrollBy(0,-500)");				
		wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
		log.info("Save button clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		log.info("Found load progress bar");
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled after creating notification");
		Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
		Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button enabled after creating notification");
		Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button enabled after creating notification");
		log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
		driver.findElement(notifiFilter).sendKeys(NotifiName);
		log.debug("Retriving Notification");
		driver.findElement(notififilterByName).click();
		log.debug("Click first search notify");
		driver.findElement(notifiNameField).clear();
		driver.findElement(notifiNameField).sendKeys("Update"+NotifiName);
		log.debug("Click first search notify");
		wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
		WebElement ele1 = driver.findElement(notifiSaveButton);
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele1);		
		
	//	driver.findElement(notifiSaveButton).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
		log.info("Save button clicked");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		log.info("Progress loading");
		wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
	//	driver.findElement(notifiDeletButton).click();
		log.debug("Clicked selected notify as delete");
		wait.until(ExpectedConditions.alertIsPresent());
		log.info("Alert is coming");
		driver.switchTo().alert().accept();
		log.info("Alert accepted");	
		driver.navigate().refresh();
		log.debug("Notfication: "+NotifiName+" Delete Successfully");
}	
//=========================================================================================================	
	
	
//=========================================================================================================	
		
public void Delete_Notifi_using_Email_with_Def_Template() throws InterruptedException  {	
//	pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
	wait=new WebDriverWait(driver,30);	
	/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
    wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
    Thread.sleep(6000);	
	String UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");		
	 log.debug("Profile Email is: " +UserEmail);
	 driver.findElement(notifiTab).click();
	log.debug("Notification Tab clicked");	*/
	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	 wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");			 
	 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	
	driver.findElement(notifiFilter).clear();
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	
	driver.findElement(notififilterByName).click();
	log.debug("Click first search notify");
	wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
//	driver.findElement(notifiDeletButton).click();
	log.debug("Clicked selected notify as delete");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");	
	driver.navigate().refresh();
	log.debug("Notfication: "+NotifiName+" Delete Successfully");
	
}
	

public void Notifi_Mail_button_Validation() throws InterruptedException  {	
	
	    
		wait=new WebDriverWait(driver,30);	
	
		 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
		log.debug("Notification Tab clicked");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
		log.debug("Notification icon clicked");	
		wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");		
	//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.debug("Verified that 'Delete' button disabled under Notification tab");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
		Thread.sleep(1000);
		driver.findElement(notifiNameField).sendKeys(NotifiName);
		log.debug("Passing Random notification name under Notification tab"+NotifiName);	
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,500)");	
		 Thread.sleep(1000);
		 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
		driver.findElement(notifiEmailField).sendKeys(UserEmail);
		log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
		 js.executeScript("window.scrollBy(0,-500)");	
	//	 js.executeScript("window.scrollBy(0,-500)");
		wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
		log.info("Save button clicked");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		log.info("Found load progress bar");
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled after creating notification");
		Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
		log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
		Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button enabled after creating notification");
		Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
		log.debug("Verified that 'Mail' button enabled after creating notification");
		log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
		driver.findElement(notifiMailButton).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		log.info("Found load progress bar");
		wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
		log.info("Mail alert displayed");
		Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
		log.info("Verified that popup 'Test email sent' text appeared on popup");
		wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
		log.debug("Notification filter clicked");
		driver.findElement(notifiFilter).clear();
		driver.findElement(notifiFilter).sendKeys(NotifiName);
		log.debug("Retriving Notification");
		driver.findElement(notififilterByName).click();
		log.debug("Click first search notify");
		driver.findElement(notifiDeletButton).click();
		log.debug("Clicked selected notify as delete");
		wait.until(ExpectedConditions.alertIsPresent());
		log.info("Alert is coming");
		driver.switchTo().alert().accept();
		log.info("Alert accepted");	
		driver.navigate().refresh();
		log.debug("Notfication: "+NotifiName+" Delete Successfully");
	
}

//===========================================26.0=================================================================================================

public void Notify_Assign_To_Test_with_def_Template26() throws InterruptedException  {	
	
	
	wait=new WebDriverWait(driver,30);	
	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");			 
	 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
//	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));		
//	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
//	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
//	executor0.executeScript("arguments[0].click();", ele0);		
//	log.info("New script creation popup appered");
//	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
//	log.info("Clicked Yes");		
	// Script Drop Down	
//	 log.debug("Verified that Script dropdown"); 		 
//	 WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
//	  Select ScriptSelection = new Select(scriptDropdown);        
//	  ScriptSelection.selectByIndex(0);
//	  log.debug("Verified that IVR Script selected from dropdown");   
//	  driver.findElement(ScriptTab.scriptGoBut).click();  
//	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
//	  driver.findElement(ScriptTab.e164disabled).click();
//	 log.debug("Verified that e164disabled");	
	
	
	
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
//	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	
//	WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
//	Select testSelection = new Select(testDropdown);        
//	testSelection.selectByIndex(0);
//	log.info("IVR Test Selected from Test Selection dropdown");	
//	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testGoBuT)).click();
//	log.info("Start Creating Test using + button");	
	
	
	String TestName="Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown = driver.findElement(TestTab.ScriptDropdown); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	
	 
	
	WebElement dropdown1 = driver.findElement(notifiTestDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText(NotifiName);	
	js.executeScript("window.scrollBy(0,-500)");
//	 Thread.sleep(500);
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,-500)");		
	 
	 String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
//	js1.executeScript("window.scrollBy(0,+500)");
	Assert.assertEquals(Associated_Tests,TestName);
//	js1.executeScript("window.scrollBy(0,+500)");
	js1.executeScript("window.scrollBy(0,-500)");
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
//	js1.executeScript("window.scrollBy(0,-500)");
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	if (driver.findElements(TestTab.deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
    log.info("Delete button clicked");    		
    wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
    log.info("Delete Test Successfully");	    
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("delete Test successfully");
	driver.findElement(ScriptTab.scriptsTab).click();
    log.info("Navigate back to script tab");
    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));   
   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
   log.info("Search above created Script using filter " +ScriptName);
    wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
   log.info("Just retrived the deatils of above created script " +ScriptName);
   Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
   log.info("Verified that Run button is enabled");
   Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
   log.info("Verified that Run button contain 'Run Test' text");
   driver.findElement(ScriptTab.selectdropdownn).click();
   log.info("Verified that select dropdown");	
  driver.findElement(ScriptTab.clickdeletedropdown27).click();	
  log.info("Verified that Clicked delete button");	
//driver.findElement(ScriptTab.deleteAllData).click();	
  WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
log.info("Verified that select delete all data");
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
log.info("delete Test successfully");
//wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
driver.findElement(notifiTab).click();
log.debug("Notification Tab clicked");	
driver.findElement(notifiFilter).sendKeys(NotifiName);
log.debug("Retriving Notification");
driver.findElement(notifiFirstSearch).click();
log.debug("Click first search notify");
wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
log.debug("Clicked selected notify as delete");
wait.until(ExpectedConditions.alertIsPresent());
log.info("Alert is coming");
driver.switchTo().alert().accept();
log.info("Alert accepted");	
driver.navigate().refresh();
log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
	driver.navigate().refresh();
}


//=============================================27.0===========================================================
public void Notify_Assign_To_Test_with_def_Template() throws InterruptedException  {	
	
	
	wait=new WebDriverWait(driver,30);	
	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");			 
	 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));		
	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);		
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");		
	// Script Drop Down	
	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
	  Select ScriptSelection = new Select(scriptDropdown);        
	  ScriptSelection.selectByIndex(0);
	  log.debug("Verified that IVR Script selected from dropdown");   
	  driver.findElement(ScriptTab.scriptGoBut).click();  
	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
	  driver.findElement(ScriptTab.e164disabled).click();
	 log.debug("Verified that e164disabled");	
	
	
	
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(ScriptTab.numberToCalle164disabled).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
//	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	
	WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testGoBuT)).click();
	log.info("Start Creating Test using + button");	
	
	
	String TestName="IVR_Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown = driver.findElement(TestTab.ScriptDropdown27); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	
	 
	
	WebElement dropdown1 = driver.findElement(notifiTestDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText(NotifiName);	
	js.executeScript("window.scrollBy(0,-500)");
//	 Thread.sleep(500);
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,+500)");		
	 
	 String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	js1.executeScript("window.scrollBy(0,+500)");
	Assert.assertEquals(Associated_Tests,TestName);
//	js1.executeScript("window.scrollBy(0,+500)");
	js1.executeScript("window.scrollBy(0,+500)");
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	js1.executeScript("window.scrollBy(0,+500)");
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	if (driver.findElements(TestTab.deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
    log.info("Delete button clicked");    		
    wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
    log.info("Delete Test Successfully");	    
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("delete Test successfully");
	driver.findElement(ScriptTab.scriptsTab).click();
    log.info("Navigate back to script tab");
    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));   
   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
   log.info("Search above created Script using filter " +ScriptName);
    wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
   log.info("Just retrived the deatils of above created script " +ScriptName);
   Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
   log.info("Verified that Run button is enabled");
   Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
   log.info("Verified that Run button contain 'Run Test' text");
   driver.findElement(ScriptTab.selectdropdownn).click();
   log.info("Verified that select dropdown");	
  driver.findElement(ScriptTab.clickdeletedropdown27).click();	
  log.info("Verified that Clicked delete button");	
//driver.findElement(ScriptTab.deleteAllData).click();	
  WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
log.info("Verified that select delete all data");
//wait.until(ExpectedConditions.alertIsPresent());
//driver.switchTo().alert().accept();
//log.info("delete Test successfully");
wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
driver.findElement(notifiTab).click();
log.debug("Notification Tab clicked");	
driver.findElement(notifiFilter).sendKeys(NotifiName);
log.debug("Retriving Notification");
driver.findElement(notifiFirstSearch).click();
log.debug("Click first search notify");
wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
log.debug("Clicked selected notify as delete");
wait.until(ExpectedConditions.alertIsPresent());
log.info("Alert is coming");
driver.switchTo().alert().accept();
log.info("Alert accepted");	
driver.navigate().refresh();
log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
	driver.navigate().refresh();
}


//==================================================================================================================

//Create a Test 27.0

public void CBM_Test_Now_Assign_Notificaton() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName+"_CBM");
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");			 
	 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");	
	
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(1);
	log.info("CBM Test Selected from Test Selection dropdown");	
	driver.findElement(TestTab.testGoBuT).click();
	log.info("Start Creating Test using + button");		
	wait.until(ExpectedConditions.presenceOfElementLocated(TestTab.testNameField));

	String TestName="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom CBM Test Name " +TestName);
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	
	WebElement hammerdropdown = driver.findElement(TestTab.cbmselecthammerlabel);		
	Select hammerselect = new Select(hammerdropdown);        
	hammerselect.selectByIndex(1);
	log.info("Hammer lebel selected");
	
	WebElement pkgdropdown = driver.findElement(TestTab.cbmselectpack);		
	Select pkgselect = new Select(pkgdropdown);        
	pkgselect.selectByIndex(2);
	log.info("Package CBM Asterisk Package selected");
	driver.findElement(TestTab.cbmConfid).clear();
	driver.findElement(TestTab.cbmConfid).sendKeys("1234#");
	log.info("Conference ID provided");
	driver.findElement(TestTab.cbmConfpin).clear();
	driver.findElement(TestTab.cbmConfpin).sendKeys("1234#");
	log.info("Conference Pin provided");
	driver.findElement(TestTab.cbmMunberToCall).sendKeys("18002051995");
	log.info("Number to call provided");
	driver.findElement(TestTab.cbmTotalParticipate).clear();
	driver.findElement(TestTab.cbmTotalParticipate).sendKeys("10");
	log.info("Total Participate provided");
	 js.executeScript("window.scrollBy(0,+500)");
	 
	
	WebElement dropdown3 = driver.findElement(notifiTestDropdown); 	 	 
	Select s2 = new Select(dropdown3);	
	s2.selectByVisibleText(NotifiName+"_CBM");	
	 js.executeScript("window.scrollBy(0,-500)");
	 js.executeScript("window.scrollBy(0,-500)");	 
	driver.findElement(TestTab.cbmSaveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
  Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
  log.info("Verified that Run button enabled");
	
	    driver.findElement(notifiTab).click();
		log.debug("Navigate ack to notification Tab");
		wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
		driver.findElement(notifiFilter).sendKeys(NotifiName);
		log.debug("Retriving Notification");
		wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
		log.debug("Click first search notify");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,+500)");		

		String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
		 log.debug("Associted Test: "+Associated_Tests);
		 js1.executeScript("window.scrollBy(0,+500)");
		Assert.assertEquals(Associated_Tests,TestName);
		 js.executeScript("window.scrollBy(0,+500)");
		log.debug("Associated Tests: "+TestName+ "Created successfully" );
		js1.executeScript("window.scrollBy(0,+500)");		
		driver.findElement(By.linkText(TestName)).click();
		log.debug("Navigate back to Test Tab" );
		wait.until(ExpectedConditions.presenceOfElementLocated(TestTab.viewResult));
		
		
	
/*	driver.findElement(TestTab.viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow Clicked located");
	
	WebElement ele = driver.findElement(dashboard2.TestNowButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.debug("TestNow button clicked");
	
	WebElement ele1 = driver.findElement(ScriptTab.deletemessagepopup);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
	 Thread.sleep(45000); 
	 driver.navigate().refresh();
	 if (driver.findElements(dashboard2.TestResultStatus).isEmpty()){
			log.info("Test Result Not found 'Let try one more time'");
			 Thread.sleep(20000);
			 driver.navigate().refresh();
			 log.info("Refersh Web Page");	 	 


wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestResultStatus));
//log.info("Waiting of Test result element");
Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isDisplayed());
log.info("Test Result is displying on dashboard_2");
Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isEnabled());
log.info("Test Result is enabled on dashboard_2");    
Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isDisplayed());
log.info("Verified that Download CSV button is displayed on dashboard_2");
Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isEnabled());
log.info("Verified that Download CSV button is enabled on dashboard_2");    	
		
	
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.viewConfigButton));
	
	WebElement ele4 = driver.findElement(dashboard2.viewConfigButton);
	JavascriptExecutor executor4 = (JavascriptExecutor)driver;
	executor4.executeScript("arguments[0].click();", ele4);*/
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(dashboard2.viewConfigButton)).click();
//	driver.findElement(dashboard2.viewConfigButton).click();
	log.debug("View Configuration button viewed");
//	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	
	driver.findElement(notifiTab).click();
	log.debug("Notification Tab clicked");	
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	driver.findElement(notifiFirstSearch).click();
	log.debug("Click first search notify");
	wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
	log.debug("Clicked selected notify as delete");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");	
	driver.navigate().refresh();
	log.debug("Notfication: "+NotifiName+" Delete Successfully");
	
	
}
	 



//==========================================================================================================

//Create a Test 27.0

public void CBM_Test_scheduling() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(cbmNotifySech);
	log.debug("Passing Random notification name under Notification tab"+cbmNotifySech);	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");			 
	 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");	
	
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");
	Thread.sleep(5000);
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(1);
	log.info("CBM Test Selected from Test Selection dropdown");	
	driver.findElement(TestTab.testGoBuT).click();
	log.info("Start Creating Test using + button");		
	wait.until(ExpectedConditions.presenceOfElementLocated(TestTab.testNameField));

//	String TestName="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
//	log.info("Generate Radom CBM Test Name " +TestName);
	driver.findElement(TestTab.testNameField).sendKeys(cbmtestscheduling);
	
	WebElement hammerdropdown = driver.findElement(TestTab.cbmselecthammerlabel);		
	Select hammerselect = new Select(hammerdropdown);        
	hammerselect.selectByIndex(1);
	log.info("Hammer lebel selected");
	
	WebElement pkgdropdown = driver.findElement(TestTab.cbmselectpack);		
	Select pkgselect = new Select(pkgdropdown);        
	pkgselect.selectByIndex(2);
	log.info("Package CBM Asterisk Package selected");
	driver.findElement(TestTab.cbmConfid).clear();
	driver.findElement(TestTab.cbmConfid).sendKeys("1234#");
	log.info("Conference ID provided");
	driver.findElement(TestTab.cbmConfpin).clear();
	driver.findElement(TestTab.cbmConfpin).sendKeys("1234#");
	log.info("Conference Pin provided");
	driver.findElement(TestTab.cbmMunberToCall).sendKeys("18002051995");
	log.info("Number to call provided");
	driver.findElement(TestTab.cbmTotalParticipate).clear();
	driver.findElement(TestTab.cbmTotalParticipate).sendKeys("10");
	log.info("Total Participate provided");
	 js.executeScript("window.scrollBy(0,+500)");
	 
	
	WebElement dropdown3 = driver.findElement(notifiTestDropdown); 	 	 
	Select s2 = new Select(dropdown3);	
	s2.selectByVisibleText(cbmNotifySech);	
	 js.executeScript("window.scrollBy(0,-500)");
	 js.executeScript("window.scrollBy(0,-500)");	 
	driver.findElement(TestTab.cbmSaveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
log.info("Verified that Run button enabled");
	
	    driver.findElement(notifiTab).click();
		log.debug("Navigate ack to notification Tab");
		wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
		driver.findElement(notifiFilter).sendKeys(cbmNotifySech);
		log.debug("Retriving Notification");
		wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
		log.debug("Click first search notify");
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,+500)");		

		String Associated_Tests=driver.findElement(By.linkText(cbmtestscheduling)).getText();
		 log.debug("Associted Test: "+Associated_Tests);
		 js1.executeScript("window.scrollBy(0,+500)");
		Assert.assertEquals(Associated_Tests,cbmtestscheduling);
		 js.executeScript("window.scrollBy(0,+500)");
		log.debug("Associated Tests: "+cbmtestscheduling+ "Created successfully" );
		js1.executeScript("window.scrollBy(0,+500)");		
		driver.findElement(By.linkText(cbmtestscheduling)).click();
		wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton));
		
	
	/*driver.findElement(TestTab.viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow Clicked located");
	
	WebElement ele = driver.findElement(dashboard2.TestNowButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.debug("TestNow button clicked");
	
	WebElement ele1 = driver.findElement(ScriptTab.deletemessagepopup);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
	 Thread.sleep(45000); 
	 driver.navigate().refresh();
	 if (driver.findElements(dashboard2.TestResultStatus).isEmpty()){
			log.info("Test Result Not found 'Let try one more time'");
			 Thread.sleep(20000);
			 driver.navigate().refresh();
			 log.info("Refersh Web Page");	 	 


wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestResultStatus));
//log.info("Waiting of Test result element");
Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isDisplayed());
log.info("Test Result is displying on dashboard_2");
Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isEnabled());
log.info("Test Result is enabled on dashboard_2");    
Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isDisplayed());
log.info("Verified that Download CSV button is displayed on dashboard_2");
Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isEnabled());
log.info("Verified that Download CSV button is enabled on dashboard_2");    	
		
	
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.viewConfigButton));
	
	WebElement ele4 = driver.findElement(dashboard2.viewConfigButton);
	JavascriptExecutor executor4 = (JavascriptExecutor)driver;
	executor4.executeScript("arguments[0].click();", ele4);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(dashboard2.viewConfigButton)).click();
//	driver.findElement(dashboard2.viewConfigButton).click();
	log.debug("View Configuration button clicked");
//	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");*/
	

	 
}

//==================================================================================================================


public void CBM_Test_scheduling_Verification() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton));
	
	driver.findElement(TestTab.filterBox).sendKeys(cbmtestscheduling);
	driver.findElement(TestTab.cbmselectfirstSearch).click();
	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar");
	

	driver.findElement(TestTab.viewResult).click();
	log.debug("ViewResult button clicked");
	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow Clicked located");
	
	Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isDisplayed());
	log.info("Test Result is displying on dashboard_2");
	Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isEnabled());
	log.info("Test Result is enabled on dashboard_2");    
	Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isDisplayed());
	log.info("Verified that Download CSV button is displayed on dashboard_2");
	Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isEnabled());
	log.info("Verified that Download CSV button is enabled on dashboard_2"); 
	
	Assert.assertTrue(driver.findElement(dashboard2.cbminstance1).isDisplayed());
	log.info("Verified that First instance is displayed on dashboard_2");
	Assert.assertTrue(driver.findElement(dashboard2.cbminstance1).isEnabled());
	log.info("Verified that First instance is enabled on dashboard_2");
	
	Assert.assertTrue(driver.findElement(dashboard2.cbminstance2).isDisplayed());
	log.info("Verified that Second instance is displayed on dashboard_2");
	Assert.assertTrue(driver.findElement(dashboard2.cbminstance2).isEnabled());
	log.info("Verified that Second instance is enabled on dashboard_2");
	
	
	Assert.assertTrue(driver.findElement(dashboard2.cbminstance3).isDisplayed());
	log.info("Verified that Third instance is displayed on dashboard_2");
	Assert.assertTrue(driver.findElement(dashboard2.cbminstance3).isEnabled());
	log.info("Verified that Third instance is enabled on dashboard_2");	
	
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.viewConfigButton));
	
	WebElement ele4 = driver.findElement(dashboard2.viewConfigButton);
	JavascriptExecutor executor4 = (JavascriptExecutor)driver;
	executor4.executeScript("arguments[0].click();", ele4);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(dashboard2.viewConfigButton)).click();
//	driver.findElement(dashboard2.viewConfigButton).click();
	log.debug("View Configuration button clicked");
//	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");

     
	driver.findElement(notifiTab).click();
	log.debug("Notification Tab clicked");	
	driver.findElement(notifiFilter).sendKeys(cbmNotifySech);
	log.debug("Retriving Notification");
	driver.findElement(notifiFirstSearch).click();
	log.debug("Click first search notify");
	wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
	log.debug("Clicked selected notify as delete");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");	
	driver.navigate().refresh();
	log.debug("Notfication: "+NotifiName+" Delete Successfully");
	
	
}

	







//==============================27.0================================================================================

public void Notify_Assign_To_Test_with_New_Template() throws InterruptedException  {	
	pom007_VW_Script_Tabs script_Tab=new pom007_VW_Script_Tabs(driver);
	pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	
	wait=new WebDriverWait(driver,30);	
	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab: "+NotifiName);	
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email: "+UserEmail+" under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,+500)");	
//	 js.executeScript("window.scrollBy(0,-500)");		 
//	driver.findElement(notifiEmailTemplateDropdown).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiEmailTemplateDropdown)); 
	WebElement dropdown1 = driver.findElement(notifiEmailTemplateDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText("- Create Email Template -");
	log.debug("Select - Create Email Template -' from Email Template dropdown");
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	String TemplateName="Automation_Testing_Template_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(notifyTemplateName).sendKeys(TemplateName);
	log.debug("TemplateName passed");
	driver.findElement(notifyTemplateSubject).sendKeys("VoiceWatch $notification_severity Alert: $test_name reports $summary");
	log.debug("Subject Passed");
	driver.findElement(notifyTemplateBody).sendKeys("VoiceWatch $notification_severity Alert\r\n" + 
			"\r\n" + 
			"Test Name: $test_name\r\n" + 
			"\r\n" +
			"Customer Name: $client_name \r\n" + 
			"\r\n" +
			"Call Result Link: $call_result_link \r\n" + 
			"\r\n" +
			"Test Start Time: $test_start_time\r\n" +
			"\r\n" +
			"Test End Time: $test_end_time\r\n" + 
			"\r\n" + 
			"failures123");
	log.debug("Body Passed");
	Thread.sleep(500);
	 js.executeScript("window.scrollBy(0,+500)");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	driver.findElement(notifiSaveEmailTempButton).click();
	log.debug("Save Creted Template");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.debug("Progress page loading");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");	
	log.debug("Verified that Email Template: "+TemplateName+" created successfully");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
    wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ " created Successfully");	
	
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	driver.findElement(script_Tab.scriptsTab).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("found progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(script_Tab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));		
	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);		
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");		
	// Script Drop Down	
	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
	  Select ScriptSelection = new Select(scriptDropdown);        
	  ScriptSelection.selectByIndex(0);
	  log.debug("Verified that IVR Script selected from dropdown");   
	  driver.findElement(ScriptTab.scriptGoBut).click();  
	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
	  driver.findElement(ScriptTab.e164disabled).click();
	 log.debug("Verified that e164disabled");	
		
	
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(script_Tab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(script_Tab.numberToCalle164disabled).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(script_Tab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(script_Tab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(script_Tab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(script_Tab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(script_Tab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");
	
	
	
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");

	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
	
	 WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testGoBuT)).click();
	log.info("Start Creating Test using + button");	
	
//	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	String TestName="IVR_Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown2 = driver.findElement(TestTab.ScriptDropdown27); 	 	 
	Select s = new Select(dropdown2);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");

	WebElement dropdown3 = driver.findElement(notifiTestDropdown); 	 	 
	Select s2 = new Select(dropdown3);	
	s2.selectByVisibleText(NotifiName);	
	 js.executeScript("window.scrollBy(0,-500)");
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,+500)");		

	String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	 js1.executeScript("window.scrollBy(0,+500)");
	Assert.assertEquals(Associated_Tests,TestName);
	 js.executeScript("window.scrollBy(0,+500)");
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	js1.executeScript("window.scrollBy(0,+500)");		
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	if (driver.findElements(TestTab.deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
	
	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
    log.info("Delete button clicked");    		
    wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
    log.info("Delete Test Successfully");	    
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("delete Test successfully");
	driver.findElement(script_Tab.scriptsTab).click();
    log.info("Navigate back to script tab");
    wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));   
   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
   log.info("Search above created Script using filter " +ScriptName);
   log.info("Sync issue so waiting just nine second");
   wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();
   log.info("Just retrived the deatils of above created script " +ScriptName);
   Assert.assertTrue(driver.findElement(script_Tab.RunButton).isEnabled());
   log.info("Verified that Run button is enabled");
   Assert.assertEquals(driver.findElement(script_Tab.RunButton).getText().contains("Run Test"), true);
   log.info("Verified that Run button contain 'Run Test' text");
   driver.findElement(ScriptTab.selectdropdownn).click();
   log.info("Verified that select dropdown");	
  driver.findElement(ScriptTab.clickdeletedropdown27).click();	
  log.info("Verified that Clicked delete button");	
//driver.findElement(ScriptTab.deleteAllData).click();	
  WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
log.info("Verified that select delete all data");
//wait.until(ExpectedConditions.alertIsPresent());
//driver.switchTo().alert().accept();
wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();

log.info("delete Test successfully");
driver.findElement(notifiTab).click();
log.debug("Notification Tab clicked");	
driver.findElement(notifiFilter).sendKeys(NotifiName);
log.debug("Retriving Notification");
driver.findElement(notifiFirstSearch).click();
log.debug("Click first search notify");
wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
log.debug("Clicked selected notify as delete");
wait.until(ExpectedConditions.alertIsPresent());
log.info("Alert is coming");
driver.switchTo().alert().accept();
log.info("Alert accepted");	
driver.navigate().refresh();
log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
	driver.navigate().refresh();
}
//==================================================26.1===========================================================

public void Notify_Assign_To_Test_with_New_Template_26() throws InterruptedException  {	
	pom007_VW_Script_Tabs script_Tab=new pom007_VW_Script_Tabs(driver);
	pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	
	wait=new WebDriverWait(driver,30);	
	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab: "+NotifiName);	
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email: "+UserEmail+" under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,+500)");	
//	 js.executeScript("window.scrollBy(0,-500)");		 
//	driver.findElement(notifiEmailTemplateDropdown).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiEmailTemplateDropdown)); 
	WebElement dropdown1 = driver.findElement(notifiEmailTemplateDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText("- Create Email Template -");
	log.debug("Select - Create Email Template -' from Email Template dropdown");
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	String TemplateName="Automation_Testing_Template_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(notifyTemplateName).sendKeys(TemplateName);
	log.debug("TemplateName passed");
	driver.findElement(notifyTemplateSubject).sendKeys("VoiceWatch $notification_severity Alert: $test_name reports $summary");
	log.debug("Subject Passed");
	driver.findElement(notifyTemplateBody).sendKeys("VoiceWatch $notification_severity Alert\r\n" + 
			"\r\n" + 
			"Test Name: $test_name\r\n" + 
			"\r\n" +
			"Customer Name: $client_name \r\n" + 
			"\r\n" +
			"Call Result Link: $call_result_link \r\n" + 
			"\r\n" +
			"Test Start Time: $test_start_time\r\n" +
			"\r\n" +
			"Test End Time: $test_end_time\r\n" + 
			"\r\n" + 
			"failures123");
	log.debug("Body Passed");
	Thread.sleep(500);
	 js.executeScript("window.scrollBy(0,+500)");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	driver.findElement(notifiSaveEmailTempButton).click();
	log.debug("Save Creted Template");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.debug("Progress page loading");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");	
	log.debug("Verified that Email Template: "+TemplateName+" created successfully");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
    wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ " created Successfully");	
	
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	driver.findElement(script_Tab.scriptsTab).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("found progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(script_Tab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
//	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));		
//	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
//	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
//	executor0.executeScript("arguments[0].click();", ele0);		
//	log.info("New script creation popup appered");
//	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
//	log.info("Clicked Yes");		
	// Script Drop Down	
//	 log.debug("Verified that Script dropdown"); 		 
//	 WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
//	  Select ScriptSelection = new Select(scriptDropdown);        
//	  ScriptSelection.selectByIndex(0);
//	  log.debug("Verified that IVR Script selected from dropdown");   
//	  driver.findElement(ScriptTab.scriptGoBut).click();  
//	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
//	  driver.findElement(ScriptTab.e164disabled).click();
//	 log.debug("Verified that e164disabled");	
		
	
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(script_Tab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(script_Tab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(script_Tab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(script_Tab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(script_Tab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(script_Tab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(script_Tab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");

	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
	
//	 WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
//	Select testSelection = new Select(testDropdown);        
//	testSelection.selectByIndex(0);
//	log.info("IVR Test Selected from Test Selection dropdown");	
//	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testGoBuT)).click();
//	log.info("Start Creating Test using + button");	
	
//	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	String TestName="Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown2 = driver.findElement(TestTab.ScriptDropdown); 	 	 
	Select s = new Select(dropdown2);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");

	WebElement dropdown3 = driver.findElement(notifiTestDropdown); 	 	 
	Select s2 = new Select(dropdown3);	
	s2.selectByVisibleText(NotifiName);	
	 js.executeScript("window.scrollBy(0,-500)");
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 js1.executeScript("window.scrollBy(0,+500)");		
	String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	 js.executeScript("window.scrollBy(0,+500)");
	Assert.assertEquals(Associated_Tests,TestName);
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	js1.executeScript("window.scrollBy(0,+500)");		
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	if (driver.findElements(TestTab.deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
	
	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
    log.info("Delete button clicked");    		
    wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
    log.info("Delete Test Successfully");	    
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("delete Test successfully");
	driver.findElement(script_Tab.scriptsTab).click();
    log.info("Navigate back to script tab");
    wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));   
   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
   log.info("Search above created Script using filter " +ScriptName);
   log.info("Sync issue so waiting just nine second");
   wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();
   log.info("Just retrived the deatils of above created script " +ScriptName);
   Assert.assertTrue(driver.findElement(script_Tab.RunButton).isEnabled());
   log.info("Verified that Run button is enabled");
   Assert.assertEquals(driver.findElement(script_Tab.RunButton).getText().contains("Run Test"), true);
   log.info("Verified that Run button contain 'Run Test' text");
   driver.findElement(ScriptTab.selectdropdownn).click();
   log.info("Verified that select dropdown");	
  driver.findElement(ScriptTab.clickdeletedropdown).click();	
  log.info("Verified that Clicked delete button");	
//driver.findElement(ScriptTab.deleteAllData).click();	
  WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
log.info("Verified that select delete all data");
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
//wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();

log.info("delete Test successfully");
driver.findElement(notifiTab).click();
log.debug("Notification Tab clicked");	
driver.findElement(notifiFilter).sendKeys(NotifiName);
log.debug("Retriving Notification");
driver.findElement(notifiFirstSearch).click();
log.debug("Click first search notify");
wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
log.debug("Clicked selected notify as delete");
wait.until(ExpectedConditions.alertIsPresent());
log.info("Alert is coming");
driver.switchTo().alert().accept();
log.info("Alert accepted");	
driver.navigate().refresh();
log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
	driver.navigate().refresh();
}

//==================================================================================================================


public void Email_Validation_on_Beta_Server() throws InterruptedException, IOException  {	
	
	wait=new WebDriverWait(driver,30);	
	/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
    wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
    Thread.sleep(6000);	
	String UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");		
	 log.debug("Profile Email is: " +UserEmail);	*/
//	driver.findElement(notifiTab).click();
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,500)");			 
	 wait.until(ExpectedConditions.elementToBeClickable(notifiEmailField));
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses: "+UserEmail+"under Notification tab");
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	
	// Create object of SimpleDateFormat class and decide the format
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	
	 log.debug("Current date is: "+date1);
	
	
	driver=intializeWebDriver();
	driver.get("https://email.empirix.com/owa/#path=/mail");
	log.debug("WebMail Launched");
	driver.manage().window().maximize();
	
	Thread.sleep(6000);

	driver.findElement(MailUserName).sendKeys("hsingh@empirix.com");
	log.debug("WebUserName Provided");

	driver.findElement(MailPassword).sendKeys("Empirix444");
	log.debug("WebPassword Provided");

	driver.findElement(MailSignInButton).click();
	log.debug("SignIn button clicked");

	Thread.sleep(7000);

	
	driver.findElement(SearchMail).click();
	log.debug("Element Found");
	Thread.sleep(3000);
//	driver.findElement(MailType).sendKeys("VoiceWatch <NOTIFICATION SEVERITY> Alert");
	driver.findElement(MailType).sendKeys("Empirix_QA_Test");

	log.debug("Search mail found");
	Thread.sleep(1000);
	driver.findElement(MailSearchButton).click();
	log.debug("Search mail Clicked");
	
	driver.findElement(By.xpath("//span[@class='_lv_01 lvHighlightAllClass lvHighlightSubjectClass']")).click();
	log.debug("Found Mail Clicked");
	
//	String Mail_Date=driver.findElement(By.xpath("ItemHeader.DateReceivedLabel")).getAttribute("value");
	
//	log.debug("Mail Date: "+Mail_Date);
	
//	driver.findElement(UnreadMail).isDisplayed();
//	log.debug("Unread mail found");
			

}

//===============================27==========================================================================

public void Email_Validation_with_test_on_Beta_Server() throws InterruptedException, IOException  {	
	
	pom007_VW_Script_Tabs script_Tab=new pom007_VW_Script_Tabs(driver);
	pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	
	
	wait=new WebDriverWait(driver,40);	
	/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
    wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
    Thread.sleep(6000);	
	String UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");		
	 log.debug("Profile Email is: " +UserEmail);*/
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
//	driver.findElement(notifiTab).click();
	log.debug("Notification Tab clicked");	
    wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();  
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses 'hssingh@empirix.com' under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	WebElement ele1 = driver.findElement(MailClose);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	
	
	driver.findElement(script_Tab.scriptsTab).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("found progress bar");
	Thread.sleep(6000);
	wait.until(ExpectedConditions.elementToBeClickable(script_Tab.createNewScriptByButton)).click();	
	log.info("Start Creating Script using + button");
    wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));		
	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);		
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");		
	// Script Drop Down	
	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
	  Select ScriptSelection = new Select(scriptDropdown);        
	  ScriptSelection.selectByIndex(0);
	  log.debug("Verified that IVR Script selected from dropdown");   
	  driver.findElement(ScriptTab.scriptGoBut).click();  
	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
	  driver.findElement(ScriptTab.e164disabled).click();
	 log.debug("Verified that e164disabled");
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(script_Tab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(script_Tab.numberToCalle164disabled).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(script_Tab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(script_Tab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(script_Tab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(script_Tab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(script_Tab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
//	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
		log.info("Start Creating Test using + button");	
		
    WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testGoBuT)).click();
	log.info("Start Creating Test using + button");	
			
//			driver.findElement(TestTab.testCreateplusbutton).click();	
			log.info("Clicked Test Create icon");	
	String TestName="IVR_Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown = driver.findElement(TestTab.ScriptDropdown27); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	WebElement dropdown1 = driver.findElement(notifiTestDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText(NotifiName);
	log.info("Notifier dropdown selected"+NotifiName);	
	
	WebElement dropdown2 = driver.findElement(NotifyPattern); 	 	 
	Select s2 = new Select(dropdown2);	
	s2.selectByVisibleText("notify repeatedly");
	log.info("Notifier pattern:'notify repeatedly' selected from dropdown");	
	driver.findElement(NotifyCheckBox).click();
	log.info("'Notify on return to good' checkbox clicked");
	js.executeScript("window.scrollBy(0,-500)");
	
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,+500)");
	String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	 js1.executeScript("window.scrollBy(0,+500)");
	Assert.assertEquals(Associated_Tests,TestName);	
	 js1.executeScript("window.scrollBy(0,+500)");
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	js1.executeScript("window.scrollBy(0,+500)");
	driver.findElement(By.linkText(TestName)).click();	
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.viewResult));
	driver.findElement(TestTab.viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow located");
	WebElement ele = driver.findElement(dashboard2.TestNowButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.debug("TestNow button clicked");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
	 Thread.sleep(45000); 
	 driver.navigate().refresh();
	 if (driver.findElements(dashboard2.TestResultStatus).isEmpty()){
			log.info("Test Result Not found 'Let try one more time'");
			 Thread.sleep(20000);
			 driver.navigate().refresh();
			 log.info("Refersh Web Page");	 	 
	 driver.navigate().refresh();
	 wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestResultStatus));
	  Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isDisplayed());
	  log.info("Test Result is displying on dashboard_2");
	  Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isEnabled());
	  log.info("Test Result is enabled on dashboard_2");    
	  Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isDisplayed());
	  log.info("Verified that Download CSV button is displayed on dashboard_2");
	  Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isEnabled());
	  log.info("Verified that Download CSV button is enabled on dashboard_2");    	
		log.info("=========================Celaning Test Data======================");
		driver.findElement(dashboard2.viewConfigButton).click();
		log.info("Navigate to test tab using View Configuration button");  
		wait.until(ExpectedConditions.elementToBeClickable(TestTab.viewResult));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar loading");
		if (driver.findElements(TestTab.deleteButton).isEmpty()){
			log.info("Delete button not found");
		} else {
			
		wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
		log.info("Delete button clicked under Test Tab");		
		wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
		log.info("Test Delete Successfully");	   
		
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
		log.info("found progress bar loading");
		driver.findElement(ScriptTab.scriptsTab).click();
		log.info("Navigate back to script tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar loading");   
		driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
		log.info("Search above created Script using filter " +ScriptName);
		wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
		log.info("Just retrived the deatils of above created script " +ScriptName);
		Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
		log.info("Verified that Run button is enabled");
		Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
		log.info("Verified that Run button contain 'Run Test' text");
		driver.findElement(ScriptTab.selectdropdownn).click();
		log.info("Verified that select dropdown");	
		driver.findElement(ScriptTab.clickdeletedropdown27).click();	
		log.info("Verified that Clicked delete button");	
//		driver.findElement(ScriptTab.deleteAllData).click();
		WebElement ele2 = driver.findElement(ScriptTab.deleteAllData);
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);
		log.info("Verified that select delete all data");
//		wait.until(ExpectedConditions.alertIsPresent());
//		driver.switchTo().alert().accept();
	  
		wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
		log.info(" Above all date clened/deleted successfully"); 
		driver.navigate().refresh();
	 
	
//	wait.until(ExpectedConditions.alertIsPresent());
//	log.info("Alert is coming");
//	driver.switchTo().alert().accept();
//	log.info("Alert accepted");
//	driver.close();
//	log.info("Application Closed");
 //   Thread.sleep(16000);		

	// Create object of SimpleDateFormat class and decide the format
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	
	 log.debug("Current date is: "+date1);
	
	
	driver=intializeWebDriver();
	driver.get("https://email.empirix.com/owa/#path=/mail");
	log.debug("Empirix WebMail Launched");
	Thread.sleep(9000);
	driver.manage().window().maximize();

	driver.findElement(MailUserName).sendKeys("hsingh@empirix.com");
	log.debug("WebUserName Provided");

	driver.findElement(MailPassword).sendKeys("Empirix666");
	
	log.debug("WebPassword Provided");

	driver.findElement(MailSignInButton).click();
	log.debug("SignIn button clicked");

	Thread.sleep(10000);	
	driver.findElement(SearchMail).click();
	log.debug("Element Found");
	Thread.sleep(6000);
	driver.findElement(MailType).sendKeys(TestName);

	log.debug("Finding mail againt TestName: "+TestName);
	Thread.sleep(6000);
	driver.findElement(MailSearchButton).click();
	log.debug("Search mail Clicked");

	
	if (driver.findElement(mailNotFound).isDisplayed()==true){
		
	log.debug("Mail not found");
	}
	
	else
	{
		
	log.debug("Mail found");
	}
	
 driver.close();
 
 
 
 
 
	
		}
		}
	
}
	
/*	
	//open a mail from the gmail inbox.
	List<WebElement> a = driver.findElements(By.xpath("//span[@id='_ariaId_51.folder']"));
	            System.out.println("count" +a.size());
	            for (int i = 0; i < a.size(); i++) {
	                System.out.println(a.get(i).getText());
	                if (a.get(i).getText().equals(TestName)) //to click on a specific mail.
	                    {                                           
	                    a.get(i).click();
	                    
	                    log.debug("Mail clicked");
	                    
	                    
	                }
	            }
	*/
//====================================================================26.0=============================================================		


public void Email_Validation_with_test_on_Beta_Server_26() throws InterruptedException, IOException  {	
	
	pom007_VW_Script_Tabs script_Tab=new pom007_VW_Script_Tabs(driver);
	pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	
	
	wait=new WebDriverWait(driver,40);	
	/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
  log.debug("Profile Tab clicked");	
  wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileEmail));
  Thread.sleep(6000);	
	String UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");		
	 log.debug("Profile Email is: " +UserEmail);*/
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
//	driver.findElement(notifiTab).click();
	log.debug("Notification Tab clicked");	
  wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();  
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email Addresses 'hssingh@empirix.com' under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	WebElement ele1 = driver.findElement(MailClose);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	
	
	driver.findElement(script_Tab.scriptsTab).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("found progress bar");
	Thread.sleep(6000);
	wait.until(ExpectedConditions.elementToBeClickable(script_Tab.createNewScriptByButton)).click();	
	log.info("Start Creating Script using + button");
 //   wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));		
//	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
//	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
//	executor0.executeScript("arguments[0].click();", ele0);		
//	log.info("New script creation popup appered");
//	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");		
	// Script Drop Down	
//	 log.debug("Verified that Script dropdown"); 		 
//	 WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
//	  Select ScriptSelection = new Select(scriptDropdown);        
//	  ScriptSelection.selectByIndex(0);
//	  log.debug("Verified that IVR Script selected from dropdown");   
//	  driver.findElement(ScriptTab.scriptGoBut).click();  
//	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
//	  driver.findElement(ScriptTab.e164disabled).click();
//	 log.debug("Verified that e164disabled");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
  driver.findElement(script_Tab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(script_Tab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(script_Tab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
   Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(script_Tab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(script_Tab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(script_Tab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(script_Tab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
//	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
		log.info("Start Creating Test using + button");	
		
//  WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
//	Select testSelection = new Select(testDropdown);        
//	testSelection.selectByIndex(0);
//	log.info("IVR Test Selected from Test Selection dropdown");	
//	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testGoBuT)).click();
//	log.info("Start Creating Test using + button");	
			
//			driver.findElement(TestTab.testCreateplusbutton).click();	
			log.info("Clicked Test Create icon");	
	String TestName="Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown = driver.findElement(TestTab.ScriptDropdown); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	WebElement dropdown1 = driver.findElement(notifiTestDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText(NotifiName);
	log.info("Notifier dropdown selected"+NotifiName);	
	
	WebElement dropdown2 = driver.findElement(NotifyPattern); 	 	 
	Select s2 = new Select(dropdown2);	
	s2.selectByVisibleText("notify repeatedly");
	log.info("Notifier pattern:'notify repeatedly' selected from dropdown");	
	driver.findElement(NotifyCheckBox).click();
	log.info("'Notify on return to good' checkbox clicked");
	js.executeScript("window.scrollBy(0,-500)");
	
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
  Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
  log.info("Verified that Run button enabled");
  driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	 JavascriptExecutor js1 = (JavascriptExecutor) driver;
	js1.executeScript("window.scrollBy(0,+500)");
	String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	 js1.executeScript("window.scrollBy(0,+500)");
	Assert.assertEquals(Associated_Tests,TestName);	
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
//	js.executeScript("window.scrollBy(0,+500)");
	driver.findElement(By.linkText(TestName)).click();	
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.viewResult));
	driver.findElement(TestTab.viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow located");
	WebElement ele = driver.findElement(dashboard2.TestNowButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.debug("TestNow button clicked");
//	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
	
	
	 Thread.sleep(45000); 
	 driver.navigate().refresh();
	 if (driver.findElements(dashboard2.TestResultStatus).isEmpty()){
			log.info("Test Result Not found 'Let try one more time'");
			 Thread.sleep(20000);
			 driver.navigate().refresh();
			 log.info("Refersh Web Page");	 	 
	 driver.navigate().refresh();
	 wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestResultStatus));
	  Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isDisplayed());
	  log.info("Test Result is displying on dashboard_2");
	  Assert.assertTrue(driver.findElement(dashboard2.TestResultStatus).isEnabled());
	  log.info("Test Result is enabled on dashboard_2");    
	  Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isDisplayed());
	  log.info("Verified that Download CSV button is displayed on dashboard_2");
	  Assert.assertTrue(driver.findElement(dashboard2.DownloadCSVButton).isEnabled());
	  log.info("Verified that Download CSV button is enabled on dashboard_2");    	
		log.info("=========================Celaning Test Data======================");
		driver.findElement(dashboard2.viewConfigButton).click();
		log.info("Navigate to test tab using View Configuration button");  
		wait.until(ExpectedConditions.elementToBeClickable(TestTab.viewResult));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar loading");
		if (driver.findElements(TestTab.deleteButton).isEmpty()){
			log.info("Delete button not found");
		} else {
			
		wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
		log.info("Delete button clicked under Test Tab");		
		wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
		log.info("Test Delete Successfully");	   
		
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
		log.info("found progress bar loading");
		driver.findElement(ScriptTab.scriptsTab).click();
		log.info("Navigate back to script tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar loading");   
		driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
		log.info("Search above created Script using filter " +ScriptName);
		wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
		log.info("Just retrived the deatils of above created script " +ScriptName);
		Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
		log.info("Verified that Run button is enabled");
		Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
		log.info("Verified that Run button contain 'Run Test' text");
		driver.findElement(ScriptTab.selectdropdownn).click();
		log.info("Verified that select dropdown");	
		driver.findElement(ScriptTab.clickdeletedropdown).click();	
		log.info("Verified that Clicked delete button");	
//		driver.findElement(ScriptTab.deleteAllData).click();
		WebElement ele2 = driver.findElement(ScriptTab.deleteAllData);
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);
		log.info("Verified that select delete all data");
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	  
//		wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
		log.info(" Above all date clened/deleted successfully"); 
		driver.navigate().refresh();
	 
	
//	wait.until(ExpectedConditions.alertIsPresent());
//	log.info("Alert is coming");
//	driver.switchTo().alert().accept();
//	log.info("Alert accepted");
//	driver.close();
//	log.info("Application Closed");
//   Thread.sleep(16000);		

	// Create object of SimpleDateFormat class and decide the format
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	
	 log.debug("Current date is: "+date1);
	
	
	driver=intializeWebDriver();
	driver.get("https://email.empirix.com/owa/auth/logon.aspx?replaceCurrent=1&url=https%3a%2f%2femail.empirix.com%2fowa%2f");
	log.debug("Empirix WebMail Launched");
	Thread.sleep(9000);
	driver.manage().window().maximize();

	driver.findElement(MailUserName).sendKeys("hsingh@empirix.com");
	log.debug("WebUserName Provided");

	driver.findElement(MailPassword).sendKeys("Empirix666");
	
	log.debug("WebPassword Provided");

	driver.findElement(MailSignInButton).click();
	log.debug("SignIn button clicked");

	Thread.sleep(10000);	
	driver.findElement(SearchMail).click();
	log.debug("Element Found");
	Thread.sleep(6000);
	driver.findElement(MailType).sendKeys(TestName);

	log.debug("Finding mail againt TestName: "+TestName);
	Thread.sleep(6000);
	driver.findElement(MailSearchButton).click();
	log.debug("Search mail Clicked");

	
	if (driver.findElement(mailNotFound).isDisplayed()==true){
		
	log.debug("Mail not found");
	}
	
	else
	{
		
	log.debug("Mail found");
	}
	
driver.close();





	
		}
		}
	
}



//======================================================================27.0========================================
public void Email_Validation_with_test_on_Beta_Server_Using_User() throws InterruptedException, IOException  {	
	
	pom007_VW_Script_Tabs script_Tab=new pom007_VW_Script_Tabs(driver);
	pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	
	wait=new WebDriverWait(driver,40);	
/*	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.profileUserName));	
    Thread.sleep(6000);		
	String UserName=driver.findElement(dashboard.profileUserName).getAttribute("value");	
	 log.debug("Profile UseName is: " +UserName);*/
	 
	 
//	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
//	driver.findElement(notifiTab).click();
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	By UserCheckBox=By.xpath("//span[text()='"+UserName+"']/parent::span/child::input");  
	driver.findElement(UserCheckBox).click();
	log.debug("Passing User Name: "+UserName+"under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	WebElement ele1 = driver.findElement(MailClose);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	
	
	driver.findElement(script_Tab.scriptsTab).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("found progress bar");
	Thread.sleep(6000);
	wait.until(ExpectedConditions.elementToBeClickable(script_Tab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(script_Tab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(script_Tab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(script_Tab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(script_Tab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(script_Tab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(script_Tab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(script_Tab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(script_Tab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(script_Tab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");	
	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	String TestName="IVR_Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown = driver.findElement(TestTab.ScriptDropdown); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	WebElement dropdown1 = driver.findElement(notifiTestDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText(NotifiName);
	log.info("Notifier dropdown selected"+NotifiName);	
	
	WebElement dropdown2 = driver.findElement(NotifyPattern); 	 	 
	Select s2 = new Select(dropdown2);	
	s2.selectByVisibleText("notify repeatedly");
	log.info("Notifier pattern:'notify repeatedly' selected from dropdown");	
	driver.findElement(NotifyCheckBox).click();
	log.info("'Notify on return to good' checkbox clicked");
	js.executeScript("window.scrollBy(0,-500)");
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	
	String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	Assert.assertEquals(Associated_Tests,TestName);
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.viewResult));
	driver.findElement(TestTab.viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow located");
	WebElement ele = driver.findElement(dashboard2.TestNowButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.debug("TestNow button clicked");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
//	driver.close();
	log.info("Application Closed");
 //   Thread.sleep(16000);		

	// Create object of SimpleDateFormat class and decide the format
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	 
	 //get current date time with Date()
	 Date date = new Date();
	 
	 // Now format the date
	 String date1= dateFormat.format(date);
	
	 log.debug("Current date is: "+date1);
	
	
	driver=intializeWebDriver();
	driver.get("https://email.empirix.com/owa/#path=/mail");
	log.debug("Empirix WebMail Launched");
	Thread.sleep(9000);
	driver.manage().window().maximize();

	driver.findElement(MailUserName).sendKeys("hsingh@empirix.com");
	log.debug("WebUserName Provided");

	driver.findElement(MailPassword).sendKeys("Empirix444");
	
	log.debug("WebPassword Provided");

	driver.findElement(MailSignInButton).click();
	log.debug("SignIn button clicked");

	Thread.sleep(7000);	
	WebElement ele2 = driver.findElement(SearchMail);
	JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	executor2.executeScript("arguments[0].click();", ele2);
	log.debug("Element Found");
	Thread.sleep(6000);	
	driver.findElement(MailType).sendKeys(TestName);
	
	log.debug("Finding mail againt TestName: "+TestName);
	log.debug("Search mail found");
	Thread.sleep(2000);
//	wait.until(ExpectedConditions.elementToBeClickable(MailSearchButton)).click();
	driver.findElement(MailSearchButton).click();
	log.debug("Search mail Clicked");

	
	if (driver.findElement(mailNotFound).isDisplayed()==true){
		
	log.debug("Mail not found");
	}
	
	else
	{
		
	log.debug("Mail found");
	}
	
 driver.close();
	
	
	
	
	
	
/*	
	//open a mail from the gmail inbox.
	List<WebElement> a = driver.findElements(By.xpath("//span[@id='_ariaId_51.folder']"));
	            System.out.println("count" +a.size());
	            for (int i = 0; i < a.size(); i++) {
	                System.out.println(a.get(i).getText());
	                if (a.get(i).getText().equals(TestName)) //to click on a specific mail.
	                    {                                           
	                    a.get(i).click();
	                    
	                    log.debug("Mail clicked");
	                    
	                    
	                }
	            }
	*/
	
	
	
	
	
	
	
	
}


public void Create_Notifi_using_Email_with_New_Template() throws InterruptedException  {	
	
	wait=new WebDriverWait(driver,30);	
	wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiDeletButton));
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab: "+NotifiName);	
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email: "+UserEmail+" under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	 
//	driver.findElement(notifiEmailTemplateDropdown).click();
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiEmailTemplateDropdown)); 
	WebElement dropdown = driver.findElement(notifiEmailTemplateDropdown); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText("- Create Email Template -");
	log.debug("Select - Create Email Template -' from Email Template dropdown");
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	String TemplateName="Automation_Test_Template_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(notifyTemplateName).sendKeys(TemplateName);
	log.debug("TemplateName passed");
	driver.findElement(notifyTemplateSubject).sendKeys("VoiceWatch $notification_severity Alert: $test_name reports $summary");
	log.debug("Subject Passed");
	driver.findElement(notifyTemplateBody).sendKeys("VoiceWatch $notification_severity Alert\r\n" + 
			"\r\n" + 
			"Test Name: $test_name\r\n" + 
			"\r\n" +
			"Customer Name: $client_name \r\n" + 
			"\r\n" +
			"Call Result Link: $call_result_link \r\n" + 
			"\r\n" +
			"Test Start Time: $test_start_time\r\n" +
			"\r\n" +
			"Test End Time: $test_end_time\r\n" + 
			"\r\n" + 
			"failures");
	log.debug("Body Passed");
	Thread.sleep(500);
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	

	
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertFalse(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	
	 js.executeScript("window.scrollBy(0,+500)");		
	
//	driver.findElement(notifiSaveEmailTempButton27).click();
	 
	 Thread.sleep(1000);
	 
	 driver.findElement(notifiSaveEmailTempButton).click();
	 
	 
	
	/*WebElement ele32 = driver.findElement(notifiSaveEmailTempButton27);
	JavascriptExecutor executor32 = (JavascriptExecutor)driver;
	executor32.executeScript("arguments[0].click();", ele32);*/

	
	log.debug("Save Creted Template");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.debug("Progress page loading");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");	
	log.debug("Verified that Email Template: "+TemplateName+" created successfully");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
    wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ " created Successfully");	
	/*driver.findElement(notifiDeleteEmailTempButton).click();
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Inprogress");
	
	Assert.assertTrue(driver.findElement(notifiEmailTemplateDropdown).getText().contains("Default Email Template"));
	log.debug("Verified that 'Default Email Template' dropdown selected if we delete newly created template");	
	log.debug("Verified that Email Template: "+TemplateName+" deleted successfully");	*/
	driver.findElement(notifiFilter).clear();
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstActiveSearch)).click();
	driver.findElement(notifiFirstActiveSearch).click();
	log.debug("Click first search notify");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");
	 wait.until(ExpectedConditions.presenceOfElementLocated(notifiDeletButton));
	driver.findElement(notifiDeletButton).click();
/*	WebElement ele1 = driver.findElement(notifiDeletButton);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);*/
	
	
	
	log.debug("Clicked selected notify as delete");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");	
	driver.navigate().refresh();
	log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
public void Create_Notifi_with_New_Template_using_SaveAs_button() throws InterruptedException  {	
	wait=new WebDriverWait(driver,30);	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification (+) icon clicked");	
	wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
  //  String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	Thread.sleep(1000);
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab: "+NotifiName);	
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email: "+UserEmail+" under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	
	 js.executeScript("window.scrollBy(0,500)");	
//	 js.executeScript("window.scrollBy(0,500)");	
	 
//	wait.until(ExpectedConditions.presenceOfElementLocated(notifiEmailTemplateDropdown)); 
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveASbutton));
	driver.findElement(notifiSaveASbutton).click();
	log.debug("Save As button clicked to create new template");		
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	String TemplateName="Automation_Test_Template_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(notifyTemplateName).sendKeys(TemplateName);
	log.debug("TemplateName passed");
	driver.findElement(notifyTemplateSubject).sendKeys("VoiceWatch $notification_severity Alert: $test_name reports $summary");
	log.debug("Subject Passed");
	driver.findElement(notifyTemplateBody).sendKeys("VoiceWatch $notification_severity Alert\r\n" + 
			"\r\n" + 
			"Test Name: $test_name\r\n" + 
			"\r\n" +
			"Customer Name: $client_name \r\n" + 
			"\r\n" +
			"Call Result Link: $call_result_link \r\n" + 
			"\r\n" +
			"Test Start Time: $test_start_time\r\n" +
			"\r\n" +
			"Test End Time: $test_end_time\r\n" + 
			"\r\n" + 
			"$failures");
	log.debug("Body Passed");
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertFalse(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	
	driver.findElement(notifiSaveEmailTempButton).click();
	log.debug("Save Creted Template");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.debug("Progress page loading");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");	
	log.debug("Verified that Email Template: "+TemplateName+" created successfully");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
    wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ " created Successfully");	
	driver.findElement(notifiFilter).clear();
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
//	wait.until(ExpectedConditions.presenceOfElementLocated(notifiFirstActiveSearch));
	driver.findElement(notifiFirstActiveSearch).click();
	log.debug("Click first search notify");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
//	driver.findElement(notifiDeletButton).click();
	log.debug("Clicked selected notify as delete");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");	
	driver.navigate().refresh();
	log.debug("Notfication: "+NotifiName+" Delete Successfully");
}

public void Delete_Email_Template() throws InterruptedException  {	
	wait=new WebDriverWait(driver,30);	
	/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
    Thread.sleep(6000);		
	wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.profileEmail));
	String UserEmail=driver.findElement(dashboard.profileEmail).getAttribute("value");		
	 log.debug("Profile Email is: " +UserEmail);	
//	driver.findElement(notifiTab).click();
*/	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab: "+NotifiName);	
	driver.findElement(notifiEmailField).sendKeys(UserEmail);
	log.debug("Passing Email: "+UserEmail+" under Notification tab");
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,+500)");	
	// js.executeScript("window.scrollBy(0,-500)");		 
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiEmailTemplateDropdown)); 
	driver.findElement(notifiSaveASbutton).click();
	log.debug("Save As button clicked to create new template");		
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	String TemplateName="Automation_Test_Template_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(notifyTemplateName).sendKeys(TemplateName);
	log.debug("TemplateName passed");
	driver.findElement(notifyTemplateSubject).sendKeys("VoiceWatch $notification_severity Alert: $test_name reports $summary");
	log.debug("Subject Passed");
	driver.findElement(notifyTemplateBody).sendKeys("VoiceWatch $notification_severity Alert\r\n" + 
			"\r\n" + 
			"Test Name: $test_name\r\n" + 
			"\r\n" +
			"Customer Name: $client_name \r\n" + 
			"\r\n" +
			"Call Result Link: $call_result_link \r\n" + 
			"\r\n" +
			"Test Start Time: $test_start_time\r\n" +
			"\r\n" +
			"Test End Time: $test_end_time\r\n" + 
			"\r\n" + 
			"$failures");
	log.debug("Body Passed");
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertFalse(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	
	driver.findElement(notifiSaveEmailTempButton).click();
	log.debug("Save Creted Template");
	 js.executeScript("window.scrollBy(0,-500)");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.debug("Progress page loading");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");	
	log.debug("Verified that Email Template: "+TemplateName+" created successfully");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
    wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	 js.executeScript("window.scrollBy(0,+500)");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ " created Successfully");	
	 js.executeScript("window.scrollBy(0,+500)");	
	driver.findElement(notifiDeleteEmailTempButton).click();
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert accepted");	
	driver.switchTo().alert().accept();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Inprogress");
	js.executeScript("window.scrollBy(0,+500)");		
	Assert.assertTrue(driver.findElement(notifiEmailTemplateDropdown).getText().contains("Default Email Template"));
	log.debug("Verified that 'Default Email Template' dropdown selected if we delete newly created template");	
	log.debug("Verified that Email Template: "+TemplateName+" deleted successfully");	
	driver.findElement(notifiFilter).clear();
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiFirstActiveSearch));
	driver.findElement(notifiFirstActiveSearch).click();
	log.debug("Click first search notify");
	wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
//	wait.until(ExpectedConditions.presenceOfElementLocated(notifiDeletButton));
//	 driver.findElement(notifiDeletButton).click();
	log.debug("Clicked selected notify as delete");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");	
	driver.navigate().refresh();
	log.debug("Notfication: "+NotifiName+" Delete Successfully");
}

//====================================================================================================

// Build 26.2

/*public void Notify_Assign_To_Test_with_def_Template_Using_User() throws InterruptedException  {	
	pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
	wait=new WebDriverWait(driver,30);	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.profileUserName));	
    Thread.sleep(6000);		
	String UserName=driver.findElement(dashboard.profileUserName).getAttribute("value");	
	 log.debug("Profile UseName is: " +UserName);	    
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);
	
	By UserCheckBox=By.xpath("//span[text()='"+UserName+"']/parent::span/child::input");    		
	
	driver.findElement(UserCheckBox).click();		
	log.debug("Selecting User from checkbox"+UserName);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 log.debug("Scrolling Up");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	WebElement ele1 = driver.findElement(MailClose);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
//	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");	
	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	String TestName="Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown = driver.findElement(TestTab.ScriptDropdown); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	WebElement dropdown1 = driver.findElement(notifiTestDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText(NotifiName);	
	js.executeScript("window.scrollBy(0,-500)");
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 js1.executeScript("window.scrollBy(0,+500)");	
	 String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	Assert.assertEquals(Associated_Tests,TestName);
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	if (driver.findElements(TestTab.deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
    log.info("Delete button clicked");    		
    wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
    log.info("Delete Test Successfully");	    
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("delete Test successfully");
	driver.findElement(ScriptTab.scriptsTab).click();
    log.info("Navigate back to script tab");
    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));   
   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
   log.info("Search above created Script using filter " +ScriptName);
    wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
   log.info("Just retrived the deatils of above created script " +ScriptName);
   Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
   log.info("Verified that Run button is enabled");
   Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
   log.info("Verified that Run button contain 'Run Test' text");
   driver.findElement(ScriptTab.selectdropdownn).click();
   log.info("Verified that select dropdown");	
  driver.findElement(ScriptTab.clickdeletedropdown).click();	
  log.info("Verified that Clicked delete button");	
//driver.findElement(ScriptTab.deleteAllData).click();	
  WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
log.info("Verified that select delete all data");
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
log.info("delete Test successfully");
driver.findElement(notifiTab).click();
log.debug("Notification Tab clicked");	
driver.findElement(notifiFilter).sendKeys(NotifiName);
log.debug("Retriving Notification");
driver.findElement(notifiFirstSearch).click();
log.debug("Click first search notify");
wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
log.debug("Clicked selected notify as delete");
wait.until(ExpectedConditions.alertIsPresent());
log.info("Alert is coming");
driver.switchTo().alert().accept();
log.info("Alert accepted");	
driver.navigate().refresh();
log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
	driver.navigate().refresh();
}
*/
//===============================================================================================================================

// Build 27.0

public void Notify_Assign_To_Test_with_def_Template_Using_User() throws InterruptedException  {	
	pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
	wait=new WebDriverWait(driver,30);	
	wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
	log.debug("Notification icon clicked");	
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled under Notification tab");
	Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled under Notification tab");		
//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.debug("Verified that 'Delete' button disabled under Notification tab");	
	wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
	Thread.sleep(1000);
	driver.findElement(notifiNameField).sendKeys(NotifiName);
	log.debug("Passing Random notification name under Notification tab"+NotifiName);	
	By UserCheckBox=By.xpath("//span[text()='"+UserName+"']/parent::span/child::input");    		
	
	driver.findElement(UserCheckBox).click();		
	log.debug("Selecting User from checkbox"+UserName);
	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 log.debug("Scrolling Up");
	wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ "Created Successfully");
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	WebElement ele1 = driver.findElement(MailClose);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
//	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));		
	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);		
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");		
	// Script Drop Down	
	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
	  Select ScriptSelection = new Select(scriptDropdown);        
	  ScriptSelection.selectByIndex(0);
	  log.debug("Verified that IVR Script selected from dropdown");   
	  driver.findElement(ScriptTab.scriptGoBut).click();  
	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
	  driver.findElement(ScriptTab.e164disabled).click();
	 log.debug("Verified that e164disabled");	
	
	
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(ScriptTab.numberToCalle164disabled).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");	
	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	
	WebElement testDropdown = driver.findElement(TestTab.testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");
	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testGoBuT)).click();
//	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");	
	
	
	String TestName="IVR_Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown = driver.findElement(TestTab.ScriptDropdown); 	 	 
	Select s = new Select(dropdown);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	WebElement dropdown1 = driver.findElement(notifiTestDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText(NotifiName);	
	js.executeScript("window.scrollBy(0,-500)");
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 js1.executeScript("window.scrollBy(0,+500)");	
	 String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	Assert.assertEquals(Associated_Tests,TestName);
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	if (driver.findElements(TestTab.deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
    log.info("Delete button clicked");    		
    wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
    log.info("Delete Test Successfully");	    
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("delete Test successfully");
	driver.findElement(ScriptTab.scriptsTab).click();
    log.info("Navigate back to script tab");
    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));   
   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
   log.info("Search above created Script using filter " +ScriptName);
    wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
   log.info("Just retrived the deatils of above created script " +ScriptName);
   Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
   log.info("Verified that Run button is enabled");
   Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
   log.info("Verified that Run button contain 'Run Test' text");
   driver.findElement(ScriptTab.selectdropdownn).click();
   log.info("Verified that select dropdown");	
  driver.findElement(ScriptTab.clickdeletedropdown).click();	
  log.info("Verified that Clicked delete button");	
//driver.findElement(ScriptTab.deleteAllData).click();	
  WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
log.info("Verified that select delete all data");
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
log.info("delete Test successfully");
driver.findElement(notifiTab).click();
log.debug("Notification Tab clicked");	
driver.findElement(notifiFilter).sendKeys(NotifiName);
log.debug("Retriving Notification");
driver.findElement(notifiFirstSearch).click();
log.debug("Click first search notify");
wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
log.debug("Clicked selected notify as delete");
wait.until(ExpectedConditions.alertIsPresent());
log.info("Alert is coming");
driver.switchTo().alert().accept();
log.info("Alert accepted");	
driver.navigate().refresh();
log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
}

//============================================================================================================================



public void Notify_Assign_To_Test_with_New_Template_Using_User() throws InterruptedException  {	
	pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
	
	wait=new WebDriverWait(driver,30);	
	/*wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	log.debug("Profile dropdown clicked");	
	wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
    log.debug("Profile Tab clicked");	
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.profileUserName));	
    Thread.sleep(6000);		
	String UserName=driver.findElement(dashboard.profileUserName).getAttribute("value");	
	 log.debug("Profile UseName is: " +UserName);	   */
	 By UserCheckBox=By.xpath("//span[text()='"+UserName+"']/parent::span/child::input"); 
	
//	 driver.findElement(notifiTab).click();
	 wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
		log.debug("Notification Tab clicked");
		wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
	//	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();	
		log.debug("Notification (+) icon clicked");	
		wait.until(ExpectedConditions.presenceOfElementLocated(notifiSaveButton));
		Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
		log.debug("Verified that 'Save' button disabled under Notification tab");
		Assert.assertFalse(driver.findElement(notifiDeletButton).isEnabled());
		log.debug("Verified that 'Delete' button disabled under Notification tab");		
	//	String NotifiName="Notify_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.debug("Verified that 'Delete' button disabled under Notification tab");	
		wait.until(ExpectedConditions.elementToBeClickable(notifiNameField));
		Thread.sleep(1000);
		driver.findElement(notifiNameField).sendKeys(NotifiName);
		log.debug("Passing Random notification name under Notification tab"+NotifiName);	
		driver.findElement(UserCheckBox).click();
		log.debug("Passing User Name: "+UserName+"under Notification tab");
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,-500)");	
		 js.executeScript("window.scrollBy(0,-500)");		 
	 
	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiEmailTemplateDropdown)); 
	WebElement dropdown1 = driver.findElement(notifiEmailTemplateDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByVisibleText("- Create Email Template -");
	log.debug("Select - Create Email Template -' from Email Template dropdown");
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	String TemplateName="Automation_Testing_Template_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(notifyTemplateName).sendKeys(TemplateName);
	log.debug("TemplateName passed");
	driver.findElement(notifyTemplateSubject).sendKeys("VoiceWatch $notification_severity Alert: $test_name reports $summary");
	log.debug("Subject Passed");
	driver.findElement(notifyTemplateBody).sendKeys("VoiceWatch $notification_severity Alert\r\n" + 
			"\r\n" + 
			"Test Name: $test_name\r\n" + 
			"\r\n" +
			"Customer Name: $client_name \r\n" + 
			"\r\n" +
			"Call Result Link: $call_result_link \r\n" + 
			"\r\n" +
			"Test Start Time: $test_start_time\r\n" +
			"\r\n" +
			"Test End Time: $test_end_time\r\n" + 
			"\r\n" + 
			"$failures");
	log.debug("Body Passed");
	
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
//	Assert.assertFalse(driver.findElement(notifiEditEmailTempButton).isEnabled());
//	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");
	
	driver.findElement(notifiSaveEmailTempButton).click();
	log.debug("Save Creted Template");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.debug("Progress page loading");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isDisplayed());
	log.debug("Verified that 'Delete' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiDeleteEmailTempButton).isEnabled());
	log.debug("Verified that 'Delete' button disabled while select create new Email template from dropdown");	
	Assert.assertTrue(driver.findElement(notifiSaveEmailTempButton).isDisplayed());
	log.debug("Verified that 'Save Email Template' button displayed while select create new Email template from dropdown");
	Assert.assertFalse(driver.findElement(notifiSaveEmailTempButton).isEnabled());
	log.debug("Verified that 'Save Email Template' button disabled while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isDisplayed());
	log.debug("Verified that 'Edit' button displayed while select create new Email template from dropdown");
	Assert.assertTrue(driver.findElement(notifiEditEmailTempButton).isEnabled());
	log.debug("Verified that 'Edit' button disabled while select create new Email template from dropdown");	
	log.debug("Verified that Email Template: "+TemplateName+" created successfully");	
	 js.executeScript("window.scrollBy(0,-500)");	
	 js.executeScript("window.scrollBy(0,-500)");	
    wait.until(ExpectedConditions.elementToBeClickable(notifiSaveButton)).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	Assert.assertFalse(driver.findElement(notifiSaveButton).isEnabled());
	log.debug("Verified that 'Save' button disabled after creating notification");
	Assert.assertFalse(driver.findElement(notifiSmallIcon).isDisplayed());
	log.debug("Verified that 'Choose either user or enter email addresses' icon is not displaying");
	Assert.assertTrue(driver.findElement(notifiDeletButton).isEnabled());
	log.debug("Verified that 'Delete' button enabled after creating notification");
	Assert.assertTrue(driver.findElement(notifiMailButton).isEnabled());
	log.debug("Verified that 'Mail' button enabled after creating notification");
	log.debug("Verified that Notification:"+NotifiName+ " created Successfully");	
	
	driver.findElement(notifiMailButton).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.visibilityOfElementLocated(MailAlert));
	log.info("Mail alert displayed");
	Assert.assertEquals(driver.findElement(MailText).getText().contains("Test email sent."),true);
	log.info("Verified that popup 'Test email sent' text appeared on popup");
	wait.until(ExpectedConditions.elementToBeClickable(MailClose)).click();
	log.debug("Notification filter clicked");
	driver.findElement(ScriptTab.scriptsTab).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
    driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
     Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
	 wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("Sync issue so waiting just ten Second");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain Run Test text");		
	driver.findElement(homePage.testTab).click();
	log.info("Navigate to Test Tab");

	wait.until(ExpectedConditions.elementToBeClickable(TestTab.testCreateplusbutton)).click();
	
//	driver.findElement(TestTab.testCreateplusbutton).click();	
	log.info("Clicked Test Create icon");
	String TestName="IVR_Test_"+ScriptName;
	driver.findElement(TestTab.testNameField).sendKeys(TestName);
	log.info("Test Name Passing");
	WebElement dropdown2 = driver.findElement(TestTab.ScriptDropdown); 	 	 
	Select s = new Select(dropdown2);	
	s.selectByVisibleText(ScriptName);	
	log.info("clicked above search script");   
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar while click drop down");
	WebElement dropdown3 = driver.findElement(notifiTestDropdown); 	 	 
	Select s2 = new Select(dropdown3);	
	s2.selectByVisibleText(NotifiName);	
	 js.executeScript("window.scrollBy(0,-500)");
	driver.findElement(TestTab.saveButtonTestTab).click();
	log.info("clicked above Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("Progressbar after click save button");
    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
    log.info("Verified that Run button enabled");
    driver.findElement(notifiTab).click();
	log.debug("Navigate ack to notification Tab");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFilter));
	driver.findElement(notifiFilter).sendKeys(NotifiName);
	log.debug("Retriving Notification");
	wait.until(ExpectedConditions.elementToBeClickable(notifiFirstSearch)).click();
	log.debug("Click first search notify");
	JavascriptExecutor js1 = (JavascriptExecutor) driver;
	 js1.executeScript("window.scrollBy(0,+500)");		
	String Associated_Tests=driver.findElement(By.linkText(TestName)).getText();
	 log.debug("Associted Test: "+Associated_Tests);
	Assert.assertEquals(Associated_Tests,TestName);
	log.debug("Associated Tests: "+TestName+ "Created successfully" );
	driver.findElement(By.linkText(TestName)).click();
	log.debug("Clicked Assosited Test with notification and Navigate to test tab");
	if (driver.findElements(TestTab.deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
	
	
	wait.until(ExpectedConditions.elementToBeClickable(TestTab.deleteButton)).click();
    log.info("Delete button clicked");    		
    wait.until(ExpectedConditions.elementToBeClickable(TestTab.yesDeleteButton)).click();	    
    log.info("Delete Test Successfully");	    
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar2));
	log.info("delete Test successfully");
	driver.findElement(ScriptTab.scriptsTab).click();
    log.info("Navigate back to script tab");
    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));   
   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
   log.info("Search above created Script using filter " +ScriptName);
   log.info("Sync issue so waiting just nine second");
   wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
   log.info("Just retrived the deatils of above created script " +ScriptName);
   Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
   log.info("Verified that Run button is enabled");
   Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
   log.info("Verified that Run button contain 'Run Test' text");
   driver.findElement(ScriptTab.selectdropdownn).click();
   log.info("Verified that select dropdown");	
  driver.findElement(ScriptTab.clickdeletedropdown).click();	
  log.info("Verified that Clicked delete button");	
//driver.findElement(ScriptTab.deleteAllData).click();	
  WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
log.info("Verified that select delete all data");
wait.until(ExpectedConditions.alertIsPresent());
driver.switchTo().alert().accept();
log.info("delete Test successfully");
driver.findElement(notifiTab).click();
log.debug("Notification Tab clicked");	
driver.findElement(notifiFilter).sendKeys(NotifiName);
log.debug("Retriving Notification");
driver.findElement(notifiFirstSearch).click();
log.debug("Click first search notify");
wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
log.debug("Clicked selected notify as delete");
wait.until(ExpectedConditions.alertIsPresent());
log.info("Alert is coming");
driver.switchTo().alert().accept();
log.info("Alert accepted");	
driver.navigate().refresh();
log.debug("Notfication: "+NotifiName+" Delete Successfully");
}
	driver.navigate().refresh();
}

public void Notifydeletion() throws InterruptedException {
	
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(homePage.notificationsTab)).click();
			log.debug("Notification Tab clicked");	
		driver.navigate().refresh();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		wait.until(ExpectedConditions.elementToBeClickable(notifiLabel));
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']"));
	 for (WebElement element : elements) {
	    System.out.println(element.getText()); 
if (element.getText().contains("Notify_")) {
	
	element.click();

	wait.until(ExpectedConditions.elementToBeClickable(notifiDeletButton)).click();
		log.debug("Clicked selected notify as delete");
		wait.until(ExpectedConditions.alertIsPresent());
		log.info("Alert is coming");
		driver.switchTo().alert().accept();
		log.info("Alert accepted");	
		log.debug("Delete Successfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
		
	}	else {
		log.debug("Notify not found");
	} 
	   
	 }
	
	 }
	

public void EmailTemplatedeletion() throws InterruptedException {
	
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(notifiTab)).click();
	log.debug("Notification Tab clicked");		
	wait.until(ExpectedConditions.elementToBeClickable(notifiPlusIcon)).click();
	log.debug("Notification plus icon clicked");
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,+500)");	
	 js.executeScript("window.scrollBy(0,+500)");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(notifiEmailTemplateDropdown)); 
	WebElement dropdown1 = driver.findElement(notifiEmailTemplateDropdown); 	 	 
	Select s1 = new Select(dropdown1);	
	s1.selectByIndex(0);
	log.debug("Select Email Template");
	driver.findElement(notifiDeleteEmailTempButton).click();
	log.debug("delete email template");
	log.debug("Select - Create Email Template -' from Email Template dropdown");
	

	
	
}
}

