package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ClassPage;
import utilities.Constants;
import utilities.Context;

public class ClassNavigationSteps extends Constants {

	Context context;
	ClassPage classPage;
	

	public ClassNavigationSteps(Context context) {
		this.context = context;
		classPage = context.getClassPage();
	}

	@Given("Admin is in home page after login for class module")
	public void admin_is_in_home_page_after_login_for_class_module() {
		log.info("ClassNavigationSteps----Admin is in home page after login for class module");
//		Thread.sleep(2000);
		Assert.assertEquals(classPage.checkLogoutLink(), true);//checking if logged in
		
		classPage.clickHomeLink();
		Assert.assertTrue(classPage.getCurrentUrl().contains("/dashboard"));//checking if in Home page
	}

	@When("Admin clicks on Class link on Manage Class page")
	public void admin_clicks_on_class_link_on_manage_class_page() {
		log.info("ClassNavigationSteps----Admin clicks on Class link on Manage Class page");
		classPage.clickClassLink();
	}

	@Then("Admin is redirected to class page")
	public void admin_is_redirected_to_class_page() {
		log.info("ClassNavigationSteps----Admin is redirected to class page");
		Assert.assertTrue(classPage.isManageClassPage(), "Admin is not in Class Page");
	}

	@Given("Admin is on Manage Class page")
	public void admin_is_on_manage_class_page() {
	}

	@When("Admin clicks on Program link on Manage Class page")
	public void admin_clicks_on_program_link_on_manage_class_page() {
		log.info("ClassNavigationSteps----Admin clicks on Program link on Manage Class page");
		classPage.pageRefresh();
		classPage.clickProgramLink();
	}

	@Then("Admin is redirected to Program page link they clicked.")
	public void admin_is_redirected_to_program_page_link_they_clicked() {
		log.info("ClassNavigationSteps----Admin is redirected to Program page link they clicked.");
		Assert.assertTrue(classPage.getCurrentUrl().contains("/program"));//checking if in Program page
	}

	@When("Admin clicks on Logout link on Manage Class page")
	public void admin_clicks_on_logout_link_on_manage_class_page() {
		log.info("ClassNavigationSteps----Admin clicks on Logout link on Manage Class page");
		classPage.pageRefresh();
		classPage.clickLogoutLink();
	}

	@Then("Check if Admin is redirected to Login page")
	public void check_if_admin_is_redirected_to_login_page() {
		log.info("ClassNavigationSteps----Check if Admin is redirected to Login page");
		Assert.assertTrue(classPage.getCurrentUrl().contains("/login"));//checking if in Login page
	}

}
