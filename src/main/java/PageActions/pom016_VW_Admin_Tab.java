package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import resources.basePropertiesFile;

public class pom016_VW_Admin_Tab extends basePropertiesFile {
	private static Logger log =LogManager.getLogger(pom016_VW_Admin_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom002_VW_Home_Page HomeTab=new pom002_VW_Home_Page(driver);
	
	By AdminAllClientsLabel=By.xpath("//strong[contains(text(),'All Clients')]");
	By AdminIntervalcolumnlabel=By.xpath("//th[contains(text(),'Interval')]");
	By AdminPercentFailcolumnlabel=By.xpath("//th[contains(@class,'module-subheader')][contains(text(),'Percentage Failed')]");
	By AdminPercentPasscolumnlabel=By.xpath("//th[contains(@class,'module-subheader')][contains(text(),'Percentage Passed')]");
	By AdminAlertcolumnlabel=By.xpath("//th[@class='module-subheader'][contains(text(),'Alerts')]");
	By AdminNotificolumnlabel=By.xpath("//th[@class='module-subheader'][contains(text(),'Notifications')]");
	By AdminDurationdropdown=By.xpath("//select[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty']");
	By AdminClientDetailLabel=By.xpath("//strong[contains(text(),'Client Details')]");
	By AdminQuery=By.xpath("//input[@placeholder='Filter by client']");
	By AdminClientColumnLabel=By.xpath("//span[@class='cl-header']");
	By AdminTotalTestColumnLabel=By.xpath("//span[contains(text(),'Total Tests')]");
	By AdminEnabledTestColumnLabel=By.xpath("//span[contains(text(),'Enabled Tests')]");
	By AdminPercentFailColumnLabel=By.xpath("//span[contains(text(),'Percentage Failed')]");
	By AdminPercentPassColumnLabel=By.xpath("//span[contains(text(),'Percentage Passed')]");
	By AdminAlertColumnLabel=By.xpath("//span[contains(text(),'Alerts')]");
	By AdminNotifiColumnLabel=By.xpath("//span[contains(text(),'Notifications')]"); 
	By AdminProgressBar=By.xpath("//*[@class='progress-bar progress-bar-striped active']");
    
	//ContractorA
	
	public pom016_VW_Admin_Tab(WebDriver driver) {
		this.driver=driver;
	}
	

	// Method for Verified Lables under Client Tab

//==================================================================================	

public void AdminTabValidation () {
	
	wait=new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.elementToBeClickable(HomeTab.adminsTab)).click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(AdminProgressBar));
	wait.until(ExpectedConditions.presenceOfElementLocated(AdminAllClientsLabel));
	
	Assert.assertTrue(driver.findElement(AdminAllClientsLabel).isDisplayed());
	log.info("Verified that All Clients displayed under Admin Tab ");
	
	Assert.assertTrue(driver.findElement(AdminIntervalcolumnlabel).isDisplayed());
	log.info("Verified that Interval column displayed under Admin Tab ");
	
	Assert.assertTrue(driver.findElement(AdminPercentFailcolumnlabel).isDisplayed());
	log.info("Verified that Percentage Failed column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminPercentPasscolumnlabel).isDisplayed());
	log.info("Verified that Percentage Passed column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminAlertcolumnlabel).isDisplayed());
	log.info("Verified that Alert column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminNotificolumnlabel).isDisplayed());
	log.info("Verified that Notification column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminDurationdropdown).isDisplayed());
	log.info("Verified that duration dropdown displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminDurationdropdown).isEnabled());
	log.info("Verified that duration dropdown enabled under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminClientDetailLabel).isDisplayed());
	log.info("Verified that client details label displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminQuery).isDisplayed());
	log.info("Verified that Admin query displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminQuery).isEnabled());
	log.info("Verified that Admin query enabled under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminClientColumnLabel).isDisplayed());
	log.info("Verified that Admin client column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminTotalTestColumnLabel).isDisplayed());
	log.info("Verified that Total test column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminEnabledTestColumnLabel).isDisplayed());
	log.info("Verified that Enabled Test column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminPercentFailColumnLabel).isDisplayed());
	log.info("Verified that Percent Fail column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminPercentPassColumnLabel).isDisplayed());
	log.info("Verified that Percent Pass column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminAlertColumnLabel).isDisplayed());
	log.info("Verified that Alert column displayed under Admin Tab ");
	Assert.assertTrue(driver.findElement(AdminNotifiColumnLabel).isDisplayed());
	log.info("Verified that Notification column displayed under Admin Tab ");
		
}
  
  
  
  
  
  
  
  
  
	

						
				
	
}