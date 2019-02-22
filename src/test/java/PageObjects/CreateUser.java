package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pl.akanza.NaukaSelenium.Init;


public class CreateUser {
	
WebDriver driver;
	
	@FindBy (linkText = "Sign in")
	WebElement signin;
	
	@FindBy (id = "uniform-id_gender1")
	WebElement radioButtonMr;
	
	@FindBy (xpath = "id_gender2")
	WebElement radiobuttonMrs;
	
	@FindBy (name = "customer_firstname")
	WebElement firstname;
	
	@FindBy (id = "customer_lastname")
	WebElement lastname;
	
	@FindBy (id = "passwd")
	WebElement password;
	
	@FindBy (id = "days")
	WebElement days_Select;
	
	@FindBy (id = "months")
	WebElement months_Select;
	
	@FindBy (id = "years")
	WebElement years_Select;
	
	@FindBy (id = "newsletter")
	WebElement newsletterCheckbox;
	
	@FindBy (id = "optin")
	WebElement specialOffersCheckbox;
	
	@FindBy (id = "firstname")
	WebElement addressFirstName;
	
	@FindBy (id = "lastname")
	WebElement addressLastName;
	
	@FindBy (id = "company")
	WebElement companyName;
	
	@FindBy (id = "address1")
	WebElement address_1;
	
	@FindBy (id = "address2")
	WebElement address_2;
	
	@FindBy (id = "city")
	WebElement city1;
	
	@FindBy (id = "id_state")
	WebElement state;
	
	@FindBy (id = "postcode")
	WebElement postalCode;
	
	@FindBy (id = "id_country")
	WebElement country;
	
	@FindBy (id = "other")
	WebElement additionalInformation;
	
	@FindBy (id = "phone")
	WebElement homePhone;
	
	@FindBy (id = "phone_mobile")
	WebElement mobilePhone;
	
	@FindBy (id = "alias")
	WebElement myAddress;

	@FindBy (id = "submitAccount")
	WebElement submit_Account;
	
	
	
	
	public CreateUser () {
	     driver = Init.getDriver();
	     PageFactory.initElements(driver, this);

	    }
	public void buttonMrClick() {
		radioButtonMr.click();
		
	}
	public void buttonMrsClick() {
		radiobuttonMrs.click();
	}
	
	public void firstNameInput(String inputFirst) {
		 firstname.clear();
		 firstname.sendKeys(inputFirst);
	}
	public void lastNameInput(String inputLast) {
		 lastname.clear();
		 lastname.sendKeys(inputLast);
	}
	public void passwordInput(String inputPassword) {
		 password.clear();
		 password.sendKeys(inputPassword);
	}

	 public void select_days(String day_number){
	     Select daysSelect = new Select(days_Select);
	     daysSelect.selectByVisibleText(day_number);
	  }
	 public void select_months(String month_number){
	     Select monthsSelect = new Select(months_Select);
	     monthsSelect.selectByVisibleText(month_number);
	  }
	 public void select_years(String year_number){
	     Select monthsSelect = new Select(years_Select);
	     monthsSelect.selectByVisibleText(year_number);
	  }
	 public void newsletterClick() {
		 newsletterCheckbox.click();	 
	 }
	 public void specialOffersClick() {
		 specialOffersCheckbox.click();
	 }
	 public void addressFirstNameInput(String addressInputFirst) {
		 addressFirstName.clear();
		 addressFirstName.sendKeys(addressInputFirst);
	}
	public void addressLastNameInput(String addressInputLast) {
		addressLastName.clear();
		addressLastName.sendKeys(addressInputLast);
	}
	public void company_Name (String companyNameInput) {
		companyName.clear();
		companyName.sendKeys(companyNameInput);
	}
	public void address1_Input (String address1_Input1 ) {
		address_1.clear();
		address_1.sendKeys(address1_Input1);
	}
	public void address2_Input (String address2_Input2 ) {
		address_2.clear();
		address_2.sendKeys(address2_Input2);
	}
	public void city_Name (String cityName ) {
		city1.clear();
		city1.sendKeys(cityName);
	}
	public void select_state(String state_number){
	     Select stateSelect = new Select(state);
	     stateSelect.selectByVisibleText(state_number);
	}
	public void postal_Number (String postalNumber ) {
		postalCode.clear();
		postalCode.sendKeys(postalNumber);
	}
	public void select_country(String country_number){
	     Select countrySelect = new Select(state);
	     countrySelect.selectByVisibleText(country_number);
	}
	public void additional (String additional1 ) {
		additionalInformation.clear();
		additionalInformation.sendKeys(additional1);
	}
	public void homeP (String home_P ) {
		homePhone.clear();
		homePhone.sendKeys(home_P);
	}
	public void mobileP (String mobile_P ) {
		mobilePhone.clear();
		mobilePhone.sendKeys(mobile_P);
	}
	public void myAddress2 (String my_Address2 ) {
		myAddress.clear();
		myAddress.sendKeys(my_Address2);
	}
	public void submit_Account1 () {
		submit_Account.click();
		
	}
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
