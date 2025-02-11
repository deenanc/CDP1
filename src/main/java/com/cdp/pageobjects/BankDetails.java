package com.cdp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BankDetails {
	
	@FindBy(xpath="//label[text()='Norwegian Bank Account']")
	public static WebElement norwegianBankAccount;
	
	@FindBy(xpath="//label[text()='Foreign Bank Account']")
	public static WebElement foreignBankAccount;
	
	////////////////////////////Norwegian Bank Account//////////////////////
	
	@FindBy(xpath="//input[@id='accountOwnerNameN']")
	public static WebElement accOwnerName;
	
	@FindBy(xpath="//input[@id='bankNameN']")
	public static WebElement bankName;
	
	@FindBy(xpath="//input[@id='accountNumberN']")
	public static WebElement accNumber;
	
	@FindBy(xpath="//input[@id='confirmAccountNumberN']")
	public static WebElement confirmAccNumber;
	
	@FindBy(xpath="(//label[text()='Address is the same as previously provided. '])[1]")
	public static WebElement sameAddressNorwegianBank;
	
	////////////////////////////////Foreign Bank//////////////////////////////
	
	@FindBy(xpath="//input[@id='accountOwnerNameF']")
	public static WebElement accOwnerNameForeign;
	
	@FindBy(xpath="//input[@id='bankNameF']")
	public static WebElement foreignBankName;
	
	@FindBy(xpath="//input[@id='accountNumberF']")
	public static WebElement foreignAccNumber;
	
	@FindBy(xpath="//input[@id='confirmAccountNumberF']")
	public static WebElement confirmForeignAccNumber;
	
	@FindBy(xpath="//input[@id='bicSwiftF']")
	public static WebElement BICSwift;
	
	@FindBy(xpath="(//label[text()='Address is the same as previously provided. '])[2]")
	public static WebElement sameAddressForeignBank;
	
	@FindBy(xpath="//button[text()=' Continue to Review & Submit ']")
	public static WebElement contToReviewSubmit;
	
	@FindBy(xpath="//span[text()='Submit']")
	public static WebElement submit;
	
	@FindBy(xpath="//span[@data-icon='shield_check']")
	public static WebElement shieldCheck;
	

}
