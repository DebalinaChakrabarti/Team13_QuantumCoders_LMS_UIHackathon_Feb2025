package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class DeleteClassSteps extends Constants {
	
	Context context;
	ClassPage classPage;
	

	public DeleteClassSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}
	
	
	@When("Admin clicks the delete icon on the Class table")
	public void admin_clicks_the_delete_icon_on_the_class_table() {
		classPage.clickSpecificDeleteButton();
	}

	@Then("Admin should see a alert open with heading {string} along with  <YES> and <NO> button for deletion on the Class table")
	public void admin_should_see_a_alert_open_with_heading_along_with_yes_and_no_button_for_deletion_on_the_class_table(String string) {
		classPage.validateConfirmSpecificDeleteButton();
	}

	@Given("Admin is on Confirm Deletion alert in Class module")
	public void admin_is_on_confirm_deletion_alert_in_class_module() {
		classPage.isConfirmDeleteAlert();
	}

	@When("Admin clicks yes option on the Class table")
	public void admin_clicks_yes_option_on_the_class_table() {
	}

	@Then("Admin gets a message {string} alert and do not see that Class in the data table on the Class table")
	public void admin_gets_a_message_alert_and_do_not_see_that_class_in_the_data_table_on_the_class_table(String string) {
		classPage.deleteAlertConfirmYes();
	}

	@Given("Admin is on Confirm Deletion alert after clicking Delete Icon in Class table")
	public void admin_is_on_confirm_deletion_alert_after_clicking_Delete_Icon_in_class_module() {
		classPage.clickSpecificDeleteButton();
		classPage.isConfirmDeleteAlert();
	}

	@When("Admin clicks No option on the Class table")
	public void admin_clicks_no_option_on_the_class_table() {
	}

	@Then("Admin can see the deletion alert disappears without deleting on the Class table")
	public void admin_can_see_the_deletion_alert_disappears_without_deleting_on_the_class_table() {
		classPage.deleteAlertConfirmNo();
	}

	@Given("AAdmin is on Confirm Deletion alert in class module.")
	public void a_admin_is_on_confirm_deletion_alert_in_class_module() {
		classPage.clickSpecificDeleteButton();
		classPage.isConfirmDeleteAlert();
	}

	@When("Admin clicks on close button form in class module")
	public void admin_clicks_on_close_button_form_in_class_module() {
	}

	@Then("Admin can see the deletion alert disappears without any changes in class module")
	public void admin_can_see_the_deletion_alert_disappears_without_any_changes_in_class_module() {
		classPage.validateCloseIconConfirmDeleteAlert();
	}
	

}
