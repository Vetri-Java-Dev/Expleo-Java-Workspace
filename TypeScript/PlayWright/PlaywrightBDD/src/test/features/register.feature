Feature: Register new Account

Background: 
    Given User navigates to the application
    And User clicks on register link

Scenario: Valid Registration
    And User enters the first name as "<firstName>"
    And User enters the last name as "<lastName>"
    And User enters the email as "<email>" for registration
    And User enters the phone as "<phone>"
    And User enters the password as "<password>" and confirmation password as "<password>"
    And User accepts privacy policy
    When User clicks register button
    Then success message should be visible

    Examples:
        | firstName | lastName | email | phone | password |
        | vetrivel  | b  | bvetrivel48776487@gmail.com | 7896541230 | Vetri@2005 |