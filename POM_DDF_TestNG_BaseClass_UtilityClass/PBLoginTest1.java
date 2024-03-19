package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest1 extends BaseClass
{
	
	PBLoginWithMobNumPage login;
	PBLoginWithPwdPage Pwd;
	PBMyAccPage Myacc;
	 PBLogOutFromAppPage logout;
	 PBPoliciesPage policiesIcon ;
	int TCID;
	
	@BeforeClass
public void OpenBrowser() throws EncryptedDocumentException, IOException 
{
		
		
	    initializeBrowser();
		login=new PBLoginWithMobNumPage(driver);
		 Pwd=new PBLoginWithPwdPage(driver);
		 Myacc=new PBMyAccPage(driver);
		 logout =new PBLogOutFromAppPage(driver);  
		  policiesIcon = new PBPoliciesPage(driver);
}
	@BeforeMethod
public void loginToApp() throws EncryptedDocumentException, IOException 
{
		login.inpPBLoginWithMobNumPageMobNum(UtilityClass.readDataFromPF("mobNum"));
		login.ClickPBLoginWithMobNumPageloginWithPwd();
		Pwd.inpPBLoginWithPwdPagePwd(UtilityClass.readDataFromPF("pwd"));
		Pwd.ClickPBLoginWithPwdPageloginWithPwd();
}
	@Test(priority = 2)
public void verifyProfileName() throws EncryptedDocumentException, IOException 
{
		TCID=102;
		 Myacc.ClickPBMyAccPageProfile();
		// Myacc.verifyPNPBMyAccPageProfileName(sh.getRow(0).getCell(2).getStringCellValue());
		String actPN = Myacc.getPNPBMyAccPageProfileName();
		String expPN=UtilityClass.getTD(0, 2);
		Assert.assertEquals(actPN, expPN,"Failed both result are diff:  ");

}
	@Test(priority = 1)
	public void verifypoliciesName() 
	{      policiesIcon.clickOnPolicies();
      policiesIcon.Policiesgettitle();     
		
	}
	@AfterMethod
public void logOutFromApp(ITestResult s1) throws IOException 
{
		
		
	if(s1.getStatus()==ITestResult.FAILURE)
	{
		UtilityClass.captureSS(driver, TCID);
	}
	else
	{
		logout.ClicLogOutBtn();
	}
	
}
	@AfterClass
public void closeBrowser() throws InterruptedException 
{
		Thread.sleep(3000);
	driver.close();
}
}
