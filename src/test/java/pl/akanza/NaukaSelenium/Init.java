package pl.akanza.NaukaSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Init {
	
	static WebDriver driver ;
	
	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "c:/chromedriver2.46/chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		System.out.println("### decyduję czy wykonać new ChromeDriver");
		
		if (driver == null) {
			System.out.println("##TAK##");
			driver = new ChromeDriver();
			System.out.println("get http...");
			driver.get("http://automationpractice.com/");
			driver.manage().window().maximize();
			return driver;
		} else {
			System.out.println("##NIE##");
			return driver;
		}
}
		

	public static void endTest() {
		System.out.println("wewnątrz endTest");
		driver.quit();
		driver = null;
		System.out.println("po endTest");
		
	}

	public static void sleep(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
