package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions 
{
	@Test
	public static void Assert() {

	String acturl="https://www.facebook.com/login/";
	String expecturl="https://www.facebook.com/login";
	//Assert.assertEquals(acturl, expecturl);
	//System.out.println("True");
	//Assert.assertNotEquals(acturl, expecturl);
	//System.out.println("true assert");
	Assert.assertTrue(true);
	System.out.println("passed");
	Assert.assertFalse(false);
	System.out.println("print pass");
		
	}

}
