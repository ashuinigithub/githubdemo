package PracticeWithUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {

	
	@FindBy(xpath="//input[@id='email'] ")
	private WebElement id;
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pass;
	@FindBy(xpath="//button[@id='loginbutton']")
	private WebElement login;
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void id(String fbid)
	{
		id.sendKeys(fbid);
	}
	public void pass(String password)
	{
		pass.sendKeys(password);
	}
	public void login()
	{
		login.click();
	}
}
