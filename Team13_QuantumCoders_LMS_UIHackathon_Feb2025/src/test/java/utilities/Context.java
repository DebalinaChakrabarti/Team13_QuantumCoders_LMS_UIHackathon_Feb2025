package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import pageObjects.BatchPage;
import pageObjects.ClassPage;
import pageObjects.HomePage;
import pageObjects.ProgramPage;
import pageObjects.ProgramPageTwo;
import pageObjects.LogOutPage;
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
	private ProgramPage program;
	private ProgramPageTwo programPage;
	private ClassPage classPage;	
	private LogOutPage logoutPage;
	private HomePage homePage;
	private BatchPage batchPage;

	public Context() {
		driverFactory = new DriverFactory();
		loginPage = new LoginPage(driverFactory.getDriver());
		program = new ProgramPage(driverFactory.getDriver());
		programPage= new ProgramPageTwo(driverFactory.getDriver());
		classPage = new ClassPage(driverFactory.getDriver());
		logoutPage = new LogOutPage(driverFactory.getDriver());
		homePage = new HomePage(driverFactory.getDriver());
		batchPage = new BatchPage(driverFactory.getDriver());
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
	public ProgramPageTwo getEditProgramPage() {
		return programPage;
	}

	public ClassPage getClassPage() {
		return classPage;
	}
	
//	public void openBaseURL(String url) {
//		getDriverFactory().getDriver().get(url); // Use WebDriver to open the URL
//	}

	public LogOutPage getLogOutPage() {
		return logoutPage;
	}
	
	public HomePage getHomePage() {
		return homePage;
	}

	public BatchPage getBatchPage() {
		return batchPage;
	}

}
