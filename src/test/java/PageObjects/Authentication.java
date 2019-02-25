package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.akanza.NaukaSelenium.Init;


public class Authentication {
	
WebDriver driver;
	
	@FindBy (linkText = "Sign in")
	WebElement signin;
	
	@FindBy (id = "email_create")
	WebElement inputEmail;
	
	@FindBy (id = "SubmitCreate")
	WebElement submitcreate;
	
	@FindBy(id = "email")
	WebElement emailInput;
	
	@FindBy(id = "passwd")
	WebElement passwordInput;
	
	@FindBy (linkText = "Forgot your password?")
	WebElement forgotYourPassword;
	
	@FindBy (id = "SubmitLogin")
	WebElement submitLogin;
	



	public Authentication () {
	     driver = Init.getDriver();
	     PageFactory.initElements(driver, this);

	    }
	
	 
	 public void signin() {
		signin.click();
	 }
	 
	 public void emailcreate(String inputE) {
		    inputEmail.clear();
		    inputEmail.sendKeys(inputE);
		}
	 public void createAnAccountButton() {
		    submitcreate.click();
	 }
	 public void emailInput (String eInput) {
		 emailInput.clear();
		 emailInput.sendKeys(eInput);
	 }
	 public void passwordInput(String pInput) {
		 passwordInput.clear();
		 passwordInput.sendKeys(pInput);
	 }
	 public void forgotYourPassword() {
		 forgotYourPassword.click();
	 }
	 public void submitLogin() {
		 submitLogin.click();
	 }
}
