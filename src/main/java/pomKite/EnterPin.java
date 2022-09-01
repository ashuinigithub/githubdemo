package pomKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterPin {
	
	@FindBy(xpath="//input[@id='pin']")
	private WebElement kitepin;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement continuebutton;
	
	public EnterPin(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void enterpin()
	{
		kitepin.sendKeys("412103");
	}
	public void clickOnContinue()
	{
		continuebutton.click();
	}

}
	
