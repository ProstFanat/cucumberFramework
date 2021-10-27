Feature:test I can win

  @first
  Scenario: i can win
    Given open page cucumber
    When user click on button search
    And user input "Announces" in search field
    When user filter results by Blog parameter
    When user open first link
    Then page with title from first link is opened