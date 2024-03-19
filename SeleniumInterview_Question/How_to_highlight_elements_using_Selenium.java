package SeleniumInterview_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_to_highlight_elements_using_Selenium {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	/*WebElement uname = driver.findElement(By.id("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	JavascriptExecutor js = (JavascriptExecutor)driver;
	//js.executeScript("arguments[1].setAttribute('style','background : yellow; border:2px solid red;')",uname,pass);
	js.executeScript("yourFunction(arguments[0], arguments[1]).setAttribute('style','background : yellow; border:2px solid red;')", uname, pass);
*/
	 // Find username and password input fields
    WebElement usernameElement = driver.findElement(By.id("email"));
    WebElement passwordElement = driver.findElement(By.id("pass"));

    // Highlight username and password input fields using JavaScript
    highlightElement(driver, usernameElement);
    highlightElement(driver, passwordElement);

    // Close the browser after some time (you can remove this if you want)
    /*try {
        Thread.sleep(5000); // Wait for 5 seconds to see the highlighted elements
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    driver.quit();*/
}

// JavaScript function to highlight an element
public static void highlightElement(WebDriver driver, WebElement element) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].style.border='2px solid red'", element);
}
}

