@class
Feature: Delete Multiple Classes

 	Background: Admin is on the Class Page after logged in
 		Given Admin Is on the Manage class page after login in class module
 
 
 
  Scenario: Validate Common Delete button enabled after clicking on any checkbox 
  	Given Admin is in Manage Class page 
    When Admin clicks any checkbox in the data table in the class module
    Then Admin should see common delete option enabled under header Manage class in the class module


  Scenario: Check for single row delete
    Given One of the checkbox row is selected  in the class module
    When Click delete icon below 'Manage Class' header  in the class module
    Then The respective row in the table is deleted after clicking YES in confirm delete form in the class module

    Given One of the checkbox is selected  in the class module
    When Click delete icon below Manage Class header  in the class module
    Then The respective row in the table is not Deleted after clicking NO in confirm delete form in the class module

 
  Scenario: Check for multi row delete
    Given Two or more checkboxes row is selected  in the class module
    When Click delete icon below 'Manage Class' header  in the class module
    Then The respective rows in the table is deleted after clicking YES in confirm delete form  in the class module

    Given Two or more checkboxes row is selected  in the class module
    When Click delete icon below 'Manage Class' header  in the class module
    Then The respective rows in the table is not deleted after clicking NO in confirm delete form  in the class module
    