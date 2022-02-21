package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import pageobject.ALandingPage;
import pageobject.OfferPage;
import utility.TestContextSetup;

public class OfferPageStepDefinitions {
	public TestContextSetup testContextSetup;
	public String offerPageProductName;

	public OfferPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	/*
	 * For Scenario
	 * 
	 * @Then("user serached for {string} same shortname in offers page to check if
	 * product exist with same name")
	 */
	@Then("^User serached for (.+) same shortname in offers page to check if product exist with same name$")
	public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist_with_same_name(String Name) {
		ALandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();
		// ALandingPage landingPage = new ALandingPage(testContextSetup.driver);
		landingPage.topDealClick();
		testContextSetup.genericUtils.SwitchWindowToChild();
		/*
		 * For ZCommanScenarioPage class Set<String> s1 =
		 * testContextSetup.driver.getWindowHandles(); Iterator<String> itr =
		 * s1.iterator(); String parentWindow = itr.next(); String childWindow =
		 * itr.next(); testContextSetup.driver.switchTo().window(childWindow);
		 */
		OfferPage offerPage = testContextSetup.pageObjectManager.getOfferPage();
		// OfferPage offerPage = new OfferPage(testContextSetup.driver);
		offerPage.searchItem(Name);
		offerPageProductName = offerPage.getTextOfProduct();
		System.out.println(offerPageProductName + " is extracted from Offer page	");
	}

	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		System.out.println("Landing Page Text " + testContextSetup.afterSplitingIsText);
		System.out.println("OfferPage Text " + offerPageProductName);
		/*
		 * For Scenario Assert.assertEquals(testContextSetup.landingPageProductName,
		 * offerPageProductName);
		 */
		Assert.assertEquals(offerPageProductName, testContextSetup.afterSplitingIsText);
	}
}
