package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example2_exampleOfTestNGTestClass {
	@Test
public void OpenApplication() throws InterruptedException 
{
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://myaccount.policybazaar.com/");
	Thread.sleep(3000);
	driver.close();
	
}
}
