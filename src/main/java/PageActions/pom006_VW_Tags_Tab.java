package PageActions;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class pom006_VW_Tags_Tab {
	private static Logger log =LogManager.getLogger(pom006_VW_Tags_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;

   
	By tagslabel=By.xpath("//*[@class='panel-heading']");
	By tagfilterBox=By.xpath("//input[@placeholder='Filter by tag name']");
	By tagCreateplusbutton=By.xpath("//span[@class='glyphicon glyphicon-plus-sign']");	
	By taglabel=By.xpath("//h4[contains(text(),'Tag')]");
	By pleaseselecttaglabel=By.xpath("//span[@id='loading']");
	By createNewTagLink=By.xpath("//u[contains(text(),'or create a new tag')]");
	By tagNamelabel=By.xpath("//div[@class='input-group-addon']");	
	By tagNamefield=By.xpath("//*[@id=\"LAB-R\"]/div/div[2]/div[1]/form/section/div/div/input");
	By saveButton=By.xpath("//span[@class='pull-right']//button[contains(@class,'btn btn-primary btn-sm')]");
	By deleteButton=By.xpath("//span[@class='pull-right']//button[@class='btn btn-danger btn-sm']");
	By selectTag=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope testActive']");
	By TagCount=By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']");
	By firstTag=By.xpath("//li[1][@class='nav nav-sidebar tests ng-binding ng-scope']");
	By tagprocess=By.xpath("//*[@ng-click='inProcess']");
	By tagslabelOnOpenTag=By.xpath("//h4[contains(text(),'Tags')]");
	By okbuttonOpenTag=By.xpath("//button[contains(text(),'OK')]");
	By cancelbuttonOpenTag=By.xpath("//div[@id='tagModal']//button[@class='btn btn-default btn-sm'][contains(text(),'Cancel')]");
	
    
	//ContractorA
	
	public pom006_VW_Tags_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
	//=============================================================================================================================
	
	public void tagsValidations() throws InterruptedException {	
		wait=new WebDriverWait(driver,30);	
		pom002_VW_Home_Page hometab=new pom002_VW_Home_Page(driver);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(hometab.tagTab)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(tagslabel));
		Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");	
     //   Assert.assertEquals(driver.findElement(tagslabel).getText().contains("Tags"), true); 
		//	Assert.assertEquals(driver.findElement(tagslabel).getText(),"Tags");
		log.debug("Verified that 'Tags' Text validated on left side under Tag Tab");		
		
		Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
		log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
		Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
		log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
		Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
		log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
				
		Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
		log.debug("Verified that 'Tag' label appeared on under Tags tab");		
		Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
		log.debug("Verified that 'Tag' Text validated under Tag Tab");	
		
		wait.until(ExpectedConditions.elementToBeClickable(pleaseselecttaglabel));
		Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
		log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
		Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
		log.debug("Verified that 'Please select a tag ' Text validated under Test tag");
		
//=========================================================================		
		
		String count=driver.findElement(tagslabel).getText();
			log.debug("Script header contain "+count);
			
						
			String[] part = count.split("(?<=\\D)(?=\\d)");		
			log.debug("spilled value "+part[1]);	
		
									
			int Count=driver.findElements(TagCount).size();
			log.debug("Script Count "+Count);	
			
			String TagActualCount =String.valueOf(Count);	
			log.debug("integer converted as: "+TagActualCount);	
			
			
			
			Assert.assertEquals(part[1], TagActualCount);		
			log.debug("Verified that script count found correct: "+TagActualCount);	
			
			if (Count>0) {
				
			//	driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
				driver.findElement(firstTag).click();
									
				log.debug("firstScriptClicked");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));
				log.info("found progress bar loading");
				wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
				Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
				log.info("Delete button displayed found");
				Assert.assertTrue(driver.findElement(deleteButton).isEnabled());
				log.info("delete button enabled found");
									
				log.info("Tag Filter by name feature is working as desired");
				
			}else {
				
				log.info("No script available");
				}		
			  

		
          if (driver.findElements(tagCreateplusbutton).isEmpty()) {
			
			log.debug("Tag Created button is not avaiable");
						
		}else	{
			log.debug("Verified that new tag creation plus (+) icon appeared on top left side under tags tab");	
			log.debug("Validated the element please set while click Tag Creation using button (+)");
			driver.findElement(tagCreateplusbutton).click();		
			Assert.assertTrue(driver.findElement(tagNamelabel).isDisplayed());
			log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
			Assert.assertEquals(driver.findElement(tagNamelabel).getText(), "Tag Name");		
			log.debug("Verified that 'Tag Name' Text validated on left side under Tag Tab");			
			Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
			log.debug("Verified that 'Save button' displayed under Tag tab");	
			Assert.assertFalse(driver.findElement(saveButton).isEnabled());
			log.debug("Verified that 'Save button' is disbaled under Tag tab");	
			Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
			log.debug("Verified that 'Save' Text appeared on save button under Tag Tab");			
			Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
			log.debug("Verified that 'Delete button' displayed under tags tab");	
			Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
			log.debug("Verified that 'Delete button' is disbaled under tags tab");	
			Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");	
			driver.findElement(hometab.tagTab).click();
		
		}
	
		
		if (driver.findElements(createNewTagLink).isEmpty()) {
			
			log.debug("Tag Created Link is not avaiable");
												
		}else {
			
			log.debug("Verified that new test created link appeared under Tags tab");	    		
		
		
	
		log.debug("Validated the element please set while click Tag Creation using Link");
		wait.until(ExpectedConditions.elementToBeClickable(createNewTagLink)).click();
			
		Assert.assertTrue(driver.findElement(tagNamelabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
		Assert.assertEquals(driver.findElement(tagNamelabel).getText(), "Tag Name");		
		log.debug("Verified that 'Tag Name' Text validated on left side under Tag Tab");	
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Tag tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Tag tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Tag Tab");			
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed under tags tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled under tags tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");	
		
		}
	}

		
		
		
		
		
		
		
	//=================================================================================================================================
	
	
	/*// Method for Verified Lables under Client Tab
	
	public void tagsValidations() throws InterruptedException {	
		wait=new WebDriverWait(driver,30);	
		pom002_VW_Home_Page hometab=new pom002_VW_Home_Page(driver);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(hometab.tagTab)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(tagslabel));
		Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");	
     //   Assert.assertEquals(driver.findElement(tagslabel).getText().contains("Tags"), true); 
		//	Assert.assertEquals(driver.findElement(tagslabel).getText(),"Tags");
		log.debug("Verified that 'Tags' Text validated on left side under Tag Tab");		
		
		Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
		log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
		Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
		log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
		Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
		log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
				
		Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
		log.debug("Verified that 'Tag' label appeared on under Tags tab");		
		Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
		log.debug("Verified that 'Tag' Text validated under Tag Tab");	
		
		wait.until(ExpectedConditions.elementToBeClickable(pleaseselecttaglabel));
		Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
		log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
		Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
		log.debug("Verified that 'Please select a tag ' Text validated under Test tag");
		
//=========================================================================		
		
		String count=driver.findElement(tagslabel).getText();
			log.debug("Script header contain "+count);
			
						
			String[] part = count.split("(?<=\\D)(?=\\d)");		
			log.debug("spilled value "+part[1]);	
		
									
			int Count=driver.findElements(TagCount).size();
			log.debug("Script Count "+Count);	
			
			String TagActualCount =String.valueOf(Count);	
			log.debug("integer converted as: "+TagActualCount);	
			
			
			
			Assert.assertEquals(part[1], TagActualCount);		
			log.debug("Verified that script count found correct: "+TagActualCount);	
			
			if (Count>0) {
				
			//	driver.findElement(By.xpath("//*[@id=\"LAB-R\"]/div[1]/div[1]/div/div[3]/div/div[2]/ul/li[1]")).click();
				driver.findElement(firstTag).click();
									
				log.debug("firstScriptClicked");
				wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));
				log.info("found progress bar loading");
				wait.until(ExpectedConditions.elementToBeClickable(deleteButton));
				Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
				log.info("Delete button displayed found");
				Assert.assertTrue(driver.findElement(deleteButton).isEnabled());
				log.info("delete button enabled found");
									
				log.info("Tag Filter by name feature is working as desired");
				
			}else {
				
				log.info("No script available");
				}		
			
	}

	  
	public void createTagbybuttonValidation() {
		wait=new WebDriverWait(driver,30);	
		
          if (driver.findElements(tagCreateplusbutton).isEmpty()) {
			
			log.debug("Verified that new tag creation plus (+) icon not appeared on top left side under tags tab");	
			wait.until(ExpectedConditions.elementToBeClickable(tagslabel));
			Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
			log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
			Assert.assertEquals(driver.findElement(tagslabel).getText().contains("Tags"),true);			
			log.debug("Verified that 'Tags' Text validated on left side under Tag Tab");		
			
			Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
			log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
			Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
			log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
			Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
			log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
					
			Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
			log.debug("Verified that 'Tag' label appeared on under Tags tab");		
			Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
			log.debug("Verified that 'Tag' Text validated under Tag Tab");	
			
			Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
			log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
			Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
			log.debug("Verified that 'Please select a tag ' Text validated under Test tag");			
			
						
		}else	{
			log.debug("Verified that new tag creation plus (+) icon appeared on top left side under tags tab");	
			log.debug("Validated the element please set while click Tag Creation using button (+)");
			driver.findElement(tagCreateplusbutton).click();		
			Assert.assertTrue(driver.findElement(tagNamelabel).isDisplayed());
			log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
			Assert.assertEquals(driver.findElement(tagNamelabel).getText(), "Tag Name");		
			log.debug("Verified that 'Tag Name' Text validated on left side under Tag Tab");			
			Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
			log.debug("Verified that 'Save button' displayed under Tag tab");	
			Assert.assertFalse(driver.findElement(saveButton).isEnabled());
			log.debug("Verified that 'Save button' is disbaled under Tag tab");	
			Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
			log.debug("Verified that 'Save' Text appeared on save button under Tag Tab");			
			Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
			log.debug("Verified that 'Delete button' displayed under tags tab");	
			Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
			log.debug("Verified that 'Delete button' is disbaled under tags tab");	
			Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
		
		}
	}
		
	public void createNewTagbyLinkValidation() {
		wait=new WebDriverWait(driver,30);	

		if (driver.findElements(createNewTagLink).isEmpty()) {
			
			log.debug("Verified that new tag created link is not appearing under Tags tab");	
			log.debug("Verified that new tag creation plus (+) icon not appeared on top left side under tags tab");	
			wait.until(ExpectedConditions.elementToBeClickable(tagslabel));
			Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
			log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
			Assert.assertEquals(driver.findElement(tagslabel).getText().contains("Tags"),true);			
			log.debug("Verified that 'Tags' Text validated on left side under Tag Tab");		
			
			Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
			log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
			Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
			log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
			Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
			log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
					
			Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
			log.debug("Verified that 'Tag' label appeared on under Tags tab");		
			Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
			log.debug("Verified that 'Tag' Text validated under Tag Tab");	
			
			wait.until(ExpectedConditions.elementToBeClickable(createNewTagLink));
			Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
			log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
			Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
			log.debug("Verified that 'Please select a tag ' Text validated under Test tag");			
												
		}else {
			
			log.debug("Verified that new test created link appeared under Tags tab");	    		
		
		}
	
		log.debug("Validated the element please set while click Tag Creation using button (+)");
		wait.until(ExpectedConditions.elementToBeClickable(tagCreateplusbutton)).click();
			
		Assert.assertTrue(driver.findElement(tagNamelabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");		
		Assert.assertEquals(driver.findElement(tagNamelabel).getText(), "Tag Name");		
		log.debug("Verified that 'Tag Name' Text validated on left side under Tag Tab");	
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'Save button' displayed under Tag tab");	
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'Save button' is disbaled under Tag tab");	
		Assert.assertEquals(driver.findElement(saveButton).getText(), "Save");		
		log.debug("Verified that 'Save' Text appeared on save button under Tag Tab");			
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'Delete button' displayed under tags tab");	
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'Delete button' is disbaled under tags tab");	
		Assert.assertEquals(driver.findElement(deleteButton).getText(), "Delete");		
	
	}	*/
	
	public void CreateTag_using_button() throws InterruptedException {	
		wait=new WebDriverWait(driver,30);	
		pom002_VW_Home_Page hometab=new pom002_VW_Home_Page(driver);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(hometab.tagTab)).click();
		log.debug("Navigate to tag tab");		
		
			
		wait.until(ExpectedConditions.elementToBeClickable(tagslabel));
		Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");	
			
		Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
		log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
		Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
		log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
		Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
		log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
				
		Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
		log.debug("Verified that 'Tag' label appeared on under Tags tab");		
		Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
		log.debug("Verified that 'Tag' Text validated under Tag Tab");	
		
		Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
		log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
		Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
		log.debug("Verified that 'Please select a tag ' Text validated under Test tag");
		
		wait.until(ExpectedConditions.elementToBeClickable(tagCreateplusbutton)).click();
		log.debug("Cliked (+) icon to create tag ");	
		
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button not enabled after clicked tag create button");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button displayed after clicked tag create button");
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button is not enabled after clicked tag create button");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'save' button is displayed after clicked tag create button");		
		
		String TagName=pom000_Reuseable_Script_for_Page.getSaltString();
		driver.findElement(tagNamefield).sendKeys("Tag_"+TagName);
		log.debug("Passing random Tag name: "+TagName);
		
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button not enabled after passing tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button is displayed after passing tag name");
		Assert.assertTrue(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button enabled after passing tag name");
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'save' button displayed after passing tag name");		
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		log.debug("Save button clicked ");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
		log.debug("inprocess loading ");
		Assert.assertTrue(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button enabled after save tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button displayed after save tag name");
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button not enabled after save tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'save' button displayed after save tag name");
		driver.findElement(tagfilterBox).clear();
		driver.findElement(tagfilterBox).sendKeys(TagName);
		log.debug("Search above created tag using filter box");
		driver.findElement(selectTag).click();
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
//		log.debug("inprocess loading ");
		log.debug("Clicked retrived tag");
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
		log.debug("Delete button clicked");
		wait.until(ExpectedConditions.alertIsPresent());
		log.debug("waiting for alerts");
		driver.switchTo().alert().accept();
		log.debug("Alerts accepted");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
		log.debug("inprocess loading ");
	    log.info("Delete above created tag"); 		
	
	}

	public void Delete_Tag() throws InterruptedException {	
		wait=new WebDriverWait(driver,30);	
		
		
		pom002_VW_Home_Page hometab=new pom002_VW_Home_Page(driver);
	
		
		wait.until(ExpectedConditions.elementToBeClickable(hometab.tagTab)).click();
		log.debug("Navigate to tag tab");		
		
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(tagslabel));
		Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");
		
			
		Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
		log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
		Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
		log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
		Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
		log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
				
		Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
		log.debug("Verified that 'Tag' label appeared on under Tags tab");		
		Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
		log.debug("Verified that 'Tag' Text validated under Tag Tab");	
		
		Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
		log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
		Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
		log.debug("Verified that 'Please select a tag ' Text validated under Test tag");
		
		wait.until(ExpectedConditions.elementToBeClickable(createNewTagLink)).click();
		log.debug("Cliked link to create tag ");	
		
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button not enabled after clicked tag create button");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button displayed after clicked tag create button");
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button is not enabled after clicked tag create button");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'save' button is displayed after clicked tag create button");		
		
		String TagName=pom000_Reuseable_Script_for_Page.getSaltString();
		driver.findElement(tagNamefield).sendKeys("Tag_"+TagName);
		log.debug("Passing random Tag name: "+TagName);
		
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button not enabled after passing tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button is displayed after passing tag name");
		Assert.assertTrue(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button enabled after passing tag name");
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'save' button displayed after passing tag name");
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		log.debug("Save button clicked ");	
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
		log.debug("inprocess loading ");
		Assert.assertTrue(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button enabled after save tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button displayed after save tag name");
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button not enabled after save tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'save' button displayed after save tag name");
		driver.findElement(tagfilterBox).clear();
		driver.findElement(tagfilterBox).sendKeys(TagName);
		log.debug("Search above created tag using filter box");
		driver.findElement(selectTag).click();
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
//		log.debug("inprocess loading ");
		log.debug("Clicked retrived tag");
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
		log.debug("Delete button clicked");
		wait.until(ExpectedConditions.alertIsPresent());
		log.debug("waiting for alerts");
		driver.switchTo().alert().accept();
		log.debug("Alerts accepted");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
		log.debug("inprocess loading ");
	    log.info("Delete above created tag"); 		
	
	}
	public void CreateTag_using_Link() throws InterruptedException {	
		wait=new WebDriverWait(driver,30);	
		
		pom002_VW_Home_Page hometab=new pom002_VW_Home_Page(driver);
	
		wait.until(ExpectedConditions.elementToBeClickable(hometab.tagTab)).click();
		log.debug("Navigate to tag tab");		
		
		wait.until(ExpectedConditions.elementToBeClickable(tagslabel));
		Assert.assertTrue(driver.findElement(tagslabel).isDisplayed());
		log.debug("Verified that 'Tags' label appeared on left side under Tag tab");
				
		Assert.assertTrue(driver.findElement(tagfilterBox).isDisplayed());
		log.debug("Verified that 'Filter by tag name' box appeared on n left side under Tag tab");
		Assert.assertTrue(driver.findElement(tagfilterBox).isEnabled());		
		log.debug("Verified that 'Filter by tag name or tag filter'enabled under Tag tab");
		Assert.assertFalse(driver.findElement(tagfilterBox).isSelected());		
		log.debug("Verified that 'Filter by tag name' is blank while access tag tab");
				
		Assert.assertTrue(driver.findElement(taglabel).isDisplayed());
		log.debug("Verified that 'Tag' label appeared on under Tags tab");		
		Assert.assertEquals(driver.findElement(taglabel).getText(), "Tag");		
		log.debug("Verified that 'Tag' Text validated under Tag Tab");	
		
		Assert.assertTrue(driver.findElement(pleaseselecttaglabel).isDisplayed());
		log.debug("Verified that 'Please select a tag' label appeared on under Tag tab");		
		Assert.assertEquals(driver.findElement(pleaseselecttaglabel).getText(), "Please select a tag");		
		log.debug("Verified that 'Please select a tag ' Text validated under Test tag");
		
		wait.until(ExpectedConditions.elementToBeClickable(createNewTagLink)).click();
		log.debug("Cliked link to create tag ");	
		
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button not enabled after clicked tag create button");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button displayed after clicked tag create button");
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button is not enabled after clicked tag create button");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'save' button is displayed after clicked tag create button");		
		
		String TagName=pom000_Reuseable_Script_for_Page.getSaltString();
		driver.findElement(tagNamefield).sendKeys("Tag_"+TagName);
		log.debug("Passing random Tag name: "+TagName);
		
		Assert.assertFalse(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button not enabled after passing tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button is displayed after passing tag name");
		Assert.assertTrue(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button enabled after passing tag name");
		Assert.assertTrue(driver.findElement(saveButton).isDisplayed());
		log.debug("Verified that 'save' button displayed after passing tag name");
		
		wait.until(ExpectedConditions.elementToBeClickable(saveButton)).click();
		log.debug("Save button clicked ");			
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
		log.debug("inprocess loading ");
		Assert.assertTrue(driver.findElement(deleteButton).isEnabled());
		log.debug("Verified that 'delete' button enabled after save tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'delete' button displayed after save tag name");
		Assert.assertFalse(driver.findElement(saveButton).isEnabled());
		log.debug("Verified that 'save' button not enabled after save tag name");
		Assert.assertTrue(driver.findElement(deleteButton).isDisplayed());
		log.debug("Verified that 'save' button displayed after save tag name");
		driver.findElement(tagfilterBox).clear();
		driver.findElement(tagfilterBox).sendKeys(TagName);
		log.debug("Search above created tag using filter box");
		driver.findElement(selectTag).click();
	//	wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
	//	log.debug("inprocess loading ");
		log.debug("Clicked retrived tag");
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
		log.debug("Delete button clicked");
		wait.until(ExpectedConditions.alertIsPresent());
		log.debug("waiting for alerts");
		driver.switchTo().alert().accept();
		log.debug("Alerts accepted");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
		log.debug("inprocess loading ");
	    log.info("Delete above created tag"); 		
	
	}
	
	
	public void Tagdeletion() throws InterruptedException {
		
		pom002_VW_Home_Page home_Page=new pom002_VW_Home_Page(driver);
		wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(home_Page.tagTab)).click();
//		driver.findElement(notifiTab).click();
		log.debug("Tagst Tab clicked");	
//		wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiProgress));
	   wait.until(ExpectedConditions.elementToBeClickable(createNewTagLink));
		
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='nav nav-sidebar tests ng-binding ng-scope']"));
			
		 for (WebElement element : elements) {
		    System.out.println(element.getText()); 
	if (element.getText().contains("Tag_")) {
		
		element.click();

		
		
		wait.until(ExpectedConditions.elementToBeClickable(deleteButton)).click();
		log.debug("Delete button clicked");
		wait.until(ExpectedConditions.alertIsPresent());
		log.debug("waiting for alerts");
		driver.switchTo().alert().accept();
		log.debug("Alerts accepted");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(tagprocess));		
		log.debug("inprocess loading ");
	    log.info("Delete above created tag"); 		
			    
	}
		 }
		    
		 }
		
		 
	
	
	
	
/*	public void Notify_Assign_To_Test() throws InterruptedException  {	
		pom007_VW_Script_Tabs ScriptTab=new pom007_VW_Script_Tabs(driver);
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		pom010_VW_Notification_Tab notifiTab=new pom010_VW_Notification_Tab(driver);
		pom002_VW_Home_Page homePage=new pom002_VW_Home_Page(driver);
		
		wait=new WebDriverWait(driver,30);	
		
		driver.findElement(ScriptTab.scriptsTab).click();
		log.info("Navigate to script Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar1));
		log.info("found progress bar");
	//	Thread.sleep(2000);
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
		wait.until(ExpectedConditions.invisibilityOfElementLocated(ScriptTab.processingBar2));
		Assert.assertTrue(driver.findElement(TestTab.openTag).isEnabled());
		log.info("Verified that openTag button is enabled");
		driver.findElement(TestTab.openTag).click();
		Assert.assertTrue(driver.findElement(tagslabelOnOpenTag).isDisplayed());
		log.info("Verified that Tags label appear in open tag dilog box while assiging tag with test");
		Assert.assertTrue(driver.findElement(okbuttonOpenTag).isDisplayed());
		log.info("Verified that ok button appear in open tag dilog box while assiging tag with test");
		Assert.assertTrue(driver.findElement(okbuttonOpenTag).isEnabled());
		log.info("Verified that ok button enabled in open tag dilog box while assiging tag with test");		
		Assert.assertTrue(driver.findElement(cancelbuttonOpenTag).isDisplayed());
		log.info("Verified that cancel button appear in open tag dilog box while assiging tag with test");
		Assert.assertTrue(driver.findElement(cancelbuttonOpenTag).isEnabled());
		log.info("Verified that cancel button enabled in open tag dilog box while assiging tag with test");
	//	By tagname=By.xpath("//span[text()='"+ScriptName+"']/parent::span/child::input");
		
		
		List<WebElement> elements = driver.findElements(By.xpath("//*[@ng-model='tag.isChecked']"));
		log.info("Ramu1");
		 for (WebElement element : elements) {
			 log.info("Ramu2");
		    System.out.println(element.getText()); 
	if (element.getText().contains("Tag_Hari")) {
		log.info("Ramu3");
		element.click();

	}
		*/
		
		
		
	/*	
		driver.findElement(TestTab.saveButtonTestTab).click();
		log.info("clicked above Save button");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(TestTab.processingBar2));
		log.info("Progressbar after click save button");
	    Assert.assertTrue(driver.findElement(TestTab.viewResult).isEnabled());
	    log.info("Verified that Run button enabled");
	    driver.findElement(notifiTab).click();
		log.debug("Navigate ack to notification Tab");
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
	log.debug("Notfication: "+NotifiName+" Delete Successfully");
	}
	
	}*/
	}
	
	
	