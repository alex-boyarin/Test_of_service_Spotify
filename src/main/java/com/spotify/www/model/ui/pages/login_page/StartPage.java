package com.spotify.www.model.ui.pages.login_page;

import com.spotify.www.common.helper.ElementHelper;
import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    private static final String START_PAGE_URL = "https://open.spotify.com";

    private By closeCookie = By.xpath("//div[@id='onetrust-close-btn-container']/button");

    @FindBy(xpath = "//div[@id='onetrust-close-btn-container']/button")
    private WebElement cookie;

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

    public StartPage closeCookie() {
        if (ElementHelper.isElementPresent(closeCookie)) {
            cookie.click();
        }
        return this;
    }
}
