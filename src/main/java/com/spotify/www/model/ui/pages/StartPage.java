package com.spotify.www.model.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    private static final String START_PAGE_URL = "https://open.spotify.com";

    @FindBy(xpath = "//div[@id='onetrust-close-btn-container']/button")
    private WebElement closeCookie;

    @FindBy(xpath = "//button[@data-testid='login-button']")
    private WebElement logIn;

    public StartPage openPage() {
        driver.get(START_PAGE_URL);
        return this;
    }

    public LogInPage clickLogInButton() {
        waiter.waitUntilElementToBeClickable(logIn).click();
        return new LogInPage();
    }
    public StartPage closeCookie()  {
        waiter.waitUntilElementToBeVisible(closeCookie).click();
        return this;
    }
}
