Feature: login

Background:
    Given User navigates to application

Scenario: Valid login
    When User enters credentials
    | username | standard_user |
    | password | secret_sauce |

    And User clicks login button
    Then User navigates to homepage

Scenario: Invalid login
    When User enters credentials
    | username | standard_user |
    | password | wrongpassword |

    And User clicks login button
    Then error message should be displayed