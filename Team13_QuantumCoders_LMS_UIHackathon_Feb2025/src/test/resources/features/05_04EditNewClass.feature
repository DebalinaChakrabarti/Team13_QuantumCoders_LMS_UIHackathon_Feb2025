@class
Feature: Edit New Class

	Background: Admin is on the Class Page after logged in
    Given Check if Admin is logged in or not for the Class Module
    #When Admin clicks on Class on the Navigation Bar
    Then Admin should be on Manage Class Page in Class module

 
  Scenario: Validate row level edit icon in Class Module
    Given Admin is on Manage Class page in Class module
    When Admin clicks on the edit icon on the Class table 
    Then A new pop up with class details appears on the Class table

   Scenario: Check disabled batch name in the Class PopUp in Class Module
    Given Admin is on Manage Class page in Class module
    When Admin clicks on the edit icon on the Class table 
    Then Admin should see batch name field is disabled in the Class PopUp on the Class table
 
   Scenario: Check disabled class topic in the Class PopUp in Class Module
    Given Admin is on Manage Class page in Class module
    When Admin clicks on the edit icon on the Class table 
    Then Admin should see class topic field is disabled in the Class PopUp on the Class table
 
   Scenario Outline: Check if the fields are updated with valid data in Class Module
    Given Admin is on the Edit Class Popup window in Class module
    When Admin Update the fields with valid data and click save on the Class PopUp from "<sheetName>" with scenario name "<scenarioName>"
    Then Admin gets message "class details updated Successfully " and see the updated values in data table on the Class table from "<sheetName>" with scenario name "<scenarioName>"

    Examples: 
      | sheetName | scenarioName                			|
      | Class     | editClassWithOptionalFields 			|
      | Class     | editClassWithOnlyMandatoryFields 	|


   #Scenario: Check if the fields are updated with invalid values in Class Module
    #Given Admin is on the Edit Class Popup window in Class module
    #When Update the fields with invalid values and click save on the Class PopUp 
    #Then Admin should get Error message on the Class module
#
   #Scenario: Check if the mandatory fields are updated with valid data in Class Module
    #Given Admin is on the Edit Class Popup window in Class module
    #When Update the mandatory fields with valid values and click save on the Class PopUp 
    #Then Admin gets message "Class details updated Successfully " and see the updated values in data table on the Class module
#
   #Scenario: Check if the optional fields are updated with valid data in Class Module
    #Given Admin is on the Edit Class Popup window in Class module
    #When Update the optional fields with valid values and click save on the Class PopUp 
    #Then Admin gets message "Class details updated Successfully " and see the updated values in data table on the Class module
#
   #Scenario: Validate invalid values in the text fields in the class popup in Class Module
    #Given Admin is on the Edit Class Popup window in Class module
    #When Admin enters only numbers or special char in the text fields on the Class PopUp 
    #Then Admin should get Error message on the Class module
#
   Scenario: Validate Cancel button on Class Edit popup in Class Module
    Given Admin is on the Edit Class Popup window in Class module
    When Admin clicks Cancel button on Class edit popup
    Then Admin can see the class details popup disappears and can see nothing changed for particular Class on the Class module
 