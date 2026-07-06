Feature: sorting products

Background:
    Given User navigates to application
    And User enters credentials
    | username | standard_user |
    | password | secret_sauce |

    And User clicks login button

Scenario Outline: Sort products
    When User sorts products by "<option>"
    Then products should be sorted in "<order>" order by "<name>"

    Examples:
        | option | order | field |
        |  Name (A to Z) | ascending  | name  |
        |  Name (Z to A) | descending | name  |
        |  Price (low to high) | ascending | price |
        |  Price (high to low) | descending | price |