package utility;

import org.openqa.selenium.WebDriver;

import pageobject.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public String landingPageProductName,afterSplitingIsText;
	public TestBase test;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	public TestContextSetup() {
		
		 test = new TestBase();
		pageObjectManager = new PageObjectManager(test.WebDriverManager());
		genericUtils = new GenericUtils(test.WebDriverManager());
	}
}
