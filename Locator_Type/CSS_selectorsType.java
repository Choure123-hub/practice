package Locator_Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_selectorsType {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		/* 1] Tag and id
		driver.findElement(By.cssSelector("input#email")).sendKeys("xyz");
		//OR  #id
		driver.findElement(By.cssSelector("#email")).sendKeys("xyz");
		*/
		
		
		// Tag and class
		//driver.findElement(By.cssSelector("input.inputtext")).sendKeys("xyz");
		//driver.findElement(By.cssSelector(".inputtext")).sendKeys("xyz");
		
		// Tag and Attribute
		//driver.findElement(By.cssSelector("[name='email']")).sendKeys("xyz");
		//driver.findElement(By.cssSelector("input[name='email']")).sendKeys("xyz");
		
		//Tag ,class and attribute
		//driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_email]")).sendKeys("xyz");
	   driver.findElement(By.cssSelector("input.inputtext[data-testid=royal_pass]")).sendKeys("xyz");
	
	
	}
}
