package TypeOfWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait_genricmethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	
	
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.className("dropbtn")).click();
	 By elelocator = By.xpath("//a[text()='Facebook']");
	 waitForElementPresent(driver,elelocator,10).click();
	 
}
public static WebElement waitForElementPresent(WebDriver driver,By locator,int timeout)
{
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeout));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	return driver.findElement(locator);
}
}
