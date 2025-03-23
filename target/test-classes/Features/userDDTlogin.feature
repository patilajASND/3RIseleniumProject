Feature: feature to login with valid credentials

@smoketest
  Scenario Outline: user should be logged in successfully
    Given user is on saucedemo page
    When user enters the <username> and <password>
    And user clicks on login  button
    Then user should Navigate to homepage

    Examples: 
    
              |      username          |  password    |
              |standard_user           |secret_sauce  |
              | locked_out_user        |secret_sauce  |
              | problem_user           |secret_sauce  |
              | performance_glitch_user|secret_sauce  |
            