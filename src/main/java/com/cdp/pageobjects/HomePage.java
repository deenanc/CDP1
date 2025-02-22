package com.cdp.pageobjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cdp.applicationutils.ApplicationUtils;

public class HomePage {
	
	WebDriver driver;
	ApplicationUtils appUtils;
	
	@FindBy(xpath="//label[text()='Personal Accident']")
	public static WebElement personalAccident;
	
	@FindBy(xpath="//label[text()='Critical Illness']")
	public static WebElement criticalIllness;
	
	@FindBy(xpath="//label[text()='Accidental Death']")
	public static WebElement accidentalDeath;
	
	@FindBy(xpath="//button[text()='Continue'][@data-kind='secondary']")
	public static WebElement homepageSubmit;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		appUtils=new ApplicationUtils(driver);
	}
	
	public void claimSelection(String selectedClaim) {
		
		if(selectedClaim.equals("Personal Accident")) {
			appUtils.wait(120);
			personalAccident.click();
		}
		else if(selectedClaim.equals("Critical Illness")) {
			appUtils.wait(120);
			criticalIllness.click();
		}
		else if(selectedClaim.equals("Accidental Death")) {
			appUtils.wait(120);
			accidentalDeath.click();
		}
		
		homepageSubmit.click();
	}
	

}
