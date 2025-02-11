package com.cdp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequirementPage {
	
	@FindBy(xpath="//input[@type='checkbox']")
	public static WebElement acceptTerms;
	
	@FindBy(xpath="//button[text()='Continue'][@data-kind='secondary']")
	public static WebElement reqageSubmit;

}
