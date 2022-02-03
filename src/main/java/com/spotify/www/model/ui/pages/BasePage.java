package com.spotify.www.model.ui.pages;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.common.waiter.Waiter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver = Driver.getDriver();
    protected Waiter waiter = new Waiter();
    protected BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
