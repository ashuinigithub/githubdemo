package GroupingTc;

import org.testng.annotations.Test;

public class Flifcart {
	
	@Test(groups="enterid")
	public void id_Flipcart()
	{
		System.out.println("Ashu_Flif");
	}
	@Test(groups="enterpassword")
	public void pass_Flipcart()
	{
		System.out.println("flifcart_pass");
	}
	@Test(groups="clicklogin")
	public void login_click()
	{
		System.out.println("Click on login button of flipcart");
	}
	@Test
	public void navigate()
	{
		System.out.println("navigate to home page of flipcart");
	}

}
