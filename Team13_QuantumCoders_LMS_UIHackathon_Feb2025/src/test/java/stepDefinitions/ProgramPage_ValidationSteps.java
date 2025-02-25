package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObjects.ProgramPage;
import utilities.Constants;
import utilities.Context;

public class ProgramPage_ValidationSteps extends Constants {
	Context context;
    ProgramPage programpage;
    
    public ProgramPage_ValidationSteps(Context context) {
		this.context = context;
		programpage = context.ProgramPage();
    }
	
	@Given("Admin is on home page after Login.")
	public void admin_is_on_home_page_after_login() {
		log.info("Admin is on the home page");
				
	}

	@Then("Admin should see the heading {string}.")
	public void admin_should_see_the_heading(String ExpectedResult) {
		String ActualResult=programpage.ManageProgramText();
		Assert.assertEquals( ActualResult, ExpectedResult);
        log.info("Admin should see the Manage Program Heading");
	}

	@Then("Admin should able to see Program name, description, and status for each program")
	public void admin_should_able_to_see_program_name_description_and_status_for_each_program() {
		List<String> ExpectedHeaders = Arrays.asList("Program Name", "Program Description", "Program Status");// Define the expected column headers
		List<WebElement> ActualHeaders = programpage.getColumnHeaders();// Get the actual column headers from the page
		assertEquals("Mismatch in the number of column headers", ExpectedHeaders.size(), ActualHeaders.size());//size of both the list
		log.info("Admin should see all heading names");
        }
		


	@Then("Admin should see a Delete button in left top is disabled")
	public void admin_should_see_a_delete_button_in_left_top_is_disabled() {
		String ActualResult=programpage.Deletedisabled();
		Assert.assertEquals( ActualResult, "");
		log.info("Admin should see the Delete Button");
		
	}

	@Then("Admin should see Search bar with text as {string}")
	public void admin_should_see_search_bar_with_text_as(String string) {
		programpage.Search();
		log.info("Admin should see search bar");
	   
	}

	@Then("Admin should see checkbox default state as unchecked beside Program Name column header")
	public void admin_should_see_checkbox_default_state_as_unchecked_beside_program_name_column_header() {
	    programpage.getCheckbox();
	    assertFalse("The checkbox beside Program Name should be unchecked by default", programpage.isCheckboxSelected());
	    log.info("Admin should see checkbox");
	}

	@Then("Admin should see check box default state as unchecked on the left side in all rows against program name")
	public void admin_should_see_check_box_default_state_as_unchecked_on_the_left_side_in_all_rows_against_program_name() {
	}

	@Then("Admin should see the sort arrow icon beside to each column header except Edit and Delete")
	public void admin_should_see_the_sort_arrow_icon_beside_to_each_column_header_except_edit_and_delete() {
	   
	}

	@Then("Admin should see the Edit and Delete buttons on each row of the data table")
	public void admin_should_see_the_edit_and_delete_buttons_on_each_row_of_the_data_table() {
		String ExpectedResult="Edit / Delete";
	    String ActualResult=programpage.Editdelete();
	    Assert.assertEquals( ActualResult,ExpectedResult,"Edit and delete button ");
	    log.info("Admin should see the Edit and Delete button");
	}

	@Then("Admin should see the text as {string} along with Pagination icon below the table.")
	public void admin_should_see_the_text_as_along_with_pagination_icon_below_the_table(String string) {
		programpage.pageRefresh();
		programpage.EntriesCheck();
		log.info("Admin should see the pagination text");
	}

	@Then("Admin should see the footer as {string}.")
	public void admin_should_see_the_footer_as(String string) {
	    programpage.Footertext();
	    log.info("Admin should see the footer text");
	}




}
