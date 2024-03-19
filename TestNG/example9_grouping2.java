package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_grouping2 {

	@Test(groups = "Claims")
	public void TC5() 
	{
	Reporter.log("Running TC5",true);	
	}
	
	@Test(groups = "Claims")
	public void TC6() 
	{
	Reporter.log("Running TC6",true);	
	}
	
	@Test(groups = "MyAccount" )
	public void TC7() 
	{
	Reporter.log("Running TC7",true);	
	}
	
	@Test(groups = "Support")
	public void TC8() 
	{
	Reporter.log("RunningTC8",true);	
	}
}
