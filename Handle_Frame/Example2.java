package Handle_Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		
		//driver.switchTo().frame("iframeResult");           //String Frame Name
		
		//driver.switchTo().frame("iframeResult");   //String Frame Id
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		//1.switch to main frame
		
		//driver.switchTo().parentFrame();
		
	     //2.switch to main frame
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
	}
	}