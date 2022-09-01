package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {
	@Test
	public static void softassert()
	{
		SoftAssert soft=new SoftAssert();
		
		String str="Selenium";
		String str1="java";
		String str2="Selenium";
		
		soft.assertEquals(str,str1);
		System.out.println("method get passed");
		
		soft.assertNotEquals(str, str2);
		System.out.println("This method will also passed");
	
		soft.assertAll();
	}

}
