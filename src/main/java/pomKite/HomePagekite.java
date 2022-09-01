package pomKite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagekite {

	@FindBy(xpath="//input[@type='text']")
	private WebElement searchstock;
	
	@FindBy(xpath="//span[text()='SHRADHA']")
	private WebElement selectstock;
	
	@FindBy(xpath="//span[@class='icon icon-plus']")
	private WebElement clickonadd;
	
	public HomePagekite(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void searchstock()
	{	
		searchstock.sendKeys("SHRADHA");
		
	}
	public void selectstock(WebDriver driver)
	{
		Actions act=new Actions(driver);
		act.moveToElement(selectstock).click().build().perform();
	}
	public void clickonaddbutton()
	{
		clickonadd.click();
	}
	
}
