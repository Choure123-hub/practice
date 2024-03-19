package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example6_SoftAssertClass1 {

	@Test
	public void TC() 
	{
		
		SoftAssert soft=new SoftAssert();
		
		boolean actResult=true;
		soft.assertFalse(actResult,"Failed-act Result is true:");
		
		String actResult1="hii";
		String expResult1="hello";
		soft.assertEquals(actResult1, expResult1,"failed-both result are same:");
		soft.assertAll();
	}
}
