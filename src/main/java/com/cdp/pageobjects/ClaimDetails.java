package com.cdp.pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cdp.applicationutils.ApplicationUtils;

public class ClaimDetails {
	
	WebDriver driver;
	ApplicationUtils appUtils;
	
	/////////////////////////Personal Accident/////////////////////
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[1]")
	public static WebElement accidentDate;
	
	@FindBy(xpath="(//button[@aria-label='View Timepicker'])")
	public static WebElement viewTimepicker;
	
	@FindBy(xpath="//button[text()='Apply']")
	public static WebElement apply;
	
	@FindBy(xpath="//label[@for='radio-0leisureBusiness']")
	public static WebElement leisureBusiness;
	
	@FindBy(xpath="//label[text()=' How did the accident happen? ']/following::textarea[@id='accidentDescriptionCause']")
	public static WebElement howAccidentHappen;
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[2]")
	public static WebElement medicalTratmentDate;
	
	@FindBy(xpath="//input[@id='AccidentMedicalFacility']")
	public static WebElement medicalFacility;
	
	@FindBy(xpath="//button[text()=' Continue to Injury & Diagnosis ']")
	public static WebElement contToInjuryDiagnosis;
	
	@FindBy(xpath="(//input[@placeholder='Select all that apply'])[1]")
	public static WebElement diagnosis;
	
	@FindBy(xpath="//span[text()='Sprain']")
	public static WebElement sprain;
	
	@FindBy(xpath="//label[@id='dateOfDiagnosisPersonal-label']/parent::div/axis-datepicker/div/input")
	public static WebElement diagnosisDate1;
	
	@FindBy(xpath="//label[@for='radio-1accidentClaim']")
	public static WebElement noClaimfor3Years;
	
	@FindBy(xpath="//button[text()=' Continue to Treatment & Cost ']")
	public static WebElement contToTreatmentCost;
	
	@FindBy(xpath="//label[@for='radio-1dueHospitalized']")
	public static WebElement noHospitalization;
	
	@FindBy(xpath="//label[@for='radio-1medicalExpenses']")
	public static WebElement noMedicalExpense;
	
	@FindBy(xpath="//label[@for='radio-1continueTreatment']")
	public static WebElement noContTreatment;
	
	@FindBy(xpath="(//button[text()=' Continue to Upload Documents '])[1]")
	public static WebElement contToDocPA;
	
    /////////////////////////Critical Illness/////////////////////
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[7]")
	public static WebElement medicalTreatment;
	
	@FindBy(xpath="//button[text()=' Continue to next page ']")
	public static WebElement contToNextDate;
	
	@FindBy(xpath="//axis-dropdown[@id='IllnessDiagnosis']")
	public static WebElement illnessDiagnosis;
	
	@FindBy(xpath="//span[text()='Multiple sclerosis (MS)']")
	public static WebElement multipleSclerosis;
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[8]")
	public static WebElement diagnosisDateCI;
	
	@FindBy(xpath="//label[@for='radio-1similarDiagnosis']")
	public static WebElement noSimilarDiagnosis;
	
	@FindBy(xpath="//textarea[@id='criticalIllnessDiagnosisInformation']")
	public static WebElement additionalInfo;
	
	@FindBy(xpath="(//button[text()=' Continue to Upload Documents '])[2]")
	public static WebElement contToDocCI;
	
	/////////////////////////Accidental Death/////////////////////////
	
	@FindBy(xpath="//textarea[@id='accidentIllnessDescription']")
	public static WebElement howAccidentHappenAD;
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[9]")
	public static WebElement dateAD;
	
	@FindBy(xpath="//label[@for='radio-1chronicIllness']")
	public static WebElement noChronicDisease;
	
	@FindBy(xpath="(//button[text()=' Continue to Upload Documents '])[3]")
	public static WebElement contToDocAD;
	
	@FindBy(xpath="//button[text()=' Continue ']")
	public static WebElement contToBankDetails;
	
	public ClaimDetails(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		appUtils=new ApplicationUtils(driver);
	}
	
	public void claimDetails(String claim) throws InterruptedException {
		
		if(claim.equals("PADetails")) {
			appUtils.wait(90);
			accidentDate.sendKeys("12/02/2025");
			appUtils.wait(90);
			viewTimepicker.click();
			appUtils.wait(90);
			apply.click();
			appUtils.wait(90);
			Thread.sleep(4000);
			leisureBusiness.click();
			appUtils.wait(90);
			Thread.sleep(4000);
			howAccidentHappen.sendKeys("It happended");
			appUtils.wait(90);
			medicalTratmentDate.sendKeys("14/02/2025");
			appUtils.wait(90);
			medicalFacility.sendKeys("Dr.Murphy");
			appUtils.wait(90);
			contToInjuryDiagnosis.click();
			appUtils.wait(90);
			diagnosis.click();
			appUtils.wait(90);
			sprain.click();
			appUtils.wait(90);
			Thread.sleep(4000);
			
//			diagnosisDate1.click();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", diagnosisDate1);
			
			Actions actions = new Actions(driver);
			actions.moveToElement(diagnosisDate1).click().perform();

			appUtils.wait(90);
			
//			noClaimfor3Years.click();
			
			js.executeScript("arguments[0].click();", noClaimfor3Years);
			
			appUtils.wait(90);
			Thread.sleep(2000);
			contToTreatmentCost.click();
			appUtils.wait(90);
			noHospitalization.click();
			appUtils.wait(90);
			noMedicalExpense.click();
			appUtils.wait(90);
			noContTreatment.click();
			appUtils.wait(90);
			contToDocPA.click();
		}
		else if(claim.equals("CIDetails")) {
			appUtils.wait(90);
			medicalTreatment.sendKeys("12/02/2025");
			appUtils.wait(90);
			contToNextDate.click();
			appUtils.wait(90);
			illnessDiagnosis.click();
			appUtils.wait(90);
			multipleSclerosis.click();
			appUtils.wait(90);
			diagnosisDateCI.sendKeys("14/02/2025");
			appUtils.wait(90);
			
//			additionalInfo.click();
			
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.PAGE_DOWN).perform();
			Thread.sleep(4000);
//			actions.moveToElement(additionalInfo).click().perform();
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", noSimilarDiagnosis);
			
			Thread.sleep(2000);
			actions.moveToElement(noSimilarDiagnosis).click().perform();
			
			
//			noSimilarDiagnosis.click();
			
			appUtils.wait(90);
//			contToDocCI.click();
			js.executeScript("arguments[0].click();", contToDocCI);
		}
		else if(claim.equals("ADDetails")) {
			appUtils.wait(90);
			howAccidentHappenAD.sendKeys("QQQQ");
			appUtils.wait(90);
			dateAD.sendKeys("02/02/2025");
			appUtils.wait(90);
			noChronicDisease.click();
			appUtils.wait(90);
			Thread.sleep(4000);
			contToDocAD.click();
		}
		
		appUtils.wait(90);
		Thread.sleep(4000);
		contToBankDetails.click();
	}

}
