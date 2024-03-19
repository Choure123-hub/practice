package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass1_assertEquals {

	@Test
	public void assertequals() 
	{
		String actResult="hii";
		String expResult="hello";
		Assert.assertEquals(actResult, expResult,"Failed-both result are differnt:");
	}
}
