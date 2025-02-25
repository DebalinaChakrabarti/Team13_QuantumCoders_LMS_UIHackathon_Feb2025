Feature: Add New Program
Background: Admin is on program page after reaching home

#Scenario Outline: Validate login with valid credentials
#Given Admin is in login Page.
#When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
#Then Admin should land on dashboard page  
#
#Examples: 
#|sheetname |scenarioName							|	
#| Login    |LoginWithValidCredentials|

    Scenario: Verify sub menu displayed in program menu bar
    Given Admin is on program page after reaching home
    When  Admin clicks "Program" on the navigation bar
    Then Admin should see sub menu in menu bar as "Add New Program"
    
    Scenario: Verify add New Program
    Given Admin is on Program page
    When Admin clicks on "Add New Program" under the "Program" menu bar
    Then Admin should see pop up window for program details
    
    Scenario: Verify title of the pop up window
    #Given Admin is on Program Page
    #When Admin click on "Add New Program" under the "Program" menu bar
    Then Admin should see window title as "Program Details" in Add
    
    Scenario: Verify mandatory fields with red asterisk mark 
    #Given Admin is on Program page
    #When Admin clicks on "Add New Program" under the "Program" menu bar
    Then Admin should see red  asterisk mark  beside mandatory field "Name"
    
    Scenario: Verify empty form submission
    #Given Admin is on Program details form
    When Admin clicks save button without entering mandatory 
    Then Admin gets message '<field> is required'
    
    Scenario: Verify cancel button
    #Given Admin is on Program details form
    When Admin clicks Cancel button
    Then Admin can see Program Details form disappears 
    
    Scenario Outline: Verify enter Program and Description name
    Given Admin is on the Program details form
    When Admin enters "<sheetname>" and "<ScenarioName>" in the text box
    Then Admin can see the text entered 
    
    Examples: 
      | sheetname | ScenarioName    |
      | Program   | VerifyenterProgramandDescriptionname |
    
   
    Scenario: Verify select Status
    #Given Admin is on Program Details form
    When Admin selects the status of the program by clicking on the radio button "(Active/InActive)"
    Then Admin can see 'Active/Inactive' status selected
    
    Scenario: Verify Admin is able to save the program details
    #Given Admin is on Program details form.
    When Admin enter valid details for mandatory fields and Click on save button
    Then Admin gets message 'Successful Program created' 
    
    Scenario: Verify cancel program details
    #Given Admin is on Program details Form
    When Admin Click on cancel button
    Then Admin can see program details form disappear
    
    Scenario: Verify added Program is created
    Given Admin is on Program page in add
    When Admin searches with newly created "Program Name"
    Then Records of the newly created  "Program Name" is displayed and match the data entered
    
    Scenario: Verify close window with "X" 
    Given Admin is on program details form
    When Admin Click on "X" button in add
    Then Admin can see program details form disappear
    
    