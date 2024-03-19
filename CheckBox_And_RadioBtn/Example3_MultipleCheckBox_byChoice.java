package CheckBox_And_RadioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example3_MultipleCheckBox_byChoice {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	
	
	
	List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and @name='webform']"));
	System.out.println(checkboxes.size());
	
	//Select Multiple Check Boxes By choice
	//
	for(WebElement chbox:checkboxes )
	{
		String chboxname = chbox.getAttribute("value");
		if(chboxname .equals("checkbox1")||chboxname.equals("checkbox3"))
		{
			chbox.click();
		}
	}
	
	
}
}
