Feature: Сhange of tariff using an invalid card

  Scenario: Using invalid card number
    When User click login button
    And User fills out the email and password form
    And User click submit button
    And User opens tariff section
    And User click button begin
    And User chooses credit and debit card section
    And User fills card number "1234567891234567" expiry date "1222" security code "123"
    Then User should see message card number error "Введите действительный номер кредитной карты."
    And User is returned to user's main page
    And User logout

  Scenario: Using card expiration date is invalid
    When User click login button
    And User fills out the email and password form
    And User click submit button
    And User opens tariff section
    And User click button begin
    And User chooses credit and debit card section
    And User fills card number "1234567891234567" expiry date "1111" security code "123"
    Then User should see message expiry date error "Срок действия карты истек."
    And User is returned to user's main page
    And User logout