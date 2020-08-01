package VW_TC;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageActions.pom010_VW_Notification_Tab;
import PageActions.pom012_VW_Dashboard_Tab;

public class Reuseable_Script_for_Test {
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	// Generate Random String
	
	public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 5) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
	
	//Generate Random Number
	
		public static int getNumber() {
			
				  
				    { 
			        // create instance of Random class 
			        Random rand = new Random(); 
			  
			        // Generate random integers in range 0 to 999 
			        int rand_int1 = rand.nextInt(1000); 
			        int rand_int2 = rand.nextInt(1000); 
			  
			        // Print random integers 
			        System.out.println("Random Integers: "+rand_int1); 
			        System.out.println("Random Integers: "+rand_int2); 
			  
			        // Generate Random doubles 
			        double rand_dub1 = rand.nextDouble(); 
			        double rand_dub2 = rand.nextDouble(); 
			  
			        // Print random doubles 
			        System.out.println("Random Doubles: "+rand_dub1); 
			        System.out.println("Random Doubles: "+rand_dub2); 
			        
			        return  rand_int1;
			    } 
		
		
}
		

		public static String Profile_UserName() throws InterruptedException {
			
			pom010_VW_Notification_Tab notifiTab=new pom010_VW_Notification_Tab(driver);
			pom012_VW_Dashboard_Tab dashboard=new pom012_VW_Dashboard_Tab(driver);
			wait=new WebDriverWait(driver,30);	
			wait.until(ExpectedConditions.invisibilityOfElementLocated(notifiTab.notifiProgress));
			wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileDropdown)).click();
	//		log.debug("Profile dropdown clicked");	
			wait.until(ExpectedConditions.elementToBeClickable(dashboard.profileTab)).click();
	//	    log.debug("Profile Tab clicked");	
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(dashboard.profileUserName));	
		    Thread.sleep(6000);		
			String UserName=driver.findElement(dashboard.profileUserName).getAttribute("value");	
			
			return UserName;
			
				  
				  
			    } 
		
}
		
		
		
		

				    	
				    
				    
				    
				    
	