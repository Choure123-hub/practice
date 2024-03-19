package Page_Object_Module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://myaccount.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	PBLoginWithMobNumPage login=new PBLoginWithMobNumPage(driver);
	login.inpPBLoginWithMobNumPageMobNum();
	login.ClickPBLoginWithMobNumPageloginWithPwd();
	
	PBLoginWithPwdPage Pwd=new PBLoginWithPwdPage(driver);
	Pwd.inpPBLoginWithPwdPagePwd();
	Pwd.ClickPBLoginWithPwdPageloginWithPwd();
	
	PBMyAccPage Myacc=new PBMyAccPage(driver);
	Myacc.ClickPBMyAccPageProfile();
	Myacc.verifyPNPBMyAccPageProfileName();
	
	Thread.sleep(5000);
	driver.quit();
}
}
