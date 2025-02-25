package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class SortClassDetailsSteps extends Constants {


	Context context;
	ClassPage classPage;
	

	public SortClassDetailsSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}

	@Given("Check if Admin is logged in or not for the Class Module")
	public void check_if_admin_is_logged_in_or_not_for_the_class_module() throws InterruptedException {
		log.info("Admin is logged in");
		classPage.pageRefresh();
		Thread.sleep(1000);
		Assert.assertEquals(classPage.checkLogoutLink(), true);//checking if logged in
	}

//	@When("Admin clicks on Class on the Navigation Bar")
//	public void admin_clicks_on_class_on_the_navigation_bar() {
//	}

	@Then("Admin should be on Manage Class Page in Class module")
	public void admin_should_be_on_manage_class_page_in_class_module() {
		Assert.assertTrue(classPage.isManageClassPage(), "Admin is not in Class Page");
	}

	@Given("Admin is on Manage Class page in the Class module")
	public void admin_is_on_manage_class_page_in_the_class_module() {
		Assert.assertTrue(classPage.isManageClassPage(), "Admin is not in Class Page");
	}

	@When("Admin clicks the sort icon of Batch name column in the Class module")
	public void admin_clicks_the_sort_icon_of_batch_name_column_in_the_class_module() {
		classPage.clickbatchNameColumnHeader();
	}

	@Then("The data get sorted on the table based on the Batch name column values in ascending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_batch_name_column_values_in_ascending_order_in_the_class_module() {
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalBatchNameList().equals(classPage.getSortedBatchNameListAsc()),"The data is sorted on the table based on the Batch Name column values in ascending order");
	}

	@Given("The data is in the ascending order on the table based on Batch name column in the Class module")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_batch_name_column_in_the_class_module() {
	}

	@When("Admin clicks the sort icon of Batch Name column to sort Batch name in descending order in the Class module")
	public void admin_clicks_the_sort_icon_of_class_name_column_to_sort_batch_name_in_descending_order_in_the_class_module() {
		classPage.clickbatchNameColumnHeader();
	}

	@Then("The data get sorted on the table based on the Batch name column values in descending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_batch_name_column_values_in_descending_order_in_the_class_module() {
		//compare original vs sorted list
		Assert.assertTrue(classPage.getOriginalBatchNameList().equals(classPage.getSortedBatchNameListDesc()),"The data is sorted on the table based on the Batch Name column values in descending order");
	}

	@When("Admin clicks the sort icon of Class Topic column in the Class module")
	public void admin_clicks_the_sort_icon_of_class_topic_column_in_the_class_module() {
		log.info("ClassSortingSteps---Admin clicks the sort icon of program name column");
		classPage.clickClassNameColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class Topic column values in ascending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_topic_column_values_in_ascending_order_in_the_class_module() {
		log.info("ClassSortingSteps---The data get sorted on the table based on the program name column values in ascending order");
		classPage.getSortedClassNameListAsc();
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalClassNameList().equals(classPage.getSortedClassNameListAsc()),"The data is sorted on the table based on the class topic column values in ascending order");
	}

	@Given("The data is in the ascending order on the table based on Class Topic column in the Class module")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_class_topic_column_in_the_class_module() {
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalClassNameList().equals(classPage.getSortedClassNameListAsc()),"The data is sorted on the table based on the class topic column values in ascending order");
	}

	@When("Admin clicks the sort icon of Class Name column to sort Class Topic in descending order in the Class module")
	public void admin_clicks_the_sort_icon_of_class_name_column_to_sort_class_topic_in_descending_order_in_the_class_module() {
		log.info("ClassSortingSteps---Admin clicks the sort icon of Class Topic column to sort Class Topic in descending order in the Class module");
		classPage.clickClassNameColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class Topic column values in descending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_topic_column_values_in_descending_order_in_the_class_module() {
		log.info("ClassSortingSteps---The data get sorted on the table based on the Class Name column values in descending order in the Class module");
		//compare original vs sorted list
		Assert.assertTrue(classPage.getOriginalClassNameList().equals(classPage.getSortedClassNameListDesc()),"The data is sorted on the table based on the Class Topic column values in descending order");
	}

	@When("Admin clicks the sort icon of Class Description column in the Class module")
	public void admin_clicks_the_sort_icon_of_class_description_column_in_the_class_module() {
		log.info("ClassSortingSteps---Admin clicks the sort icon of Class Description column in the Class module");
		classPage.clickClassDescColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class Description column values in ascending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_description_column_values_in_ascending_order_in_the_class_module() {
		log.info("ClassSortingSteps---The data get sorted on the table based on the Class Description column values in ascending order in the Class module");
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalClassDescList().equals(classPage.getSortedClassDescriptionListAsc()),"The data is sorted on the table based on the Class Description column values in ascending order");
	}

	@Given("The data is in the ascending order on the table based on Class Description column in the Class module")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_class_description_column_in_the_class_module() {
	}

	@When("Admin clicks the sort icon of Class Description column to sort Class Description in descending order in the Class module")
	public void admin_clicks_the_sort_icon_of_class_description_column_to_sort_class_description_in_descending_order_in_the_class_module() {
		log.info("ClassSortingSteps---Admin clicks the sort icon of Class Description column to sort Class Description in descending order in the Class module");
		classPage.clickClassDescColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class Description column values in descending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_description_column_values_in_descending_order_in_the_class_module() {
		log.info("ClassSortingSteps---The data get sorted on the table based on the Class Description column values in descending order in the Class module");
		//compare original vs sorted list
		Assert.assertTrue(classPage.getOriginalClassDescList().equals(classPage.getSortedClassDescriptionListDesc()),"The data get sorted on the table based on the Class Description column values in descending order");
	}

	@When("Admin clicks the sort icon of Class Status column in the Class module")
	public void admin_clicks_the_sort_icon_of_class_status_column_in_the_class_module() {
		log.info("ClassSortingSteps---Admin clicks the sort icon of Class Status column in the Class module");
		classPage.clickClassStatusColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class Status column values in ascending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_status_column_values_in_ascending_order_in_the_class_module() {
		log.info("ClassSortingSteps---The data get sorted on the table based on the Class Status column values in ascending order in the Class module");
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalClassStatusList().equals(classPage.getSortedClassStatusListAsc()),"The data get sorted on the table based on the Class Status column values in ascending order");
	}

	@Given("The data is in the ascending order on the table based on Class Status column in the Class module")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_class_status_column_in_the_class_module() {
	}

	@When("Admin clicks the sort icon of Class Status column to sort Class status in descending order in the Class module")
	public void admin_clicks_the_sort_icon_of_class_status_column_to_sort_class_status_in_descending_order_in_the_class_module() {
		log.info("ClassSortingSteps---Admin clicks the sort icon of Class Status column to sort Class status in descending order in the Class module");
		classPage.clickClassStatusColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class Status column values in descending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_status_column_values_in_descending_order_in_the_class_module() {
		log.info("ClassSortingSteps---The data get sorted on the table based on the Class Status column values in descending order in the Class module");
		//compare original vs sorted list
		Assert.assertTrue(classPage.getOriginalClassStatusList().equals(classPage.getSortedClassStatusListDesc()),"The data get sorted on the table based on the Class Status column values in descending order");
	}

	@When("Admin clicks the sort icon of Class date column in the Class module")
	public void admin_clicks_the_sort_icon_of_class_date_column_in_the_class_module() {
		classPage.clickClassDateColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class date column values in ascending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_date_column_values_in_ascending_order_in_the_class_module() {
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalClassDateList().equals(classPage.getSortedClassDateListAsc()),"The data get sorted on the table based on the Class Date column values in ascending order");
	}

	@Given("The data is in the ascending order on the table based on Class date column in the Class module")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_class_date_column_in_the_class_module() {
	}

	@When("Admin clicks the sort icon of Class Status column to sort Class date in descending order in the Class module")
	public void admin_clicks_the_sort_icon_of_class_status_column_to_sort_class_date_in_descending_order_in_the_class_module() {
		classPage.clickClassDateColumnHeader();
	}

	@Then("The data get sorted on the table based on the Class date column values in descending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_class_date_column_values_in_descending_order_in_the_class_module() {
		  Assert.assertTrue(classPage.getOriginalClassDateList().equals(classPage.getSortedClassDateListDesc()),"The data get sorted on the table based on the Class Date column values in ascending order");
	}

	@When("Admin clicks the sort icon of staff name column in the Class module")
	public void admin_clicks_the_sort_icon_of_staff_name_column_in_the_class_module() {
		classPage.clickStaffNameColumnHeader();
	}

	@Then("The data get sorted on the table based on the staff name column values in ascending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_staff_name_column_values_in_ascending_order_in_the_class_module() {
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalStaffNameList().equals(classPage.getSortedStaffNameListAsc()),"The data get sorted on the table based on the Staff Name column values in ascending order");
	}

	@Given("The data is in the ascending order on the table based on staff name column in the Class module")
	public void the_data_is_in_the_ascending_order_on_the_table_based_on_staff_name_column_in_the_class_module() {
	}

	@When("Admin clicks the sort icon of Class Status column to sort staff name in descending order in the Class module")
	public void admin_clicks_the_sort_icon_of_class_status_column_to_sort_staff_name_in_descending_order_in_the_class_module() {
		classPage.clickStaffNameColumnHeader();
	}

	@Then("The data get sorted on the table based on the staff name column values in descending order in the Class module")
	public void the_data_get_sorted_on_the_table_based_on_the_staff_name_column_values_in_descending_order_in_the_class_module() {
		//compare original vs sorted list
		  Assert.assertTrue(classPage.getOriginalStaffNameList().equals(classPage.getSortedStaffNameListDesc()),"The data get sorted on the table based on the Staff Name column values in ascending order");
	}

}
