package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_ {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/Bhagwanta%20Chaure/OneDrive/Documents/HTML_Files/Multi_Select_ListBox.html");
	
	WebElement colour = driver.findElement(By.xpath("//select[@id='1234']"));
	Select s=new Select(colour);
	s.selectByVisibleText("Indi");
}
}
