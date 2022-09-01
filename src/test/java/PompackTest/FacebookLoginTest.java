package PompackTest;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.BaseClassForFacebookLogin;
import pompack.FacebookLogin;

public class FacebookLoginTest extends BaseClassForFacebookLogin

{
	FacebookLogin fl;
	@BeforeClass
	public void setbrowser()
	{
		BaseClassForFacebookLogin.SetBrowser();
		fl=new FacebookLogin(driver);
	}
	@Test
	public void fblogin()
	{
		fl.id();
		fl.pass();
		fl.login();
	}
	@AfterMethod
	public void refresh() throws InterruptedException
	{	Thread.sleep(2000);
		driver.navigate().refresh();
	}
	@AfterClass
	public void close()
	{
		driver.quit();
	}
}
