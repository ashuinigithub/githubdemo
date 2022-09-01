package pomKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginKite {
	
	@FindBy(xpath="//input[@id='userid']")
	private WebElement Userid;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement clicklogin;
	
	public LoginKite(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterid()

	{
		Userid.sendKeys("NT0923");
	}
	public void enterpass()
	{
		password.sendKeys("Amol@1993");
	}
	public void clickonlogin()
	{
		clicklogin.click();
	}
}
