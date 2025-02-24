package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class ClassPageValidationSteps extends Constants {

	Context context;
	ClassPage classPage;
	

	public ClassPageValidationSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}
	
	
	@Given("Admin is on the home page after login in class module")
	public void admin_is_on_the_home_page_after_login_in_class_module() {
		log.info("Admin is logged in");
//		Thread.sleep(2000);
		Assert.assertEquals(classPage.checkLogoutLink(), true);//checking if logged in

	}

	@When("Admin clicks the Class Navigation bar in the Header")
	public void admin_clicks_the_class_navigation_bar_in_the_header() {
		log.info("Admin clicks the Class Navigation bar in the Header");
		classPage.clickClassLink();
	}

	@Then("Admin should see {string} in class module")
	public void admin_should_see_in_class_module(String expectedField) {
		
	     boolean isPresent = false;

	        switch (expectedField) {
	            case "Manage class page":
	                isPresent = classPage.isManageClassPage();
	                break;
	            case "LMS-Learning Management System Title":
	            	System.out.println("classPage.validateLMSHeading() " +classPage.validateLMSHeading());
	                isPresent = classPage.validateLMSHeading().contains("LMS - Learning Management System");
	                break;
	            case "Mange Class Header":
	                isPresent = classPage.getClassHeaderName().contains("Manage Class");
	                break;

	            case "Search Bar":
	                isPresent = classPage.validateSearchBar();
	                break;

	            case "datatable heading like Batchname,class topic,class description,status,class Date,staff name,Edit/Delete":
	                isPresent = classPage.validateAllColumnHeaders("Batch Name" , "Class Topic", "Class Description", "Status", "Class Date", "Staff Name", "Edit / Delete");
	                break;

	            case "\"showing x to y of  z entries\" and enabled pagination controls under the data table":
	                isPresent = classPage.validatePaginationTextandIcons();
	                break;

	            case "Sort icon of all the field in the datatable":
	                isPresent = classPage.isPresentSortIconAllColumnHeaders();
	                break;

	            case "Delete button under the Manage class page header":
	                isPresent = classPage.isPresentCommonDeleteBtn();
	                break;

	            case "Total no of classes in below of the data table":
	                isPresent = classPage.istotalNoOfClassesPresent();
	                break;

	            default:
	                throw new IllegalArgumentException("Unknown expected field: " + expectedField);
	        }

	        Assert.assertTrue(isPresent, "Admin will see " + expectedField);
	    }

	}

