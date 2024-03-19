package Locator_Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_xpathByContainsWithText {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
	
}
}
