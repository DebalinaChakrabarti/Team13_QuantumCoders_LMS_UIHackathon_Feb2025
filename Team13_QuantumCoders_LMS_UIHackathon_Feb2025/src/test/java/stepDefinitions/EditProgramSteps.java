package stepDefinitions;

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPageTwo;
import utilities.Context;
import utilities.Constants;

public class EditProgramSteps extends Constants{
	Context context;
	ProgramPageTwo programPage;
	public EditProgramSteps(Context context) {
		this.context = context;
		programPage = context.getEditProgramPage();
	}
	

	@When("Admin clicks {string} on the Menubar")
	public void admin_clicks_on_the_menubar(String string) throws InterruptedException {
		programPage.getprogramUrl();
	   programPage.clickProgramBtn();
	}

	@When("Admin clicks on Edit option for particular program")
	public void admin_clicks_on_edit_option_for_particular_program() throws InterruptedException {
		programPage.getprogramUrl();
		   programPage.clickProgramBtn();
	  programPage.clickEdit();
	}

	@Then("Admin lands on Program details form")
	public void admin_lands_on_program_details_form() {
		programPage.DisplayProgram();
		Assert.assertEquals(programPage.DisplayProgram(), "Program Details");
		log.info("Admin lands on Program Details Popup");
		//Assert.assertEquals(true,"Program Details");
	}
	@Given("Admin is on Program Page")
	public void admin_is_on_program_page() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	}
	
	@When("Admin clicks on Edit option for particular program again")
	public void admin_clicks_on_edit_option_for_particular_program_again() throws InterruptedException {
		//editprogramPage.clickProgramBtn();
		 programPage.clickEdit();
	}

	@Then("Admin should see window title as {string}")
	public void admin_should_see_window_title_as(String string) {
	   
	   log.info("Admin should see window title"+string);
	}
	@Given("Admin is on Program Details Popup window to Edit in program name")
	public void admin_is_on_program_details_popup_window_to_edit_in_program_name() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickEdit();
		
	}

	@When("Admin edits the program name {string} and  {string} and click on save button")
	public void admin_edits_the_program_name_and_and_click_on_save_button(String sheetname, String scenarioName) throws IOException, InterruptedException {
	  programPage.editProgramname(sheetname, scenarioName);
	}

	@Then("Updated program name is seen by the Admin")
	public void updated_program_name_is_seen_by_the_admin() {
	log.info("Updated Programname Successfully");
	}
	@Given("Admin is on Program Details Popup window to Edit in program Description")
	public void admin_is_on_program_details_popup_window_to_edit_in_program_description() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickEdit();
	}

	@When("Admin edits the program description {string} and  {string} and click on save button")
	public void admin_edits_the_program_description_and_and_click_on_save_button(String sheetname, String scenarioName) throws IOException, InterruptedException {
		programPage.editProgramDescription(sheetname, scenarioName);
	}

	@Then("Updated program description is seen by the Admin")
	public void updated_program_description_is_seen_by_the_admin() {
		
	   log.info("Updated Program Description Successfully");
	}
	@Given("Admin is on Program Details Popup window to Edit in status")
	public void admin_is_on_program_details_popup_window_to_edit_in_status() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickEdit();
	}

	@When("Admin can change the status of the program and click on save button")
	public void admin_can_change_the_status_of_the_program_and_click_on_save_button() {
	   //editprogramPage.changeInactiveStatus();
		programPage.changeStatus();
	}

	@Then("Status updated can be viewed by the Admin")
	public void status_updated_can_be_viewed_by_the_admin() {
		Assert.assertEquals(programPage.appearonAlertMsg(), "Successful Program Updated");
	   log.info("Status updated Successfully");
	}
	@Given("Admin is on Program Details Popup window to Edit in program")
	public void admin_is_on_program_details_popup_window_to_edit_in_program() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickEdit();
	}

	@When("Admin click on save button")
	public void admin_click_on_save_button() {
	   programPage.clickSaveBtn();
	}

	@Then("Admin gets a message {string} alert")
	public void admin_gets_a_message_alert(String alertmsg) {
		programPage.appearonAlertMsg();
		Assert.assertEquals(programPage.appearonAlertMsg(), "Successful Program Updated");
	  System.out.println(""+alertmsg);
	}
	@Given("Admin is on Program Details Popup window to Edit")
	public void admin_is_on_program_details_popup_window_to_edit() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickEdit();
	}
	@When("Admin clicks cancel button on edit popup in program")
	public void admin_clicks_cancel_button_on_edit_popup_in_program() {
	   programPage.clickCancelBtn();
	}

	@Then("Admin can see the Program details popup disappears")
	public void admin_can_see_the_program_details_popup_disappears() {
		//Assert.assertTrue(programPage.alertpopupano(), "");
	   log.info("Admin can see the program details popup disappears");
	}
}
