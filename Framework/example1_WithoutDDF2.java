package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_WithoutDDF2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://myaccount.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//enter mobile number
	driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9637515958");
	
	//click on signin btn
	driver.findElement(By.xpath("//span[text()='LOGIN WITH PASSWORD']")).click();
	
	//enter pwd
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Choure@123");
	
	// click On the SignIn btn
	driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
	
	driver.findElement(By.xpath("//p[text()='Profile']")).click();
	//get person name
	String actPN= driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	String expPN="Bhagvan";
	if(actPN.equals(expPN))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Policies']")).click();
	String text = driver.findElement(By.xpath("//p[text()='Bhagvan']")).getText();
	System.out.println(text);
	driver.navigate().back();
	driver.findElement(By.xpath("//p[text()='Payments']")).click();
	String title = driver.findElement(By.xpath("//p[text()='Seems like you haven’t made any payments yet.']")).getText();
	System.out.println(title);
	driver.getTitle();
}
}
