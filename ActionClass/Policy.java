package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Policy {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://myaccount.policybazaar.com/");
		driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys("9112997072");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Sign in with Password']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Choure@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='LOGIN']")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}



}
