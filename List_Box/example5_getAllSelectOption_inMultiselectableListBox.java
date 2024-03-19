package List_Box;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example5_getAllSelectOption_inMultiselectableListBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Bhagwanta%20Chaure/OneDrive/Documents/HTML_Files/Multi_Select_ListBox.html");
	
	WebElement contry = driver.findElement(By.xpath("//select[@id='1234']"));
	Select s=new Select(contry);
	s.selectByIndex(0);
	s.selectByIndex(1);
	s.selectByIndex(2);
	s.selectByIndex(3);
	List<WebElement> allselectedOption = s.getAllSelectedOptions();
	for(WebElement s1:allselectedOption )
	{
		System.out.println(s1.getText());
	}
	
	s.deselectAll();
}
}
