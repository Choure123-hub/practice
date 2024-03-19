package TypeOfWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.className("dropbtn")).click();
	 WebElement facebookoption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Facebook']")));
	
	 facebookoption.click();
}
}
