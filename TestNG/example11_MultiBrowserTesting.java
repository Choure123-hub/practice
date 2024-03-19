package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class example11_MultiBrowserTesting
{
	@Parameters("BrowserName")
	@Test
public void OpenApp(String BrowserName) throws InterruptedException {
	
		WebDriver driver=null;
		if(BrowserName.equals("chrome"))
		{
			 driver=new ChromeDriver();
			
		}
		else if(BrowserName.equals("firefox"))
		{
			 driver=new FirefoxDriver();
		}
		else if (BrowserName.equals("Edge"))
		{
			 driver=new EdgeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.close();
		
}

}
