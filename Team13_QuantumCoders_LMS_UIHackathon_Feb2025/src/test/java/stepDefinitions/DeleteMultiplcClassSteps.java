package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class DeleteMultiplcClassSteps extends Constants {

	Context context;
	ClassPage classPage;
	

	public DeleteMultiplcClassSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}


	@Given("Admin is in Manage Class page")
	public void admin_is_in_manage_class_page() {
	}

	@When("Admin clicks any checkbox in the data table in the class module")
	public void admin_clicks_any_checkbox_in_the_data_table_in_the_class_module() {
		classPage.selectOneClassChk();
	}

	@Then("Admin should see common delete option enabled under header Manage class in the class module")
	public void admin_should_see_common_delete_option_enabled_under_header_manage_class_in_the_class_module() {
		Assert.assertTrue(classPage.isEnabledCommonDeleteBtn(),"Common Delete Button is Disabled");
	}

	@Given("One of the checkbox row is selected  in the class module")
	public void one_of_the_checkbox_row_is_selected_in_the_class_module() {
		Assert.assertTrue(classPage.isSelectedClassChk().trim().contains("true"),"One of the checkbox row is not selected  in the class module");
	}

	@When("Click delete icon below {string} header  in the class module")
	public void click_delete_icon_below_header_in_the_class_module(String string) {
		classPage.clickCommonDeleteButton();
	}

	@Then("The respective row in the table is deleted after clicking YES in confirm delete form in the class module")
	public void the_respective_row_in_the_table_is_deleted_after_clicking_yes_in_confirm_delete_form_in_the_class_module() {
		classPage.deleteAlertConfirmYes();
	}

	@Given("One of the checkbox is selected  in the class module")
	public void one_of_the_checkbox_is_selected_in_the_class_module() {
		classPage.selectOneClassChk();
		Assert.assertTrue(classPage.isSelectedClassChk().trim().contains("true"),"One of the checkbox row is not selected  in the class module");
	}

	@When("Click delete icon below Manage Class header  in the class module")
	public void click_delete_icon_below_Manage_class_header_in_the_class_module() {
		classPage.clickCommonDeleteButton();
	}
	@Then("The respective row in the table is not Deleted after clicking NO in confirm delete form in the class module")
	public void the_respective_row_in_the_table_is_not_deleted_after_clicking_no_in_confirm_delete_form_in_the_class_module() {
		classPage.deleteAlertConfirmNo();
		//uncheck selected check box
		classPage.selectOneClassChk();
	}

	@Given("Two or more checkboxes row is selected  in the class module")
	public void two_or_more_checkboxes_row_is_selected_in_the_class_module() {
		classPage.selectMultipleClassChk();
	}

	@Then("The respective rows in the table is deleted after clicking YES in confirm delete form  in the class module")
	public void the_respective_rows_in_the_table_is_deleted_after_clicking_yes_in_confirm_delete_form_in_the_class_module() {
		classPage.commonDeleteMultipleAlertConfirmYes();
	}

	@Then("The respective rows in the table is not deleted after clicking NO in confirm delete form  in the class module")
	public void the_respective_rows_in_the_table_is_not_deleted_after_clicking_no_in_confirm_delete_form_in_the_class_module() {
		classPage.commonDeleteMultipleAlertConfirmNo();
	}


}
