@login
Feature: Login

Background: Admin gives the correct LMS portal URL


Scenario Outline: Validate login with valid credentials
Given Admin is in login Page.
When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
Then Admin should land on dashboard page  

Examples: 
|sheetname |scenarioName							|	
| Login    |LoginWithValidCredentials|
