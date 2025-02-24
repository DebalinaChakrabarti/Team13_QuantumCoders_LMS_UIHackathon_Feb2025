@class
 Feature: Class Sorting Validation

 	Background: Admin is on the Class Page after logged in
 		Given Admin Is on the Manage class page after login in class module
    Then Admin should be on Manage Class Page in Class module
 #		
    #Given Check if Admin is logged in or not for the Class Module
    #When Admin clicks on Class on the Navigation Bar


  Scenario: Sort Class by Batch name
    Given Admin is on Manage Class page in the Class module
    When Admin clicks the sort icon of Batch name column in the Class module
    Then The data get sorted on the table based on the Batch name column values in ascending order in the Class module

    Given The data is in the ascending order on the table based on Batch name column in the Class module
    When Admin clicks the sort icon of Batch Name column to sort Batch name in descending order in the Class module
    Then The data get sorted on the table based on the Batch name column values in descending order in the Class module

  Scenario: Sort Class by Class topic
    Given Admin is on Manage Class page in the Class module
    When Admin clicks the sort icon of Class Topic column in the Class module
    Then The data get sorted on the table based on the Class Topic column values in ascending order in the Class module

    Given The data is in the ascending order on the table based on Class Topic column in the Class module
    When Admin clicks the sort icon of Class Name column to sort Class Topic in descending order in the Class module
    Then The data get sorted on the table based on the Class Topic column values in descending order in the Class module
 
  Scenario: Sort Class by Class Description
    Given Admin is on Manage Class page in the Class module
    When Admin clicks the sort icon of Class Description column in the Class module
    Then The data get sorted on the table based on the Class Description column values in ascending order in the Class module

    Given The data is in the ascending order on the table based on Class Description column in the Class module
    When Admin clicks the sort icon of Class Description column to sort Class Description in descending order in the Class module
    Then The data get sorted on the table based on the Class Description column values in descending order in the Class module

  Scenario: Sort Class by Status
    Given Admin is on Manage Class page in the Class module
    When Admin clicks the sort icon of Class Status column in the Class module
    Then The data get sorted on the table based on the Class Status column values in ascending order in the Class module
    
    Given The data is in the ascending order on the table based on Class Status column in the Class module
    When Admin clicks the sort icon of Class Status column to sort Class status in descending order in the Class module
    Then The data get sorted on the table based on the Class Status column values in descending order in the Class module

   Scenario: Sort Class by Class date
    Given Admin is on Manage Class page in the Class module
    When Admin clicks the sort icon of Class date column in the Class module
    Then The data get sorted on the table based on the Class date column values in ascending order in the Class module
    
    Given The data is in the ascending order on the table based on Class date column in the Class module
    When Admin clicks the sort icon of Class Status column to sort Class date in descending order in the Class module
    Then The data get sorted on the table based on the Class date column values in descending order in the Class module
 
   Scenario: Sort Class by staff name
    Given Admin is on Manage Class page in the Class module
    When Admin clicks the sort icon of staff name column in the Class module
    Then The data get sorted on the table based on the staff name column values in ascending order in the Class module
    
    Given The data is in the ascending order on the table based on staff name column in the Class module
    When Admin clicks the sort icon of Class Status column to sort staff name in descending order in the Class module
    Then The data get sorted on the table based on the staff name column values in descending order in the Class module
    