package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import resources.basePropertiesFile;

public class pom002_VW_Home_Page extends basePropertiesFile{
	private static Logger log =LogManager.getLogger(pom002_VW_Home_Page.class.getName());

	public WebDriver driver;
	
    By dashBoardTab=By.linkText("Dashboard");
    By alertsTab=By.linkText("Alerts");
    By testTab=By.linkText("Tests");
    By tagTab=By.linkText("Tags");
    By scriptsTab=By.linkText("Scripts");
    By variablesTab=By.linkText("Variables");
    By hammersTab=By.linkText("Hammers");
    By notificationsTab=By.linkText("Notifications");
    By usersTab=By.linkText("Users");
    By clientsTab=By.linkText("Clients");
    By auditTab=By.linkText("Audit");
    By adminsTab=By.linkText("Admin");
    By ProfileDropdown=By.xpath("//*[@class='dropdown-toggle ng-binding']");
    By headerContactUs=By.xpath("//*[@ng-click='contact()']");
    By headerHelp=By.xpath("//*[@ng-click='help()']");
    By headerTimeInfo=By.xpath("//*[@class='badge pull-right timeInfo ng-binding']");
    By headerEmpirixLogo=By.xpath("//*[@src='/app/img/empirix.gif']");
    By headerEmpirixLebel=By.xpath("//*[@class='text-uppercase']");
    By headerApplicationName=By.xpath("//*[@data-i18n='_voiceWatch_']");
    By Profile=By.xpath("//*[@data-i18n='_profile_']");
    By client=By.xpath("//*[@data-i18n='_client_']");
    By SwitchTOHODQA=By.xpath("//*[@data-i18n='_switchToHammerOnDemandQA_']");
    By SwitchTOHODpref=By.xpath("//*[@data-i18n='_switchToHammerOnDemandPerformance_']");
    By Logout=By.xpath("//*[@data-i18n='_logout_']");
    By SelectEngLang=By.xpath("//div[contains(text(),'English')]");
    By SelectJapLang=By.xpath("//a[contains(text(),'Japanese')]");
    
    By footerBackToTop=By.xpath("//*[@data-i18n='_backToTop_']");
    By footerVersion=By.xpath("//*[@data-i18n='_version_']");
    By footerVersionNumber=By.xpath("//*[@ng-click='openNewFeatureModal();']");     
    By footerEmpirixLebel=By.xpath("//*[@class='text-capitalize']");
   
    
    		
    
    
    
	//ContractorA
	
	public pom002_VW_Home_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
//=========================================================================================================================================	
	
	
	
public void Modified2Tab_Validation() {	
		
		log.debug("VoiceWatch Dashboard Page verification Started");
        
//		String Role=pom010_VW_Notification_Tab.UserPermissionLevel;

		String Role=pom010_VW_Notification_Tab.UserPermissionLevel;
		String Name=pom010_VW_Notification_Tab.UserName;
		
			log.debug("Tab Validation as Role: "+Role);	
			Assert.assertTrue(driver.findElement(dashBoardTab).isDisplayed());
			log.debug("Verified that 'Dashboard Tab' appeared on the VoiceWatch dashoboard As: "+Role);	
			Assert.assertTrue(driver.findElement(dashBoardTab).isEnabled());
			log.debug("Verified that 'Dashboard Tab' enabled on the VoiceWatch dashoboard As: "+Role);	
			
			Assert.assertTrue(driver.findElement(alertsTab).isDisplayed());
			log.debug("Verified that 'Alerts Tab' appeared on the VoiceWatch dashboard As: "+Role);
			Assert.assertTrue(driver.findElement(alertsTab).isEnabled());
			log.debug("Verified that 'Alerts Tab' enabled on the VoiceWatch dashboard As: "+Role);	
			Assert.assertFalse(driver.getCurrentUrl().contains("alerts"));
			log.debug("Verified that 'Alerts Tab' not selected on the VoiceWatch dashboard As: "+Role);
			

			Assert.assertTrue(driver.findElement(testTab).isDisplayed());
			log.debug("Verified that 'Tests Tab' appeared on the VoiceWatch dashboard As: "+Role);	
			Assert.assertTrue(driver.findElement(testTab).isEnabled());
			log.debug("Verified that 'Tests Tab' enabled on the VoiceWatch dashboard As: "+Role);	
			Assert.assertFalse(driver.getCurrentUrl().contains("tests"));
			log.debug("Verified that 'Tests Tab' not selected on the VoiceWatch dashboard As "+Role);
			
			
			if (Role.equalsIgnoreCase("User"))
			{			
			Assert.assertTrue(driver.findElements(tagTab).isEmpty());
			log.debug("Verified that 'Tag Tab' is not avaiable on the VoiceWatch dashboard while login As "+Role);
			
			} 				
			if (Role.equalsIgnoreCase("Client_Developer")||(Role.equalsIgnoreCase("ClientEnhanced User")||(Role.equalsIgnoreCase("Customer Admin")))) {
				
			  
				Assert.assertTrue(driver.findElement(tagTab).isDisplayed());
				log.debug("Verified that 'Tag Tab' appeared on the VoiceWatch dashboard As: "+Role);	
				Assert.assertTrue(driver.findElement(tagTab).isEnabled());
				log.debug("Verified that 'Tests Tab' enabled on the VoiceWatch dashboard As: "+Role);	
				Assert.assertFalse(driver.getCurrentUrl().contains("Tag"));
				log.debug("Verified that 'Tag' not selected on the VoiceWatch dashboard As: "+Role);			
			}
			
			
			if (Role.equalsIgnoreCase("User"))
			{			
			Assert.assertTrue(driver.findElements(scriptsTab).isEmpty());
			log.debug("Verified that 'Script Tab' is not avaiable on the VoiceWatch dashboard while login AS: "+Role);
			
			} else if (Role.equalsIgnoreCase("Developer")||(Role.equalsIgnoreCase("Enhanced User")||(Role.equalsIgnoreCase("Customer Admin")))) {
				
			  
				Assert.assertTrue(driver.findElement(scriptsTab).isDisplayed());
				log.debug("Verified that 'Script Tab' appeared on the VoiceWatch dashboard As: "+Role);	
				Assert.assertTrue(driver.findElement(scriptsTab).isEnabled());
				log.debug("Verified that 'script Tab' enabled on the VoiceWatch dashboard As: "+Role);	
				Assert.assertFalse(driver.getCurrentUrl().contains("Script"));
				log.debug("Verified that 'Script' not selected on the VoiceWatch dashboard As: "+Role);
			}
			
			Assert.assertTrue(driver.findElement(variablesTab).isDisplayed());
			log.debug("Verified that 'Variables Tab' appeared on the VoiceWatch dashboard As: "+Role);
			Assert.assertTrue(driver.findElement(variablesTab).isEnabled());
			log.debug("Verified that 'Variables Tab' enabled on the VoiceWatch dashboard As: "+Role);
			Assert.assertFalse(driver.getCurrentUrl().contains("variables"));
			log.debug("Verified that 'Variable Tab' not selected on the VoiceWatch dashboard As: "+Role);
			
					
			
			
			Assert.assertTrue(driver.findElements(hammersTab).isEmpty());
			log.debug("Verified that 'Hammer Tab' is not avaiable on the VoiceWatch dashboard while login As: "+Role);
			
			Assert.assertTrue(driver.findElement(notificationsTab).isDisplayed());
			log.debug("Verified that 'Notifications Tab' appeared on the VoiceWatch dashboard while login As: "+Role);
			Assert.assertTrue(driver.findElement(notificationsTab).isEnabled());
			log.debug("Verified that 'Notifications Tab' enabled on the VoiceWatch dashboard while login As: "+Role);
			Assert.assertFalse(driver.getCurrentUrl().contains("notifi"));
			log.debug("Verified that 'Notifications Tab' not selected on the VoiceWatch dashboard while login As: "+Role);	
			
			
			if (Role.equalsIgnoreCase("User"))
			{			
			Assert.assertTrue(driver.findElements(usersTab).isEmpty());
			log.debug("Verified that 'User Tab' is not avaiable on the VoiceWatch dashboard while login As: "+Role);
			
			} else if (Role.equalsIgnoreCase("Developer")||(Role.equalsIgnoreCase("Enhanced User")||(Role.equalsIgnoreCase("Customer Admin")))) {
				
			  
				Assert.assertTrue(driver.findElement(usersTab).isDisplayed());
				log.debug("Verified that 'User Tab' appeared on the VoiceWatch dashboard while login As: "+Role);
				Assert.assertTrue(driver.findElement(usersTab).isEnabled());
				log.debug("Verified that 'User Tab' enabled on the VoiceWatch dashboard while login As: "+Role);
				Assert.assertFalse(driver.getCurrentUrl().contains("User"));
				log.debug("Verified that 'User Tab' not selected on the VoiceWatch dashboard");			
			}
					
			
		if (Role.equalsIgnoreCase("User")&& pom010_VW_Notification_Tab.UserName.contains("Pt"))
					
		{
			
			Assert.assertTrue(driver.findElement(clientsTab).isDisplayed());
			log.debug("Verified that 'Client Tab' appeared on the VoiceWatch dashboard while login As: "+Role);
			Assert.assertTrue(driver.findElement(clientsTab).isEnabled());
			log.debug("Verified that 'Client Tab' enabled on the VoiceWatch dashboard while login As: "+Role);
			
			
		} else if (Role.equalsIgnoreCase("User")&& pom010_VW_Notification_Tab.UserName.contains("Cnt")||(Role.equalsIgnoreCase("User")&& pom010_VW_Notification_Tab.UserName.contains("Patd")))
				{		
				
		Assert.assertTrue(driver.findElements(clientsTab).isEmpty());
		log.debug("Verified that 'Clients Tab' is not avaiable on the VoiceWatch dashboard while login AS: "+Role);
					
		}
					
			if (Role.equalsIgnoreCase("User")||(Role.equalsIgnoreCase("Enhanced User")||(Role.equalsIgnoreCase("Developer"))))
			{			
			
			Assert.assertTrue(driver.findElements(auditTab).isEmpty());
			log.debug("Verified that 'Audit Tab' is not avaiable on the VoiceWatch dashboard while login AS: "+Role);
			
			}	else if  (Role.equalsIgnoreCase("Customer Admin")) {
				
				Assert.assertTrue(driver.findElement(auditTab).isDisplayed());
				log.debug("Verified that 'Audit Tab' appeared on the VoiceWatch dashboard while login As: "+Role);
				Assert.assertTrue(driver.findElement(auditTab).isEnabled());
				log.debug("Verified that 'Audit Tab' enabled on the VoiceWatch dashboard while login As: "+Role);
				
			}
			
			
			if (Role.equalsIgnoreCase("User")&& pom010_VW_Notification_Tab.UserName.contains("Pt"))
				
			{
				
				Assert.assertTrue(driver.findElement(adminsTab).isDisplayed());
				log.debug("Verified that 'Admin Tab' appeared on the VoiceWatch dashboard while login As: "+Role);
				Assert.assertTrue(driver.findElement(adminsTab).isEnabled());
				log.debug("Verified that 'Admin Tab' enabled on the VoiceWatch dashboard while login As: "+Role);
				
				
			} else if (Role.equalsIgnoreCase("User"))
					{		
					
				Assert.assertTrue(driver.findElements(adminsTab).isEmpty());
				log.debug("Verified that 'Admin Tab' is not avaiable on the VoiceWatch dashboard while login AS: "+Role);
						
			}	
		
}	
	
	
	
	
//=========================================================================================================================================	
	
	
	public void ModifiedTab_Validation() {	
		
		log.debug("VoiceWatch Dashboard Page verification Started");
        
		String Role=pom010_VW_Notification_Tab.UserPermissionLevel;
		System.out.println(Role);
		
		if (Role.equalsIgnoreCase("User"))
				
	     		
	//	if (pom010_VW_Notification_Tab.UserPermissionLevel.equals("User"));
			
		{
			log.debug("Tab Validation as Client User");	
			Assert.assertTrue(driver.findElement(dashBoardTab).isDisplayed());
			log.debug("Verified that 'Dashboard Tab' appeared on the VoiceWatch dashoboard");	
			Assert.assertTrue(driver.findElement(dashBoardTab).isEnabled());
			log.debug("Verified that 'Dashboard Tab' enabled on the VoiceWatch dashoboard");	
			
			Assert.assertTrue(driver.findElement(alertsTab).isDisplayed());
			log.debug("Verified that 'Alerts Tab' appeared on the VoiceWatch dashboard");	
			Assert.assertTrue(driver.findElement(alertsTab).isEnabled());
			log.debug("Verified that 'Alerts Tab' enabled on the VoiceWatch dashboard");	
			Assert.assertFalse(driver.getCurrentUrl().contains("alerts"));
			log.debug("Verified that 'Alerts Tab' not selected on the VoiceWatch dashboard");
			

			Assert.assertTrue(driver.findElement(testTab).isDisplayed());
			log.debug("Verified that 'Tests Tab' appeared on the VoiceWatch dashboard");	
			Assert.assertTrue(driver.findElement(testTab).isEnabled());
			log.debug("Verified that 'Tests Tab' enabled on the VoiceWatch dashboard");	
			Assert.assertFalse(driver.getCurrentUrl().contains("tests"));
			log.debug("Verified that 'Tests Tab' not selected on the VoiceWatch dashboard");
			
			
			
			Assert.assertTrue(driver.findElements(tagTab).isEmpty());
			log.debug("Verified that 'Tag Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");
			
			Assert.assertTrue(driver.findElements(scriptsTab).isEmpty());
			log.debug("Verified that 'Script Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");
			
			Assert.assertTrue(driver.findElement(variablesTab).isDisplayed());
			log.debug("Verified that 'Variables Tab' appeared on the VoiceWatch dashboard");
			Assert.assertTrue(driver.findElement(variablesTab).isEnabled());
			log.debug("Verified that 'Variables Tab' enabled on the VoiceWatch dashboard");
			Assert.assertFalse(driver.getCurrentUrl().contains("variables"));
			log.debug("Verified that 'Variable Tab' not selected on the VoiceWatch dashboard");
			
			Assert.assertTrue(driver.findElements(hammersTab).isEmpty());
			log.debug("Verified that 'Hammer Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");
			
			Assert.assertTrue(driver.findElement(notificationsTab).isDisplayed());
			log.debug("Verified that 'Notifications Tab' appeared on the VoiceWatch dashboard");
			Assert.assertTrue(driver.findElement(notificationsTab).isEnabled());
			log.debug("Verified that 'Notifications Tab' enabled on the VoiceWatch dashboard");
			Assert.assertFalse(driver.getCurrentUrl().contains("notifi"));
			log.debug("Verified that 'Notifications Tab' not selected on the VoiceWatch dashboard");		
			Assert.assertTrue(driver.findElements(usersTab).isEmpty());
			log.debug("Verified that 'Usser Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");
			Assert.assertTrue(driver.findElements(clientsTab).isEmpty());
			log.debug("Verified that 'Clients Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");
			Assert.assertTrue(driver.findElements(auditTab).isEmpty());
			log.debug("Verified that 'Audit Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");			
			Assert.assertTrue(driver.findElements(adminsTab).isEmpty());
			log.debug("Verified that 'Admin Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");
						
		}
       
		
		if (Role.equalsIgnoreCase("Developer")||Role.equalsIgnoreCase("Enhanced User") )

		{
			
			
			
			
        	log.debug("Tab Validation as Client Developer or Enhanced Developer");	
			Assert.assertTrue(driver.findElement(dashBoardTab).isDisplayed());
			log.debug("Verified that 'Dashboard Tab' appeared on the VoiceWatch dashoboard");	
			Assert.assertTrue(driver.findElement(dashBoardTab).isEnabled());
			log.debug("Verified that 'Dashboard Tab' enabled on the VoiceWatch dashoboard");				
			Assert.assertTrue(driver.findElement(alertsTab).isDisplayed());
			log.debug("Verified that 'Alerts Tab' appeared on the VoiceWatch dashboard");	
			Assert.assertTrue(driver.findElement(alertsTab).isEnabled());
			log.debug("Verified that 'Alerts Tab' enabled on the VoiceWatch dashboard");	
			Assert.assertFalse(driver.getCurrentUrl().contains("alerts"));
			log.debug("Verified that 'Alerts Tab' not selected on the VoiceWatch dashboard");
			Assert.assertTrue(driver.findElement(testTab).isDisplayed());
			log.debug("Verified that 'Tests Tab' appeared on the VoiceWatch dashboard");	
			Assert.assertTrue(driver.findElement(testTab).isEnabled());
			log.debug("Verified that 'Tests Tab' enabled on the VoiceWatch dashboard");	
			Assert.assertFalse(driver.getCurrentUrl().contains("tests"));
			log.debug("Verified that 'Tests Tab' not selected on the VoiceWatch dashboard");			
			Assert.assertTrue(driver.findElement(tagTab).isDisplayed());
			log.debug("Verified that 'Tag Tab' appeared on the VoiceWatch dashboard");	
			Assert.assertTrue(driver.findElement(tagTab).isEnabled());
			log.debug("Verified that 'Tests Tab' enabled on the VoiceWatch dashboard");	
			Assert.assertFalse(driver.getCurrentUrl().contains("Tag"));
			log.debug("Verified that 'Tag' not selected on the VoiceWatch dashboard");			
			Assert.assertTrue(driver.findElement(scriptsTab).isDisplayed());
			log.debug("Verified that 'Script Tab' appeared on the VoiceWatch dashboard");	
			Assert.assertTrue(driver.findElement(scriptsTab).isEnabled());
			log.debug("Verified that 'script Tab' enabled on the VoiceWatch dashboard");	
			Assert.assertFalse(driver.getCurrentUrl().contains("Script"));
			log.debug("Verified that 'Script' not selected on the VoiceWatch dashboard");			
			Assert.assertTrue(driver.findElement(variablesTab).isDisplayed());
			log.debug("Verified that 'Variables Tab' appeared on the VoiceWatch dashboard");
			Assert.assertTrue(driver.findElement(variablesTab).isEnabled());
			log.debug("Verified that 'Variables Tab' enabled on the VoiceWatch dashboard");
			Assert.assertFalse(driver.getCurrentUrl().contains("variables"));
			log.debug("Verified that 'Variable Tab' not selected on the VoiceWatch dashboard");			
			Assert.assertTrue(driver.findElements(hammersTab).isEmpty());
			log.debug("Verified that 'Hammer Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");			
			Assert.assertTrue(driver.findElement(notificationsTab).isDisplayed());
			log.debug("Verified that 'Notifications Tab' appeared on the VoiceWatch dashboard");
			Assert.assertTrue(driver.findElement(notificationsTab).isEnabled());
			log.debug("Verified that 'Notifications Tab' enabled on the VoiceWatch dashboard");
			Assert.assertFalse(driver.getCurrentUrl().contains("notifi"));
			log.debug("Verified that 'Notifications Tab' not selected on the VoiceWatch dashboard");
			Assert.assertTrue(driver.findElement(usersTab).isDisplayed());
			log.debug("Verified that 'User Tab' appeared on the VoiceWatch dashboard");
			Assert.assertTrue(driver.findElement(usersTab).isEnabled());
			log.debug("Verified that 'User Tab' enabled on the VoiceWatch dashboard");
			Assert.assertFalse(driver.getCurrentUrl().contains("User"));
			log.debug("Verified that 'User Tab' not selected on the VoiceWatch dashboard");						
			Assert.assertTrue(driver.findElements(clientsTab).isEmpty());
			log.debug("Verified that 'Clients Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");
			Assert.assertTrue(driver.findElements(auditTab).isEmpty());
			log.debug("Verified that 'Audit Tab' is not avaiable on the VoiceWatch dashboard while login AS ClientUser");			
			Assert.assertTrue(driver.findElements(adminsTab).isEmpty());
			log.debug("Verified that 'Admin Tab' not avaiable on the VoiceWatch dashboard");
						
		}
		
			
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//=================================================================================================================================================	
	public void Tab_Validation() {	
		
	log.debug("VoiceWatch Dashboard Page verification Started");
	
	Assert.assertTrue(driver.findElement(dashBoardTab).isDisplayed());
	log.debug("Verified that 'Dashboard Tab' appeared on the VoiceWatch dashoboard");	
	Assert.assertTrue(driver.findElement(dashBoardTab).isEnabled());
	log.debug("Verified that 'Dashboard Tab' enabled on the VoiceWatch dashoboard");	
	/*Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));	
	log.info("Verified that 'Dashboard Tab' not selected on the dashoboard");*/
	

	Assert.assertTrue(driver.findElement(alertsTab).isDisplayed());
	log.debug("Verified that 'Alerts Tab' appeared on the VoiceWatch dashboard");	
	Assert.assertTrue(driver.findElement(alertsTab).isEnabled());
	log.debug("Verified that 'Alerts Tab' enabled on the VoiceWatch dashboard");	
	Assert.assertFalse(driver.getCurrentUrl().contains("alerts"));
	log.debug("Verified that 'Alerts Tab' not selected on the VoiceWatch dashboard");
	
	
	Assert.assertTrue(driver.findElement(testTab).isDisplayed());
	log.debug("Verified that 'Tests Tab' appeared on the VoiceWatch dashboard");	
	Assert.assertTrue(driver.findElement(testTab).isEnabled());
	log.debug("Verified that 'Tests Tab' enabled on the VoiceWatch dashboard");	
	Assert.assertFalse(driver.getCurrentUrl().contains("tests"));
	log.debug("Verified that 'Tests Tab' not selected on the VoiceWatch dashboard");
	
	
	if(driver.findElements(tagTab).size()!=0)
	{
		log.debug("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");		
			
	}
	else
		
	{
		log.debug("Verified that 'Tags Tab' is not appearing on the VoiceWatch dashboard");	
		
	} 

	
	
	
	/*
		if (driver.findElements(tagTab).isEmpty()) {
			
			log.debug("Verified that 'Tags Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");
			
		}  */
	

	if(driver.findElements(scriptsTab).size()!=0)
	{
		log.debug("Verified that 'Scripts Tab' appeared on the VoiceWatch dashboard");		
	}
	else
		
	{
		log.debug("Verified that 'Scripts Tab' is not appearing on the VoiceWatch dashboard");	
		
	} 

	/*if (driver.findElements(scriptsTab).isEmpty()) {
		
		log.debug("Verified that 'Scripts Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Scripts Tab' appeared on the VoiceWatch dashboard");
		
	}*/

	
	Assert.assertTrue(driver.findElement(variablesTab).isDisplayed());
	log.debug("Verified that 'Variables Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(variablesTab).isEnabled());
	log.debug("Verified that 'Variables Tab' enabled on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("variables"));
	log.debug("Verified that 'Variable Tab' not selected on the VoiceWatch dashboard");
	
	if(driver.findElements(hammersTab).size()!=0)
	{
		log.debug("Verified that 'Hammers Tab' appeared on the VoiceWatch dashboard");	
	}
	else
		
	{
		log.debug("Verified that 'Hammers Tab' is not appearing on the VoiceWatch dashboard");
		
	} 	
	
	
	/*if (driver.findElements(hammersTab).isEmpty()) {
		
		log.debug("Verified that 'Hammers Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Hammers Tab' appeared on the VoiceWatch dashboard");
		
	}*/
	
	if (driver.getCurrentUrl().contains("admin_dash")) {	
			
			
			log.debug("Verified that 'Admin Tab' selected on the VoiceWatch application");

						
		}else
		
		{
			log.debug("Verified that 'Dashboard Tab' selected on the VoiceWatch application");
			
		}

	
	
	Assert.assertTrue(driver.findElement(notificationsTab).isDisplayed());
	log.debug("Verified that 'Notifications Tab' appeared on the VoiceWatch dashboard");
	Assert.assertTrue(driver.findElement(notificationsTab).isEnabled());
	log.debug("Verified that 'Notifications Tab' enabled on the VoiceWatch dashboard");
	Assert.assertFalse(driver.getCurrentUrl().contains("notifi"));
	log.debug("Verified that 'Notifications Tab' not selected on the VoiceWatch dashboard");
	
	
	if(driver.findElements(usersTab).size()!=0)
	{
		log.debug("Verified that 'Users Tab' appeared on the VoiceWatch dashboard");	
	}
	else
		
	{
		log.debug("Verified that 'Users Tab' is not appearing on the VoiceWatch dashboard");
		
	} 	
	
	
	
/*if (driver.findElements(usersTab).isEmpty()) {
		
		log.debug("Verified that 'Users Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Users Tab' appeared on the VoiceWatch dashboard");
		
	}
*/
	
		/*
		if (driver.findElements(clientsTab).isEmpty()) {
			
			log.debug("Verified that 'Clients Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Clients Tab' appeared on the VoiceWatch dashboard");
			
		}*/
  
		if(driver.findElements(clientsTab).size()!=0)
		{
			log.debug("Verified that 'Clients Tab' appeared on the VoiceWatch dashboard");
		}
		else
			
		{
			log.debug("Verified that 'Clients Tab' is not appearing on the VoiceWatch dashboard");;
			
		} 	
		
	

		/*
		if (driver.findElements(auditTab).isEmpty()) {
			
			log.debug("Verified that 'Audit Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Audit Tab' appeared on the VoiceWatch dashboard");
			
		}*/
		
		if(driver.findElements(auditTab).size()!=0)
		{
			log.debug("Verified that 'Audit Tab' appeared on the VoiceWatch dashboard");
		}
		else
			
		{
			log.debug("Verified that 'Audit Tab' is not appearing on the VoiceWatch dashboard");
			
		} 	
  
	
	
	
			
	/*	if (driver.findElements(adminsTab).isEmpty()) {
			
			log.debug("Verified that 'Admin Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Admin Tab' appeared on the VoiceWatch dashboard");
			
		}*/
		
		
		if(driver.findElements(adminsTab).size()!=0)
		{
			log.debug("Verified that 'Admin Tab' appeared on the VoiceWatch dashboard");
		}
		else
			
		{
			log.debug("Verified that 'Admin Tab' is not appearing on the VoiceWatch dashboard");
			
		} 	
		
  

		if (driver.getCurrentUrl().contains("admin_dash")) {	
			
			
			log.debug("Verified that 'Admin Tab' selected on the VoiceWatch application");

						
		}else
		
		{
			log.debug("Verified that 'Dashboard Tab' selected on the VoiceWatch application");
			
		}	
		
	}
	
	public void header() {
		
		wait=new WebDriverWait(driver,30);
		Assert.assertTrue(driver.findElement(headerEmpirixLogo).isDisplayed());
		log.debug("Verified that 'Empirix Logo' appeared on top left corner VoiceWatch dashboard");		
		Assert.assertTrue(driver.findElement(headerEmpirixLogo).isEnabled());
		log.debug("Verified that 'Empirix Logo' enabled on top left corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(headerEmpirixLebel).isDisplayed());
		log.debug("Verified that 'Empirix Lebel' appeared on top left corner VoiceWatch dashboard");		
		Assert.assertEquals(driver.findElement(headerEmpirixLebel).getText(), "EMPIRIX");		
		log.debug("Verified that 'EMPIRIX' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		Assert.assertTrue(driver.findElement(headerApplicationName).isDisplayed());		
		log.debug("Verified that 'Application Name' appeared on top left corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(headerApplicationName).getText(), "VoiceWatch");		
		log.debug("Verified that 'VoiceWatch' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		Assert.assertTrue(driver.findElement(ProfileDropdown).isDisplayed());
		log.debug("Verified that dropdown appeared on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(ProfileDropdown).isEnabled());
		log.debug("Verified that dropdwon enabled on top right corner VoiceWatch dashboard");
		driver.findElement(ProfileDropdown).click();
		log.debug("profile drop down clicked");
		
		wait.until(ExpectedConditions.elementToBeClickable(Profile));
		Assert.assertTrue(driver.findElement(Profile).isDisplayed());
		log.debug("Verified that Profile tab appeared while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(Profile).isEnabled());
		log.debug("Verified that Profile tab is enabled while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(Profile).getText(),"Profile");
		log.debug("Verified that Profile text appeared on tab while click in profile dropdown on top right corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(client).isDisplayed());
		log.debug("Verified that Client tab appeared while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(client).isEnabled());
		log.debug("Verified that Client tab is enabled while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(client).getText(),"Client");
		log.debug("Verified that Client text appeared on tab while click in profile dropdown on top right corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(SwitchTOHODQA).isDisplayed());
		log.debug("Verified that Switch to Hammer on Demand QA tab appeared while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(SwitchTOHODQA).isEnabled());
		log.debug("Verified that Switch to Hammer on Demand QA tab is enabled while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(SwitchTOHODQA).getText(),"Switch to Hammer On Demand QA");
		log.debug("Verified that 'Switch to Hammer on Demand QA' text appeared on tab while click in profile dropdown on top right corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(SwitchTOHODpref).isDisplayed());
		log.debug("Verified that Switch to Hammer on Demand Performance tab appeared while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(SwitchTOHODpref).isEnabled());
		log.debug("Verified that Switch to Hammer on Demand Performance tab is enabled while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(SwitchTOHODpref).getText(),"Switch to Hammer On Demand Performance");
		log.debug("Verified that 'Switch to Hammer on Demand Performance' text appeared on tab while click in profile dropdown on top right corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(Logout).isDisplayed());
		log.debug("Verified that logout tab appeared while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(Logout).isEnabled());
		log.debug("Verified that logout tab is enabled while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(Logout).getText(),"Logout");
		log.debug("Verified that logout text appeared on tab while click in profile dropdown on top right corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(SelectEngLang).isDisplayed());
		log.debug("Verified that select English language appeared while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(SelectEngLang).isEnabled());
		log.debug("Verified that select English language is enabled while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(SelectEngLang).getText(),"English");
		log.debug("Verified that select English language appeared on tab while click in profile dropdown on top right corner VoiceWatch dashboard");
		
		Assert.assertTrue(driver.findElement(SelectJapLang).isDisplayed());
		log.debug("Verified that select Japanese language appeared while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(SelectJapLang).isEnabled());
		log.debug("Verified that select Japanese language is enabled while click in profile dropdown on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(SelectJapLang).getText(),"Japanese");
		log.debug("Verified that select Japanese language appeared on tab while click in profile dropdown on top right corner VoiceWatch dashboard");
		
				
		Assert.assertTrue(driver.findElement(headerContactUs).isDisplayed());
		log.debug("Verified that 'ContacUs' appeared on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(headerContactUs).isEnabled());
		log.debug("Verified that 'ContacUs' enabled on top right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(headerContactUs).getText(), "Contact Us");		
		log.debug("Verified that 'Contact Us' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		Assert.assertTrue(driver.findElement(headerHelp).isDisplayed());
		log.debug("Verified that 'Help' appeared on top right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(headerHelp).isEnabled());
		log.debug("Verified that 'help' enabled on top right corner VoiceWatch dashboard");
		
		Assert.assertEquals(driver.findElement(headerHelp).getText(), "Help");		
		log.debug("Verified that 'Help' Text appeared on top left corner VoiceWatch dashboard");	
		
		
	}
	
public void footer() {
		
		Assert.assertTrue(driver.findElement(footerBackToTop).isDisplayed());
		log.debug("Verified that 'BackToTop link' appeared on bottom right corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(footerBackToTop).isEnabled());
		log.debug("Verified that 'BackToTop link' enabled on bottom right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(footerBackToTop).getText(), "Back to top");		
		log.debug("Verified that 'Back to top' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		Assert.assertTrue(driver.findElement(footerVersion).isDisplayed());		
		log.debug("Verified that 'Version' Text appeared on bottom left corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(footerVersion).isEnabled());
		log.debug("Verified that 'Version' test enabled on right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(footerVersion).getText(), "Version");		
		log.debug("Verified that 'Version' Text appeared on top left corner VoiceWatch dashboard");	
		
		
		
		Assert.assertTrue(driver.findElement(footerVersionNumber).isDisplayed());
		log.debug("Verified that 'Version Number' appeared on bottom left corner VoiceWatch dashboard");		
		Assert.assertTrue(driver.findElement(footerVersionNumber).isEnabled());
		log.debug("Verified that 'Version Number' enabled on right corner VoiceWatch dashboard");
		Assert.assertEquals(driver.findElement(footerVersionNumber).getText().contains("26."), true);		
		log.debug("Verified that 'Version contain 26' release version appeared on top left corner VoiceWatch dashboard");	
		
		
		
		Assert.assertTrue(driver.findElement(footerEmpirixLebel).isDisplayed());
		log.debug("Verified that 'Empirix Label' appeared on bottom left corner VoiceWatch dashboard");
		Assert.assertTrue(driver.findElement(footerEmpirixLebel).isEnabled());
		log.debug("Verified that 'Empirix Label' enabled on right corner VoiceWatch dashboard");
		
		Assert.assertEquals(driver.findElement(footerEmpirixLebel).getText(), "Empirix");		
		log.debug("Verified that 'Empirix' Text appeared on top left corner VoiceWatch dashboard");	
		
		
			
	}
	
	
    
public void tagTab() {
		
		if (driver.findElements(tagTab).isEmpty()) {
			
			log.debug("Verified that 'Tags Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Tags Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	}
	
public void scriptsTab() {
	
	if (driver.findElements(scriptsTab).isEmpty()) {
		
		log.debug("Verified that 'Scripts Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Scripts Tab' appeared on the VoiceWatch dashboard");
		
	}

}
	

public void usersTab() {
	
	if (driver.findElements(usersTab).isEmpty()) {
		
		log.debug("Verified that 'Users Tab' is not appearing on the VoiceWatch dashboard");
		
					
	}else
	
	{
		log.debug("Verified that 'Users Tab' appeared on the VoiceWatch dashboard");
		
	}

}
		
	
	public void clientsTab() {
		
		if (driver.findElements(clientsTab).isEmpty()) {
			
			log.debug("Verified that 'Clients Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Clients Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	}	
	
	public void auditTab() {
		
		if (driver.findElements(auditTab).isEmpty()) {
			
			log.debug("Verified that 'Audit Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Audit Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	}
	
	
	public void adminTab() {
		
		if (driver.findElements(adminsTab).isEmpty()) {
			
			log.debug("Verified that 'Admin Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Admin Tab' appeared on the VoiceWatch dashboard");
			
		}
  
	}	
	
	
		
	
		public void hammersTab() {
		
		if (driver.findElements(hammersTab).isEmpty()) {
			
			log.debug("Verified that 'Hammers Tab' is not appearing on the VoiceWatch dashboard");
			
						
		}else
		
		{
			log.debug("Verified that 'Hammers Tab' appeared on the VoiceWatch dashboard");
			
		}
		
		}
		
		public void selectedTab() {
			
			if (driver.getCurrentUrl().contains("admin_dash")) {	
				
				
				log.debug("Verified that 'Admin Tab' selected on the VoiceWatch application");

							
			}else
			
			{
				log.debug("Verified that 'Dashboard Tab' selected on the VoiceWatch application");
				
			}
			
		}


	
}
	
	