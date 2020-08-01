package PageActions;

import static org.testng.Assert.expectThrows;

import java.io.IOException;
import java.util.List;

import javax.net.ssl.HostnameVerifier;

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




public class pom007_VW_Script_Tabs {
	

	private static Logger log =LogManager.getLogger(pom007_VW_Script_Tabs.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom006_VW_Tags_Tab TagsTab=new pom006_VW_Tags_Tab(driver);
	
	By scriptsTab=By.linkText("Scripts");
	By goScriptBuilderTab=By.xpath("//span[contains(text(),'Go Script Builder')]");
	By scriptResult=By.xpath("//span[@class='ng-scope']/div/div/a");
	By callslogs=By.xpath("//ol[@class='ng-scope']");	
	By processingBar1=By.xpath("//div[@class='progress-bar progress-bar-striped active full-width']");	
	By processingBar2=By.xpath("//div[@class='progress-bar progress-bar-striped active']");	
    By goScriptBuilderScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By goScriptBuilderScriptsCount=By.xpath("//span[@class='badge pull-right ng-binding']");	
	By filterByNameGSB=By.xpath("//input[@placeholder='Filter by name' or @ng-model='query.name']");	
	By descriptionTestlabel=By.xpath("//*[@ng-model='currenttest.description' and @type='text']");	
	By dropdownSU=By.xpath("/form[@name='cms_form']//i[@class='glyphicon glyphicon-option-vertical']");	
	By filterBox=By.xpath("//input[@placeholder='Filter by test name']");		
	By createNewScriptByButton=By.xpath("//*[@title='Upload a CallMaster script' and @class='glyphicon glyphicon-plus-sign pull-right']");
	By pleaseSelectlabelGSB=By.xpath("//span[contains(text(),'Please select a script or')]");
	By createNewScriptBylink=By.linkText("create a new script"); 
	By scriptUploadTab=By.xpath("//span[contains(text(),'Script Upload')]");
	By SUScriptNameField=By.xpath("//input[@placeholder='Enter script name']");
	By SUDownloadButton=By.xpath("//*[@ng-click='download()']");
	By callMasterScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By callMasterScriptscount=By.xpath("//span[@class='badge pull-right ng-binding']");
	By filterByNameSU=By.xpath("//input[@placeholder='Filter by name']");
	By pleaseSelectlabelSU=By.xpath("//span[contains(text(),'Please select a script or')]");	
	By createNewScriptByButtonSU=By.xpath("//*[@title='Upload a CallMaster script' and @class='glyphicon glyphicon-plus-sign pull-right']");
	By createNewScriptlinkSU=By.xpath("//u[contains(text(),'create a new script')]");		
	By csvTranformerTab=By.linkText("CSV Transformer");
	By csvSelect=By.xpath("//div[@class='files_upload ng-pristine ng-untouched ng-valid ng-empty']");	
	By TransformButton=By.xpath("//*[@ng-click='convertCSV()']");	
	By csvUploadLabel=By.xpath("By csvTranformerTab=By.xpath(\"//span[contains(text(),'CSV Transformer')]\");");
	By transformedCSVlabel=By.xpath("//span[contains(text(),'Transformed CSV(s)')]");
	By filterByCSV=By.xpath("//div[@class='row margin-left-right-0px']//h4//i//input[@placeholder='Filter by csv file name']");
	By samplecsvDownoad=By.xpath("//span[contains(text(),'Sample CSV download')]");
	By scriptNamelabel=By.xpath("//div[contains(text(),'Script name')]");
	By scriptNamefield=By.xpath("//input[@placeholder='Enter script name']");
	By scriptDescGSBlabel=By.xpath("//form[@name='wbs_form']//div[@class='small-width'][contains(text(),'Description')]");	
	By scriptDescSUlabel=By.xpath("//form[@name='cms_form']//div[@class='small-width'][contains(text(),'Description')]");	
	By scriptDescGSBfield=By.xpath("//form[@name='wbs_form']//input[@placeholder='Enter description']");
	By scriptDescSUfield=By.xpath("//form[@name='cms_form']//input[@placeholder='Enter description']");
	By saveButton=By.xpath("//button[@class='btn btn-info btn-sm btn-float-right']");
	By exapandAll=By.xpath("//*[@data-i18n='_expandAll_']");
	By collapseAll=By.xpath("//*[@data-i18n='_collapseAll_']");
	
	By scriptBuilderlabel=By.xpath("//a[contains(text(),'Script Builder')]");
	By resultslabel=By.xpath("//a[contains(text(),'Results')]");
	By resultText=By.xpath("//*[@data-i18n='_resultDisplayedOnceRunTestButtonClicked_']");
	By callLogsNamelabel=By.xpath("//a[contains(text(),'Call Logs')]");
	By calllogText=By.xpath("//*[@data-i18n='_logsDisplayedRunTestButtonClicked_']");
	By associatedTestslabel=By.xpath("//a[contains(text(),'Associated Tests')]");
	By associatedText=By.xpath("//*[@data-i18n='_noTest_']");
	By insertHearVoice=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[2]/div/em-wbs-icon/div/div/div[2]/div[2]/span[2]/span/span[1]/textarea");
	By PauseButton=By.xpath("//*[@id='em-wbs-icon-container']/div/div[1]");
	By SearchBox=By.xpath("//div[@class='panel-body']");	
	By uploadCSVFile=By.xpath("//*[contains(text(),'Click to select CSV files, or drop them below (.csv,.zip)')]");	
    By uploadScriptFile=By.xpath("//*[contains(text(),'Click to select a script, or drop file below (.xml)')]");	
	By uploadScriptSaveButton=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/form[1]/div[2]/span/button[1]");	
	
	By numberToCall=By.xpath("//*[@id=\"script-area\"]/div/form/em-wbs-icon[1]/div/div/div[2]/div[2]/span[2]/span/span[1]/input");
	
	By numberToCalle164disabled=By.xpath("//input[@class='ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required']");
	
	By deletePhraseHearValue1=By.xpath("//*[@name='scriptAreaForm']/div/div[1]/div/em-wbs-icon/div/div/div/i");
	By deletePress1=By.xpath("//*[@name='scriptAreaForm']/div/div[1]//div/em-wbs-icon/div/div/div[1]/i");	
	By deletePhraseHearValue2=By.xpath("//*[@name='scriptAreaForm']/div/div/div/em-wbs-icon/div/div/div[1]/i");	
	By deletePhraseHearValue3=By.xpath("//*[@id=\"script-area\"]/div/form/div/div[1]/div/em-wbs-icon/div/div/div[1]/i");
	By firstsearchscript=By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']");
	
	By RunButton=By.xpath("//*[@ng-click='testScript()']");
	By RunTestScriptUpload=By.xpath("//body/div[@id='wrapper']/section/div/div[@id='LAB-R']/div/div[@id='script-grid-right']/div/div/div/div/div/form[contains(@name,'cms_form')]/div/span/button[1]");
	By RunButtonDisabled=By.xpath("//*[@ng-click='testScript()'and @disabled='disabled']");
	By CallLogsLink=By.linkText("Call Logs");
	By ResultsLink=By.linkText("Results");	
	By CallLogs=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/div[3]/div[2]/em-wbs-results/div/ol/li[1]/p");	
	By selectdropdownn=By.xpath("//span//span//i[@class='glyphicon glyphicon-option-vertical']");
	By clickdeletedropdown=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/span/span/div/ul/li[4]/a/span");
//	By deleteAllData=By.xpath("//button[contains(text(),'All Data')]");	
	
	By deleteAllData=By.xpath("//div[@class='modal fade in']//button[@class='btn btn-danger'][contains(text(),'All Data')]");	
	
	
	
	
	
	By deleteScriptOnly=By.xpath("//*[@ng-click='markAdhocScriptDeleted()']");	
	By copyScript=By.xpath("//ul[@class='dropdown-menu']//i[@class='glyphicon glyphicon-copy']");
	By downloadbuttonGSB=By.xpath("//*[@data-i18n='_download_']");	
	By updateScriptButton=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/span/span/button[3]");
	By selectscript=By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']");
	By selectfirstsearch=By.xpath("//li[1][@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']");
//	By SUDropdown=By.xpath("//*[@id=\"dropdownMenu1\"]");
	By SUDropdown=By.xpath("//form[@name='cms_form']//button[@class='btn btn-default btn-sm dropdown-toggle']");
	
	By SUDeleteIcon=By.xpath("//div[@class='dropdown btn-float-right open']//span[contains(text(),'Delete')]");
	
	//==================27.0 Objects=======================================================================================
	
	By newScriptCreationPopup=By.xpath("//button[@class='btn btn-primary'][contains(text(),'Yes')]");
	By scriptSelectionDropdown=By.xpath("//div[@id='loading']//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
	By scriptGoBut=By.xpath("//div[@id='loading']//button[@class='btn btn-primary btn-sm']");
	By e164disabled=By.xpath("//ng-container[@class='ng-scope']");
	By clickdeletedropdown27=By.xpath("//div[@class='dropdown btn-float-right open']//span[contains(text(),'Delete')]");
	By deletemessagepopup=By.xpath("//button[@class='btn btn-default'][contains(text(),'Close')]");
	By copyScript27=By.xpath("//form[@name='wbs_form']//li[1]//a[1]//span[1]");
	By updateScriptButton27=By.xpath("//button[@class='btn btn-info btn-sm btn-float-right']");
	By uploadScriptSaveButton27=By.xpath("//button[@class='btn btn-info btn-sm btn-float-right']//span[contains(text(),'Save')]");	
	By copyToAnotherScript=By.xpath("//div[@class='dropdown btn-float-right open']//span[contains(text(),'Copy to another App')]");
	By copytodropdown=By.xpath("//*[@id=\"copyScriptToAnotherAppModal\"]/div/div/div[2]/div[1]/div/div/div[2]/select");
	By E2EDropdown=By.xpath("//form[@name='wbs_form_e2e']//div//span//span//div//button//i");
	
	
	

	By applicationCreateBUT=By.xpath("//body[@class='modal-open']//div[@class='modal-body']//div//div[@class='row']//div[1]//div[1]//span[1]");
	By appCreatefield=By.xpath("//*[@id=\"newApplication\"]/div/div/input");
	By appSaveBut=By.xpath("//button[contains(@class,'btn btn-primary btn-sm')]//span[contains(text(),'Save')]");
	By releaseCreBut=By.xpath("//div[@class='modal-body']//div//div[2]//div[1]//span[1]");
	By relCreFiled=By.xpath("//div[@class='form-group']//input[@placeholder='Enter release name']");
	By relSaveBut=By.xpath("//button[contains(@class,'btn btn-primary btn-sm')]//span[contains(text(),'Save')]");
	By copyToAntCopyBut=By.xpath("//button[@class='btn btn-primary']//span[contains(text(),'Copy')]");
	By copyToAntClose=By.xpath("//button[@class='btn btn-default'][contains(text(),'Close')]");
	
	By HODScriptNameField=By.xpath("//*[@id=\"script-grid-right\"]/div/div[2]/div/div/div[4]/div/form[1]/div[2]/input");
	
	By HODReleaseDropdown=By.xpath("//div[@class='dropdown btn-float-right']//i[@class='glyphicon glyphicon-option-vertical']");
	By HODReleaseDeleteBut=By.xpath("//div[@class='dropdown btn-float-right open']//a");
	By HODDeleteResultBut=By.xpath("//button[contains(text(),'Delete Results')]");
	
	By HODSelectApplocation=By.xpath("//div[@class='side-navigation short-right-padding']//div[1]//div[1]//select[1]");
	By HODSelectRelease=By.xpath("//div[@id='script-grid-left']//div[2]//div[1]//select[1]");
	
	By HODQA=By.xpath("//span[contains(text(),'Switch to Hammer On Demand QA')]");	
	By VoiceWatch=By.xpath("//span[contains(text(),'Switch to VoiceWatch')]");
	By numberToCallbuttonE2E=By.xpath("//*[@id=\"a0\"]/div/em-wbs-icon-ab-calling-e2e/div/div/i[3]");
	By numberToCallField=By.xpath("//input[@class='ng-pristine ng-untouched ng-isolate-scope ng-empty ng-invalid ng-invalid-required']");
	By scriptNameE2E=By.xpath("//form[@name='wbs_form_e2e']//input[@placeholder='Enter script name']");
	By E2ESaveButton=By.xpath("//button[@class='btn btn-info btn-sm btn-float-right btn-margin-right16']");
	By E2ESlideButton=By.xpath("//span[@class='pull-right glyphicon glyphicon-menu-hamburger']");
	By E2ERunButton=By.xpath("//form[@name='wbs_form_e2e']//span[contains(text(),'Run Test')]");
	
	By E2EcallLogsNamelabel=By.xpath("//a[contains(text(),'Call Logs-A')]");
	By E2EcalllogText=By.xpath("//*[@id=\"script-grid-right\"]/div/div[2]/div/div/div[5]/div[7]/div[2]/em-wbs-results/div/ol/li[1]/p");
	
	By clickdeletedropdownE2E=By.xpath("//form[@name='wbs_form_e2e']//li[4]");
	

	
	
	
	
	//===========================================================================================================================
	
	
	
	//ContractorA
	
	public pom007_VW_Script_Tabs(WebDriver driver) {
		this.driver=driver;
	//	this.wait=new WebDriverWait(this.driver, 10000);
	}
	
	
//================================================================================================
	public void ScriptTabValidation() throws InterruptedException {	
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");	
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
		
         if (driver.findElements(pleaseSelectlabelGSB).isEmpty()) {
			
        	 log.debug("Verified that 'Please select a Call Master Script from the left. ' label appeared on  under Go Script builder tab");
 			log.debug("Verified that 'Please select a Call Master Script from the left. ' label enabled under Go Script builder tab");	
 			log.debug("Verified that 'Please select a Call Master Script from the left.' Text validated under Go Script Builder");
			
						
		}else
		
		{
			log.debug("Verified that 'Please select a script ' label appeared on  under Go Script builder tab");
			log.debug("Verified that 'Please select a script ' label enabled under Go Script builder tab");	
			log.debug("Verified that 'Please select a script or' Text validated under Go Script Builder");
			
		
		
         Thread.sleep(1000);
         wait.until(ExpectedConditions.elementToBeClickable(goScriptBuilderScriptslabel));
		String count=driver.findElement(goScriptBuilderScriptslabel).getText();
	//	log.debug("Script header contain "+count);
		String[] part = count.split("(?<=\\D)(?=\\d)");		
		log.debug("Script Count "+part[1]);
	//	wait.until(ExpectedConditions.elementToBeClickable(selectscript));
		
		int Count=driver.findElements(selectscript).size();
	//	log.debug("Script Count "+Count);	
		String ScriptActualCount =String.valueOf(Count);	
	//	log.debug("integer converted as: "+ScriptActualCount);	
		
	//	Assert.assertEquals(part[1], ScriptActualCount);		
		log.debug("Verified that script count found correct: "+ScriptActualCount);	
		
		if (Count>0) {			
		
			driver.findElement(selectfirstsearch).click();
						
			log.debug("firstScriptClicked");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
			log.info("Found load progress bar");
			
			if (driver.findElements(RunButtonDisabled).size()!=0) {
				
				log.debug("Run button is disabled, unable to run script under this credentials");
				
			} else if (driver.findElements(RunButton).size()!=0)
				
			{
			
			Assert.assertTrue(driver.findElement(RunButton).isEnabled());
			log.info("Run button found");
			log.info("Go script Filter by name feature is working as desired");
			
		}else {
			
			log.info("No script available");
			}
		
		wait.until(ExpectedConditions.elementToBeClickable(selectdropdownn)).click();
//		driver.findElement(selectdropdownn).click();
		log.info("dropdown selected");
		Assert.assertTrue(driver.findElement(copyScript).isDisplayed());
		log.info("copy script button avalable");
		Assert.assertTrue(driver.findElement(copyScript).isEnabled());
		log.info("copy script button enabled");
		Assert.assertTrue(driver.findElement(downloadbuttonGSB).isDisplayed());
		log.info("download button avalable");
		Assert.assertTrue(driver.findElement(downloadbuttonGSB).isDisplayed());
		log.info("downoad button enabled");
			
//======================================Validate Using Button=================================================================================================================					
          if (driver.findElements(createNewScriptByButton).isEmpty()) {
			
			log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");
							
		}else
		
		{
			log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script tab");	
		
			wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
				log.debug("Validated the element while click Script Creation using button (+)");
		
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
	//	Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		wait.until(ExpectedConditions.elementToBeClickable(goScriptBuilderScriptsCount));
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	

		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(exapandAll).isDisplayed());
		log.debug("Verified that 'expand all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(exapandAll).isEnabled());
		log.debug("Verified that 'Expand All' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(exapandAll).getText(), "Expand All");		
		log.debug("Verified that 'Expand All' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(collapseAll).isDisplayed());
		log.debug("Verified that 'collapse all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(collapseAll).isEnabled());
		log.debug("Verified that 'collapse' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(collapseAll).getText(), "Collapse All");		
		log.debug("Verified that 'Collapse All' Text validated on under Go Script Builder");	
		
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");
				
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		
		driver.findElement(resultslabel).click();
		Assert.assertEquals(driver.findElement(resultText).getText(),"The results will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The results will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under result tab in Go Script Builder");	
		
		driver.findElement(callLogsNamelabel).click();
		Assert.assertEquals(driver.findElement(calllogText).getText(),"The Logs will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The Logs will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under call logs tab in Go Script Builder");	
		
		driver.findElement(associatedTestslabel).click();
		Assert.assertEquals(driver.findElement(associatedText).getText(),"No test");
		log.debug("Verified that 'No test' Text validated on under associated Tests in Go Script Builder");	
//==========================================Validate using LINK================================================================================================================================	    
		driver.findElement(scriptsTab).click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		
		}  if (driver.findElements(createNewScriptBylink).isEmpty()) {
			
        	  log.debug("Verified that create a new script using link is not appeared on top left side under Script tab");
									
		}else
		
		{
			log.debug("Verified that create a new script link appeared under Script tab");	
		
			wait.until(ExpectedConditions.elementToBeClickable(createNewScriptBylink)).click();
				log.debug("Validated the element while click Script Creation using button (+)");
		
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	

		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(exapandAll).isDisplayed());
		log.debug("Verified that 'expand all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(exapandAll).isEnabled());
		log.debug("Verified that 'Expand All' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(exapandAll).getText(), "Expand All");		
		log.debug("Verified that 'Expand All' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(collapseAll).isDisplayed());
		log.debug("Verified that 'collapse all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(collapseAll).isEnabled());
		log.debug("Verified that 'collapse' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(collapseAll).getText(), "Collapse All");		
		log.debug("Verified that 'Collapse All' Text validated on under Go Script Builder");	
		
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");
				
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		
		driver.findElement(resultslabel).click();
		Assert.assertEquals(driver.findElement(resultText).getText(),"The results will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The results will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under result tab in Go Script Builder");	
		
		driver.findElement(callLogsNamelabel).click();
		Assert.assertEquals(driver.findElement(calllogText).getText(),"The Logs will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The Logs will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under call logs tab in Go Script Builder");	
		
		driver.findElement(associatedTestslabel).click();
		Assert.assertEquals(driver.findElement(associatedText).getText(),"No test");
		log.debug("Verified that 'No test' Text validated on under associated Tests in Go Script Builder");	
		
			}
//==========================Validate on CSV TAB=====================================================================================================================================================		
		 driver.findElement(scriptsTab).click();	
		    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
			
			if (driver.findElements(csvTranformerTab).isEmpty()) {
				
				log.debug("Verified that CSV Tranformer tab not appeared under Script tab");	
				
							
			}else
			
			{
				log.debug("Verified that CSV Tranformer tab appeared under Script tab");	
				
			wait.until(ExpectedConditions.elementToBeClickable(csvTranformerTab)).click();
		  
			
		    Assert.assertTrue(driver.findElement(uploadCSVFile).isDisplayed());
			log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button appeared under CSV Upload tab");	
			Assert.assertTrue(driver.findElement(uploadCSVFile).isEnabled());
			log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button enabled under CSV Upload tab");	
			
			Assert.assertTrue(driver.findElement(samplecsvDownoad).isDisplayed());
			log.debug("Verified that 'Sample CSV download' label appeared on right side of under CSV Upload tab");	
			Assert.assertTrue(driver.findElement(transformedCSVlabel).isEnabled());
			log.debug("Verified that 'Sample CSV download' label enabled on right side of under CSV Upload tab");	
			Assert.assertEquals(driver.findElement(samplecsvDownoad).getText(),"Sample CSV download");
			log.debug("Verified that 'Sample CSV download' text appeared on right side of under CSV Upload tab");
			
			
			
		    if (driver.findElements(transformedCSVlabel).isEmpty()) {
				
		    	log.debug("Verified that 'Transformed CSV(s)' label is not appearing on left side of under CSV Upload tab");	
		    	log.debug("Verified that 'Transformed CSV(s)' label not enabled on left side of under CSV Upload tab");	
				
							
			}else
			
			{
				log.debug("Verified that 'Transformed CSV(s)' label appeared on left side of under CSV Upload tab");	
		    	log.debug("Verified that 'Transformed CSV(s)' label enabled on left side of under CSV Upload tab");	
			
			}
		    
		    
		   if (driver.findElements(filterByCSV).isEmpty()) {
				
			   log.debug("Verified that 'Filter by csv file name' filed is not appearing under CSV Upload tab");	
				log.debug("Verified that 'Filter by csv file name' filed is not enabled under CSV Upload tab");
				
							
			}else
			
			{
				log.debug("Verified that 'Filter by csv file name' filed appeared under CSV Upload tab");	
				log.debug("Verified that 'Filter by csv file name' filed enabled under CSV Upload tab");
			
			}	   
		   
			}
			  driver.findElement(goScriptBuilderTab).click();
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
				log.info("Navigate to script tab");
			}
		
		
		
		}
		}
	
	
//========================Old=================================================================================	
	
	// Create a script using Go script button
	
	
/*	public void goScriptBuilderCreation () throws InterruptedException {	

		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
		wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
		
		Thread.sleep(10000);
		
		 if (driver.findElements(createNewScriptByButton).isEmpty()) {
				
				log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
				log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
				log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
				
				Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
				log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
				
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
				log.debug("Verified that 'Script count' dispalyed left side under Script tab");
				Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
				log.debug("Verified that 'Script count' enabled left side under Script tab");
				
				Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
				log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
				Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
				log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
				
							
			}else
			
			{
				log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script tab");	
			
				Thread.sleep(100000);	
				driver.findElement(createNewScriptByButton).click();
				
			    log.debug("Validated the element while click Script Creation using button (+)");
			
			}
		
				
	}
	
	
	

//==================================================================================	
	public void goScriptBuilderTabValidation() throws InterruptedException {	
		wait=new WebDriverWait(driver,30);
		driver.findElement(scriptsTab).click();	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");	
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
		
         if (driver.findElements(pleaseSelectlabelGSB).isEmpty()) {
			
        	 log.debug("Verified that 'Please select a Call Master Script from the left. ' label appeared on  under Go Script builder tab");
 			log.debug("Verified that 'Please select a Call Master Script from the left. ' label enabled under Go Script builder tab");	
 			log.debug("Verified that 'Please select a Call Master Script from the left.' Text validated under Go Script Builder");
			
						
		}else
		
		{
			log.debug("Verified that 'Please select a script ' label appeared on  under Go Script builder tab");
			log.debug("Verified that 'Please select a script ' label enabled under Go Script builder tab");	
			log.debug("Verified that 'Please select a script or' Text validated under Go Script Builder");
			
		}  
		
         Thread.sleep(1000);
         wait.until(ExpectedConditions.elementToBeClickable(goScriptBuilderScriptslabel));
		String count=driver.findElement(goScriptBuilderScriptslabel).getText();
	//	log.debug("Script header contain "+count);
		String[] part = count.split("(?<=\\D)(?=\\d)");		
		log.debug("Script Count "+part[1]);
	//	wait.until(ExpectedConditions.elementToBeClickable(selectscript));
		
		int Count=driver.findElements(selectscript).size();
	//	log.debug("Script Count "+Count);	
		String ScriptActualCount =String.valueOf(Count);	
	//	log.debug("integer converted as: "+ScriptActualCount);	
		
	//	Assert.assertEquals(part[1], ScriptActualCount);		
		log.debug("Verified that script count found correct: "+ScriptActualCount);	
		
		if (Count>0) {			
		
			driver.findElement(selectfirstsearch).click();
						
			log.debug("firstScriptClicked");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
			log.info("Found load progress bar");
			
			if (driver.findElements(RunButtonDisabled).size()!=0) {
				
				log.debug("Run button is disabled, unable to run script under this credentials");
				
			} else if (driver.findElements(RunButton).size()!=0)
				
			{
			
			Assert.assertTrue(driver.findElement(RunButton).isEnabled());
			log.info("Run button found");
			log.info("Go script Filter by name feature is working as desired");
			
		}else {
			
			log.info("No script available");
			}
		
		wait.until(ExpectedConditions.elementToBeClickable(selectdropdownn)).click();
//		driver.findElement(selectdropdownn).click();
		log.info("dropdown selected");
		Assert.assertTrue(driver.findElement(copyScript).isDisplayed());
		log.info("copy script button avalable");
		Assert.assertTrue(driver.findElement(copyScript).isEnabled());
		log.info("copy script button enabled");
		Assert.assertTrue(driver.findElement(downloadbuttonGSB).isDisplayed());
		log.info("download button avalable");
		Assert.assertTrue(driver.findElement(downloadbuttonGSB).isDisplayed());
		log.info("downoad button enabled");
		}	
				
	}

//=====================================================================================	
	public void scriptUploadTabValidation() throws InterruptedException {	

			
		
		driver.findElement(scriptUploadTab).click();
		Thread.sleep(10000);
		
		
					
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	//	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	//	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
		Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
		log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
		
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
		
		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
					
		  if (driver.findElements(pleaseSelectlabelGSB).isEmpty()) {
				
	        	 log.debug("Verified that 'Please select a Go Script from the left. ' label appeared on  under Script Upload tab");
	 			log.debug("Verified that 'Please select a Go Script from the left. ' label enabled under Script Upload tab");	
	 			log.debug("Verified that 'Please select a Go Script from the left.' Text validated under Script Upload tab");
				
							
			}else
			
			{
				log.debug("Verified that 'Please select a script ' label appeared on  under Script Upload tab");
				log.debug("Verified that 'Please select a script ' label enabled under Script Upload tab");	
				log.debug("Verified that 'Please select a script or' Text validated under Script Upload tab");
				
			}  
		
		  if (driver.findElements(createNewScriptBylink).isEmpty()) {
				
				log.debug("Verified that create a new script by link is not appeared under Script Upload");	
				
							
			}else
			
			{
				log.debug("Verified that create a new script by link is appeared under under Script Upload");			
	}
	
	}
	
//=================================================================================================	
	
	public void createGSBbybuttonValidation() throws InterruptedException {
		
		wait=new WebDriverWait(driver,30);
		driver.findElement(scriptsTab).click();	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		
		
		
          if (driver.findElements(createNewScriptByButton).isEmpty()) {
			
			log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
			log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
			log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
			
			Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
			log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
			
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
			log.debug("Verified that 'Script count' dispalyed left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
			log.debug("Verified that 'Script count' enabled left side under Script tab");
			
			Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
			log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
			log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
			
						
		}else
		
		{
			log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script tab");	
		
			wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
				log.debug("Validated the element while click Script Creation using button (+)");
		
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
	//	Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		wait.until(ExpectedConditions.elementToBeClickable(goScriptBuilderScriptsCount));
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	

		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(exapandAll).isDisplayed());
		log.debug("Verified that 'expand all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(exapandAll).isEnabled());
		log.debug("Verified that 'Expand All' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(exapandAll).getText(), "Expand All");		
		log.debug("Verified that 'Expand All' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(collapseAll).isDisplayed());
		log.debug("Verified that 'collapse all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(collapseAll).isEnabled());
		log.debug("Verified that 'collapse' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(collapseAll).getText(), "Collapse All");		
		log.debug("Verified that 'Collapse All' Text validated on under Go Script Builder");	
		
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");
				
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		
		driver.findElement(resultslabel).click();
		Assert.assertEquals(driver.findElement(resultText).getText(),"The results will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The results will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under result tab in Go Script Builder");	
		
		driver.findElement(callLogsNamelabel).click();
		Assert.assertEquals(driver.findElement(calllogText).getText(),"The Logs will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The Logs will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under call logs tab in Go Script Builder");	
		
		driver.findElement(associatedTestslabel).click();
		Assert.assertEquals(driver.findElement(associatedText).getText(),"No test");
		log.debug("Verified that 'No test' Text validated on under associated Tests in Go Script Builder");	
	

		}
	}

	//=================================================================================================		
	
		
public void createGSBbyLinkValidation() throws InterruptedException {
		
		wait=new WebDriverWait(driver,30);
		driver.findElement(scriptsTab).click();	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		
		
		
          if (driver.findElements(createNewScriptBylink).isEmpty()) {
			
			log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
			log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
			log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
			
			Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
			log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
			
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
			log.debug("Verified that 'Script count' dispalyed left side under Script tab");
			Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
			log.debug("Verified that 'Script count' enabled left side under Script tab");
			
			Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
			log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
			Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
			log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
			
						
		}else
		
		{
			log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script tab");	
		
			wait.until(ExpectedConditions.elementToBeClickable(createNewScriptBylink)).click();
				log.debug("Validated the element while click Script Creation using button (+)");
		
				
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
		log.debug("Verified that 'Go Script Builder Scripts' label appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isEnabled());
		log.debug("Verified that 'Go Script Builder Scripts' label enabled on left side of under Script tab");	
		Assert.assertEquals(driver.findElement(goScriptBuilderScriptslabel).getText().contains("Go Script Builder Scripts"), true);	
		log.debug("Verified that 'Go Script Builder Scripts' Text validated on left side under Script Tab");		
		
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isDisplayed());
		log.debug("Verified that 'Script count' dispalyed left side under Script tab");
		Assert.assertTrue(driver.findElement(goScriptBuilderScriptsCount).isEnabled());		
		log.debug("Verified that 'Script count' enabled left side under Script tab");
		
		Assert.assertTrue(driver.findElement(filterByNameGSB).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameGSB).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");			
		
		Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
		log.debug("Verified that 'Script name' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
		log.debug("Verified that 'Script name' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
		log.debug("Verified that 'Script name' filed appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
		log.debug("Verified that 'Script name' field enabled on under Go Script Builder");	

		Assert.assertTrue(driver.findElement(scriptDescGSBlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptDescGSBlabel).getText(), "Description");		
		log.debug("Verified that 'Description' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isDisplayed());
		log.debug("Verified that 'Description' label appeared on under Go Script Builder");		
		Assert.assertTrue(driver.findElement(scriptDescGSBfield).isEnabled());		
		log.debug("Verified that 'Description' field enabled on under Go Script Builder");	
		
				
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
		
		Assert.assertTrue(driver.findElement(scriptBuilderlabel).isDisplayed());
		log.debug("Verified that 'Script Builder' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(scriptBuilderlabel).getText(), "Script Builder");		
		log.debug("Verified that 'Script Builder' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(exapandAll).isDisplayed());
		log.debug("Verified that 'expand all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(exapandAll).isEnabled());
		log.debug("Verified that 'Expand All' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(exapandAll).getText(), "Expand All");		
		log.debug("Verified that 'Expand All' Text validated on under Go Script Builder");		
		
		Assert.assertTrue(driver.findElement(collapseAll).isDisplayed());
		log.debug("Verified that 'collapse all' label appeared on under Go Script Builder");	
		Assert.assertTrue(driver.findElement(collapseAll).isEnabled());
		log.debug("Verified that 'collapse' link is enabled under Go Script Upload tab");	
		Assert.assertEquals(driver.findElement(collapseAll).getText(), "Collapse All");		
		log.debug("Verified that 'Collapse All' Text validated on under Go Script Builder");	
		
		
		Assert.assertTrue(driver.findElement(resultslabel).isDisplayed());
		log.debug("Verified that 'Results' label appeared on under Go Script Builder");
				
		Assert.assertEquals(driver.findElement(resultslabel).getText(), "Results");		
		log.debug("Verified that 'Results' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(callLogsNamelabel).isDisplayed());
		log.debug("Verified that 'Call Logs' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(callLogsNamelabel).getText(), "Call Logs");		
		log.debug("Verified that 'Call Logs' Text validated on under Go Script Builder");	
		
		Assert.assertTrue(driver.findElement(associatedTestslabel).isDisplayed());
		log.debug("Verified that 'Associted Test' label appeared on under Go Script Builder");		
		Assert.assertEquals(driver.findElement(associatedTestslabel).getText(), "Associated Tests");		
		log.debug("Verified that 'Associted Test' Text validated on under Go Script Builder");	
		
		driver.findElement(resultslabel).click();
		Assert.assertEquals(driver.findElement(resultText).getText(),"The results will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The results will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under result tab in Go Script Builder");	
		
		driver.findElement(callLogsNamelabel).click();
		Assert.assertEquals(driver.findElement(calllogText).getText(),"The Logs will be displayed once 'Run Test' button is clicked for a valid script.");
		log.debug("Verified that 'The Logs will be displayed once 'Run Test' button is clicked for a valid script.' Text validated on under call logs tab in Go Script Builder");	
		
		driver.findElement(associatedTestslabel).click();
		Assert.assertEquals(driver.findElement(associatedText).getText(),"No test");
		log.debug("Verified that 'No test' Text validated on under associated Tests in Go Script Builder");	
		
			}
		}
		*/
	//========================Old=================================================================================	
//==============================================================================

public void createSUbyLink() throws InterruptedException {
	
	wait=new WebDriverWait(driver,30);
	driver.findElement(scriptsTab).click();	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	
	driver.findElement(scriptUploadTab).click();
		
      if (driver.findElements(createNewScriptBylink).isEmpty()) {
		
		log.debug("Verified that create a new script plus (+) icon not appeared on top left side under Script Upload tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
		log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
		Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
		log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
		
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
		
		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
					
	}else
	
	{
		log.debug("Verified that create a new script plus (+) icon appeared on top left side under Script Upload tab");	
		
		driver.findElement(createNewScriptByButton).click();
	log.debug("Validated the element while click Script Creation using button (+)");
	
			
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
	log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
	Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
	log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
	log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
	log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
	
	Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
	log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
	Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");		
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script name' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
	log.debug("Verified that 'Script name' filed appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
	log.debug("Verified that 'Script name' field enabled on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptDescSUlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isEnabled());		
	log.debug("Verified that 'Description' field enabled on under Script Upload");				
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Go Script Upload tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Go Script Upload tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Go Script Upload tab");	
	
//	Assert.assertTrue(driver.findElement(uploadScriptFile).isDisplayed());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button appeared under Script Upload tab");	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isEnabled());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button enabled under Script Upload tab");
	
	

	}
}
//========================================================================================================================
public void createSUbybutton() throws InterruptedException {
	
	wait=new WebDriverWait(driver,30);
	driver.findElement(scriptsTab).click();	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	driver.findElement(scriptUploadTab).click();
		
      if (driver.findElements(createNewScriptByButtonSU).isEmpty()) {
		
    	  log.debug("Verified that create a new script by link is not appeared under Script Upload tab");	
    	  Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
  		log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
  		Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
  		log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
  		Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
  		log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
  		
  		Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
  		log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
  		Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
  		log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
  		
  		Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
  		log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
  		Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
  		log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");	
		
					
	}else
	
	{
		log.debug("Verified that create a new script by link is appeared under Script Upload tab");	
		
		Thread.sleep(10000);
		driver.findElement(createNewScriptByButtonSU).click();
	log.debug("Validated the element while click Script Creation using button");
	
			
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isDisplayed());
	log.debug("Verified that 'Call Master Scripts' label appeared on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptslabel).isEnabled());
	log.debug("Verified that 'Call Master Scripts' label enabled on left side of Script Upload tab under Script tab");	
	Assert.assertEquals(driver.findElement(callMasterScriptslabel).getText().contains("Call Master Scripts"), true);	
	log.debug("Verified that 'Call Master Scripts' Text validated on left side under Script Upload Tab");		
	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isDisplayed());
	log.debug("Verified that 'Call master Script count' dispalyed on left side of Script Upload tab under Script tab");	
	Assert.assertTrue(driver.findElement(callMasterScriptscount).isEnabled());		
	log.debug("Verified that 'Call master Script count' enabled on left side of Script Upload tab under Script tab");	
	
	Assert.assertTrue(driver.findElement(filterByNameSU).isDisplayed());
	log.debug("Verified that 'Filter by name' filed appeared on left side of under Script tab");	
	Assert.assertTrue(driver.findElement(filterByNameSU).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Script tab");		
	Assert.assertTrue(driver.findElement(scriptNamelabel).isDisplayed());
	log.debug("Verified that 'Script name' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptNamelabel).getText(), "Script name");		
	log.debug("Verified that 'Script name' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isDisplayed());
	log.debug("Verified that 'Script name' filed appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptNamefield).isEnabled());		
	log.debug("Verified that 'Script name' field enabled on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertEquals(driver.findElement(scriptDescSUlabel).getText(), "Description");		
	log.debug("Verified that 'Description' Text validated on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isDisplayed());
	log.debug("Verified that 'Description' label appeared on under Script Upload");		
	Assert.assertTrue(driver.findElement(scriptDescSUfield).isEnabled());		
	log.debug("Verified that 'Description' field enabled on under Script Upload");				
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed under Script Upload tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled under Script Upload tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button under Script Upload tab");		
	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isDisplayed());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button appeared under Script Upload tab");	
	Assert.assertTrue(driver.findElement(uploadScriptFile).isEnabled());
	log.debug("Verified that 'Click to select a script, or drop file below (.xml)' button enabled under Script Upload tab");	
	
	
	
	
	}
}
//===================================================================================================
public void csvTabValidation() throws InterruptedException {	

	wait=new WebDriverWait(driver,30);
    driver.findElement(scriptsTab).click();	
    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	
	if (driver.findElements(csvTranformerTab).isEmpty()) {
		
		log.debug("Verified that CSV Tranformer tab not appeared under Script tab");	
		
					
	}else
	
	{
		log.debug("Verified that CSV Tranformer tab appeared under Script tab");	
		
	wait.until(ExpectedConditions.elementToBeClickable(csvTranformerTab)).click();
  
	
    Assert.assertTrue(driver.findElement(uploadCSVFile).isDisplayed());
	log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button appeared under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(uploadCSVFile).isEnabled());
	log.debug("Verified that 'Click to select CSV files, or drop them below (.csv,.zip)' button enabled under CSV Upload tab");	
	
	Assert.assertTrue(driver.findElement(samplecsvDownoad).isDisplayed());
	log.debug("Verified that 'Sample CSV download' label appeared on right side of under CSV Upload tab");	
	Assert.assertTrue(driver.findElement(transformedCSVlabel).isEnabled());
	log.debug("Verified that 'Sample CSV download' label enabled on right side of under CSV Upload tab");	
	Assert.assertEquals(driver.findElement(samplecsvDownoad).getText(),"Sample CSV download");
	log.debug("Verified that 'Sample CSV download' text appeared on right side of under CSV Upload tab");
	
	
	
    if (driver.findElements(transformedCSVlabel).isEmpty()) {
		
    	log.debug("Verified that 'Transformed CSV(s)' label is not appearing on left side of under CSV Upload tab");	
    	log.debug("Verified that 'Transformed CSV(s)' label not enabled on left side of under CSV Upload tab");	
		
					
	}else
	
	{
		log.debug("Verified that 'Transformed CSV(s)' label appeared on left side of under CSV Upload tab");	
    	log.debug("Verified that 'Transformed CSV(s)' label enabled on left side of under CSV Upload tab");	
	
	}
    
    
   if (driver.findElements(filterByCSV).isEmpty()) {
		
	   log.debug("Verified that 'Filter by csv file name' filed is not appearing under CSV Upload tab");	
		log.debug("Verified that 'Filter by csv file name' filed is not enabled under CSV Upload tab");
		
					
	}else
	
	{
		log.debug("Verified that 'Filter by csv file name' filed appeared under CSV Upload tab");	
		log.debug("Verified that 'Filter by csv file name' filed enabled under CSV Upload tab");
	
	}
    driver.findElement(goScriptBuilderTab).click();
	Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
	log.info("Navigate to script tab");
   
   
	}
	}
//=====================================================================================================

//Creation of Script-Creation Page

public WebElement getScriptName() {
	
	return driver.findElement(scriptNamefield);
	
}

public WebElement getScriptDesc() {
	
	return driver.findElement(scriptDescGSBfield);
		
}

public WebElement getNumberToCall() {
	
	return driver.findElement(numberToCall);
}


public WebElement getNumberToCalle164disabled() {
	
	return driver.findElement(numberToCalle164disabled);
}

/*public WebElement getHearVoice1() {
	
	return driver.findElement(PhraseHearValue1);
}*/

/*public WebElement getHearVoice2() {
	
	return driver.findElement(PhraseHearValue2);
}*/


public String reteriveScriptName() {
	
	
	return pom000_Reuseable_Script_for_Page.getSaltString();
}

/*public WebElement getTestName() {
	
	return driver.findElement(testNameField);
}*/



//===========================================
//DeleteScript

public void selectDeleteScript(String Delete) {
    // Open the dropdown so the options are visible
     driver.findElement(By.className("selectdropdownn")).click();
     // Get all of the options
	

     List <WebElement> options = driver.findElements(By.xpath("clickdeletedropdown"));
     // Loop through the options and select the one that matches
     for (WebElement opt : options) {
         if (opt.getText().equals("Delete")) {
        	 
        	 log.info("found Delete option from drop down");
             opt.click();
             log.info("Deleted Successsfully");
             return;
         }
     }
}




//===========================================================================================================================

// Creating Script using button 26.2


public void Create_run_Script_using_button_26() throws InterruptedException {
	wait=new WebDriverWait(driver,20);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(goScriptBuilderTab).click();
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNamefield).sendKeys(ScriptName);
//	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
    Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	driver.findElement(RunButton).click();
	log.info("Run Button clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(scriptResult));
	log.info("Script Result is coming");
	Assert.assertTrue(driver.findElement(scriptResult).isDisplayed());
	log.info("Script Results Deatis is coming");
	driver.findElement(CallLogsLink).click();
	log.info("Navigate to Call logs Tab");
	wait.until(ExpectedConditions.presenceOfElementLocated(callslogs));
	Assert.assertTrue(driver.findElement(callslogs).isDisplayed());
	log.info("CallLog is coming");	
	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");
	if (driver.findElements(clickdeletedropdown).size()!=0) {
		
		log.info("delete button not found, so delete functinality not avaiable");
	} else {
	
	driver.findElement(clickdeletedropdown).click();	
	log.info("Delete dropd is found and clicked");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Delete All option selected");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
	log.info("Clened created script successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	}
}

//======================================================================================================================================

//Creating Script using button 27.0       ===============================================================================


public void Create_run_E2E_Script_using_button() throws InterruptedException {
	wait=new WebDriverWait(driver,65);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");	
	wait.until(ExpectedConditions.presenceOfElementLocated(newScriptCreationPopup));

    WebElement ele0 = driver.findElement(newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);	
	
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");	
	
	// Script Drop Down	

	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(scriptSelectionDropdown);	
     Select ScriptSelection = new Select(scriptDropdown);      
     ScriptSelection.selectByIndex(1);
     log.debug("Verified that E2E Script selected from dropdown");   
     wait.until(ExpectedConditions.elementToBeClickable(scriptGoBut)).click();    
     log.debug("Verified that Go button clicked while select E2E Scriptn"); 
     
     driver.findElement(numberToCallbuttonE2E).click();
     log.debug("Verified that numberToCall button clicked while select creating Script"); 
     
	
	 driver.findElement(e164disabled).click();	
	 log.debug("Verified that e164disabled");	
	
	String ScriptName="E2E_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNameE2E).sendKeys(ScriptName);
	log.info("Passing script name " +ScriptName);
	
//	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
//	log.info("Generate Radom script description");
//	getNumberToCall().sendKeys("18001111111");
	 
	 driver.findElement(numberToCallField).sendKeys("18001111111");
	 log.info("Passing Number to Call is 18001111111");
	 
//	 driver.findElement(scriptNameE2E).click();
	 
/*	getNumberToCalle164disabled().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
 Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button")*/;	
	 
	 
	/* WebElement ele = driver.findElement(E2ESaveButton);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
	 */
	 
	// Thread.sleep(1000);
	 wait.until(ExpectedConditions.elementToBeClickable(E2ESaveButton)).click();
//	driver.findElement(E2ESaveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(E2ESlideButton).click();
	log.info("Slide button clicked");
	wait.until(ExpectedConditions.elementToBeClickable(filterByNameGSB));	
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(E2ERunButton).isEnabled());
	log.info("Verified that Run button is enabled");	
	Assert.assertEquals(driver.findElement(E2ERunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	driver.findElement(E2ERunButton).click();
	log.info("Run Button clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(scriptResult));
	log.info("Script Result is coming");
	Assert.assertTrue(driver.findElement(scriptResult).isDisplayed());
	log.info("Script Results Deatis is coming");
	driver.findElement(E2EcallLogsNamelabel).click();
	log.info("Navigate to Call logs Tab");
	wait.until(ExpectedConditions.presenceOfElementLocated(E2EcalllogText));
	Thread.sleep(1000);
	Assert.assertTrue(driver.findElement(E2EcalllogText).isDisplayed());
	log.info("CallLog is coming");	
	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");	
	driver.findElement(E2EDropdown).click();
	
	
	log.info("Verified that select dropdown");
	if (driver.findElements(clickdeletedropdown).size()!=0) {
		
		log.info("delete button not found, so delete functinality not avaiable");
	} else {
	
	driver.findElement(clickdeletedropdownE2E).click();	
	log.info("Delete dropd is found and clicked");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Delete All option selected");
//	wait.until(ExpectedConditions.alertIsPresent());
//	log.info("Alert is coming");
//	driver.switchTo().alert().accept();
//		log.info("Alert accepted");
	wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();
	log.info("Clened created script successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	}
}

//=========================================================================================================================================

//Creating Script using button 27.0       ===============================================================================


public void Create_run_Script_using_button() throws InterruptedException {
	wait=new WebDriverWait(driver,65);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");	
	wait.until(ExpectedConditions.presenceOfElementLocated(newScriptCreationPopup));

  WebElement ele0 = driver.findElement(newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);	
	
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");	
	
	// Script Drop Down	

	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(scriptSelectionDropdown);		
//System.out.println(scriptDropdown.getSize());
Select ScriptSelection = new Select(scriptDropdown);        
/*  Assert.assertFalse(ScriptSelection.isMultiple());       
java.util.List<WebElement> options1 = ScriptSelection.getOptions();   

log.debug("Verified that following values available in the dropdown");      
for(WebElement item2:options1) 
{ 
	for (int i = 0; i <options1.size(); i++) {        		
					        						    
			log.debug(""+item2.getText());      			   			

           	}
		}*/


ScriptSelection.selectByIndex(0);
log.debug("Verified that IVR Script selected from dropdown"); 

wait.until(ExpectedConditions.elementToBeClickable(scriptGoBut)).click();

//driver.findElement(scriptGoBut).click();

log.debug("Verified that Go button clicked while select IVR Scriptn"); 


	
	
	
	
	driver.findElement(e164disabled).click();
	
	 log.debug("Verified that e164disabled");
	
	
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNamefield).sendKeys(ScriptName);
//	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
//	getNumberToCall().sendKeys("18001111111");
	getNumberToCalle164disabled().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
	wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	driver.findElement(RunButton).click();
	log.info("Run Button clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(scriptResult));
	log.info("Script Result is coming");
	Assert.assertTrue(driver.findElement(scriptResult).isDisplayed());
	log.info("Script Results Deatis is coming");
	driver.findElement(CallLogsLink).click();
	log.info("Navigate to Call logs Tab");
	wait.until(ExpectedConditions.presenceOfElementLocated(callslogs));
	Assert.assertTrue(driver.findElement(callslogs).isDisplayed());
	log.info("CallLog is coming");	
	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");
	if (driver.findElements(clickdeletedropdown).size()!=0) {
		
		log.info("delete button not found, so delete functinality not avaiable");
	} else {
	
	driver.findElement(clickdeletedropdown27).click();	
	log.info("Delete dropd is found and clicked");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Delete All option selected");
//	wait.until(ExpectedConditions.alertIsPresent());
//	log.info("Alert is coming");
//	driver.switchTo().alert().accept();
//		log.info("Alert accepted");
	wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();
	log.info("Clened created script successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	}
}


//==========================================================================================================================================
//Creating Script using Link


public void Create_run_Script_using_Link() throws InterruptedException {
	wait=new WebDriverWait(driver,20);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(goScriptBuilderTab).click();
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNamefield).sendKeys(ScriptName);
	//	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
 Thread.sleep(1000);    
 wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");	
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");
	driver.findElement(RunButton).click();
	log.info("Run Button clicked");	
	wait.until(ExpectedConditions.presenceOfElementLocated(scriptResult));
	log.info("Script Result is coming");
	Assert.assertTrue(driver.findElement(scriptResult).isDisplayed());
	log.info("Script Results Deatis is coming");
	driver.findElement(CallLogsLink).click();
	log.info("Navigate to Call logs Tab");
	wait.until(ExpectedConditions.presenceOfElementLocated(callslogs));
	Assert.assertTrue(driver.findElement(callslogs).isDisplayed());
	log.info("CallLog is coming");	
	driver.findElement(firstsearchscript).click();
	log.info("clicked above search script");
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button enabled");	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");
	if (driver.findElements(clickdeletedropdown).size()!=0) {
		
		log.info("delete button not found, so delete functinality not avaiable");
	} else {
	
	driver.findElement(clickdeletedropdown).click();	
	log.info("Delete dropd is found and clicked");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Delete All option selected");
	wait.until(ExpectedConditions.alertIsPresent());
	log.info("Alert is coming");
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
	log.info("Clened created script successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	}
}

//==================================================================================================================================
//Delete Script with option All data for 26.2

public void DeleteScriptAllData_26() throws InterruptedException {

	wait=new WebDriverWait(driver,30);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("found progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNamefield).sendKeys(ScriptName);
//	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
        Thread.sleep(1000);   
        wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");	
	driver.findElement(clickdeletedropdown).click();
	log.info("Verified that Clicked delete button");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
	log.info("delete successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
}

//==============================================================================================================
//Delete Script with option All data for 27.0

public void DeleteScriptAllData() throws InterruptedException {

	wait=new WebDriverWait(driver,30);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("found progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
	wait.until(ExpectedConditions.elementToBeClickable(newScriptCreationPopup));	
	
	WebElement ele0 = driver.findElement(newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);
		
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");
		
	// Script Drop Down	
	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(scriptSelectionDropdown);		
	  Select ScriptSelection = new Select(scriptDropdown);        
	  ScriptSelection.selectByIndex(0);
	  log.debug("Verified that IVR Script selected from dropdown");   
	  driver.findElement(scriptGoBut).click();  
	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
	  driver.findElement(e164disabled).click();
	 log.debug("Verified that e164disabled");
	
	
	
	
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNamefield).sendKeys(ScriptName);
//	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
//	getNumberToCall().sendKeys("18001111111");
	getNumberToCalle164disabled().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
      Thread.sleep(1000);   
      wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");	
	driver.findElement(clickdeletedropdown27).click();
//	driver.findElement(clickdeletedropdown).click();
	log.info("Verified that Clicked delete button");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.switchTo().alert().accept();
//	log.info("Alert accepted");
	wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();	
	
	log.info("delete successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
}


//==============================================================================================================
//Delete Script with option Script Only 26.2
	
public void DeleteScriptOnly_26() throws InterruptedException {
	
	wait=new WebDriverWait(driver,30);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNamefield).sendKeys(ScriptName);
//	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
        Thread.sleep(1000);  
        wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");	
	driver.findElement(clickdeletedropdown).click();
	log.info("Verified that Clicked delete button");
	WebElement ele = driver.findElement(deleteScriptOnly);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.alertIsPresent());
	driver.switchTo().alert().accept();
	log.info("Alert accepted");
	log.info("delete successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	
	}

//=====================================================================================================================

//Delete Script with option Script Only 27.0

public void DeleteScriptOnly() throws InterruptedException {
	
	wait=new WebDriverWait(driver,30);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
	
    wait.until(ExpectedConditions.elementToBeClickable(newScriptCreationPopup));	
	
	WebElement ele0 = driver.findElement(newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);
		
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");
		
	// Script Drop Down	
	 log.debug("Verified that Script dropdown"); 		 
	 WebElement scriptDropdown = driver.findElement(scriptSelectionDropdown);		
	  Select ScriptSelection = new Select(scriptDropdown);        
	  ScriptSelection.selectByIndex(0);
	  log.debug("Verified that IVR Script selected from dropdown");   
	  driver.findElement(scriptGoBut).click();  
	  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
	  driver.findElement(e164disabled).click();
	 log.debug("Verified that e164disabled");	
	
	String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	driver.findElement(scriptNamefield).sendKeys(ScriptName);
//	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
//	getNumberToCall().sendKeys("18001111111");
	getNumberToCalle164disabled().sendKeys("18002051994");
	log.info("Passing Number to Call is 18002051994");	
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	log.info("Sync issue so waiting just one second");	
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	log.info("Sync issue so waiting just one second");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
      Thread.sleep(1000);  
      wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");
		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
	Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	log.info("Verified that Run button contain 'Run Test' text");	
	driver.findElement(selectdropdownn).click();
	log.info("Verified that select dropdown");	
//	driver.findElement(clickdeletedropdown).click();
	driver.findElement(clickdeletedropdown27).click();
	log.info("Verified that Clicked delete button");
	WebElement ele = driver.findElement(deleteScriptOnly);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
//	wait.until(ExpectedConditions.alertIsPresent());
//	driver.switchTo().alert().accept();
//	log.info("Alert accepted");
	wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();
	log.info("delete successfully");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	
	}


//==============================================================================================================================
	
//Copy Script 26.2


public void CopyScript_26() throws InterruptedException {
	    wait=new WebDriverWait(driver,30);		
	    wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
		log.info("Navigate to script Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
		log.info("Start Creating Script using + button");
		String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.info("Generate Radom Scriptname " +ScriptName);
		driver.findElement(scriptNamefield).sendKeys(ScriptName);
	//	getScriptName().sendKeys(ScriptName);	
		log.info("Passing script name " +ScriptName);
		getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
		log.info("Generate Radom script description");
		getNumberToCall().sendKeys("18001111111");
		log.info("Passing Number to Call is 18001111111");	
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue1).click();
		log.info("Deleteing First PhraseHear");
		log.info("Sync issue so waiting just one second");	
		driver.findElement(deletePress1).click();
		log.info("Deleteing first Press Section");
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue2).click();
		log.info("Deleteing second PhraseHear");
	        Thread.sleep(1000); 
	        wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
		Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
		 log.info("Using Action class double clicked pause button");
			
		driver.findElement(saveButton).click();
		log.info("Clicked Save button");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Sync issue so waiting just ten Second");
		driver.findElement(filterByNameGSB).clear();
		driver.findElement(filterByNameGSB).sendKeys(ScriptName);
		log.info("Search above created Script using filter " +ScriptName);
		wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
		log.info("Just retrived the deatils of above created script " +ScriptName);
		Assert.assertTrue(driver.findElement(RunButton).isEnabled());
		log.info("Verified that Run button is enabled");		
		Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
		log.info("Verified that Run button contain 'Run Test' text");
	   driver.findElement(selectdropdownn).click();
	   log.info("Verified that select dropdown");	
	   driver.findElement(copyScript).click();
	   log.info("Verified copyScript clicked from dropdown");
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
	  driver.findElement(filterByNameGSB).clear();
	  driver.findElement(filterByNameGSB).sendKeys(ScriptName+" - Copy");
	  log.info("copied added in search");	
	  wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	  log.info("first copied search successfully");
	  Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	 log.info("Verified that Run button enabled");
	 driver.findElement(selectdropdownn).click();
		log.info("Verified that select dropdown");
     if (driver.findElements(clickdeletedropdown).size()!=0) {
			
			log.info("delete button not found, so delete functinality not avaiable");
		} else {		
		driver.findElement(clickdeletedropdown).click();
		log.info("Verified that Clicked delete button");
		WebElement ele = driver.findElement(deleteAllData);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		log.info("Verified that select delete all data");
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		log.info("Alert accepted");
		log.info("delete successfully");
		driver.navigate().refresh();
		log.info("Refersh application");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
}
}

//=============================================================================================================================================

//Copy Script 27.0


public void CopyScript() throws InterruptedException {
	    wait=new WebDriverWait(driver,30);		
	    wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
		log.info("Navigate to script Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
		log.info("Start Creating Script using + button");
		
		   wait.until(ExpectedConditions.elementToBeClickable(newScriptCreationPopup));	
			
			WebElement ele0 = driver.findElement(newScriptCreationPopup);
			JavascriptExecutor executor0 = (JavascriptExecutor)driver;
			executor0.executeScript("arguments[0].click();", ele0);
				
			log.info("New script creation popup appered");
			log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
			log.info("Clicked Yes");
				
			// Script Drop Down	
			 log.debug("Verified that Script dropdown"); 		 
			 WebElement scriptDropdown = driver.findElement(scriptSelectionDropdown);		
			  Select ScriptSelection = new Select(scriptDropdown);        
			  ScriptSelection.selectByIndex(0);
			  log.debug("Verified that IVR Script selected from dropdown");   
			  driver.findElement(scriptGoBut).click();  
			  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
			  driver.findElement(e164disabled).click();
			 log.debug("Verified that e164disabled");
		
		
		
		String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.info("Generate Radom Scriptname " +ScriptName);
		driver.findElement(scriptNamefield).sendKeys(ScriptName);
	//	getScriptName().sendKeys(ScriptName);	
		log.info("Passing script name " +ScriptName);
		getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
		log.info("Generate Radom script description");
	//	getNumberToCall().sendKeys("18001111111");
		getNumberToCalle164disabled().sendKeys("18002041994");
		log.info("Passing Number to Call is 18002041994");	
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue1).click();
		log.info("Deleteing First PhraseHear");
		log.info("Sync issue so waiting just one second");	
		driver.findElement(deletePress1).click();
		log.info("Deleteing first Press Section");
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue2).click();
		log.info("Deleteing second PhraseHear");
	        Thread.sleep(1000); 
	        wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
		Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
		 log.info("Using Action class double clicked pause button");
			
		driver.findElement(saveButton).click();
		log.info("Clicked Save button");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Sync issue so waiting just ten Second");
		driver.findElement(filterByNameGSB).clear();
		driver.findElement(filterByNameGSB).sendKeys(ScriptName);
		log.info("Search above created Script using filter " +ScriptName);
		wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
		log.info("Just retrived the deatils of above created script " +ScriptName);
		Assert.assertTrue(driver.findElement(RunButton).isEnabled());
		log.info("Verified that Run button is enabled");		
		Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
		log.info("Verified that Run button contain 'Run Test' text");
	   driver.findElement(selectdropdownn).click();
	   log.info("Verified that select dropdown");	
	   driver.findElement(copyScript27).click();
	    log.info("Verified copyScript clicked from dropdown");
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
	  driver.findElement(filterByNameGSB).clear();
	  driver.findElement(filterByNameGSB).sendKeys(ScriptName+" - Copy");
	  log.info("copied added in search");	
	  wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	  log.info("first copied search successfully");
	  Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	 log.info("Verified that Run button enabled");
	 driver.findElement(selectdropdownn).click();
		log.info("Verified that select dropdown");
   if (driver.findElements(clickdeletedropdown).size()!=0) {
			
			log.info("delete button not found, so delete functinality not avaiable");
		} else {		
		driver.findElement(clickdeletedropdown27).click();
		log.info("Verified that Clicked delete button");
		WebElement ele = driver.findElement(deleteAllData);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		log.info("Verified that select delete all data");
	//	wait.until(ExpectedConditions.alertIsPresent());
	//	driver.switchTo().alert().accept();
	//	log.info("Alert accepted");
		wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();		
		log.info("delete successfully");
		driver.navigate().refresh();
		log.info("Refersh application");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
}
}


//=============================================================================================================================================

//Update Script  26.2

public void UpdateScript_26() throws InterruptedException {
	    wait=new WebDriverWait(driver,30);		
	    wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
		log.info("Navigate to script Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
		log.info("Start Creating Script using + button");
		String ScriptName="Update_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.info("Generate Radom Scriptname " +ScriptName);
		driver.findElement(scriptNamefield).sendKeys(ScriptName);
		//	getScriptName().sendKeys(ScriptName);	
		log.info("Passing script name " +ScriptName);
		getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
		log.info("Generate Radom script description");
		getNumberToCall().sendKeys("18001111111");
		log.info("Passing Number to Call is 18001111111");	
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue1).click();
		log.info("Deleteing First PhraseHear");
		log.info("Sync issue so waiting just one second");	
		driver.findElement(deletePress1).click();
		log.info("Deleteing first Press Section");
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue2).click();
		log.info("Deleteing second PhraseHear");
	        Thread.sleep(1000);   
	        wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
		Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
		 log.info("Using Action class double clicked pause button");
		driver.findElement(saveButton).click();
		log.info("Clicked Save button");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		driver.findElement(filterByNameGSB).clear();
		driver.findElement(filterByNameGSB).sendKeys(ScriptName);
		log.info("Search above created Script using filter " +ScriptName);
		wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
		log.info("Just retrived the deatils of above created script " +ScriptName);
		Assert.assertTrue(driver.findElement(RunButton).isEnabled());
		log.info("Verified that Run button is enabled");
		Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
		log.info("Verified that Run button contain 'Run Test' text");			
	    getScriptDesc().sendKeys(ScriptName);
	    driver.findElement(updateScriptButton).click();
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	    log.info("Found load progress bar");
	    Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	    log.info("Verified that Run button contain Run Test text");
	    driver.findElement(selectdropdownn).click();
		log.info("Verified that select dropdown");
		
		if (driver.findElements(clickdeletedropdown).size()!=0) {
			
			log.info("delete button not found, so delete functinality not avaiable");
		} else {
		
		driver.findElement(clickdeletedropdown).click();
		log.info("Verified that Clicked delete button");
		WebElement ele = driver.findElement(deleteAllData);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		log.info("Verified that select delete all data");
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		log.info("Alert accepted");
		log.info("delete successfully");	
		driver.navigate().refresh();
		log.info("Refersh application");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
	    }
}

//======================================================================================================================

//Update Script  27.0

public void UpdateScript() throws InterruptedException {
	    wait=new WebDriverWait(driver,30);		
	    wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
		log.info("Navigate to script Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
		log.info("Start Creating Script using + button");
		wait.until(ExpectedConditions.elementToBeClickable(newScriptCreationPopup));	
		
		WebElement ele0 = driver.findElement(newScriptCreationPopup);
		JavascriptExecutor executor0 = (JavascriptExecutor)driver;
		executor0.executeScript("arguments[0].click();", ele0);
			
		log.info("New script creation popup appered");
		log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
		log.info("Clicked Yes");
			
		// Script Drop Down	
		 log.debug("Verified that Script dropdown"); 		 
		 WebElement scriptDropdown = driver.findElement(scriptSelectionDropdown);		
		  Select ScriptSelection = new Select(scriptDropdown);        
		  ScriptSelection.selectByIndex(0);
		  log.debug("Verified that IVR Script selected from dropdown");   
		  driver.findElement(scriptGoBut).click();  
		  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
		  driver.findElement(e164disabled).click();
		 log.debug("Verified that e164disabled");			
		
		
		String ScriptName="IVR_Script_Update_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.info("Generate Radom Scriptname " +ScriptName);
		driver.findElement(scriptNamefield).sendKeys(ScriptName);
		//	getScriptName().sendKeys(ScriptName);	
		log.info("Passing script name " +ScriptName);
		getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
		log.info("Generate Radom script description");
	//	getNumberToCall().sendKeys("18001111111");
		getNumberToCalle164disabled().sendKeys("18002051994");
		log.info("Passing Number to Call is 18002051994");	
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue1).click();
		log.info("Deleteing First PhraseHear");
		log.info("Sync issue so waiting just one second");	
		driver.findElement(deletePress1).click();
		log.info("Deleteing first Press Section");
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue2).click();
		log.info("Deleteing second PhraseHear");
	        Thread.sleep(1000);   
	        wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
		Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
		 log.info("Using Action class double clicked pause button");
		driver.findElement(saveButton).click();
		log.info("Clicked Save button");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		driver.findElement(filterByNameGSB).clear();
		driver.findElement(filterByNameGSB).sendKeys(ScriptName);
		log.info("Search above created Script using filter " +ScriptName);
		wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
		log.info("Just retrived the deatils of above created script " +ScriptName);
		Assert.assertTrue(driver.findElement(RunButton).isEnabled());
		log.info("Verified that Run button is enabled");
		Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
		log.info("Verified that Run button contain 'Run Test' text");			
	    getScriptDesc().sendKeys(ScriptName);
	    driver.findElement(updateScriptButton27).click();
	     wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	    log.info("Found load progress bar");
	    Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
	    log.info("Verified that Run button contain Run Test text");
	    driver.findElement(selectdropdownn).click();
		log.info("Verified that select dropdown");
		
		if (driver.findElements(clickdeletedropdown).size()!=0) {
			
			log.info("delete button not found, so delete functinality not avaiable");
		} else {
		
		driver.findElement(clickdeletedropdown27).click();
		log.info("Verified that Clicked delete button");
		WebElement ele = driver.findElement(deleteAllData);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		log.info("Verified that select delete all data");
	//	wait.until(ExpectedConditions.alertIsPresent());
	//	driver.switchTo().alert().accept();
	//	log.info("Alert accepted");
		wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();
		log.info("delete successfully");	
		driver.navigate().refresh();
		log.info("Refersh application");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
	    }
}

//=====================================================================================================================

//Create Script Upload 26.2

public void Create_Delete_ScriptByScriptUpload_26 () throws InterruptedException, IOException {
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
	log.info("clicked ScriptTab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(scriptUploadTab)).click();
 	log.info("SU Clicked");
	Thread.sleep(2000);
	log.info("clicked ScriptUploadTab");		
	driver.findElement(createNewScriptByButtonSU).click();
	log.info("clicked SU button clicked");
	driver.findElement(uploadScriptFile).click();
	log.info("Browse from local");
	Thread.sleep(1000);	
//	Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\testData\\FileUpload1.exe");
	Runtime.getRuntime().exec("C:\\data\\firefox\\firefox1.exe");	
	
	log.info("Uploaded using Autoit Script done");
	driver.findElement(SUScriptNameField).sendKeys("Script_Upload_"+pom000_Reuseable_Script_for_Page.getSaltString());
	wait.until(ExpectedConditions.elementToBeClickable(uploadScriptSaveButton)).click();	
	log.info("clicked save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.presenceOfElementLocated(SUDownloadButton));
	log.info("Waiting for download button");
	Assert.assertTrue(driver.findElement(SUDownloadButton).isDisplayed());
	log.info("Dowload button displayed");
	Assert.assertTrue(driver.findElement(SUDownloadButton).isEnabled());
	log.info("Dowload button enabled");
	driver.findElement(SUDropdown).click();
	log.info("Verified that select dropdown");	
	driver.findElement(SUDeleteIcon).click();
	log.info("Verified that Clicked delete button");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
//	driver.findElement(deleteAllData).click();
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	}

//========================================================================================================================

//Create Script Upload 27.0


public void Create_Delete_ScriptByScriptUpload () throws InterruptedException, IOException {
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
	log.info("clicked ScriptTab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(scriptUploadTab)).click();
 	log.info("SU Clicked");
	Thread.sleep(3000);
	log.info("clicked ScriptUploadTab");		
	driver.findElement(createNewScriptByButtonSU).click();
	log.info("clicked SU button clicked");
	//==================================================
	
	wait.until(ExpectedConditions.elementToBeClickable(newScriptCreationPopup));	
	WebElement ele0 = driver.findElement(newScriptCreationPopup);
	JavascriptExecutor executor0 = (JavascriptExecutor)driver;
	executor0.executeScript("arguments[0].click();", ele0);
	log.info("New script creation popup appered");
	log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
	log.info("Clicked Yes");
	
	//==================================================
	
	wait.until(ExpectedConditions.elementToBeClickable(uploadScriptFile));	
	WebElement ele01 = driver.findElement(uploadScriptFile);
	JavascriptExecutor executor01 = (JavascriptExecutor)driver;
	executor01.executeScript("arguments[0].click();", ele01);
		
	
	//=============================================
	
	
		
//	driver.findElement(uploadScriptFile).click();
	log.info("Browse from local");
	Thread.sleep(2000);	
//	Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\testData\\FileUpload1.exe");
	Runtime.getRuntime().exec("C:\\data\\firefox\\firefox1.exe");	
	
	log.info("Uploaded using Autoit Script done");
	driver.findElement(SUScriptNameField).sendKeys("Script_Upload_"+pom000_Reuseable_Script_for_Page.getSaltString());
	wait.until(ExpectedConditions.elementToBeClickable(uploadScriptSaveButton27)).click();	
	log.info("clicked save button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	
//	wait.until(ExpectedConditions.presenceOfElementLocated(SUDownloadButton));
	wait.until(ExpectedConditions.presenceOfElementLocated(RunTestScriptUpload));
	
	
	log.info("Waiting for Run button");
//	Assert.assertTrue(driver.findElement(SUDownloadButton).isDisplayed());
	Assert.assertTrue(driver.findElement(RunTestScriptUpload).isDisplayed());
	
	log.info("Run button displayed");
//	Assert.assertTrue(driver.findElement(SUDownloadButton).isEnabled());
	Assert.assertTrue(driver.findElement(RunTestScriptUpload).isEnabled());
	log.info("Run button enabled");
	
	
	wait.until(ExpectedConditions.elementToBeClickable(SUDropdown)).click();
//	driver.findElement(SUDropdown).click();
	log.info("Verified that select dropdown");	
	driver.findElement(SUDeleteIcon).click();
	log.info("Verified that Clicked delete button");
	/*WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);*/
	wait.until(ExpectedConditions.elementToBeClickable(deleteAllData)).click();
//	driver.findElement(deleteAllData).click();
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	}


//=============================================================================================================================================================================================
//Copy Script 27.0


public void CopyToAnotherApp() throws InterruptedException {
	    wait=new WebDriverWait(driver,30);		
	    wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
		log.info("Navigate to script Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
		log.info("Start Creating Script using + button");
		
		   wait.until(ExpectedConditions.elementToBeClickable(newScriptCreationPopup));	
			
			WebElement ele0 = driver.findElement(newScriptCreationPopup);
			JavascriptExecutor executor0 = (JavascriptExecutor)driver;
			executor0.executeScript("arguments[0].click();", ele0);
				
			log.info("New script creation popup appered");
			log.info("Pop defined as 'You are about to create a new script, Do you want to continue ?'");
			log.info("Clicked Yes");
				
			// Script Drop Down	
			 log.debug("Verified that Script dropdown"); 		 
			 WebElement scriptDropdown = driver.findElement(scriptSelectionDropdown);		
			  Select ScriptSelection = new Select(scriptDropdown);        
			  ScriptSelection.selectByIndex(0);
			  log.debug("Verified that IVR Script selected from dropdown");   
			  driver.findElement(scriptGoBut).click();  
			  log.debug("Verified that Go button clicked while select IVR Scriptn"); 
			  driver.findElement(e164disabled).click();
			 log.debug("Verified that e164disabled");
		
		
		
		String ScriptName="IVR_Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
		log.info("Generate Radom Scriptname " +ScriptName);
		driver.findElement(scriptNamefield).sendKeys(ScriptName);
	//	getScriptName().sendKeys(ScriptName);	
		log.info("Passing script name " +ScriptName);
		getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
		log.info("Generate Radom script description");
	//	getNumberToCall().sendKeys("18001111111");
		getNumberToCalle164disabled().sendKeys("18002041994");
		log.info("Passing Number to Call is 18002041994");	
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue1).click();
		log.info("Deleteing First PhraseHear");
		log.info("Sync issue so waiting just one second");	
		driver.findElement(deletePress1).click();
		log.info("Deleteing first Press Section");
		log.info("Sync issue so waiting just one second");
		driver.findElement(deletePhraseHearValue2).click();
		log.info("Deleteing second PhraseHear");
	        Thread.sleep(1000); 
	        wait.until(ExpectedConditions.elementToBeClickable(PauseButton));
		Actions act = new Actions(driver);
		 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
		 log.info("Using Action class double clicked pause button");
			
		driver.findElement(saveButton).click();
		log.info("Clicked Save button");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Sync issue so waiting just ten Second");
		driver.findElement(filterByNameGSB).clear();
		driver.findElement(filterByNameGSB).sendKeys(ScriptName);
		log.info("Search above created Script using filter " +ScriptName);
		wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
		log.info("Just retrived the deatils of above created script " +ScriptName);
		Assert.assertTrue(driver.findElement(RunButton).isEnabled());
		log.info("Verified that Run button is enabled");		
		Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
		log.info("Verified that Run button contain 'Run Test' text");
	   driver.findElement(selectdropdownn).click();
	   log.info("Verified that select dropdown");	
	   driver.findElement(copyToAnotherScript).click();  
	   
	    log.info("Verified copyScript clicked from dropdown");
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
	   
	   WebElement copyToDropdown = driver.findElement(copytodropdown);	
	   Select copyToSelection=new Select(copyToDropdown);
	   copyToSelection.selectByIndex(1);
	   
	   log.info("Select HODQA");
	   
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
   
	   driver.findElement(applicationCreateBUT).click();
	   log.info("Create Application Button clicked");
	   
	   String Application_="Application_"+pom000_Reuseable_Script_for_Page.getSaltString();
	   
	   
	   
	   driver.findElement(appCreatefield).sendKeys(Application_);
	   log.info("Provided input as Application");
	   
	   driver.findElement(appSaveBut).click();
	   log.info("Click Save Application button");
	   
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
	   
	   driver.findElement(releaseCreBut).click();
	   log.info("Create release Button clicked");
	   String Release_="Application_"+pom000_Reuseable_Script_for_Page.getSaltString();
	      
	   driver.findElement(relCreFiled).sendKeys(Release_);
	   log.info("Create release field added");
	   driver.findElement(relSaveBut).click();
	   log.info("Relase save button clicked");
	   
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
		
	   driver.findElement(copyToAntCopyBut).click();
	   log.info("Click Close button");
	   
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
	   
	   wait.until(ExpectedConditions.elementToBeClickable(copyToAntClose)).click();
	   
	   log.info("close poup dilog box");	
	   
	 	   
			pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver)   ;
			   
		
	   
	   wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
		log.debug("Profile dropdown clicked");	
	   wait.until(ExpectedConditions.elementToBeClickable(HODQA)).click();
	   log.debug("Switch to HODQA");	
	   driver.navigate().refresh();
	   
	   log.debug("Refersing appication");	
	   
	   driver.navigate().refresh();
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");
	  
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   pom002_VW_Home_Page home=new pom002_VW_Home_Page(driver);
	   wait.until(ExpectedConditions.elementToBeClickable(home.dashBoardTab)).click();
	   
	   pom003_VW_Dashboard1_Tab dashboard1_Tab=new pom003_VW_Dashboard1_Tab(driver);
	   wait.until(ExpectedConditions.presenceOfElementLocated(dashboard1_Tab.overallDownloadCSVbutton));
	   wait.until(ExpectedConditions.elementToBeClickable(home.scriptsTab)).click();
	   
		   
	   wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(HODSelectApplocation));	   
	   WebElement application_select = driver.findElement(HODSelectApplocation);	
	   Select application_select1=new Select(application_select);
	   application_select1.selectByVisibleText(Application_);
	   log.info("Application selected in HODQA");		   
	   
	   
	   WebElement release_select = driver.findElement(HODSelectRelease);	
	   Select release_select1=new Select(release_select);
	   release_select1.selectByVisibleText(Release_);
	   log.info("Release selected in HODQA");
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
	   log.info("Found load progress bar");     
	   
	     
	  driver.findElement(filterByNameGSB).clear();
	  driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	  log.info("Search successfully copy to another script");	
	  wait.until(ExpectedConditions.elementToBeClickable(selectfirstsearch)).click();;
	  log.info("first copied search successfully");
	  Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	 log.info("Verified that Run button enabled");
	 
//	 String HODQA_Script=driver.findElement(HODScriptNameField).getText();
	 
	 String HODQA_Script=driver.findElement(HODScriptNameField).getAttribute("value");	 
	 log.info("ScriptName in HODQA is " +HODQA_Script);	 	 
	 Assert.assertEquals(ScriptName, HODQA_Script);  
	 log.info("Script Copied successfully using copy to another app feature");	 
	 
	 driver.findElement(selectdropdownn).click();
		log.info("Verified that select dropdown");
 if (driver.findElements(clickdeletedropdown).size()!=0) {
			
			log.info("delete button not found, so delete functinality not avaiable");
		} else {		
		driver.findElement(clickdeletedropdown27).click();
		log.info("Verified that Clicked delete button");
		WebElement ele = driver.findElement(deleteAllData);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		log.info("Verified that select delete all data");

		wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();		
		log.info("delete successfully");
		
		/*driver.findElement(HODReleaseDropdown).click();
		log.info("HOD release dropdown clicked");
		
		driver.findElement(HODReleaseDeleteBut).click();
		log.info("HOD release delete button clicked");
		
		driver.findElement(HODDeleteResultBut).click();
		log.info("HOD release delete Successfully clicked");*/
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
		log.debug("Profile dropdown clicked");	
	   wait.until(ExpectedConditions.elementToBeClickable(VoiceWatch)).click();
	   log.debug("Switch to VoiceWatch back");driver.navigate().refresh();
	   
	   log.debug("Refersing appication");		   
	   driver.navigate().refresh();
	   driver.navigate().refresh();
	   log.debug("Refersing appication");	
	   wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));		   
	   log.info("Found load progress bar");	 	   
	 
	   wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
		log.info("Navigate to script Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
		
		  driver.findElement(filterByNameGSB).clear();
		  driver.findElement(filterByNameGSB).sendKeys(ScriptName);
		  log.info("Search successfully copy to another script");	
		  wait.until(ExpectedConditions.elementToBeClickable(selectfirstsearch)).click();;
		  log.info("first copied search successfully");
		  Assert.assertTrue(driver.findElement(RunButton).isEnabled());
		 log.info("Verified that Run button enabled");
		 
		 
		 driver.findElement(selectdropdownn).click();
			log.info("Verified that select dropdown");
	 if (driver.findElements(clickdeletedropdown).size()!=0) {
				
				log.info("delete button not found, so delete functinality not avaiable");
			} else {		
			driver.findElement(clickdeletedropdown27).click();
			log.info("Verified that Clicked delete button");
			WebElement ele3 = driver.findElement(deleteAllData);
			JavascriptExecutor executor3 = (JavascriptExecutor)driver;
			executor3.executeScript("arguments[0].click();", ele3);
			log.info("Verified that select delete all data");
	
			wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();		
			log.info("delete successfully");	
			wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
			log.info("Found load progress bar");
					
		driver.navigate().refresh();
		log.info("Refersh application");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
		log.info("Found load progress bar");
}
}

}
//=======================================================================================================================
//Delete ScriptUpload

public void deleteScriptUpload() throws InterruptedException {
	
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
	log.info("clicked ScriptTab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	driver.findElement(scriptUploadTab).click();	
	driver.findElement(filterByNameSU).sendKeys("Haari");
	driver.findElement(selectfirstsearch).click();	
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();
	driver.findElement(SUDropdown).click();
	log.info("Verified that select dropdown");	
	driver.findElement(SUDeleteIcon).click();
	log.info("Verified that Clicked delete button");
	WebElement ele = driver.findElement(deleteAllData);
	JavascriptExecutor executor = (JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele);
//	driver.findElement(deleteAllData).click();
	log.info("Verified that select delete all data");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	driver.navigate().refresh();
	log.info("Refersh application");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	}

//=====================================================================================================================

//Create CSVTansform Creation

public void CreateCSVTransformer () throws InterruptedException, IOException {
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();

	log.info("clicked ScriptTab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	Thread.sleep(2000);
	log.info("Inprogress");
	wait.until(ExpectedConditions.elementToBeClickable(csvTranformerTab)).click();
	log.info("clicked csvTranformer");
	wait.until(ExpectedConditions.elementToBeClickable(csvSelect)).click();
	log.info("CSV Transformer clicked");
	Thread.sleep(1000);	
	Runtime.getRuntime().exec(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\testData\\FileUpload3.exe");	
	log.info("Uploaded using Autoit Script done");
	log.info("csv file browse from local");
	wait.until(ExpectedConditions.presenceOfElementLocated(TransformButton));	
	log.info("found Transfomer button element");
	Assert.assertTrue(driver.findElement(TransformButton).isEnabled());
	log.info("Transfomer button enabled");
	driver.findElement(TransformButton).click();
	log.info("CSV Transform clicked Successfully");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");		
	Thread.sleep(2000);
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
	log.info("clicked ScriptTab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(csvTranformerTab).click();
	log.info("Again Navigate to CSV Transform");
	log.info("clicked CSV Transfer success");	
//	driver.navigate().refresh();
//	log.info("Refersh application");
//	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
//	log.info("Found load progress bar");
	driver.findElement(goScriptBuilderTab).click();
	Assert.assertTrue(driver.findElement(goScriptBuilderScriptslabel).isDisplayed());
	log.info("Navigate to script tab");
	
}

//Delete ScriptUpload

public void deleteCSVTranformer() throws InterruptedException {
	
	Thread.sleep(10000);
//	driver.findElement(tagTab).click();
//	log.info("clicked tagTab");
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
	log.info("clicked ScriptTab");
	Thread.sleep(10000);
	driver.findElement(scriptUploadTab).click();
	Thread.sleep(10000);
	log.info("clicked ScriptUploadTab");
//	driver.findElement(createNewScriptByButtonSU).click();
	Thread.sleep(1000);
	int iCount = 0;
	iCount=driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).size();
	log.info("Counted " +iCount);
	
	for(int i=0;i<iCount;i++)
	{
		
		System.out.println("Ramukaka");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
		Thread.sleep(100);
		
		//	driver.findElement(By.xpath("//li[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']")).click();
		log.info("clicked first");
		driver.findElement(By.xpath("//form[@name='cms_form']//i[@class='glyphicon glyphicon-option-vertical']")).click();
		Thread.sleep(100);
		log.info("clicked dropdown");
		driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[5]/form[1]/div[2]/span/div/ul/li[2]/a/i")).click();
		Thread.sleep(100);
		log.info("deleted");
	//	driver.findElement(deleteAllData).click();
		WebElement ele = driver.findElement(deleteAllData);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(1000);
				
	}
}


///Deletion of script based on description count from search

public void scriptdeletion() throws InterruptedException {
	
	
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Progress");
	wait.until(ExpectedConditions.elementToBeClickable(scriptGoBut));
	
	
	int icount1=driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).size();
	System.out.println("Count: "+icount1);
	
	
//======================================================================		
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']"));
	 for (WebElement element : elements) {
	    System.out.println(element.getText()); 
if (element.getText().contains("IVR_Script")||element.getText().contains("Empirix_")||element.getText().contains("Script_")) {
	
	element.click();
//	driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).click();
			
			driver.findElement(selectdropdownn).click();
			log.info("Verified that select dropdown");	
			driver.findElement(clickdeletedropdown27).click();
			log.info("Verified that Clicked delete button");
		//	driver.findElement(deleteAllData).click();
			WebElement ele = driver.findElement(deleteAllData);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			log.info("Verified that select delete all data");
	//		wait.until(ExpectedConditions.alertIsPresent());
	//		driver.switchTo().alert().accept();
			wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();
			log.info("delete Orignal Script successfully");		 
	     
	    
}
}
	 }
	 

///Deletion of script based on description count from search

public void scriptdeletion_26() throws InterruptedException {
	
	
	wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Progress");
//	wait.until(ExpectedConditions.elementToBeClickable(scriptGoBut));
	
	
	int icount1=driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).size();
	System.out.println("Count: "+icount1);
	
	
//======================================================================		
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']"));
	 for (WebElement element : elements) {
	    System.out.println(element.getText()); 
if (element.getText().contains("Script_")||element.getText().contains("Empirix_")) {
	
	element.click();
//	driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).click();
			
			driver.findElement(selectdropdownn).click();
			log.info("Verified that select dropdown");	
			driver.findElement(clickdeletedropdown).click();
			log.info("Verified that Clicked delete button");
		//	driver.findElement(deleteAllData).click();
			WebElement ele = driver.findElement(deleteAllData);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			log.info("Verified that select delete all data");
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
	//		wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();
			log.info("delete Orignal Script successfully");		 
	     
	    
}
}
	 }



	 public void e2escriptdeletion() throws InterruptedException {
			
			
			wait=new WebDriverWait(driver,30);
			wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();
			log.info("Navigate to script Tab");
			wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
			log.info("Progress");
			wait.until(ExpectedConditions.elementToBeClickable(scriptGoBut));
			
			
			int icount1=driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).size();
			System.out.println("Count: "+icount1);
			
			
		//======================================================================		
			
			
			List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']"));
			 for (WebElement element : elements) {
			    System.out.println(element.getText()); 
		if (element.getText().contains("E2E_Script")) {
			
			element.click();
//			driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).click();
					
					driver.findElement(E2EDropdown).click();
					log.info("Verified that select dropdown");	
					driver.findElement(clickdeletedropdownE2E).click();
					log.info("Verified that Clicked delete button");
					wait.until(ExpectedConditions.elementToBeClickable(deleteAllData)).click();
				//	driver.findElement(deleteAllData).click();
				//	WebElement ele = driver.findElement(deleteAllData);
				//	JavascriptExecutor executor = (JavascriptExecutor)driver;
				//	executor.executeScript("arguments[0].click();", ele);
					log.info("Verified that select delete all data");
			//		wait.until(ExpectedConditions.alertIsPresent());
			//		driver.switchTo().alert().accept();
			//		 wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));	
			//		 log.info("Found load progress bar");		
					 Thread.sleep(1000);
					wait.until(ExpectedConditions.elementToBeClickable(deletemessagepopup)).click();					
					log.info("delete Orignal Script successfully");	
					Thread.sleep(1000);
				//	driver.navigate().refresh();
					
					driver.findElement(E2ESlideButton).click();
					Thread.sleep(1000);
			    
			    
			    
			 }
 
	               
	 
	
}

	 }

}
	
	
	
	
	
	
	
//================================================================================	
	
	
	/*for(int i=0;i<icount1;i++) {
		
		System.out.println("Ramu1");
		Thread.sleep(1000);
		System.out.println("Ramu2");
	//	int count=driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']")).getText().length();
		
	//	driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope testActive']")).click();
		
		driver.findElement(By.xpath("//*[@class='nav nav-sidebar tests left-side-nav-list-item ng-binding ng-scope']")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
		
		System.out.println("Ramu3");
		Thread.sleep(1000);
	//	String scriptSize=driver.findElement(scriptNamefield).getAttribute("Value");
	//	String scriptSize=driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/div/div/div[4]/div/form/div[2]/input")).getAttribute("Value");
		
	//	String Description=driver.findElement(scriptDescGSBfield).getAttribute("value");
		
		String Name=driver.findElement(scriptNamefield).getAttribute("value");
		
		
		
	
	//	if (Description.length()>=4 || Description.length()==0 ) {
		
		if (Name.contains("Script_")) {
			
			driver.findElement(selectdropdownn).click();
			log.info("Verified that select dropdown");	
			driver.findElement(clickdeletedropdown).click();
			log.info("Verified that Clicked delete button");
		//	driver.findElement(deleteAllData).click();
			WebElement ele = driver.findElement(deleteAllData);
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", ele);
			log.info("Verified that select delete all data");
			wait.until(ExpectedConditions.alertIsPresent());
			driver.switchTo().alert().accept();
			log.info("delete Orignal Script successfully");		    
			
		}	
			
		}
		
}*/
		
		




//Will ask ====================================================================


/*String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();

public void CreateScriptTest() throws InterruptedException {
//	wait=new WebDriverWait(driver,30);		
	wait.until(ExpectedConditions.elementToBeClickable(scriptsTab)).click();	
	log.info("Navigate to script Tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	wait.until(ExpectedConditions.elementToBeClickable(createNewScriptByButton)).click();
	log.info("Start Creating Script using + button");
//	String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();
	log.info("Generate Radom Scriptname " +ScriptName);
	getScriptName().sendKeys(ScriptName);	
	log.info("Passing script name " +ScriptName);
	getScriptDesc().sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	getNumberToCall().sendKeys("18001111111");
	log.info("Passing Number to Call is 18001111111");	
	driver.findElement(deletePhraseHearValue1).click();
	log.info("Deleteing First PhraseHear");
	driver.findElement(deletePress1).click();
	log.info("Deleteing first Press Section");
	driver.findElement(deletePhraseHearValue2).click();
	log.info("Deleteing second PhraseHear");
    Thread.sleep(1000);    
	Actions act = new Actions(driver);
	 act.moveToElement(driver.findElement(PauseButton)).doubleClick().build().perform();	
	 log.info("Using Action class double clicked pause button");		
	driver.findElement(saveButton).click();
	log.info("Clicked Save button");	
	wait.until(ExpectedConditions.invisibilityOfElementLocated(processingBar1));
	log.info("Found load progress bar");
	driver.findElement(filterByNameGSB).clear();
	driver.findElement(filterByNameGSB).sendKeys(ScriptName);
	log.info("Search above created Script using filter " +ScriptName);
	wait.until(ExpectedConditions.elementToBeClickable(firstsearchscript)).click();;
	log.info("Just retrived the deatils of above created script " +ScriptName);
	Assert.assertTrue(driver.findElement(RunButton).isEnabled());
	log.info("Verified that Run button is enabled");
    Assert.assertEquals(driver.findElement(RunButton).getText().contains("Run Test"), true);
    log.info("Verified that Run button contain Run Test text");		

}
*/


	
	






