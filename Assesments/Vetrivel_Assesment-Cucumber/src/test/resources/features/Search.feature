Feature: Search functionality

  Scenario Outline: Verify product search using different keywords
    Given user launches the TutorialsNinja application
    When user searches for "<keyword>"
    Then search result should "<result_status>" the product

    Examples:
      | keyword | result_status |
      | iPhone  | contain        |
      | Samsung | contain        |
      | jcanib | not contain    |
