package com.cdp.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.cdp.applicationutils.ApplicationUtils;
import com.cdp.configuration.ConfigReader;
import com.cdp.hooks.Hooks;
import com.cdp.pageobjects.BankDetails;
import com.cdp.pageobjects.ClaimDetails;
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
	private ClaimDetails claims;
	private BankDetails bankDetails;
	
	
	public StepDefinition() {

		
		this.driver=Hooks.getDriver();
		
		homePage=new HomePage(driver);
		appUtils=new ApplicationUtils(driver);
		requirementPage=new RequirementPage(driver);
		insDetails=new InsuranceDetails(driver);
		personalDetails=new PersonalDetails(driver);
		claims=new ClaimDetails(driver);
		bankDetails=new BankDetails(driver);
	}
	
	@Given("User is in CDP homepage")
	public void user_is_in_cdp_homepage() {
	    driver.navigate().to(ConfigReader.getProperty("baseURL"));
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
	
	@Then("User enters {string} and navigate to bank details")
	public void user_enters_and_navigate_to_bank_details(String claim) throws InterruptedException {
		appUtils.wait(20);
		claims.claimDetails(claim);
	}

	@Then("User enters {string} and review details")
	public void user_enters_and_review_details(String bank) throws InterruptedException {
		appUtils.wait(20);
		bankDetails.bankDetails(bank);
		appUtils.wait(20);
		bankDetails.contToReviewSubmit.click();
	}

}
