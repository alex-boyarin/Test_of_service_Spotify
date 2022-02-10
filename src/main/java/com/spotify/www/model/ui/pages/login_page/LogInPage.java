package com.spotify.www.model.ui.pages.login_page;

import com.spotify.www.model.ui.pages.base_page.BasePage;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    private final String USER_EMAIL = "alex25091986@gmail.com";
    private final String PASSWORD = "68919052";
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
