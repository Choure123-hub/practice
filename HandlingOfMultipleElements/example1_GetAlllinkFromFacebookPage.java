package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_GetAlllinkFromFacebookPage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	 List<WebElement> Alllink = driver.findElements(By.xpath("//a"));
	
	int size = Alllink.size();
	System.out.println(size);
}
}
