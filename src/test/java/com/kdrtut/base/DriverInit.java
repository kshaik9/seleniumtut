package com.kdrtut.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverInit {

    private static DriverInit driverInstance = null;
    private WebDriver driver;

    private DriverInit() {
    }

    public WebDriver openWebBrowser() {
        System.setProperty("webdriver.chrome.driver", "/Users/khadeer/Downloads/chromedriver");
        driver = new ChromeDriver();
        return driver;
    }

    public static DriverInit getDriverInstance() {
        if(driverInstance == null) {
            driverInstance = new DriverInit();
        }
        return driverInstance;
    }

}
