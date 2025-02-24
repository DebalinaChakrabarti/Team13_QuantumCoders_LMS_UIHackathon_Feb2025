@BatchPage
Feature: Batch Module

  @tag1
  Scenario: Validate Admin is in Batch Page
    Given Admin is logged into the LMS portal
    When Admin clicks on the Batch menu from the header
    Then Admin should be in Batch Page

  @tag2
  Scenario: Validation on the Batch Page
    #When Admin clicks on the Batch menu from the header
    Then Admin should see the LMS ,  Manage Batch Heading, Delete Icon in Batch Page

  @tag3
  Scenario: Validate pagination, edit, delete, checkbox on the Batch Page
    #When Admin clicks on the Batch menu from the header
    Then Admin able to see edit,delete, checkbox icon in each row and enabled pagination control under the Batch data table

  @tag4
  Scenario: Validate data table headers in Batch Page
    #When Admin clicks on the Batch menu from the header
    Then Admin should see the Batch name,Batch Description,Batch Status,No of classes, Programe name in Batch Page

  @tag5
  Scenario: Validate data table headers in Batch Page
    # When Admin clicks on the Batch menu from the header
    Then Admin should to see the sort icon, Check box in the datatable header in Batch page

  @tag6
  Scenario: Validate admin able to see Add New Batch
    #Given Admin is logged into the LMS portal
    When Admin clicks on batch menu
    Then Admin able to see Add New Batch  menu bar

  @tag7
  Scenario: Validate Add New Batch is Clickable
    Given Admin Should see Add New Batch menu bar
    When Admin clicks on "Add New Batch" in Batch page
    Then Admin able te see popup window in Batch Page

  @tag8
  Scenario: Validate Add New Batch Details
    Given Admin Able to see popupwindow of Add New Batch
    When Admin checks all the fields are displayed and enabled in Batch Popup
    Then Admin clicks the <Close> button popup window is closed

  @tag9
  Scenario: Validate Admin able to Add New Batch
    Given Admin Able to see popupwindow of Add New Batch
    When Admin clicks on <Save> button without any details
    Then Admin gets error message alert

  @tag10
  Scenario: Validate Admin able to Add New Batch
    #Given Admin Able to see popupwindow of Add New Batch
    When Admin clicks on <Cancel> button selecting all the valid details
    Then Admin sees closing popup window without creating newbatch

  @tag11
  Scenario: Validate Admin able to add new batch
    Given Admin Able to see popupwindow of Add New Batch
    When Admin clicks on <Save> button selecting all the valid details
    Then Admin gets Sucess message "Sucessfull"

  @tag12
  Scenario: Validate Admin able to Edit Batch Page
    Given Admin clicks on Edit button in Batch Page
    When Admin edits the the batch details in Edit Page
    Then Admin gets Sucess message "Sucessfull" Edit Message

  @tag13
  Scenario: Validate Search box in Batch Page
    Given Admin clicks on Search button in Batch Page
    When Admin enters valid Batch Name in search box
    Then Admin able to see the data in Data Table

  @tag14
  Scenario: Validate Delete in Batch Page
    When Admin clicks the delete icon on a specific batch row alert with 'yes' and 'no' appears clicks No for deletion in Batch
    Then batch should still be listed in the data table in Batch
    When Admin clicks the delete icon on specific row alert with yes and no appears clicks "Yes"  in Batch
    Then success message apears in Batch

  @tag15
  Scenario: Validate the delete functionality with multiple selections
    When Admin selects multiple batch rows and clicks the delete icon under the "Manage Batch" header in Batch
    Then selected batch rows are deleted from the data table in Batch
    
   
