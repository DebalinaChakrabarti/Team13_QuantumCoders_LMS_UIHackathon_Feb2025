@logout
 Feature: Validation on Logout button
 
Background: Admin gives the correct LMS portal URL

@VerifyLogout @VerifyBackButtonAfterLogOut
Scenario Outline: Verify the logout button Functonality
  Given Admin is in login Page.
  When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
  And Admin clicks the logout button on the Navigation Bar
  Then Admin should land on login page
  When user clicks on Back button
  Then user validates error message showing as ""


Examples: 
|sheetname |scenarioName						 |	
| Login    |LoginWithValidCredentials|