package com.spotify.www.stepDefs.ui;

import com.spotify.www.model.ui.pages.user_pages.UserPage;
import com.spotify.www.model.ui.pages.user_pages.UserTariff;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChangeTariffStepDefs {
    private UserPage userPage = new UserPage();
    private UserTariff userTariff = new UserTariff();

    @And("User opens tariff section")
    public void userOpensTariffSection() {
        userPage.clickUserLinkButton()
                .clickTariffChangeSection();
    }

    @And("User click button begin")
    public void userClickButtonBegin() {
        userTariff.clickOnButtonToBegin();
    }

    @And("User chooses credit and debit card section")
    public void userChoosesCreditAndDebitCardSection() {
        userTariff.clickCreditAndDebitCardSection();
    }

    @And("User fills card number {string} expiry date {string} security code {string}")
    public void userFillsCardNumberExpiryDateSecurityCode(String number, String date, String code) {
        userTariff.FillOutCardForm(number, date, code);
    }

    @Then("User should see message card number error {string}")
    public void userShouldSeeMessageCardNumberError(String expectedMessage) {
        assertEquals(expectedMessage, userTariff.getMessageCardNumberError());
    }

    @Then("User should see message expiry date error {string}")
    public void userShouldSeeMessageExpiryDateError(String expectedMessage) {
        assertEquals(expectedMessage, userTariff.getMessageExpiryDateError());
    }

    @And("User is returned to user's main page")
    public void userIsReturnedToUserSMainPage() {
        userTariff.returnedToUserMainPage();
    }
}
