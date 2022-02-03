package com.spotify.www.model.ui.pages;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.common.helper.ElementHelper;
import com.spotify.www.common.helper.TabSwitch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserAccount extends BasePage {
    private final By USER_DATA = By.xpath("//tbody");

    @FindBy(xpath = "//li[@id='overview']/a")
    private WebElement userDataSection;

    @FindBy(xpath = "//li[@id='change_password']")
    private WebElement changePasswordSection;

    @FindBy(xpath = "//li[@id='notifications']")
    private WebElement notificationsSection;

    @FindBy(xpath = "//li[@id='privacy']")
    private WebElement privacySection;

    @FindBy(xpath = "//li[@id='recover_playlists']")
    private WebElement recoverPlaylistsSection;

    @FindBy(xpath = "//li[@id='receipts']")
    private WebElement receiptsSection;

    @FindBy(xpath = "//li[@id='apps']")
    private WebElement appsSection;

    @FindBy(xpath = "//li[@id='redeem']")
    private WebElement codeActivation;

    public boolean isUserData() {
        waiter.waitUntilElementToBeClickable(userDataSection).click();
        List<WebElement> userData = Driver.getDriver().findElements(USER_DATA);
        boolean result = ElementHelper.isElementNotNullNotEmpty(userData);
        TabSwitch.tabSwitchOnParent(Driver.getDriver());
        return result;
    }
}
