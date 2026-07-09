Feature: Account Registration

    Background: 
        Given user navigates to demowebshop application
        When the user clicks register button
        Then user redirects to register page 

  Scenario Outline: Verify user can register a new account with valid details

    When the user enters "<gender>", "<firstName>", "<lastName>", "<email>", and "<password>"
    And the user clicks the Register button
    Then the account should be created successfully

    Examples:
      | gender | firstName | lastName | email | password |
      | male | Vetri | B | testing87473987@gmail.com | Vetri@2005 |

  Scenario Outline: Verify user cannot register with an existing email address

    When the user enters "<gender>", "<firstName>", "<lastName>", "<email>", and "<password>"
    And the user clicks the Register button
    Then an error message should be displayed indicating the email already exists

    Examples:
      | gender | firstName | lastName | email | password |
      | male | Vetri | B | testing@gmail.com | Vetri@2005 |