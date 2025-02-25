@class
Feature: Add New Class popup


  Scenario: Check no of classes value added when selecting class dates in class module
    Given Admin is on the Class Popup window in class module 
    When Admin selects class date in date picker in class module
    Then Admin should see no of class value is added automatically in class module

   Scenario: Check weekend dates are disabled in calendar in class module
    Given Admin is on the Class Popup window in class module 
    When Admin clicks date picker in class module
    Then Admin should see weekends dates are disabled to select in class module
 
   Scenario Outline: Check if class is created when only optional fields are entered with valid data in class module
    Given Admin is on the Class Popup window after clicking Add New Class Link in class module 
    When Admin skips to add value in mandatory field and enter only the optional field in class module from "<sheetName>" with scenario name "<scenarioName>" 
    Then Admin should see error message below the test field and the field will be highlighted in red color for "<sheetName>" with scenario name "<scenarioName>" in class module
 
    Examples: 
      | sheetName | scenarioName                    |
      | Class     | addClassWithOnlyOptionalFields |

   #Scenario: check if class is created when invalid data is entered in all of the fields in class module
    #Given Admin is on the Class Popup window after clicking Add New Class Link in class module 
    #When Admin enters invalid data in all of the  fields in the form and clicks on save button in class module
    #Then Admin gets error message and class is not created in class module
 #
   Scenario: Empty form submission in class module
    Given Admin is on the Class Popup window after clicking Add New Class Link in class module  
    When Admin clicks on save button without entering data in class module
    Then Admin gets error message and class is not created in class module
    
 
   Scenario: Validate Cancel/Close(X) icon on class Details form in class module
    Given Admin is on the Class Popup window after clicking Add New Class Link in class module. 
    When Admin clicks Close(X) Icon on Class Details form in class module
    Then Class Details popup window should be closed without saving in class module
 
    
     Scenario Outline: Check if class is created when only mandatory fields are entered and when all fields are entered with valid data in class module
    Given Admin is on the Class Popup window after clicking Add New Class Link in class module. 
    When Admin enters fields value in the form and clicks on save button from "<sheetName>" with scenario name "<scenarioName>" in class module
    Then Admin gets message Class added Successfully from "<sheetName>" with scenario name "<scenarioName>" with Admin can see the class details popup closed and adding new class in class module

    Examples: 
      | sheetName | scenarioName                    |
      | Class     | addClassWithOnlyMandatoryFields |
      | Class     | addClassWithAllFields           |


  