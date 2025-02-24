package utilities;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
//import pageObjects.AddNewClass;
//import pageObjects.AddNewClassPopup;
//import pageObjects.Batch;
//import pageObjects.BatchPage;
//import pageObjects.BatchPageValidations;
//import pageObjects.ClassPageValidation;
//import pageObjects.ClassPg;
//import pageObjects.DashboardPage;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;

public class Context {

	private DriverFactory driverFactory;
	private LoginPage loginPage;
	private ProgramPage program;
	

	public Context() {
		driverFactory = new DriverFactory();
		loginPage = new LoginPage(driverFactory.getDriver());
		program = new ProgramPage(driverFactory.getDriver());
		
		
	}

	public DriverFactory getDriverFactory() {
		return driverFactory;
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}
	
	public  ProgramPage ProgramPage  () {
		return program;
	}
	
	public void openBaseURL(String url) {
		getDriverFactory().getDriver().get(url); // Use WebDriver to open the URL
	}


}
