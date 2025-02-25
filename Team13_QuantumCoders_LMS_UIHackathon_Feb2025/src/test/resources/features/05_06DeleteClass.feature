@class
 Feature: Delete Class


 	Background: Admin is on the Class Page after logged in
 		Given Admin Is on the Manage class page after login in class module
#    Then Admin should be on Manage Class Page in Class module

   Scenario: Validate row level delete icon in Class Module
    Given Admin is on Manage Class page in Class module
    When Admin clicks the delete icon on the Class table 
    Then Admin should see a alert open with heading "Confirm" along with  <YES> and <NO> button for deletion on the Class table
 
    Scenario: Validate Yes on deletion window in Class Module
    Given Admin is on Confirm Deletion alert in Class module
    When Admin clicks yes option on the Class table 
    Then Admin gets a message "Successful Class Deleted" alert and do not see that Class in the data table on the Class table

    Scenario: Validate No on deletion window in Class Module
    Given Admin is on Confirm Deletion alert after clicking Delete Icon in Class table
    When Admin clicks No option on the Class table 
    Then Admin can see the deletion alert disappears without deleting on the Class table

   Scenario: Validate Close(X) icon on Confirm Deletion alert in class module
    Given AAdmin is on Confirm Deletion alert in class module. 
    When Admin clicks on close button form in class module
    Then Admin can see the deletion alert disappears without any changes in class module
  