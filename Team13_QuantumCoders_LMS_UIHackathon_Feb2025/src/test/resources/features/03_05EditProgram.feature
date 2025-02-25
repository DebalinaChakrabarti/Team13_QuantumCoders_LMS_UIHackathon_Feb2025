Feature: Edit Program

  Scenario: Verify Edit option
    When Admin clicks on Edit option for particular program
   Then Admin lands on Program details form

  Scenario: Verify title of the pop up window
    Given Admin is on Program Page
    When Admin clicks on Edit option for particular program again
    Then Admin should see window title as "Program Details"

  Scenario Outline: Verify edit Program Name
    Given Admin is on Program Details Popup window to Edit in program name
    When Admin edits the program name "<sheetname>" and  "<scenarioName>" and click on save button
    Then Updated program name is seen by the Admin

    Examples: 
      | sheetname | scenarioName    |
      | Program   | Editprogramname |

  Scenario Outline: Verify edit Description
    Given Admin is on Program Details Popup window to Edit in program Description
    When Admin edits the program description "<sheetname>" and  "<scenarioName>" and click on save button
    Then Updated program description is seen by the Admin

    Examples: 
      | sheetname | scenarioName           |
      | Program   | Editprogramdescription |

  Scenario: Verify edit Status
    Given Admin is on Program Details Popup window to Edit in status
    When Admin can change the status of the program and click on save button
    Then Status updated can be viewed by the Admin

  Scenario: Verify Admin is able to click Save
    Given Admin is on Program Details Popup window to Edit in program
    When Admin click on save button
    Then Admin gets a message "Successful Program Updated" alert
    Scenario: Verify Admin is able to click Cancel
Given Admin is on Program Details Popup window to Edit
When Admin clicks cancel button on edit popup in program
Then Admin can see the Program details popup disappears

    
