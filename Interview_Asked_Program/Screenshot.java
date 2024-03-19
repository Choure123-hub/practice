package Interview_Asked_Program;

import java.io.File;
import java.io.IOException;


import org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDFileAttachmentAppearanceHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
File dest=new File("C:\\Users\\Bhagwanta Chaure\\Desktop\\Screenshot\\abx1.jpg");

   FileHandler.copy(src, dest);
	
}
}
