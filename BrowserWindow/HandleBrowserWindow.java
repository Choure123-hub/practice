package BrowserWindow;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//1.getWindowHandle
		
		//String windowID = driver.getWindowHandle();
		//System.out.println(windowID);
		
		
		//2.getWindowHandles
		Thread.sleep(30000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Thread.sleep(30000);
		Set<String> windowIDs = driver.getWindowHandles();
		
		//1.method 1st
		ArrayList<String>al=new ArrayList<String>(windowIDs);
		WebDriver parentID = driver.switchTo().window(al.get(0));
		WebDriver childwindowID = driver.switchTo().window(al.get(1));
		
		//2.method 2nd
		/*Iterator<String> it = windowIDs.iterator();
		String parentID = it.next();
		String childwindowID = it.next(); */
		
		System.out.println("parent Window Id :"+parentID);
		System.out.println("Child Window ID : "+childwindowID);
		
		//for each loop
		for(String IDs:windowIDs)
		{
			 String title = driver.switchTo().window(IDs).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM")||title.equals("OrangeHRM HR Software | OrangeHRM"))
			{
				driver.close();
			}
		}
		//driver.close();    //close single browser window
		//driver.quit();     // close close all browser window
	}
}
