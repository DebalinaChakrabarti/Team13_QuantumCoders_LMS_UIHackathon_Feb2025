package stepDefinitions;

import java.io.IOException;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class AddNewClassPopUpSteps extends Constants {


	Context context;
	ClassPage classPage;
	int totalNoOfClassesBefore ;
	

	public AddNewClassPopUpSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}

	@Given("Admin is on the Class Popup window in class module")
	public void admin_is_on_the_class_popup_window_in_class_module() {
//		totalNoOfClassesBefore = classPage.getTotalNoOfClasses();		
		Assert.assertEquals(classPage.getClassPopUpHeaderName(), "Class Details");

	}

	@When("Admin selects class date in date picker in class module")
	public void admin_selects_class_date_in_date_picker_in_class_module() throws InterruptedException {
		classPage.selectClassDates();
	}

	@Then("Admin should see no of class value is added automatically in class module")
	public void admin_should_see_no_of_class_value_is_added_automatically_in_class_module() {
		classPage.isNoOfClassAutoPopulate();
		classPage.closeAddNewClassPopUp();
	}
	@When("Admin clicks date picker in class module")
	public void admin_clicks_date_picker_in_class_module() {
	}

	@Then("Admin should see weekends dates are disabled to select in class module")
	public void admin_should_see_weekends_dates_are_disabled_to_select_in_class_module() throws InterruptedException {
		classPage.isWeekendClassDateDisabled();
		classPage.closeAddNewClassPopUp();
	}

	@Given("Admin is on the Class Popup window after clicking Add New Class Link in class module")
	public void admin_is_on_the_class_popup_window_after_clicking_add_new_class_link_in_class_module() {
		classPage.clickClassLink();
		classPage.clickAddNewClassLink();
	}

	@When("Admin skips to add value in mandatory field and enter only the optional field in class module from {string} with scenario name {string}")
	public void admin_skips_to_add_value_in_mandatory_field_and_enter_only_the_optional_field_in_class_module_from_with_scenario_name(String string, String string2) {
	}

	@Then("Admin should see error message below the test field and the field will be highlighted in red color for {string} with scenario name {string} in class module")
	public void admin_should_see_error_message_below_the_test_field_and_the_field_will_be_highlighted_in_red_color_for_with_scenario_name_in_class_module(String sheetname, String scenarioname) throws IOException, InterruptedException {
		classPage.enterClassDetails(sheetname, scenarioname);
		classPage.clickCancelBtn();
	}

	@When("Admin clicks on save button without entering data in class module")
	public void admin_clicks_on_save_button_without_entering_data_in_class_module() {
	}

	@Then("Admin gets error message and class is not created in class module")
	public void admin_gets_error_message_and_class_is_not_created_in_class_module() throws InterruptedException {
		classPage.validateEmptyFormSubmissionErrors();
		classPage.clickCancelBtn();
	}
	

	@Given("Admin is on the Class Popup window after clicking Add New Class Link in class module.")
	public void admin_is_on_the_class_popupwindow_after_clicking_add_new_class_link_in_class_module() throws InterruptedException {
		classPage.clickClassLink();
		Thread.sleep(1000);
		totalNoOfClassesBefore = classPage.getTotalNoOfClasses();
		classPage.clickAddNewClassLink();
	}
	@When("Admin clicks Close\\(X) Icon on Class Details form in class module")
	public void admin_clicks_close_x_icon_on_class_details_form_in_class_module() {
	}
	@Then("Class Details popup window should be closed without saving in class module")
	public void class_details_popup_window_should_be_closed_without_saving_in_class_module() throws InterruptedException {
		classPage.validateCloseIconAddPopUp();
		Assert.assertEquals(totalNoOfClassesBefore,classPage.getTotalNoOfClasses(),"Class was created unexpectedly!");//Verify No New Class is Created

	}

	@When("Admin enters fields value in the form and clicks on save button from {string} with scenario name {string} in class module")
	public void admin_enters_mandatory_fields_in_the_form_and_clicks_on_save_button_from_with_scenario_name_in_class_module(String string, String string2) {
	}

	@Then("Admin gets message Class added Successfully from {string} with scenario name {string} with Admin can see the class details popup closed and adding new class in class module")
	public void admin_gets_message_class_added_successfully_from_with_scenario_name_in_class_module(String sheetname, String scenarioname) throws IOException, InterruptedException {
		classPage.enterClassDetails(sheetname, scenarioname);
		Assert.assertTrue(totalNoOfClassesBefore<classPage.getTotalNoOfClasses(),"Class was not created!");//Verify New Class is Created
	}




}
