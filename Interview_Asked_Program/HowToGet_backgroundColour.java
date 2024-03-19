package Interview_Asked_Program;

import java.awt.Color;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class HowToGet_backgroundColour
{
	@Test
public void Color() {
	

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://omayo.blogspot.com/");
	
	String expectedColor="#333333";
	
	String rgbaColor = driver.findElement(By.xpath("//div[@id='cssmenu']/ul")).getCssValue("background-color");

	System.out.println(rgbaColor);
	
	org.openqa.selenium.support.Color color = org.openqa.selenium.support.Color.fromString(rgbaColor);

	String Hexactualcolor = color.asHex();
System.out.println(Hexactualcolor);

                   org.testng.Assert.assertEquals(Hexactualcolor, expectedColor);
driver.quit();
}
}
