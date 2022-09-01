package ParallelTesting;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.BaseClassForParallelTesting;



public class Parallelmethods extends BaseClassForParallelTesting

{
	@BeforeClass
	public void setbrowser() {
		BaseClassForParallelTesting.parallelurl();

	}
	@Test
	public void facebookurl()
	{
		driver.get("https://www.facebook.com/login/");
	}
	@Test
	public void amazonUrl()
	{
		driver.get("https://www.amazon.in/s?k=Girls+short+k&ref=nb_sb_noss_2");
	}
	@Test
	public void google()
	{
		driver.get("https://chrome.google.com/webstore/detail/tidy-gherkin/nobemmencanophcnicjhfhnjiimegjeo?hl=en-GB");
	}

}
