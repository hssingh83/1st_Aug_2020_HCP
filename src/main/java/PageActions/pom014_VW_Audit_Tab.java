package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import resources.basePropertiesFile;

public class pom014_VW_Audit_Tab extends basePropertiesFile {
	private static Logger log =LogManager.getLogger(pom014_VW_Audit_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	pom002_VW_Home_Page HomeTab=new pom002_VW_Home_Page(driver);
	
	
	By AuditFilterlabel=By.xpath("//span[contains(text(),'Filter Audit Logs By')]");
	By Auditlogslabel=By.xpath("//div[@class='col-md-7']");
	By AuditCSVButton=By.xpath("//button[@class='btn btn-info btn-sm ng-isolate-scope']");
	By AuditTimeLabel=By.xpath("//span[contains(text(),'Time')]");
	By AuditActionLabel=By.xpath("//th[@class='sortable']//span[contains(text(),'Action')]");
	By AuditUserLabel=By.xpath("//span[contains(text(),'User')]");
	By AuditDetailsLabel=By.xpath("//span[contains(text(),'Details')]");
	By AuditClinetLabel=By.xpath("//label[contains(text(),'Client')]");
	By AuditClinetDropdown=By.xpath("//select[@class='form-control line ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']");
	By AuditFromLabel=By.xpath("//label[contains(text(),'From')]");
	By AuditFromField=By.xpath("//div[@class='panel-body']//div[2]//input[1]");
	By AuditFromTimeField=By.xpath("//div[@class='panel-body']//div[2]//input[2]");
	By AuditTolabel=By.xpath("//label[contains(text(),'To')]");
	By AuditToFiled=By.xpath("//*[@ng-model='edate']");
	By AuditToTime=By.xpath("//*[@ng-model='etime']");
	By AuditActionlabel=By.xpath("//label[contains(text(),'Action (optional)')]");
	By AuditActiondropdown=By.xpath("//select[@class='form-control line ng-pristine ng-untouched ng-valid ng-empty']");
	By AuditSearchButton=By.xpath("//*[@ng-click='search()']");  
	By AuditProgress=By.xpath("//div[@class='progress']//div[1]");
	By AuditDetailIcon=By.xpath("//tr[2]//td[4]//span[1]");
//	By AuditDetailUserName=By.xpath("//li[contains(text(),'User_YD9XG')]");
//	By AuditDetailsEmailName=By.xpath("//li[contains(text(),'hsingh@preempt.com')]");
	By AuditCloseButton=By.xpath("//button[@class='btn btn-default pull-right']");
    
    
    
	//ContractorA
	
	public pom014_VW_Audit_Tab(WebDriver driver) {
		this.driver=driver;
	}
	

	// Method for Verified Lables under Client Tab

//==================================================================================	

		
	public void AuditTabValidation(String TestCaseName) throws InterruptedException {
		
		wait=new WebDriverWait(driver,30);		
		log.info("Validating Audit Tab");
		
		wait.until(ExpectedConditions.elementToBeClickable(HomeTab.auditTab)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(AuditFilterlabel));
			
			log.debug("Verified that User creation plus (+) icon not appeared on top left side under User tab");	
			
			Assert.assertTrue(driver.findElement(AuditFilterlabel).isDisplayed());
			log.debug("Verified that 'Filter Audit Logs By:' label appeared on left side under User tab");			
			Assert.assertEquals(driver.findElement(AuditFilterlabel).getText(),"Filter Audit Logs By");
			log.debug("Verified that 'AuditFilterlabel' Text validated on left side under User Tab");	
			
			Assert.assertTrue(driver.findElement(Auditlogslabel).isDisplayed());
			log.debug("Verified that 'Audit logs' label appeared on Audit tab");			
			Assert.assertEquals(driver.findElement(Auditlogslabel).getText(),"Audit logs");
			log.debug("Verified that 'Audit logs' Text validated on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditTimeLabel).isDisplayed());
			log.debug("Verified that 'Time' label appeared on Audit tab");			
			Assert.assertEquals(driver.findElement(AuditTimeLabel).getText(),"Time");
			log.debug("Verified that 'Time' Text validated on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditActionLabel).isDisplayed());
			log.debug("Verified that 'Audit logs' label appeared on Audit tab");			
			Assert.assertEquals(driver.findElement(AuditActionLabel).getText(),"Action");
			log.debug("Verified that 'Action' Text validated on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditUserLabel).isDisplayed());
			log.debug("Verified that 'User' label appeared on Audit tab");			
	//		Assert.assertEquals(driver.findElement(AuditUserLabel).getText(),"User");
			log.debug("Verified that 'User' Text validated on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditDetailsLabel).isDisplayed());
			log.debug("Verified that 'Details' label appeared on Audit tab");			
			Assert.assertEquals(driver.findElement(AuditDetailsLabel).getText(),"Details");
			log.debug("Verified that 'Details' Text validated on Audit tab");	
			
			Assert.assertFalse(driver.findElement(AuditCSVButton).isEnabled());
			log.debug("Verified that 'Download CSV' button validated on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditFromLabel).isDisplayed());
			log.debug("Verified that 'From' label appeared on Audit tab");			
			Assert.assertEquals(driver.findElement(AuditFromLabel).getText(),"From");
			log.debug("Verified that 'From' Text validated on Audit tab");
			
			Assert.assertTrue(driver.findElement(AuditFromField).isDisplayed());
			log.debug("Verified that 'From Date' field appeared on Audit tab");			
			Assert.assertTrue(driver.findElement(AuditFromField).isEnabled());
			log.debug("Verified that 'From Date' field enabled on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditFromTimeField).isDisplayed());
			log.debug("Verified that 'From Time' field appeared on Audit tab");			
			Assert.assertTrue(driver.findElement(AuditFromTimeField).isEnabled());
			log.debug("Verified that 'From Time' field enabled on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditTolabel).isDisplayed());
			log.debug("Verified that 'To' label appeared on Audit tab");			
			Assert.assertEquals(driver.findElement(AuditTolabel).getText(),"To");
			log.debug("Verified that 'To' Text validated on Audit tab");
			
			Assert.assertTrue(driver.findElement(AuditToFiled).isDisplayed());
			log.debug("Verified that 'To Date' field appeared on Audit tab");			
			Assert.assertTrue(driver.findElement(AuditToFiled).isEnabled());
			log.debug("Verified that 'To Date' field enabled on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditToTime).isDisplayed());
			log.debug("Verified that 'To Time' field appeared on Audit tab");			
			Assert.assertTrue(driver.findElement(AuditToTime).isEnabled());
			log.debug("Verified that 'To Time' field enabled on Audit tab");	
			
			Assert.assertTrue(driver.findElement(AuditActionLabel).isDisplayed());
			log.debug("Verified that 'Action (optional)' label appeared on Audit tab");			
			Assert.assertEquals(driver.findElement(AuditActionLabel).getText(),"Action");
			log.debug("Verified that 'Action' Text validated on Audit tab");
			
		
			Assert.assertTrue(driver.findElement(AuditActiondropdown).isEnabled());
			log.debug("Verified that 'Action' dropdown validated on Audit tab");	
			
			
			Assert.assertTrue(driver.findElement(AuditSearchButton).isDisplayed());
			log.debug("Verified that 'Search' label appeared on button on Audit tab");			
			Assert.assertEquals(driver.findElement(AuditSearchButton).getText(),"Search");
			log.debug("Verified that 'Search' Text validated on button on Audit tab");
			if(TestCaseName.contains("Client")) {
				
				Assert.assertTrue(driver.findElement(AuditSearchButton).isEnabled());
				log.debug("Verified that 'Search' button enabled on Audit tab");					
			} else if (TestCaseName.contains("Partner")) {
				
				Assert.assertFalse(driver.findElement(AuditSearchButton).isEnabled());
				log.debug("Verified that 'Search' button disabled on Audit tab");					
			}
			
		
						
				
	}
	public void AuditSearchFunctinality(String TestCaseName,String UserName,String UserEmail) throws InterruptedException {
		
		wait=new WebDriverWait(driver,100);		
		log.info("Validating Audit Tab");
		
		wait.until(ExpectedConditions.elementToBeClickable(HomeTab.auditTab)).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(AuditFilterlabel));
			
		if (TestCaseName.contains("Client")) {	
		
		driver.findElement(AuditSearchButton).click();
		log.debug("Search Clicked");	
		
		} else if (TestCaseName.contains("Partner"))
			
		{
			Select s1=new Select(driver.findElement(By.xpath("//*[@class='form-control line ng-pristine ng-untouched ng-empty ng-invalid ng-invalid-required']")));
			s1.selectByVisibleText("Automation_Partner");
			driver.findElement(AuditSearchButton).click();
			log.debug("Search Clicked");	
			
		}
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(AuditProgress));
		log.debug("Progress");	
		Assert.assertTrue(driver.findElement(AuditCSVButton).isDisplayed());
		log.debug("CSV button displayed");	
		Assert.assertTrue(driver.findElement(AuditCSVButton).isEnabled());
		log.debug("CSV button enabled");
		
		driver.findElement(AuditDetailIcon).click();
		log.debug("Detail Icon clicked");
	
				
		if (TestCaseName.contains("Client User")) {
			
			By AuditDetailClientUserName=By.xpath("//li[contains(text(),'"+pom013_VW_User_Tab.Client_User+"')]");			
			Assert.assertEquals(driver.findElement(AuditDetailClientUserName).getText(),"user_name: "+pom013_VW_User_Tab.Client_User);
			log.debug("Verified that User: "+pom013_VW_User_Tab.Client_User+ " validated on Audit tab");
		
		}else if (TestCaseName.contains("Client Enhanced")) {
			
			By AuditDetailClientUserName=By.xpath("//li[contains(text(),'"+pom013_VW_User_Tab.Client_Enhanced+"')]");			
			Assert.assertEquals(driver.findElement(AuditDetailClientUserName).getText(),"user_name: "+pom013_VW_User_Tab.Client_Enhanced);
			log.debug("Verified that User: "+pom013_VW_User_Tab.Client_Enhanced+ " validated on Audit tab");
			
	}else if (TestCaseName.contains("Client Developer")) {
			
			By AuditDetailClientUserName=By.xpath("//li[contains(text(),'"+pom013_VW_User_Tab.Client_Develper+"')]");			
			Assert.assertEquals(driver.findElement(AuditDetailClientUserName).getText(),"user_name: "+pom013_VW_User_Tab.Client_Develper);
			log.debug("Verified that User: "+pom013_VW_User_Tab.Client_Develper+ " validated on Audit tab");
			
	}else if (TestCaseName.contains("Client Customer Admin")) {
		
		By AuditDetailClientUserName=By.xpath("//li[contains(text(),'"+pom013_VW_User_Tab.Client_Cust_Admin+"')]");			
		Assert.assertEquals(driver.findElement(AuditDetailClientUserName).getText(),"user_name: "+pom013_VW_User_Tab.Client_Cust_Admin);
		log.debug("Verified that User: "+pom013_VW_User_Tab.Client_Cust_Admin+ " validated on Audit tab");	
		
}else if (TestCaseName.contains("Partner Customer Admin")) {
		
		By AuditDetailClientUserName=By.xpath("//li[contains(text(),'"+pom013_VW_User_Tab.Partner_Cust_Admin+"')]");			
		Assert.assertEquals(driver.findElement(AuditDetailClientUserName).getText(),"user_name: "+pom013_VW_User_Tab.Partner_Cust_Admin);
		log.debug("Verified that User: "+pom013_VW_User_Tab.Partner_Cust_Admin+ " validated on Audit tab");	
			
}else if (TestCaseName.contains("Partner User")) {
	
	By AuditDetailClientUserName=By.xpath("//li[contains(text(),'"+pom013_VW_User_Tab.Partner_User+"')]");			
	Assert.assertEquals(driver.findElement(AuditDetailClientUserName).getText(),"user_name: "+pom013_VW_User_Tab.Partner_User);
	log.debug("Verified that User: "+pom013_VW_User_Tab.Partner_User+ " validated on Audit tab");		
		}
		
		
		
		
		By AuditDetailsEmailName=By.xpath("//li[contains(text(),'"+UserEmail+"')]");
		Assert.assertEquals(driver.findElement(AuditDetailsEmailName).getText(),"user_email: "+UserEmail);
		log.debug("Verified that User: "+UserEmail+ "validated on Audit tab");
	
		wait.until(ExpectedConditions.elementToBeClickable(AuditCloseButton)).click();
		log.debug("Close button clicked");
		
		
						
				
	}
}