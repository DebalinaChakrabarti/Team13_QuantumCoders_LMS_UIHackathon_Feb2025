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


//	@Then("Admin should see the page names as in order {string}")
//	public void admin_should_see_the_page_names_as_in_order(String Logout) {
//		//Assert.assertTrue("Logout menu item is not visible", Logout.isDisplayed());
//		log.info("Admin is able to view the pages names as in order");
//		
//	}

	@Given("Admin is on program page")
	public void admin_is_on_program_page() {
		//programpage.pageRefresh();
		//programpage.clickProgram();
		//programpage.AddSubMenu();
	}

	@Then("Admin should see sub menu in menu bar as {string}")
	public void admin_should_see_sub_menu_in_menu_bar_as(String ExpectedPageTitle) {
		programpage.pageRefresh();
		programpage.clickProgram();
		programpage.AddSubMenu();
		String actualpagetitle=programpage.AddSubMenu();
		assertEquals( actualpagetitle, ExpectedPageTitle);
		log.info("Admin is able to see Add New Program");
	    
	}



}
