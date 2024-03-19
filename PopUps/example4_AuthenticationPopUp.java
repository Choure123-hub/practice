package PopUps;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example4_AuthenticationPopUp {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//driver.get("https://the-internet.herokuapp.com/basic_auth");
	//https://username:password@url----->to handle popup formula
	//https://admin:admin@the-internet.herokuapp.com/basic_auth
	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	String text = driver.findElement(By.xpath("//p")).getText();
	System.out.println(text);
}
}
