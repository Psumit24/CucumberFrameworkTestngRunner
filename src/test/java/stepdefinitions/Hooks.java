package stepdefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utility.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;

	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}

	@After
	public void AfterScenario() {

		testContextSetup.test.WebDriverManager().quit();
	}

	@AfterStep
	public void AddScreenShot(Scenario scenario) {
		WebDriver driver = testContextSetup.test.WebDriverManager();
		if (scenario.isFailed()) {
			File sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = null;
			try {
				fileContent = FileUtils.readFileToByteArray(sourcePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			scenario.attach(fileContent, "image/png", "image");
		}
	}
}
