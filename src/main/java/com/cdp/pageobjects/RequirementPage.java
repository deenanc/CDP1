package com.cdp.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RequirementPage {
	
	WebDriver driver;
	
	public RequirementPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//axis-checkbox[@data-kind='custom']")
	public WebElement acceptTerms;
	
	@FindBy(xpath="//button[text()='Continue'][@data-kind='secondary']")
	public WebElement reqpageSubmit;

}
