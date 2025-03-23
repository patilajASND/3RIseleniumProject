Feature: feature to search on to Goggle

@smoketest
  Scenario: serach item in goggle
    Given user is on goggle page
    When user enters item name in search textfeild
    And user clicks on search button
    Then products details should display
