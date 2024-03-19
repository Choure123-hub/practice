package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_GetSizeFromFacebookPage2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	List<WebElement> Alll = driver.findElements(By.xpath("//a"));
	
	for(WebElement link:Alll)
	{
		System.out.println(link.getText());
//		String text = link.getText();
//		System.out.println(text)

	}
}
}
