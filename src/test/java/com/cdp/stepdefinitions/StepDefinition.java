package com.cdp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cdp.hooks.Hooks;

import io.cucumber.java.en.Given;

public class StepDefinition {
	
	private WebDriver driver;
	
	public StepDefinition() {
		this.driver=Hooks.getDriver();
	}
	
	@Given("User is in CDP homepage")
	public void user_is_in_cdp_homepage() {
	    driver.navigate().to("https://qa.cdpfnol.nprd.aig.com/cdp/nordics/no/en/ah");
	    driver.manage().window().maximize();
	}

}
