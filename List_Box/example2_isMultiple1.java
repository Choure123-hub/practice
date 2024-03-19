package List_Box;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class example2_isMultiple1
{
public static void main(String[] args) throws InterruptedException {
	

	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	//click on create new acc link
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	Thread.sleep(2000);
	//step1;
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Thread.sleep(2000);
	//step2:
	
	Select s=new Select(month);
	Thread.sleep(2000);
	
	//Step3:
	boolean result = s.isMultiple();

	

	System.out.println(result);
	if(result == true)
	{
	System.out.println("List Box is -multiselactable");
	}
	else
	{
	System.out.println("List Box is -sinngle selactable");
	}
}
}