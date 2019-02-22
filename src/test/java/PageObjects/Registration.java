package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.akanza.NaukaSelenium.Init;


public class Registration {
	
WebDriver driver;
	
	@FindBy (linkText = "Sign in")
	WebElement signin;
	
	@FindBy (id = "email_create")
	WebElement inputEmail;
	
	@FindBy (id = "SubmitCreate")
	WebElement submitcreate;
	
	



	public Registration () {
	     driver = Init.getDriver();
	     PageFactory.initElements(driver, this);

	    }
	
	 
	 public void signin() {
		signin.click();
	 }
	 
	 public void emailcreate(String inputE) {
		    inputEmail.clear();
		    inputEmail.sendKeys(inputE);
		    submitcreate.click();
		}


}
