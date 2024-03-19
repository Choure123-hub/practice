package PopUps;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_SwitchTo_MainPageFrom_ChildWindow {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://skpatro.github.io/demo/links/");
	
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	//click on "new Tab" from main page
	
	driver.findElement(By.xpath("//input[@name='NewTab']")).click();
	
	//get child window 
	Set<String> allids = driver.getWindowHandles();
	ArrayList<String>al=new ArrayList<String>(allids);
	
	
	//switch to child window
	driver.switchTo().window(al.get(1));
	
	//click on the training from clildWindow
	driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
	
	//swicth childWindow to main page
	driver.switchTo().window(al.get(0));
	
	//click on the "New Window"  from main page
	
	driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
	
}
}
