package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example4_mouseLDoubleClick {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	WebElement Doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
    
	Actions act=new Actions(driver);
//	act.moveToElement(Doubleclick).perform();
//	act.doubleClick().perform();
	
	//act.moveToElement(Doubleclick).doubleClick().build().perform();
     act.doubleClick(Doubleclick).perform();

}
}
