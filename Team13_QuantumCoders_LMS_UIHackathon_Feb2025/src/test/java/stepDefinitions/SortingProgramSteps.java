package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.ProgramPageTwo;
import utilities.Constants;
import utilities.Context;

public class SortingProgramSteps extends Constants {
	Context context;
	ProgramPageTwo programPage;
	public SortingProgramSteps(Context context) {
		this.context = context;
		programPage = context.getEditProgramPage();
	}

	@When("Admin clicks on Arrow next to program Name")
	public void admin_clicks_on_arrow_next_to_program_name() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	    programPage.clickArrowProgramName();
	}

	@Then("Admin See the Program Name is sorted in Ascending order\\/Descending order")
	public void admin_see_the_program_name_is_sorted_in_ascending_order_descending_order() {
	    log.info("Admin can see program name is sorted in ascending or descending order");
	}

	@When("Admin clicks on Arrow next to ProgramDescription")
	public void admin_clicks_on_arrow_next_to_program_description() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	   programPage.clickArrowProgramDescription();
	}

	@Then("Admin See the program Description is sorted in Ascending order\\/Descending order")
	public void admin_see_the_program_description_is_sorted_in_ascending_order_descending_order() {
	  log.info("Admin can see program sedcription is sorted in ascending or descending order");
	}

	@When("Admin clicks on Arrow next to Program status")
	public void admin_clicks_on_arrow_next_to_program_status() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	    programPage.clickArrowProgramStatus();
	}

	@Then("Use See the  Program Status is sorted in Ascending order\\/Descending order")
	public void use_see_the_program_status_is_sorted_in_ascending_order_descending_order() {
	   log.info("Admin can see program status in ascending order or descending order");
	}
}
