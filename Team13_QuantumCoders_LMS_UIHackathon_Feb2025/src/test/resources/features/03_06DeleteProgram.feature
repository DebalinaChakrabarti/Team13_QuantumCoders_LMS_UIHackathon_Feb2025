Feature: Delete Program



Scenario: Verify delete feature
Given Admin is on Program page
When Admin clicks on delete button for a program
Then Admin will get confirm deletion popup

Scenario: Verify Admin is able to click 'Yes'
Given Admin is on Confirm Deletion alert in program
When Admin clicks on "Yes" button
Then Admin can see 'Successful Program Deleted' message

Scenario: Verify Admin is able to click 'No'
Given Admin is on Confirm Deletion alert in program again
When Admin clicks "No" button
Then Admin can see Confirmation form disappears

Scenario: Verify Admin is able to close the window with "X" 
Given Admin is on Program Confirm Deletion Page after selecting a program to delete
When Admin Click on "X" button
Then Admin can see Confirm Deletion form disappear
