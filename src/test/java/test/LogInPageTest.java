package test;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.model.ui.pages.login_page.StartPage;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
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
    public void aest() {

        boolean actualResult = startPage
                .closeCookie()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .clickUserLinkButton()
                .clickAccountSection()
                .isUserData();
        assertTrue(actualResult);
        new UserPage().clickUserLinkButton().clickLogOutButton();
    }

    @Test
    public void bddAlbum() {
        startPage.closeCookie()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .searchSection()
                .searchMusic()
                .searchResult()
                .addAlbum();
        new UserPage().clickUserLinkButton().clickLogOutButton();
    }

    @Test
    public void cddSinger() {
        startPage.closeCookie()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .searchSection()
                .searchSinger()
                .searchResult()
                .addSinger();
        new UserPage().clickUserLinkButton().clickLogOutButton();
    }

   @Test
   public void dddSong(){
        startPage.closeCookie()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .searchSection()
                .searchSong()
                .searchResult()
                .addSong();
       new UserPage().clickUserLinkButton().clickLogOutButton();
   }

    @AfterAll
    public static void close() {
        driver.close();
    }
}