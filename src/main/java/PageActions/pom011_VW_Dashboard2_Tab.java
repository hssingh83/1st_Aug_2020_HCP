package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.basePropertiesFile;

public class pom011_VW_Dashboard2_Tab extends basePropertiesFile {
	private static Logger log =LogManager.getLogger(pom011_VW_Dashboard2_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	
	
  	By TestNowButton=By.xpath("//*[@title='run now']");	
  	By DownloadCSVButton=By.xpath("//*[@class='form-control pull-right btn btn-info']");
  	By TestResultStatus=By.xpath("//*[@class='fail ng-scope']");
 // 	By viewConfigButton=By.xpath("//*[@ng-click='modifyTest()']");
  	
	By viewConfigButton=By.xpath("//button[@class='btn btn-info btn-sm form-control']");
	
	By cbminstance1=By.xpath("//div[@id='cbm_testinstances']//tr[1]//td[3]");
	
	By cbminstance2=By.xpath("//div[@id='cbm_testinstances']//tr[2]//td[3]");
	
	By cbminstance3=By.xpath("//div[@id='cbm_testinstances']//tr[3]//td[3]");
	
	
  	
  	
  	
  	
 

    
	//ContractorA
	
	public pom011_VW_Dashboard2_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
}
	// Method for Verified Lables under Client Tab

//==================================================================================	
		