Feature: User adds music to the library

  Scenario: User adds album to library
    When User click login button
    And User fills out the "email" and "password" form
    And User click submit button
    And User click section search
    And User enters "Bohemian Rhapsody (The Original Soundtrack)"
    And User click section "Лучший результат"
    And User click button add "Добавить в медиатеку"
    And User click section my media
    And User click section album
    Then User should see list
    And User chooses "Bohemian Rhapsody (The Original Soundtrack)" click "Удалить из медиатеки"

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
    And User chooses "Rammstein" click cancel "Подписка"

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
    And User select from list "Родина" click remove from "Удалить из любимых треков"