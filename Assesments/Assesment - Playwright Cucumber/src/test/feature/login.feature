Feature: Login to the Demo Web Shop application

  Background:
    Given user navigates to demowebshop application
    When the user clicks login button
    Then user redirects to login page

  @validLogin
  Scenario: Verify user can login with valid credentials
    When the user enters "valid" login credentials
    And the user clicks the login button
    Then user should be successfully logged in

  @invalidLogin
  Scenario: Verify user cannot login with an invalid password
    When the user enters "invalid" login credentials
    And the user clicks the login button
    Then user should not be successfully logged in