package com.cdp.applicationutils;

import org.openqa.selenium.WebDriver;

import com.cdp.pageobjects.BankDetails;
import com.cdp.pageobjects.ClaimDetails;
import com.cdp.pageobjects.HomePage;
import com.cdp.pageobjects.InsuranceDetails;
import com.cdp.pageobjects.PersonalDetails;
import com.cdp.pageobjects.RequirementPage;

public class DependencyInjector {
	
	private WebDriver driver;
	private BankDetails bankDetails;
	private ClaimDetails claimDetails;
	private HomePage homePage;
	private InsuranceDetails insuranceDetails;
	private PersonalDetails personalDetails;
	private RequirementPage requirementPage;
	private ApplicationUtils appUtils;
	
     public  DependencyInjector(WebDriver driver) {
		
		this.driver=driver;
		
		this.homePage=new HomePage(driver);
		this.requirementPage=new RequirementPage(driver);
		this.insuranceDetails=new InsuranceDetails(driver);
		this.personalDetails=new PersonalDetails(driver);
		this.appUtils=new ApplicationUtils(driver);
	}
	
	public ApplicationUtils getAppUtils() {
		return appUtils;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public BankDetails getBankDetails() {
		return bankDetails;
	}
	public ClaimDetails getClaimDetails() {
		return claimDetails;
	}
	public HomePage getHomePage() {
		return homePage;
	}
	public InsuranceDetails getInsuranceDetails() {
		return insuranceDetails;
	}
	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}
	public RequirementPage getRequirementPage() {
		return requirementPage;
	}
	
	
	
	

}
