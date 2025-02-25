@class
Feature: Class SearchBar

	Background: Admin is on the Class Page after logged in
    Given Check if Admin is logged in or not for the Class Module
    #When Admin clicks on Class on the Navigation Bar
    Then Admin should be on Manage Class Page in Class module

 Scenario Outline: Verify Admin is able to search Class by different inputs
  Given Admin is on Manage Class page in Class module 
  When Admin enters the input to search By Batch Name,Class topic,Staff Name from "<sheetname>" and "<scenarioName>" in the Class module
  Then Admin should see Class details are searched by respective inputs from "<sheetname>" and "<scenarioName>" in the Class module

Examples:

		|	sheetname	| scenarioName							|
		|	Class			|	searchByBatchName					|
		|	Class			|	searchByClassTopic				|
		|	Class			|	searchByStaffName				  |			


