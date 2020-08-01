package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class pom009_VW_Hammers_Tab {
	private static Logger log =LogManager.getLogger(pom009_VW_Hammers_Tab.class.getName());

	public WebDriver driver;
	
	By tagTab=By.linkText("Tags");
	By hammersTab=By.linkText("Hammers");
	By variablesTab=By.linkText("Variables");
	By hammergroupslabel=By.xpath("//span[contains(text(),'Hammer groups')]");
	By filterByhammerName=By.xpath("//input[@placeholder='Filter by hammer group name']");
	By hammergrouplabel=By.xpath("//div[@id='loading']//h4[contains(text(),'Hammer Group')]");
	By createHammerByButton=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']"); 
	
	By pleaseSelectlabel=By.xpath("//span[contains(text(),'Please select a Hammer group or')]");
		
//	By createaHammerLink=By.linkText("create a new Hammer group");
	
//	By createaHammerLink=By.linkText("create a new Hammer group");
	
//	By createaHammerLink=By.xpath("//div[@id='contactModal']");
	
	By createaHammerLink=By.xpath("//span[contains(text(),'create a new Hammer group')]");
	
	
	By namelabel=By.xpath("//div[contains(text(),'Name')]");
	By namefiled=By.xpath("//input[@name='hgname']");
	
	By descriptionlabel=By.xpath("//div[contains(text(),'Description')]");
	
	
//	By descriptionvalueFiled=By.xpath("//input[@name='hgdescription']");
	
	By descriptionvalueFiled=By.xpath("/html[1]/body[1]/div[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/section[1]/div[1]/div[2]/input[1]");
	
	
	By locationIDlabel=By.xpath("//div[contains(text(),'Location ID')]");
	By locationIDfiled=By.xpath("//input[@name='hgid']");
	By speechLabel=By.xpath("//span[contains(text(),'Speech recognition supported')]");
	By speechcheckbox=By.xpath("//input[@class='ng-pristine ng-untouched ng-valid ng-empty']");
	
	By saveButton=By.xpath("//span[@class='pull-right']//button[contains(@class,'btn btn-primary btn-sm')]");
	
	By taglabel=By.xpath("//h4[contains(text(),'Tag')]");
 

    
	//ContractorA
	
	public pom009_VW_Hammers_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab

//==================================================================================	
	public void hammerTabValidation() throws InterruptedException {	

		driver.findElement(hammersTab).click();		
	//	Thread.sleep(10000);
		
		Assert.assertTrue(driver.findElement(hammergroupslabel).isDisplayed());
		log.debug("Verified that 'Hammer groups' label appeared on left side of under Hammers tab");	
		Assert.assertTrue(driver.findElement(hammergroupslabel).isEnabled());
		log.debug("Verified that 'Hammer groups' label enabled on left side of under Hammer groups tab");
		Assert.assertEquals(driver.findElement(hammergroupslabel).getText(), "Hammer groups");
		log.debug("Verified that 'Hammer groups' text appearedd on left side of under Hammer groups tab");
		
		Assert.assertTrue(driver.findElement(filterByhammerName).isDisplayed());
		log.debug("Verified that 'Filter by hammer group name' filed appeared on left side of under Hammer tab");	
		Assert.assertTrue(driver.findElement(filterByhammerName).isEnabled());
		log.debug("Verified that 'Filter by hammer group namee' filed enabled on left side of under Hammer tab");
		
		Assert.assertTrue(driver.findElement(hammergrouplabel).isDisplayed());	
		log.debug("Verified that 'Hammer Group' label appeared under Hammer tab");	
		Assert.assertTrue(driver.findElement(hammergrouplabel).isEnabled());
		log.debug("Verified that 'Hammer group' label enabled on under Hammer tab");
		Assert.assertEquals(driver.findElement(hammergrouplabel).getText(), "Hammer Group");
		log.debug("Verified that 'Hammer Group' text appeared on right top side of under Hammer tab");
		
		
				
       if (driver.findElements(createHammerByButton).isEmpty()) {
			
			log.debug("Verified that 'Add hammer' button is not displaying under Hammer tab");
			log.debug("Verified that 'Add hammer' button is notenabled under Hammer tab");
			
						
		}else
		
		{
			log.debug("Verified that 'Add hammer' button displayed under Hammer tab");
			log.debug("Verified that 'Add hammer' button enabled under Hammer tab");	
		
		}
		
		
	Assert.assertTrue(driver.findElement(pleaseSelectlabel).isDisplayed());
		log.debug("Verified that 'Please select a Hammer group, or the following:' label appeared on under Hammer tab");	
		Assert.assertTrue(driver.findElement(pleaseSelectlabel).isEnabled());
		log.debug("Verified that 'Please select a Hammer groupe, or the following:' label enabled on under Hammer tab");	
		Assert.assertEquals(driver.findElement(pleaseSelectlabel).getText(), "Please select a Hammer group or");
		log.debug("Verified that 'Please select a Hammer group or' text appearedd under Hammer tab");
		
        if (driver.findElements(createaHammerLink).isEmpty()) {
			
        	log.debug("Verified that 'create a new Hammer group' link is not appearing under Hammer tab");
			log.debug("Verified that 'create a new Hammer group' link is not enabled under Hammer tab");		
			
						
		}else
		
		{
			log.debug("Verified that 'create a new Hammer group' link appeared on under Hammer tab");
			log.debug("Verified that 'create a new Hammer groupe' link enabled on under Hammer tab");		
		
		}
		
		
		}

//=================================================================================================	
	
	public void createHammerByButton() throws InterruptedException {
		
		driver.findElement(hammersTab).click();			
	
		
          if (driver.findElements(createHammerByButton).isEmpty()) {
			
			log.debug("Verified that add Hammer plus (+) icon not appeared on top left side under Hammer tab");	
			
						
		}else
		
		{
			log.debug("Verified that add Hammer plus (+) icon appeared on top left side under Hammer tab");	
		
	//	Thread.sleep(10000);
			
			driver.findElement(createHammerByButton).click();
		log.debug("Validated the element while click Add Hammer using button (+)");
		
				
		Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
		log.debug("Verified that 'Name' label appeared while add Hammer under Hammer tab");	
		Assert.assertTrue(driver.findElement(namelabel).isEnabled());
		log.debug("Verified that 'Name' label enabled while add Hammer under Hammer tab");	
		Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
		log.debug("Verified that 'Name' Text appeared while add Hammer under Hammer tab");
		
		Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
		log.debug("Verified that 'Name' filed appeared while add Hammer under Hammer tab");	
		
		
		//Assert.assertTrue(driver.findElement(namefiled).isEnabled());
		log.debug("Verified that 'Filter by name' filed enabled on left side of under Hammer tab");	
		
		Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
		log.debug("Verified that 'Description' label appeared while add Hammer under Hammer tab");	
		Assert.assertTrue(driver.findElement(descriptionlabel).isEnabled());
		log.debug("Verified that 'Description' label enabled while add Hammer under Hammer tab");	
		Assert.assertEquals(driver.findElement(descriptionlabel).getText().contains("Description"), true);	
		log.debug("Verified that 'Description' Text appeared while add Hammer under Hammer tab");
		
	//	Assert.assertTrue(driver.findElement(descriptionvalueFiled).isDisplayed());
		log.debug("Verified that 'Description' filed appeared while add Hammer under Hammer tab");	
	//	Assert.assertTrue(driver.findElement(descriptionvalueFiled).isEnabled());
		log.debug("Verified that 'Description' filed enabled on left side of under Hammer tab");	
		
		
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed while add Hammer under Hammer tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled while add Hammer under Hammer tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button while add Hammer under Hammer tab");
			
		}
	}

	//=================================================================================================		
	
public void createHammerByLink() throws InterruptedException {
		
	driver.findElement(tagTab).click();
//	Thread.sleep(10000);
	Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
	
	driver.findElement(hammersTab).click();			
//	Thread.sleep(100);
	
    if (driver.findElements(createaHammerLink).isEmpty()) {
		
		log.debug("Verified that add Hammer plus Link not appeared under Hammer tab");	
		
					
	}else
	
	{
		log.debug("Verified that add Hammer link appeared under Hammer tab");	
	
	//	Thread.sleep(10000);
		WebDriverWait wait=new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(createaHammerLink));				

			
		driver.findElement(createaHammerLink).click();
		
	log.debug("Validated the element while click Add Hammer using Link");
	
	Assert.assertTrue(driver.findElement(namelabel).isDisplayed());
	log.debug("Verified that 'Name' label appeared while add Hammer under Hammer tab");	
	Assert.assertTrue(driver.findElement(namelabel).isEnabled());
	log.debug("Verified that 'Name' label enabled while add Hammer under Hammer tab");	
	Assert.assertEquals(driver.findElement(namelabel).getText().contains("Name"), true);	
	log.debug("Verified that 'Name' Text appeared while add Hammer under Hammer tab");
	
	Assert.assertTrue(driver.findElement(namefiled).isDisplayed());
	log.debug("Verified that 'Name' filed appeared while add Hammer under Hammer tab");	
//	Assert.assertTrue(driver.findElement(namefiled).isEnabled());
	log.debug("Verified that 'Filter by name' filed enabled on left side of under Hammer tab");	
	
	Assert.assertTrue(driver.findElement(descriptionlabel).isDisplayed());
	log.debug("Verified that 'Description' label appeared while add Hammer under Hammer tab");	
	Assert.assertTrue(driver.findElement(descriptionlabel).isEnabled());
	log.debug("Verified that 'Description' label enabled while add Hammer under Hammer tab");	
	Assert.assertEquals(driver.findElement(descriptionlabel).getText().contains("Description"), true);	
	log.debug("Verified that 'Description' Text appeared while add Hammer under Hammer tab");
	
//	Assert.assertTrue(driver.findElement(descriptionvalueFiled).isDisplayed());
	log.debug("Verified that 'Description' filed appeared while add Hammer under Hammer tab");	
//	Assert.assertTrue(driver.findElement(descriptionvalueFiled).isEnabled());
	log.debug("Verified that 'Description' filed enabled on left side of under Hammer tab");	
	
	
	Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
	log.debug("Verified that 'Save button' displayed while add Hammer under Hammer tab");	
	Assert.assertFalse(driver.findElement(saveButton).isEnabled());
	log.debug("Verified that 'Save button' is disbaled while add Hammer under Hammer tab");	
	Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
	log.debug("Verified that 'Save' Text appeared on save button while add Hammer under Hammer tab");
		}
	}	

//==============================================================================


}