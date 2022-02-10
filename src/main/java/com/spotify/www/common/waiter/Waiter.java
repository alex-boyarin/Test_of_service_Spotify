package com.spotify.www.common.waiter;

import com.spotify.www.common.driver.Driver;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Waiter {
    private static final int WAIT_FOR_ELEMENT_SECONDS = 10;
    private static final int POLLING_TIME_DURATION_MILLIS = 2000;
    private Wait<WebDriver> wait = new FluentWait<>(Driver.getDriver())
            .withTimeout(Duration.ofSeconds(WAIT_FOR_ELEMENT_SECONDS))
            .pollingEvery(Duration.ofMillis(POLLING_TIME_DURATION_MILLIS))
            .ignoring(NoSuchElementException.class)
            .ignoring(ElementNotInteractableException.class)
            .ignoring(StaleElementReferenceException.class);

    public WebElement waitUntilElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitUntilElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilVisibilityOfElementLocated(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
}
