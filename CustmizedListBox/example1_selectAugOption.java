package CustmizedListBox;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1_selectAugOption {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	// step click on the New Account Link
	
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	 
			//Step.2 Create an object of the Action Class and Pass Input Web
			Actions act = new Actions(driver);
			//Step.3 Use Action class method .click to click on element
			act.click(month).perform();
			
			Thread.sleep(3000);
			
			//Step.4 To Move one Option upward
//			act.sendKeys(Keys.ARROW_UP).perform();
//			Thread.sleep(3000);
//			
//			//Step.5 To Move One Option Downward
//			act.sendKeys(Keys.END).perform();
//			act.sendKeys(Keys.ENTER).perform();
			act.sendKeys(Keys.HOME).perform();
			Thread.sleep(3000);
			
			for(int i=1;i<=7;i++)
			{
				act.sendKeys(Keys.ARROW_DOWN).perform();
			}
			Thread.sleep(3000);
			act.sendKeys(Keys.ENTER).perform();
			
}
}
