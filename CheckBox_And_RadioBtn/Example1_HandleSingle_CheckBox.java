package CheckBox_And_RadioBtn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1_HandleSingle_CheckBox {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/radio.html");
	driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
}
}
