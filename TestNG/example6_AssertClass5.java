package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass5 {

	@Test
	public void TC() 
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"Failed-act Result is true:");
		
		String actResult1="hii";
		String expResult1="hello";
		Assert.assertNotEquals(actResult1, expResult1,"failed-both result are same:");
	}
}
