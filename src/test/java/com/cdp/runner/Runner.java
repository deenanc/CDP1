package com.cdp.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)


@CucumberOptions(
    features = "src/test/resources/featurefiles",
    glue = {"com.cdp.stepdefinitions", "com.cdp.hooks"},
//    plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true,
    dryRun = false,
    plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)


public class Runner {

}
