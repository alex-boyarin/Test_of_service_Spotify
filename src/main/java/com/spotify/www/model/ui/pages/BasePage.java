package com.spotify.www.model.ui.pages;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.common.waiter.Waiter;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected WebDriver webDriver = Driver.getDriver();
    protected Waiter waiter = new Waiter();
}
