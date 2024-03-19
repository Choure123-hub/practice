package MultipleLoginSametime;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleLoginExample {
	public static void main(String[] args) {
		 // Set the system property for the browser driver
        
        // Create instances of WebDriver for different browsers
        WebDriver chromeDriver = new ChromeDriver();
        WebDriver firefoxDriver = new FirefoxDriver();

        try {
            // First session - Chrome
            chromeDriver.get("https://www.facebook.com/");
            // Perform login with the first set of credentials
            login(chromeDriver, "username1", "password1");

            // Second session - Firefox
            firefoxDriver.get("https://www.facebook.com/");
            // Perform login with the second set of credentials
            login(firefoxDriver, "username2", "password2");

            // Continue with your test scenarios for both sessions

        } finally {
            // Close both WebDriver instances when done
            //chromeDriver.quit();
            //firefoxDriver.quit();
        }
    }

    private static void login(WebDriver driver, String username, String password) {
        // Implement your login logic here using the provided credentials
        // Example: Fill in username and password fields and click the login button
    	// Navigate to the login page
        driver.get("https://www.facebook.com/");

        // Perform login actions
        // ...

        // Enter username
        driver.findElement(By.id("email")).sendKeys(username);

        // Enter password
        driver.findElement(By.id("pass")).sendKeys(password);

        // Click on the login button
        driver.findElement(By.xpath("//button[@name='login']")).click();

        // Add additional logic if needed, such as waiting for login success
        // ...
    }
}
