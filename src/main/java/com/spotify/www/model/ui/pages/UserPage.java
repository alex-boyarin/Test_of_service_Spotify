package com.spotify.www.model.ui.pages;

import com.spotify.www.common.helper.TabSwitch;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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




//    @FindBy(xpath = "//span/h1")
//    private WebElement userName;

//    public UserPage closePopUp() {
//        waiter.waitUntilElementToBeClickable(closePopUp).click();
//        return this;
//    }



    public UserPage clickUserLinkButton() {

        waiter.waitUntilElementToBeClickable(userLinkButton).click();
        return this;
    }

    public UserAccount clickAccountSection() {
        waiter.waitUntilElementToBeClickable(accountSection).click();
        TabSwitch.tabSwitch(driver);
        return new UserAccount();
    }


    public UserTariff clickTariffChangeSection() {
        waiter.waitUntilElementToBeClickable(tariffChangeSection).click();
        TabSwitch.tabSwitchOnParent(driver);
        return new UserTariff();
    }

    public UserPage clickLogOutButton() {
        waiter.waitUntilElementToBeClickable(logOutButton).click();
        return this;
    }

    public Search searchSection()  {

        waiter.waitUntilElementToBeVisible(searchSection).click();
        return new Search();
    }


    public MyMedia myMediaSection() {

        waiter.waitUntilElementToBeClickable(myMedia).click();
        return new MyMedia();
    }

}
