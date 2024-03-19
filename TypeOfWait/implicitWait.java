package TypeOfWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {
public static void main(String[] args) {
	// implicit wait is global wait once is declare then applicable to all element
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://omayo.blogspot.com/");
	driver.findElement(By.className("dropbtn")).click();
	driver.findElement(By.xpath("//a[text()='Facebook']")).click();
	
	
	
}
}
