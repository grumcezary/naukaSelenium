package pl.akanza.NaukaSelenium;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import PageObjects.CreateUser;
import PageObjects.Registration;
import pl.akanza.NaukaSelenium.Init;




public class registrationTest {
	
	WebDriver driver = null;
	
	@Before
	public void openPage() {
		driver = Init.getDriver();
	}
	@Ignore
	@Test
	public void RegistrationPositive () {
		Registration registration = new Registration();
		System.out.println("Szukam Signin");
		registration.signin();
		Init.sleep(1);
		registration.emailcreate("abcd@wp.pl");	
		registration.createAnAccountButton();
		System.out.println("Koniec testu logOn");
	}
	@Ignore
	@Test
	public void RegistrationNegative () {
		Registration registration = new Registration();
		System.out.println("Szukam Signin");
		registration.signin();
		Init.sleep(1);
		registration.createAnAccountButton();
		System.out.println("Koniec testu logOn");
	}
	@Test
	public void CreateUser1 () {
		Registration registration = new Registration();
		System.out.println("Szukam Signin");
		registration.signin();
		Init.sleep(1);
		registration.emailcreate("user3@wp.pl");	
		registration.createAnAccountButton();
		System.out.println("Koniec testu logOn");
		
		
		CreateUser createUser = new CreateUser();
		System.out.println("Szukam buttona");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		createUser.buttonMrClick();
		//createUser.buttonMrsClick();
		createUser.firstNameInput("Alina");
		createUser.lastNameInput("Kowalska");
		createUser.passwordInput("kowalska1980");
		createUser.select_days("5");
		createUser.select_months("March ");
		createUser.select_years("1980");
		createUser.newsletterClick();
		createUser.specialOffersClick();
		createUser.addressFirstNameInput("Alina");
		createUser.addressLastNameInput("Kowalska");
		createUser.company_Name("Firma OKO");
		createUser.address1_Input("Wolska 15/3");
		createUser.address2_Input("Niemiecka 12/2");
		createUser.city_Name("Lublin");
		createUser.select_state("Colorado");
		createUser.postal_Number("20100");
		createUser.select_country("Polska");
		createUser.additional("Tutaj powinna znaleść się jakaś informacja");
		createUser.homeP("5002343");
		createUser.mobileP("508972091");
		createUser.myAddress2("jakis adres");
		createUser.submit_Account1();
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
	@Ignore
	@Test
	public void assertTrue() {
		driver.findElement(By.linkText("Sign in")).click();
		Assert.assertEquals(driver.getTitle(), "Login - My Store");
		String breadcrumbText = driver.findElement(By.xpath("//*[@id=\"columns\"]/div[1]/span[2]")).getText();
		System.out.println(breadcrumbText);
		driver.findElement(By.id("email_create")).clear();
		driver.findElement(By.id("email_create")).sendKeys("suxewixenn-1786@yopmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Init.sleep(2);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Szukam radiobuttona");
		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]")).click();
		driver.findElement(By.name("customer_firstname")).clear();
		driver.findElement(By.name("customer_firstname")).click();
		driver.findElement(By.name("customer_firstname")).sendKeys("Joe");
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
		driver.findElement(By.id("postcode")).sendKeys("20112");
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
	}
	
	
	
	@After
	public void close () {
		Init.endTest();	
	}
	
	

}



































