package com.cdp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cdp.applicationutils.ApplicationUtils;

public class PersonalDetails {
	
	WebDriver driver;
	ApplicationUtils appUtils;
	
	@FindBy(xpath="//textarea[@id='personalFirstName']")
	public static WebElement firstName;
	
	@FindBy(xpath="//textarea[@id='personalLastName']")
	public static WebElement lastName;
	
	@FindBy(xpath="//textarea[@id='personalEmail']")
	public static WebElement personalEmail;
	
	@FindBy(xpath="(//input[@placeholder='Enter phone number'])[1]")
	public static WebElement personalPolicyNumber;
	
	@FindBy(xpath="//label[text()='No'][@for='radio-1personalCheck']")
	public static WebElement noMailCommunication;
	
	@FindBy(xpath="(//button[contains(@id,'ddLabel')][text()=' Select '])[1]")
	public static WebElement selectPerson;
	
	/////////////////Myself///////////////////////
	
	@FindBy(xpath="//a[text()=' Myself ']")
	public static WebElement myselfSelected;
	
	@FindBy(xpath="//textarea[@id='nationalIdentity']")
	public static WebElement nationalID;
	
	@FindBy(xpath="(//input[@placeholder='Enter address'])[2]")
	public static WebElement personalAddress;
	
	@FindBy(xpath="//input[@id='yourselfPostalCode']")
	public static WebElement postalCode;
	
	@FindBy(xpath="(//input[@placeholder='Enter city'])[2]")
	public static WebElement personalCity;
	
	////////////////Someone Else/////////////////////////
	
	@FindBy(xpath="//a[text()=' Someone Else ']")
	public static WebElement someoneElseSelected;
	
	@FindBy(xpath="(//button[contains(@id,'ddLabel')][text()=' Select '])[2]")
	public static WebElement relationship;
	
	@FindBy(xpath="//a[text()=' Spouse/Cohabitant ']")
	public static WebElement spouse;
	
	@FindBy(xpath="//textarea[@id='someoneElseFirstName']")
	public static WebElement someoneElseFname;
	
	@FindBy(xpath="//textarea[@id='someoneElseLastName']")
	public static WebElement someoneElseLname;
	
	@FindBy(xpath="//textarea[@id='someoneElseNationalIdentity']")
	public static WebElement someoneElseID;
	
	@FindBy(xpath="//textarea[@id='someoneElseEmail']")
	public static WebElement someoneElseMail;
	
	@FindBy(xpath="(//input[@placeholder='Enter address'])[3]")
	public static WebElement someoneElseAddress;
	
	@FindBy(xpath="(//input[@placeholder='Enter postal code'])[3]")
	public static WebElement someoneElsePostalCode;
	
	@FindBy(xpath="//input[@id='someoneElseCity']")
	public static WebElement someoneElseCity;
	
	@FindBy(xpath="//button[text()=' Continue to Claim Details ']")
	public static WebElement contToClaimDetails;
	
	//////////////////////////////Deceased Details/////////////////////
	
	@FindBy(xpath="//axis-dropdown[@id='accidentalRelationship']")
	public static WebElement accidentalRelationship;
	
	@FindBy(xpath="//a[text()=' Spouse/Cohabitant ']")
	public static WebElement spouseCohabitant;
	
	@FindBy(xpath="//textarea[@id='accidentalFirstName']")
	public static WebElement accidentalFirstName;
	
	@FindBy(xpath="//textarea[@id='accidentalLastName']")
	public static WebElement accidentalLastName;
	
	@FindBy(xpath="//textarea[@id='accidentalNationalIdentity']")
	public static WebElement accidentalNationalIdentity;
	
	@FindBy(xpath="(//input[@placeholder='Enter address'])[1]")
	public static WebElement relationAddress;
	
	@FindBy(xpath="//input[@id='accidentalPostalCode']")
	public static WebElement accidentalPostalCode;
	
	@FindBy(xpath="//input[@id='accidentalCity']")
	public static WebElement accidentalCity;
	
	public PersonalDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		appUtils=new ApplicationUtils(driver);
	}
	
	public void basicDetails() throws InterruptedException {
		appUtils.wait(90);
		firstName.sendKeys("Deenadhayalan");
		lastName.sendKeys("Nageshkumar");
		personalEmail.sendKeys("deenanc@mail.com");
		personalPolicyNumber.sendKeys("1234567890");
		noMailCommunication.click();
		Thread.sleep(4000);
	}
	
	public void personalDetails(String person) throws InterruptedException {
		
		if(person.equals("Myself")) {
			selectPerson.click();
			Thread.sleep(2000);
			
			myselfSelected.click();
			appUtils.wait(90);
			nationalID.sendKeys("12wer34");
			appUtils.wait(20);
			Thread.sleep(2000);
			personalAddress.sendKeys("10, Pennsylvania avenue");
			appUtils.wait(20);
			Thread.sleep(2000);
			postalCode.sendKeys("600100");
			appUtils.wait(20);
			personalCity.sendKeys("Washington DC");
		}
		else if(person.equals("SomeoneElse")) {
			selectPerson.click();
			Thread.sleep(2000);
			
			someoneElseSelected.click();
			appUtils.wait(90);
			relationship.click();
			appUtils.wait(90);
			spouse.click();
			appUtils.wait(90);
			Thread.sleep(2000);
			someoneElseFname.sendKeys("Kayadu");
			appUtils.wait(90);
			Thread.sleep(2000);
			someoneElseLname.sendKeys("Lohar");
			appUtils.wait(20);
			someoneElseID.sendKeys("123qas3");
			appUtils.wait(20);
			someoneElseMail.sendKeys("lohar@mail.com");
			appUtils.wait(20);
			someoneElseAddress.sendKeys("112, Lover's lane");
			appUtils.wait(20);
			someoneElsePostalCode.sendKeys("112889");
			appUtils.wait(20);
			someoneElseCity.sendKeys("Assam");
		}
		else if(person.equals("spouse")) {
			accidentalRelationship.click();
			Thread.sleep(2000);
			
			spouseCohabitant.click();
			accidentalFirstName.sendKeys("Kayadu");
			accidentalLastName.sendKeys("Lohar");
			accidentalNationalIdentity.sendKeys("uy671ki");
			relationAddress.sendKeys("110,yt lane");
			accidentalPostalCode.sendKeys("128765");
			accidentalCity.sendKeys("Sqwerty");
		}
		
		Thread.sleep(2000);
		contToClaimDetails.click();
	}
	

}
