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

public class pom008_VW_Variable_Tab {
	private static Logger log =LogManager.getLogger(pom008_VW_Variable_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom002_VW_Home_Page homePage=new pom002_VW_Home_Page(driver); 
	
	By variableslabel=By.xpath("//div[@class='panel-heading']");
	By filterByVariableName=By.xpath("//input[@placeholder='Filter by variable name']");
	By variablelabel=By.xpath("//div[@class='ng-scope']//h4[contains(text(),'Variable')]");
	By bulkUploadButton=By.xpath("//span[@class='glyphicon glyphicon-upload']");
	By createVariableByButton=By.xpath(" //span[@class='glyphicon glyphicon-plus-sign']");
	By pleaseSelectlabel=By.xpath("//div[@id='loading']");
	By createaNewVariableLink=By.linkText("Create a new variable");
	By uploadVariableLink=By.linkText("Upload variables via csv");
	By namelabel=By.xpath("//div[@class='input-group-addon']");
	By namefiled=By.xpath("//input[@name='currentVariable.var_name']");
	By valuelabel=By.xpath("//h4[contains(text(),'Value')]");
	By valueFiled=By.xpath("//textarea[@placeholder='Enter content of the variable here.']");
	By saveButton=By.xpath("//span[@class='pull-right']//button[contains(@class,'btn btn-primary btn-sm')]");
	By saveButtonDisabled=By.xpath("//*[@ng-click='save()' and @disabled='disabled']");
	By deleteButton=By.xpath("//span[@class='pull-right']//button[@class='btn btn-danger btn-sm']"); 
	By deleteButtondisabed=By.xpath("//*[@ng-click='remove()' and @disabled='disabled']");
	By goScriptBuilderTab=By.xpath("//span[contains(text(),'Go Script Builder')]");
	By goScriptBuilderTab1=By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[2]/div/div[2]/ul/li[1]/a");
	
	By goScriptBuilderScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By goScriptBuilderScriptsCount=By.xpath("//span[@class='badge pull-right ng-binding']");	
	By filterByNameGSB=By.xpath("//input[@placeholder='Filter by name']");
	
	By createNewScriptByButton=By.xpath("//div[@class='panel-body']//span[@class='glyphicon glyphicon-plus-sign pull-right']");
	
	By pleaseSelectlabelGSB=By.xpath("//span[contains(text(),'Please select a script or')]");
	By createNewScriptBylink=By.linkText("create a new script"); 
	By scriptUploadTab=By.xpath("//span[contains(text(),'Script Upload')]");
	By callMasterScriptslabel=By.xpath("//div[@class='panel-heading ng-binding']");
	By callMasterScriptscount=By.xpath("//span[@class='badge pull-right ng-binding']");
	By filterByNameSU=By.xpath("//input[@placeholder='Filter by name']");
	By pleaseSelectlabelSU=By.xpath("//span[contains(text(),'Please select a script or')]");
	By createNewScriptlinkSU=By.xpath("//u[contains(text(),'create a new script')]");
	By csvTranformerTab=By.xpath("//span[contains(text(),'CSV Transformer')]");
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
	
	By scriptBuilderlabel=By.xpath("//a[contains(text(),'Script Builder')]");
	By resultslabel=By.xpath("//a[contains(text(),'Results')]");
	By callLogsNamelabel=By.xpath("//a[contains(text(),'Call Logs')]");
	By associatedTestslabel=By.xpath("//a[contains(text(),'Associated Tests')]");
//	By uploadScriptXMLFile=By.className("files_upload ng-pristine ng-untouched ng-valid ng-empty");
	
	By uploadScriptFile=By.xpath("//div[@class='files_upload ng-pristine ng-untouched ng-valid ng-empty']");
	By firstVariable=By.xpath("//li[1][@class='nav nav-sidebar tests ng-binding ng-scope']");
	By variableprocess=By.xpath("//*[@ng-click='inProcess']");
	By VariableCount=By.xpath("//li[@class='nav nav-sidebar tests ng-binding ng-scope']");
	By VariableFirst=By.xpath("//li[1][@class='nav nav-sidebar tests ng-binding ng-scope']");
		
  String Role=pom010_VW_Notification_Tab.UserPermissionLevel;
	
    
	//ContractorA
	
	public pom008_VW_Variable_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab

//==================================================================================	
	
public void VariableTabValidation() throws InterruptedException {	
		
		wait=new WebDriverWait(driver,20);	
		driver.findElement(homePage.variablesTab).click();		
	    wait.until(ExpectedConditions.presenceOfElementLocated(variablelabel));
		
		Assert.assertTrue(driver.findElement(variableslabel).isDisplayed());
		log.debug("Verified that 'Variables' label appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(variableslabel).isEnabled());
		log.debug("Verified that 'Variables' label enabled on left side of under Variable tab");
		Assert.assertEquals(driver.findElement(variableslabel).getText().contains("Variables"),true);
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		
		Assert.assertTrue(driver.findElement(filterByVariableName).isDisplayed());
		log.debug("Verified that 'Filter by variable name' filed appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(filterByVariableName).isEnabled());
		log.debug("Verified that 'Filter by variable name' filed enabled on left side of under Variable tab");
		
		Assert.assertTrue(driver.findElement(variablelabel).isDisplayed());
		log.debug("Verified that 'Variable' label appeared under Variable tab");	
		Assert.assertTrue(driver.findElement(variablelabel).isEnabled());
		log.debug("Verified that 'Variable' label enabled on under Variable tab");
		Assert.assertEquals(driver.findElement(variablelabel).getText(), "Variable");
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");	
		
		
		if (driver.findElements(bulkUploadButton).isEmpty()) {
			
			log.debug("Verified that 'Bulk Upload Variable via CSV' button is not displaying under Variable tab");
			log.debug("Verified that 'Bulk Upload Variable via CSV' button is not enabled under Variable tab");	
			
						
		}else
		
		{
			log.debug("Verified that 'Bulk Upload Variable via CSV' button displayed under Variable tab");
			log.debug("Verified that 'Bulk Upload Variable via CSV' button enabled under Variable tab");	
		
		}
		
			
       if (driver.findElements(createVariableByButton).isEmpty()) {
			
			log.debug("Verified that 'Add Variable' button is not displaying under Variable tab");
			log.debug("Verified that 'Add Variable' button is enabled under Variable tab");
			
			
						
		}else
		
		{
			log.debug("Verified that 'Add Variable' button displayed under Variable tab");
			log.debug("Verified that 'Add Variable' button enabled under Variable tab");	
		
		}
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a variable, or the following:' label appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
		log.debug("Verified that 'Please select a variable, or the following:' label enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a variable, or the following:");
		log.debug("Verified that 'Please select a variable, or the following:' text appearedd on left side of under Variable tab");
		
        if (driver.findElements(createaNewVariableLink).isEmpty()) {
			
        	log.debug("Verified that 'Create a new variable' link is not appearing under Variable tab");
			log.debug("Verified that 'Create a new variable' link is not enabled under Variable tab");		
			
						
		}else
		
		{
			log.debug("Verified that 'Create a new variable' link appeared on under Variable tab");
			log.debug("Verified that 'Create a new variable' link enabled on under Variable tab");		
		
		}
		
		        
       if (driver.findElements(uploadVariableLink).isEmpty()) {
			
    	   log.debug("Verified that 'Upload variables via csv' link is not appearing under Variable tab");
			log.debug("Verified that 'Upload variables via csv' link is not enabled under Variable tab");	
			
						
		}else
		
		{
			log.debug("Verified that 'Upload variables via csv' link appeared on under Variable tab");
			log.debug("Verified that 'Upload variables via csv' link enabled on under Variable tab");	
		
		}	
       
       String count=driver.findElement(variableslabel).getText();
			log.debug("Script header contain "+count);
			String[] part = count.split("(?<=\\D)(?=\\d)");		
			log.debug("spilled value "+part[1]);	
			int Count=driver.findElements(VariableCount).size();
			log.debug("Script Count "+Count);	
			String VariableActualCount =String.valueOf(Count);	
			log.debug("integer converted as: "+VariableActualCount);	
			
			Assert.assertEquals(part[1], VariableActualCount);		
			log.debug("Verified that script count found correct: "+VariableActualCount);	
			
			if (Count>0) {				
		
				driver.findElement(VariableFirst).click();
									
				log.debug("First Variable Clicked");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));
				log.info("found progress bar loading");				
				
				wait.until(ExpectedConditions.presenceOfElementLocated(saveButton));						
				
				Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
				log.info("save button displayed");	
				
               if (Role.equals("User"))	{
					
					Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
					log.info("Variable Name filed displayed under Varaible");
					Assert.assertFalse(driver.findElement(namefiled).isEnabled());
					log.info("Variable Name filed disabled under Varaible");
					Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
					log.info("Variable Value filed displayed under Varaible");
					Assert.assertFalse(driver.findElement(valueFiled).isEnabled());
					log.info("Variable Name value filed disabled under Varaible");
					Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
					log.info("Variable save button displayed under Varaible");
					Assert.assertFalse(driver.findElement(saveButton).isEnabled());
					log.info("Variable save button disabled under Varaible");
					Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
					log.info("Variable delete button displayed under Varaible");
					Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
					log.info("Variable delete button disabled under Varaible");
					
				}	
				
				
				
				
				
								
				if (driver.findElements(saveButtonDisabled).size() != 0) {
				
				log.info("Save button not found ");
				
			}	else {
				
				log.info("Save button found");				
			}	 
			
				Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
				log.info("Delete button displayed");
			
			if (driver.findElements(deleteButtondisabed).size() != 0) {
				
				log.info("Delete button is disabled");
				
			}	else  {
				
				log.info("Delete button is enabled");			
		
			
   			}
	}

//=============================VariableButton==========================================================================================================================
	

          if (driver.findElements(createVariableByButton).isEmpty()) {
        	  
        	 	
			log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
			
							
		}else
		
		{
			log.debug("Verified that add Variable plus (+) icon appeared on top left side under Variable tab");	
					
			driver.findElement(createVariableByButton).click();
		log.debug("Validated the element while click Add Variable using button (+)");
		
				
		Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
		log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(namelabel).isEnabled());
		log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
		log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
		log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(namefiled).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
		
		Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
		log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
		log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
		log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
		log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
		log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");	
		
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
		log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");
		
		}
	

	//=================================VariableLink===========================================================================================	
	
	
	driver.findElement(homePage.variablesTab).click();			
	
	
    if (driver.findElements(createaNewVariableLink).isEmpty()) {
		
		log.debug("Verified that add Variable Link is not appeared on top left side under Variable tab");	
					
	}else
	
	{
		log.debug("Verified that add link appeared on top left side under Variable tab");	
		driver.findElement(createaNewVariableLink).click();
	log.debug("Validated the element while click Add Variable using Link");		
	Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
	log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namelabel).isEnabled());
	log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
	log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
	log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namefiled).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
	log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
	log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
	log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
	log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
	log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");		
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
	log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
	log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");
	
}
}

	
//================================OLD================================================	
	/*public void variableTabValidation() throws InterruptedException {	
		
		wait=new WebDriverWait(driver,20);	
		driver.findElement(homePage.variablesTab).click();		
	    wait.until(ExpectedConditions.presenceOfElementLocated(variablelabel));
		
		Assert.assertTrue(driver.findElement(variableslabel).isDisplayed());
		log.debug("Verified that 'Variables' label appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(variableslabel).isEnabled());
		log.debug("Verified that 'Variables' label enabled on left side of under Variable tab");
		Assert.assertEquals(driver.findElement(variableslabel).getText().contains("Variables"),true);
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		
		Assert.assertTrue(driver.findElement(filterByVariableName).isDisplayed());
		log.debug("Verified that 'Filter by variable name' filed appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(filterByVariableName).isEnabled());
		log.debug("Verified that 'Filter by variable name' filed enabled on left side of under Variable tab");
		
		Assert.assertTrue(driver.findElement(variablelabel).isDisplayed());
		log.debug("Verified that 'Variable' label appeared under Variable tab");	
		Assert.assertTrue(driver.findElement(variablelabel).isEnabled());
		log.debug("Verified that 'Variable' label enabled on under Variable tab");
		Assert.assertEquals(driver.findElement(variablelabel).getText(), "Variable");
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		
		
		if (driver.findElements(bulkUploadButton).isEmpty()) {
			
			log.debug("Verified that 'Bulk Upload Variable via CSV' button is not displaying under Variable tab");
			log.debug("Verified that 'Bulk Upload Variable via CSV' button is not enabled under Variable tab");	
			
						
		}else
		
		{
			log.debug("Verified that 'Bulk Upload Variable via CSV' button displayed under Variable tab");
			log.debug("Verified that 'Bulk Upload Variable via CSV' button enabled under Variable tab");	
		
		}
		
			
       if (driver.findElements(createVariableByButton).isEmpty()) {
			
			log.debug("Verified that 'Add Variable' button is not displaying under Variable tab");
			log.debug("Verified that 'Add Variable' button is enabled under Variable tab");
			
			
						
		}else
		
		{
			log.debug("Verified that 'Add Variable' button displayed under Variable tab");
			log.debug("Verified that 'Add Variable' button enabled under Variable tab");	
		
		}
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a variable, or the following:' label appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
		log.debug("Verified that 'Please select a variable, or the following:' label enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a variable, or the following:");
		log.debug("Verified that 'Please select a variable, or the following:' text appearedd on left side of under Variable tab");
		
        if (driver.findElements(createaNewVariableLink).isEmpty()) {
			
        	log.debug("Verified that 'Create a new variable' link is not appearing under Variable tab");
			log.debug("Verified that 'Create a new variable' link is not enabled under Variable tab");		
			
						
		}else
		
		{
			log.debug("Verified that 'Create a new variable' link appeared on under Variable tab");
			log.debug("Verified that 'Create a new variable' link enabled on under Variable tab");		
		
		}
		
		        
       if (driver.findElements(uploadVariableLink).isEmpty()) {
			
    	   log.debug("Verified that 'Upload variables via csv' link is not appearing under Variable tab");
			log.debug("Verified that 'Upload variables via csv' link is not enabled under Variable tab");	
			
						
		}else
		
		{
			log.debug("Verified that 'Upload variables via csv' link appeared on under Variable tab");
			log.debug("Verified that 'Upload variables via csv' link enabled on under Variable tab");	
		
		}	
       
       String count=driver.findElement(variableslabel).getText();
			log.debug("Script header contain "+count);
			String[] part = count.split("(?<=\\D)(?=\\d)");		
			log.debug("spilled value "+part[1]);	
			int Count=driver.findElements(VariableCount).size();
			log.debug("Script Count "+Count);	
			String VariableActualCount =String.valueOf(Count);	
			log.debug("integer converted as: "+VariableActualCount);	
			
			Assert.assertEquals(part[1], VariableActualCount);		
			log.debug("Verified that script count found correct: "+VariableActualCount);	
			
			if (Count>0) {				
		
				driver.findElement(VariableFirst).click();
									
				log.debug("First Variable Clicked");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));
				log.info("found progress bar loading");				
				
				wait.until(ExpectedConditions.presenceOfElementLocated(saveButton));						
				
				Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
				log.info("save button displayed");	
								
				if (driver.findElements(saveButtonDisabled).size() != 0) {
				
				log.info("Save button is disabled");
				
			}	else {
				
				log.info("Save button is enabled");				
			}	 
			
				Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
				log.info("Delete button displayed");
			
			if (driver.findElements(deleteButtondisabed).size() != 0) {
				
				log.info("Delete button is disabled");
				
			}	else  {
				
				log.info("Delete button is enabled");			
		
			
   			}
	}
}
				
		
				
       			

//=================================================================================================	
	
	public void createVariableByButtonValidation() throws InterruptedException {
		
		driver.findElement(homePage.variablesTab).click();
		log.info("Clicked Variable Tab");
		
		
          if (driver.findElements(createVariableByButton).isEmpty()) {
        	  
        	 
			
			log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
			
			Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
			log.debug("Verified that 'Please select a variable, or the following:' label appeared on under Variable tab");	
			Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
			log.debug("Verified that 'Please select a variable, or the following:' label enabled on under Variable tab");	
			Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a variable, or the following:");
			log.debug("Verified that 'Please select a variable, or the following:' text appearedd on left side of under Variable tab");
			Assert.assertTrue(driver.findElement(variableslabel).isDisplayed());
			log.debug("Verified that 'Variables' label appeared on left side of under Variable tab");	
			Assert.assertTrue(driver.findElement(variableslabel).isEnabled());
			log.debug("Verified that 'Variables' label enabled on left side of under Variable tab");
			Assert.assertEquals(driver.findElement(variableslabel).getText().contains("Variables"), true);
			log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
			Assert.assertTrue(driver.findElement(variablelabel).isDisplayed());
			log.debug("Verified that 'Variable' label appeared under Variable tab");	
			Assert.assertTrue(driver.findElement(variablelabel).isEnabled());
			log.debug("Verified that 'Variable' label enabled on under Variable tab");
			Assert.assertEquals(driver.findElement(variablelabel).getText(), "Variable");
			log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
			Assert.assertTrue(driver.findElement(filterByVariableName).isDisplayed());
			log.debug("Verified that 'Filter by variable name' filed appeared on left side of under Variable tab");	
			Assert.assertTrue(driver.findElement(filterByVariableName).isEnabled());
			log.debug("Verified that 'Filter by variable name' filed enabled on left side of under Variable tab");
				
						
		}else
		
		{
			log.debug("Verified that add Variable plus (+) icon appeared on top left side under Variable tab");	
					
	//	Thread.sleep(10000);
			
			driver.findElement(createVariableByButton).click();
		log.debug("Validated the element while click Add Variable using button (+)");
		
				
		Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
		log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(namelabel).isEnabled());
		log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
		log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
		log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(namefiled).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
		
		Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
		log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
		log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
		log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
		log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
		Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
		log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");	
		
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");
		
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
		log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");
		
		}
	}

	//=================================================================================================		
	
public void createVariableByLinkValidation() throws InterruptedException {
		
	driver.findElement(homePage.variablesTab).click();			
	
	
    if (driver.findElements(createaNewVariableLink).isEmpty()) {
		
		log.debug("Verified that add Variable Link is not appeared on top left side under Variable tab");	
		
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a variable, or the following:' label appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
		log.debug("Verified that 'Please select a variable, or the following:' label enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a variable, or the following:");
		log.debug("Verified that 'Please select a variable, or the following:' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(variableslabel).isDisplayed());
		log.debug("Verified that 'Variables' label appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(variableslabel).isEnabled());
		log.debug("Verified that 'Variables' label enabled on left side of under Variable tab");
		Assert.assertEquals(driver.findElement(variableslabel).getText().contains("Variables"), true);
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(variablelabel).isDisplayed());
		log.debug("Verified that 'Variable' label appeared under Variable tab");	
		Assert.assertTrue(driver.findElement(variablelabel).isEnabled());
		log.debug("Verified that 'Variable' label enabled on under Variable tab");
		Assert.assertEquals(driver.findElement(variablelabel).getText(), "Variable");
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(filterByVariableName).isDisplayed());
		log.debug("Verified that 'Filter by variable name' filed appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(filterByVariableName).isEnabled());
		log.debug("Verified that 'Filter by variable name' filed enabled on left side of under Variable tab");					
	}else
	
	{
		log.debug("Verified that add link appeared on top left side under Variable tab");	
		driver.findElement(createaNewVariableLink).click();
	log.debug("Validated the element while click Add Variable using Link");		
	Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
	log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namelabel).isEnabled());
	log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
	log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
	log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namefiled).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
	log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
	log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
	log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
	log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
	log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");		
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
	log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
	log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");
	}
		
    
}*/


public void createVariableByButton() throws InterruptedException {
	
	driver.findElement(homePage.variablesTab).click();
	log.info("Clicked Variable Tab");
	wait=new WebDriverWait(driver,20);	
	
	
      if (driver.findElements(createVariableByButton).isEmpty()) {
    	  
    	 
		
		log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a variable, or the following:' label appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
		log.debug("Verified that 'Please select a variable, or the following:' label enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a variable, or the following:");
		log.debug("Verified that 'Please select a variable, or the following:' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(variableslabel).isDisplayed());
		log.debug("Verified that 'Variables' label appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(variableslabel).isEnabled());
		log.debug("Verified that 'Variables' label enabled on left side of under Variable tab");
		Assert.assertEquals(driver.findElement(variableslabel).getText().contains("Variables"), true);
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(variablelabel).isDisplayed());
		log.debug("Verified that 'Variable' label appeared under Variable tab");	
		Assert.assertTrue(driver.findElement(variablelabel).isEnabled());
		log.debug("Verified that 'Variable' label enabled on under Variable tab");
		Assert.assertEquals(driver.findElement(variablelabel).getText(), "Variable");
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(filterByVariableName).isDisplayed());
		log.debug("Verified that 'Filter by variable name' filed appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(filterByVariableName).isEnabled());
		log.debug("Verified that 'Filter by variable name' filed enabled on left side of under Variable tab");
			
					
	}else
	
	{
		log.debug("Verified that add Variable plus (+) icon appeared on top left side under Variable tab");	
				
//	Thread.sleep(10000);
		
		driver.findElement(createVariableByButton).click();
	log.debug("Validated the element while click Add Variable using button (+)");
	
			
	Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
	log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namelabel).isEnabled());
	log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
	log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
	log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namefiled).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
	
	Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
	log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
	log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
	log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
	log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
	log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");	
	
	
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
	log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
	log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");
	
	String VarName="Var_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(namefiled).sendKeys(VarName);
	log.info("Passing variable name");
	driver.findElement(valueFiled).sendKeys("18001111111");
	log.info("Passing variable name");
	driver.findElement(saveButton).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));
	log.info("inprocess");
	driver.findElement(homePage.variablesTab).click();
	log.info("Getting 404 so navigating variable tab");
	driver.findElement(filterByVariableName).sendKeys(VarName);
	log.info("Search created variable");
	driver.findElement(firstVariable).click();
	log.info("Search created variable reterived");
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.info("Delete button displayed found");
	Assert.assertTrue(driver.findElement(deleteButton).isEnabled());
	log.info("Delete button enabled found");
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.info("save button displayed found");
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.info("Save button disabled found");
	driver.findElement(deleteButton).click();
	log.info("delete button clicked");
	wait.until(ExpectedConditions.alertIsPresent());
	log.debug("waiting for alerts");
	driver.switchTo().alert().accept();
	log.debug("Alerts accepted");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));		
	log.debug("inprocess loading ");
    log.info("Delete above created tag"); 	
	
	}
}
public void createVariableByLink() throws InterruptedException {
	
	driver.findElement(homePage.variablesTab).click();
	log.info("Clicked Variable Tab");
	wait=new WebDriverWait(driver,20);	
	
	
      if (driver.findElements(createaNewVariableLink).isEmpty()) {
    	  
    	 
		
		log.debug("Verified that add Variable plus (+) icon not appeared on top left side under Variable tab");	
		
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a variable, or the following:' label appeared on under Variable tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
		log.debug("Verified that 'Please select a variable, or the following:' label enabled on under Variable tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a variable, or the following:");
		log.debug("Verified that 'Please select a variable, or the following:' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(variableslabel).isDisplayed());
		log.debug("Verified that 'Variables' label appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(variableslabel).isEnabled());
		log.debug("Verified that 'Variables' label enabled on left side of under Variable tab");
		Assert.assertEquals(driver.findElement(variableslabel).getText().contains("Variables"), true);
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(variablelabel).isDisplayed());
		log.debug("Verified that 'Variable' label appeared under Variable tab");	
		Assert.assertTrue(driver.findElement(variablelabel).isEnabled());
		log.debug("Verified that 'Variable' label enabled on under Variable tab");
		Assert.assertEquals(driver.findElement(variablelabel).getText(), "Variable");
		log.debug("Verified that 'Variables' text appearedd on left side of under Variable tab");
		Assert.assertTrue(driver.findElement(filterByVariableName).isDisplayed());
		log.debug("Verified that 'Filter by variable name' filed appeared on left side of under Variable tab");	
		Assert.assertTrue(driver.findElement(filterByVariableName).isEnabled());
		log.debug("Verified that 'Filter by variable name' filed enabled on left side of under Variable tab");
			
					
	}else
	
	{
		log.debug("Verified that add Variable plus (+) icon appeared on top left side under Variable tab");	
				
//	Thread.sleep(10000);
		
		driver.findElement(createaNewVariableLink).click();
	log.debug("Validated the element while click Add Variable using button (+)");
	
			
	Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
	log.debug("Verified that 'Name' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namelabel).isEnabled());
	log.debug("Verified that 'Name' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
	log.debug("Verified that 'Name' Text appeared while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
	log.debug("Verified that 'Name' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(namefiled).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Variable tab");	
	
	Assert.assertTrue(driver.findElement(valuelabel).isDisplayed());
	log.debug("Verified that 'Value' label appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valuelabel).isEnabled());
	log.debug("Verified that 'Value' label enabled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(valuelabel).getText().contains("Value"), true);	
	log.debug("Verified that 'Value' Text appeared while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(valueFiled).isDisplayed());
	log.debug("Verified that 'Value' filed appeared while add variable under Variable tab");	
	Assert.assertTrue(driver.findElement(valueFiled).isEnabled());
	log.debug("Verified that 'Value by name' filed enabled on left side of under Variable tab");	
	
	
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button while add variable under Variable tab");
	
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.debug("Verified that 'Delete button' displayed while add variable under Variable tab");	
	Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
	log.debug("Verified that 'Delete button' is disbaled while add variable under Variable tab");	
	Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
	log.debug("Verified that 'Delete' Text appeared on Delete button while add variable under Variable tab");
	
	String VarName="Var_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(namefiled).sendKeys(VarName);
	log.info("Passing variable name");
	driver.findElement(valueFiled).sendKeys("18001111111");
	log.info("Passing variable name");
	driver.findElement(saveButton).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));
	log.info("inprocess");
	driver.findElement(homePage.variablesTab).click();
	log.info("Getting 404 so navigating variable tab");
	driver.findElement(filterByVariableName).clear();
	driver.findElement(filterByVariableName).sendKeys(VarName);
	log.info("Search created variable");
	wait.until(ExpectedConditions.elementToBeClickable(firstVariable)).click();
//	driver.findElement(firstVariable).click();
	log.info("Search created variable reterived");
	
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
	Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
	log.info("Delete button displayed found");
	Assert.assertTrue(driver.findElement(deleteButton).isEnabled());
	log.info("Delete button enabled found");
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.info("save button displayed found");
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.info("Save button disabled found");
	driver.findElement(deleteButton).click();
	log.info("delete button clicked");
	wait.until(ExpectedConditions.alertIsPresent());
	log.debug("waiting for alerts");
	driver.switchTo().alert().accept();
	log.debug("Alerts accepted");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));		
	log.debug("inprocess loading ");
    log.info("Delete above created tag"); 	
	
	}
}
//Test Now with variable integration

public void Test_Now_With_Variable() throws InterruptedException {
	wait=new WebDriverWait(driver,30);
	pom007_VW_Script_Tabs ScriptTab=new pom007_VW_Script_Tabs(driver);
	pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
	pom005_VW_Tests_Tab testTab=new pom005_VW_Tests_Tab(driver);
	pom011_VW_Dashboard2_Tab dashboard2=new pom011_VW_Dashboard2_Tab(driver);
	
	log.info("=================New Variable Creation===========================");
	driver.findElement(homePage.variablesTab).click();
	log.info("Clicked Variable Tab");
	wait.until(ExpectedConditions.elementToBeClickable(createVariableByButton)).click();
	log.debug("Validated the element while click Add Variable using button (+)");
	String VarName="Var_"+pom000_Reuseable_Script_for_Page.getSaltString();
	driver.findElement(namefiled).sendKeys(VarName);
	log.info("Passing variable name");
	driver.findElement(valueFiled).sendKeys("18001111111");
	log.info("Passing variable name");
	driver.findElement(saveButton).click();
	log.info("Save button clicked");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));
	log.info("inprocess");
	log.info("=================New Script Creation===========================");
	
	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.scriptsTab)).click();
		log.info("Navigate to Script Tab");
		log.info("=================New Script Creation===========================");	
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar loading");
		wait.until(ExpectedConditions.presenceOfElementLocated(ScriptTab.createNewScriptBylink));
		Thread.sleep(2000);
		WebElement ele2 = driver.findElement(ScriptTab.createNewScriptBylink);
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);		
	//	wait.until(ExpectedConditions.elementToBeClickable(ScriptTab.createNewScriptBylink)).click();
		log.info("Start Creating Script using + button");
		String ScriptName="Script_"+pom000_Reuseable_Script_for_Page.getSaltString();		
		log.info("Generate Radom Scriptname " +ScriptName);		
	wait.until(ExpectedConditions.presenceOfElementLocated(ScriptTab.scriptNamefield));	
	Thread.sleep(1000);
	driver.findElement(ScriptTab.scriptNamefield).sendKeys(ScriptName);
	log.info("Script Name Passing to script name field is: " +ScriptName);
	driver.findElement(ScriptTab.scriptDescGSBfield).sendKeys(pom000_Reuseable_Script_for_Page.getSaltString());
	log.info("Generate Radom script description");
	driver.findElement(ScriptTab.numberToCall).sendKeys("@"+VarName);
	log.info("Passing Number to Call using variable");
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
	driver.findElement(testTab.testCreateplusbutton).click();
	log.info("Start Creating Test using + button");
	driver.findElement(testTab.testNameField).sendKeys("Test_"+ScriptName);
//	getTestName().sendKeys("Test_"+ScriptName);
	log.info("Test Name Passing to test name field");
	WebElement dropdown = driver.findElement(testTab.ScriptDropdown);
	Select s = new Select(dropdown);
	s.selectByVisibleText(ScriptName);
	log.info("Select script from dropdown under test tab");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	driver.findElement(testTab.saveButtonTestTab).click();
	log.info("clicked Save Test button");
	wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
	log.info("found progress bar loading");
	Assert.assertTrue(driver.findElement(testTab.viewResult).isEnabled());
	log.info("Verified that Run button enabled");
	log.info("=========================Test Now=======================");
	driver.findElement(testTab.viewResult).click();
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
	  Thread.sleep(20000);	
	    driver.navigate().refresh();
	    Thread.sleep(2000);
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

	if (driver.findElements(deleteButton).isEmpty()){
		log.info("Delete button not found");
	} else {
		
	wait.until(ExpectedConditions.elementToBeClickable(testTab.deleteButton)).click();
	log.info("Delete button clicked under Test Tab");		
	wait.until(ExpectedConditions.elementToBeClickable(testTab.yesDeleteButton)).click();	    
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

public void Variabledeletion() throws InterruptedException {
	
	pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
	wait=new WebDriverWait(driver,30);
	driver.navigate().refresh();
	wait.until(ExpectedConditions.elementToBeClickable(home_Page.variablesTab)).click();

	log.debug("Variable Tab clicked");	
	  wait.until(ExpectedConditions.elementToBeClickable(createaNewVariableLink));
	
	
	List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']"));
	 for (WebElement element : elements) {
	    System.out.println(element.getText()); 
if (element.getText().contains("Var_")) {
//	Thread.sleep(500);
	element.click();
		
	wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
	
	try {
		
	String Message=	driver.switchTo().alert().getText();
	
	log.debug("Aleart Message"+Message);	
	
	
	if (Message.contains("Variable in use")) {
		
		log.debug("Message appeared 'Variable in use'");	
		
	}
		
	} catch (Exception e) {
		// TODO: handle exception
		
		driver.switchTo().alert().accept();
		driver.navigate().refresh();
	}
	
	
		log.debug("Clicked selected notify as delete");
		wait.until(ExpectedConditions.alertIsPresent());
		log.info("Alert is coming");
		driver.switchTo().alert().accept();
		log.info("Alert accepted");	
		log.debug("Delete Successfully");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(variableprocess));
		
		driver.findElement(home_Page.variablesTab).click();
		Thread.sleep(500);
	
	    
	 }
	
	 }
}

		}		




	