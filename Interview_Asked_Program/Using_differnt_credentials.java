package Interview_Asked_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_differnt_credentials {
public static void main(String[] args) {
	
	
	WebDriver driver=new ChromeDriver();
	String arr[][]= { {"user1@test.com","user2@test.com"} , {"Test@123","Test@123"} };
	for(int i=0; i<arr.length-1 ; i++){

		for(int j=0;j<arr.length;j++) { 

		//Find Login button     
			driver.get("https://www.facebook.com/");
			
		

		driver.findElement(By.xpath("")).sendKeys(arr[i][j]);

		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(arr[i+1][j]);

		//Click on Submit button
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();

		//Add your code
		//Log out
		driver.findElement(By.xpath("xpath")).click();           
		        }    
		    }
}
}
