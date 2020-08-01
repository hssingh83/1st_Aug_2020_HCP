package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import resources.basePropertiesFile;

public class pom012_VW_Dashboard_Tab extends basePropertiesFile {
	private static Logger log =LogManager.getLogger(pom012_VW_Dashboard_Tab.class.getName());

	public WebDriver driver;
	public WebDriverWait wait;
	
	
	public By profileDropdown=By.xpath("//*[@data-toggle='dropdown']");
    public By profileTab=By.xpath("//*[@data-i18n='_profile_']");
    public By profileUserName=By.xpath("//*[@ng-model='user.username']");
  //  By profileUserName=By.xpath("//span[text()='hari_admin1']/parent::span/child::input");
    By profileEmail=By.xpath("//*[@ng-model='user.mail']");
    By firstName=By.xpath("//*[@ng-model='user.givenName']");
    By LastName=By.xpath("//*[@ng-model='user.sn']");
    By permissionLevel=By.xpath("//*[@ng-model='user.servicesRole']");
    public By Logout=By.xpath("//*[@data-i18n='_logout_']");
    By Savebutton=By.xpath("//button[@class='btn btn-primary btn-sm pull-right']");
//    By Clinetdropdown=By.xpath("//select[@class='form-control setWidth_50 ng-pristine ng-valid ng-not-empty ng-valid-required ng-touched']");
    By Clinetdropdown=By.xpath("//*[@class='form-control setWidth_50 ng-pristine ng-untouched ng-valid ng-not-empty ng-valid-required']");
    
    
    		
    		
    		
	//ContractorA
	
	public pom012_VW_Dashboard_Tab(WebDriver driver) {
		this.driver=driver;
	}
	
}
	// Method for Verified Lables under Client Tab

//==================================================================================	
