Feature: login

Background:
    Given User navigates to application

Scenario: Valid login
    When User enters "valid" credentials
    And User clicks login button
    Then User navigates to homepage


Scenario: Invalid login
    When User enters "invalid" credentials
    And User clicks login button
    Then error message should be displayed