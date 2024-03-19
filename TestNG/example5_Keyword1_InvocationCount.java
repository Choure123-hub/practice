package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example5_Keyword1_InvocationCount {

	@Test(invocationCount = 5)
	public void TC1() 
	{
	Reporter.log("Running Test case1",true);	
	}
}
