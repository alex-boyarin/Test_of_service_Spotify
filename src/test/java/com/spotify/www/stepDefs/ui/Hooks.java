package com.spotify.www.stepDefs.ui;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.model.ui.pages.login_page.StartPage;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
    private static StartPage startPage = new StartPage();
    private UserPage userPage = new UserPage();

    @BeforeAll
    public static void open() {
        startPage.openPage().closeCookie();
    }

    @After
    public void logout() {
        userPage.clickLogOutButton();
    }

    @AfterAll
    public static void close() {
        Driver.close();
    }
}
