package com.spotify.www.model.ui.pages.user_pages;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.common.helper.ElementHelper;
import com.spotify.www.common.helper.TabSwitch;
import com.spotify.www.model.ui.pages.base_page.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserAccount extends BasePage {

    private final By USER_DATA = By.xpath("//tbody");

    @FindBy(id = "overview")
    private WebElement userDataSection;

    public boolean isUserData() {
        waiter.waitUntilElementToBeClickable(userDataSection).click();
        Driver.scrollPageUntilElementIsVisible(userDataSection);
        List<WebElement> userData = driver.findElements(USER_DATA);
        boolean result = ElementHelper.isElementNotNullNotEmpty(userData);
        TabSwitch.tabSwitchOnParent(driver);
        return result;
    }
}
