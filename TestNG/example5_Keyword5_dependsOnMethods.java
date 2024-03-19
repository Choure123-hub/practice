package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword5_dependsOnMethods {
	
	@Test()
     public void login()  
   {
	
		Reporter.log("---Running Loging TC---",true)
    }
	
	@Test(dependsOnMethods = "login")
	public void logOut()  
	{
		
			Reporter.log("---Running LogOut Tc---",true);
	}
}
