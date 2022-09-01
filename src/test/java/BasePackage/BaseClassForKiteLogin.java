package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClassForKiteLogin {
	
	public static WebDriver driver;
	public static void kite(String browser) {
		
		if(browser.equalsIgnoreCase("ChromeBrowser"))
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromdriver\\chromedriver.exe");
		driver=new ChromeDriver();
	
		}
		
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\admin\\Downloads\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		
	}
}
