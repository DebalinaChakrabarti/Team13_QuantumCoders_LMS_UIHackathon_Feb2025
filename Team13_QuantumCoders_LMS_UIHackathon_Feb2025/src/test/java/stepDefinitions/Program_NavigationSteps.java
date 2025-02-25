package stepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPage;
import utilities.Context;
import utilities.Constants;

public class Program_NavigationSteps extends Constants{
	
	Context context;
    ProgramPage programpage;
	
	public Program_NavigationSteps(Context context) {
		this.context = context;
		programpage = context.ProgramPage();
	}
	
	@Given("Admin is on home page after Login")
	public void admin_is_on_home_page_after_login() {
		log.info("Admin is on the home page");
	    
	}



	@When("Admin clicks {string} on the navigation bar")
	public void admin_clicks_on_the_navigation_bar(String string) throws InterruptedException {
		programpage.clickProgram();
		log.info("Admin clicks program on the navigation bar");
		
	}

	@Then("Admin should be navigated to Program page")
	public void admin_should_be_navigated_to_program_page() {
         String expectedTitle = "Manage Program";  
         Assert.assertEquals("Manage Program", expectedTitle, "Navigate to the program page");

		log.info("Admin should navigate to the program page");
	}



}

