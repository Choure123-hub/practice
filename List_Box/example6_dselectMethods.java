package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example6_dselectMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Bhagwanta%20Chaure/OneDrive/Documents/HTML_Files/Multi_Select_ListBox.html");
	
	WebElement contry = driver.findElement(By.xpath("//select[@id='1234']"));
	Select s=new Select(contry);
	s.selectByIndex(0);
	s.selectByIndex(1);
	//s.selectByIndex(2);
	//s.selectByIndex(3);
	
	
	//deslect method
	s.deselectAll();
	s.deselectByIndex(0);
	
}
}
