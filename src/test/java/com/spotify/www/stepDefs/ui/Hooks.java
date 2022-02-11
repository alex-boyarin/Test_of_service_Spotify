package com.spotify.www.stepDefs.ui;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.model.ui.pages.login_page.StartPage;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hooks {
    private static StartPage startPage = new StartPage();

    @BeforeAll
    public static void open() {
        startPage.openPage()
                .closeCookie();
    }

    @AfterAll
    public static void close() {
        Driver.close();
    }
}
