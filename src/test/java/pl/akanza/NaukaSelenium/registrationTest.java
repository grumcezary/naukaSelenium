package pl.akanza.NaukaSelenium;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import pl.akanza.NaukaSelenium.Init;

public class registrationTest {
	
	WebDriver driver;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	@Ignore
	@Test
	public void login() {
		driver.findElement(By.linkText("Sign in")).click();
		
		// driver.findElement(By.id("email_create")).clear();
		// driver.findElement(By.id("email_create")).sendKeys("idesolle-1222@yopmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Assert.assertFalse(driver.findElement(By.id("create_account_error"))
	             .getText().contains("Invalid email address."));
	}
	@Test
	public void assertTrue() {
		driver.findElement(By.linkText("Sign in")).click();
		Assert.assertEquals(driver.getTitle(), "Login - My Store");
		driver.findElement(By.id("email_create")).clear();
		driver.findElement(By.id("email_create")).sendKeys("cymmoluloci-6395@yopmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("Joe");
		driver.findElement(By.id("customer_lastname")).sendKeys("Kovalsky");
		driver.findElement(By.id("passwd")).sendKeys("automation9");
		Select selectDays = new Select(driver.findElement(By.id("days")));
		selectDays.selectByValue("31");
		Select selectMonth = new Select(driver.findElement(By.id("months")));
		selectMonth.selectByValue("3");
		Select selectYear = new Select(driver.findElement(By.id("years")));
		selectYear.selectByValue("1990");
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		driver.findElement(By.id("firstname")).sendKeys("Joe");
		driver.findElement(By.id("lastname")).sendKeys("Kovalsky");
		driver.findElement(By.id("company")).sendKeys("FIRMA123");
		driver.findElement(By.id("address1")).sendKeys("Koralowa 12");
		driver.findElement(By.id("address2")).sendKeys("Koralowa 13");
		driver.findElement(By.id("city")).sendKeys("Lublin");
		Select selectCity = new Select(driver.findElement(By.id("id_state")));
		selectCity.selectByValue("50");
		driver.findElement(By.id("postcode")).sendKeys("20-112");
		Select selectCountry = new Select(driver.findElement(By.id("id_country")));
		selectCountry.selectByValue("21");
		driver.findElement(By.id("other")).sendKeys("Lorem ipsum dolor sit amet, consectetur adipiscing elit."
				+ "Pellentesque ornare quis eros eget pharetra.");
		String additionalText = driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[2]/p[11]")).getText();
		System.out.println(additionalText);
		driver.findElement(By.id("phone")).sendKeys("(+48) 500-20-30");
		driver.findElement(By.id("phone_mobile")).sendKeys("600987652");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("cymmoluloci-6395@yopmail.com");
		driver.findElement(By.id("submitAccount")).click();
		
		
		
		
		
		
		//String pobieranyText = driver.findElement(By.linkText("Invalid email address.")).getText();
		//System.out.println(pobieranyText);
		//System.out.println("Wyświetlam pobrany tekst");
		//String breadcrumbText = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]")).getText();
		//System.out.println(breadcrumbText);
	
		
	
		
		
	}
	@After
	public void close () {
		Init.endTest();	
	}
	
	

}

