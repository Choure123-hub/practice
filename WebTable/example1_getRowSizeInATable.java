package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_getRowSizeInATable {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	
	
	
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	int rowsize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	System.out.println(rowsize);
//	List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
//	int rowsize = allRows.size();
//	System.out.println(rowsize);
	
	
	
}
}
