package com.cdp.configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static WebDriver driver;

    public static WebDriver initializeDriver() {
        String browser = ConfigReader.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\\\driver\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

}
