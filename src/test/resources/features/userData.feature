Feature: Checking the availability of user data in the personal account

  Scenario: Check user data
    When User click login button
    And User fills out the "email" and "password" form
    And User click submit button
    And User opens account section
    Then User should see all his data
      | alex25091986@gmail.com |
      | 24 сентября 1986 г.    |
      | Беларусь               |
    And User logout

