package GroupingTc;

import org.testng.annotations.Test;

public class Meesho {

	
	@Test(groups="enterid")
	public void id()
	{
		System.out.println("Enter id : @shu1998");
	}
	@Test(groups="enterpassword")
	public void pass()
	{
		System.out.println("Enter pass : Meeshopass");
	}
	@Test(groups="clicklogin")
	public void login()
	{
		System.out.println("Click on login button");
	}
	@Test
	public void next()
	{
		System.out.println("navigate to home page");
	}
}
