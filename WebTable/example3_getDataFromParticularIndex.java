package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3_getDataFromParticularIndex {
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	
	 // String text = driver.findElement(By.xpath("//table[@class='dataTable']//tr[3]/td[1]")).getText();
 //System.out.println(text);
	
//	  for header
	// String text2 = driver.findElement(By.xpath("(//table[@class='dataTable']//tr[1])[1]//th[5]")).getText();
	  //System.out.println(text2);
	

	  // for specific row//coloum
	String text3 = driver.findElement(By.xpath("(//table[@class='dataTable']//tr)[4]/td[1]")).getText();
	System.out.println(text3);
}
}
