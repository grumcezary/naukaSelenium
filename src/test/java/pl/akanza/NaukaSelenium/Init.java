package pl.akanza.NaukaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Init {
	
	static WebDriver driver;
	
	public static WebDriver getDriver () {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver2.46/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize(); 
		return driver;
		
	}

	public static void endTest() {
		// TODO Auto-generated method stub
		
	}

	

}
