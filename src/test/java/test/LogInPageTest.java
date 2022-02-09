package test;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.model.ui.pages.StartPage;
import com.spotify.www.model.ui.pages.UserPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LogInPageTest {
    private static StartPage startPage = new StartPage();
    private static WebDriver driver = Driver.getDriver();

    @BeforeAll
    public static void open() {
        startPage.openPage();
    }

    @Test
    public void test() {

        boolean actualResult = startPage
                .closeCookie()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .clickUserLinkButton()
                .clickAccountSection()
                .isUserData();
        assertTrue(actualResult);
        // new UserPage().clickUserLinkButton().clickLogOutButton();
    }

    @Test
    public void addAlbum() {
        startPage//.closeCookie()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .searchSection()
                .searchMusic()
                .searchResult()
                .addAlbum();
    }

    @Test
    public void addSinger() {
        startPage.closeCookie()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .searchSection()
                .searchMusic()
                .searchResult()
                .addSinger();
    }

    @BeforeEach
    public void logOut() {
        new UserPage().clickUserLinkButton().clickLogOutButton();
    }

    @AfterAll
    public static void close() {
       //  driver.close();
    }
}