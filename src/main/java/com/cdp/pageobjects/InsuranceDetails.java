package com.cdp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsuranceDetails {
	
	@FindBy(xpath="(//label[text()='Employer'])[1]")
	public static WebElement employerInsurance;
	
	@FindBy(xpath="(//label[text()='Union / Association'])[1]")
	public static WebElement unionAssociationInsurance;
	
	@FindBy(xpath="(//label[text()='Credit Card'])[1]")
	public static WebElement creditCardInsurance;
	
	@FindBy(xpath="(//label[text()='Purchased Myself'])[1]")
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
	
	
	@FindBy(xpath="//input[@id='creditCardAssociationUnion']")
	public static WebElement unionAssociationName;
	
	@FindBy(xpath="//input[@id='creditCardPolicyNumberUnion']")
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
	

}
