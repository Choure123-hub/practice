package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class example4_TestNGAnnotation {
 
	
	@BeforeClass
	public void OpenBrowser() 
	{
		Reporter.log("----------Open browser----------",true);
	}
	@BeforeMethod
	public void loginToApp() 
	{
		Reporter.log("----------Login To App-----------",true);
	}
	
	@Test
	public void verifyProfilename() 
	{
		Reporter.log("VerifyProfileName",true);
	}
	@Test
	public void verifyProfilename1() 
	{
		Reporter.log("VerifyProfileName1",true);
	}
	@AfterMethod
	public void loginOutFromApp() 
	{
		Reporter.log("----------LoginOut From App-------",true);
	}
	@AfterClass
	public void CloseBrowser() 
	{
		Reporter.log("--------Close browser-------",true);
	}
}
