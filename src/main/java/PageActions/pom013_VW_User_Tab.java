package PageActions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sonatype.inject.EagerSingleton;
import org.testng.Assert;

import resources.basePropertiesFile;

public class pom013_VW_User_Tab extends basePropertiesFile {
	private static Logger log =LogManager.getLogger(pom013_VW_User_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom002_VW_Home_Page HomeTab=new pom002_VW_Home_Page(driver);
	
	By Userslabel=By.xpath("//span[contains(text(),'Users')]");
	By Userlabel=By.xpath("//h4[contains(text(),'User')]");
	By Userlabelheader=By.xpath("//div[contains(@class,'panel-heading')]");
	By UserPleaseselectlabel=By.xpath("//span[contains(text(),'Please select a user')]");
    By UserCreateBut=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");
    By UserCreateLink=By.linkText("or create a new user");
  
//	By UserCreateLink=By.xpath("//u[contains(text(),'or create a new user')]");
	By UserNameField=By.xpath("//input[@name='username']");
	By UserPassField=By.xpath("//input[@id='PWD']");
	By UserConfirmPassField=By.xpath("//*[@ng-model='user.confirm_pwd']");
	By UserFirstNameField=By.xpath("//input[@name='fname']");
	By UserLastNameField=By.xpath("//input[@name='lname']");
	By UserEmailField=By.xpath("//input[@name='email']");
	By UserAccessDropdown=By.xpath("//*[@ng-model='user.servicesAccessLevel']");
	By UserClientDropdown=By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid ng-scope ng-not-empty ng-valid-required']");
	By UserPartnerDropdown=By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid ng-scope ng-not-empty']");
	By UserPartnerDropdown1=By.xpath("//select[@class='form-control ng-pristine ng-valid ng-scope ng-not-empty ng-touched']");
	
	
	By UserRoleDropdown=By.xpath("//*[@ng-model='user.servicesRole']");
	By UserTimeZoneDropdown=By.xpath("//*[@ng-model='user.preferredTimeZone']");
	By UserPrefLangDropdown=By.xpath("//*[@ng-model='user.preferredLocale']");
	By UserSaveButton=By.xpath("//*[@ng-click='save()']");
	By UserDeleteButton=By.xpath("//*[@ng-click='delete()']");
	By UserProgress=By.xpath("//*[@ng-show='inProcess']");
	By UserQuery=By.xpath("//*[@ng-model='query']");
	By firstsearchUser=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']");
	By ActiveUser=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope testActive']");
    By Subscribelabel=By.xpath("//h4[contains(text(),'Subscribed Notifications')]");
    By UserNameLabel=By.xpath("//span[contains(text(),'User Name')]");
    By PasswordLabel=By.xpath("//*[@data-i18n='_password_']");
    By ConfirmPassLabel=By.xpath("//span[contains(text(),'Confirm Password')]");
    By FirstNameLabel=By.xpath("//span[contains(text(),'First Name')]");
    By LastNameLabel=By.xpath("//span[contains(text(),'Last Name')]");
    By EmailLabel=By.xpath("//span[contains(text(),'Email')]");
    By RoleLabel=By.xpath("//span[contains(text(),'Role')]");
    By TimeZoneLabel=By.xpath("//span[contains(text(),'TimeZone')]");
    By PrefLangLabel=By.xpath("//span[contains(text(),'Preferred Language')]");
    By HODCheckbox=By.xpath("//input[@name='ART']");
    By HODPrefCheckbox=By.xpath("//input[@name='HammerOnCall']");
    
    
    
    
    
	//ContractorA
	
	public pom013_VW_User_Tab(WebDriver driver) {
		this.driver=driver;
	}
	

	// Method for Verified Lables under Client Tab

//==================================================================================	

//	public static String Client_UserName="Client_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	
	
	public static String Client_User="Cnt_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	public static String Client_Enhanced="Cnt_Enh_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	public static String Client_Develper="Cnt_Dev_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	public static String Client_Cust_Admin="Cnt_Cust_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	
//	public static String Partner_UserName="Partner_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	
	public static String Partner_User="Pt_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	public static String Partner_Cust_Admin="Pt_Cust_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	public static String Partner_Enhanced="Pt_Enh_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	public static String Partner_Developer="Pt_Dev_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	
	
	public static String Partnered_User="Patd_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	public static String Partnered_Enhanced="Patd_Enh_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static String UserEmail="hari@preempt.com";
	public static String TestCaseName1="Clinet";
	public static String TestCaseName2="Partner";
	pom012_VW_Dashboard_Tab dashboard_Tab=new pom012_VW_Dashboard_Tab(driver);
	
	public void Clientselection(String TestCaseName) throws InterruptedException {
		wait=new WebDriverWait(driver,30);
		
		
		if (TestCaseName.contains("Client")) {
			
			
			
			
			 wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.profileDropdown)).click();
				  	log.debug("profile drop down clicked");
				  	
				  	log.debug("Profile dropdown clicked");	
					wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.profileTab)).click();
				    log.debug("Profile Tab clicked");	
				    
				  	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard_Tab.Savebutton));
				  	log.debug("Presence of Save button");	
				  	Thread.sleep(8000);
				  	// Validate Presence of element
				  	Select select = new Select(driver.findElement(dashboard_Tab.Clinetdropdown));
				  	WebElement option = select.getFirstSelectedOption();
				  	String defaultItem = option.getText();
				  	System.out.println(defaultItem );  	
				  	
				 	System.out.println("ClientName: "+defaultItem );
				  	
				  	if (defaultItem.contains("Automation_Clients")) {
				  		
				  		log.debug("Client already selected As " +defaultItem);	
				  	} 	
				  	
				  	else {				  	
				  	
				  		log.debug("Client already not selected");	
					WebElement dropdown=driver.findElement(dashboard_Tab.Clinetdropdown);
					Select s1=new Select(dropdown);
					s1.selectByVisibleText("Automation_Clients");
					log.info("Select Client as 'Automation_Clients'");	
					wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.Savebutton)).click();	
					log.info("Save button clicked");	
					wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));	
					log.info("loading completed");	
				  	}
		}
				  	
					else if  (TestCaseName.contains("Partner")) {
			
						
		 wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.profileDropdown)).click();
			  	log.debug("profile drop down clicked");
			  	
			  	log.debug("Profile dropdown clicked");	
				wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.profileTab)).click();
			    log.debug("Profile Tab clicked");	
			    
			  	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard_Tab.Savebutton));
			  	log.debug("Presence of Save button");	
			  	Thread.sleep(8000);
			  	// Validate Presence of element
			  	Select select1 = new Select(driver.findElement(dashboard_Tab.Clinetdropdown));
			  	WebElement option1 = select1.getFirstSelectedOption();
			  	String defaultItem1 = option1.getText();
			  	System.out.println(defaultItem1);  	
			  	
			 	System.out.println("ClientName: "+defaultItem1 );
			  	
			  	if (defaultItem1.contains("Automation_Partner")) {
			  		
			  		log.debug("Client already selected" +defaultItem1);	
			  	} 	
			  	
			  	else {				  	
			  	
			  		log.debug("Client already not selected");	
				WebElement dropdown=driver.findElement(dashboard_Tab.Clinetdropdown);
				Select s1=new Select(dropdown);
				s1.selectByVisibleText("Automation_Partner - Automation_Partner");
				log.info("Select Client as 'Automation_Partner'");	
				wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.Savebutton)).click();	
				log.info("Save button clicked");	
				wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));	
				log.info("loading completed");	
					
		}
	}
		
	}
	
	
	
	
	
		
	public void UserTabValidation(String TestCaseName) throws InterruptedException {
		
		wait=new WebDriverWait(driver,30);		
		log.info("Validating User Tab");
		
		wait.until(ExpectedConditions.elementToBeClickable(HomeTab.usersTab)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(Userslabel));
		
		Assert.assertTrue(driver.findElement(Userslabel).isDisplayed());
		log.debug("Verified that 'Users' label appeared on left side under User tab");
		wait.until(ExpectedConditions.elementToBeClickable(Userslabel));
		Assert.assertEquals(driver.findElement(Userlabelheader).getText().contains("Users"), true);
		log.debug("Verified that 'Users' Text validated on left side under User Tab");		
		
		Assert.assertTrue(driver.findElement(UserQuery).isDisplayed());
		log.debug("Verified that 'Filter by User name' box appeared on n left side under User tab");
		Assert.assertTrue(driver.findElement(UserQuery).isEnabled());		
		log.debug("Verified that 'Filter by User name or tag filter'enabled under User tab");
		Assert.assertFalse(driver.findElement(UserQuery).isSelected());		
		log.debug("Verified that 'Filter by User name' is blank while access User tab");
				
		Assert.assertTrue(driver.findElement(Userlabel).isDisplayed());
		log.debug("Verified that 'User' label appeared on under Users tab");		
		Assert.assertEquals(driver.findElement(Userlabel).getText(), "User");		
		log.debug("Verified that 'User' Text validated under Users Tab");					
		
		Assert.assertTrue(driver.findElement(UserPleaseselectlabel).isDisplayed());
		log.debug("Verified that 'Please select a user' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(UserPleaseselectlabel).getText(), "Please select a user");		
		log.debug("Verified that 'Please select a test ' Text validated under user Tab");
		
		
		
	    String count=driver.findElement(Userlabelheader).getText();
		//	log.debug("Script header contain "+count);
			String[] part = count.split("(?<=\\D)(?=\\d)");		
		//	log.debug("spilled value "+part[1]);	
			int Count=driver.findElements(firstsearchUser).size();
			log.debug("User Count "+Count);	
			String UserActualCount =String.valueOf(Count);	
		//	log.debug("integer converted as: "+UserActualCount);	
			
			Assert.assertEquals(part[1], UserActualCount);		
			log.debug("Verified that User count found correct: "+UserActualCount);	
			
			if (Count>0) {
				
				driver.findElement(firstsearchUser).click();
									
				log.debug("firstUserClicked");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
				log.info("found progress bar loading");
			//	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton));
				Assert.assertTrue(driver.findElement(UserDeleteButton).isDisplayed());
				log.info("Delete button displayed found");
		if((TestCaseName.contains("Pt")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Enhanced User")||(TestCaseName.contains("Pt")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Developer")||(TestCaseName.contains("Cnt")&& pom010_VW_Notification_Tab.UserPermissionLevel.contains("Developer")))))
				{
			
			Assert.assertFalse(driver.findElement(UserDeleteButton).isEnabled());
			log.info("Delete button disabled");
			
		} else {
			
			Assert.assertTrue(driver.findElement(UserDeleteButton).isEnabled());
			log.info("Delete button enabled found");
		}			
				
				log.info("Test Filter by name feature is working as desired");
				
			}else {
				
				log.info("No User available");
			}	
			
			
			
			
			
		
			if (driver.findElements(UserSaveButton).isEmpty()){
				
				log.info("Save button not found under this credetials");
			  
			} else {
			Assert.assertTrue(driver.findElement(UserSaveButton).isDisplayed());
			log.info("Save button found");
			Assert.assertFalse(driver.findElement(UserSaveButton).isEnabled());
			log.info("Save button disabled");
			}
				
        if (driver.findElements(UserCreateBut).isEmpty()) {
			
			log.debug("Verified that User creation plus (+) icon not appeared on top left side under User tab");	
			
		
									
		} else	{
			
					
			log.debug("Verified that new User creation plus (+) icon appeared on top left side under Tests tab");	  
			
			log.debug("Validated the different elements while click User Creation using button (+)");
			
			wait.until(ExpectedConditions.elementToBeClickable(UserCreateBut)).click();	
			Assert.assertTrue(driver.findElement(UserNameLabel).isDisplayed());
			log.debug("Verified that 'User Name' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserNameField).isDisplayed());
			log.debug("Verified that 'UserName' filed appeared on left side under User tab");
			wait.until(ExpectedConditions.elementToBeClickable(UserNameField));
			Assert.assertTrue(driver.findElement(UserNameField).isEnabled());
			log.debug("Verified that 'UserName' filed enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(PasswordLabel).isDisplayed());
			log.debug("Verified that 'Password' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserPassField).isDisplayed());
			log.debug("Verified that 'Password' field appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserPassField).isEnabled());
			log.debug("Verified that 'Password' filed enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(ConfirmPassLabel).isDisplayed());
			log.debug("Verified that 'Confirm Password' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserConfirmPassField).isDisplayed());
			log.debug("Verified that 'Confirm password' field appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserConfirmPassField).isEnabled());
			log.debug("Verified that 'Confirm Password' filed enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(FirstNameLabel).isDisplayed());
			log.debug("Verified that 'FirstName' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserFirstNameField).isDisplayed());
			log.debug("Verified that 'User First Name' field appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserFirstNameField).isEnabled());
			log.debug("Verified that 'User First Name' filed enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(LastNameLabel).isDisplayed());
			log.debug("Verified that 'LastName' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserLastNameField).isDisplayed());
			log.debug("Verified that 'User Last Name' field appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserLastNameField).isEnabled());
			log.debug("Verified that 'User Last Name' filed enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(EmailLabel).isDisplayed());
			log.debug("Verified that 'Email' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserEmailField).isDisplayed());
			log.debug("Verified that 'Email' field appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserEmailField).isEnabled());
			log.debug("Verified that 'Email' filed enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(RoleLabel).isDisplayed());
			log.debug("Verified that 'Role' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserRoleDropdown).isDisplayed());
			log.debug("Verified that 'Role' dropdown appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserRoleDropdown).isEnabled());
			log.debug("Verified that 'Role' dropdown enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(TimeZoneLabel).isDisplayed());
			log.debug("Verified that 'TimeZone' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserRoleDropdown).isDisplayed());
			log.debug("Verified that 'TimeZone' dropdown appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserRoleDropdown).isEnabled());
			log.debug("Verified that 'TimeZone' dropdown enabled on left side under User tab");
			
			Assert.assertTrue(driver.findElement(PrefLangLabel).isDisplayed());
			log.debug("Verified that 'Preferred Language' label appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserPrefLangDropdown).isDisplayed());
			log.debug("Verified that 'Preferred Language' dropdown appeared on left side under User tab");
			Assert.assertTrue(driver.findElement(UserPrefLangDropdown).isEnabled());
			log.debug("Verified that 'Preferred Language' dropdown enabled on left side under User tab");
			
			
			Assert.assertTrue(driver.findElement(Subscribelabel).isDisplayed());
			log.debug("Verified that 'Subscribed Notifications' label appeared on under Users tab");
								
		     driver.findElement(HomeTab.usersTab).click(); 		
		}
    		
            if (driver.findElements(UserCreateLink).isEmpty()) {
    			
    			log.debug("Verified that User creation link is not appeared on top left side under User tab");	
            } else {	
    			
    				    			
    			log.debug("Verified that new User link appeared on top left side under Tests tab");	  
    			
    			log.debug("Validated the different elements while click User Creation using Link");
    			
    			
    			wait.until(ExpectedConditions.elementToBeClickable(UserCreateLink)).click();	
    			Assert.assertTrue(driver.findElement(UserNameLabel).isDisplayed());
    			log.debug("Verified that 'User Name' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserNameField).isDisplayed());
    			log.debug("Verified that 'UserName' filed appeared on left side under User tab");
    			wait.until(ExpectedConditions.elementToBeClickable(UserNameField));
    			Assert.assertTrue(driver.findElement(UserNameField).isEnabled());
    			log.debug("Verified that 'UserName' filed enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(PasswordLabel).isDisplayed());
    			log.debug("Verified that 'Password' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserPassField).isDisplayed());
    			log.debug("Verified that 'Password' field appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserPassField).isEnabled());
    			log.debug("Verified that 'Password' filed enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(ConfirmPassLabel).isDisplayed());
    			log.debug("Verified that 'Confirm Password' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserConfirmPassField).isDisplayed());
    			log.debug("Verified that 'Confirm password' field appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserConfirmPassField).isEnabled());
    			log.debug("Verified that 'Confirm Password' filed enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(FirstNameLabel).isDisplayed());
    			log.debug("Verified that 'FirstName' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserFirstNameField).isDisplayed());
    			log.debug("Verified that 'User First Name' field appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserFirstNameField).isEnabled());
    			log.debug("Verified that 'User First Name' filed enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(LastNameLabel).isDisplayed());
    			log.debug("Verified that 'LastName' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserLastNameField).isDisplayed());
    			log.debug("Verified that 'User Last Name' field appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserLastNameField).isEnabled());
    			log.debug("Verified that 'User Last Name' filed enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(EmailLabel).isDisplayed());
    			log.debug("Verified that 'Email' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserEmailField).isDisplayed());
    			log.debug("Verified that 'Email' field appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserEmailField).isEnabled());
    			log.debug("Verified that 'Email' filed enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(RoleLabel).isDisplayed());
    			log.debug("Verified that 'Role' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserRoleDropdown).isDisplayed());
    			log.debug("Verified that 'Role' dropdown appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserRoleDropdown).isEnabled());
    			log.debug("Verified that 'Role' dropdown enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(TimeZoneLabel).isDisplayed());
    			log.debug("Verified that 'TimeZone' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserRoleDropdown).isDisplayed());
    			log.debug("Verified that 'TimeZone' dropdown appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserRoleDropdown).isEnabled());
    			log.debug("Verified that 'TimeZone' dropdown enabled on left side under User tab");
    			
    			Assert.assertTrue(driver.findElement(PrefLangLabel).isDisplayed());
    			log.debug("Verified that 'Preferred Language' label appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserPrefLangDropdown).isDisplayed());
    			log.debug("Verified that 'Preferred Language' dropdown appeared on left side under User tab");
    			Assert.assertTrue(driver.findElement(UserPrefLangDropdown).isEnabled());
    			log.debug("Verified that 'Preferred Language' dropdown enabled on left side under User tab");
    			
    			
    			Assert.assertTrue(driver.findElement(Subscribelabel).isDisplayed());
    			log.debug("Verified that 'Subscribed Notifications' label appeared on under Users tab");
            }  			
			}

//===============================================================================================================================================================	
	     public void CreateUserfunctinality_using_button(String TestCaseName,String Role, String UserEmail) throws InterruptedException {
	    	 String C_UserName="Client_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	
	    	 wait=new WebDriverWait(driver,20);		
	    		log.info("Creating User");
	    		driver.findElement(HomeTab.usersTab).click();
	    		log.info("Navigate to User Tab");
	    		wait.until(ExpectedConditions.elementToBeClickable(UserCreateBut)).click();
//	    		driver.findElement(UserCreateBut).click();
	    		log.info("Create User button + clicked");
	    		wait.until(ExpectedConditions.elementToBeClickable(UserNameField));
//	    		String UserName="User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	    		
	    		driver.findElement(UserNameField).clear();
	    		log.info("UserName Field cleaned");	
	    		log.info("Generate Random UserName");
	    		
	    		if (TestCaseName.contains("Client")) {
	    			
	    			driver.findElement(UserNameField).sendKeys(C_UserName);
	    			log.info("Passing Client_UserName: " +C_UserName);
					driver.findElement(UserPassField).sendKeys("123Empirix!");
	    		log.info("Passing UserPassword: 123Empirix!");	
//	    		driver.findElement(UserPassField).sendKeys(Keys.TAB);
	    		driver.findElement(UserConfirmPassField).sendKeys("123Empirix!");
	    		log.info("Passing Confirm Password: 123Empirix!");	
	    		driver.findElement(UserFirstNameField).sendKeys("First");
	    		log.info("Passing FirstName: First");
	    		driver.findElement(UserLastNameField).sendKeys("Last");
	    		log.info("Passing LastName: Last");
	    		driver.findElement(UserEmailField).sendKeys(UserEmail);
	    		log.info("Passing Email: " +UserEmail);
					WebElement dropdown4=driver.findElement(UserTimeZoneDropdown);
	    		Select s4=new Select(dropdown4);
	    		s4.selectByVisibleText("(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo");
	    		log.info("Select TimeZone as '(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo'");
	    		WebElement dropdown5=driver.findElement(UserPrefLangDropdown);
	    		Select s5=new Select(dropdown5);
	    		s5.selectByVisibleText("English");
	    		log.info("Select Prefered Laungage as 'English");
	    		driver.findElement(UserSaveButton).click();  
	    		wait.until(ExpectedConditions.elementToBeClickable(UserCreateBut));
	    		
	    		log.info("Search User");
	    		
	    		driver.findElement(UserQuery).clear();
	    		driver.findElement(UserQuery).sendKeys(C_UserName);
	        	driver.findElement(firstsearchUser).click();
	        	log.info("Clicked first search user");
	        	Thread.sleep(2000);
	        	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
	        	log.info("loading");
	        	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();
	        	log.info("Delete button located");
	        	log.info("Delete button clicked");
	        	wait.until(ExpectedConditions.alertIsPresent());
	        	log.info("aleart present");
	        	driver.switchTo().alert().accept();	
	        	log.info("aleart accepted");
	        	

	        	driver.navigate().refresh();
	        	
} else if (TestCaseName.contains("Partner")) {
	
	String P_UserName="Partner_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
	    			
	    			driver.findElement(UserNameField).sendKeys(P_UserName);
	    			log.info("Passing Partner_UserName: " +P_UserName);
	    			
	    		
	    		driver.findElement(UserPassField).sendKeys("123Empirix!");
	    		log.info("Passing UserPassword: 123Empirix!");	
//	    		driver.findElement(UserPassField).sendKeys(Keys.TAB);
	    		driver.findElement(UserConfirmPassField).sendKeys("123Empirix!");
	    		log.info("Passing Confirm Password: 123Empirix!");	
	    		driver.findElement(UserFirstNameField).sendKeys("First");
	    		log.info("Passing FirstName: First");
	    		driver.findElement(UserLastNameField).sendKeys("Last");
	    		log.info("Passing LastName: Last");
	    		driver.findElement(UserEmailField).sendKeys(UserEmail);
	    		log.info("Passing Email: " +UserEmail);
	    		wait.until(ExpectedConditions.elementToBeClickable(UserAccessDropdown));
	    		WebElement dropdown=driver.findElement(UserAccessDropdown);
	    		Select s1=new Select(dropdown);		    
	    	    s1.selectByVisibleText("Partner");
	    		log.info("Select Partner as UserAccess");	

	    		
	    	   WebElement dropdown1=driver.findElement(UserPartnerDropdown);
	    	   Select s2=new Select(dropdown1);   
	    	   s2.selectByVisibleText("Automation_Partner");
	    	    log.info("Select Client as Automation_Partner" );
    		
	    		WebElement dropdown3=driver.findElement(UserRoleDropdown);
	    		Select s3=new Select(dropdown3);
	    		s3.selectByVisibleText(Role);	    		
	    		log.info("Select Role as: " +Role);
	    		WebElement dropdown4=driver.findElement(UserTimeZoneDropdown);
	    		Select s4=new Select(dropdown4);
	    		s4.selectByVisibleText("(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo");
	    		log.info("Select TimeZone as '(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo'");
	    		WebElement dropdown5=driver.findElement(UserPrefLangDropdown);
	    		Select s5=new Select(dropdown5);
	    		s5.selectByVisibleText("English");
	    		log.info("Select Prefered Laungage as 'English");
	    		driver.findElement(UserSaveButton).click();   	
	        	
	        	
	        	
	        	
	        	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));	
	        	driver.findElement(UserQuery).clear();
	        	driver.findElement(UserQuery).sendKeys(P_UserName);
	        	
	        	log.info("Search User");
	        	driver.findElement(firstsearchUser).click();
	        	log.info("Clicked first search user");
	        	Thread.sleep(2000);
	        	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
	        	log.info("loading");
	        	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();
	        	log.info("Delete button located");
	        	wait.until(ExpectedConditions.alertIsPresent());
	        	log.info("aleart present");
	        	driver.switchTo().alert().accept();	
	        	log.info("aleart accepted");
	        	

	        	driver.navigate().refresh();
}
	     }
	    		
	        	
	
  public void CreateUserfunctinality_using_Link(String TestCaseName,String Role, String UserEmail) throws InterruptedException {
        	
	 
	  wait=new WebDriverWait(driver,20);		
		log.info("Creating User");
		driver.findElement(HomeTab.usersTab).click();
		log.info("Navigate to User Tab");
		wait.until(ExpectedConditions.elementToBeClickable(UserCreateBut)).click();
//		driver.findElement(UserCreateBut).click();
		log.info("Create User button + clicked");
		wait.until(ExpectedConditions.elementToBeClickable(UserNameField));
//		String UserName="User_"+pom000_Reuseable_Script_for_Page.getSaltString();
		
		driver.findElement(UserNameField).clear();
		log.info("UserName Field cleaned");	
		log.info("Generate Random UserName");
		
		if (TestCaseName.contains("Client")) {
			
			String C_UserName="Client_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
			
			driver.findElement(UserNameField).sendKeys(C_UserName);
			log.info("Passing Client_UserName: " +C_UserName);
			driver.findElement(UserPassField).sendKeys("123Empirix!");
		log.info("Passing UserPassword: 123Empirix!");	
//		driver.findElement(UserPassField).sendKeys(Keys.TAB);
		driver.findElement(UserConfirmPassField).sendKeys("123Empirix!");
		log.info("Passing Confirm Password: 123Empirix!");	
		driver.findElement(UserFirstNameField).sendKeys("First");
		log.info("Passing FirstName: First");
		driver.findElement(UserLastNameField).sendKeys("Last");
		log.info("Passing LastName: Last");
		driver.findElement(UserEmailField).sendKeys(UserEmail);
		log.info("Passing Email: " +UserEmail);
			WebElement dropdown4=driver.findElement(UserTimeZoneDropdown);
		Select s4=new Select(dropdown4);
		s4.selectByVisibleText("(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo");
		log.info("Select TimeZone as '(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo'");
		WebElement dropdown5=driver.findElement(UserPrefLangDropdown);
		Select s5=new Select(dropdown5);
		s5.selectByVisibleText("English");
		log.info("Select Prefered Laungage as 'English");
		driver.findElement(UserSaveButton).click();  
		wait.until(ExpectedConditions.elementToBeClickable(UserCreateBut));
		
		log.info("Search User");
		
		driver.findElement(UserQuery).clear();
		driver.findElement(UserQuery).sendKeys(C_UserName);
		driver.findElement(firstsearchUser).click();
  	log.info("Clicked first search user");
  	Thread.sleep(2000);
  	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
  	log.info("loading");
  	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();
  	log.info("Delete button located");
   	log.info("Delete button clicked");
  	wait.until(ExpectedConditions.alertIsPresent());
  	log.info("aleart present");
  	driver.switchTo().alert().accept();	
  	log.info("aleart accepted");
  	

  	driver.navigate().refresh();
		

		} else if (TestCaseName.contains("Partner")) {
			
			String P_UserName="Partner_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
			
			driver.findElement(UserNameField).sendKeys(P_UserName);
			log.info("Passing Partner_UserName: " +P_UserName);
			
		
		driver.findElement(UserPassField).sendKeys("123Empirix!");
		log.info("Passing UserPassword: 123Empirix!");	
//		driver.findElement(UserPassField).sendKeys(Keys.TAB);
		driver.findElement(UserConfirmPassField).sendKeys("123Empirix!");
		log.info("Passing Confirm Password: 123Empirix!");	
		driver.findElement(UserFirstNameField).sendKeys("First");
		log.info("Passing FirstName: First");
		driver.findElement(UserLastNameField).sendKeys("Last");
		log.info("Passing LastName: Last");
		driver.findElement(UserEmailField).sendKeys(UserEmail);
		log.info("Passing Email: " +UserEmail);
		wait.until(ExpectedConditions.elementToBeClickable(UserAccessDropdown));
		WebElement dropdown=driver.findElement(UserAccessDropdown);
		Select s1=new Select(dropdown);		    
	    s1.selectByVisibleText("Partner");
		log.info("Select Partner as UserAccess");	

		
	   WebElement dropdown1=driver.findElement(UserPartnerDropdown);
	   Select s2=new Select(dropdown1);   
	   s2.selectByVisibleText("Automation_Partner");
	    log.info("Select Client as Automation_Partner" );
	
		WebElement dropdown3=driver.findElement(UserRoleDropdown);
		Select s3=new Select(dropdown3);
		s3.selectByVisibleText(Role);	    		
		log.info("Select Role as: " +Role);
		WebElement dropdown4=driver.findElement(UserTimeZoneDropdown);
		Select s4=new Select(dropdown4);
		s4.selectByVisibleText("(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo");
		log.info("Select TimeZone as '(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo'");
		WebElement dropdown5=driver.findElement(UserPrefLangDropdown);
		Select s5=new Select(dropdown5);
		s5.selectByVisibleText("English");
		log.info("Select Prefered Laungage as 'English");
		driver.findElement(UserSaveButton).click();     	
    	
    	
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));	
    	driver.findElement(UserQuery).clear();
    	driver.findElement(UserQuery).sendKeys(P_UserName);
    	
    	log.info("Search User");
    	driver.findElement(firstsearchUser).click();
    	log.info("Clicked first search user");
     	Thread.sleep(2000);
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
    	log.info("loading");
     	
    	
    	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();
    	log.info("Delete button located");
    	wait.until(ExpectedConditions.alertIsPresent());
    	log.info("aleart present");
    	driver.switchTo().alert().accept();	
    	log.info("aleart accepted");
    	

    	driver.navigate().refresh();
    	
    	
 
		}
		
		}

  	
 
	
	public void CreateUser(String TestCaseName,String Role, String UserEmail) throws InterruptedException {
	
		pom013_VW_User_Tab test=new pom013_VW_User_Tab(driver);
		
	wait=new WebDriverWait(driver,20);		
	log.info("Creating User");
	driver.findElement(HomeTab.usersTab).click();
	log.info("Navigate to User Tab");
	wait.until(ExpectedConditions.elementToBeClickable(UserCreateLink)).click();
	log.info("Create User button + clicked");
	wait.until(ExpectedConditions.elementToBeClickable(UserNameField));

	
	driver.findElement(UserNameField).clear();
	log.info("UserName Field cleaned");	
	log.info("Generate Random UserName");
	
	
	if (TestCaseName.contains("Client User")) {
		driver.findElement(UserNameField).sendKeys(Client_User);
		log.info("Passing Client_UserName: " +Client_User);
		
	} else if (TestCaseName.contains("Client Enhanced")) {		
		driver.findElement(UserNameField).sendKeys(Client_Enhanced);
		log.info("Passing Client_UserName: " +Client_Enhanced);
		
	}  else if (TestCaseName.contains("Client Developer")) {		
		driver.findElement(UserNameField).sendKeys(Client_Develper);
		log.info("Passing Client_UserName: " +Client_Develper);
		
	} else if (TestCaseName.contains("Client Customer Admin")) {		
		driver.findElement(UserNameField).sendKeys(Client_Cust_Admin);
		log.info("Passing Client_UserName: " +Client_Cust_Admin);
		
	} else if (TestCaseName.contains("Partner Customer Admin")) {		
		driver.findElement(UserNameField).sendKeys(Partner_Cust_Admin);
		log.info("Passing Client_UserName: " +Partner_Cust_Admin);
		
	}else if (TestCaseName.contains("Partner User")) {		
		driver.findElement(UserNameField).sendKeys(Partner_User);
		log.info("Passing Client_UserName: " +Partner_User);
		
	} else if (TestCaseName.contains("Partner Enhanced")) {		
		driver.findElement(UserNameField).sendKeys(Partner_Enhanced);
		log.info("Passing Client_UserName: " +Partner_Enhanced);
	}
	 else if (TestCaseName.contains("Partner Developer")) {		
		driver.findElement(UserNameField).sendKeys(Partner_Developer);
		log.info("Passing Client_UserName: " +Partner_Developer);
		
		
	} else if (TestCaseName.contains("Partnered User")) {		
		driver.findElement(UserNameField).sendKeys(Partnered_User);
		log.info("Passing Client_UserName: " +Partnered_User);
	}  else if (TestCaseName.contains("Partnered Enhanced")) {		
		driver.findElement(UserNameField).sendKeys(Partnered_Enhanced);
		log.info("Passing Client_UserName: " +Partnered_Enhanced);
	} 
	
	
	driver.findElement(UserPassField).sendKeys("123Empirix!");
	log.info("Passing UserPassword: 123Empirix!");	
//	driver.findElement(UserPassField).sendKeys(Keys.TAB);
	driver.findElement(UserConfirmPassField).sendKeys("123Empirix!");
	log.info("Passing Confirm Password: 123Empirix!");	
	driver.findElement(UserFirstNameField).sendKeys("First");
	log.info("Passing FirstName: First");
	driver.findElement(UserLastNameField).sendKeys("Last");
	log.info("Passing LastName: Last");
	driver.findElement(UserEmailField).sendKeys(UserEmail);
	log.info("Passing Email: " +UserEmail);
	wait.until(ExpectedConditions.elementToBeClickable(UserAccessDropdown));
	WebElement dropdown=driver.findElement(UserAccessDropdown);
	Select s1=new Select(dropdown);
	
	if ((TestCaseName.contains("Client User")||(TestCaseName.contains("Client Enhanced")||(TestCaseName.contains("Client Developer")||(TestCaseName.contains("Client Customer Admin")))))) {

		s1.selectByVisibleText("Client");
		log.info("Select Client as UserAccess");
    	
	} else if ((TestCaseName.contains("Partner User")||(TestCaseName.contains("Partner Enhanced")||(TestCaseName.contains("Partner Developer")||(TestCaseName.contains("Partner Customer Admin"))))))  {
    
    	s1.selectByVisibleText("Partner");
		log.info("Select Partner as UserAccess");
    	   	
    } else if ((TestCaseName.contains("Partnered User")||(TestCaseName.contains("Partnered Enhanced")||(TestCaseName.contains("Partnered Developer")||(TestCaseName.contains("Partnered Customer Admin"))))))  {
	
       	s1.selectByVisibleText("Partnered Client");
		log.info("Select Partnered as UserAccess");
    	   	
    }
	
	
	
	if ((TestCaseName.contains("Client User")||(TestCaseName.contains("Client Enhanced")||(TestCaseName.contains("Client Developer")||(TestCaseName.contains("Client Customer Admin")))))) {
	
	WebElement dropdown2=driver.findElement(UserClientDropdown);
	Select s2=new Select(dropdown2);   
    	s2.selectByVisibleText("Automation_Clients");    	
    	log.info("Select Client as Automation_Client" );
    	
	} else if ((TestCaseName.contains("Partner User")||(TestCaseName.contains("Partner Enhanced")||(TestCaseName.contains("Partner Developer")||(TestCaseName.contains("Partner Customer Admin"))))))  {    	
    	WebElement dropdown2=driver.findElement(UserPartnerDropdown);
    	Select s3=new Select(dropdown2);   
    s3.selectByVisibleText("Automation_Partner");
    log.info("Select Client as Automation_Partner" );
    	   	
    }
	
	WebElement dropdown3=driver.findElement(UserRoleDropdown);
	Select s3=new Select(dropdown3);
	s3.selectByVisibleText(Role);
	
	log.info("Select Role as: " +Role);
	
	wait.until(ExpectedConditions.elementToBeClickable(HODCheckbox)).click();
	
	log.info("Select 'HODQA' checkbox");
	wait.until(ExpectedConditions.elementToBeClickable(HODPrefCheckbox)).click();
	log.info("Select 'HOD Perfomance' checkbox");	
	
	WebElement dropdown4=driver.findElement(UserTimeZoneDropdown);
	Select s4=new Select(dropdown4);
	s4.selectByVisibleText("(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo");
	log.info("Select TimeZone as '(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo'");
	WebElement dropdown5=driver.findElement(UserPrefLangDropdown);
	Select s5=new Select(dropdown5);
	s5.selectByVisibleText("English");
	log.info("Select Prefered Laungage as 'English");
	driver.findElement(UserSaveButton).click();
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));		
	wait.until(ExpectedConditions.elementToBeClickable(ActiveUser));

}



public void DeleteUser(String TestCaseName) throws InterruptedException {
	
	pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
	
	wait=new WebDriverWait(driver,30);		
	driver.navigate().refresh();
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.usersTab)).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(UserCreateLink));
	Thread.sleep(1000);
	
    driver.findElement(UserQuery).clear();
    
    
    if (TestCaseName.contains("Client User")) {
    	driver.findElement(UserQuery).sendKeys(Client_User);
    	log.info("Search User: "+Client_User);
    } else if (TestCaseName.contains("Client Enhanced")) {		
    	driver.findElement(UserQuery).sendKeys(Client_Enhanced);
    	log.info("Search User: "+Client_Enhanced);
    } else if (TestCaseName.contains("Client Developer")) {		
    	driver.findElement(UserQuery).sendKeys(Client_Develper);
    	log.info("Search User: "+Client_Enhanced);
    } else if (TestCaseName.contains("Client Customer Admin")) {		
    	driver.findElement(UserQuery).sendKeys(Client_Cust_Admin);
    	log.info("Search User: "+Client_Cust_Admin);
    } else if (TestCaseName.contains("Partner User")) {		
        	driver.findElement(UserQuery).sendKeys(Partner_User);
        	log.info("Search User: "+Partner_User);
    } else if (TestCaseName.contains("Partner Customer Admin")) {		
    	driver.findElement(UserQuery).sendKeys(Partner_Cust_Admin);
    	log.info("Search User: "+Partner_Cust_Admin);  	
    } else if (TestCaseName.contains("Partner Enhanced")) {		
    	driver.findElement(UserQuery).sendKeys(Partner_Enhanced);
    	log.info("Search User: "+Partner_Enhanced);
    } else if (TestCaseName.contains("Partner Developer")) {		
    	driver.findElement(UserQuery).sendKeys(Partner_Developer);
    	log.info("Search User: "+Partner_Enhanced);
    	
    }  else if (TestCaseName.contains("Partnered User")) {		
    	driver.findElement(UserQuery).sendKeys(Partnered_User);
    	log.info("Search User: "+Partnered_User);
    }  else if (TestCaseName.contains("Partnered Enhanced")) {		
    	driver.findElement(UserQuery).sendKeys(Partnered_Enhanced);
    	log.info("Search User: "+Partnered_Enhanced);
    }
        
	
	driver.findElement(firstsearchUser).click();
	log.info("Clicked first search user");

	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
	log.info("loading");
	Thread.sleep(500);
	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();
	log.info("Delete button located");
	log.info("Delete button clicked");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("aleart present");
	driver.switchTo().alert().accept();	
	log.info("aleart accepted");
	wait.until(ExpectedConditions.elementToBeClickable(UserCreateLink));

}

public void DeleteRemainingUser() throws InterruptedException {
	
	pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
	wait=new WebDriverWait(driver,30);		

	driver.navigate().refresh();
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.usersTab)).click();
	driver.navigate().refresh();
	
	wait.until(ExpectedConditions.elementToBeClickable(UserCreateLink));
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']"));
	
	 for (WebElement element : elements) {
	    System.out.println(element.getText()); 
if (element.getText().contains("User_")) {

	element.click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
	log.info("loading");
    Thread.sleep(500);
	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();;
	log.info("Delete button clicked");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("aleart present");
	driver.switchTo().alert().accept();	
	log.info("aleart accepted");
	wait.until(ExpectedConditions.elementToBeClickable(UserCreateLink));
		    
}
}	
}


public void DeleteUserfunctinalty(String TestCaseName,String Role, String UserEmail) throws InterruptedException {	 
	 
	  wait=new WebDriverWait(driver,20);
	  driver.navigate().refresh();
		log.info("Creating User");
		driver.findElement(HomeTab.usersTab).click();
		log.info("Navigate to User Tab");
		wait.until(ExpectedConditions.elementToBeClickable(UserCreateBut)).click();
//		driver.findElement(UserCreateBut).click();
		log.info("Create User button + clicked");
		wait.until(ExpectedConditions.elementToBeClickable(UserNameField));
//		String UserName="User_"+pom000_Reuseable_Script_for_Page.getSaltString();
		
		driver.findElement(UserNameField).clear();
		log.info("UserName Field cleaned");	
		log.info("Generate Random UserName");
		
		if (TestCaseName.contains("Client")) {
			String C_UserName="Client_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
			
			driver.findElement(UserNameField).sendKeys(C_UserName);
			log.info("Passing Client_UserName: " +C_UserName);
			driver.findElement(UserPassField).sendKeys("123Empirix!");
		log.info("Passing UserPassword: 123Empirix!");	
//		driver.findElement(UserPassField).sendKeys(Keys.TAB);
		driver.findElement(UserConfirmPassField).sendKeys("123Empirix!");
		log.info("Passing Confirm Password: 123Empirix!");	
		driver.findElement(UserFirstNameField).sendKeys("First");
		log.info("Passing FirstName: First");
		driver.findElement(UserLastNameField).sendKeys("Last");
		log.info("Passing LastName: Last");
		driver.findElement(UserEmailField).sendKeys(UserEmail);
		log.info("Passing Email: " +UserEmail);
			WebElement dropdown4=driver.findElement(UserTimeZoneDropdown);
		Select s4=new Select(dropdown4);
		s4.selectByVisibleText("(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo");
		log.info("Select TimeZone as '(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo'");
		WebElement dropdown5=driver.findElement(UserPrefLangDropdown);
		Select s5=new Select(dropdown5);
		s5.selectByVisibleText("English");
		log.info("Select Prefered Laungage as 'English");
		driver.findElement(UserSaveButton).click();  
		wait.until(ExpectedConditions.elementToBeClickable(UserCreateBut));
		
		log.info("Search User");
		driver.findElement(UserQuery).clear();
		driver.findElement(UserQuery).sendKeys(C_UserName);
		driver.findElement(firstsearchUser).click();
	log.info("Clicked first search user");
	Thread.sleep(2000);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
	log.info("loading");
	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();
	log.info("Delete button located");
	/*WebElement ele = driver.findElement(UserDeleteButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);*/
	log.info("Delete button clicked");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("aleart present");
	driver.switchTo().alert().accept();	
	log.info("aleart accepted");
	

	driver.navigate().refresh();
		


		} else if (TestCaseName.contains("Partner")) {
			String P_UserName="Partner_User_"+pom000_Reuseable_Script_for_Page.getSaltString();
			
			driver.findElement(UserNameField).sendKeys(P_UserName);
			log.info("Passing Partner_UserName: " +P_UserName);
			
		
		driver.findElement(UserPassField).sendKeys("123Empirix!");
		log.info("Passing UserPassword: 123Empirix!");	
//		driver.findElement(UserPassField).sendKeys(Keys.TAB);
		driver.findElement(UserConfirmPassField).sendKeys("123Empirix!");
		log.info("Passing Confirm Password: 123Empirix!");	
		driver.findElement(UserFirstNameField).sendKeys("First");
		log.info("Passing FirstName: First");
		driver.findElement(UserLastNameField).sendKeys("Last");
		log.info("Passing LastName: Last");
		driver.findElement(UserEmailField).sendKeys(UserEmail);
		log.info("Passing Email: " +UserEmail);
		wait.until(ExpectedConditions.elementToBeClickable(UserAccessDropdown));
		WebElement dropdown=driver.findElement(UserAccessDropdown);
		Select s1=new Select(dropdown);		    
	    s1.selectByVisibleText("Partner");
		log.info("Select Partner as UserAccess");	

		
	   WebElement dropdown1=driver.findElement(UserPartnerDropdown);
	   Select s2=new Select(dropdown1);   
	   s2.selectByVisibleText("Automation_Partner");
	    log.info("Select Client as Automation_Partner" );
	
		WebElement dropdown3=driver.findElement(UserRoleDropdown);
		Select s3=new Select(dropdown3);
		s3.selectByVisibleText(Role);	    		
		log.info("Select Role as: " +Role);
		WebElement dropdown4=driver.findElement(UserTimeZoneDropdown);
		Select s4=new Select(dropdown4);
		s4.selectByVisibleText("(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo");
		log.info("Select TimeZone as '(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo'");
		WebElement dropdown5=driver.findElement(UserPrefLangDropdown);
		Select s5=new Select(dropdown5);
		s5.selectByVisibleText("English");
		log.info("Select Prefered Laungage as 'English");
		driver.findElement(UserSaveButton).click();   	
    	
    	
    	
    	
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));	
    	driver.findElement(UserQuery).clear();
    	driver.findElement(UserQuery).sendKeys(P_UserName);
    	
    	log.info("Search User");
    	driver.findElement(firstsearchUser).click();
    	log.info("Clicked first search user");
    	Thread.sleep(2000);
    	wait.until(ExpectedConditions.invisibilityOfElementLocated(UserProgress));
    	log.info("loading");
    	wait.until(ExpectedConditions.elementToBeClickable(UserDeleteButton)).click();
    	log.info("Delete button located");
    	wait.until(ExpectedConditions.alertIsPresent());
    	log.info("aleart present");
    	driver.switchTo().alert().accept();	
    	log.info("aleart accepted");
    	

    	driver.navigate().refresh();
		}
}

public void loginUser(String TestCaseName) throws InterruptedException {
	
	
	
	wait=new WebDriverWait(driver,30);		
	
		pom001_VW_logIn_Page logIn_Page=new pom001_VW_logIn_Page(driver);
	
	By dashBoardTab=By.linkText("Dashboard");
	
	

	// wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.profileDropdown)).click();
	//  	log.debug("profile drop down clicked");
	//  	Thread.sleep(6000);
	wait.until(ExpectedConditions.elementToBeClickable(logIn_Page.userName));  
	
	
	if (TestCaseName.contains("Client User")) {
		logIn_Page.getUsername().sendKeys(Client_User);	
		 log.info("Login UserName is: "+Client_User);
	} else if (TestCaseName.contains("Client Enhanced")) {
		logIn_Page.getUsername().sendKeys(Client_Enhanced);	
		 log.info("Login UserName is: "+Client_Enhanced);
		
	} else if(TestCaseName.contains("Client Developer")) {
		logIn_Page.getUsername().sendKeys(Client_Develper);	
		 log.info("Login UserName is: "+Client_Develper);
		
	} else if (TestCaseName.contains("Client Customer Admin")) {
		logIn_Page.getUsername().sendKeys(Client_Cust_Admin);
		 log.info("Login UserName is: "+Client_Cust_Admin);
		
	} else if (TestCaseName.contains("Partner User")) {
		logIn_Page.getUsername().sendKeys(Partner_User);
		 log.info("Login UserName is: "+Partner_User);
		
	} else if (TestCaseName.contains("Partner Customer Admin")) {
		logIn_Page.getUsername().sendKeys(Partner_Cust_Admin);
		 log.info("Login UserName is: "+Partner_User);
		 
	} else if (TestCaseName.contains("Partner Enhanced")) {
		logIn_Page.getUsername().sendKeys(Partner_Enhanced);	
		 log.info("Login UserName is: "+Partner_Enhanced);
	
	} else if (TestCaseName.contains("Partner Developer")) {
		logIn_Page.getUsername().sendKeys(Partner_Developer);	
		 log.info("Login UserName is: "+Partner_Developer);
	
	} else if (TestCaseName.contains("Partnered User")) {		
		logIn_Page.getUsername().sendKeys(Partnered_User);
		log.info("Passing Client_UserName: " +Partnered_User);
	
	} else if (TestCaseName.contains("Partnered Enhanced")) {		
		logIn_Page.getUsername().sendKeys(Partnered_Enhanced);
		log.info("Passing Client_UserName: " +Partnered_Enhanced);	
	}
	
 	logIn_Page.getPassword().sendKeys("123Empirix!");
	  	logIn_Page.getSignButton().click();
	
	    log.debug("Waiting for launch VoiceWatch application using above creadetails");
	    wait.until(ExpectedConditions.elementToBeClickable(dashBoardTab)).click();	    
	    Assert.assertTrue(driver.findElement(By.linkText("Back to top")).isDisplayed());
	    
	    if (TestCaseName.contains("Client User")) {
			
	    	log.info("Verified that VoiceWatch Application login successfully with Client User creadetial as: "+Client_User);
		    driver.navigate().refresh();
			
		} else if (TestCaseName.contains("Client Enhanced")) {
			log.info("Verified that VoiceWatch Application login successfully with Client Enhanced User creadetial as: "+Client_Enhanced);
		    driver.navigate().refresh();
			
		} else if(TestCaseName.contains("Client Developer")) {
			log.info("Verified that VoiceWatch Application login successfully with Client Developer creadetial as: "+Client_Develper);
		    driver.navigate().refresh();
			
		} else if (TestCaseName.contains("Client Customer Admin")) {
			log.info("Verified that VoiceWatch Application login successfully with Client Customer Admin creadetial as: "+Client_Cust_Admin);
		    driver.navigate().refresh();
			
		} else if (TestCaseName.contains("Partner User")) {
			log.info("Verified that VoiceWatch Application login successfully with Partner User creadetial as: "+Partner_User);
		     driver.navigate().refresh();
			
		} else if (TestCaseName.contains("Partner Customer Admin")) {
			log.info("Verified that VoiceWatch Application login successfully with Partner Customer User creadetial as: "+Partner_Cust_Admin);
		     driver.navigate().refresh();
		} else if (TestCaseName.contains("Partner Enhanced")) {
			log.info("Verified that VoiceWatch Application login successfully with Partner Enhanced User creadetial as: "+Partner_Enhanced);
		      driver.navigate().refresh();
		
		} else if (TestCaseName.contains("Partnered User")) {
			log.info("Verified that VoiceWatch Application login successfully with Partnered User creadetial as: "+Partnered_User);
		     driver.navigate().refresh();
			
		} 
	    
	    
	}



public void logoutUSER() throws InterruptedException {
	
	
	
	wait=new WebDriverWait(driver,30);		
	
	pom012_VW_Dashboard_Tab dashboard_Tab=new pom012_VW_Dashboard_Tab(driver);
	pom001_VW_logIn_Page logIn_Page=new pom001_VW_logIn_Page(driver);
	
	 wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.profileDropdown)).click();
		  	log.debug("profile drop down clicked");
	  	Thread.sleep(6000);
	  	wait.until(ExpectedConditions.elementToBeClickable(dashboard_Tab.Logout)).click();
	  	wait.until(ExpectedConditions.elementToBeClickable(logIn_Page.userName)); 
	

}

}
		