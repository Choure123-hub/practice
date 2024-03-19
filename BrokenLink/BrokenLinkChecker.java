package BrokenLink;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinkChecker {
	public static void main(String[] args) {
        
        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the webpage you want to check for broken links
        driver.get("https://www.facebook.com/");

        // Find all the links on the webpage
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Iterate through each link and check for broken links
        for (WebElement link : links) {
            String url = link.getAttribute("href");
            if (url != null && !url.isEmpty()) {
                verifyLink(url);
            }
        }

        // Close the browser
        driver.quit();
    }

    public static void verifyLink(String linkUrl) {
        try {
            // Create a URL object from the link URL
            URL url = new URL(linkUrl);

            // Open a connection to the URL
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            // Set the request method to HEAD (since we only want to check the status, not download the content)
            httpURLConnection.setRequestMethod("HEAD");

            // Get the response code
            int responseCode = httpURLConnection.getResponseCode();

            // Check if the response code indicates a broken link
            if (responseCode >= 400) {
                System.out.println("Broken Link: " + linkUrl + " | Response Code: " + responseCode);
            } else {
                System.out.println("Valid Link: " + linkUrl + " | Response Code: " + responseCode);
            }

            // Close the connection
            httpURLConnection.disconnect();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
