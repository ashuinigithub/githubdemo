package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomEx {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement userid;
	
	public PomEx(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterid()
	{
		userid.sendKeys("gopchudeashvini");
	}
}
