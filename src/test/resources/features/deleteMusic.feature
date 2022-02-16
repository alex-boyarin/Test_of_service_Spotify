Feature: User removes music from library

  Scenario Outline: User removes albums from library
    When User click login button
    And User fills out the "email" and "password" form
    And User click submit button
    And User click section my media
    And User click section album
    And User chooses "<album>" click "Удалить из медиатеки"
    Examples:
      | album       |
      | Просвистела |
      | H2LO        |

  Scenario: User removes singer from library
    When User click login button
    And User fills out the "email" and "password" form
    And User click submit button
    And User click section my media
    And User click section singer
    And User chooses "Rammstein" click cancel "Подписка"