package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageActions.pom005_VW_Tests_Tab;
import PageActions.pom007_VW_Script_Tabs;
import resources.basePropertiesFile;


//@Listeners(listeners.class)
public class TC0018_login_With_Exmpirix_Admin_Sanity3 extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0018_login_With_Exmpirix_Admin_Sanity3.class.getName());
	public WebDriverWait wait;
	@BeforeMethod
public void applicationLaunch() throws IOException, InterruptedException {
			
				driver=intializeWebDriver();	
				
				VoiceWatch_login();
							
	}
	
	/*@Test(priority=1)
	public void createScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		      
	    scriptTabs.CreateScript();
		
	
	}*/
	
	@Test(priority=2)
	public void deleteScript_AllData () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
		scriptTabs.DeleteScriptAllData();
		
	}
	
	@Test(priority=3)
	public void deleteScript_only () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.DeleteScriptOnly();
	
	}
	
	@Test(priority=4)
	public void copyScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CopyScript();
	    
	    }
	
	@Test(priority=5)
	public void updateScript () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
	    scriptTabs.UpdateScript();
	
	}
	
	
	@Test(priority=6)
	public void createScript_by_ScriptUpload ()throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.Create_Delete_ScriptByScriptUpload();
	
	}
	
	@Test(priority=7)
	public void deleteScript_by_ScriptUpload () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.deleteScriptUpload();
	
	}
	
	@Test(priority=8)
	public void createScript_by_CSV () throws IOException, InterruptedException {
		
		pom007_VW_Script_Tabs scriptTabs=new pom007_VW_Script_Tabs(driver);
	
		scriptTabs.CreateCSVTransformer();
	
	}
	
	@Test(priority=9)
	public void New_Test_Creation_Validation () throws IOException, InterruptedException {
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.CreateTest_using_button();
	
	}

	@Test(priority=10)
	public void Test_Deletion_Validation () throws IOException, InterruptedException {
		
	//	pom007_VoiceWatch_Script_Tabs san=new pom007_VoiceWatch_Script_Tabs(driver);
	
	 //   san.DeleteTest();
		
	    pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
	    TestTab.DeleteTest();
	
	}
	
	@Test(priority=11)
	public void Test_Update_Validation() throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.UpdateTest();
	}
	
	@Test(priority=12)
	public void Test_Now_Validation () throws IOException, InterruptedException {
		
		pom005_VW_Tests_Tab TestTab=new pom005_VW_Tests_Tab(driver);
		TestTab.Test_Now_Test();
		
	}
	
	
		
	@AfterMethod
	public void applicationClose() {
	
		driver.close();
		log.debug("Application closed successfully");
	
		
        }	
		
    }
    
