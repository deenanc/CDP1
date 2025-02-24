package com.cdp.hooks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.picocontainer.Injector;

import com.cdp.applicationutils.DependencyInjector;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	private WebDriver driver;
    private DependencyInjector injector;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		this.driver=new ChromeDriver();
		this.injector=new DependencyInjector(driver);
	}
	
	@After
	public void tearUp() {
		driver.quit();
	}
	
	public WebDriver getDriver() {
		return driver;
	}

}
