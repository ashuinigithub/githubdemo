package PompackTest;

import java.io.IOException;


import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import BasePackage.BaseClassForKiteLogin;
import pomKite.EnterPin;
import pomKite.HomePagekite;
import pomKite.LoginKite;
import utility.UtilityClass;

public class KiteLoginTestClass extends BaseClassForKiteLogin
{
	LoginKite lk;
	EnterPin ep;
	HomePagekite hp;
	
	@BeforeClass
	@Parameters("browser")
	
	public void setBrowser(String browser)
	{
		BaseClassForKiteLogin.kite(browser);
		hp=new HomePagekite(driver);
		lk=new LoginKite(driver);
		ep=new EnterPin(driver);
	}
	@BeforeMethod
	public void loginkite() throws InterruptedException
	{	Thread.sleep(3000);
		lk.enterid();
		lk.enterpass();
		lk.clickonlogin();
		ep.enterpin();
		ep.clickOnContinue();
		
	}
	@Test
	public void Homepage() throws InterruptedException
	{
		
		
		hp.searchstock();
		Thread.sleep(2000);
		hp.selectstock(driver);
		hp.clickonaddbutton();
		
	}
	
	
/*	@AfterMethod
	public void screeshot(ITestResult result) throws IOException
	{	if(result.getStatus()==ITestResult.FAILURE)
		UtilityClass.captureScreeshot("kitehomepage");
		//driver.navigate().refresh();
	}
	/*@BeforeClass
	public void close()
	{
		driver.close();
	}*/
	
}
