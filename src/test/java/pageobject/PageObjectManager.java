package pageobject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

public ALandingPage landingPage;
public OfferPage offerPage;
public CheckoutPage checkoutPage;
public WebDriver driver;
public PageObjectManager(WebDriver driver) {
	
	this.driver = driver;
}
public ALandingPage getLandingPage() {
	 landingPage= new ALandingPage(driver);
	return landingPage;
} 
public OfferPage getOfferPage() {
	offerPage=new OfferPage(driver);
	return offerPage;
}
public CheckoutPage getCheckoutPage() {
	checkoutPage=new CheckoutPage(driver);
	return checkoutPage;
}
}
