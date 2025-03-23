Feature: login with  both valid and invalid

Background: 
          Given user is on login page

Scenario: login with valid credintails
 
         When  user enter valid username and password
         And user click on login button 
         Then user is on homepage

Scenario: login with invalid credintails
 
         When  user enter invalid username and password
         And user click on login button 
         Then Error message is dispayed