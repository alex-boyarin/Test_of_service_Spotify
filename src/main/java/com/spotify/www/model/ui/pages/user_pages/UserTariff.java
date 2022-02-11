package com.spotify.www.model.ui.pages.user_pages;

import com.spotify.www.common.helper.TabSwitch;
import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserTariff extends BasePage {
    @FindBy(xpath = "//header//span[contains(text(),'Начать')]")
    private WebElement buttonToBegin;

    @FindBy(xpath = "//span[contains(text(),'Кредитная или дебетовая карта')]")
    private WebElement creditAndDebitCardSection;

    @FindBy(id = "cardnumber")
    private WebElement cardNumber;

    @FindBy(id = "expiry-date")
    private WebElement expiryDate;

    @FindBy(id = "security-code")
    private WebElement securityCode;

    @FindBy(xpath = "//button[contains(text(),'Подписаться на Spotify Premium')]")
    private WebElement buttonSubmit;

    @FindBy(id = "cardnumber-error")
    private WebElement cardNumberError;

    @FindBy(id = "expiry-date-error")
    private WebElement expiryDateError;

    public UserTariff clickOnButtonToBegin() {
        waiter.waitUntilElementToBeClickable(buttonToBegin).click();
        return this;
    }

    public UserTariff clickCreditAndDebitCardSection() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waiter.waitUntilElementToBeClickable(creditAndDebitCardSection).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='pci-iframe']")));
        return this;
    }

    public UserTariff FillOutCardForm(String number, String date, String code) {
        waiter.waitUntilElementToBeVisible(cardNumber).sendKeys(number);
        waiter.waitUntilElementToBeVisible(expiryDate).sendKeys(date);
        waiter.waitUntilElementToBeVisible(securityCode).sendKeys(code);
        return this;
    }

    public UserTariff clickButtonSubmit() {
        waiter.waitUntilElementToBeClickable(buttonSubmit).click();
        return this;
    }

    public String getMessageCardNumberError() {
        return waiter.waitUntilElementToBeVisible(cardNumberError).getText();
    }

    public String getMessageExpiryDateError() {
        return waiter.waitUntilElementToBeVisible(expiryDateError).getText();
    }

    public UserTariff returnedToUserMainPage() {
        TabSwitch.tabSwitchOnParent(driver);
        return this;
    }
}
