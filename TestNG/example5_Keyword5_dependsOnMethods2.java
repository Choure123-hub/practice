package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword5_dependsOnMethods2 {
	
	@Test()
     public void login1()  
   {
	
		Reporter.log("---Running Loging TC---",true);
    }
	
	@Test()
    public void login2()  
  {
	
		Reporter.log("---Running Loging TC---",true)
   }
	
	@Test(dependsOnMethods = {"login1","login2"})
	public void logOut()  
	{
		
			Reporter.log("---Running LogOut Tc---",true);
	}
}
