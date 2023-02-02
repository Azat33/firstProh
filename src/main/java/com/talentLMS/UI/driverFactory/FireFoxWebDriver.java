package com.talentLMS.UI.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

public class FireFoxWebDriver {

    public static WebDriver loadFireFoxWebDriver() {
        WebDriverManager.edgedriver().setup();
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--disable-extensions");
        firefoxOptions.addArguments("--start-maximized");
        firefoxOptions.addArguments("--window-size=1920,1080");

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().deleteAllCookies();
        return driver;
    }
}
