package com.cdp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cdp.applicationutils.ApplicationUtils;
import com.cdp.applicationutils.DependencyInjector;
import com.cdp.hooks.Hooks;
import com.cdp.pageobjects.HomePage;
import com.cdp.pageobjects.InsuranceDetails;
import com.cdp.pageobjects.PersonalDetails;
import com.cdp.pageobjects.RequirementPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinition {
	
	private WebDriver driver;
	private HomePage homePage;
	private ApplicationUtils appUtils;
	private RequirementPage requirementPage;
	private InsuranceDetails insDetails;
	private PersonalDetails personalDetails;
	
//	private DependencyInjector injector;
	
	
	public StepDefinition(DependencyInjector injector) {
		this.driver=Hooks.getDriver();
		this.homePage=injector.getHomePage();
		this.appUtils=injector.getAppUtils();
		this.requirementPage=injector.getRequirementPage();
		this.insDetails=injector.getInsuranceDetails();
		this.personalDetails=injector.getPersonalDetails();
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
	    requirementPage.acceptTerms.click();
	    
	    appUtils.wait(20);
	    requirementPage.reqpageSubmit.click();
	}
	
	@Then("User selects a {string} and enter details")
	public void user_selects_a_and_enter_details(String InsuranceType) throws InterruptedException {
		appUtils.wait(20);
		insDetails.insuranceSelection(InsuranceType);
	}
	
	@Then("User enters {string}")
	public void user_enters(String person) throws InterruptedException {
		appUtils.wait(20);
	    personalDetails.basicDetails();
	    
	    appUtils.wait(20);
	    personalDetails.personalDetails(person);
	}

}
