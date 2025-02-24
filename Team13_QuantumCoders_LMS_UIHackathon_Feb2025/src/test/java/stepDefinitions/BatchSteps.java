package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BatchPage;
import pageObjects.LoginPage;
import utilities.Context;

public class BatchSteps {
	Context context;
	LoginPage loginPage;
	BatchPage batchPage;

	public BatchSteps(Context context) {
		this.context = context;
		loginPage = context.getLoginPage();
		batchPage = context.getBatchPage();

	}

	@Given("Admin is logged into the LMS portal")
	public void admin_is_logged_into_the_lms_portal() throws InterruptedException, IOException {
		batchPage.login();
		// log.info("Admin sucessfully logged into Portal");

	}

	@When("Admin clicks on the Batch menu from the header")
	public void admin_clicks_on_the_batch_menu_from_the_header() throws InterruptedException {
		batchPage.batchMenu();

	}

	@Then("Admin should be in Batch Page")
	public void admin_should_be_in_batch_page() {
		System.out.println("Admin is in batch Page");
		batchPage.pageRefresh();

	}

	@Then("Admin should see the LMS ,  Manage Batch Heading, Delete Icon in Batch Page")
	public void admin_should_see_the_lms_manage_batch_heading_delete_icon_in_batch_page() {
		batchPage.islmsDisplayed();
		batchPage.ismanagBatchDisplayed();
		batchPage.ismultideleteDisplayed();

	}

	@Then("Admin able to see edit,delete, checkbox icon in each row and enabled pagination control under the Batch data table")
	public void admin_able_to_see_edit_delete_checkbox_icon_in_each_row_and_enabled_pagination_control_under_the_batch_data_table() {
		batchPage.ispaginationDisplayed();
		batchPage.checkTableElements();
	}

	@Then("Admin should see the Batch name,Batch Description,Batch Status,No of classes, Programe name in Batch Page")
	public void admin_should_see_the_batch_name_batch_description_batch_status_no_of_classes_programe_name_in_batch_page()
			throws IOException {
		batchPage.datatableHeaderText();
	}

	@Then("Admin should to see the sort icon, Check box in the datatable header in Batch page")
	public void admin_should_to_see_the_sort_icon_check_box_in_the_datatable_header_in_batch_page() {
		batchPage.isSortDisplayed();
		batchPage.isCheckboxDisplayed();

	}

	@When("Admin clicks on batch menu")
	public void admin_clicks_on_batch_menu() throws InterruptedException {
		batchPage.batchMenu();

	}

	@Then("Admin able to see Add New Batch  menu bar")
	public void admin_able_to_see_add_new_batch_menu_bar() {
		System.out.println("Admin able to see Add New Batch:" + batchPage.isaddnewbatchDisplayed());

	}

	@Given("Admin Should see Add New Batch menu bar")
	public void admin_should_see_add_new_batch_menu_bar() {
		System.out.println("Admin able to see Add New Batch:" + batchPage.isaddnewbatchDisplayed());

	}

	@When("Admin clicks on {string} in Batch page")
	public void admin_clicks_on_in_batch_page(String string) throws InterruptedException {
		batchPage.addNewBatch();
	}

	@Then("Admin able te see popup window in Batch Page")
	public void admin_able_te_see_popup_window_in_batch_page() {
		System.out.println("Admin able to see Add New Batch Popup Window");

	}

	@Given("Admin Able to see popupwindow of Add New Batch")
	public void admin_able_to_see_popupwindow_of_add_new_batch() {
		System.out.println("Admin able to see Add New Batch Popup Window");

	}

	@When("Admin checks all the fields are displayed and enabled in Batch Popup")
	public void admin_checks_all_the_fields_are_displayed_and_enabled_in_batch_popup() {
		batchPage.popupValidation();
	}

	@Then("Admin clicks the <Close> button popup window is closed")
	public void admin_clicks_the_close_button_popup_window_is_closed() {
		batchPage.clickCancel();

	}

	@When("Admin clicks on <Save> button without any details")
	public void admin_clicks_on_save_button_without_any_details() throws InterruptedException {
		batchPage.batchMenu();
		batchPage.addNewBatch();
		batchPage.clickSave();

	}

	@Then("Admin gets error message alert")
	public void admin_gets_error_message_alert() {
		batchPage.getErrorProgramNameMsg();
		batchPage.getErrorBatch1Msg();
		batchPage.getDescriptinMsg();
		batchPage.getErrorStatusMsg();
		batchPage.getNoOfClassesMsg();
		batchPage.clickCancel();

	}

	@When("Admin clicks on <Cancel> button selecting all the valid details")
	public void admin_clicks_on_cancel_button_selecting_all_the_valid_details()
			throws IOException, InterruptedException {
		batchPage.batchMenu();
		batchPage.addNewBatch();
		batchPage.addnewBatchData();
		batchPage.clickCancel();
	}

	@Then("Admin sees closing popup window without creating newbatch")
	public void admin_sees_closing_popup_window_without_creating_newbatch() {
		System.out.println("Admin sees popup window is closed");

	}

	@When("Admin clicks on <Save> button selecting all the valid details")
	public void admin_clicks_on_save_button_selecting_all_the_valid_details() throws InterruptedException, IOException {
		batchPage.batchMenu();
		batchPage.addNewBatch();
		batchPage.addnewBatchData();
		batchPage.clickSave();

	}

	@Then("Admin gets Sucess message {string}")
	public void admin_gets_sucess_message(String string) {
		batchPage.sucessMessage();

	}

	@Given("Admin clicks on Edit button in Batch Page")
	public void admin_clicks_on_edit_button_in_batch_page() throws InterruptedException {
		batchPage.clickEdit();

	}

	@When("Admin edits the the batch details in Edit Page")
	public void admin_edits_the_the_batch_details_in_edit_page() throws InterruptedException, IOException {
		batchPage.editBatchData();
		batchPage.sucessMessage();

	}

	@Then("Admin gets Sucess message {string} Edit Message")
	public void admin_gets_sucess_message_edit_message(String string) {
		batchPage.sucessMessage();
	}

	@Given("Admin clicks on Search button in Batch Page")
	public void admin_clicks_on_search_button_in_batch_page() {
		batchPage.clickSearch();

	}

	@When("Admin enters valid Batch Name in search box")
	public void admin_enters_valid_batch_name_in_search_box() {
		batchPage.searchBatch();

	}

	@Then("Admin able to see the data in Data Table")
	public void admin_able_to_see_the_data_in_data_table() {
		System.out.println("Admin able to see the data in the Data Table");

	}

	@When("Admin clicks the delete icon on a specific batch row alert with {string} and {string} appears clicks No for deletion in Batch")
	public void admin_clicks_the_delete_icon_on_a_specific_batch_row_alert_with_and_appears_clicks_no_for_deletion_in_user(
			String string, String string2) throws InterruptedException {
		batchPage.clickDelete();
		batchPage.clickNo();

	}

	@Then("batch should still be listed in the data table in Batch")
	public void batch_should_still_be_listed_in_the_data_table_in_batch() {
		System.out.println("The selected batch still there in the datatable");

	}

	@When("Admin clicks the delete icon on specific row alert with yes and no appears clicks {string}  in Batch")
	public void admin_clicks_the_delete_icon_on_specific_row_alert_with_yes_and_no_appears_clicks_in_batch(
			String string) throws InterruptedException {
		batchPage.clickDelete();
		batchPage.clickYes();

	}

	@Then("success message apears in Batch")
	public void success_message_apears_in_batch() {
		batchPage.sucessMessage();

	}

	@When("Admin selects multiple batch rows and clicks the delete icon under the {string} header in Batch")
	public void admin_selects_multiple_batch_rows_and_clicks_the_delete_icon_under_the_header_in_batch(String string)
			throws InterruptedException {

		batchPage.clickDeleteMulti();
		Thread.sleep(5000);
		batchPage.clickYes();

	}

	@Then("selected batch rows are deleted from the data table in Batch")
	public void selected_batch_rows_are_deleted_from_the_data_table_in_batch() {
		batchPage.sucessMessage();
		batchPage.clickLogout();

	}

}
