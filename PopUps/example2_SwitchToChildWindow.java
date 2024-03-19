package PopUps;

import java.util.ArrayList;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_SwitchToChildWindow 
{
	
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//click on "new Tab" from main page
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	//get child window 
	
	Set<String> allids = driver.getWindowHandles();
	
	ArrayList<String>al=new ArrayList<String>(allids);
	
	String windowID = al.get(1);
	
	System.out.println(driver.getTitle());
	//switch to child window
	
	driver.switchTo().window(windowID);
	
	//click on the training from clildWindow
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
}
}
