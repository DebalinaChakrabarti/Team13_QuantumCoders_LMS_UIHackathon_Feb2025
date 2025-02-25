package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.ProgramPageTwo;
import utilities.Constants;
import utilities.Context;

public class MultipleDeleteProgramSteps extends Constants{
	Context context;
	ProgramPageTwo programPage;
	public MultipleDeleteProgramSteps(Context context) {
		this.context = context;
		programPage = context.getEditProgramPage();
	}
	
	@Given("Admin is on Manage Program page")
	public void admin_is_on_program_page_after_reaching_home() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	}

	@When("Admin selects more than one program by clicking on the checkbox")
	public void admin_selects_more_than_one_program_by_clicking_on_the_checkbox() {
	    programPage.clickAnyCheckbox();
	    programPage.clickMultipleCheckbox();
	}

	@Then("Programs get selected")
	public void programs_get_selected() {
	   log.info("Programs Selected");
	}

	@Given("Admin is on Manage Program module page")
	public void admin_is_on_manage_program_module_page() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	}

	@When("Admin clicks on the delete button on the left top of the program page")
	public void admin_clicks_on_the_delete_button_on_the_left_top_of_the_program_page() {
		programPage.clickAnyCheckbox();
		 programPage.clickMultipleCheckbox();
	    programPage.click_DeleteBtn();
	}

	@Then("Admin lands on Confirmation form")
	public void admin_lands_on_confirmation_form() {
	   log.info("Admin lands on Confirmation Form");
	}

	@Given("Admin is on Confirm Deletion alert in multiple delete")
	public void admin_is_on_confirm_deletion_alert_in_multiple_delete() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickAnyCheckbox();
		//programPage.clickMultipleCheckbox();
	    programPage.click_DeleteBtn();
	}

	@When("Admin clicks {string} button on the alert in program")
	public void admin_clicks_button_on_the_alert_in_program(String string) {
		 programPage.clickYesBtn();
		 
	}

	@Then("Admin should land on Manage Program page")
	public void admin_should_land_on_manage_program_page() {
	  
	}

	@Given("Admin is on Confirm Deletion alert in in multiple delete program")
	public void admin_is_on_confirm_deletion_alert_in_in_multiple_delete_program() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickAnyCheckbox();
	    programPage.click_DeleteBtn();
	}
	@When("Admin clicks {string} button on the alert in multiple delete program")
	public void admin_clicks_no_in_multiple_delete_program(String string) {
		   programPage.clickNoBtn();
	}

	@Then("Admin can see Programs are still selected and not deleted")
	public void admin_can_see_programs_are_still_selected_and_not_deleted() {
		log.info("Admin can see programs are still selected but not deleted");

	}

	@Given("Admin is on Program Confirm Deletion Page after selecting a program to delete program")
	public void admin_is_on_program_confirm_deletion_page_after_selecting_a_program_to_delete_program() throws InterruptedException {
		programPage.clickAnyCheckbox();
	    programPage.click_DeleteBtn();
	}

	@When("Admin Clicks {string} button")
	public void admin_clicks_button(String string) {
	    programPage.clickCloseBtn();
	}

	@Then("Admin can see Confirm Deletion form disappears")
	public void admin_can_see_confirm_deletion_form_disappears() {
	    log.info("Admin can see Confirm Deletion Disappears");
	}



}
