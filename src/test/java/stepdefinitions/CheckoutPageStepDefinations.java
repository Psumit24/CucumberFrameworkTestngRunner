package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobject.CheckoutPage;
import utility.TestContextSetup;

public class CheckoutPageStepDefinations {
	public TestContextSetup testContextSetup;
	public CheckoutPage checkoutPage;
	public CheckoutPageStepDefinations(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.checkoutPage=testContextSetup.pageObjectManager.getCheckoutPage();
	}

	
	@When("Added items of Checkout and validate the items in checkout page")
	public void added_items_of_checkout_and_validate_the_tom_items_in_checkout_page() {
	   checkoutPage.incrementProductQuntity();
	}

	@Then("User proceeds to Checkout the items in checkout page")
	public void user_proceeds_to_checkout_the_tom_items_in_checkout_page() {
		checkoutPage.checkoutBag();
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() {
		checkoutPage.checkOutPageActions();
		checkoutPage.chooseCountrym();
	}
}
