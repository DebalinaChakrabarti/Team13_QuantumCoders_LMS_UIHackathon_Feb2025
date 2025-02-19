package stepDefinitions;

import java.io.IOException;

import utilities.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;
import utilities.Context;

public class LoginPageSteps extends Constants {

	Context context;
	LoginPage loginPage;
	

	public LoginPageSteps(Context context) {
		this.context = context;
		loginPage = context.getLoginPage();
	}

	@Given("Admin is in login Page.")
	public void admin_is_in_login_page() {
		loginPage.getloginUrl();
	}

	@When("Admin enter valid  credentials with {string} and {string} and clicks login button in login module.")
	public void admin_enter_valid_credentials_with_and_and_clicks_login_button_in_login_module(String sheetname, String scenarioName) throws IOException, InterruptedException {

		log.info("Admin is logged in");
		loginPage.clicklogin(sheetname,scenarioName);
		
	}

	@Then("Admin should land on dashboard page")
	public void admin_should_land_on_dashboard_page() {
	}
}
