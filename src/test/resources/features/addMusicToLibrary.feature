Feature: User adds music to the library

  Scenario Outline: User adds albums to library
    When User click login button
    And User fills out the "email" and "password" form
    And User click submit button
    And User click section search
    And User enters "<album_name>"
    And User click section "Лучший результат"
    And User click button add "Добавить в медиатеку"
    And User click section my media
    And User click section album
    Then User should see list
    Examples:
      | album_name                                  |
      | Bohemian Rhapsody (The Original Soundtrack) |
      | Просвистела                                 |
      | Я никому не верю                            |
      | H2LO                                        |

  Scenario: User adds singer to library
    When User click login button
    And User fills out the "email" and "password" form
    And User click submit button
    And User click section search
    And User enters "Rammstein"
    And User click section "Лучший результат"
    And User click button subscribe "Подписаться"
    And User click section my media
    And User click section singer
    Then User should see list

  Scenario: User adds song to favorite track section
    When User click login button
    And User fills out the "email" and "password" form
    And User click submit button
    And User click section search
    And User enters "Родина"
    And User click section "Лучший результат"
    And User click button adds "Родина" to favorite track "Добавить в любимые треки"
    And User click section my media
    And User click section my favorite track
    Then User should see listTracks