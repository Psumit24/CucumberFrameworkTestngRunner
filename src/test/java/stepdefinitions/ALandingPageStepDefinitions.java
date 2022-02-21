package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageobject.ALandingPage;
import utility.TestContextSetup;

public class ALandingPageStepDefinitions {
	public TestContextSetup testContextSetup;
	public ALandingPage landingPage;
	public String landingPageProductName,afterSplitingIsText;
	public ALandingPageStepDefinitions(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		this.landingPage = testContextSetup.pageObjectManager.getLandingPage();
		
	}


	@Given("User in GreenKart Landing page")
	public void user_in_green_kart_landing_page() {
		System.out.println("TitleofPage  "+landingPage.getTitleOfLandingPage());
		org.testng.Assert.assertTrue((landingPage.getTitleOfLandingPage().contains("GreenKart - veg and fruits kart")));
		/*For ZCommanScenarioPage class
		 * WebDriverManager.chromedriver().setup(); testContextSetup.driver = new
		 * ChromeDriver(); testContextSetup.driver.get(
		 * "https://rahulshettyacademy.com/seleniumPractise/#/");
		 */ 
	}

	//@When("user searched with Shortname {string} and extracted actual name of product")
	@When("^User searched with Shortname (.+) and extracted actual name of product$")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String Name) {
		// ALandingPage landingPage=new ALandingPage(testContextSetup.driver);
		landingPage.searchItem(Name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String landingPageProductName = landingPage.getProductName();
		System.out.println("Before Split>>> "+landingPageProductName);
		testContextSetup.landingPageProductName=landingPageProductName;
		testContextSetup.afterSplitingIsText = landingPageProductName.split("-")[0].trim();
		System.out.println(testContextSetup.afterSplitingIsText + " is extracted from Home page	");
	}
}
