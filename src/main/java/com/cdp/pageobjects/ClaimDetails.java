package com.cdp.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ClaimDetails {
	
	/////////////////////////Personal Accident/////////////////////
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[1]")
	public static WebElement accidentDate;
	
	@FindBy(xpath="(//button[@aria-label='View Timepicker'])")
	public static WebElement viewTimepicker;
	
	@FindBy(xpath="//button[text()='Apply']")
	public static WebElement apply;
	
	@FindBy(xpath="//label[@for='radio-0leisureBusiness']")
	public static WebElement leisureBusiness;
	
	@FindBy(xpath="(//textarea[@placeholder='Please provide as much detail as possible.'])[1]")
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
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[3]")
	public static WebElement diagnosisDate;
	
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
	
	@FindBy(xpath="(//button[text()=' Continue to Upload Documents '])[2]")
	public static WebElement contToDocCI;
	
	/////////////////////////Accidental Death/////////////////////////
	
	@FindBy(xpath="(//textarea[@aria-label='How did the accident happen'])[2]")
	public static WebElement howAccidentHappenAD;
	
	@FindBy(xpath="(//input[@placeholder='DD/MM/YYYY'])[9]")
	public static WebElement dateAD;
	
	@FindBy(xpath="//label[@for='radio-1chronicIllness']")
	public static WebElement noChronicDisease;
	
	@FindBy(xpath="(//button[text()=' Continue to Upload Documents '])[3]")
	public static WebElement contToDocAD;
	
	@FindBy(xpath="//button[text()=' Continue ']")
	public static WebElement contToBankDetails;

}
