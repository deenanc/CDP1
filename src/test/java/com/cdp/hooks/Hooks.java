package com.cdp.hooks;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cdp.configuration.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class Hooks {
	
	private static WebDriver driver;
	
	@Before
	public void setUp() {
		driver = DriverFactory.initializeDriver();
//		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
//		Hooks.driver=new ChromeDriver();

	}
	
	@After
	public void tearUp() {
		driver.quit();
	}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			File soursePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent=FileUtils.readFileToByteArray(soursePath);
			scenario.attach(fileContent, "image/png", "image"
					);
		}
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	

}
