package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example7_Resizable {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://jqueryui.com/resizable/");
	
	driver.switchTo().frame(0);
	WebElement resize = driver.findElement(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
         
	
	Actions act=new Actions(driver);
	
	Thread.sleep(3000);
	act.moveToElement(resize).dragAndDropBy(resize, 100, 100).build().perform();
}
}
