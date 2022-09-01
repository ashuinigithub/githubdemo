package PompackTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pompack.PomEx;

public class PomExTest {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\Desktop\\chromdriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		PomEx pm=new PomEx(driver);
		
		pm.enterid();
		
	}

}
