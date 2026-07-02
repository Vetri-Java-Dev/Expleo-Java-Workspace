Feature: Login Test

Background: 
    Given User clicks on login link

Scenario: Valid Login
    And User enters the email as "dharshan10@gmail.com"
    And User enters the password as "1234"
    When User clicks login button
    Then Login should be access

Scenario: Invalid Login
    And User enters the email as "bvetrivel@gmail.com"
    And User enters the password as "wrongpassword"
    When User clicks login button
    Then error message should be displayed