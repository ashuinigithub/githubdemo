package BasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassForParallelTesting {
	
	
	public static WebDriver driver;
	public static void parallelurl()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromdriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	}

}
