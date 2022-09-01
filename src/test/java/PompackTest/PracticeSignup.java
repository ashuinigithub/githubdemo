package PompackTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeSignup {
	
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Execute before Test");
	}
	@BeforeClass
	public void confugurepath()
	{
		System.out.println("configure webdriver");
	}
	@BeforeMethod
	public void enterurl()
	{
		System.out.println("Enter url on which we want to work");
	}
	@Test
	public void name()
	{
		System.out.println("Ashvini");
	}
	@Test
	public void lastname()
	{
		System.out.println("gopchude");
	}
	@AfterMethod
	public void refresh()
	{
		System.out.println("Refresh the page");
	}
	@AfterClass
	public void changeposition()
	{
		System.out.println("change the position of page");
	}
	@AfterTest
	public void close()
	{
		System.out.println("Close all the tabs");
	}
	

}
