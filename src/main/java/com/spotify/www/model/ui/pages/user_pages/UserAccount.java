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

    private final By USER_DATA = By.xpath("//tbody//td[contains(@class,'StyledValue')]");

    @FindBy(id = "overview")
    private WebElement userDataSection;

    public boolean isUserData(List<String>expectedElement) {
        waiter.waitUntilElementToBeClickable(userDataSection).click();
        Driver.scrollPageUntilElementIsVisible(userDataSection);
        List<WebElement> actualElement = driver.findElements(USER_DATA);
        boolean result = ElementHelper.isElementPresent(expectedElement,actualElement);
        TabSwitch.tabSwitchOnParent(driver);
        return result;
    }
}
