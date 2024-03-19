package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass4_assertfalse {

	@Test
	public void assertTrue() 
	{
		boolean actResult=false;
		Assert.assertTrue(actResult,"Failed-act Result is false:");
		
	}
}
