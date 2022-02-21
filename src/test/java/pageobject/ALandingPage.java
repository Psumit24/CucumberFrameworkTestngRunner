package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ALandingPage {

	public WebDriver driver;

	public ALandingPage(WebDriver driver) {
		this.driver = driver;

	}

	private By search = By.xpath("//input[@type='search']");
	private By productName = By.xpath("//div/h4");
	private By topDeals = By.partialLinkText("Top Deals");

	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}

	public String getProductName() {

		return driver.findElement(productName).getText();
	}

	public void topDealClick() {
		driver.findElement(topDeals).click();
	}

	public String getTitleOfLandingPage() {
		return driver.getTitle();
	}
}
