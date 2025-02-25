Feature: DeleteMultipleProgram



Scenario: Verify Admin is able to select multiple programs
Given Admin is on Manage Program page 
When Admin selects more than one program by clicking on the checkbox
Then Programs get selected

Scenario: Verify Admin is able to delete Multiple programs
Given Admin is on Manage Program module page
When Admin clicks on the delete button on the left top of the program page
Then Admin lands on Confirmation form

Scenario: Verify Admin is able to click 'Yes' in multiple delete program
Given Admin is on Confirm Deletion alert in multiple delete
When Admin clicks "yes" button on the alert in program
Then Admin should land on Manage Program page 

Scenario: Verify Admin is able to click 'No' in multiple delete program
Given Admin is on Confirm Deletion alert in in multiple delete program
When Admin clicks "No" button on the alert in multiple delete program
Then Admin can see Programs are still selected and not deleted

Scenario: Verify Admin is able to close the window with "X"  in delete program
Given Admin is on Program Confirm Deletion Page after selecting a program to delete program
When Admin Clicks "X" button
Then Admin can see Confirm Deletion form disappears
