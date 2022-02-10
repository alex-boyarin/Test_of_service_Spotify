package com.spotify.www.model.ui.pages.login_page;

import com.spotify.www.common.helper.PropertiesUtil;
import com.spotify.www.model.ui.pages.base_page.BasePage;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    private final String USER_EMAIL = "email";
    private final String PASSWORD = "password";
    @FindBy(id = "login-username")
    private WebElement userEmail;
    @FindBy(id = "login-password")
    private WebElement password;
    @FindBy(id = "login-button")
    private WebElement enterButton;


    public LogInPage fillLogInForm() {
        waiter.waitUntilElementToBeVisible(userEmail).clear();
        userEmail.sendKeys(PropertiesUtil.get(USER_EMAIL));
        waiter.waitUntilElementToBeVisible(password).clear();
        password.sendKeys(PropertiesUtil.get(PASSWORD));
        return this;
    }

    public UserPage submit() {
        waiter.waitUntilElementToBeClickable(enterButton).click();
        return new UserPage();
    }
}
