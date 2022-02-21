package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public WebDriver driver;

	FileInputStream fis;

	public WebDriver WebDriverManager() {
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		Properties prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = prop.getProperty("QAUrl");
		String browser_properties = prop.getProperty("browser");
		String browser_maven = System.getProperty("browser");
		String browser = browser_maven != null ? browser_maven : browser_properties;

		if (driver == null) {
			if (browser.equalsIgnoreCase("chrome")) {

				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			if (browser.equalsIgnoreCase("firefox")) {

				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
			if (browser.equalsIgnoreCase("ie")) {

				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
			}
			// driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			driver.get(url);
			driver.manage().window().maximize();
		}
		return driver;

	}
}
