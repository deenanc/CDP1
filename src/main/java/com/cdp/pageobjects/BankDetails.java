package com.cdp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cdp.applicationutils.ApplicationUtils;

public class BankDetails {
	
	WebDriver driver;
	ApplicationUtils appUtils;
	
	@FindBy(xpath="//label[text()='Norwegian Bank Account']")
	public WebElement norwegianBankAccount;
	
	@FindBy(xpath="//label[text()='Foreign Bank Account']")
	public WebElement foreignBankAccount;
	
	////////////////////////////Norwegian Bank Account//////////////////////
	
	@FindBy(xpath="//input[@id='accountOwnerNameN']")
	public WebElement accOwnerName;
	
	@FindBy(xpath="//input[@id='bankNameN']")
	public WebElement bankName;
	
	@FindBy(xpath="//input[@id='accountNumberN']")
	public WebElement accNumber;
	
	@FindBy(xpath="//input[@id='confirmAccountNumberN']")
	public WebElement confirmAccNumber;
	
	@FindBy(xpath="(//label[text()='Address is the same as previously provided. '])[1]")
	public WebElement sameAddressNorwegianBank;
	
	////////////////////////////////Foreign Bank//////////////////////////////
	
	@FindBy(xpath="//input[@id='accountOwnerNameF']")
	public WebElement accOwnerNameForeign;
	
	@FindBy(xpath="//input[@id='bankNameF']")
	public WebElement foreignBankName;
	
	@FindBy(xpath="//input[@id='accountNumberF']")
	public WebElement foreignAccNumber;
	
	@FindBy(xpath="//input[@id='confirmAccountNumberF']")
	public WebElement confirmForeignAccNumber;
	
	@FindBy(xpath="//input[@id='bicSwiftF']")
	public WebElement BICSwift;
	
	@FindBy(xpath="(//label[text()='Address is the same as previously provided. '])[2]")
	public WebElement sameAddressForeignBank;
	
	@FindBy(xpath="//button[text()=' Continue to Review & Submit ']")
	public WebElement contToReviewSubmit;
	
	@FindBy(xpath="//span[text()='Submit']")
	public WebElement submit;
	
	@FindBy(xpath="//span[@data-icon='shield_check']")
	public WebElement shieldCheck;
	
	public BankDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		appUtils=new ApplicationUtils(driver);
	}
	
	public void bankDetails(String bank) throws InterruptedException  {
		if(bank.equals("Foreign")) {
			appUtils.wait(90);
			foreignBankAccount.click();
			
			appUtils.wait(90);
			accOwnerNameForeign.sendKeys("Deenadhayalan Nageshkumar");
			
			appUtils.wait(90);
			foreignBankName.sendKeys("DBS");
			
			appUtils.wait(90);
			Thread.sleep(4000);
			foreignAccNumber.sendKeys("1111111111");
			
			appUtils.wait(90);
			Thread.sleep(4000);
			confirmForeignAccNumber.sendKeys("1111111111");
			
			appUtils.wait(90);
			Thread.sleep(4000);
			BICSwift.sendKeys("143AUAM");
			
			appUtils.wait(90);
			sameAddressForeignBank.click();
				
		}
		
		else if(bank.equals("Norwegian")) {
			
			appUtils.wait(90);
			norwegianBankAccount.click();
			
			appUtils.wait(90);
			accOwnerName.sendKeys("Deenadhayalan Nageshkumar");
			
			appUtils.wait(90);
			bankName.sendKeys("DBSN");
			
			appUtils.wait(90);
			Thread.sleep(4000);
			accNumber.sendKeys("11111111111");
			
			appUtils.wait(90);
			Thread.sleep(4000);
			confirmAccNumber.sendKeys("11111111111");
			
			appUtils.wait(90);
			Thread.sleep(4000);
			sameAddressNorwegianBank.click();
			
		}
		
	}
	

}
