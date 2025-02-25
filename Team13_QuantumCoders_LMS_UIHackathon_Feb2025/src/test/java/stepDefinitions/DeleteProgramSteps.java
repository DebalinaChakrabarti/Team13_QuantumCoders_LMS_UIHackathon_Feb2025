package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPageTwo;
import utilities.Context;
import utilities.Constants;

public class DeleteProgramSteps extends Constants {
	Context context;
	ProgramPageTwo programPage;
	public DeleteProgramSteps(Context context) {
		this.context = context;
		programPage = context.getEditProgramPage();
	}
	//@Given("Admin is Home Page")
	//public void admin_is_home_page() {
		// programPage.getloginUrl(); 
	//}

	//@When("Admin enter valid credentials and clicks login button and land on Home page")
	//public void admin_enter_valid_credentials_and_clicks_login_button_and_land_on_home_page() throws InterruptedException {
		//programPage.setUsername();
		  // programPage.setPassword();
		   //programPage.clickDropdown();
	//}

	//@When("Admin clicks Program on the Menubar")
	//public void admin_clicks_program_on_the_menubar() throws InterruptedException {
	//	 programPage.clickProgramBtn();
	//}

	@Given("Admin is on Program page in delete")
	public void admin_is_on_program_page() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	}

	@When("Admin clicks on delete button for a program in delete")
	public void admin_clicks_on_delete_button_for_a_program() {
	   programPage.clickDelete();
	}

	@Then("Admin will get confirm deletion popup")
	public void admin_will_get_confirm_deletion_popup() {
	    log.info("Admin will get confirm deletion popup");
	}

	@Given("Admin is on Confirm Deletion alert in program")
	public void admin_is_on_confirm_deletion_alert_in_program() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickDelete();
	}

	@When("Admin clicks on {string} button")
	public void admin_clicks_on_button(String string) {
		System.out.println(""+string);
	    programPage.clickYesBtn();
	}

	@Then("Admin can see {string} message")
	public void admin_can_see_message(String string) {
		Assert.assertEquals(programPage.SuccessfulDeleteMsg(), "Successful Program Deleted");
	   log.info(string);
	}
	@Given("Admin is on Confirm Deletion alert in program again")
	public void admin_is_on_confirm_deletion_alert() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickDelete();
	}
	@When("Admin clicks {string} button")
	public void admin_clicks(String string) {
		System.out.println(""+string);
		programPage.clickNoBtn();
	}

	@Then("Admin can see Confirmation form disappears")
	public void admin_can_see_confirmation_form_disappears() {
	   log.info("Admin can see confirmation disappears");
	}

	@Given("Admin is on Program Confirm Deletion Page after selecting a program to delete")
	public void admin_is_on_program_confirm_deletion_page_after_selecting_a_program_to_delete() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
		programPage.clickDelete();
	}

	@When("Admin Click on {string} button")
	public void admin_click_on_button(String string) {
	    programPage.clickCloseBtn();
	}

	@Then("Admin can see Confirm Deletion form disappear")
	public void admin_can_see_confirm_deletion_form_disappear() {
	  log.info("Admin can see Confirm Deletion Disappear");
	}



}
