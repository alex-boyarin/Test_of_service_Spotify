package com.spotify.www.model.ui.pages.user_pages;

import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.spotify.www.common.helper.TabSwitch.tabSwitch;

public class UserPage extends BasePage {

    @FindBy(xpath = "//button[@data-testid='user-widget-link']")
    private WebElement userLinkButton;

    @FindBy(xpath = "//span[contains(text(),'Аккаунт')]")
    private WebElement accountSection;

    @FindBy(xpath = "//span[contains(text(),'Поиск')]")
    private WebElement searchSection;

    @FindBy(xpath = "//span[contains(text(),'Переход на Premium')]")
    private WebElement tariffChangeSection;

    @FindBy(xpath = "//*[text()='Выйти']")
    private WebElement logOutButton;

    @FindBy(xpath = "//span[contains(text(),'Моя медиатека')]")
    private WebElement myMedia;

    public UserPage clickUserLinkButton() {
        waiter.waitUntilElementToBeClickable(userLinkButton).click();
        return this;
    }

    public UserAccount clickAccountSection() {
        waiter.waitUntilElementToBeClickable(accountSection).click();
        tabSwitch(driver);
        return new UserAccount();
    }


    public UserTariff clickTariffChangeSection() {
        waiter.waitUntilElementToBeClickable(tariffChangeSection).click();
        tabSwitch(driver);
        return new UserTariff();
    }

    public UserPage clickLogOutButton() {
        waiter.waitUntilElementToBeClickable(userLinkButton).click();
        waiter.waitUntilElementToBeClickable(logOutButton).click();
        return this;
    }

    public Search searchSection() {
        waiter.waitUntilElementToBeVisible(searchSection).click();
        return new Search();
    }


    public MyMedia myMediaSection() {
        waiter.waitUntilElementToBeClickable(myMedia).click();
        return new MyMedia();
    }

}
