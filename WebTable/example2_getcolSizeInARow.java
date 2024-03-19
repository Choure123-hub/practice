package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_getcolSizeInARow {
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	
	List<WebElement> allcolsize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td"));
	
int colsize = allcolsize.size();
	System.out.println(colsize);
	
	//for header
	
	
}
}
