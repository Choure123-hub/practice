package JavascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Without_SendKeys_PassInput {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	 WebElement UN = driver.findElement(By.xpath("//input[@id='email']"));
	
	((JavascriptExecutor)driver).executeScript("arguments[0].value='chourebs@gmail.com'", UN);
	
	WebElement PWd = driver.findElement(By.xpath("//input[@id='pass']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].value='123'", PWd);
	
}
}
