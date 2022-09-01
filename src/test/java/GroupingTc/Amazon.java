package GroupingTc;

import org.testng.annotations.Test;

public class Amazon {
	
	@Test(groups="enterid")
	public void id_Amazon()
	{
		System.out.println("Ashu_amazon");
	}
	@Test(invocationCount=2,groups="enterpassword")
	public void pass_Amazon()
	{
		System.out.println("Amazonpass");
	}
	@Test(groups="clicklogin")
	public void click_login()
	{
		System.out.println("click on login button of amazon");
	}
}
