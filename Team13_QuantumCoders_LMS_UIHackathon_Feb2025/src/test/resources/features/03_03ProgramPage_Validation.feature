
Feature: Program Validation feature
Background: Admin is logged in to LMS Portal

#Scenario Outline: Validate login with valid credentials
#Given Admin is in login Page.
#When Admin enter valid  credentials with "<sheetname>" and "<scenarioName>" and clicks login button in login module.
#Then Admin should land on dashboard page  
#
#Examples: 
#|sheetname |scenarioName							|	
#| Login    |LoginWithValidCredentials|
   
   Scenario:  Verify heading in manage program 
    Given Admin is on home page after Login.
    When Admin clicks "Program" on the navigation bar
    Then Admin should see the heading "Manage Program".
    
  Scenario: Verify view details of programs
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should able to see Program name, description, and status for each program
    
    Scenario: Verify the Multiple Delete button state 
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see a Delete button in left top is disabled
    
    Scenario: Verify the Search button 
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see Search bar with text as "Search..."
   
    Scenario: Verify checkbox default state beside Program Name column header
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see checkbox default state as unchecked beside Program Name column header 
    
    Scenario: Verify checkboxes default state beside each Program names in the data table 
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see check box default state as unchecked on the left side in all rows against program name 
    
    Scenario: Verify Sort icon in manage program
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see the sort arrow icon beside to each column header except Edit and Delete 
    
    Scenario: Verify edit and delete icon in manage program
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see the Edit and Delete buttons on each row of the data table
    
    Scenario: Verify pagination icons below data table in manage program
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see the text as "Showing x to y of z entries" along with Pagination icon below the table.
    #x- starting record number on that page y-ending record number on that page z-Total number of records
    
    Scenario: Verify footer message in manage program
    #Given Admin is on home page after Login
    #When Admin clicks "Program" on the navigation bar
    Then Admin should see the footer as "In total there are z programs".
    #z- Total number of records
    
    
       