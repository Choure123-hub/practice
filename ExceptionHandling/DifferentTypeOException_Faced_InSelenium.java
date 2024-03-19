package ExceptionHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentTypeOException_Faced_InSelenium {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//driver.get("https://omayo.blogspot.com/");
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	
	//NoSuchElementException
	//driver.findElement(By.xpath("//input[@value='Loginxx']")).click();
	
	//NoSuchWindowException
	//driver.switchTo().window("xxz");
	
	//NoSuchFrameException
	//driver.switchTo().frame("abc");
	
	//NoAlertPresentException
	//driver.switchTo().alert();
	
	//InvalidSelectorException
	//driver.findElement(By.xpath("///input[@value='Login']")).click();
	
	//ElementNotInteractableException
	//driver.findElement(By.id("hbutton")).click();
	driver.quit();
	
	//NoSuchSessionException
	//driver.findElement(By.xpath("///input[@value='Login']")).click();
}
}
