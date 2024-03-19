package TestNG;

import java.security.acl.Group;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example9_grouping1 {

	@Test(groups = "Claims")
	public void TC1() 
	{
	Reporter.log("Running TC1",true);	
	}
	
	@Test(groups = "MyAccount")
	public void TC2() 
	{
	Reporter.log("Running TC1",true);	
	}
	
	@Test(groups = "MyAccount" )
	public void TC3() 
	{
	Reporter.log("Running TC3",true);	
	}
	
	@Test(groups = "Support")
	public void TC4() 
	{
	Reporter.log("RunningTC4",true);	
	}
}
