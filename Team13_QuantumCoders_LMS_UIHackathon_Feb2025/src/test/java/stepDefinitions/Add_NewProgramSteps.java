package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPage;
import utilities.Context;
import utilities.Constants;


    

public class Add_NewProgramSteps extends Constants {
	
	Context context;
    ProgramPage programpage;
    
    public Add_NewProgramSteps(Context context) {
		this.context = context;
		programpage = context.ProgramPage();
    }
	@Given("Admin is on program page after reaching home")
	public void admin_is_on_program_page_after_reaching_home() {
		log.info("Admin is on the Program page"); 
	}

	@Given("Admin is on Program page")
	public void admin_is_on_program_page() {
		log.info("Admin is on the Program page");
	    
	}

	@When("Admin clicks on {string} under the {string} menu bar")
	public void admin_clicks_on_under_the_menu_bar(String string, String string2) {
	    programpage.AddNewProgram1();
	    log.info("Admin clicks Program details");
	}

	@Then("Admin should see pop up window for program details")
	public void admin_should_see_pop_up_window_for_program_details() {
		log.info("Admin is seeing pop up window");
		
	}

	@Then("Admin should see window title as {string}")
	public void admin_should_see_window_title_as(String string) {
	    programpage.ProgramTitle();
	    log.info("Admin is seeing program details window");
	}

	@Then("Admin should see red  asterisk mark  beside mandatory field {string}")
	public void admin_should_see_red_asterisk_mark_beside_mandatory_field(String string) {
		programpage.AstriskMandatoryFields();
		log.info("Admin is seeing asterisk mark  beside mandatory field  ");
	}

	@Given("Admin is on Program details form")
	public void admin_is_on_program_details_form1() {
		log.info("Admin is in program details form  ");
	    }

	@When("Admin clicks save button without entering mandatory")
	public void admin_clicks_save_button_without_entering_mandatory() {
	    programpage.SubmissionClick();
	    log.info("Admin is clicking save Button ");
	}

	@Then("Admin gets message {string}")
	public void admin_gets_message(String string) {
		programpage.FieldRequiredText();
	    log.info("Admin is getting the field required text  ");
	}

	@When("Admin clicks Cancel button")
	public void admin_clicks_cancel_button() {
	    programpage.ClickCancel();
	    log.info("Admin is clicking on the cancel button ");
	}

	@Then("Admin can see Program Details form disappears")
	public void admin_can_see_program_details_form_disappears() {
	log.info("Admin is seeing program details disappers ");
	   
	}

	@When("Admin enters the Name in the text box")
	public void admin_enters_the_name_in_the_text_box() {
		programpage.clickProgram();
		programpage.AddNewProgram1();
	    programpage.EnterProgramNameText();
	    log.info("Admin is entering the name in text box ");
	}

	@Then("Admin can see the text entered")
	public void admin_can_see_the_text_entered() {
		 log.info("Admin should see the entered Text  ");
	}

	@When("Admin enters the Description in text box")
	public void admin_enters_the_description_in_text_box() {
	    programpage.EnterProgramDescriptionText();
	    log.info("Admin is entering the Description ");
	}

	@Then("Admin can see the text entered in description box")
	public void admin_can_see_the_text_entered_in_description_box() {
		  log.info("Admin should see the text entered in description ");
	}

	@When("Admin selects the status of the program by clicking on the radio button {string}")
	public void admin_selects_the_status_of_the_program_by_clicking_on_the_radio_button(String string) {
	    programpage.ActiveStatus();
	    log.info("Admin is se;lecting the radio button");
	}

	@Then("Admin can see {string} status selected")
	public void admin_can_see_status_selected(String string) {
		log.info("Admin is seeing the Active Selected");
	    	}

	@When("Admin enter valid details for mandatory fields and Click on save button")
	public void admin_enter_valid_details_for_mandatory_fields_and_click_on_save_button() {
	    programpage.Saveprogram();
	    log.info("Admin is saving the program");
	}

	@When("Admin Click on cancel button")
	public void admin_click_on_cancel_button() {
	    programpage.ClickCancel();
	    log.info("Admin is Clicking on the cancel");
	}

	@Then("Admin can see program details form disappear")
	public void admin_can_see_program_details_form_disappear() {
	    programpage.isAddProgramDisappeared();
	    log.info("Admin is seeing the program details disappear");
	}

	@When("Admin searches with newly created {string}")
	public void admin_searches_with_newly_created(String string) {
		programpage.SearchClick();
		programpage.SearchEnterText();
		log.info("Admin searches program name created");
	}

	@Then("Records of the newly created  {string} is displayed and match the data entered")
	public void records_of_the_newly_created_is_displayed_and_match_the_data_entered(String string) {
		log.info("Admin should see the program created");
	    
	}

	@Given("Admin is on program details form")
	public void admin_is_on_program_details_form() {
	    programpage.clickProgram();
	    programpage.AddNewProgram1();
	    log.info("Admin is on the program details form");
	}

	@When("Admin Click on {string} button")
	public void admin_click_on_button(String string) {
		 programpage.XButtonClick();
		 log.info("Admin click on xbutton");
	}




}
