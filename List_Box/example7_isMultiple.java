package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example7_isMultiple {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Bhagwanta%20Chaure/OneDrive/Documents/HTML_Files/Multi_Select_ListBox.html");
	
	WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
	Select s=new Select(country);
	boolean result = s.isMultiple();
	System.out.println(result);
	if(result==true)
	{
		System.out.println("is multiselectable");
	}
	else
	{
		System.out.println("is single selectable");
	}
}
}
