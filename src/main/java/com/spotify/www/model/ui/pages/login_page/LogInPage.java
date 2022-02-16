package com.spotify.www.model.ui.pages.login_page;

import com.spotify.www.common.helper.PropertiesUtil;
import com.spotify.www.model.ui.pages.base_page.BasePage;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {
    @FindBy(id = "login-username")
    private WebElement userEmail;

    @FindBy(id = "login-password")
    private WebElement userPassword;

    @FindBy(id = "login-button")
    private WebElement enterButton;


    public LogInPage fillLogInForm(String email, String password) {
        waiter.waitUntilElementToBeVisible(userEmail).clear();
        userEmail.sendKeys(PropertiesUtil.get(email));
        waiter.waitUntilElementToBeVisible(userPassword).clear();
        userPassword.sendKeys(PropertiesUtil.get(password));
        return this;
    }

    public UserPage submit() {
        waiter.waitUntilElementToBeClickable(enterButton).click();
        return new UserPage();
    }
}
