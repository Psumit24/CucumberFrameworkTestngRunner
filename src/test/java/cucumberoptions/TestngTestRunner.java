package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", glue = "stepdefinitions", 
monochrome = true,
tags = "@PlaceOrder or @Offer",
plugin= {"html:target/cucumber1.html","json:target/cucumber1.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
"rerun:target/failed_scenarios.txt"},
dryRun = false)
public class TestngTestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)                       
	public Object[][] scenarios() {  
		return super.scenarios();

	}
}
