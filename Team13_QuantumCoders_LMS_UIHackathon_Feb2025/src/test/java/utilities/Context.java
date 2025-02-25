package utilities;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import pageObjects.ProgramPageTwo;
import pageObjects.ClassPage;
import pageObjects.LoginPage;
import pageObjects.ProgramPage;
public class Context {

	private DriverFactory driverFactory;
	private LoginPage loginPage;
	private ClassPage classPage;
        private LogOutPage logoutPage;
	private HomePage homePage;
	private ProgramPage program;
	private ProgramPageTwo programPage;

	public Context() {
		driverFactory = new DriverFactory();
		loginPage = new LoginPage(driverFactory.getDriver());
		classPage = new ClassPage(driverFactory.getDriver());
		logoutPage = new LogOutPage(driverFactory.getDriver());
		homePage = new HomePage(driverFactory.getDriver());
		program = new ProgramPage(driverFactory.getDriver());
		programPage= new ProgramPageTwo(driverFactory.getDriver());
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
	public ClassPage getClassPage() {
		return classPage;
	}
        public LogOutPage getLogOutPage() {
		return logoutPage;
	}
	
	public HomePage getHomePage() {
		return homePage;
	}

	
	public ProgramPageTwo getEditProgramPage() {
		return programPage;
	}
	
	public void openBaseURL(String url) {
		getDriverFactory().getDriver().get(url); // Use WebDriver to open the URL
	}


}
