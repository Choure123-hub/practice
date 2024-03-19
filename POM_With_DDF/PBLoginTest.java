package POM_With_DDF;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("D:\\LatestApacheLib\\30thJully.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://myaccount.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	PBLoginWithMobNumPage login=new PBLoginWithMobNumPage(driver);
	login.inpPBLoginWithMobNumPageMobNum(sh.getRow(0).getCell(0).getStringCellValue());
	login.ClickPBLoginWithMobNumPageloginWithPwd();
	
	PBLoginWithPwdPage Pwd=new PBLoginWithPwdPage(driver);
	Pwd.inpPBLoginWithPwdPagePwd(sh.getRow(0).getCell(1).getStringCellValue());
	Pwd.ClickPBLoginWithPwdPageloginWithPwd();
	
	PBMyAccPage Myacc=new PBMyAccPage(driver);
	Myacc.ClickPBMyAccPageProfile();
	Myacc.verifyPNPBMyAccPageProfileName(sh.getRow(0).getCell(2).getStringCellValue());
	
	Thread.sleep(5000);
	driver.quit();
	
}
}
