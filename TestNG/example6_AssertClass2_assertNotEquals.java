package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass2_assertNotEquals {

	@Test
	public void assertNotequals() 
	{
		String actResult="hii";
		String expResult="hii";
		Assert.assertNotEquals(actResult, expResult,"failed-both result are same:");
	}
}
