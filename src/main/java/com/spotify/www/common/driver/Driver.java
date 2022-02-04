package com.spotify.www.common.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;
    private static JavascriptExecutor scrollPage;

    private Driver() {
    }

    private static void initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\webDriver\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        scrollPage = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            initDriver();
        }
        return driver;
    }

    public static void close() {
        driver.quit();
        driver = null;
    }

    public static void scrollPageUntilElementIsVisible(WebElement element) {
        scrollPage.executeScript("arguments[0].scrollIntoView();", element);
    }

}
