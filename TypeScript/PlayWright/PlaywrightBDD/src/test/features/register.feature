Feature: Register new Account

Background: 
    Given User navigates to the application
    And User clicks on register link

Scenario: Valid Registration
    And User enters the first name as "vetrivel"
    And User enters the last name as "b"
    And User enters the email as "bvetrivel1428764876438@gmail.com" for registration
    And User enters the phone as "7896541230"
    And User enters the password as "Vetri@2005" and confirmation password as "Vetri@2005"
    And User accepts privacy policy
    When User clicks register button
    Then success message should be visible