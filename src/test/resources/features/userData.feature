Feature: Checking the availability of user data in the personal account

  Background: Start page is opened
    Given User open start page

  Scenario: Check user data
    When User click login button
    And User fills out the email and password form
    And User click submit button
    And User opens account section
    Then User checks his data
      | alex25091986@gmail.com |
      | 24 сентября 1986 г.    |
      | Беларусь               |
