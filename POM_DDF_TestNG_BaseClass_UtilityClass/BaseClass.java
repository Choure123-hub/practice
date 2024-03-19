package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass
{
    
	WebDriver driver;
	public void initializeBrowser() throws IOException 
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityClass.readDataFromPF("url"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
}
