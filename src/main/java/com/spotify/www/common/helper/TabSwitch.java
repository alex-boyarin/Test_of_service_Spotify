package com.spotify.www.common.helper;

import com.spotify.www.common.driver.Driver;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public final class TabSwitch {
    private static List<String> tabs = new ArrayList<>(Driver.getDriver().getWindowHandles());

    private TabSwitch() {
    }

    public static void tabSwitch(WebDriver driver) {
        driver.switchTo().window(tabs.get(1));
    }

    public static void tabSwitchOnParent(WebDriver driver) {
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }
}
