package TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example10_parallel1 {
	
	@Test
public void openPolicybazar() throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.policybazaar.com/");
	Thread.sleep(5000);
	driver.close();
}
}
