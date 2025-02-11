package com.cdp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(xpath="//label[text()='Personal Accident']")
	public static WebElement personalAccident;
	
	@FindBy(xpath="//label[text()='Critical Illness']")
	public static WebElement criticalIllness;
	
	@FindBy(xpath="Accidental Death")
	public static WebElement accidentalDeath;
	
	@FindBy(xpath="//button[text()='Continue'][@data-kind='secondary']")
	public static WebElement homepageSubmit;

}
