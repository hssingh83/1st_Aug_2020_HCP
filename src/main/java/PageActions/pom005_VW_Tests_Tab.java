package PageActions;

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

public class pom005_VW_Tests_Tab {
	private static Logger log =LogManager.getLogger(pom005_VW_Tests_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
	pom007_VW_Script_Tabs ScriptTab= new pom007_VW_Script_Tabs(driver);
	pom011_VW_Dashboard2_Tab dashboard2=new pom011_VW_Dashboard2_Tab(driver);
	
	
	By alertsTab=By.linkText("Alerts");	
	By dropdownTimeZone=By.xpath("//div[@class='input-group']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
	By testslabel=By.xpath("//*[@class='panel-heading']");
//	By testslabel=By.className("panel-heading");	
    By filterBox=By.xpath("//input[@placeholder='Filter by test name']");	
	By testCreateplusbutton=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");		
	By testlabel=By.xpath("//h4[contains(text(),'Test')]");	
	By pleaseSelectlabel=By.xpath("//span[@id='loading']");	
	By testCreateLink=By.linkText("or create a new test");	
	By saveButton=By.xpath("//div[@class='row']//button[@class='btn btn-primary btn-sm']");	
	By discardButton=By.xpath("//div[@class='row']//button[@class='btn btn-warning btn-sm']");
	By deleteButton=By.xpath("//div[@class='row']//button[@class='btn btn-danger btn-sm']");
	By checkboxEnabled=By.xpath("//input[@class='ng-valid ng-dirty ng-valid-parse ng-not-empty ng-touched']");
	By testNamelabel=By.xpath("//div[contains(text(),'Test Name')]");
	By descriptionlabel=By.xpath("//div[contains(text(),'Description')]");
	By hammerlabel=By.xpath("//div[contains(text(),'Hammer Group')]");
	By hammerGroupDefaultValue=By.xpath("//*[@ng-model='currenttest.hammer_group']");
	By taglabel=By.xpath("//span[contains(text(),'Tags')]");
	By retriesonFailureLabel=By.xpath("//div[contains(text(),'Retries on Failure')]");
	By hammerdropdown=By.className("form-control ng-pristine ng-valid ng-not-empty ng-valid-required ng-touched");
	By modifybutton=By.xpath("//span[contains(text(),'Modify')]");
	By secheduleLabel=By.xpath("//h4[contains(text(),'Schedules')]");	
	By timeZoneLabel=By.xpath("//div[contains(text(),'Time-zone')]");
	By timeZoneField=By.xpath("//div[@class='input-group']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
	By startDateLabel=By.xpath("//div[contains(text(),'Start Date')]");
	By startDateField=By.xpath("//input[@name='sDate']");
	By EndDateLabel=By.xpath("//div[contains(text(),'End Date')]");
	By EndDateField=By.xpath("//input[@name='eDate']");
	By defaultEndDate=By.xpath("//input[@name='eDate']");	
	By tieToScbscriptionCheckBox=By.xpath("//table[@class='ng-scope']//input[@class='ng-pristine ng-untouched ng-valid ng-not-empty']");
	By enabledlabel=By.xpath("//table[@class='schedule ng-scope']//th[contains(text(),'Enabled')]");	
	By descriptionBoxlabel=By.xpath("//th[contains(text(),'Description')]");	
	By descriptionField=By.xpath("//div[@class='input-group']//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
	By periodlabel=By.xpath("//th[contains(text(),'Period')]");	
	By dayslabel=By.xpath("//th[contains(text(),'Days')]");	
	By startTimelabel=By.xpath("//th[contains(text(),'Start Time')]");	
	By EndTimelabel=By.xpath("//th[contains(text(),'End Time')]");		
	By reduceSechedule=By.xpath("//table[@class='schedule ng-scope']//tr[@class='ng-scope']//td[1]");
	By addSechedule=By.xpath("//table[@class='schedule ng-scope']//span[@class='glyphicon glyphicon-plus-sign plusicon']");
	By addDescription=By.xpath("//tr[@class='ng-scope']//input[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']");
	By periodValue=By.xpath("//input[@class='ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-min ng-valid-max ng-valid-required ng-valid-maxlength']");
	By minutelabel=By.xpath("//td[contains(text(),'mins')]");	
	By sunButton=By.xpath("//span[contains(text(),'Sun')]");
	By monButton=By.xpath("//span[contains(text(),'Mon')]");
	By tueButton=By.xpath("//span[contains(text(),'Tue')]");
	By wedButton=By.xpath("//span[contains(text(),'Wed')]");
	By thuButton=By.xpath("//span[contains(text(),'Thu')]");
	By friButton=By.xpath("//span[contains(text(),'Fri')]");
	By satButton=By.xpath("//span[contains(text(),'Sat')]");	
	By startTimeValue=By.xpath("//table[@class='schedule ng-scope']//td[6]//input[1]");
	By endTimeValue=By.xpath("//td[7]//input[1]");	
	By scriptlabel=By.xpath("//h4[contains(text(),'Script')]");
	By scriptNamelabel=By.xpath("//div[@class='input-group-addon']");
	By selectaScriptDropdown=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[3]/div/div[1]/div/div/select");
	By inputParameterlabel=By.xpath("//label[contains(text(),'Input Parameters')]");
	By namelabel=By.xpath("//th[contains(text(),'Name')]");
	By valuelabel=By.xpath("//th[contains(text(),'Value')]");
	By maskedlabel=By.xpath("//th[contains(text(),'Masked')]");	
	By notificationslabel=By.xpath("//h4[contains(text(),'Notifications')]");
	By notifiCheckbox=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[4]/div/div[2]/table/tbody/tr[3]/td[3]/select");
	By notifiEnabledlabel=By.xpath("//label[contains(text(),'Notifications Enabled')]");
	By enabledBoxlabel=By.xpath("//table[@class='schedule']//th[contains(text(),'Enabled')]");
	By notifilabel=By.xpath("//th[contains(text(),'Notification')]");
	By patternlabel=By.xpath("//th[contains(text(),'Pattern')]");
	By severitylabel=By.xpath("//th[contains(text(),'Severity')]");
	By notifionrettogoodlabel=By.xpath("//th[contains(text(),'Notify on return to good')]");	
	By reduceNotifiButton=By.xpath("//span[@class='glyphicon glyphicon-minus-sign minusicon']");
	By addNotifiButton=By.xpath("//table[@class='schedule']//span[@class='glyphicon glyphicon-plus-sign plusicon']");
	By notifiDropdown=By.xpath("//td[3]//select[1]");
	By patternDropdown=By.xpath("//td[4]//select[1]");
	By patternValue=By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-valid ng-scope ng-not-empty ng-valid-min']");
	By serverityDropdown=By.xpath("//td[5]//select[1]");
	By notifionCheckbox=By.xpath("//input[@class='ng-pristine ng-untouched ng-valid ng-empty']");	
	By failThreSoldlabel=By.xpath("//h4[contains(text(),'Failure Thresholds')]");
	By primaryMetlabel=By.xpath("//a[contains(text(),'Primary Metrics')]");
	By addMetLabel=By.xpath("//a[contains(text(),'Additional Metrics')]");
	By failureEnabledlabel=By.xpath("//table[@class='table-bordered metrics ng-scope']//th[contains(text(),'Enabled')]");
	By failMetriclabel=By.xpath("//th[contains(text(),'Metric')]");
	By failCriterilabel=By.xpath("//th[contains(text(),'Criteria')]");
	By failWarrninglabel=By.xpath("//th[contains(text(),'Warning')]");
	By failCrticallabel=By.xpath("//th[contains(text(),'Critical')]");
	
	By saveButtonTestTab=By.xpath("//*[@ng-click='saveTest()']");
	
	
	
//	By cbmSaveButtonTestTab=By.xpath("//*[@title='Save test' and @type='button']");
	
	By cbmSaveButtonTestTab=By.xpath("//header//span[@class='pull-right']//span[2]//button[1]");
	
	
    
	
    
	By discardButtonTestTab=By.xpath("//*[@ng-click='discard()']");	
    By openTag=By.xpath("//*[@ng-click='openTag()']");
	By deleteButtonTestTab=By.xpath("//*[@title='Delete']");
	
	By testNameField=By.xpath("//*[@ng-model='currenttest.name' and @type='text']");	
	
	
	
	
 	By ScriptDropdown=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[3]/div/div[1]/div/div/select");	
 	
 	
 	
 	
	By viewResult=By.xpath("//div[@class='row']//button[@class='btn btn-results btn-sm ng-scope']");	
	By Pausebutton=By.xpath("//*[@id=\"em-wbs-icon-container\"]/div/div[1]/div/em-wbs-icon/div/div");		
	By dragTo=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div");		
	By updateScriptButton=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/span/span/button[3]");
	By yesDeleteButton=By.xpath("//button[@class='btn btn-danger']");
	By firstsearchTest=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']");
	By selectfirstsearch=By.xpath("//li[1][@class='nav nav-sidebar tests ng-binding ng-scope']");	
	By cbmselectfirstSearch=By.xpath("//li[@class='nav nav-sidebar tests ng-scope']");
	
	
	
	
	By TestProgress=By.xpath("//*[@class='progress-bar progress-bar-striped active']");
	
//==========================================================================================================================================	
	
	// 27.0 Object
	
	By testSelectionDropdown=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/section/select");	
	
	By testGoBuT=By.xpath("//div[@class='grid-right ng-scope']//button[@class='btn btn-primary btn-sm']");
	
	By ScriptDropdown27=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[2]/form/section[5]/div/div[1]/div/div/select");
	By firstsearchTest27=By.xpath("//div[@class='testNameDisplay ng-binding']");
	By testnowMessagePopup=By.xpath("//button[@class='btn btn-default']");
	By cbmselecthammerlabel=By.xpath("//select[@name='hammer_label']");
	By cbmselectpack=By.xpath("//select[@ng-model='currenttest.cbm_package']");
	By cbmConfid=By.xpath("//*[@id=\"_inputParam_Conference_ID\"]");
	By cbmConfpin=By.xpath("//*[@id=\"_inputParam_Conference_PIN\"]");
	By cbmMinParticipate=By.xpath("//*[@id=\"_inputParam_Minimum_Participants\"]");
	By cbmMunberToCall=By.xpath("//input[@class='form-control ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required']");
	By cbmTotalParticipate=By.xpath("//*[@id=\"_inputParam_Total_Participants\"]");
	
	
	
	
	
	String Role=pom010_VW_Notification_Tab.UserPermissionLevel;
	
	   
	//ContractorA
	
	public pom005_VW_Tests_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
//======================================================================================================================================================================
	
	public void TestsTabValidation() {	
		
	    wait=new WebDriverWait(driver,30);		
		driver.findElement(home_Page.testTab).click();
		
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(testslabel));
		Assert.assertTrue(driver.findElement(testslabel).isDisplayed());
		log.debug("Verified that 'Tests' label appeared on left side under Tests tab");
		wait.until(ExpectedConditions.elementToBeClickable(testlabel));
		Assert.assertEquals(driver.findElement(testslabel).getText().contains("Tests"), true);
	//	Assert.assertEquals(driver.findElement(testslabel).getText(), "Tests");		
		log.debug("Verified that 'Tests' Text validated on left side under Test Tab");		
		
		Assert.assertTrue(driver.findElement(filterBox).isDisplayed());
		log.debug("Verified that 'Filter by test name' box appeared on n left side under Tests tab");
		Assert.assertTrue(driver.findElement(filterBox).isEnabled());		
		log.debug("Verified that 'Filter by test name or tag filter'enabled under Alert tab");
		Assert.assertFalse(driver.findElement(filterBox).isSelected());		
		log.debug("Verified that 'Filter by test name' is blank while access test tab");
				
		Assert.assertTrue(driver.findElement(testlabel).isDisplayed());
		log.debug("Verified that 'Test' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(testlabel).getText(), "Test");		
		log.debug("Verified that 'Test' Text validated under Test Tab");	
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a test' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a test");		
		log.debug("Verified that 'Please select a test ' Text validated under Test Tab");
	    String count=driver.findElement(testslabel).getText();
		//	log.debug("Script header contain "+count);
			String[] part = count.split("(?<=\\D)(?=\\d)");		
		//	log.debug("spilled value "+part[1]);	
			int Count=driver.findElements(firstsearchTest).size();
		//	log.debug("Script Count "+Count);	
			String TestActualCount =String.valueOf(Count);	
		//	log.debug("integer converted as: "+ScriptActualCount);	
			
			Assert.assertEquals(part[1], TestActualCount);		
			log.debug("Verified that script count found correct: "+TestActualCount);	
			
			if (Count>0) {
				
			//	driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
				driver.findElement(selectfirstsearch).click();
									
				log.debug("firstScriptClicked");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(TestProgress));
				log.info("found progress bar loading");
				wait.until(ExpectedConditions.elementToBeClickable(viewResult));
				Assert.assertTrue(driver.findElement(viewResult).isDisplayed());
				log.info("ViewResult button displayed found");
				Assert.assertTrue(driver.findElement(viewResult).isEnabled());
				log.info("ViewResult button enabled found");
				
				if (Role.equals("User")) {
					
				
				
				Assert.assertTrue(driver.findElement(testNameField).isDisplayed());
				log.debug("Verified that 'TestName' field displayed under Tests tab");	
				Assert.assertFalse(driver.findElement(testNameField).isEnabled());
				log.debug("Verified that 'Test Name' field disbaled under Tests tab");
				Assert.assertTrue(driver.findElement(descriptionField).isDisplayed());
				log.debug("Verified that 'Description' field displayed under Tests tab");	
				Assert.assertFalse(driver.findElement(descriptionField).isEnabled());
				log.debug("Verified that 'description' field disbaled under Tests tab");
				Assert.assertTrue(driver.findElement(hammerGroupDefaultValue).isDisplayed());
				log.debug("Verified that 'Hammer group' field displayed under Tests tab");	
				Assert.assertFalse(driver.findElement(hammerGroupDefaultValue).isEnabled());
				log.debug("Verified that 'Hammer group' field disabled under Tests tab");	
				Assert.assertTrue(driver.findElement(timeZoneField).isDisplayed());
				log.debug("Verified that 'Timezone' dropdown field displayed under Tests tab");	
				Assert.assertFalse(driver.findElement(timeZoneField).isEnabled());
				log.debug("Verified that 'Timezone' dropdown field disabled under Tests tab");	
				Assert.assertTrue(driver.findElement(startDateField).isDisplayed());
				log.debug("Verified that 'Start Date' field displayed under Tests tab");	
				Assert.assertFalse(driver.findElement(startDateField).isEnabled());
				log.debug("Verified that 'Timezone' dropdown field disabled under Tests tab");	
				Assert.assertTrue(driver.findElement(EndDateField).isDisplayed());
				log.debug("Verified that 'TestName' field displayed under Tests tab");	
				Assert.assertFalse(driver.findElement(EndDateField).isEnabled());
				log.debug("Verified that 'End Date' field disbaled under Tests tab");	
				Assert.assertTrue(driver.findElement(notifiDropdown).isDisplayed());
				log.debug("Verified that 'notification' dropdown field displayed under Tests tab");	
				Assert.assertFalse(driver.findElement(notifiDropdown).isEnabled());
				log.debug("Verified that 'notification' dropdown field disbaled under Tests tab");	
				
				}			
				
									
				log.info("Test Filter by name feature is working as desired");
				
			}else {
				
				log.info("No script available");
				}		
		
			if (driver.findElements(saveButton).isEmpty()){
				
				log.info("Save button not found under this credetials");
			  
			} else {
			Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
			log.info("Save button found");
			Assert.assertFalse(driver.findElement(saveButton).isEnabled());
			log.info("Save button disabled");
			Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
			log.info("discard button found");
			Assert.assertFalse(driver.findElement(discardButton).isEnabled());
			log.info("discard button disabled");
			
			}
	
//================================================Validated using button================================================================================	


		    driver.findElement(home_Page.testTab).click();
				
			if (driver.findElements(testCreateLink).isEmpty()) {	
	//		if (driver.findElements(testCreateplusbutton).isEmpty()) {
		
		log.debug("Verified that new test creation plus (+) icon not appeared on top left side under Tests tab");	
		
					
	}else
	
	{
		log.debug("Verified that new test creation plus (+) icon appeared on top left side under Tests tab");	  

	log.debug("Validated the different elements while click Test Creation using button (+)");
	
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();	
	
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Tests tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Test Tab");	
	
	Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
	log.debug("Verified that 'Discard button' displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(discardButton).isEnabled());
	log.debug("Verified that 'Discard button' is disbaled under Tests tab");	
	Assert.assertEquals(driver.findElement(discardButton).getText(), "Discard");		
	log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
	

	
    if (driver.findElements(deleteButton).isEmpty()) {
		
		log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
		
					
	}else
	
	{
		log.debug("Verified that 'Delete button' displayed under Tests tab");	
		
	}
	
			
	Assert.assertTrue(driver.findElement(testNamelabel).isDisplayed());
	log.debug("Verified that 'Test Name' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(testNamelabel).getText(), "Test Name");		
	log.debug("Verified that 'Test Name' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(descriptionlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(hammerlabel).isDisplayed());
	log.debug("Verified that 'Hammer Group Name' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(hammerlabel).getText(), "Hammer Group");		
	log.debug("Verified that 'Hammer Group' Text validated under Test Tab");
	
	/*WebElement dropdown0 = driver.findElement(hammerGroupDefaultValue);
		 
        Select s = new Select(dropdown0); 
        Assert.assertFalse(s.isMultiple());
       java.util.List<WebElement> options = s.getOptions(); 
       
      
       log.debug("Verified that following values available in the dropdown"); 
      
        for(WebElement item:options) 
        { 
        	for (int i = 0; i <options.size(); i++) {   		        		
        					
        						    
        			log.debug(""+item.getText());
        			     
     
                   	}
        		}
        */
        	
	
/*//	Assert.assertEquals(driver.findElement(hammerGroupDefaultValue).getText(), "us_hammers");
	log.debug("Verified that 'us_hammers' default value as Hammer Group under Test Tab");
	        
    
	 String[] exp = {"(GMT -12:00) Eniwetok, Kwajalein","(GMT -11:00) Midway Island, Samoa","(GMT -10:00) Hawaii","(GMT -9:00) Alaska","(GMT -8:00) Pacific Time (US & Canada)","(GMT -7:00) Mountain Time (US & Canada)","(GMT -7:00) Arizona Time (US & Canada)","(GMT -6:00) Central Time (US & Canada), Mexico City","(GMT -5:00) Eastern Time (US & Canada)","(GMT -5:00) Bogota, Lima","(GMT -4:30) Caracas","(GMT -4:00) Atlantic Time (Canada)","(GMT -4:00) Santiago","(GMT -4:00) Georgetown, La Paz","(GMT -3:30) Newfoundland","(GMT -3:00) Buenos Aires","(GMT -3:00) Sao Paulo", "(GMT -2:00) Mid-Atlantic","(GMT -1:00 hour) Azores, Cape Verde Islands","(GMT) Western Europe Time, London, Lisbon, Casablanca, Greenwich","(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris","(GMT +2:00) Kaliningrad, South Africa, Cairo","(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg","(GMT +3:30) Tehran","(GMT +4:00) Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi","(GMT +4:30) Kabul","(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent","(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo","(GMT +5:45) Kathmandu","(GMT +6:00) Almaty, Dhaka","(GMT +6:30) Yangon, Cocos Islands","(GMT +7:00) Bangkok, Hanoi, Jakarta","(GMT +8:00) Beijing, Perth, Singapore, Hong Kong","(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk","(GMT +9:30) Adelaide, Darwin","(GMT +10:00) Eastern Australia, Guam, Vladivostok, Magadan","(GMT +11:00) Solomon Islands, New Caledonia","(GMT +12:00) Auckland, Wellington"};
	// System.out.println(exp.length);
	 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
	 
	 WebElement dropdown = driver.findElement(dropdownTimeZone); 
	
//	 System.out.println(dropdown.getSize());
	 
    Select s1 = new Select(dropdown); 
    Assert.assertFalse(s1.isMultiple());
   java.util.List<WebElement> options1 = s1.getOptions(); 
   
  
   log.debug("Verified that following values available in the dropdown"); 
  
    for(WebElement item:options1) 
    { 
    	for (int i = 0; i <options1.size(); i++) {
    		        		
    		if (item.getText().equals(exp[i])) {
    			
    						    
    			log.debug(""+item.getText());
    			
    			//		 System.out.println("hello i am hari" +item.getText());  
    			 
    			 Assert.assertEquals(item.getText(),exp[i]);
 
               	}
    		}
    
    }
   */
    Assert.assertTrue(driver.findElement(secheduleLabel).isDisplayed());
	log.debug("Verified that 'Schedules' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(secheduleLabel).getText(), "Schedules");		
	log.debug("Verified that 'Schedules' Text validated under Test Tab");
    
	 Assert.assertTrue(driver.findElement(timeZoneLabel).isDisplayed());
	log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(timeZoneLabel).getText(), "Time-zone");		
	log.debug("Verified that 'Time-Zone' Text validated under Test Tab");
		
    Assert.assertTrue(driver.findElement(startDateLabel).isDisplayed());
	log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(startDateLabel).getText(), "Start Date");		
	log.debug("Verified that 'Start Date' Text validated under Test Tab");
        
    
    
	Assert.assertTrue(driver.findElement(startDateField).isDisplayed());
	log.debug("Verified that 'Start Date' displayed on under Tests tab");			
	Assert.assertTrue(driver.findElement(startDateField).isEnabled());
	log.debug("Verified that 'Start Date' enabled on under Tests tab");	
	
    Assert.assertTrue(driver.findElement(EndDateLabel).isDisplayed());
	log.debug("Verified that 'End Date' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(EndDateLabel).getText(), "End Date");		
	log.debug("Verified that 'End Date' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(defaultEndDate).isDisplayed());
	log.debug("Verified that 'Start Date' displayed on under Tests tab");			
	Assert.assertFalse(driver.findElement(defaultEndDate).isEnabled());
	log.debug("Verified that 'Start Date' enabled on under Tests tab");	
	
	Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isDisplayed());
	log.debug("Verified that 'Tie To Scbscription' CheckBox appeared in Test tab");			
	Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isEnabled());
	log.debug("Verified that 'Tie To Scbscription' CheckBox enabled in Test tab");	
	Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isSelected());
	log.debug("Verified that 'Tie To Scbscription' CheckBox selected in Test tab");	
	
	Assert.assertTrue(driver.findElement(enabledlabel).isDisplayed());
	log.debug("Verified that 'Enabled' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(enabledlabel).getText(), "Enabled");		
	log.debug("Verified that 'Enabled' Text validated under Test Tab");
	
	 Assert.assertTrue(driver.findElement(descriptionBoxlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(descriptionBoxlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated under Test Tab");
		
	Assert.assertTrue(driver.findElement(periodlabel).isDisplayed());
	log.debug("Verified that 'Period' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(periodlabel).getText(), "Period");		
	log.debug("Verified that 'Period' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(dayslabel).isDisplayed());
	log.debug("Verified that 'Day' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(dayslabel).getText(), "Days");		
	log.debug("Verified that 'Days' Text validated under Test Tab");
				
	Assert.assertTrue(driver.findElement(startTimelabel).isDisplayed());
	log.debug("Verified that 'Start Time' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(startTimelabel).getText(), "Start Time");		
	log.debug("Verified that 'Start Time' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(EndTimelabel).isDisplayed());
	log.debug("Verified that 'End Time' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(EndTimelabel).getText(), "End Time");		
	log.debug("Verified that 'End Time' Text validated under Test Tab");		
	
	
	
	Assert.assertTrue(driver.findElement(reduceSechedule).isDisplayed());
	log.debug("Verified that '(-)' button appeared to remove configured sechedule");			
	Assert.assertTrue(driver.findElement(reduceSechedule).isEnabled());
	log.debug("Verified that '(-)' button enabled under sechedule section");	
	
	Assert.assertTrue(driver.findElement(addSechedule).isDisplayed());
	log.debug("Verified that '(+)' button appeared to add new configured sechedule");			
	Assert.assertTrue(driver.findElement(addSechedule).isEnabled());
	log.debug("Verified that '(+)' button enabled under sechedule section");	
	
	 Assert.assertTrue(driver.findElement(addDescription).isDisplayed());
	log.debug("Verified that 'Description' field appered under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(addDescription).isEnabled());		
	log.debug("Verified that 'Description' field is enabled under Sechedule section in test tab");
        
	 Assert.assertTrue(driver.findElement(periodValue).isDisplayed());
	log.debug("Verified that 'period' field appeared under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(periodValue).isEnabled());		
	log.debug("Verified that 'period' value field is enabled under Sechedule section in test tab");	
	
	 Assert.assertTrue(driver.findElement(minutelabel).isDisplayed());
	log.debug("Verified that 'Minute' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(minutelabel).getText(), "mins");		
	log.debug("Verified that 'Mins' Text validated under Test Tab");
	
	 Assert.assertTrue(driver.findElement(sunButton).isDisplayed());
	log.debug("Verified that 'Sunday' button appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(sunButton).getText(), "Sun");		
	log.debug("Verified that 'sun' Text appeared on the button under Test Tab");
	Assert.assertTrue(driver.findElement(sunButton).isEnabled());
	log.debug("Verified that 'Sun' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(monButton).isDisplayed());
	log.debug("Verified that 'Monday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(monButton).getText(), "Mon");		
	log.debug("Verified that 'mon' Text appeared on the button under Test Tab");
	Assert.assertTrue(driver.findElement(monButton).isEnabled());
	log.debug("Verified that 'Mon' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(tueButton).isDisplayed());
	log.debug("Verified that 'Tuesday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(tueButton).getText(), "Tue");		
	log.debug("Verified that 'Tue' Text appeared on the button under Test Tab");
	Assert.assertTrue(driver.findElement(tueButton).isEnabled());
	log.debug("Verified that 'Tue' button enabled under sechedule section");
				
	Assert.assertTrue(driver.findElement(wedButton).isDisplayed());
	log.debug("Verified that 'Wednessday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(wedButton).getText(), "Wed");		
	log.debug("Verified that 'Wed' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(wedButton).isEnabled());
	log.debug("Verified that 'Wed' button enabled under sechedule section");
	
					
	Assert.assertTrue(driver.findElement(thuButton).isDisplayed());
	log.debug("Verified that 'Thrusday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(thuButton).getText(), "Thu");		
	log.debug("Verified that 'Thu' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(thuButton).isEnabled());
	log.debug("Verified that 'Thu' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(friButton).isDisplayed());
	log.debug("Verified that 'Friday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(friButton).getText(), "Fri");		
	log.debug("Verified that 'Fri' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(friButton).isEnabled());
	log.debug("Verified that 'Fri' button enabled under sechedule section");
	
	
	Assert.assertTrue(driver.findElement(satButton).isDisplayed());
	log.debug("Verified that 'Satarday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(satButton).getText(), "Sat");		
	log.debug("Verified that 'Sat' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(satButton).isEnabled());
	log.debug("Verified that 'Sat' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(startTimeValue).isDisplayed());
	log.debug("Verified that 'Start Time' filled appeared under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(startTimeValue).isEnabled());
	log.debug("Verified that 'Start Time' filled enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(endTimeValue).isDisplayed());
	log.debug("Verified that 'End Time Value' filled appeared under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(endTimeValue).isEnabled());
	log.debug("Verified that 'End Time Value filled enabled under sechedule section");
	
	//-------------------------------------------------------------------------------------------------------------------
	
	Assert.assertTrue(driver.findElement(scriptlabel).isDisplayed());
	log.debug("Verified that 'Script' label appeared under test tab");		
	Assert.assertEquals(driver.findElement(scriptlabel).getText(), "Script");		
	log.debug("Verified that 'Script' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared under script section in test tab");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script Name' Text validated under Test Tab");
	
// Script Drop Down	

	/*	 log.debug("Verified that script dropdown"); 			 
		 WebElement scriptdropdown = driver.findElement(selectaScriptDropdown); 			
	//	 System.out.println(dropdown.getSize());			 
        Select scripts1 = new Select(scriptdropdown); 	        
        Assert.assertFalse(scripts1.isMultiple());	        
       java.util.List<WebElement> options2 = scripts1.getOptions();    
      log.debug("Verified that following values available in the dropdown"); 
          for(WebElement item1:options1) 
        { 
        	for (int i = 0; i <options2.size(); i++) {          		
        		log.debug(""+item1.getText());      			   			
     
                   	}
        		}*/

	
    Assert.assertTrue(driver.findElement(inputParameterlabel).isDisplayed());
		log.debug("Verified that 'Input Parameters' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(inputParameterlabel).getText(), "Input Parameters");		
		log.debug("Verified that 'Input Parameters' Text validated under Test Tab");
	
    Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
		log.debug("Verified that 'Name' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(namelabel).getText(), "Name");		
		log.debug("Verified that 'Name' Text validated under Test Tab");
		
    Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
		log.debug("Verified that 'Value' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(valuelabel).getText(), "Value");		
		log.debug("Verified that 'Value' Text validated under Test Tab");
		
    Assert.assertTrue(driver.findElement(maskedlabel).isDisplayed());
		log.debug("Verified that 'Masked' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(maskedlabel).getText(), "Masked");		
		log.debug("Verified that 'Masked' Text validated under Test Tab");
		
		
		Assert.assertTrue(driver.findElement(notificationslabel).isDisplayed());
		log.debug("Verified that 'Notifications' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(notificationslabel).getText(), "Notifications");		
		log.debug("Verified that 'Notifications' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
		log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
		Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
		log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");			
	
   
	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			


Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");	

Assert.assertTrue(driver.findElement(notifiEnabledlabel).isDisplayed());
log.debug("Verified that 'Notification' label appeared in notification dropdown in test tab");		
Assert.assertEquals(driver.findElement(notifiEnabledlabel).getText(), "Notifications Enabled");		
log.debug("Verified that 'Notifications Enabled' Text validated in notification dropdown in test tab");	

Assert.assertTrue(driver.findElement(patternlabel).isDisplayed());
log.debug("Verified that 'Pattern' label appeared under Notification in test tab");		
Assert.assertEquals(driver.findElement(patternlabel).getText(), "Pattern");		
log.debug("Verified that 'Pattern' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(severitylabel).isDisplayed());
log.debug("Verified that 'Severity' label appeared under Notification in test tab");	
Assert.assertEquals(driver.findElement(severitylabel).getText(), "Severity");		
log.debug("Verified that 'Severity' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(notifionrettogoodlabel).isDisplayed());
log.debug("Verified that 'Notify on return to good' label appeared under Notification in test tab");		
Assert.assertEquals(driver.findElement(notifionrettogoodlabel).getText(), "Notify on return to good");		
log.debug("Verified that 'Notify on return to good' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(reduceNotifiButton).isDisplayed());
log.debug("Verified that '(-) reduce notification button appeared under notification in Test tab");			
Assert.assertTrue(driver.findElement(reduceNotifiButton).isEnabled());
log.debug("Verified that '(-) reduce notification button enabled under notification in Test tab");			
  		
		
Assert.assertTrue(driver.findElement(addNotifiButton).isDisplayed());
log.debug("Verified that '(+) add notification button appeared under notification in Test tab");			
Assert.assertTrue(driver.findElement(addNotifiButton).isEnabled());
log.debug("Verified that '(+) add notification button enabled under notification in Test tab");			


	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			

// Notification Drop Down	
	
/*		 log.debug("Verified that Notification dropdown"); 		 
		 WebElement notifidropdown = driver.findElement(notifiDropdown);		
	//	 System.out.println(dropdown.getSize());		 
       Select notifi1 = new Select(notifidropdown);        
       Assert.assertFalse(notifi1.isMultiple());       
      java.util.List<WebElement> options3 = notifi1.getOptions();   
     
      log.debug("Verified that following values available in the dropdown");      
       for(WebElement item2:options3) 
       { 
       	for (int i = 0; i <options3.size(); i++) {        		
       					        						    
       			log.debug(""+item2.getText());      			   			
    
                  	}
       		}
*/
    // Pattern Drop Down	
		
/*		 log.debug("Verified that Notification dropdown"); 		 
		 WebElement Patterndropdown = driver.findElement(patternDropdown);		
	//	 System.out.println(dropdown.getSize());		 
       Select pattern1 = new Select(Patterndropdown);        
       Assert.assertFalse(pattern1.isMultiple());       
      java.util.List<WebElement> options4 = pattern1.getOptions();   
     
      log.debug("Verified that following values available in the dropdown");      
       for(WebElement item3:options4) 
       { 
       	for (int i = 0; i <options4.size(); i++) {        		
       					        						    
       			log.debug(""+item3.getText());      			   			
    
                  	}
       		}*/
	
     Assert.assertTrue(driver.findElement(patternValue).isDisplayed());
   	log.debug("Verified that 'Pattern' filled appeared under Notification in test tab");		 
   	Assert.assertTrue(driver.findElement(patternValue).isEnabled());
   	log.debug("Verified that 'Pattern' filled enabled under Notification in test tab");
       
 // Severty Drop Down	
/*		
	 log.debug("Verified that Severity dropdown"); 		 
	 WebElement severitydropdown = driver.findElement(serverityDropdown);		
//	 System.out.println(dropdown.getSize());		 
  Select severity1 = new Select(severitydropdown);        
  Assert.assertFalse(severity1.isMultiple());       
 java.util.List<WebElement> options5 = severity1.getOptions();   

 log.debug("Verified that following values available in the dropdown");      
  for(WebElement item4:options5) 
  { 
  	for (int i = 0; i <options5.size(); i++) {        		
  					        						    
  			log.debug(""+item4.getText());      			   			

             	}
  		} */

 Assert.assertTrue(driver.findElement(notifionCheckbox).isDisplayed());
	log.debug("Verified that 'Notify on return to good' Checkbox appeared under Notification in test tab");		 
	Assert.assertTrue(driver.findElement(notifionCheckbox).isEnabled());
	log.debug("Verified that 'Notify on return to good' checkbox enabled under notification in Test tab");			
	   

Assert.assertTrue(driver.findElement(failThreSoldlabel).isDisplayed());
log.debug("Verified that 'Failure Thresholds' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(failThreSoldlabel).getText(), "Failure Thresholds");		
log.debug("Verified that 'Failure Thresholds' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(primaryMetlabel).isDisplayed());
log.debug("Verified that 'Primary Metrics' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(primaryMetlabel).getText(), "Primary Metrics");		
log.debug("Verified that 'Primary Metrics' Text validated under Test Tab");
	
Assert.assertTrue(driver.findElement(addMetLabel).isDisplayed());
log.debug("Verified that 'Additional Metrics' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(addMetLabel).getText(), "Additional Metrics");		
log.debug("Verified that 'Additional Metrics' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(failureEnabledlabel).isDisplayed());
log.debug("Verified that 'Enabled' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failureEnabledlabel).getText(), "Enabled");		
log.debug("Verified that 'Enabled' text validated in Tests tab");		
       
Assert.assertTrue(driver.findElement(failMetriclabel).isDisplayed());
log.debug("Verified that 'Metric' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failMetriclabel).getText(), "Metric");		
log.debug("Verified that 'Metric' text validated in Tests tab");	

Assert.assertTrue(driver.findElement(failCriterilabel).isDisplayed());
log.debug("Verified that 'Criteria' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failCriterilabel).getText(), "Criteria");		
log.debug("Verified that 'Criteria' text validated in Tests tab");

Assert.assertTrue(driver.findElement(failWarrninglabel).isDisplayed());
log.debug("Verified that 'Warning' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failWarrninglabel).getText(), "Warning");		
log.debug("Verified that 'Warning' text validated in Tests tab");

Assert.assertTrue(driver.findElement(failCrticallabel).isDisplayed());
log.debug("Verified that 'Critical' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failCrticallabel).getText(), "Critical");		
log.debug("Verified that 'Critical' text validated in Tests tab");

Assert.assertTrue(driver.findElement(saveButtonTestTab).isDisplayed());
log.debug("Verified that 'Save' button displayed under Tests tab");	
Assert.assertFalse(driver.findElement(saveButtonTestTab).isEnabled());
log.debug("Verified that 'Save' button' is enabled under Tests tab");	
Assert.assertEquals(driver.findElement(saveButtonTestTab).getText(), "Save");		
log.debug("Verified that 'Save' Text appeared on save button under Test Tab");

Assert.assertTrue(driver.findElement(discardButtonTestTab).isDisplayed());
log.debug("Verified that 'Discard' button displayed under Tests tab");	
Assert.assertFalse(driver.findElement(discardButtonTestTab).isEnabled());
log.debug("Verified that 'Discard' button' is enabled under Tests tab");	
Assert.assertEquals(driver.findElement(discardButtonTestTab).getText(), "Discard");		
log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");


if (driver.findElements(deleteButtonTestTab).isEmpty()) {
	
	log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
	
				
}else

{
	log.debug("Verified that 'Delete button' displayed under Tests tab");	
	
}
	}

      
    
//====================Validated using Link============================================================			

		
		driver.findElement(home_Page.testTab).click();	   


if (driver.findElements(testCreateLink).isEmpty()) {
	
	log.debug("Verified that new test creation Link not appeared on top left side under Tests tab");	
	
	
}else

{
	log.debug("Verified that new test creation Link appeared on top left side under Tests tab");	  

log.debug("Validated the different elements while click Test Creation Link");

wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();	

Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
log.debug("Verified that 'Save button' displayed under Tests tab");	
Assert.assertFalse(driver.findElement(saveButton).isEnabled());
log.debug("Verified that 'Save button' is disbaled under Tests tab");	
Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
log.debug("Verified that 'Save' Text appeared on save button under Test Tab");	

Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
log.debug("Verified that 'Discard button' displayed under Tests tab");	
Assert.assertFalse(driver.findElement(discardButton).isEnabled());
log.debug("Verified that 'Discard button' is disbaled under Tests tab");	
Assert.assertEquals(driver.findElement(discardButton).getText(), "Discard");		
log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");



if (driver.findElements(deleteButton).isEmpty()) {
	
	log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
	
				
}else

{
	log.debug("Verified that 'Delete button' displayed under Tests tab");	
	
}

		
Assert.assertTrue(driver.findElement(testNamelabel).isDisplayed());
log.debug("Verified that 'Test Name' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(testNamelabel).getText(), "Test Name");		
log.debug("Verified that 'Test Name' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
log.debug("Verified that 'Description' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(descriptionlabel).getText(), "Description");		
log.debug("Verified that 'Description' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(hammerlabel).isDisplayed());
log.debug("Verified that 'Hammer Group Name' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(hammerlabel).getText(), "Hammer Group");		
log.debug("Verified that 'Hammer Group' Text validated under Test Tab");

/*WebElement dropdown0 = driver.findElement(hammerGroupDefaultValue);
	 
    Select s = new Select(dropdown0); 
    Assert.assertFalse(s.isMultiple());
   java.util.List<WebElement> options = s.getOptions(); 
   
  
   log.debug("Verified that following values available in the dropdown"); 
  
    for(WebElement item:options) 
    { 
    	for (int i = 0; i <options.size(); i++) {   		        		
    					
    						    
    			log.debug(""+item.getText());
    			     
 
               	}
    		}*/
    
    	

//Assert.assertEquals(driver.findElement(hammerGroupDefaultValue).getText(), "us_hammers");
log.debug("Verified that 'us_hammers' default value as Hammer Group under Test Tab");
        
/*   
 String[] exp = {"(GMT -12:00) Eniwetok, Kwajalein","(GMT -11:00) Midway Island, Samoa","(GMT -10:00) Hawaii","(GMT -9:00) Alaska","(GMT -8:00) Pacific Time (US & Canada)","(GMT -7:00) Mountain Time (US & Canada)","(GMT -7:00) Arizona Time (US & Canada)","(GMT -6:00) Central Time (US & Canada), Mexico City","(GMT -5:00) Eastern Time (US & Canada)","(GMT -5:00) Bogota, Lima","(GMT -4:30) Caracas","(GMT -4:00) Atlantic Time (Canada)","(GMT -4:00) Santiago","(GMT -4:00) Georgetown, La Paz","(GMT -3:30) Newfoundland","(GMT -3:00) Buenos Aires","(GMT -3:00) Sao Paulo", "(GMT -2:00) Mid-Atlantic","(GMT -1:00 hour) Azores, Cape Verde Islands","(GMT) Western Europe Time, London, Lisbon, Casablanca, Greenwich","(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris","(GMT +2:00) Kaliningrad, South Africa, Cairo","(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg","(GMT +3:30) Tehran","(GMT +4:00) Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi","(GMT +4:30) Kabul","(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent","(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo","(GMT +5:45) Kathmandu","(GMT +6:00) Almaty, Dhaka","(GMT +6:30) Yangon, Cocos Islands","(GMT +7:00) Bangkok, Hanoi, Jakarta","(GMT +8:00) Beijing, Perth, Singapore, Hong Kong","(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk","(GMT +9:30) Adelaide, Darwin","(GMT +10:00) Eastern Australia, Guam, Vladivostok, Magadan","(GMT +11:00) Solomon Islands, New Caledonia","(GMT +12:00) Auckland, Wellington"};
// System.out.println(exp.length);
 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
 
 WebElement dropdown = driver.findElement(dropdownTimeZone); 

// System.out.println(dropdown.getSize());
 
Select s1 = new Select(dropdown); 
Assert.assertFalse(s1.isMultiple());
java.util.List<WebElement> options1 = s1.getOptions(); 


log.debug("Verified that following values available in the dropdown"); 

for(WebElement item:options1) 
{ 
	for (int i = 0; i <options1.size(); i++) {
		        		
		if (item.getText().equals(exp[i])) {
			
						    
			log.debug(""+item.getText());
			
			//		 System.out.println("hello i am hari" +item.getText());  
			 
			 Assert.assertEquals(item.getText(),exp[i]);

           	}
		}

}*/

Assert.assertTrue(driver.findElement(secheduleLabel).isDisplayed());
log.debug("Verified that 'Schedules' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(secheduleLabel).getText(), "Schedules");		
log.debug("Verified that 'Schedules' Text validated under Test Tab");

 Assert.assertTrue(driver.findElement(timeZoneLabel).isDisplayed());
log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(timeZoneLabel).getText(), "Time-zone");		
log.debug("Verified that 'Time-Zone' Text validated under Test Tab");
	
Assert.assertTrue(driver.findElement(startDateLabel).isDisplayed());
log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(startDateLabel).getText(), "Start Date");		
log.debug("Verified that 'Start Date' Text validated under Test Tab");
    


Assert.assertTrue(driver.findElement(startDateField).isDisplayed());
log.debug("Verified that 'Start Date' displayed on under Tests tab");			
Assert.assertTrue(driver.findElement(startDateField).isEnabled());
log.debug("Verified that 'Start Date' enabled on under Tests tab");	

Assert.assertTrue(driver.findElement(EndDateLabel).isDisplayed());
log.debug("Verified that 'End Date' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(EndDateLabel).getText(), "End Date");		
log.debug("Verified that 'End Date' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(defaultEndDate).isDisplayed());
log.debug("Verified that 'Start Date' displayed on under Tests tab");			
Assert.assertFalse(driver.findElement(defaultEndDate).isEnabled());
log.debug("Verified that 'Start Date' enabled on under Tests tab");	

Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isDisplayed());
log.debug("Verified that 'Tie To Scbscription' CheckBox appeared in Test tab");			
Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isEnabled());
log.debug("Verified that 'Tie To Scbscription' CheckBox enabled in Test tab");	
Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isSelected());
log.debug("Verified that 'Tie To Scbscription' CheckBox selected in Test tab");	

Assert.assertTrue(driver.findElement(enabledlabel).isDisplayed());
log.debug("Verified that 'Enabled' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(enabledlabel).getText(), "Enabled");		
log.debug("Verified that 'Enabled' Text validated under Test Tab");

 Assert.assertTrue(driver.findElement(descriptionBoxlabel).isDisplayed());
log.debug("Verified that 'Description' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(descriptionBoxlabel).getText(), "Description");		
log.debug("Verified that 'Description' Text validated under Test Tab");
	
Assert.assertTrue(driver.findElement(periodlabel).isDisplayed());
log.debug("Verified that 'Period' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(periodlabel).getText(), "Period");		
log.debug("Verified that 'Period' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(dayslabel).isDisplayed());
log.debug("Verified that 'Day' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(dayslabel).getText(), "Days");		
log.debug("Verified that 'Days' Text validated under Test Tab");
			
Assert.assertTrue(driver.findElement(startTimelabel).isDisplayed());
log.debug("Verified that 'Start Time' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(startTimelabel).getText(), "Start Time");		
log.debug("Verified that 'Start Time' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(EndTimelabel).isDisplayed());
log.debug("Verified that 'End Time' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(EndTimelabel).getText(), "End Time");		
log.debug("Verified that 'End Time' Text validated under Test Tab");		



Assert.assertTrue(driver.findElement(reduceSechedule).isDisplayed());
log.debug("Verified that '(-)' button appeared to remove configured sechedule");			
Assert.assertTrue(driver.findElement(reduceSechedule).isEnabled());
log.debug("Verified that '(-)' button enabled under sechedule section");	

Assert.assertTrue(driver.findElement(addSechedule).isDisplayed());
log.debug("Verified that '(+)' button appeared to add new configured sechedule");			
Assert.assertTrue(driver.findElement(addSechedule).isEnabled());
log.debug("Verified that '(+)' button enabled under sechedule section");	

 Assert.assertTrue(driver.findElement(addDescription).isDisplayed());
log.debug("Verified that 'Description' field appered under Sechedule section in test tab");		
Assert.assertTrue(driver.findElement(addDescription).isEnabled());		
log.debug("Verified that 'Description' field is enabled under Sechedule section in test tab");
    
 Assert.assertTrue(driver.findElement(periodValue).isDisplayed());
log.debug("Verified that 'period' field appeared under Sechedule section in test tab");		
Assert.assertTrue(driver.findElement(periodValue).isEnabled());		
log.debug("Verified that 'period' value field is enabled under Sechedule section in test tab");	

 Assert.assertTrue(driver.findElement(minutelabel).isDisplayed());
log.debug("Verified that 'Minute' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(minutelabel).getText(), "mins");		
log.debug("Verified that 'Mins' Text validated under Test Tab");

 Assert.assertTrue(driver.findElement(sunButton).isDisplayed());
log.debug("Verified that 'Sunday' button appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(sunButton).getText(), "Sun");		
log.debug("Verified that 'sun' Text appeared on the button under Test Tab");
Assert.assertTrue(driver.findElement(sunButton).isEnabled());
log.debug("Verified that 'Sun' button enabled under sechedule section");

Assert.assertTrue(driver.findElement(monButton).isDisplayed());
log.debug("Verified that 'Monday' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(monButton).getText(), "Mon");		
log.debug("Verified that 'mon' Text appeared on the button under Test Tab");
Assert.assertTrue(driver.findElement(monButton).isEnabled());
log.debug("Verified that 'Mon' button enabled under sechedule section");

Assert.assertTrue(driver.findElement(tueButton).isDisplayed());
log.debug("Verified that 'Tuesday' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(tueButton).getText(), "Tue");		
log.debug("Verified that 'Tue' Text appeared on the button under Test Tab");
Assert.assertTrue(driver.findElement(tueButton).isEnabled());
log.debug("Verified that 'Tue' button enabled under sechedule section");
			
Assert.assertTrue(driver.findElement(wedButton).isDisplayed());
log.debug("Verified that 'Wednessday' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(wedButton).getText(), "Wed");		
log.debug("Verified that 'Wed' Text validated under Test Tab");
Assert.assertTrue(driver.findElement(wedButton).isEnabled());
log.debug("Verified that 'Wed' button enabled under sechedule section");

				
Assert.assertTrue(driver.findElement(thuButton).isDisplayed());
log.debug("Verified that 'Thrusday' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(thuButton).getText(), "Thu");		
log.debug("Verified that 'Thu' Text validated under Test Tab");
Assert.assertTrue(driver.findElement(thuButton).isEnabled());
log.debug("Verified that 'Thu' button enabled under sechedule section");

Assert.assertTrue(driver.findElement(friButton).isDisplayed());
log.debug("Verified that 'Friday' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(friButton).getText(), "Fri");		
log.debug("Verified that 'Fri' Text validated under Test Tab");
Assert.assertTrue(driver.findElement(friButton).isEnabled());
log.debug("Verified that 'Fri' button enabled under sechedule section");


Assert.assertTrue(driver.findElement(satButton).isDisplayed());
log.debug("Verified that 'Satarday' label appeared under Sechedule section in test tab");		
Assert.assertEquals(driver.findElement(satButton).getText(), "Sat");		
log.debug("Verified that 'Sat' Text validated under Test Tab");
Assert.assertTrue(driver.findElement(satButton).isEnabled());
log.debug("Verified that 'Sat' button enabled under sechedule section");

Assert.assertTrue(driver.findElement(startTimeValue).isDisplayed());
log.debug("Verified that 'Start Time' filled appeared under Sechedule section in test tab");		
Assert.assertTrue(driver.findElement(startTimeValue).isEnabled());
log.debug("Verified that 'Start Time' filled enabled under sechedule section");

Assert.assertTrue(driver.findElement(endTimeValue).isDisplayed());
log.debug("Verified that 'End Time Value' filled appeared under Sechedule section in test tab");		
Assert.assertTrue(driver.findElement(endTimeValue).isEnabled());
log.debug("Verified that 'End Time Value filled enabled under sechedule section");

//-------------------------------------------------------------------------------------------------------------------

Assert.assertTrue(driver.findElement(scriptlabel).isDisplayed());
log.debug("Verified that 'Script' label appeared under test tab");		
Assert.assertEquals(driver.findElement(scriptlabel).getText(), "Script");		
log.debug("Verified that 'Script' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
log.debug("Verified that 'Script name' label appeared under script section in test tab");		
Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
log.debug("Verified that 'Script Name' Text validated under Test Tab");

//Script Drop Down	

/*	 log.debug("Verified that script dropdown"); 			 
	 WebElement scriptdropdown = driver.findElement(selectaScriptDropdown); 			
//	 System.out.println(dropdown.getSize());			 
    Select scripts1 = new Select(scriptdropdown); 	        
    Assert.assertFalse(scripts1.isMultiple());	        
   java.util.List<WebElement> options2 = scripts1.getOptions();    
  log.debug("Verified that following values available in the dropdown"); 
      for(WebElement item1:options1) 
    { 
    	for (int i = 0; i <options2.size(); i++) {          		
    		log.debug(""+item1.getText());      			   			
 
               	}
    		}
*/

Assert.assertTrue(driver.findElement(inputParameterlabel).isDisplayed());
	log.debug("Verified that 'Input Parameters' label appeared under script section in test tab");		
	Assert.assertEquals(driver.findElement(inputParameterlabel).getText(), "Input Parameters");		
	log.debug("Verified that 'Input Parameters' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
	log.debug("Verified that 'Name' label appeared under script section in test tab");		
	Assert.assertEquals(driver.findElement(namelabel).getText(), "Name");		
	log.debug("Verified that 'Name' Text validated under Test Tab");
	
Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
	log.debug("Verified that 'Value' label appeared under script section in test tab");		
	Assert.assertEquals(driver.findElement(valuelabel).getText(), "Value");		
	log.debug("Verified that 'Value' Text validated under Test Tab");
	
Assert.assertTrue(driver.findElement(maskedlabel).isDisplayed());
	log.debug("Verified that 'Masked' label appeared under script section in test tab");		
	Assert.assertEquals(driver.findElement(maskedlabel).getText(), "Masked");		
	log.debug("Verified that 'Masked' Text validated under Test Tab");
	
	
	Assert.assertTrue(driver.findElement(notificationslabel).isDisplayed());
	log.debug("Verified that 'Notifications' label appeared under script section in test tab");		
	Assert.assertEquals(driver.findElement(notificationslabel).getText(), "Notifications");		
	log.debug("Verified that 'Notifications' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
	log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
	Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
	log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");			


Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			


Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");	

Assert.assertTrue(driver.findElement(notifiEnabledlabel).isDisplayed());
log.debug("Verified that 'Notification' label appeared in notification dropdown in test tab");		
Assert.assertEquals(driver.findElement(notifiEnabledlabel).getText(), "Notifications Enabled");		
log.debug("Verified that 'Notifications Enabled' Text validated in notification dropdown in test tab");	

Assert.assertTrue(driver.findElement(patternlabel).isDisplayed());
log.debug("Verified that 'Pattern' label appeared under Notification in test tab");		
Assert.assertEquals(driver.findElement(patternlabel).getText(), "Pattern");		
log.debug("Verified that 'Pattern' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(severitylabel).isDisplayed());
log.debug("Verified that 'Severity' label appeared under Notification in test tab");	
Assert.assertEquals(driver.findElement(severitylabel).getText(), "Severity");		
log.debug("Verified that 'Severity' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(notifionrettogoodlabel).isDisplayed());
log.debug("Verified that 'Notify on return to good' label appeared under Notification in test tab");		
Assert.assertEquals(driver.findElement(notifionrettogoodlabel).getText(), "Notify on return to good");		
log.debug("Verified that 'Notify on return to good' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(reduceNotifiButton).isDisplayed());
log.debug("Verified that '(-) reduce notification button appeared under notification in Test tab");			
Assert.assertTrue(driver.findElement(reduceNotifiButton).isEnabled());
log.debug("Verified that '(-) reduce notification button enabled under notification in Test tab");			
		
	
Assert.assertTrue(driver.findElement(addNotifiButton).isDisplayed());
log.debug("Verified that '(+) add notification button appeared under notification in Test tab");			
Assert.assertTrue(driver.findElement(addNotifiButton).isEnabled());
log.debug("Verified that '(+) add notification button enabled under notification in Test tab");			


Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			

/*// Notification Drop Down	

	 log.debug("Verified that Notification dropdown"); 		 
	 WebElement notifidropdown = driver.findElement(notifiDropdown);		
//	 System.out.println(dropdown.getSize());		 
   Select notifi1 = new Select(notifidropdown);        
   Assert.assertFalse(notifi1.isMultiple());       
  java.util.List<WebElement> options3 = notifi1.getOptions();   
 
  log.debug("Verified that following values available in the dropdown");      
   for(WebElement item2:options3) 
   { 
   	for (int i = 0; i <options3.size(); i++) {        		
   					        						    
   			log.debug(""+item2.getText());      			   			

              	}
   		}*/

// Pattern Drop Down	
/*		
	 log.debug("Verified that Notification dropdown"); 		 
	 WebElement Patterndropdown = driver.findElement(patternDropdown);		
//	 System.out.println(dropdown.getSize());		 
   Select pattern1 = new Select(Patterndropdown);        
   Assert.assertFalse(pattern1.isMultiple());       
  java.util.List<WebElement> options4 = pattern1.getOptions();   
 
  log.debug("Verified that following values available in the dropdown");      
   for(WebElement item3:options4) 
   { 
   	for (int i = 0; i <options4.size(); i++) {        		
   					        						    
   			log.debug(""+item3.getText());      			   			

              	}
   		}*/

 Assert.assertTrue(driver.findElement(patternValue).isDisplayed());
	log.debug("Verified that 'Pattern' filled appeared under Notification in test tab");		 
	Assert.assertTrue(driver.findElement(patternValue).isEnabled());
	log.debug("Verified that 'Pattern' filled enabled under Notification in test tab");
   
// Severty Drop Down	

/*	 log.debug("Verified that Severity dropdown"); 		 
 WebElement severitydropdown = driver.findElement(serverityDropdown);		
// System.out.println(dropdown.getSize());		 
Select severity1 = new Select(severitydropdown);        
Assert.assertFalse(severity1.isMultiple());       
java.util.List<WebElement> options5 = severity1.getOptions();   

log.debug("Verified that following values available in the dropdown");      
for(WebElement item4:options5) 
{ 
	for (int i = 0; i <options5.size(); i++) {        		
					        						    
			log.debug(""+item4.getText());      			   			

         	}
		} 
*/
Assert.assertTrue(driver.findElement(notifionCheckbox).isDisplayed());
log.debug("Verified that 'Notify on return to good' Checkbox appeared under Notification in test tab");		 
Assert.assertTrue(driver.findElement(notifionCheckbox).isEnabled());
log.debug("Verified that 'Notify on return to good' checkbox enabled under notification in Test tab");			
   

Assert.assertTrue(driver.findElement(failThreSoldlabel).isDisplayed());
log.debug("Verified that 'Failure Thresholds' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(failThreSoldlabel).getText(), "Failure Thresholds");		
log.debug("Verified that 'Failure Thresholds' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(primaryMetlabel).isDisplayed());
log.debug("Verified that 'Primary Metrics' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(primaryMetlabel).getText(), "Primary Metrics");		
log.debug("Verified that 'Primary Metrics' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(addMetLabel).isDisplayed());
log.debug("Verified that 'Additional Metrics' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(addMetLabel).getText(), "Additional Metrics");		
log.debug("Verified that 'Additional Metrics' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(failureEnabledlabel).isDisplayed());
log.debug("Verified that 'Enabled' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failureEnabledlabel).getText(), "Enabled");		
log.debug("Verified that 'Enabled' text validated in Tests tab");		
   
Assert.assertTrue(driver.findElement(failMetriclabel).isDisplayed());
log.debug("Verified that 'Metric' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failMetriclabel).getText(), "Metric");		
log.debug("Verified that 'Metric' text validated in Tests tab");	

Assert.assertTrue(driver.findElement(failCriterilabel).isDisplayed());
log.debug("Verified that 'Criteria' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failCriterilabel).getText(), "Criteria");		
log.debug("Verified that 'Criteria' text validated in Tests tab");

Assert.assertTrue(driver.findElement(failWarrninglabel).isDisplayed());
log.debug("Verified that 'Warning' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failWarrninglabel).getText(), "Warning");		
log.debug("Verified that 'Warning' text validated in Tests tab");

Assert.assertTrue(driver.findElement(failCrticallabel).isDisplayed());
log.debug("Verified that 'Critical' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failCrticallabel).getText(), "Critical");		
log.debug("Verified that 'Critical' text validated in Tests tab");

Assert.assertTrue(driver.findElement(saveButtonTestTab).isDisplayed());
log.debug("Verified that 'Save' button displayed under Tests tab");	
Assert.assertFalse(driver.findElement(saveButtonTestTab).isEnabled());
log.debug("Verified that 'Save' button' is enabled under Tests tab");	
Assert.assertEquals(driver.findElement(saveButtonTestTab).getText(), "Save");		
log.debug("Verified that 'Save' Text appeared on save button under Test Tab");

Assert.assertTrue(driver.findElement(discardButtonTestTab).isDisplayed());
log.debug("Verified that 'Discard' button displayed under Tests tab");	
Assert.assertFalse(driver.findElement(discardButtonTestTab).isEnabled());
log.debug("Verified that 'Discard' button' is enabled under Tests tab");	
Assert.assertEquals(driver.findElement(discardButtonTestTab).getText(), "Discard");		
log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");


if (driver.findElements(deleteButtonTestTab).isEmpty()) {

log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
			
}else

{
log.debug("Verified that 'Delete button' displayed under Tests tab");	

}
}

}	
	
	
//===============================================old==================================================================================================================	
	/*public void testsTabValidation() {	
		
		    wait=new WebDriverWait(driver,30);		
			driver.findElement(home_Page.testTab).click();
			
			Assert.assertTrue(driver.findElement(testslabel).isDisplayed());
			log.debug("Verified that 'Tests' label appeared on left side under Tests tab");
			wait.until(ExpectedConditions.elementToBeClickable(testlabel));
			Assert.assertEquals(driver.findElement(testslabel).getText().contains("Tests"), true);
		//	Assert.assertEquals(driver.findElement(testslabel).getText(), "Tests");		
			log.debug("Verified that 'Tests' Text validated on left side under Test Tab");		
			
			Assert.assertTrue(driver.findElement(filterBox).isDisplayed());
			log.debug("Verified that 'Filter by test name' box appeared on n left side under Tests tab");
			Assert.assertTrue(driver.findElement(filterBox).isEnabled());		
			log.debug("Verified that 'Filter by test name or tag filter'enabled under Alert tab");
			Assert.assertFalse(driver.findElement(filterBox).isSelected());		
			log.debug("Verified that 'Filter by test name' is blank while access test tab");
					
			Assert.assertTrue(driver.findElement(testlabel).isDisplayed());
			log.debug("Verified that 'Test' label appeared on under Tests tab");		
			Assert.assertEquals(driver.findElement(testlabel).getText(), "Test");		
			log.debug("Verified that 'Test' Text validated under Test Tab");	
			
			Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
			log.debug("Verified that 'Please select a test' label appeared on under Tests tab");		
			Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a test");		
			log.debug("Verified that 'Please select a test ' Text validated under Test Tab");
		    String count=driver.findElement(testslabel).getText();
			//	log.debug("Script header contain "+count);
				String[] part = count.split("(?<=\\D)(?=\\d)");		
			//	log.debug("spilled value "+part[1]);	
				int Count=driver.findElements(firstsearchTest).size();
			//	log.debug("Script Count "+Count);	
				String TestActualCount =String.valueOf(Count);	
			//	log.debug("integer converted as: "+ScriptActualCount);	
				
				Assert.assertEquals(part[1], TestActualCount);		
				log.debug("Verified that script count found correct: "+TestActualCount);	
				
				if (Count>0) {
					
				//	driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
					driver.findElement(selectfirstsearch).click();
										
					log.debug("firstScriptClicked");
					wait.until(ExpectedConditions.invisibilityOfElementLocated(TestProgress));
					log.info("found progress bar loading");
					wait.until(ExpectedConditions.elementToBeClickable(viewResult));
					Assert.assertTrue(driver.findElement(viewResult).isDisplayed());
					log.info("ViewResult button displayed found");
					Assert.assertTrue(driver.findElement(viewResult).isEnabled());
					log.info("ViewResult button enabled found");
										
					log.info("Test Filter by name feature is working as desired");
					
				}else {
					
					log.info("No script available");
					}		
			
				if (driver.findElements(saveButton).isEmpty()){
					
					log.info("Save button not found under this credetials");
				  
				} else {
				Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
				log.info("Save button found");
				Assert.assertFalse(driver.findElement(saveButton).isEnabled());
				log.info("Save button disabled");
				Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
				log.info("discard button found");
				Assert.assertFalse(driver.findElement(discardButton).isEnabled());
				log.info("discard button disabled");
				
				}
		}
	
	public void createTestValidationbybutton() {
		   
		wait=new WebDriverWait(driver,30);		
		driver.findElement(home_Page.testTab).click();
		 if (driver.findElements(testCreateplusbutton).isEmpty()) {
			
			log.debug("Verified that new test creation plus (+) icon not appeared on top left side under Tests tab");	
			
						
		}else
		
		{
			log.debug("Verified that new test creation plus (+) icon appeared on top left side under Tests tab");	  
	
		log.debug("Validated the different elements while click Test Creation using button (+)");
		
		wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();	
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Test Tab");	
		
		Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
		log.debug("Verified that 'Discard button' displayed under Tests tab");	
		Assert.assertFalse(driver.findElement(discardButton).isEnabled());
		log.debug("Verified that 'Discard button' is disbaled under Tests tab");	
		Assert.assertEquals(driver.findElement(discardButton).getText(), "Discard");		
		log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
		

		
        if (driver.findElements(deleteButton).isEmpty()) {
			
			log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
			
						
		}else
		
		{
			log.debug("Verified that 'Delete button' displayed under Tests tab");	
			
		}
		
				
		Assert.assertTrue(driver.findElement(testNamelabel).isDisplayed());
		log.debug("Verified that 'Test Name' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(testNamelabel).getText(), "Test Name");		
		log.debug("Verified that 'Test Name' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(descriptionlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(hammerlabel).isDisplayed());
		log.debug("Verified that 'Hammer Group Name' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(hammerlabel).getText(), "Hammer Group");		
		log.debug("Verified that 'Hammer Group' Text validated under Test Tab");
		
		WebElement dropdown0 = driver.findElement(hammerGroupDefaultValue);
			 
	        Select s = new Select(dropdown0); 
	        Assert.assertFalse(s.isMultiple());
	       java.util.List<WebElement> options = s.getOptions(); 
	       
	      
	       log.debug("Verified that following values available in the dropdown"); 
	      
	        for(WebElement item:options) 
	        { 
	        	for (int i = 0; i <options.size(); i++) {   		        		
	        					
	        						    
	        			log.debug(""+item.getText());
	        			     
	     
	                   	}
	        		}
	        
	        	
		
	//	Assert.assertEquals(driver.findElement(hammerGroupDefaultValue).getText(), "us_hammers");
		log.debug("Verified that 'us_hammers' default value as Hammer Group under Test Tab");
		        
        
		 String[] exp = {"(GMT -12:00) Eniwetok, Kwajalein","(GMT -11:00) Midway Island, Samoa","(GMT -10:00) Hawaii","(GMT -9:00) Alaska","(GMT -8:00) Pacific Time (US & Canada)","(GMT -7:00) Mountain Time (US & Canada)","(GMT -7:00) Arizona Time (US & Canada)","(GMT -6:00) Central Time (US & Canada), Mexico City","(GMT -5:00) Eastern Time (US & Canada)","(GMT -5:00) Bogota, Lima","(GMT -4:30) Caracas","(GMT -4:00) Atlantic Time (Canada)","(GMT -4:00) Santiago","(GMT -4:00) Georgetown, La Paz","(GMT -3:30) Newfoundland","(GMT -3:00) Buenos Aires","(GMT -3:00) Sao Paulo", "(GMT -2:00) Mid-Atlantic","(GMT -1:00 hour) Azores, Cape Verde Islands","(GMT) Western Europe Time, London, Lisbon, Casablanca, Greenwich","(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris","(GMT +2:00) Kaliningrad, South Africa, Cairo","(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg","(GMT +3:30) Tehran","(GMT +4:00) Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi","(GMT +4:30) Kabul","(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent","(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo","(GMT +5:45) Kathmandu","(GMT +6:00) Almaty, Dhaka","(GMT +6:30) Yangon, Cocos Islands","(GMT +7:00) Bangkok, Hanoi, Jakarta","(GMT +8:00) Beijing, Perth, Singapore, Hong Kong","(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk","(GMT +9:30) Adelaide, Darwin","(GMT +10:00) Eastern Australia, Guam, Vladivostok, Magadan","(GMT +11:00) Solomon Islands, New Caledonia","(GMT +12:00) Auckland, Wellington"};
		// System.out.println(exp.length);
		 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
		 
		 WebElement dropdown = driver.findElement(dropdownTimeZone); 
		
	//	 System.out.println(dropdown.getSize());
		 
        Select s1 = new Select(dropdown); 
        Assert.assertFalse(s1.isMultiple());
       java.util.List<WebElement> options1 = s1.getOptions(); 
       
      
       log.debug("Verified that following values available in the dropdown"); 
      
        for(WebElement item:options1) 
        { 
        	for (int i = 0; i <options1.size(); i++) {
        		        		
        		if (item.getText().equals(exp[i])) {
        			
        						    
        			log.debug(""+item.getText());
        			
        			//		 System.out.println("hello i am hari" +item.getText());  
        			 
        			 Assert.assertEquals(item.getText(),exp[i]);
     
                   	}
        		}
        
        }
       
        Assert.assertTrue(driver.findElement(secheduleLabel).isDisplayed());
		log.debug("Verified that 'Schedules' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(secheduleLabel).getText(), "Schedules");		
		log.debug("Verified that 'Schedules' Text validated under Test Tab");
        
		 Assert.assertTrue(driver.findElement(timeZoneLabel).isDisplayed());
		log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(timeZoneLabel).getText(), "Time-zone");		
		log.debug("Verified that 'Time-Zone' Text validated under Test Tab");
			
	    Assert.assertTrue(driver.findElement(startDateLabel).isDisplayed());
		log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(startDateLabel).getText(), "Start Date");		
		log.debug("Verified that 'Start Date' Text validated under Test Tab");
	        
        
        
		Assert.assertTrue(driver.findElement(defaultStartDate).isDisplayed());
		log.debug("Verified that 'Start Date' displayed on under Tests tab");			
		Assert.assertTrue(driver.findElement(defaultStartDate).isEnabled());
		log.debug("Verified that 'Start Date' enabled on under Tests tab");	
		
        Assert.assertTrue(driver.findElement(EndDateLabel).isDisplayed());
		log.debug("Verified that 'End Date' label appeared on under Tests tab");		
		Assert.assertEquals(driver.findElement(EndDateLabel).getText(), "End Date");		
		log.debug("Verified that 'End Date' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(defaultEndDate).isDisplayed());
		log.debug("Verified that 'Start Date' displayed on under Tests tab");			
		Assert.assertFalse(driver.findElement(defaultEndDate).isEnabled());
		log.debug("Verified that 'Start Date' enabled on under Tests tab");	
		
		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isDisplayed());
		log.debug("Verified that 'Tie To Scbscription' CheckBox appeared in Test tab");			
		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isEnabled());
		log.debug("Verified that 'Tie To Scbscription' CheckBox enabled in Test tab");	
		Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isSelected());
		log.debug("Verified that 'Tie To Scbscription' CheckBox selected in Test tab");	
		
		Assert.assertTrue(driver.findElement(enabledlabel).isDisplayed());
		log.debug("Verified that 'Enabled' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(enabledlabel).getText(), "Enabled");		
		log.debug("Verified that 'Enabled' Text validated under Test Tab");
		
		 Assert.assertTrue(driver.findElement(descriptionBoxlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(descriptionBoxlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated under Test Tab");
			
		Assert.assertTrue(driver.findElement(periodlabel).isDisplayed());
		log.debug("Verified that 'Period' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(periodlabel).getText(), "Period");		
		log.debug("Verified that 'Period' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(dayslabel).isDisplayed());
		log.debug("Verified that 'Day' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(dayslabel).getText(), "Days");		
		log.debug("Verified that 'Days' Text validated under Test Tab");
					
		Assert.assertTrue(driver.findElement(startTimelabel).isDisplayed());
		log.debug("Verified that 'Start Time' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(startTimelabel).getText(), "Start Time");		
		log.debug("Verified that 'Start Time' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(EndTimelabel).isDisplayed());
		log.debug("Verified that 'End Time' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(EndTimelabel).getText(), "End Time");		
		log.debug("Verified that 'End Time' Text validated under Test Tab");		
		
		
		
		Assert.assertTrue(driver.findElement(reduceSechedule).isDisplayed());
		log.debug("Verified that '(-)' button appeared to remove configured sechedule");			
		Assert.assertTrue(driver.findElement(reduceSechedule).isEnabled());
		log.debug("Verified that '(-)' button enabled under sechedule section");	
		
		Assert.assertTrue(driver.findElement(addSechedule).isDisplayed());
		log.debug("Verified that '(+)' button appeared to add new configured sechedule");			
		Assert.assertTrue(driver.findElement(addSechedule).isEnabled());
		log.debug("Verified that '(+)' button enabled under sechedule section");	
		
		 Assert.assertTrue(driver.findElement(addDescription).isDisplayed());
		log.debug("Verified that 'Description' field appered under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(addDescription).isEnabled());		
		log.debug("Verified that 'Description' field is enabled under Sechedule section in test tab");
	        
		 Assert.assertTrue(driver.findElement(periodValue).isDisplayed());
		log.debug("Verified that 'period' field appeared under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(periodValue).isEnabled());		
		log.debug("Verified that 'period' value field is enabled under Sechedule section in test tab");	
		
		 Assert.assertTrue(driver.findElement(minutelabel).isDisplayed());
		log.debug("Verified that 'Minute' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(minutelabel).getText(), "mins");		
		log.debug("Verified that 'Mins' Text validated under Test Tab");
		
		 Assert.assertTrue(driver.findElement(sunButton).isDisplayed());
		log.debug("Verified that 'Sunday' button appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(sunButton).getText(), "Sun");		
		log.debug("Verified that 'sun' Text appeared on the button under Test Tab");
		Assert.assertTrue(driver.findElement(sunButton).isEnabled());
		log.debug("Verified that 'Sun' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(monButton).isDisplayed());
		log.debug("Verified that 'Monday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(monButton).getText(), "Mon");		
		log.debug("Verified that 'mon' Text appeared on the button under Test Tab");
		Assert.assertTrue(driver.findElement(monButton).isEnabled());
		log.debug("Verified that 'Mon' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(tueButton).isDisplayed());
		log.debug("Verified that 'Tuesday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(tueButton).getText(), "Tue");		
		log.debug("Verified that 'Tue' Text appeared on the button under Test Tab");
		Assert.assertTrue(driver.findElement(tueButton).isEnabled());
		log.debug("Verified that 'Tue' button enabled under sechedule section");
					
		Assert.assertTrue(driver.findElement(wedButton).isDisplayed());
		log.debug("Verified that 'Wednessday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(wedButton).getText(), "Wed");		
		log.debug("Verified that 'Wed' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(wedButton).isEnabled());
		log.debug("Verified that 'Wed' button enabled under sechedule section");
		
						
		Assert.assertTrue(driver.findElement(thuButton).isDisplayed());
		log.debug("Verified that 'Thrusday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(thuButton).getText(), "Thu");		
		log.debug("Verified that 'Thu' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(thuButton).isEnabled());
		log.debug("Verified that 'Thu' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(friButton).isDisplayed());
		log.debug("Verified that 'Friday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(friButton).getText(), "Fri");		
		log.debug("Verified that 'Fri' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(friButton).isEnabled());
		log.debug("Verified that 'Fri' button enabled under sechedule section");
		
		
		Assert.assertTrue(driver.findElement(satButton).isDisplayed());
		log.debug("Verified that 'Satarday' label appeared under Sechedule section in test tab");		
		Assert.assertEquals(driver.findElement(satButton).getText(), "Sat");		
		log.debug("Verified that 'Sat' Text validated under Test Tab");
		Assert.assertTrue(driver.findElement(satButton).isEnabled());
		log.debug("Verified that 'Sat' button enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(startTimeValue).isDisplayed());
		log.debug("Verified that 'Start Time' filled appeared under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(startTimeValue).isEnabled());
		log.debug("Verified that 'Start Time' filled enabled under sechedule section");
		
		Assert.assertTrue(driver.findElement(endTimeValue).isDisplayed());
		log.debug("Verified that 'End Time Value' filled appeared under Sechedule section in test tab");		
		Assert.assertTrue(driver.findElement(endTimeValue).isEnabled());
		log.debug("Verified that 'End Time Value filled enabled under sechedule section");
		
		//-------------------------------------------------------------------------------------------------------------------
		
		Assert.assertTrue(driver.findElement(scriptlabel).isDisplayed());
		log.debug("Verified that 'Script' label appeared under test tab");		
		Assert.assertEquals(driver.findElement(scriptlabel).getText(), "Script");		
		log.debug("Verified that 'Script' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script Name' Text validated under Test Tab");
		
	// Script Drop Down	
	
			 log.debug("Verified that script dropdown"); 			 
			 WebElement scriptdropdown = driver.findElement(selectaScriptDropdown); 			
		//	 System.out.println(dropdown.getSize());			 
	        Select scripts1 = new Select(scriptdropdown); 	        
	        Assert.assertFalse(scripts1.isMultiple());	        
	       java.util.List<WebElement> options2 = scripts1.getOptions();    
	      log.debug("Verified that following values available in the dropdown"); 
	          for(WebElement item1:options1) 
	        { 
	        	for (int i = 0; i <options2.size(); i++) {          		
	        		log.debug(""+item1.getText());      			   			
	     
	                   	}
	        		}
	
		
        Assert.assertTrue(driver.findElement(inputParameterlabel).isDisplayed());
  		log.debug("Verified that 'Input Parameters' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(inputParameterlabel).getText(), "Input Parameters");		
  		log.debug("Verified that 'Input Parameters' Text validated under Test Tab");
		
        Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
  		log.debug("Verified that 'Name' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(namelabel).getText(), "Name");		
  		log.debug("Verified that 'Name' Text validated under Test Tab");
  		
        Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
  		log.debug("Verified that 'Value' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(valuelabel).getText(), "Value");		
  		log.debug("Verified that 'Value' Text validated under Test Tab");
  		
        Assert.assertTrue(driver.findElement(maskedlabel).isDisplayed());
  		log.debug("Verified that 'Masked' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(maskedlabel).getText(), "Masked");		
  		log.debug("Verified that 'Masked' Text validated under Test Tab");
  		
  		
  		Assert.assertTrue(driver.findElement(notificationslabel).isDisplayed());
  		log.debug("Verified that 'Notifications' label appeared under script section in test tab");		
  		Assert.assertEquals(driver.findElement(notificationslabel).getText(), "Notifications");		
  		log.debug("Verified that 'Notifications' Text validated under Test Tab");
  		
  		Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
  		log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
  		Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
  		log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");			
  	
       
   	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
	log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
	Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
	log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			
	
	
	Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
	log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
	Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
	log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");	
	
	Assert.assertTrue(driver.findElement(notifiEnabledlabel).isDisplayed());
	log.debug("Verified that 'Notification' label appeared in notification dropdown in test tab");		
	Assert.assertEquals(driver.findElement(notifiEnabledlabel).getText(), "Notifications Enabled");		
	log.debug("Verified that 'Notifications Enabled' Text validated in notification dropdown in test tab");	
	
	Assert.assertTrue(driver.findElement(patternlabel).isDisplayed());
	log.debug("Verified that 'Pattern' label appeared under Notification in test tab");		
	Assert.assertEquals(driver.findElement(patternlabel).getText(), "Pattern");		
	log.debug("Verified that 'Pattern' Text validated under Test Tab");	
	
	Assert.assertTrue(driver.findElement(severitylabel).isDisplayed());
	log.debug("Verified that 'Severity' label appeared under Notification in test tab");	
	Assert.assertEquals(driver.findElement(severitylabel).getText(), "Severity");		
	log.debug("Verified that 'Severity' Text validated under Test Tab");	
	
	Assert.assertTrue(driver.findElement(notifionrettogoodlabel).isDisplayed());
	log.debug("Verified that 'Notify on return to good' label appeared under Notification in test tab");		
	Assert.assertEquals(driver.findElement(notifionrettogoodlabel).getText(), "Notify on return to good");		
	log.debug("Verified that 'Notify on return to good' Text validated under Test Tab");	
	
	Assert.assertTrue(driver.findElement(reduceNotifiButton).isDisplayed());
	log.debug("Verified that '(-) reduce notification button appeared under notification in Test tab");			
	Assert.assertTrue(driver.findElement(reduceNotifiButton).isEnabled());
	log.debug("Verified that '(-) reduce notification button enabled under notification in Test tab");			
	  		
  		
	Assert.assertTrue(driver.findElement(addNotifiButton).isDisplayed());
	log.debug("Verified that '(+) add notification button appeared under notification in Test tab");			
	Assert.assertTrue(driver.findElement(addNotifiButton).isEnabled());
	log.debug("Verified that '(+) add notification button enabled under notification in Test tab");			
	
	
  	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
	log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
	Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
	log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			
	
	// Notification Drop Down	
		
			 log.debug("Verified that Notification dropdown"); 		 
			 WebElement notifidropdown = driver.findElement(notifiDropdown);		
		//	 System.out.println(dropdown.getSize());		 
	       Select notifi1 = new Select(notifidropdown);        
	       Assert.assertFalse(notifi1.isMultiple());       
	      java.util.List<WebElement> options3 = notifi1.getOptions();   
	     
	      log.debug("Verified that following values available in the dropdown");      
	       for(WebElement item2:options3) 
	       { 
	       	for (int i = 0; i <options3.size(); i++) {        		
	       					        						    
	       			log.debug(""+item2.getText());      			   			
	    
	                  	}
	       		}

	    // Pattern Drop Down	
			
			 log.debug("Verified that Notification dropdown"); 		 
			 WebElement Patterndropdown = driver.findElement(patternDropdown);		
		//	 System.out.println(dropdown.getSize());		 
	       Select pattern1 = new Select(Patterndropdown);        
	       Assert.assertFalse(pattern1.isMultiple());       
	      java.util.List<WebElement> options4 = pattern1.getOptions();   
	     
	      log.debug("Verified that following values available in the dropdown");      
	       for(WebElement item3:options4) 
	       { 
	       	for (int i = 0; i <options4.size(); i++) {        		
	       					        						    
	       			log.debug(""+item3.getText());      			   			
	    
	                  	}
	       		}
		
	     Assert.assertTrue(driver.findElement(patternValue).isDisplayed());
	   	log.debug("Verified that 'Pattern' filled appeared under Notification in test tab");		 
	   	Assert.assertTrue(driver.findElement(patternValue).isEnabled());
	   	log.debug("Verified that 'Pattern' filled enabled under Notification in test tab");
	       
	 // Severty Drop Down	
		
		 log.debug("Verified that Severity dropdown"); 		 
		 WebElement severitydropdown = driver.findElement(serverityDropdown);		
	//	 System.out.println(dropdown.getSize());		 
      Select severity1 = new Select(severitydropdown);        
      Assert.assertFalse(severity1.isMultiple());       
     java.util.List<WebElement> options5 = severity1.getOptions();   
    
     log.debug("Verified that following values available in the dropdown");      
      for(WebElement item4:options5) 
      { 
      	for (int i = 0; i <options5.size(); i++) {        		
      					        						    
      			log.debug(""+item4.getText());      			   			
   
                 	}
      		} 
	
     Assert.assertTrue(driver.findElement(notifionCheckbox).isDisplayed());
  	log.debug("Verified that 'Notify on return to good' Checkbox appeared under Notification in test tab");		 
  	Assert.assertTrue(driver.findElement(notifionCheckbox).isEnabled());
  	log.debug("Verified that 'Notify on return to good' checkbox enabled under notification in Test tab");			
  	   
	
    Assert.assertTrue(driver.findElement(failThreSoldlabel).isDisplayed());
	log.debug("Verified that 'Failure Thresholds' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(failThreSoldlabel).getText(), "Failure Thresholds");		
	log.debug("Verified that 'Failure Thresholds' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(primaryMetlabel).isDisplayed());
	log.debug("Verified that 'Primary Metrics' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(primaryMetlabel).getText(), "Primary Metrics");		
	log.debug("Verified that 'Primary Metrics' Text validated under Test Tab");
  	
	Assert.assertTrue(driver.findElement(addMetLabel).isDisplayed());
	log.debug("Verified that 'Additional Metrics' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(addMetLabel).getText(), "Additional Metrics");		
	log.debug("Verified that 'Additional Metrics' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(failureEnabledlabel).isDisplayed());
	log.debug("Verified that 'Enabled' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failureEnabledlabel).getText(), "Enabled");		
	log.debug("Verified that 'Enabled' text validated in Tests tab");		
	       
	Assert.assertTrue(driver.findElement(failMetriclabel).isDisplayed());
	log.debug("Verified that 'Metric' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failMetriclabel).getText(), "Metric");		
	log.debug("Verified that 'Metric' text validated in Tests tab");	
	
	Assert.assertTrue(driver.findElement(failCriterilabel).isDisplayed());
	log.debug("Verified that 'Criteria' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failCriterilabel).getText(), "Criteria");		
	log.debug("Verified that 'Criteria' text validated in Tests tab");
	
	Assert.assertTrue(driver.findElement(failWarrninglabel).isDisplayed());
	log.debug("Verified that 'Warning' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failWarrninglabel).getText(), "Warning");		
	log.debug("Verified that 'Warning' text validated in Tests tab");
	
	Assert.assertTrue(driver.findElement(failCrticallabel).isDisplayed());
	log.debug("Verified that 'Critical' label appeared under Failure Thresholds in Tests tab");		
	Assert.assertEquals(driver.findElement(failCrticallabel).getText(), "Critical");		
	log.debug("Verified that 'Critical' text validated in Tests tab");
	
	Assert.assertTrue(driver.findElement(saveButtonTestTab).isDisplayed());
	log.debug("Verified that 'Save' button displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(saveButtonTestTab).isEnabled());
	log.debug("Verified that 'Save' button' is enabled under Tests tab");	
	Assert.assertEquals(driver.findElement(saveButtonTestTab).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Test Tab");
	
	Assert.assertTrue(driver.findElement(discardButtonTestTab).isDisplayed());
	log.debug("Verified that 'Discard' button displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(discardButtonTestTab).isEnabled());
	log.debug("Verified that 'Discard' button' is enabled under Tests tab");	
	Assert.assertEquals(driver.findElement(discardButtonTestTab).getText(), "Discard");		
	log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
	
	
	if (driver.findElements(deleteButtonTestTab).isEmpty()) {
		
		log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
		
					
	}else
	
	{
		log.debug("Verified that 'Delete button' displayed under Tests tab");	
		
	}
		}
}
	      
        
	//================================================================================			
	
																													
public void createTestValidationbyLink() {	
	   
			wait=new WebDriverWait(driver,30);		
			driver.findElement(home_Page.testTab).click();	   
	
	
	if (driver.findElements(testCreateLink).isEmpty()) {
		
		log.debug("Verified that new test creation plus (+) icon not appeared on top left side under Tests tab");	
		
		
	}else
	
	{
		log.debug("Verified that new test creation plus (+) icon appeared on top left side under Tests tab");	  

	log.debug("Validated the different elements while click Test Creation using button (+)");
	
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();	
	
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Tests tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Test Tab");	
	
	Assert.assertTrue(driver.findElement(discardButton).isDisplayed());
	log.debug("Verified that 'Discard button' displayed under Tests tab");	
	Assert.assertFalse(driver.findElement(discardButton).isEnabled());
	log.debug("Verified that 'Discard button' is disbaled under Tests tab");	
	Assert.assertEquals(driver.findElement(discardButton).getText(), "Discard");		
	log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");
	

	
    if (driver.findElements(deleteButton).isEmpty()) {
		
		log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
		
					
	}else
	
	{
		log.debug("Verified that 'Delete button' displayed under Tests tab");	
		
	}
	
			
	Assert.assertTrue(driver.findElement(testNamelabel).isDisplayed());
	log.debug("Verified that 'Test Name' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(testNamelabel).getText(), "Test Name");		
	log.debug("Verified that 'Test Name' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(descriptionlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(hammerlabel).isDisplayed());
	log.debug("Verified that 'Hammer Group Name' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(hammerlabel).getText(), "Hammer Group");		
	log.debug("Verified that 'Hammer Group' Text validated under Test Tab");
	
	WebElement dropdown0 = driver.findElement(hammerGroupDefaultValue);
		 
        Select s = new Select(dropdown0); 
        Assert.assertFalse(s.isMultiple());
       java.util.List<WebElement> options = s.getOptions(); 
       
      
       log.debug("Verified that following values available in the dropdown"); 
      
        for(WebElement item:options) 
        { 
        	for (int i = 0; i <options.size(); i++) {   		        		
        					
        						    
        			log.debug(""+item.getText());
        			     
     
                   	}
        		}
        
        	
	
//	Assert.assertEquals(driver.findElement(hammerGroupDefaultValue).getText(), "us_hammers");
	log.debug("Verified that 'us_hammers' default value as Hammer Group under Test Tab");
	        
    
	 String[] exp = {"(GMT -12:00) Eniwetok, Kwajalein","(GMT -11:00) Midway Island, Samoa","(GMT -10:00) Hawaii","(GMT -9:00) Alaska","(GMT -8:00) Pacific Time (US & Canada)","(GMT -7:00) Mountain Time (US & Canada)","(GMT -7:00) Arizona Time (US & Canada)","(GMT -6:00) Central Time (US & Canada), Mexico City","(GMT -5:00) Eastern Time (US & Canada)","(GMT -5:00) Bogota, Lima","(GMT -4:30) Caracas","(GMT -4:00) Atlantic Time (Canada)","(GMT -4:00) Santiago","(GMT -4:00) Georgetown, La Paz","(GMT -3:30) Newfoundland","(GMT -3:00) Buenos Aires","(GMT -3:00) Sao Paulo", "(GMT -2:00) Mid-Atlantic","(GMT -1:00 hour) Azores, Cape Verde Islands","(GMT) Western Europe Time, London, Lisbon, Casablanca, Greenwich","(GMT +1:00 hour) Brussels, Copenhagen, Madrid, Paris","(GMT +2:00) Kaliningrad, South Africa, Cairo","(GMT +3:00) Baghdad, Riyadh, Moscow, St. Petersburg","(GMT +3:30) Tehran","(GMT +4:00) Abu Dhabi, Muscat, Yerevan, Baku, Tbilisi","(GMT +4:30) Kabul","(GMT +5:00) Ekaterinburg, Islamabad, Karachi, Tashkent","(GMT +5:30) Mumbai, Kolkata, Chennai, New Delhi, Colombo","(GMT +5:45) Kathmandu","(GMT +6:00) Almaty, Dhaka","(GMT +6:30) Yangon, Cocos Islands","(GMT +7:00) Bangkok, Hanoi, Jakarta","(GMT +8:00) Beijing, Perth, Singapore, Hong Kong","(GMT +9:00) Tokyo, Seoul, Osaka, Sapporo, Yakutsk","(GMT +9:30) Adelaide, Darwin","(GMT +10:00) Eastern Australia, Guam, Vladivostok, Magadan","(GMT +11:00) Solomon Islands, New Caledonia","(GMT +12:00) Auckland, Wellington"};
	// System.out.println(exp.length);
	 log.debug("Verified that count of the dropdown values are: "  +exp.length); 
	 
	 WebElement dropdown = driver.findElement(dropdownTimeZone); 
	
//	 System.out.println(dropdown.getSize());
	 
    Select s1 = new Select(dropdown); 
    Assert.assertFalse(s1.isMultiple());
   java.util.List<WebElement> options1 = s1.getOptions(); 
   
  
   log.debug("Verified that following values available in the dropdown"); 
  
    for(WebElement item:options1) 
    { 
    	for (int i = 0; i <options1.size(); i++) {
    		        		
    		if (item.getText().equals(exp[i])) {
    			
    						    
    			log.debug(""+item.getText());
    			
    			//		 System.out.println("hello i am hari" +item.getText());  
    			 
    			 Assert.assertEquals(item.getText(),exp[i]);
 
               	}
    		}
    
    }
   
    Assert.assertTrue(driver.findElement(secheduleLabel).isDisplayed());
	log.debug("Verified that 'Schedules' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(secheduleLabel).getText(), "Schedules");		
	log.debug("Verified that 'Schedules' Text validated under Test Tab");
    
	 Assert.assertTrue(driver.findElement(timeZoneLabel).isDisplayed());
	log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(timeZoneLabel).getText(), "Time-zone");		
	log.debug("Verified that 'Time-Zone' Text validated under Test Tab");
		
    Assert.assertTrue(driver.findElement(startDateLabel).isDisplayed());
	log.debug("Verified that 'Start Date' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(startDateLabel).getText(), "Start Date");		
	log.debug("Verified that 'Start Date' Text validated under Test Tab");
        
    
    
	Assert.assertTrue(driver.findElement(defaultStartDate).isDisplayed());
	log.debug("Verified that 'Start Date' displayed on under Tests tab");			
	Assert.assertTrue(driver.findElement(defaultStartDate).isEnabled());
	log.debug("Verified that 'Start Date' enabled on under Tests tab");	
	
    Assert.assertTrue(driver.findElement(EndDateLabel).isDisplayed());
	log.debug("Verified that 'End Date' label appeared on under Tests tab");		
	Assert.assertEquals(driver.findElement(EndDateLabel).getText(), "End Date");		
	log.debug("Verified that 'End Date' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(defaultEndDate).isDisplayed());
	log.debug("Verified that 'Start Date' displayed on under Tests tab");			
	Assert.assertFalse(driver.findElement(defaultEndDate).isEnabled());
	log.debug("Verified that 'Start Date' enabled on under Tests tab");	
	
	Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isDisplayed());
	log.debug("Verified that 'Tie To Scbscription' CheckBox appeared in Test tab");			
	Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isEnabled());
	log.debug("Verified that 'Tie To Scbscription' CheckBox enabled in Test tab");	
	Assert.assertTrue(driver.findElement(tieToScbscriptionCheckBox).isSelected());
	log.debug("Verified that 'Tie To Scbscription' CheckBox selected in Test tab");	
	
	Assert.assertTrue(driver.findElement(enabledlabel).isDisplayed());
	log.debug("Verified that 'Enabled' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(enabledlabel).getText(), "Enabled");		
	log.debug("Verified that 'Enabled' Text validated under Test Tab");
	
	 Assert.assertTrue(driver.findElement(descriptionBoxlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(descriptionBoxlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated under Test Tab");
		
	Assert.assertTrue(driver.findElement(periodlabel).isDisplayed());
	log.debug("Verified that 'Period' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(periodlabel).getText(), "Period");		
	log.debug("Verified that 'Period' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(dayslabel).isDisplayed());
	log.debug("Verified that 'Day' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(dayslabel).getText(), "Days");		
	log.debug("Verified that 'Days' Text validated under Test Tab");
				
	Assert.assertTrue(driver.findElement(startTimelabel).isDisplayed());
	log.debug("Verified that 'Start Time' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(startTimelabel).getText(), "Start Time");		
	log.debug("Verified that 'Start Time' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(EndTimelabel).isDisplayed());
	log.debug("Verified that 'End Time' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(EndTimelabel).getText(), "End Time");		
	log.debug("Verified that 'End Time' Text validated under Test Tab");		
	
	
	
	Assert.assertTrue(driver.findElement(reduceSechedule).isDisplayed());
	log.debug("Verified that '(-)' button appeared to remove configured sechedule");			
	Assert.assertTrue(driver.findElement(reduceSechedule).isEnabled());
	log.debug("Verified that '(-)' button enabled under sechedule section");	
	
	Assert.assertTrue(driver.findElement(addSechedule).isDisplayed());
	log.debug("Verified that '(+)' button appeared to add new configured sechedule");			
	Assert.assertTrue(driver.findElement(addSechedule).isEnabled());
	log.debug("Verified that '(+)' button enabled under sechedule section");	
	
	 Assert.assertTrue(driver.findElement(addDescription).isDisplayed());
	log.debug("Verified that 'Description' field appered under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(addDescription).isEnabled());		
	log.debug("Verified that 'Description' field is enabled under Sechedule section in test tab");
        
	 Assert.assertTrue(driver.findElement(periodValue).isDisplayed());
	log.debug("Verified that 'period' field appeared under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(periodValue).isEnabled());		
	log.debug("Verified that 'period' value field is enabled under Sechedule section in test tab");	
	
	 Assert.assertTrue(driver.findElement(minutelabel).isDisplayed());
	log.debug("Verified that 'Minute' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(minutelabel).getText(), "mins");		
	log.debug("Verified that 'Mins' Text validated under Test Tab");
	
	 Assert.assertTrue(driver.findElement(sunButton).isDisplayed());
	log.debug("Verified that 'Sunday' button appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(sunButton).getText(), "Sun");		
	log.debug("Verified that 'sun' Text appeared on the button under Test Tab");
	Assert.assertTrue(driver.findElement(sunButton).isEnabled());
	log.debug("Verified that 'Sun' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(monButton).isDisplayed());
	log.debug("Verified that 'Monday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(monButton).getText(), "Mon");		
	log.debug("Verified that 'mon' Text appeared on the button under Test Tab");
	Assert.assertTrue(driver.findElement(monButton).isEnabled());
	log.debug("Verified that 'Mon' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(tueButton).isDisplayed());
	log.debug("Verified that 'Tuesday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(tueButton).getText(), "Tue");		
	log.debug("Verified that 'Tue' Text appeared on the button under Test Tab");
	Assert.assertTrue(driver.findElement(tueButton).isEnabled());
	log.debug("Verified that 'Tue' button enabled under sechedule section");
				
	Assert.assertTrue(driver.findElement(wedButton).isDisplayed());
	log.debug("Verified that 'Wednessday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(wedButton).getText(), "Wed");		
	log.debug("Verified that 'Wed' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(wedButton).isEnabled());
	log.debug("Verified that 'Wed' button enabled under sechedule section");
	
					
	Assert.assertTrue(driver.findElement(thuButton).isDisplayed());
	log.debug("Verified that 'Thrusday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(thuButton).getText(), "Thu");		
	log.debug("Verified that 'Thu' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(thuButton).isEnabled());
	log.debug("Verified that 'Thu' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(friButton).isDisplayed());
	log.debug("Verified that 'Friday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(friButton).getText(), "Fri");		
	log.debug("Verified that 'Fri' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(friButton).isEnabled());
	log.debug("Verified that 'Fri' button enabled under sechedule section");
	
	
	Assert.assertTrue(driver.findElement(satButton).isDisplayed());
	log.debug("Verified that 'Satarday' label appeared under Sechedule section in test tab");		
	Assert.assertEquals(driver.findElement(satButton).getText(), "Sat");		
	log.debug("Verified that 'Sat' Text validated under Test Tab");
	Assert.assertTrue(driver.findElement(satButton).isEnabled());
	log.debug("Verified that 'Sat' button enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(startTimeValue).isDisplayed());
	log.debug("Verified that 'Start Time' filled appeared under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(startTimeValue).isEnabled());
	log.debug("Verified that 'Start Time' filled enabled under sechedule section");
	
	Assert.assertTrue(driver.findElement(endTimeValue).isDisplayed());
	log.debug("Verified that 'End Time Value' filled appeared under Sechedule section in test tab");		
	Assert.assertTrue(driver.findElement(endTimeValue).isEnabled());
	log.debug("Verified that 'End Time Value filled enabled under sechedule section");
	
	//-------------------------------------------------------------------------------------------------------------------
	
	Assert.assertTrue(driver.findElement(scriptlabel).isDisplayed());
	log.debug("Verified that 'Script' label appeared under test tab");		
	Assert.assertEquals(driver.findElement(scriptlabel).getText(), "Script");		
	log.debug("Verified that 'Script' Text validated under Test Tab");
	
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared under script section in test tab");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script Name' Text validated under Test Tab");
	
// Script Drop Down	

		 log.debug("Verified that script dropdown"); 			 
		 WebElement scriptdropdown = driver.findElement(selectaScriptDropdown); 			
	//	 System.out.println(dropdown.getSize());			 
        Select scripts1 = new Select(scriptdropdown); 	        
        Assert.assertFalse(scripts1.isMultiple());	        
       java.util.List<WebElement> options2 = scripts1.getOptions();    
      log.debug("Verified that following values available in the dropdown"); 
          for(WebElement item1:options1) 
        { 
        	for (int i = 0; i <options2.size(); i++) {          		
        		log.debug(""+item1.getText());      			   			
     
                   	}
        		}

	
    Assert.assertTrue(driver.findElement(inputParameterlabel).isDisplayed());
		log.debug("Verified that 'Input Parameters' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(inputParameterlabel).getText(), "Input Parameters");		
		log.debug("Verified that 'Input Parameters' Text validated under Test Tab");
	
    Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
		log.debug("Verified that 'Name' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(namelabel).getText(), "Name");		
		log.debug("Verified that 'Name' Text validated under Test Tab");
		
    Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
		log.debug("Verified that 'Value' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(valuelabel).getText(), "Value");		
		log.debug("Verified that 'Value' Text validated under Test Tab");
		
    Assert.assertTrue(driver.findElement(maskedlabel).isDisplayed());
		log.debug("Verified that 'Masked' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(maskedlabel).getText(), "Masked");		
		log.debug("Verified that 'Masked' Text validated under Test Tab");
		
		
		Assert.assertTrue(driver.findElement(notificationslabel).isDisplayed());
		log.debug("Verified that 'Notifications' label appeared under script section in test tab");		
		Assert.assertEquals(driver.findElement(notificationslabel).getText(), "Notifications");		
		log.debug("Verified that 'Notifications' Text validated under Test Tab");
		
		Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
		log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
		Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
		log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");			
	
   
	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			


Assert.assertTrue(driver.findElement(enabledBoxlabel).isDisplayed());
log.debug("Verified that 'Enabled' label appeared under Notification checkbox in test tab");		
Assert.assertEquals(driver.findElement(enabledBoxlabel).getText(), "Enabled");		
log.debug("Verified that 'Enabled' Text validated under Notification checkbox in test tab");	

Assert.assertTrue(driver.findElement(notifiEnabledlabel).isDisplayed());
log.debug("Verified that 'Notification' label appeared in notification dropdown in test tab");		
Assert.assertEquals(driver.findElement(notifiEnabledlabel).getText(), "Notifications Enabled");		
log.debug("Verified that 'Notifications Enabled' Text validated in notification dropdown in test tab");	

Assert.assertTrue(driver.findElement(patternlabel).isDisplayed());
log.debug("Verified that 'Pattern' label appeared under Notification in test tab");		
Assert.assertEquals(driver.findElement(patternlabel).getText(), "Pattern");		
log.debug("Verified that 'Pattern' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(severitylabel).isDisplayed());
log.debug("Verified that 'Severity' label appeared under Notification in test tab");	
Assert.assertEquals(driver.findElement(severitylabel).getText(), "Severity");		
log.debug("Verified that 'Severity' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(notifionrettogoodlabel).isDisplayed());
log.debug("Verified that 'Notify on return to good' label appeared under Notification in test tab");		
Assert.assertEquals(driver.findElement(notifionrettogoodlabel).getText(), "Notify on return to good");		
log.debug("Verified that 'Notify on return to good' Text validated under Test Tab");	

Assert.assertTrue(driver.findElement(reduceNotifiButton).isDisplayed());
log.debug("Verified that '(-) reduce notification button appeared under notification in Test tab");			
Assert.assertTrue(driver.findElement(reduceNotifiButton).isEnabled());
log.debug("Verified that '(-) reduce notification button enabled under notification in Test tab");			
  		
		
Assert.assertTrue(driver.findElement(addNotifiButton).isDisplayed());
log.debug("Verified that '(+) add notification button appeared under notification in Test tab");			
Assert.assertTrue(driver.findElement(addNotifiButton).isEnabled());
log.debug("Verified that '(+) add notification button enabled under notification in Test tab");			


	Assert.assertTrue(driver.findElement(notifiCheckbox).isDisplayed());
log.debug("Verified that 'Notifi Enabled Checkbox' appeared under Notification in test tab");		 
Assert.assertTrue(driver.findElement(notifiCheckbox).isEnabled());
log.debug("Verified that 'Notification Enabled' checkbox appeared notification in Test tab");			

// Notification Drop Down	
	
		 log.debug("Verified that Notification dropdown"); 		 
		 WebElement notifidropdown = driver.findElement(notifiDropdown);		
	//	 System.out.println(dropdown.getSize());		 
       Select notifi1 = new Select(notifidropdown);        
       Assert.assertFalse(notifi1.isMultiple());       
      java.util.List<WebElement> options3 = notifi1.getOptions();   
     
      log.debug("Verified that following values available in the dropdown");      
       for(WebElement item2:options3) 
       { 
       	for (int i = 0; i <options3.size(); i++) {        		
       					        						    
       			log.debug(""+item2.getText());      			   			
    
                  	}
       		}

    // Pattern Drop Down	
		
		 log.debug("Verified that Notification dropdown"); 		 
		 WebElement Patterndropdown = driver.findElement(patternDropdown);		
	//	 System.out.println(dropdown.getSize());		 
       Select pattern1 = new Select(Patterndropdown);        
       Assert.assertFalse(pattern1.isMultiple());       
      java.util.List<WebElement> options4 = pattern1.getOptions();   
     
      log.debug("Verified that following values available in the dropdown");      
       for(WebElement item3:options4) 
       { 
       	for (int i = 0; i <options4.size(); i++) {        		
       					        						    
       			log.debug(""+item3.getText());      			   			
    
                  	}
       		}
	
     Assert.assertTrue(driver.findElement(patternValue).isDisplayed());
   	log.debug("Verified that 'Pattern' filled appeared under Notification in test tab");		 
   	Assert.assertTrue(driver.findElement(patternValue).isEnabled());
   	log.debug("Verified that 'Pattern' filled enabled under Notification in test tab");
       
 // Severty Drop Down	
	
	 log.debug("Verified that Severity dropdown"); 		 
	 WebElement severitydropdown = driver.findElement(serverityDropdown);		
//	 System.out.println(dropdown.getSize());		 
  Select severity1 = new Select(severitydropdown);        
  Assert.assertFalse(severity1.isMultiple());       
 java.util.List<WebElement> options5 = severity1.getOptions();   

 log.debug("Verified that following values available in the dropdown");      
  for(WebElement item4:options5) 
  { 
  	for (int i = 0; i <options5.size(); i++) {        		
  					        						    
  			log.debug(""+item4.getText());      			   			

             	}
  		} 

 Assert.assertTrue(driver.findElement(notifionCheckbox).isDisplayed());
	log.debug("Verified that 'Notify on return to good' Checkbox appeared under Notification in test tab");		 
	Assert.assertTrue(driver.findElement(notifionCheckbox).isEnabled());
	log.debug("Verified that 'Notify on return to good' checkbox enabled under notification in Test tab");			
	   

Assert.assertTrue(driver.findElement(failThreSoldlabel).isDisplayed());
log.debug("Verified that 'Failure Thresholds' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(failThreSoldlabel).getText(), "Failure Thresholds");		
log.debug("Verified that 'Failure Thresholds' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(primaryMetlabel).isDisplayed());
log.debug("Verified that 'Primary Metrics' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(primaryMetlabel).getText(), "Primary Metrics");		
log.debug("Verified that 'Primary Metrics' Text validated under Test Tab");
	
Assert.assertTrue(driver.findElement(addMetLabel).isDisplayed());
log.debug("Verified that 'Additional Metrics' label appeared on under Tests tab");		
Assert.assertEquals(driver.findElement(addMetLabel).getText(), "Additional Metrics");		
log.debug("Verified that 'Additional Metrics' Text validated under Test Tab");

Assert.assertTrue(driver.findElement(failureEnabledlabel).isDisplayed());
log.debug("Verified that 'Enabled' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failureEnabledlabel).getText(), "Enabled");		
log.debug("Verified that 'Enabled' text validated in Tests tab");		
       
Assert.assertTrue(driver.findElement(failMetriclabel).isDisplayed());
log.debug("Verified that 'Metric' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failMetriclabel).getText(), "Metric");		
log.debug("Verified that 'Metric' text validated in Tests tab");	

Assert.assertTrue(driver.findElement(failCriterilabel).isDisplayed());
log.debug("Verified that 'Criteria' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failCriterilabel).getText(), "Criteria");		
log.debug("Verified that 'Criteria' text validated in Tests tab");

Assert.assertTrue(driver.findElement(failWarrninglabel).isDisplayed());
log.debug("Verified that 'Warning' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failWarrninglabel).getText(), "Warning");		
log.debug("Verified that 'Warning' text validated in Tests tab");

Assert.assertTrue(driver.findElement(failCrticallabel).isDisplayed());
log.debug("Verified that 'Critical' label appeared under Failure Thresholds in Tests tab");		
Assert.assertEquals(driver.findElement(failCrticallabel).getText(), "Critical");		
log.debug("Verified that 'Critical' text validated in Tests tab");

Assert.assertTrue(driver.findElement(saveButtonTestTab).isDisplayed());
log.debug("Verified that 'Save' button displayed under Tests tab");	
Assert.assertFalse(driver.findElement(saveButtonTestTab).isEnabled());
log.debug("Verified that 'Save' button' is enabled under Tests tab");	
Assert.assertEquals(driver.findElement(saveButtonTestTab).getText(), "Save");		
log.debug("Verified that 'Save' Text appeared on save button under Test Tab");

Assert.assertTrue(driver.findElement(discardButtonTestTab).isDisplayed());
log.debug("Verified that 'Discard' button displayed under Tests tab");	
Assert.assertFalse(driver.findElement(discardButtonTestTab).isEnabled());
log.debug("Verified that 'Discard' button' is enabled under Tests tab");	
Assert.assertEquals(driver.findElement(discardButtonTestTab).getText(), "Discard");		
log.debug("Verified that 'Discard' Text appeared on save button under Test Tab");


if (driver.findElements(deleteButtonTestTab).isEmpty()) {
	
	log.debug("Verified that 'Delete button' is not displayed under Tests tab");		
				
}else

{
	log.debug("Verified that 'Delete button' displayed under Tests tab");	
	
}
}

}	*/
	
public WebElement getTestName() {
	
	return driver.findElement(testNameField);
}

//===========================================================================================
//Create a Test 26.2

public void CreateTest_using_button_26() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptsTab)).click();
//	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to Script Tab");
	log.info("=================New Script Creation===========================");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptNamefield));
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");

	log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
//	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	driver.findElement(testNameField).sendKeys("Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	log.info("=========================Celaning Test Data======================");
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate back to script tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter: " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	driver.findElement(ScriptTab.selectdropdownn).click();
	log.info("Verified that select dropdown");
	if (driver.findElements(ScriptTab.clickdeletedropdown).size()!=0){
		
		log.info("delete button not found, so delete functinality not avaiable");
	} else {
		
	
	log.info("Verified that Clicked delete button");
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Waiting for aleart");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
	log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed=================");
	}
}

//======================================================================================================================================================

//Create a Test 27.0

public void CreateTest_using_button() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptsTab)).click();
//	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to Script Tab");
	log.info("=================New Script Creation===========================");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));	
	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");
	
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
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptNamefield));
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	
	
	
	driver.findElement(ScriptTab.numberToCalle164disabled).sendKeys("18002051994");
	log.info("Passing Number to Call is 18002051994");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");

	log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");
	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");	
	
//	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	driver.findElement(testNameField).sendKeys("IVR_Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown27);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");		
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	log.info("=========================Celaning Test Data======================");
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate back to script tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter: " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	driver.findElement(ScriptTab.selectdropdownn).click();
	log.info("Verified that select dropdown");
	if (driver.findElements(ScriptTab.clickdeletedropdown27).size()!=0){
		
		log.info("delete button not found, so delete functinality not avaiable");
	} else {
		
	driver.findElement(ScriptTab.clickdeletedropdown27).click();
	log.info("Verified that Clicked delete button");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deleteAllData)).click();	
//	driver.findElement(ScriptTab.deleteAllData).click();
	/*WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);*/
	log.info("Verified that select delete all data");
//	wait.until(ExpectedConditions.alertIsPresent());
//	log.info("Waiting for aleart");
//	driver.switchTo().alert().accept();
//	log.info("Alert accepted");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
	log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed=================");
	}
}

//===============================================================================================================================

//Create a Test 27.0

public void Create_CBM_Test() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.testTab)).click();
	log.info("=========================Test Creation=======================");
//	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(1);
	log.info("CBM Test Selected from Test Selection dropdown");	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");		
	wait.until(ExpectedConditions.presenceOfElementLocated(testNameField));

	String TestName="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom CBM Test Name " +TestName);
	driver.findElement(testNameField).sendKeys(TestName);
	
	WebElement hammerdropdown = driver.findElement(cbmselecthammerlabel);		
	Select hammerselect = new Select(hammerdropdown);        
	hammerselect.selectByIndex(1);
	log.info("Hammer lebel selected");
	
	WebElement pkgdropdown = driver.findElement(cbmselectpack);		
	Select pkgselect = new Select(pkgdropdown);        
	pkgselect.selectByIndex(1);
	log.info("Package CBM Asterisk Package selected");
	driver.findElement(cbmConfid).clear();
	driver.findElement(cbmConfid).sendKeys("1234#");
	log.info("Conference ID provided");
	driver.findElement(cbmConfpin).clear();
	driver.findElement(cbmConfpin).sendKeys("1234#");
	log.info("Conference Pin provided");
	driver.findElement(cbmMunberToCall).sendKeys("18002051994");
	log.info("Number to call provided");
	driver.findElement(cbmTotalParticipate).clear();
	driver.findElement(cbmTotalParticipate).sendKeys("10");
	log.info("Total Participate provided");

	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	
	 wait.until(ExpectedConditions.elementToBeClickable(cbmSaveButtonTestTab)).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
		
	driver.findElement(viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow located");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.viewConfigButton));
	
	WebElement ele = driver.findElement(dashboard2.viewConfigButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(dashboard2.viewConfigButton)).click();
//	driver.findElement(dashboard2.viewConfigButton).click();
	log.debug("View Configuration button clicked");
//	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	

}

//=================================================================================================================================


//Create a Test 27.0

public void Delete_CBM_Test() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.testTab)).click();
	log.info("=========================Test Creation=======================");
//	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(1);
	log.info("IVR Test Selected from Test Selection dropdown");	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");		
	wait.until(ExpectedConditions.presenceOfElementLocated(testNameField));

	String TestName="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom CBM Test Name " +TestName);
	driver.findElement(testNameField).sendKeys(TestName);
	
	WebElement hammerdropdown = driver.findElement(cbmselecthammerlabel);		
	Select hammerselect = new Select(hammerdropdown);        
	hammerselect.selectByIndex(1);
	log.info("Hammer lebel selected");
	
	WebElement pkgdropdown = driver.findElement(cbmselectpack);		
	Select pkgselect = new Select(pkgdropdown);        
	pkgselect.selectByIndex(1);
	log.info("Package CBM Asterisk Package selected");
	driver.findElement(cbmConfid).clear();
	driver.findElement(cbmConfid).sendKeys("1234#");
	log.info("Conference ID provided");
	driver.findElement(cbmConfpin).clear();
	driver.findElement(cbmConfpin).sendKeys("1234#");
	log.info("Conference Pin provided");
	driver.findElement(cbmMunberToCall).sendKeys("18002051994");
	log.info("Number to call provided");
	driver.findElement(cbmTotalParticipate).clear();
	driver.findElement(cbmTotalParticipate).sendKeys("10");
	log.info("Total Participate provided");

	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	
	 wait.until(ExpectedConditions.elementToBeClickable(cbmSaveButtonTestTab)).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");

}

//=======================================================================================================================

//Create a Test 27.0

public void Update_CBM_Test() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.testTab)).click();
	log.info("=========================Test Creation=======================");
//	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(1);
	log.info("IVR Test Selected from Test Selection dropdown");	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");		
	wait.until(ExpectedConditions.presenceOfElementLocated(testNameField));

	String TestName="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom CBM Test Name " +TestName);
	driver.findElement(testNameField).sendKeys(TestName);
	
	WebElement hammerdropdown = driver.findElement(cbmselecthammerlabel);		
	Select hammerselect = new Select(hammerdropdown);        
	hammerselect.selectByIndex(1);
	log.info("Hammer lebel selected");
	
	WebElement pkgdropdown = driver.findElement(cbmselectpack);		
	Select pkgselect = new Select(pkgdropdown);        
	pkgselect.selectByIndex(1);
	log.info("Package CBM Asterisk Package selected");
	driver.findElement(cbmConfid).clear();
	driver.findElement(cbmConfid).sendKeys("1234#");
	log.info("Conference ID provided");
	driver.findElement(cbmConfpin).clear();
	driver.findElement(cbmConfpin).sendKeys("1234#");
	log.info("Conference Pin provided");
	driver.findElement(cbmMunberToCall).sendKeys("18002051994");
	log.info("Number to call provided");
	driver.findElement(cbmTotalParticipate).clear();
	driver.findElement(cbmTotalParticipate).sendKeys("10");
	log.info("Total Participate provided");

	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	 
	 
	
	 
	
	 wait.until(ExpectedConditions.elementToBeClickable(cbmSaveButtonTestTab)).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(viewResult));
	log.info("View Button enabled");
	
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	
	driver.findElement(viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.debug("progress");
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestNowButton));
	log.debug("TestNow located");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.viewConfigButton));
	
	WebElement ele = driver.findElement(dashboard2.viewConfigButton);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(dashboard2.viewConfigButton)).click();
//	driver.findElement(dashboard2.viewConfigButton).click();
	log.debug("View Configuration button clicked");
//	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	
		
	driver.findElement(testNameField).sendKeys("CBM_Update_");
	
	log.info("Update Test Name");

	
	 WebElement ele0 = driver.findElement(cbmSaveButtonTestTab);
	 JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	 executor0.executeScript("arguments[0].click();", ele0);
	
	Thread.sleep(1000);
	
	
	// wait.until(ExpectedConditions.elementToBeClickable(cbmSaveButtonTestTab)).click();
	 log.info("clicked Save Test button");
	 
	 wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	 log.info("Test Updated successsfully");
	 
	 
	 WebElement ele2 = driver.findElement(deleteButton);
	 JavascriptExecutor executor2 = (JavascriptExecutor)driver;
	 executor2.executeScript("arguments[0].click();", ele2);
	 
	 Thread.sleep(1000);
	
//	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");
	
	WebElement ele3 = driver.findElement(yesDeleteButton);
	 JavascriptExecutor executor3 = (JavascriptExecutor)driver;
	 executor3.executeScript("arguments[0].click();", ele3);
	
	
//	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");

}

//============================================================================================================================================================


//Create a Test 27.0

public void CBM_Test_Now_Using_CB_Asterisk_Meeting_PKG() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.testTab)).click();
	log.info("=========================Test Creation=======================");
//	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(1);
	log.info("CBM Test Selected from Test Selection dropdown");	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");		
	wait.until(ExpectedConditions.presenceOfElementLocated(testNameField));

	String TestName="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom CBM Test Name " +TestName);
	driver.findElement(testNameField).sendKeys(TestName);
	
	WebElement hammerdropdown = driver.findElement(cbmselecthammerlabel);		
	Select hammerselect = new Select(hammerdropdown);        
	hammerselect.selectByIndex(1);
	log.info("Hammer lebel selected");
	
	WebElement pkgdropdown = driver.findElement(cbmselectpack);		
	Select pkgselect = new Select(pkgdropdown);        
	pkgselect.selectByIndex(1);
	log.info("Package CBM Asterisk Package selected");
	driver.findElement(cbmConfid).clear();
	driver.findElement(cbmConfid).sendKeys("1234#");
	log.info("Conference ID provided");
	driver.findElement(cbmConfpin).clear();
	driver.findElement(cbmConfpin).sendKeys("1234#");
	log.info("Conference Pin provided");
	driver.findElement(cbmMunberToCall).sendKeys("18002051996");
	log.info("Number to call provided");
	driver.findElement(cbmTotalParticipate).clear();
	driver.findElement(cbmTotalParticipate).sendKeys("10");
	log.info("Total Participate provided");

	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	
	 wait.until(ExpectedConditions.elementToBeClickable(cbmSaveButtonTestTab)).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
		
	driver.findElement(viewResult).click();
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
//  log.info("Waiting of Test result element");
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
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	
}
}
//=======================================================================================================================================================


//Create a Test 27.0

public void CBM_Test_Now_Using_CB_Webinar_Meeting_PKG() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.testTab)).click();
	log.info("=========================Test Creation=======================");
//	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(1);
	log.info("CBM Test Selected from Test Selection dropdown");	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");		
	wait.until(ExpectedConditions.presenceOfElementLocated(testNameField));

	String TestName="CBM_Test_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom CBM Test Name " +TestName);
	driver.findElement(testNameField).sendKeys(TestName);
	
	WebElement hammerdropdown = driver.findElement(cbmselecthammerlabel);		
	Select hammerselect = new Select(hammerdropdown);        
	hammerselect.selectByIndex(1);
	log.info("Hammer lebel selected");
	
	WebElement pkgdropdown = driver.findElement(cbmselectpack);		
	Select pkgselect = new Select(pkgdropdown);        
	pkgselect.selectByIndex(2);
	log.info("Package CBM Asterisk Package selected");
	driver.findElement(cbmConfid).clear();
	driver.findElement(cbmConfid).sendKeys("1234#");
	log.info("Conference ID provided");
	driver.findElement(cbmConfpin).clear();
	driver.findElement(cbmConfpin).sendKeys("1234#");
	log.info("Conference Pin provided");
	driver.findElement(cbmMunberToCall).sendKeys("18002051995");
	log.info("Number to call provided");
	driver.findElement(cbmTotalParticipate).clear();
	driver.findElement(cbmTotalParticipate).sendKeys("10");
	log.info("Total Participate provided");

	 JavascriptExecutor js = (JavascriptExecutor) driver;
	 js.executeScript("window.scrollBy(0,-500)");	
	
	 wait.until(ExpectedConditions.elementToBeClickable(cbmSaveButtonTestTab)).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
		
	driver.findElement(viewResult).click();
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
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	
}
	 
}
//==========================================================================================================================================


//======================================================================================================================================================

//Create a Test using link 26.2

public void CreateTest_using_Link() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptsTab)).click();
//	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to Script Tab");
	log.info("=================New Script Creation===========================");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptBylink)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");

	log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
//	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	driver.findElement(testNameField).sendKeys("IVR_Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	log.info("=========================Celaning Test Data======================");
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate back to script tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter: " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.selectfirstsearch)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	driver.findElement(ScriptTab.selectdropdownn).click();
	log.info("Verified that select dropdown");
	if (driver.findElements(ScriptTab.clickdeletedropdown).size()!=0){
		
		log.info("delete button not found, so delete functinality not avaiable");
	} else {
		
	
	log.info("Verified that Clicked delete button");
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Waiting for aleart");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
	log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed=================");
	}
}


//=================================================================================
//Delete Test 26.2

public void DeleteTest_26() throws InterruptedException {
	wait=new WebDriverWait(driver,30);		
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to Script Tab");
	log.info("=================New Script Creation=====================");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");
    log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
//	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	driver.findElement(testNameField).sendKeys("Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	log.info("=======================Test Deletion====================");
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	log.info("=========================Celaning Test Data===============");
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
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
    log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed====================");
}

//===============================================================================================================
//Delete Test 27.0

public void DeleteTest() throws InterruptedException {
	wait=new WebDriverWait(driver,30);		
	driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to Script Tab");
	log.info("=================New Script Creation=====================");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));	
	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");
	
	log.debug("Verified that Script dropdown"); 		 
	WebElement scriptDropdown = driver.findElement(ScriptTab.scriptSelectionDropdown);		
	Select ScriptSelection = new Select(scriptDropdown);        
	ScriptSelection.selectByIndex(0);
	log.debug("Verified that IVR Script selected from dropdown"); 
	driver.findElement(ScriptTab.scriptGoBut).click();
	log.debug("Verified that Go button clicked while select IVR Scriptn"); 	
	driver.findElement(ScriptTab.e164disabled).click();
	log.debug("Verified that e164disabled");	
	
	String ScriptName="_IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
//	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	driver.findElement(ScriptTab.numberToCalle164disabled).sendKeys("18002051994");
	log.info("Passing Number to Call is 18002051994");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");
  log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
	
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");
	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");	
	
//	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	driver.findElement(testNameField).sendKeys("IVR_Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown27);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	log.info("=======================Test Deletion====================");
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	log.info("Delete Test Successfully");	    
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	log.info("=========================Celaning Test Data===============");
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
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.switchTo().alert().accept();
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();	
	log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed====================");
}

//================================================================================================================
//Update Test 26.2

public void UpdateTest_26() throws InterruptedException {
	wait=new WebDriverWait(driver,30);		
    driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to Script Tab");
	log.info("=================New Script Creation===========================");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");
    log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	String TestName="Test_"+ScriptName;
	log.info("Generated random Test Name: "+TestName );
	driver.findElement(testNameField).sendKeys(TestName);
//	getTestName().sendKeys(TestName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that View button button enabled");
	log.info("=========================Test Update=======================");
	driver.findElement(filterBox).sendKeys(TestName);
	log.info("Search above created Test");
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchTest)).click();
	log.info("Reterived above created Test");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	getTestName().clear();
	log.info("Cleaned Name of above test");
	driver.findElement(testNameField).sendKeys("Update_"+TestName);
//	getTestName().sendKeys("Update_"+TestName);
	log.info("Update Test Name as:Update_"+TestName );
	driver.findElement(saveButtonTestTab).click();
	log.info("Save above Updated Test name");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that View button button enabled");
	log.info("=========================Celaning Test Data===============");
	if (driver.findElements(deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
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
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
    log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed====================");
	}
}

//==================================================================================================================================================

//Update Test 27.0

public void UpdateTest() throws InterruptedException {
	wait=new WebDriverWait(driver,30);		
  driver.findElement(ScriptTab.scriptsTab).click();
	log.info("Navigate to Script Tab");
	log.info("=================New Script Creation===========================");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));	
	WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");
	
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
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCalle164disabled).sendKeys("18002051994");
	log.info("Passing Number to Call is 18002051994");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");
  log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
//	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");
	
	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");
		
	String TestName="Test_"+ScriptName;
	log.info("Generated random Test Name: "+TestName );
	driver.findElement(testNameField).sendKeys(TestName);
//	getTestName().sendKeys(TestName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown27);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that View button button enabled");
	log.info("=========================Test Update=======================");
	driver.findElement(filterBox).sendKeys(TestName);
	log.info("Search above created Test");
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchTest27)).click();
	
		log.info("Reterived above created Test");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	getTestName().clear();
	log.info("Cleaned Name of above test");
	driver.findElement(testNameField).sendKeys("Update_"+TestName);
//	getTestName().sendKeys("Update_"+TestName);
	log.info("Update Test Name as:Update_"+TestName );
	driver.findElement(saveButtonTestTab).click();
	log.info("Save above Updated Test name");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that View button button enabled");
	log.info("=========================Celaning Test Data===============");
	if (driver.findElements(deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
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
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.switchTo().alert().accept();
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
	log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed====================");
	}
}


//=================================================================================================================================================
//Test Now 26.2

public void Test_Now_Test_26() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptsTab)).click();
	// driver.findElement(ScriptTab.scriptsTab).click();
		log.info("Navigate to Script Tab");
		log.info("=================New Script Creation===========================");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar loading");
		wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
		log.info("Start Creating Script using + button");
		String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.info("Generate Radom Scriptname " +ScriptName);	
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCall).sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");

	log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	driver.findElement(testNameField).sendKeys("Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	log.info("=========================Test Now=======================");
	driver.findElement(viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
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
	 Thread.sleep(45000); 	
    driver.navigate().refresh();
    Thread.sleep(20000); 	
    driver.navigate().refresh();
    log.info("Refersh Web Page");
    wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestResultStatus));
    log.info("Waiting of Test result element");
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
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
//	log.info("found progress bar loading");
	if (driver.findElements(deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
		
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
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
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele1 = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
    log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed===============================");
	}
}

//===========================================================================================================================

//Test Now 27.0

public void Test_Now_Test() throws InterruptedException {
	wait=new WebDriverWait(driver,30);	
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptsTab)).click();
	// driver.findElement(ScriptTab.scriptsTab).click();
		log.info("Navigate to Script Tab");
		log.info("=================New Script Creation===========================");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar loading");
		wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptByButton)).click();
		log.info("Start Creating Script using + button");
		wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.newScriptCreationPopup));	
		WebElement ele0 = driver.findElement(ScriptTab.newScriptCreationPopup);
		JavascriptExecutor executor0 = (JavascriptExecutor)driver;
		executor0.executeScript("arguments[0].click();", ele0);
		log.info("New script creation popup appered");
		log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
		log.info("Clicked Yes");
		
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
	//ScriptTab.getScriptName().sendKeys(ScriptName);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCalle164disabled).sendKeys("18002051995");
	log.info("Passing Number to Call is 18002051995");
	driver.findElement(ScriptTab.deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(ScriptTab.deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(ScriptTab.deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	Thread.sleep(1000);
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(ScriptTab.PauseButton)).doubleClick().build().perform();
	log.info("Double Click on pause button Using Action class");
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.saveButton)).click();
	log.info("Clicked script Save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button enabled");
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contains Run Test text on the button");

	log.info("=========================Test Creation=======================");
	driver.findElement(home_Page.testTab).click();
	log.info("Navigate to Test Tab");
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton)).click();
//	driver.findElement(testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	WebElement testDropdown = driver.findElement(testSelectionDropdown);		
	Select testSelection = new Select(testDropdown);        
	testSelection.selectByIndex(0);
	log.info("IVR Test Selected from Test Selection dropdown");
	
	wait.until(ExpectedConditions.elementToBeClickable(testGoBuT)).click();
//	driver.findElement(testGoBuT).click();
	log.info("Start Creating Test using + button");	
	
	driver.findElement(testNameField).sendKeys("IVR_Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(ScriptDropdown27);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	log.info("=========================Test Now=======================");
	driver.findElement(viewResult).click();
	log.debug("ViewResult button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
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

  
  wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestResultStatus));
//  log.info("Waiting of Test result element");
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
	wait.until(ExpectedConditions.elementToBeClickable(viewResult));
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
//	log.info("found progress bar loading");
	if (driver.findElements(deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
		
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
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
//	driver.findElement(ScriptTab.deleteAllData).click();
	WebElement ele1 = driver.findElement(ScriptTab.deleteAllData);
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	log.info("Verified that select delete all data");
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.switchTo().alert().accept();
  
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
	log.info(" Above all date clened/deleted successfully");
	log.info("=========================Test Completed===============================");
	}
	

		
		
	}
	 else {
		 
//=====================================================================================		 
		 
		  wait.until(ExpectedConditions.presenceOfElementLocated(dashboard2.TestResultStatus));
		//  log.info("Waiting of Test result element");
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
			wait.until(ExpectedConditions.elementToBeClickable(viewResult));
//			wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
//			log.info("found progress bar loading");
			if (driver.findElements(deleteButton).isEmpty()){
				log.info("Delete button not found");
			} else {
				
			wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
			log.info("Delete button clicked under Test Tab");		
			wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
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
//			driver.findElement(ScriptTab.deleteAllData).click();
			WebElement ele1 = driver.findElement(ScriptTab.deleteAllData);
			JavascriptExecutor executor1 = (JavascriptExecutor)driver;
			executor1.executeScript("arguments[0].click();", ele1);
			log.info("Verified that select delete all data");
//			wait.until(ExpectedConditions.alertIsPresent());
//			driver.switchTo().alert().accept();
		  
			wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.deletemessagepopup)).click();
			log.info(" Above all date clened/deleted successfully");
			log.info("=========================Test Completed===============================");
			}	 
		 
		
	}
}



//==========================================================================================================================
public void Testdeletion() throws InterruptedException {
	
	pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
	wait=new WebDriverWait(driver,30);
	driver.navigate().refresh();
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.testTab)).click();
//	driver.findElement(notifiTab).click();
	log.debug("Test Tab clicked");	
	
	
	By scope=By.xpath("//*[@class='nav nav-sidebar tests ng-scope']");
	
	wait.until(ExpectedConditions.presenceOfElementLocated(scope));
	
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton));
	
	
// nav nav-sidebar tests ng-scope	
	
//	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']"));
	
//	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests ng-scope']"));
	
	
	List<WebElement> elements = driver.findElements(scope);
	
	 for (WebElement element : elements) {
	    System.out.println(element.getText()); 
if (element.getText().contains("CBM_Test_")) {

	element.click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	
	driver.findElement(deleteButton).click();
//	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");	
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.findElement(yesDeleteButton).click();
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	 
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("Test Delete Successfully");	
	Thread.sleep(500);
		    
}
	 }
	    
	 }
	

public void CBMTestdeletion() throws InterruptedException {
	
	pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
	wait=new WebDriverWait(driver,30);
	driver.navigate().refresh();
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.testTab)).click();
//	driver.findElement(notifiTab).click();
	log.debug("Test Tab clicked");	
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	wait.until(ExpectedConditions.elementToBeClickable(testCreateplusbutton));
	log.debug("Test Create plus icon found");	
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']"));
	
	 for (WebElement element : elements) {
	    System.out.println(element.getText()); 
if (element.getText().contains("CBM_Test_")) {

	element.click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	
	driver.findElement(deleteButton).click();
//	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	log.info("Delete button clicked under Test Tab");	
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.findElement(yesDeleteButton).click();
	wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	 
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("Test Delete Successfully");	
	Thread.sleep(500);
		    
	    
	    
	 }

	 }

}
}
//=============================================================================================
//Delete Test

//Will ask ====================================================================

/*public void DeleteTestopt() throws InterruptedException {
	wait=new WebDriverWait(driver,30);		
	    ScriptTab.CreateScriptTest();
	    driver.findElement(testTab).click();
	    log.info("Navigate to Test Tab");	
	     driver.findElement(testCreateplusbutton).click();	
	     log.info("Clicked Test Create icon");
	     driver.findElement(testNameField).sendKeys("Test_"+pom000_Reuseable_Script_for_Page.getSaltString());    
	   
	    log.info("Test Name Passing");
	     WebElement dropdown = driver.findElement(ScriptDropdown); 	 	 
	     Select s = new Select(dropdown);	
	     s.selectByVisibleText(ScriptTab.ScriptName);	
	     log.info("clicked above search script");   
	     
	     wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	     log.info("Progressbar while click drop down");
	    driver.findElement(saveButtonTestTab).click();
	   log.info("clicked above Save button");
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	   log.info("Progressbar after click save button");

	     Assert.assertTrue(driver.findElement(viewResult).isEnabled());
	    log.info("Verified that viewResult button enabled");
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	    log.info("Progressbar after click save button");
	    wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	    log.info("Delete button clicked");
	    		
	    wait.until(ExpectedConditions.elementToBeClickable(yesDeleteButton)).click();	    
	    log.info("Delete Test Successfully");	    
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	    
	    driver.findElement(ScriptTab.scriptsTab).click();
	    log.info("Navigate back to script tab");
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
	   
	   driver.findElement(ScriptTab.filterByNameGSB).sendKeys(ScriptTab.ScriptName);
	   log.info("Search above created Script using filter " +ScriptTab.ScriptName);
	
	   log.info("Sync issue so waiting just nine second");
	   wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.firstsearchscript)).click();;
	  log.info("Just retrived the deatils of above created script "+ScriptTab.ScriptName);
	
	Assert.assertTrue(driver.findElement(ScriptTab.RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	
	Assert.assertEquals(driver.findElement(ScriptTab.RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	
	driver.findElement(ScriptTab.selectdropdownn).click();
	log.info("Verified that select dropdown");	
		
	driver.findElement(ScriptTab.clickdeletedropdown).click();	
	log.info("Verified that Clicked delete button");	
	driver.findElement(ScriptTab.deleteAllData).click();	
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	
	log.info("delete Script deleted successfully");
	    
	

}*/
	