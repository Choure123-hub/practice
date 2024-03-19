package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example6_AssertClass3_assertTrue {

	@Test
	public void assertfalse() 
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"Failed-act Result is True:");
		
	}
}
