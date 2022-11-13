package com.qa.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt",
//				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"json:target/cucumber/cucumber.json",
				"com.qa.automation.utils.TestListener"
		}
		, features = {"src/test/resources/features"}
		, glue = {"com.qa.automation.steps"}
		//,dryRun = true
		, monochrome = true
		, tags = "@bookerAPI"
		//,publish = true
)
public class SmokeRunner extends AbstractTestNGCucumberTests {

}
