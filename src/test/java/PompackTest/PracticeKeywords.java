package PompackTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeKeywords {
	
	@BeforeClass
	public void firststep()
	{
	System.out.println("Configure path");
	}
	@BeforeMethod
	public void secondstep()
	{
		System.out.println("Insert url");
	}
	@Test(dependsOnMethods="Tc6")
	public void Tc1()
	{
		System.out.println("move to login page");
	}
	@Test(invocationTimeOut=2)
	public void Tc2()
	{
		System.out.println("Enter id and pass");
	}
	@Test(priority=1)
	public void Tc3()
	{
		System.out.println("click on login button");
	}
	@Test(enabled=false)
	public void Tc4()
	{
		System.out.println("we'll move to the home page");
	}
	@Test(timeOut=1000)
	public static void Tc5()
	{
		System.out.println("To check time for execution");
	}
	@Test()
	public void Tc6()
	{
		System.out.println("Test case six");
	}
	@AfterMethod
	public void refresh()
	{
		System.out.println("Refresh the page");
	}
	@AfterClass
	public void close() {
		System.out.println("close the webpage");
	}

}
