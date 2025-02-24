package utilities;

import driverFactory.DriverFactory;
import pageObjects.BatchPage;
//import pageObjects.AddNewClass;
//import pageObjects.AddNewClassPopup;
//import pageObjects.Batch;
//import pageObjects.BatchPage;
//import pageObjects.BatchPageValidations;
//import pageObjects.ClassPageValidation;
//import pageObjects.ClassPg;
//import pageObjects.DashboardPage;
import pageObjects.LoginPage;

public class Context {

	private DriverFactory driverFactory;
	private LoginPage loginPage;
	private BatchPage batchPage;

	public Context() {
		driverFactory = new DriverFactory();
		loginPage = new LoginPage(driverFactory.getDriver());
		batchPage = new BatchPage(driverFactory.getDriver());
	}

	public DriverFactory getDriverFactory() {
		return driverFactory;
	}

	public LoginPage getLoginPage() {
		return loginPage;
	}

	public BatchPage getBatchPage() {
		return batchPage;
	}

	public void openBaseURL(String url) {
		getDriverFactory().getDriver().get(url); // Use WebDriver to open the URL
	}

}
