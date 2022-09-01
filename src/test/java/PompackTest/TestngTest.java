package PompackTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestngTest {
	
	@BeforeClass
	public void c1()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void m2()
	{
		System.out.println("Before method");
	}
	@Test
	public void tc1()
	{
		System.out.println("Test case 1");
	}
	
	@AfterMethod
	public void m3()
	{
		System.out.println("After method");
	}
	
	@AfterClass
	public void c2()
	{
		System.out.println("After class");
	}
	

}
