package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pageObjects.ProgramPageTwo;
import utilities.Constants;
import utilities.Context;

public class SearchBarProgramSteps extends Constants {
	Context context;
	ProgramPageTwo programPage;
	public SearchBarProgramSteps(Context context) {
		this.context = context;
		programPage = context.getEditProgramPage();
	}
	@When("Admin enter the program to search By program name")
	public void admin_enter_the_program_to_search_by_program_name() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	   programPage.searchProgramName();
	}

	@Then("Admin should able to see Program name, description, and status for searched program name")
	public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_name() {
		log.info("Admin can see searched program name");
	}

	@When("Admin enter the program to search By program description")
	public void admin_enter_the_program_to_search_by_program_description() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	   programPage.searchProgramDescription();
	}

	@Then("Admin should able to see Program name, description, and status for searched program description")
	public void admin_should_able_to_see_program_name_description_and_status_for_searched_program_description() {
	    log.info("Admin can see searched program description");
	}

	@When("Admin enter the program to search By program name that does not exist")
	public void admin_enter_the_program_to_search_by_program_name_that_does_not_exist() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	   programPage.searchNoprogram();
	}

	@Then("There should be zero results.")
	public void there_should_be_zero_results() {
		log.info("Admin can see no results");
	}

	@When("Admin enter the program to search By partial name of program")
	public void admin_enter_the_program_to_search_by_partial_name_of_program() throws InterruptedException {
		programPage.getprogramUrl();
		programPage.clickProgramBtn();
	    programPage.searchPartialProgram();
	}



}
