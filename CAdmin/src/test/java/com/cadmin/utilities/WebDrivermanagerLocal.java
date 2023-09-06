package com.cadmin.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDrivermanagerLocal {
	private static ThreadLocal<WebDriver> driverThreadLocal = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driverThreadLocal.get() == null) {
            // Initialize and configure the WebDriver here (e.g., ChromeDriver, FirefoxDriver)
            WebDriverManager.chromedriver().setup();

            WebDriver driver = new ChromeDriver();
            driverThreadLocal.set(driver);
        }
        return driverThreadLocal.get();
    }
}
