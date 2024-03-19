package Scroll;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Scroll_Into_View {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	//down ---->2nd parameter +ve value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
	
	Thread.sleep(3000);
	
	//Up ---->2nd parameter -ve value
	((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-300)");
	
	//Right--->1st +ve value
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(1000,0)");
	
	
	//Left--->1st -ve value
	//((JavascriptExecutor)driver).executeScript("window.scrollBy(-400,0)");
}
}
