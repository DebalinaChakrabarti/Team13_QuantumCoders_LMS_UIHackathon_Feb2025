Feature: Scenarios related to Home Page functionality

@successfulLogin
Scenario Outline: Verify Admin is able to land on Home page
Given Admin is in login Page.
Then Admin should land on login page
When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
Then Admin should land on Home page  

Examples: 
|sheetname |scenarioName						 |	
| Login    |LoginWithValidCredentials|

@HomePageNavigationBarTexts
Scenario Outline: Validate navigation bar text on Home Page
Given Admin is in login Page.
Then Admin should land on login page
When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
Then Admin validate navigation bar texts on Home Page

Examples: 
|sheetname |scenarioName						 |	
| Login    |LoginWithValidCredentials|

@WelcomeNoteAndRole
Scenario Outline: Validate navigation bar text on Home Page
Given Admin is in login Page.
Then Admin should land on login page
When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
Then Admin validate welcome Note and role

Examples: 
|sheetname |scenarioName						 |	
| Login    |LoginWithValidCredentials|