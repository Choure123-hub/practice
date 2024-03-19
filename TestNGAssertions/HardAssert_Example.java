package TestNGAssertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HardAssert_Example {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	Assert.assertTrue(driver.getTitle().equals("abc"));
	System.out.println(driver.getTitle());
	driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	
	
}
}
