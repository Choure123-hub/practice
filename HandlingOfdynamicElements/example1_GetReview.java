package HandlingOfdynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_GetReview
{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//driver.findElement(By.xpath("//span[@role='button']")).click();
	//enter mobile name
	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("redmi 12");
	
	// click on search btn
	driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
	
	String text = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]//span)[8]")).getText();
    System.out.println(text);


}
}
