package com.cdp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalDetails {
	
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
	
	@FindBy(xpath="(//input[@placeholder='Enter postal code'])[2]")
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
	

}
