@Class
Feature: Class Page Validation


 Scenario Outline: Validate login with valid credentials
Given Admin is in login Page.
When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
Then Admin should land on dashboard page  

Examples: 
|sheetname |scenarioName							|	
| Login    |LoginWithValidCredentials|
 
  Scenario Outline: Validating fields in the class manage page
  	Given Admin is on the home page after login in class module
  	When Admin clicks the Class Navigation bar in the Header
    Then Admin should see '<expectedField>' in class module

    Examples: 
      | expectedField                   																																							|
      | Manage class page 																																														|
      | LMS-Learning Management System Title                        																									|
      | Mange Class Header                        																																		|
      | Search Bar                  																																									|
      | datatable heading like Batchname,class topic,class description,status,class Date,staff name,Edit/Delete       |
      | "showing x to y of  z entries" and enabled pagination controls under the data table                           |
      | Sort icon of all the field in the datatable                     																							|
      | Delete button under the Manage class page header                     																					|
      | Total no of classes in below of the data table                     																						|
      