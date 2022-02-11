package com.spotify.www.model.ui.pages.manage_steps;

import com.spotify.www.model.ui.pages.login_page.StartPage;
import com.spotify.www.model.ui.pages.user_pages.UserAccount;
import com.spotify.www.model.ui.pages.user_pages.UserPage;
import com.spotify.www.model.ui.pages.user_pages.UserTariff;

public class ManageAccountSteps {

    public void openPage() {
        new StartPage()
                .openPage()
                .closeCookie();
    }

    public void logIn() {
        new StartPage()
                .clickLogInButton()
                .fillLogInForm()
                .submit();
    }

    public ManageAccountSteps userAccountSection() {
        new UserPage()
                .clickUserLinkButton()
                .clickAccountSection();
        return this;
    }

//    public boolean isUserData() {
//        //return new UserAccount().isUserData();
//    }

    public ManageAccountSteps UserTariffSection() {
        new UserPage()
                .clickUserLinkButton()
                .clickTariffChangeSection();
        return this;
    }

    public ManageAccountSteps getMessageError(String number, String date, String code) {
        new UserTariff()
                .clickOnButtonToBegin()
                .clickCreditAndDebitCardSection()
                .FillOutCardForm(number, date, code)
                .clickButtonSubmit();
        return this;
    }

//    public String getMessageCardNumberError() {
//        return new UserTariff().getMessageCardNumberError();
//    }

    public String getMessageExpiryDateError() {
        return new UserTariff().getMessageExpiryDateError();
    }
}
