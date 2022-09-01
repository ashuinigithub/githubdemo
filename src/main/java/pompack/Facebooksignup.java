package pompack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Facebooksignup {
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement name;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement surname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement mobile ;
	
	@FindBy(xpath="//input[@id='password_step_input']")
	private WebElement password ;
	
	@FindBy(xpath="//select[@id='day']")
	private WebElement day;
	
	@FindBy(xpath="//select[@id='month']")
	private WebElement month;
	
	@FindBy(xpath="//select[@id='year']")
	private WebElement year;
	
	@FindBy(xpath="(//input[@name='sex'])[1]")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement signup;
	
	
	public Facebooksignup(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	

	public void name()
	{
		name.sendKeys("Sayali");
		
	}
	
	public void surname()
	{
		surname.sendKeys("Gopchude");
		
	}
	
	public void mobile()
	{
		mobile.sendKeys("8080396533");
		
	}
	public void password()
	{
		password.sendKeys("Ashu@1998");
		
	}
	
	public void day()
	{   
		Select sc=new Select(day);
		sc.selectByVisibleText("26");
		
		
	}
	public void month()
	{
		
		Select sc1=new Select(month);
		sc1.selectByValue("11");
		
	}
	
	public void year()
	{	
		Select sc2=new Select(year);
		sc2.selectByVisibleText("1998");
		
	}
	
	public void gender()
	{	
		gender.click();
		
	}
	
	
	public void signup()
	{
		signup.click();
		
	}
	
	
	


}
