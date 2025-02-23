package com.cdp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cdp.applicationutils.ApplicationUtils;

public class InsuranceDetails {
	
	WebDriver driver;
	ApplicationUtils appUtils;
	
	@FindBy(xpath="(//label[text()='Employer'])[1]")
	public static WebElement employerInsurance;
	
	@FindBy(xpath="//label[@for='radio-1chooseYourselfCritical']")
	public static WebElement unionAssociationInsurance;
	
	@FindBy(xpath="(//label[text()='Credit Card'])[1]")
	public static WebElement creditCardInsurance;
	
	@FindBy(xpath="//label[@for='radio-3chooseYourselfAccident']")
	public static WebElement purchasedMyselfInsurance;
	
	@FindBy(xpath="//button[@id='insuranceContinue-button']")
	public static WebElement contToInsuranceDetails;
	
	
	///////////////////Employer//////////////////////
	
	
	@FindBy(xpath="//input[@id='nameEmployer']")
	public static WebElement employerName;
	
	@FindBy(xpath="//input[@id='nameEmployee']")
	public static WebElement employeeName;
	
	@FindBy(xpath="//textarea[@id='emailAddressEmployer']")
	public static WebElement employerMailAddress;
	
	@FindBy(xpath="//input[@id='creditCardEmployer']")
	public static WebElement policyNumber;
	
	@FindBy(xpath="//label[text()='No'][@for='radio-1insuranceEmployer']")
	public static WebElement noOtherInsurance;
	
	
    ////////////////UnionAssociation//////////////////////
	
	
	@FindBy(xpath="(//input[@placeholder='Enter name of union or association'])[2]")
	public static WebElement unionAssociationName;
	
	@FindBy(xpath="(//input[@placeholder='Enter policy number'])[8]")
	public static WebElement unionPolicyNumber;
	
	@FindBy(xpath="//label[text()='No'][@for='radio-1unionInsurance']")
	public static WebElement noOtherUnion;
	
	
    ////////////////CreditCard//////////////////////
	
	
	@FindBy(xpath="//input[@id='creditCardPrimary']")
	public static WebElement first6Digits;
	
	@FindBy(xpath="//input[@id='creditCard4']")
	public static WebElement last4Digits;
	
	@FindBy(xpath="//label[text()='No'][@for='radio-1anotherInsuranceCreditCard']")
	public static WebElement noOtherCrdit;
	
	
	////////////////PurchasedMyself//////////////////
	
	
	@FindBy(xpath="//input[@id='policyNumberPurchased']")
	public static WebElement purchasedPolicyNumber;
	
	@FindBy(xpath="//label[@for='radio-1purchasedInsurance']")
	public static WebElement noOtherPurchasedPolicy;
	
	@FindBy(xpath="//button[@id='detailsContinue-button']")
	public static WebElement continueToPersonalDetails;
	
	public InsuranceDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		appUtils=new ApplicationUtils(driver);
	}
	
	public void insuranceSelection(String insuranceType) throws InterruptedException {
		
		if(insuranceType.equals("Employer")) {
			appUtils.wait(90);
			employerInsurance.click();
			
			Thread.sleep(4000);
			contToInsuranceDetails.click();
			
			appUtils.wait(90);
			employerName.sendKeys("DeenadhayalanN");
			employeeName.sendKeys("Cognizant");
			employerMailAddress.sendKeys("deena@mail.com");
			policyNumber.sendKeys("1234567890");
			noOtherInsurance.click();
			
		}
		else if(insuranceType.equals("PurchasedMyself")) {
			appUtils.wait(90);
			purchasedMyselfInsurance.click();
			
			Thread.sleep(4000);
			contToInsuranceDetails.click();
			
			appUtils.wait(90);
			purchasedPolicyNumber.sendKeys("1234567890");
			noOtherPurchasedPolicy.click();
		}
		else if(insuranceType.equals("UnionAssociation")) {
			appUtils.wait(90);
			unionAssociationInsurance.click();
			
			Thread.sleep(4000);
			contToInsuranceDetails.click();
			
			appUtils.wait(90);
			unionAssociationName.sendKeys("SITU");
			unionPolicyNumber.sendKeys("1234567890");
			
		}
		
		Thread.sleep(4000);
		continueToPersonalDetails.click();
	}

}
