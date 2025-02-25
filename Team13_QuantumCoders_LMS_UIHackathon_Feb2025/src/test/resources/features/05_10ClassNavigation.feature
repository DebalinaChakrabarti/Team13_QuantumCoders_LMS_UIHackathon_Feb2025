Feature: Navigation Validation from Manage Class to other Pages


Scenario: Verify Class link on navigation bar
 Given Admin is in home page after login for class module
 When Admin clicks on Class link on Manage Class page
 Then Admin is redirected to class page

Scenario: Verify Class link to other page on navigation bar
Given Admin is on Manage Class page
When Admin clicks on Program link on Manage Class page
Then Admin is redirected to Program page link they clicked.

Scenario: Logout link on navigation bar
Given Admin is on Manage Class page
When Admin clicks on Logout link on Manage Class page
Then Check if Admin is redirected to Login page