package cucumberoptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "@target/failed_scenarios.txt", glue = "stepdefinitions", 
monochrome = true,
plugin= {"html:target/cucumber1.html","json:target/cucumber1.json",
"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
},
dryRun = false)
public class FailedTestngTestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = true)                       
	public Object[][] scenarios() {  
		return super.scenarios();

	}
}
