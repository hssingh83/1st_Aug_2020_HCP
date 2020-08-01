package PageActions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.qameta.allure.Step;

/**
 * @author hsingh
 *
 */
public class pom001_VW_logIn_Page {
	private static Logger log =LogManager.getLogger(pom001_VW_logIn_Page.class.getName());

	public WebDriver driver;
	public By userName=By.name("callback_0");
	By passWord=By.name("callback_1");
	By sigButton=By.name("callback_2");
	By additionalCopyRightLink=By.linkText("Additional Copyright Information");
	By additionalCopyRightLabel=By.xpath("//span[@id='additional-copyright-info']");
	By forgetLink=By.linkText("Forgot Password?");
	By remUserName=By.xpath("//*[@id=\"content\"]/div/div[2]/form/fieldset/div[3]/label");
//	By copyRightText=By.xpath("//p[contains(text(),'Copyright � 2000-2015 Empirix Inc.')]");
	By copyRightText=By.xpath("//p[contains(text(),'Copyright � 2000-2018 Empirix Inc.')]");
	By signInToContinueLabel=By.xpath("//strong[contains(text(),'Sign in to continue')]");
	By useNameLabel=By.xpath("//label[contains(text(),'User Name:')]");
	By passWordLabel=By.xpath("//label[contains(text(),'Password:')]");
	By remUserNameCheckbox=By.id("remember");
	By empirixLogo=By.xpath("//*[@id=\"wrapper\"]/div[1]/nav/div[1]/a/img ");
	By additionalCopyInfo=By.linkText("Additional Copyright Information");
	
	
	

	//ContractorA
	
	public pom001_VW_logIn_Page(WebDriver driver) {
		this.driver=driver;
	}
	
	
	// Method for Verified Lables under Client Tab
	
	@Step("Verification of Login Page")
	public void logPageLabelVerification() {	
		
	log.debug("LogIn Page Label verification Started");
	
	Assert.assertTrue(driver.findElement(empirixLogo).isDisplayed());
	log.debug("Verified that 'Empirix Logo Present on login Page");
	Assert.assertTrue(driver.findElement(empirixLogo).isEnabled());
	log.debug("Verified that 'Empirix Logo Enabled on login Page");
	Assert.assertEquals(driver.findElement(signInToContinueLabel).getText(),"Sign in to continue");	
	log.debug("Verified that 'Sign in to continue label' appeared on Login page");
	Assert.assertEquals(driver.findElement(useNameLabel).getText(),"User Name:");	
	log.debug("Verified that 'User Name' label' appeared on Login page");
	Assert.assertEquals(driver.findElement(passWordLabel).getText(),"Password:");	
	log.debug("Verified that 'Password: label' appeared on Login page");
	Assert.assertTrue(driver.findElement(remUserNameCheckbox).isDisplayed());
	log.debug("Verified that 'remUserNameCheckbox' appeared on Login page");
	Assert.assertTrue(driver.findElement(remUserNameCheckbox).isEnabled());
	log.debug("Verified that 'remUserNameCheckbox' is clickable on Login page");
	Assert.assertFalse(driver.findElement(remUserNameCheckbox).isSelected());
	log.debug("Verified that 'remUserNameCheckbox' is not selected on Login page");
	Assert.assertTrue(driver.findElement(sigButton).isDisplayed());
	log.debug("Verified that Sign In button is displayed");
	Assert.assertTrue(driver.findElement(sigButton).isEnabled());
	log.debug("Verified that Save button is enabled");
	Assert.assertEquals(driver.findElement(remUserName).getText(),"Remember my User Name");
	log.debug("Verified that 'Remember my User Name' appeared on login page");
	Assert.assertEquals(driver.getPageSource().contains("Copyright © 2000-2018 Empirix Inc."), true);
	log.debug("Verified that 'Copyright' label is appearing on the page");
	/*Assert.assertEquals("additionalCopyInfo", "Additional Copyright Information");
	log.info("Verified that Additional CopyRight Info present on the page");*/
	Assert.assertTrue(driver.findElement(additionalCopyInfo).isDisplayed());
	log.debug("Verified that Additional CopyRight Info present on the page");
	
	
	
	
	
	
	
	
	// Assert.assertEquals(driver.findElement(AdditionalLable).getText(),"Please select existing client or Create New client");
//		log.info("Verified that Addition lebel is appearing on the page such as 'Please select existing client or Create New client'");
    /*  try
      {
		Assert.assertEquals(driver.findElement(copyRightText).getText(),"Copyright � 2000-2015 Empirix Inc. Additional Copyright Information");
      }
      catch 
      (AssertionError e)
      {
  //  	  System.out.println("I am in error block");
 //   	  throw new AssertionError("expected [Copyright � 1112000-2015 Empirix Inc. Additional Copyright Information] but found [Copyright � 2000-2015 Empirix Inc. Additional Copyright Information]",e);
    	  log.info(e.getMessage());
 //   	  System.out.println(e.getMessage());
       }
	   }
	
	public void additional_copy() throws UnsupportedEncodingException {
		
		log.info("LogIn Page Label verification Started");
		
	//	String reg = "      String reg = \"^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[~#;:?/@&!\"'%*=�.,-])(?=[^\\s]+$).{8,24}$\";";
    //    String corrupt=new String(reg.getBytes("ISO-8859-1"),"UTF-8");
		
		
		Assert.assertEquals(driver.findElement(additionalCopyRightLabel).getText(),"Copyright � 2010-14 ForgeRock AS, all rights reserved.");	*/
	}
	
	
	
	
	@Step("getting UserName....")
	public WebElement getUsername()
	{
		log.debug("Start inserting User Credetials");
		log.debug("UserName inserted Successfully");
		return driver.findElement(userName);
	}
	
	@Step("getting Password....")
	public WebElement getPassword()
	{
		log.debug("Password inserted Successfully");
		return driver.findElement(passWord);
	}
	
	@Step("Click SignIn button....")
	public WebElement getSignButton()
	{
		log.debug("Sigin button Clicked Successfully");
		return driver.findElement(sigButton);
	}
	
	@Step("getting CopyRight Infomation....")
	public WebElement getCopyRightLink()
	{   
		log.debug("Verified that additional copy right link clickable");
		return driver.findElement(additionalCopyRightLink);
		
	}
	
	@Step("getting ForgetLink....")
	public WebElement getForgetLink()
	{
		return driver.findElement(forgetLink);
	}
}
	
	

