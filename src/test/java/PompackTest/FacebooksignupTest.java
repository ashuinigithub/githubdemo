package PompackTest;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import pompack.Facebooksignup;

public class FacebooksignupTest extends BaseClass {
	Facebooksignup fb;

	@BeforeClass
	public void setbrowser() {
		BaseClass.BrowserSetup();
		fb = new Facebooksignup(driver);

	}
	@Test
	public void signup() throws InterruptedException {
		fb.name();
		fb.surname();
		fb.mobile();
		fb.password();
		fb.day();
		fb.month();
		fb.year();
		fb.gender();
		fb.signup();
		Thread.sleep(3000);
	}

	@AfterMethod
	public void refesh() throws InterruptedException {
		Thread.sleep(3000);
	driver.navigate().refresh();
	driver.navigate().back();
	}
	@AfterClass
	public void close()
	{
		//driver.quit();
	}
}

