package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_EmailableReport {

	@Test
	public void TC1()    //Test case/Test method
	{
		Reporter.log("running test case1",true);  //className.methodname("message",True)
	}
	@Test
	public void TC2()    //Test case/Test method
	{
		Reporter.log("running test case2",true);
	}
	@Test
	public void TC3()    //Test case/Test method
	{
		Reporter.log("running test case3",true);
	}
}
