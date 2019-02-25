package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pl.akanza.NaukaSelenium.Init;

public class LoggedinUser {
WebDriver driver;
	
	@FindBy (id = "search_query_top")
	WebElement search;
	@FindBy (xpath = "//*[@id=\"header\"]/div[3]/div/div/div[3]/div/a")
	WebElement viewMyShoppingCart;
	@FindBy (linkText = "Categories")
	WebElement categories;
	@FindBy (linkText = "Order history and details")
	WebElement orderHistoryAndDetails;
	@FindBy (linkText = "My credit slips")
	WebElement myCreditSlips;
	@FindBy (linkText = "My addresses")
	WebElement myAddresses;
	@FindBy (linkText = "My personal information")
	WebElement myPersonalInformation;
	@FindBy (linkText = "My wishlists")
	WebElement myWishlists;
	@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li/a")
	WebElement comebackToHomeButton;
	
	public LoggedinUser () {
	     driver = Init.getDriver();
	     PageFactory.initElements(driver, this);
	    }
	public void search () {
		search.click();
	}
	public void viewMyShoppingCart() {
		viewMyShoppingCart.click();
	}
	public void categories() {
		categories.click();
	}
	public void orderHistoryAndDetails() {
		orderHistoryAndDetails.click();
	}
	public void myCreditSlips() {
		myCreditSlips.click();
	}
	public void myAddresses () {
		myAddresses.click();
	}
	public void myPersonalInformation() {
		myPersonalInformation.click();
	}
	public void myWishlists() {
		myWishlists.click();
	}
	public void comebackToHomeButton() {
		comebackToHomeButton.click();
	}

}
