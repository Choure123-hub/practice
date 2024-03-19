package WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_getAllDataFromTable {
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/web-table-element.php");
	
	int r = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
	System.out.println(r);
	int c = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[3]/td")).size();
	System.out.println(c);
	

	
for(int i=2;i<=r;i++)
{
	for(int j=1;j<=c;j++)
	{
		String data= driver.findElement(By.xpath("//table[@class='dataTable']//tr["+i+"]/td["+j+"]")).getText();
		System.out.print(data+ "    ");
	}
	System.out.println();
}
}
}
