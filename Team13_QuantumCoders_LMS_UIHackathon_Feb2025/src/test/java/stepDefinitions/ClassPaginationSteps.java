package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class ClassPaginationSteps extends Constants {
	
	Context context;
	ClassPage classPage;
	

	public ClassPaginationSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}
	
	
	@Given("Admin is on Manage Class page in Class module")
	public void admin_is_on_manage_class_page_in_class_module() {
		log.info("ClassPaginationSteps----------Admin is on Manage Class Page in class module");
		Assert.assertTrue(classPage.isManageClassPage(), "Admin is not in Class Page");
	}

	@When("Admin clicks Next page link on the Class table")
	public void admin_clicks_next_page_link_on_the_class_table() {
		classPage.clickNextLink();
	}

	@Then("Admin should see the next page record on the table  with Pagination has next active link enabled on the Class table")
	public void admin_should_see_the_next_page_record_on_the_table_with_pagination_has_next_active_link_enabled_on_the_class_table() {
		log.info("ClassPaginationSteps---Admin should see the Pagination has Next active link");
		Assert.assertTrue(classPage.isActiveNextLink(),"Next Page Link is not enabled");
	}

	@When("Admin clicks Last page link on the Class table")
	public void admin_clicks_last_page_link_on_the_class_table() {
		classPage.clickLastLink();
	}

	@Then("Admin should see the last page record on the table with Next page link are disabled in Class module")
	public void admin_should_see_the_last_page_record_on_the_table_with_next_page_link_are_disabled_in_class_module() {
		log.info("ClassPaginationSteps---Admin should see the last page record on the table with Next page link are disabled in class module");
		Assert.assertTrue(!classPage.isActiveNextLink(),"Next Page link is not Disabled");
		Assert.assertTrue(classPage.getOriginalClassNameList().size()>0,"Last page record is not present");
	}

	@Given("Admin is on last page of Class table")
	public void admin_is_on_last_page_of_class_table() {
		log.info("ClassPaginationSteps---Admin is on last page of Class table");
		Assert.assertTrue(!classPage.isActiveLastLink(),"Admin is not on last page of Class table as the LastPage Link is enabled");
	}

	@When("Admin clicks Previous page link on the Class table")
	public void admin_clicks_previous_page_link_on_the_class_table() {
		classPage.clickPreviousLink();
	}

	@Then("Admin should see the previous page record on the table with pagination has previous page link in Class module")
	public void admin_should_see_the_previous_page_record_on_the_table_with_pagination_has_previous_page_link_in_class_module() {
		log.info("ClassPaginationSteps---Admin should see the previous page record on the table with pagination has previous page link in class module");
		Assert.assertTrue(classPage.isActivePreviousLink(),"Previous Page Link is Disabled");
		Assert.assertTrue(classPage.getOriginalClassNameList().size()>0,"Previous page record is not present");
	}

	@Given("Admin is on Previous Class page")
	public void admin_is_on_previous_class_page() {
		log.info("ClassPaginationSteps---Admin is on Previous Class page");
		Assert.assertTrue(classPage.isActivePreviousLink() && classPage.isActiveNextLink(),"Admin is not on Previous Class page");
	}

	@When("Admin clicks First page link on the Class table")
	public void admin_clicks_first_page_link_on_the_class_table() {
		log.info("ClassPaginationSteps---Admin clicks First page link on the class table");
		classPage.clickFirstLink();
	}

	@Then("Admin should see the very first page record on the table with Previous page link are disabled in Class module")
	public void admin_should_see_the_very_first_page_record_on_the_table_with_previous_page_link_are_disabled_in_class_module() {
		log.info("ClassPaginationSteps---Admin should see the very first page record on the table with Previous page link are disabled in class module");
		Assert.assertTrue(!classPage.isActivePreviousLink(),"Previous Page Link is enabled");
		Assert.assertTrue(classPage.isFirstPage(),"First Page Record is not present");
	}
	

}
