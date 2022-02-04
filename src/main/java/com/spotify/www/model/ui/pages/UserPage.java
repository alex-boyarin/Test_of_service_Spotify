package com.spotify.www.model.ui.pages;

import com.spotify.www.common.helper.TabSwitch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends BasePage {

    @FindBy(xpath = "//button[contains(text(),'Закрыть')]")
    private WebElement closePopUp;

    @FindBy(xpath = "//button[@data-testid='user-widget-link']")
    private WebElement UserLinkButton;

    @FindBy(xpath = "//span[contains(text(),'Аккаунт')]")
    private WebElement accountSection;

    @FindBy(xpath = "//span[contains(text(),'Профиль')]")
    private WebElement profileSection;

    @FindBy(xpath = "//span[contains(text(),'Переход на Premium')]")
    private WebElement tariffChangeSection;

    @FindBy(xpath = "//*[text()='Выйти']")
    private WebElement logOutButton;

    @FindBy(xpath = "//span/h1")
    private WebElement userName;

    public UserPage closePopUp() {
        waiter.waitUntilElementToBeClickable(closePopUp).click();
        return this;
    }

    public String getUserName() {
        return waiter.waitUntilElementToBeVisible(userName).getText();
    }

    public UserPage clickUserLinkButton() {

        waiter.waitUntilElementToBeClickable(UserLinkButton).click();
        return this;
    }

    public UserAccount clickAccountSection() {
        waiter.waitUntilElementToBeVisible(accountSection).click();
        TabSwitch.tabSwitch(driver);
        return new UserAccount();
    }

    public UserPage clickProfileSection() {
        waiter.waitUntilElementToBeVisible(profileSection).click();
        return this;
    }

    public UserTariff clickTariffChangeSection() {
        waiter.waitUntilElementToBeVisible(tariffChangeSection).click();
        TabSwitch.tabSwitchOnParent(driver);
        return new UserTariff();
    }

    public UserPage clickLogOutButton() {
        waiter.waitUntilElementToBeVisible(logOutButton).click();
        return this;
    }
}
