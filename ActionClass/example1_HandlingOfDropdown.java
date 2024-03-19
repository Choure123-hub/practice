package ActionClass;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_HandlingOfDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[@class='_1TOQfO'])[1]")).click();
	Thread.sleep(3000);
	WebElement prof = driver.findElement(By.xpath("//a[text()='Login']"));
	Thread.sleep(3000);
	Actions act=new Actions(driver);
	act.moveToElement(prof).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//div[text()='Flipkart Plus Zone']")).click();
	//click on close btn
//	driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
//	Thread.sleep(3000);
//	//identify the dropDown element
//	WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
//	Thread.sleep(3000);
//	//Create object of action class
//	Actions act=new Actions(driver);
//	act.moveToElement(more).perform();
//	Thread.sleep(3000);
//	//click
//	
//	driver.findElement(By.xpath("//div[text()='Advertise']")).click();
//	
}
}
