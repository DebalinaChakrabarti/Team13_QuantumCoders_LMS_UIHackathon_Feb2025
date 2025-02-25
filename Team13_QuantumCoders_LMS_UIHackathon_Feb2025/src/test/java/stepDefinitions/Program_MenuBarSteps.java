package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ProgramPage;
import utilities.Constants;
import utilities.Context;

public class Program_MenuBarSteps extends Constants {
	
	Context context;
    ProgramPage programpage;
    
    public Program_MenuBarSteps(Context context) {
		this.context = context;
		programpage = context.ProgramPage();
    }
    

      @Given("Admin is on home page after Loginng")
     public void admin_is_on_home_page_after_loginng() {
    	  log.info("Admin is on Home Page"); 
    
      }

    
	
	@Then("Admin should see Logout in menu bar")
	public void admin_should_see_logout_in_menu_bar() {
		programpage.pageRefresh();
		String ExpectedTitle="Logout";
		String actualpagetitle=programpage.LogoutOption();
		assertEquals( actualpagetitle, ExpectedTitle);
		log.info("Admin is able to view the Logout in menu bar");
    }
	    

	
	@Then("Admin should see the heading {string}")
	public void admin_should_see_the_heading(String ExpectedPageTitle) {
		String actualpagetitle=programpage.PageHeading();
		assertEquals( actualpagetitle, ExpectedPageTitle);
		log.info("Admin is able to view the LMS - Learning Management System in menu bar");
		programpage.pageRefresh();
	}


	@Given("Admin is on program page")
	public void admin_is_on_program_page() {
		log.info("Admin is on program page");
	}
	
	@When("Admin clicks {string} on the navigation Bar")
	public void admin_clicks_on_the_navigation_bar(String string) throws InterruptedException {
		programpage.clickProgram();
		log.info("Admin clicking program");
	}

	@Then("Admin should see sub menu in menu bar as {string}")
	public void admin_should_see_sub_menu_in_menu_bar_as(String ExpectedPageTitle) {
		String actualpagetitle=programpage.AddSubMenu();
		Assert.assertEquals( actualpagetitle, ExpectedPageTitle,"");
		log.info("Admin is able to see Add New Program");
	    
	}



}
