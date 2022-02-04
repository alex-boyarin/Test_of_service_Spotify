package test;

import com.spotify.www.common.driver.Driver;
import com.spotify.www.model.ui.pages.StartPage;
import com.spotify.www.model.ui.pages.UserPage;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .clickUserLinkButton()
                .clickAccountSection()
                .isUserData();
        //System.out.println(actualResult);
        assertTrue(actualResult);
        new UserPage().clickUserLinkButton().clickLogOutButton();
    }


    @ParameterizedTest
    @ValueSource(strings = {"Alex"})
    public void test3(String expectedName) {
        String actualName = new StartPage()
                .clickLogInButton()
                .fillLogInForm()
                .clickLogInButton()
                .clickUserLinkButton()
                .clickProfileSection()
                .getUserName();
        assertEquals(expectedName, actualName);
        new UserPage().clickUserLinkButton().clickLogOutButton();
    }

    @AfterAll
    public static void close() {
        driver.close();
    }
}