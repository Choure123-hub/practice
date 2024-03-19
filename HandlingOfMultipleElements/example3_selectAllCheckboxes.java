package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_selectAllCheckboxes {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.get("file:///C:/Users/Bhagwanta%20Chaure/OneDrive/Documents/HTML_Files/Multiple_element_Chekbox.html");
 List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
 
for (WebElement s1:allCheckboxes)
{
s1.click();
Thread.sleep(3000);

}
}
}
