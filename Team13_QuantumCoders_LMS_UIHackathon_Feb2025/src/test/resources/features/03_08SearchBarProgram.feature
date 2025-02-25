Feature: Search Bar program

Scenario: Verify Admin is able to search results found for program name
When Admin enter the program to search By program name
Then Admin should able to see Program name, description, and status for searched program name

Scenario: Verify Admin is able to search results found for program description
When Admin enter the program to search By program description
Then Admin should able to see Program name, description, and status for searched program description

Scenario: Verify Admin is able to search results not found
When Admin enter the program to search By program name that does not exist
Then There should be zero results.

Scenario: Verify Admin is able to search with partial program name
    When Admin enter the program to search By partial name of program
    Then Admin should able to see Program name, description, and status for searched program name 
