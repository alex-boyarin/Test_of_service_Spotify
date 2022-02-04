package com.spotify.www.model.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    private final String USER_EMAIL = "alex25091986@gmail.com";
    private final String PASSWORD = "25091986";
    @FindBy(id = "login-username")
    private WebElement userEmail;
    @FindBy(id = "login-password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement enterButton;


    public LogInPage fillLogInForm() {
        waiter.waitUntilElementToBeVisible(userEmail).clear();
        userEmail.sendKeys(USER_EMAIL);
        waiter.waitUntilElementToBeVisible(password).clear();
        password.sendKeys(PASSWORD);
        return this;
    }

    public UserPage clickLogInButton() {
        waiter.waitUntilElementToBeClickable(enterButton).click();
        return new UserPage();
    }
}