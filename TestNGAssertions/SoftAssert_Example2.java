package TestNGAssertions;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssert_Example2 {
public static void main(String[] args) {
	SoftAssert soft=new SoftAssert();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	soft .assertTrue(driver.getTitle().equals("abc"));
	System.out.println(driver.getTitle());
	driver.findElement(By.id("input-email")).sendKeys("amotooricap1@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("12345");
	driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
	
	
}
}
