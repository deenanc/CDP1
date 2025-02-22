package com.cdp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cdp.applicationutils.ApplicationUtils;
import com.cdp.hooks.Hooks;
import com.cdp.pageobjects.HomePage;
import com.cdp.pageobjects.RequirementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	
	private WebDriver driver;
	private HomePage homePage;
	private ApplicationUtils appUtils;
	private RequirementPage reqPage;
	
	public StepDefinition() {
		this.driver=Hooks.getDriver();
		homePage=new HomePage(driver);
		appUtils=new ApplicationUtils(driver);
		reqPage=new RequirementPage(driver);
	}
	
	@Given("User is in CDP homepage")
	public void user_is_in_cdp_homepage() {
	    driver.navigate().to("https://qa.cdpfnol.nprd.aig.com/cdp/nordics/no/en/ah");
	    driver.manage().window().maximize();
	}
	
	@Then("User selects {string}")
	public void user_selects(String selectedClaim) {
	    homePage.claimSelection(selectedClaim);
	}

	@Then("User accepts terms and conditions")
	public void user_accepts_terms_and_conditions() {
	    appUtils.wait(20);
	    reqPage.acceptTerms.click();
	    
	    appUtils.wait(20);
	    reqPage.reqpageSubmit.click();
	}

}
