package CheckBox_And_RadioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example4_SelectLast2 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	
	
	
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and @name='webform']"));
	System.out.println(checkboxes.size());
	
	//Select Last 2 Check Boxes
	
	int totalcheckboxes = checkboxes.size();
	for(int i=totalcheckboxes-2;i<totalcheckboxes;i++)
	{
		checkboxes.get(i).click();
	}
	
}
}
