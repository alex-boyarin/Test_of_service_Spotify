package com.spotify.www.stepDefs.ui;

import com.spotify.www.model.ui.pages.login_page.LogInPage;
import com.spotify.www.model.ui.pages.login_page.StartPage;
import com.spotify.www.model.ui.pages.manage_steps.ManageAccountSteps;
import com.spotify.www.model.ui.pages.user_pages.UserAccount;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class CommonUserDataStepsDefs {
    private StartPage startPage = new StartPage();
    private LogInPage logInPage = new LogInPage();
    private UserPage userPage = new UserPage();
    private UserAccount userAccount = new UserAccount();

    @When("User click login button")
    public void userClickLoginButton() {
        startPage.clickLogInButton();
    }

    @And("User fills out the email and password form")
    public void userFillsOutTheEmailAndPasswordForm() {
        logInPage.fillLogInForm();
    }

    @And("User click submit button")
    public void userClickSubmitButton() {
        logInPage.submit();
    }

    @And("User opens account section")
    public void userOpensAccountSection() {
        userPage.clickUserLinkButton()
                .clickAccountSection();

    }

    @Then("User should see all his data")
    public void userShouldSeeAllHisData(List<String> expectedElement) {
        Assertions.assertTrue(userAccount.isUserData(expectedElement));
    }

    @And("User logout")
    public void userLogout() {
        userPage.clickLogOutButton();
    }
}
