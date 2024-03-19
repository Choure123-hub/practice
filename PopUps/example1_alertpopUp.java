package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_alertpopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");
	driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	Alert alt = driver.switchTo().alert();
	//get text from alert page
	String text = alt.getText();
	System.out.println(text);
	
	//click on the cancel btn from alert popup
	//alt.dismiss();
	
	//click on Ok btn from alertpopup
	alt.accept();
	Thread.sleep(3000);
	
	alt.accept();
	String u = driver.getCurrentUrl();
	System.out.println(u);
}
}
