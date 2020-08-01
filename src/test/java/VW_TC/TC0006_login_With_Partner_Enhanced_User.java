package VW_TC;

import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageActions.pom002_VW_Home_Page;
import PageActions.pom003_VW_Dashboard1_Tab;
import PageActions.pom004_VW_Alerts_Tab;
import PageActions.pom005_VW_Tests_Tab;
import PageActions.pom006_VW_Tags_Tab;
import PageActions.pom007_VW_Script_Tabs;
import PageActions.pom008_VW_Variable_Tab;
import PageActions.pom010_VW_Notification_Tab;
import PageActions.pom013_VW_User_Tab;
import PageActions.pom015_VW_Client_Tab;
import PageActions.pom016_VW_Admin_Tab;
import resources.basePropertiesFile;

public class TC0006_login_With_Partner_Enhanced_User extends basePropertiesFile{
	
	private static Logger log =LogManager.getLogger(TC0006_login_With_Partner_Enhanced_User.class.getName());
	
	@BeforeTest
	
	public void applicationLaunch() throws IOException, InterruptedException {		
		
		driver=intializeWebDriver();						
	  	VoiceWatch_login();	

	}


	@Test(priority=0)
	public void Create_User () throws IOException, InterruptedException {
	
	pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);
	user_Tab.Clientselection("Partner");
	user_Tab.CreateUser("Partner Enhanced","Enhanced User","hsingh@preempt.com");
	user_Tab.logoutUSER();
	user_Tab.loginUser("Partner Enhanced");	
	
	}

	@Test()
	public void gather_information () throws IOException, InterruptedException {
		
		pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
		notify.Capture_Mandatory_details("Pt");
	}

	@Test(priority=1)
public void TabValidation () throws IOException, InterruptedException {
	
	pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
	//   d.Tab_Validation();
	d.Modified2Tab_Validation();
}

@Test(priority=2)
public void headerMandatoryDetails () throws IOException, InterruptedException {

pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
d.header();

}

@Test(priority=3)
public void footerMandatoryDetails () throws IOException, InterruptedException {

pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
d.footer();

}

@Test(priority=4)
public void dashBoardTabValidation () throws IOException, InterruptedException {

pom003_VW_Dashboard1_Tab db=new pom003_VW_Dashboard1_Tab(driver);
pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	

db.OverallPerfomance_section_dashboard();
db.Tests_section_dashboard();
d.header();
d.footer();
}

@Test(priority=5)
public void alertTabValidation () throws IOException, InterruptedException {

pom004_VW_Alerts_Tab at=new pom004_VW_Alerts_Tab (driver);
pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	
at.alertsValidations();		
d.header();
d.footer();

}

/*@Test()
public void gather_information () throws IOException, InterruptedException {

pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);
notify.Capture_Mandatory_details("Partner");
}*/

@Test(priority=7)
public void testTabValidation () throws IOException, InterruptedException {

pom005_VW_Tests_Tab ts=new pom005_VW_Tests_Tab(driver);
pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	

ts.TestsTabValidation();
d.header();
d.footer();

}

@Test(priority=8)
public void tagTabValidation () throws IOException, InterruptedException {

pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);
pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	

tg.tagsValidations();
d.header();
d.footer();

}

@Test(priority=9)
public void CreateTag_By_button () throws IOException, InterruptedException {

pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);

tg.CreateTag_using_button();

}

@Test(priority=10)
public void CreateTag_By_Link () throws IOException, InterruptedException {

pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);


tg.CreateTag_using_Link();

}

@Test(priority=11)
public void Delete_Tag_feature () throws IOException, InterruptedException {

pom006_VW_Tags_Tab tg=new pom006_VW_Tags_Tab(driver);

tg.Delete_Tag();

}


@Test(priority=12)
public void scriptTabValidation () throws Exception {


pom007_VW_Script_Tabs sc=new pom007_VW_Script_Tabs(driver);
pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);	

sc.ScriptTabValidation();

d.header();
d.footer();


}

@Test(priority=13)
public void variableTabValidation () throws Exception {



pom008_VW_Variable_Tab vr=new pom008_VW_Variable_Tab(driver);
pom002_VW_Home_Page d=new pom002_VW_Home_Page(driver);

vr.VariableTabValidation();
d.header();
d.footer();


}

@Test(priority=14)
public void NotificationTabValidation () throws Exception {
pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
notifi.NotificationTabValidation();

}

/*@Test(priority=15,dependsOnMethods= {"gather_information"})
public void Create_Notification_Using_Email_with_Default_Template() throws IOException, InterruptedException {

pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);

notifi.Create_Notifi_using_Email_with_Def_Template();	      
}


@Test(priority=16,dependsOnMethods= {"gather_information"})
public void Create_Notification_using_User_with_Defaut_Template() throws IOException, InterruptedException {

pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);



notifi.Create_Notifi_using_User_with_Def_Template();	      
}


@Test(priority=17,dependsOnMethods= {"gather_information"})
public void Edit_Notification_using_Email_with_Default_Template() throws IOException, InterruptedException {

pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);

notifi.Edit_Notifi_using_Email_with_Def_Template(); 

}


@Test(priority=18,dependsOnMethods= {"gather_information"})
public void Delete_Notifi_using_Email_with_Default_Template() throws IOException, InterruptedException {

pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);

notifi.Delete_Notifi_using_Email_with_Def_Template(); 

}

@Test(priority=19,dependsOnMethods= {"gather_information"})
public void Create_Notifiion_using_Email_with_New_Template() throws IOException, InterruptedException {

pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
notifi.Create_Notifi_using_Email_with_New_Template();

}

@Test(priority=20,dependsOnMethods= {"gather_information"})
public void Create_Notifion_with_New_Template_using_SaveAs_button() throws IOException, InterruptedException {

pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
notifi.Create_Notifi_with_New_Template_using_SaveAs_button();

}

//@Test(priority=32,dependsOnMethods= {"gather_information"})
//public void Delete_new_template_under_Notification() throws IOException, InterruptedException {

//pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);
//notifi.Delete_Email_Template(); 

//}		


@Test(priority=21,dependsOnMethods= {"gather_information"})
public void Notification_Mail_Validation() throws IOException, InterruptedException {

pom010_VW_Notification_Tab notifi=new pom010_VW_Notification_Tab(driver);

notifi.Notifi_Mail_button_Validation();

}	*/


@Test(priority=21)
public void User_TabValidation () throws IOException, InterruptedException {
	
	pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver); 
	user_Tab.UserTabValidation("Pt");

}	

@Test(priority=22)
public void ClientsTabValidation () throws Exception {
	pom015_VW_Client_Tab client =new pom015_VW_Client_Tab(driver);
	
	client.ClientsTabValidation("Partner");
	

}

@Test(priority=23)
public void AdminTabValidation () throws Exception {
	
	pom016_VW_Admin_Tab admin=new pom016_VW_Admin_Tab(driver);
	
	admin.AdminTabValidation();
	
	

}	


@Test(priority=24)
public void LoginAsAdmin () throws IOException, InterruptedException {

driver.close();
driver=intializeWebDriver();						
VoiceWatch_login();

}	



@Test(priority=50)
public void Cleaning_User_TestData_As_Client_Enhanced_User () throws IOException, InterruptedException {

pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);

user_Tab.DeleteUser("Partner Enhanced");

}	


@Test(priority=52)
public void Cleaning_Tag_TestData_As_Client_Enhanced_User () throws IOException, InterruptedException {

pom006_VW_Tags_Tab tags_Tab=new pom006_VW_Tags_Tab(driver);
tags_Tab.Tagdeletion();

}	


/*@Test(priority=55)
public void Cleaning_Notify_TestData_As_Client_Enhanced_User () throws IOException, InterruptedException {

pom010_VW_Notification_Tab notify=new pom010_VW_Notification_Tab(driver);		

notify.Notifydeletion();

}	*/

@Test(priority=56)
public void Cleaning_UserAll_TestData_As_Client_Enhanced_User () throws IOException, InterruptedException {

pom013_VW_User_Tab user_Tab=new pom013_VW_User_Tab(driver);

user_Tab.DeleteRemainingUser();

}	


@AfterTest
public void applicationClose() {

driver.close();
log.info("Application closed successfully");

}
}		