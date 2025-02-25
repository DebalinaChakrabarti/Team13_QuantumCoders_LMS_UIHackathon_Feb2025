package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LogOutPage;
import pageObjects.LoginPage;
import utilities.Constants;
import utilities.Context;

public class LogOutPageSteps extends Constants {

    Context context;
    LogOutPage logoutPage;
    
    public LogOutPageSteps(Context context) {
		this.context = context;
		logoutPage = context.getLogOutPage();
	}

    @When("Admin clicks the logout button on the Navigation Bar")
    public void admin_clicks_the_logout_button_on_the_navigation_bar() {
        // Write code here that turns the phrase above into concrete actions
    	System.out.println("------");
    	logoutPage.clickLogout();
       // throw new io.cucumber.java.PendingException();
    }



    

    
}
