Feature: sorting

Background:
    Given User navigates to application
    And User enters "valid" credentials
    And User clicks login button

Scenario: Sort products by name A to Z
    When User sorts products by "Name (A to Z)"
    Then products should be sorted in "ascending" order by "name"

Scenario: Sort products by name Z to A
    When User sorts products by "Name (Z to A)"
    Then products should be sorted in "descending" order by "name"

Scenario: Sort products by price low to high
    When User sorts products by "Price (low to high)"
    Then products should be sorted in "ascending" order by "price"

Scenario: Sort products by price high to low
    When User sorts products by "Price (high to low)"
    Then products should be sorted in "descending" order by "price"
