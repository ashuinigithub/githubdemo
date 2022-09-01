package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLogin {
	
	@FindBy(xpath="//input[@id='email'] ")
	WebElement id;
	@FindBy(xpath="//input[@id='pass']")
	WebElement pass;
	@FindBy(xpath="//button[@id='loginbutton']")
	WebElement login;
	
	public FacebookLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void id()
	{
		id.sendKeys("8080396533");
	}
	public void pass()
	{
		pass.sendKeys("Ashu@1998");
	}
	public void login()
	{
		login.click();
	}
}
