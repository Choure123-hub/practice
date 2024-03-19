package Framework;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_WithoutDDF {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	Thread.sleep(3000);
	//enter mobile number
	driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys("9112997072");
	Thread.sleep(3000);
	//click on signin btn
	driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
	Thread.sleep(3000);
	//enter pwd
	driver.findElement(By.xpath("//input[@id='central-login-password']")).sendKeys("Choure@123");
	Thread.sleep(3000);
	// click On the SignIn btn
	driver.findElement(By.xpath("//span[text()='Sign in']")).click();
	Thread.sleep(3000);
	//Open Myaccount dropdown Option
	WebElement MyAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
	Actions act=new Actions(driver);
	
	act.moveToElement(MyAcc).perform();
	//click on "My profile " option from dropdown
	driver.findElement(By.xpath("//span[text()=' My profile ']")).click();
	//Switch to child window
	Set<String> allIds = driver.getWindowHandles();
	ArrayList<String>al=new ArrayList<String>(allIds);
	driver.switchTo().window(al.get(1));
	
	//get person name
	String actPN= driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	String expPN="Bhagvan";
	if(act.equals(expPN))
	{
		System.out.println("Pass");
	}else
	{
		System.out.println("Fail");
	}
	
	
	
}
}
