Feature: Address Book functionality

  Scenario: Add new address using data table
    Given user logs into TutorialsNinja application
    When user adds new address with following details
    
      | firstname | John            |
      | lastname  | Doe             |
      | address1  | 123 Main Street |
      | city      | Chennai         |
      | postcode  | 600001          |
      | country   | India           |
      | region    | Tamil Nadu      |
      
    Then address should be added successfully
