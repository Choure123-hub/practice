package CheckBox_And_RadioBtn;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2_HandleAll_CheckBox {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	
	//Select all the CheckBoxes
	
	List<WebElement> checkbtn = driver.findElements(By.xpath("//input[@type='checkbox' and @name='webform']"));
	System.out.println(checkbtn.size());
	
	//Using For Lopp
	
	/*for(int i=0;i<checkbtn.size();i++)
	{
		
		checkbtn.get(i).click();
		
	}*/
	
	//Using For...each Loop
	
	for(WebElement checkboxes:checkbtn)
	{
		checkboxes.click();
		
		
		
	}
	
	
}
}
