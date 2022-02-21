package stepdefinitions;

/*import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;*/

public class ZCommanScenarioPage {
	/* public WebDriver driver;
public String landingPageProductName,offerPageProductName;

	@Given("User in GreenKart Landing page")
	public void user_in_green_kart_landing_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
	}

	@When("user searched with Shortname {string} and extracted actual name of product")
	public void user_searched_with_shortname_and_extracted_actual_name_of_product(String shortName) {
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
		 landingPageProductName = driver.findElement(By.xpath("//h4[contains(text(),\"Tomato - 1 Kg\")]")).getText().split("-")[0]
				.trim();
		System.out.println(landingPageProductName + "is extracted from Home page	");
	}

	@Then("user serached for {string} same shortname in offers page to check if product exist with same name")
	public void user_serached_for_same_shortname_in_offers_page_to_check_if_product_exist_with_same_name(
			String shortName) {
		driver.findElement(By.partialLinkText("Top Deals")).click();
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> itr = s1.iterator();
		String parentWindow = itr.next();
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		driver.findElement(By.id("search-field")).sendKeys(shortName);
		 offerPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
		System.out.println(offerPageProductName + "is extracted from Offer page	");
	}
	@Then("validate product name in offers page matches with Landing Page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offerPageProductName, landingPageProductName);
	}
 */
}