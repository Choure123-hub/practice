package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example6_Slider {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/slider/");
	
	driver.switchTo().frame(0);
	WebElement slider = driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
         
	
	Actions act=new Actions(driver);
	
	Thread.sleep(3000);
	act.moveToElement(slider).dragAndDropBy(slider, 410, 0).build().perform();
}
}
