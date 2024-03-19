package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PBLoginTest1
{
	int a;
	PBLoginWithMobNumPage login;
	PBLoginWithPwdPage Pwd;
	PBMyAccPage Myacc;
	Sheet sh;
	WebDriver driver;
	@BeforeClass
public void OpenBrowser() throws EncryptedDocumentException, IOException 
{
		FileInputStream file=new FileInputStream("D:\\LatestApacheLib\\30thJully.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF1");
		
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myaccount.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login=new PBLoginWithMobNumPage(driver);
		 Pwd=new PBLoginWithPwdPage(driver);
		 Myacc=new PBMyAccPage(driver);
	     a=10;                    //variable name=information   initialize locally
}
	@BeforeMethod
public void loginToApp() 
{
		login.inpPBLoginWithMobNumPageMobNum(sh.getRow(0).getCell(0).getStringCellValue());
		login.ClickPBLoginWithMobNumPageloginWithPwd();
		Pwd.inpPBLoginWithPwdPagePwd(sh.getRow(0).getCell(1).getStringCellValue());
		Pwd.ClickPBLoginWithPwdPageloginWithPwd();
}
	@Test
public void verifyProfileName() 
{
		 Myacc.ClickPBMyAccPageProfile();
		// Myacc.verifyPNPBMyAccPageProfileName(sh.getRow(0).getCell(2).getStringCellValue());
		String actPN = Myacc.getPNPBMyAccPageProfileName();
		String expPN=sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(actPN, expPN,"Failed both result are diff:  ");
System.out.println(a);
}
	@AfterMethod
public void logOutFromApp() 
{
	
}
	@AfterClass
public void closeBrowser() 
{
	driver.close();
}
}
