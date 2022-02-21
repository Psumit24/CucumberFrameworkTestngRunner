package pageobject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutPage {

	public WebDriver driver;
	public WebDriverWait wait;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;

	}

	private By increment = By.xpath("//input[@type=\"number\"]");
	private By addCart = By.xpath("//div[@class=\"product-action\"]/button[@type=\"button\"]");
	private By selectBag = By.cssSelector("a.cart-icon");
	private By processedBtn = By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]");
	private By promoBtn = By.cssSelector("button.promoBtn");
	private By enterPromoCode = By.xpath("//input[@type=\"text\"]");
	private By placeOrder = By.xpath("//button[contains(text(),'Place Order')]");
	private By validatedPromocode = By.cssSelector("span.promoInfo");
	private By chooseCountry = By.xpath("//select[@style=\"width: 200px;\"]");
	private By agree = By.xpath("//input[@type=\"checkbox\"]");
	private By proceed = By.xpath("//button[contains(text(),'Proceed')]");

	public void incrementProductQuntity() {
		driver.findElement(increment).sendKeys(Keys.BACK_SPACE);
		driver.findElement(increment).sendKeys("3");
		driver.findElement(addCart).click();
	}

	public void checkoutBag() {
		driver.findElement(selectBag).click();
		driver.findElement(processedBtn).click();
	}

	public void checkOutPageActions() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		wait.until(ExpectedConditions.elementToBeClickable(enterPromoCode));
		driver.findElement(enterPromoCode).sendKeys("ABCDSFSxyz");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(promoBtn).click();
		wait.until(ExpectedConditions.elementToBeClickable(validatedPromocode));
		System.out.println("PromocodeStatus>>" + driver.findElement(validatedPromocode).getText());
		driver.findElement(placeOrder).click();
	}

	public void chooseCountrym() {
		WebElement element1 = driver.findElement(chooseCountry);
		Select select = new Select(element1);
		select.selectByVisibleText("India");
		driver.findElement(agree).click();
		driver.findElement(proceed).click();

	}
}
