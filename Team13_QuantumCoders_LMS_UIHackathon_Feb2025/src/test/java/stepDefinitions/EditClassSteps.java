package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class EditClassSteps extends Constants {

	Context context;
	ClassPage classPage;
	int totalNoOfClassesBefore ;
	

	public EditClassSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}

	@When("Admin clicks on the edit icon on the Class table")
	public void admin_clicks_on_the_edit_icon_on_the_class_table() throws InterruptedException {
		Thread.sleep(1000);
		classPage.clickEditClassLink();
	}

	@Then("A new pop up with class details appears on the Class table")
	public void a_new_pop_up_with_class_details_appears_on_the_class_table() throws InterruptedException {
		Assert.assertTrue(classPage.getClassPopUpHeaderName().contains("Class Details"));
		Thread.sleep(1000);
		classPage.closeAddNewClassPopUp();
	}

	@Then("Admin should see batch name field is disabled in the Class PopUp on the Class table")
	public void admin_should_see_batch_name_field_is_disabled_in_the_class_pop_up_on_the_class_table() {
		classPage.isBatchNameDisabled();
		classPage.closeAddNewClassPopUp();
	}

	@Then("Admin should see class topic field is disabled in the Class PopUp on the Class table")
	public void admin_should_see_class_topic_field_is_disabled_in_the_class_pop_up_on_the_class_table() {
		classPage.isClassTopicDisabled();
		classPage.closeAddNewClassPopUp();
	}

	@Given("Admin is on the Edit Class Popup window in Class module")
	public void admin_is_on_the_edit_class_popup_window_in_class_module() throws InterruptedException {
		totalNoOfClassesBefore = classPage.getTotalNoOfClasses();
		Thread.sleep(1000);
		classPage.clickEditClassLink();
		Thread.sleep(1000);

		Assert.assertEquals(classPage.getClassPopUpHeaderName(), "Class Details");
	}

	@When("Admin Update the fields with valid data and click save on the Class PopUp from {string} with scenario name {string}")
	public void admin_update_the_fields_with_valid_data_and_click_save_on_the_class_pop_up(String string, String string2) {
	}

	@Then("Admin gets message {string} and see the updated values in data table on the Class table from {string} with scenario name {string}")
	public void admin_gets_message_and_see_the_updated_values_in_data_table_on_the_class_table(String expectedMessage,String sheetname, String scenarioname) throws IOException, InterruptedException {
		classPage.enterClassDetails(sheetname, scenarioname);
	}

//	@When("Update the fields with invalid values and click save on the Class PopUp")
//	public void update_the_fields_with_invalid_values_and_click_save_on_the_class_pop_up() {
//	}
//
//	@Then("Admin should get Error message on the Class module")
//	public void admin_should_get_error_message_on_the_class_module() {
//	}
//
//	@When("Update the mandatory fields with valid values and click save on the Class PopUp")
//	public void update_the_mandatory_fields_with_valid_values_and_click_save_on_the_class_pop_up() {
//	}
//
//	@Then("Admin gets message {string} and see the updated values in data table on the Class module")
//	public void admin_gets_message_and_see_the_updated_values_in_data_table_on_the_class_module(String string) {
//	}
//
//	@When("Update the optional fields with valid values and click save on the Class PopUp")
//	public void update_the_optional_fields_with_valid_values_and_click_save_on_the_class_pop_up() {
//	}
//
//	@When("Admin enters only numbers or special char in the text fields on the Class PopUp")
//	public void admin_enters_only_numbers_or_special_char_in_the_text_fields_on_the_class_pop_up() {
//	}
//
//
	@When("Admin clicks Cancel button on Class edit popup")
	public void admin_clicks_cancel_button_on_class_edit_popup() {
	}

	@Then("Admin can see the class details popup disappears and can see nothing changed for particular Class on the Class module")
	public void admin_can_see_the_class_details_popup_disappears_and_can_see_nothing_changed_for_particular_class_on_the_class_module() throws InterruptedException {
		classPage.validateCancelEditPopUp();
		Assert.assertEquals(totalNoOfClassesBefore,classPage.getTotalNoOfClasses(),"Class was created unexpectedly!");//Verify No New Class is Created
	}


}
