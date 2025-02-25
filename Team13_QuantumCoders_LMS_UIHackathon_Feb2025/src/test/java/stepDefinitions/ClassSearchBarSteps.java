package stepDefinitions;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class ClassSearchBarSteps extends Constants {

	Context context;
	ClassPage classPage;

	public ClassSearchBarSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}

	@When("Admin enters the input to search By Batch Name,Class topic,Staff Name from {string} and {string} in the Class module")
	public void admin_enters_the_input_to_search_by_batch_name_class_topic_staff_name_from_and_in_the_class_module(String sheetname, String acenarioname) {
	}

	@Then("Admin should see Class details are searched by respective inputs from {string} and {string} in the Class module")
	public void admin_should_see_class_details_are_searched_by_respective_inputs_in_the_class_module(String sheetname, String scenarioname) throws IOException, InterruptedException {
		classPage.searchClass(sheetname, scenarioname);
	}


}
