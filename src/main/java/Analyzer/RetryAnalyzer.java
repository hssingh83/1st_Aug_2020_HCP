package Analyzer;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{
	
	int counter=0;
	int retryLimit=1;
	public WebDriver driver;
	
	public boolean retry(ITestResult result) {
		
		if (counter<retryLimit) {
			counter++;
			
				System.out.print("\n Test Case: "+ result.getName() + " is failing somehow Let's retry" + " for " + counter + " more time.\n");
			System.out.print("=========================================================================================\n");
			
	//		System.out.println("\n Retrying Test method : "+result.getName() + " for " + counter +" times. ");
			

			
			
			return true;
		}
		return false;	
		
	}

	
}