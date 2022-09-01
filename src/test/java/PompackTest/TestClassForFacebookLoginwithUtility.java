package PompackTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClassForFacebookLogin;
import PracticeWithUtility.FacebookLogin;
import utility.UtilityClass;

public class TestClassForFacebookLoginwithUtility extends BaseClassForFacebookLogin

{
	FacebookLogin fb;
	@BeforeClass
	public void setfacebookbrowser()
	{	fb=new FacebookLogin(driver);
		BaseClassForFacebookLogin.SetBrowser();
		
	}
	@BeforeMethod
	public void loginfacebook() throws EncryptedDocumentException, IOException, InterruptedException
	{	Thread.sleep(2000);
		fb.id(UtilityClass.data(1, 1));
		fb.pass(UtilityClass.data(1, 2));
		fb.login();
	}
	@Test
	public void test()
	{
		System.out.println("Test started");
	}
	@AfterMethod
	public void screenshot(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
			UtilityClass.captureScreeshot("facebooklogin");
	}
	
	@AfterClass
	public void refresh()
	{
		driver.navigate().refresh();
	}

}
