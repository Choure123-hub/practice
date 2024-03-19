package Scroll;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Scroll_UP_Down {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook Lite']"));
	((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",facebook);
	
	
}
}