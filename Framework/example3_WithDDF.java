package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example3_WithDDF {
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
	FileInputStream file=new FileInputStream("D:\\LatestApacheLib\\30thJully.xlsx");
	Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://myaccount.policybazaar.com/");
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	//enter mobile number
	String mobNum = sh.getRow(0).getCell(0).getStringCellValue();
	driver.findElement(By.xpath("//input[@id='mobileNo']")).sendKeys(mobNum);
	
	//click on signin btn
	driver.findElement(By.xpath("//span[text()='LOGIN WITH PASSWORD']")).click();
	
	//enter pwd
	String Pwd = sh.getRow(0).getCell(1).getStringCellValue();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Pwd);
	
	// click On the SignIn btn
	driver.findElement(By.xpath("//span[text()='LOGIN']")).click();
	
	driver.findElement(By.xpath("//p[text()='Profile']")).click();
	//get person name
	String actPN= driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
	String expPN=sh.getRow(0).getCell(2).getStringCellValue();
	if(actPN.equals(expPN))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//p[text()='Policies']")).click();
	String text = driver.findElement(By.xpath("//p[text()='Bhagvan']")).getText();
	System.out.println(text);
	driver.navigate().back();
	driver.findElement(By.xpath("//p[text()='Payments']")).click();
	String title = driver.findElement(By.xpath("//p[text()='Seems like you haven’t made any payments yet.']")).getText();
	System.out.println(title);
	driver.getTitle();
}
}
