Feature: Program Navigation Feature
Background: Admin is logged in to LMS Portal

Scenario Outline: Validate login with valid credentials
Given Admin is in login Page.
When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
Then Admin should land on dashboard page  

Examples: 
|sheetname |scenarioName							|	
| Login    |LoginWithValidCredentials|

  Scenario: Verify that Admin is able to navigate to Program page
    Given Admin is on home page after Login
    When Admin clicks "Program" on the navigation bar
    Then Admin should be navigated to Program page