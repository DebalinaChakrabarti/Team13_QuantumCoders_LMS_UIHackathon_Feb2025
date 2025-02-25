package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Constants;

public class ProgramPage extends Constants{
	
    WebDriver driver; // variable name 
	WebDriverWait wait;
	
	//Constructor
	public ProgramPage(WebDriver driver){
		this.driver = driver;
	}
	
	//Navigation
	
	private By program = By.xpath("//span[text()='Program']");
	
	//Menu Bar
	
	private By Menubar_Logout = By.xpath("//span[text()='Logout']");
	private By Heading_LMs=By.xpath("//span[text()=' LMS - Learning Management System ']");
	private By AddSubmenu=By.xpath("//button[text()='Add New Program']");
	
	//validation
	private By ManagePgm = By.xpath("//div[text()=' Manage Program']");
    private By ProgramList = By.xpath("//thead[@class='p-datatable-thead']");
    private By DeleteIcon = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
    private By Search = By.xpath("//input[@class='p-inputtext p-component']");
    private By Checkbox = By.xpath ( "//div[@class='p-checkbox-box']");
    private By CloumnHeaderLocator = By.xpath("//tr//th[contains(@class,'sortable')]");
    private By EditDelete = By.xpath("//th[text()=' Edit / Delete ']");
    private By Entries = By.xpath("//span[@class='p-paginator-current ng-star-inserted']");
    private By Footer=By.xpath("//div[@class='p-d-flex p-ai-center p-jc-between ng-star-inserted']");
    
    //Add New Program
    
    private By AddNewProgram = By.xpath("//div/button[text()='Add New Program']");
    private By ProgramWindowTitle =By.xpath("//span[text()='Program Details']");
    private By asterisk = By.xpath("//div[@class='p-field ng-star-inserted'][1]");
    private By Submission = By.xpath("//span[text()='Save']");
    private By FieldRequired = By.xpath("//small[@class='p-invalid ng-star-inserted']");
    private By Cancel = By.xpath("//span[@class='p-button-icon p-button-icon-left pi pi-times']");
    private By EnterProgram = By.id("programName");
    private By EnterDescription = By.id("programDescription");
    private By Active = By.xpath("//p-radiobutton[@class='ng-untouched ng-pristine ng-valid']");////span[@class='p-radiobutton-icon']
    private By Save = By.xpath("//span[contains(text(),'Save')]");
    private By XButton=By.xpath("//span[contains(@class,'p-dialog-header-close-icon')]");
	//Action Methods
	
	public void clickProgram() throws InterruptedException {//Navigation Action
		Thread.sleep(1000);
		driver.findElement(program).click();
	}
	public void pageRefresh()
	{
		driver.navigate().refresh();
	}
	
	//Menu Action
	
	public String LogoutOption() {
		String MenubarLogout=driver.findElement(Menubar_Logout).getText();
		return MenubarLogout;
		
	}
	public String PageHeading() {
		String Heading=driver.findElement(Heading_LMs).getText();
		System.out.println("LMS"+ Heading);
		return Heading;
     }
	public String AddSubMenu() {
		String AddProgram=driver.findElement(AddSubmenu).getText();
		return AddProgram;
		
	}
	
	
// validation Action method
	
	public String ManageProgramText() {
		String ManageProgram=driver.findElement(ManagePgm).getText();
		return ManageProgram;
		
	}
	public void ProgramListall() {
		driver.findElement(ProgramList);
		
	}
	public String Deletedisabled() {
		String DeleteDisabled=driver.findElement(DeleteIcon).getText();
		return DeleteDisabled;
	}
	public String Search() {
		String SearchButton = driver.findElement(Search).getText();
		System.out.println("Search Button"+ SearchButton);
		return SearchButton;
		
	}
	
	public List<WebElement> getColumnHeaders() {
        return driver.findElements(CloumnHeaderLocator);
    }
	
	
    public WebElement getCheckbox() {
        return driver.findElement(Checkbox); // Method to get the element
    }

    
    public boolean isCheckboxSelected() {
        return getCheckbox().isSelected();// Method to get the checkbox's selected state (whether it's checked or unchecked)
    }
	
    public String EntriesCheck() {
    	String EntriesChecks=driver.findElement(Entries).getText();;
		return EntriesChecks;
    }
    
    public String Editdelete() {
    	String EditDeleteButton = driver.findElement(EditDelete).getText();
    	return EditDeleteButton;
    }
    public String Footertext() {
    	String FooterText=driver.findElement(Footer).getText();
		return FooterText;
    	
    }
    //Add New Program Action Method
    public void AddNewProgram1() {
    	driver.findElement(AddNewProgram).click();
    }
    public String ProgramTitle() {
    	String ProgramDeatilsTitle = driver.findElement(ProgramWindowTitle).getText();
		return ProgramDeatilsTitle;
    }
   
	public void AstriskMandatoryFields() {
		driver.findElement(asterisk);
	
	}
	
	public void SubmissionClick() {
		driver.findElement(Submission).click();
	}
	public String FieldRequiredText() {
		String FieldRequiredTexts = driver.findElement(FieldRequired).getText();
		return FieldRequiredTexts;
		
	}
	public void ClickCancel() {
		driver.findElement(Cancel).click();
	}
	public void AddProgramText(String sheetname, String scenarioName) throws IOException, InterruptedException {
		System.out.println(sheetname);
	       System.out.println(scenarioName);
	       String programName;
	       String programDescription; 
	       String msg=null;
	       int filterColumnIndex = 0;  
	       List<String> rowData = xlutils.getRowData(sheetname, filterColumnIndex, scenarioName);
	       programName = rowData.get(1);
	       programDescription = rowData.get(2);
	       driver.findElement(EnterProgram).sendKeys(programName.trim());
	       Thread.sleep(1000);
	       driver.findElement(EnterDescription).sendKeys(programDescription);
	       Thread.sleep(1000);
	       System.out.println(""+msg);
	       driver.findElement(Active).click();
	       Thread.sleep(1000);
	       Saveprogram();
	       msg=rowData.get(4);
	       
	}
	public void ActiveStatus() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(Active).click();
	}
	public String MessageActive() {
		String Messageactive = driver.findElement(Active).getText();
		return Messageactive;
	}
	public void isAddProgramDisappeared() {
		try {
			//this is to make sure that cancel button is disappeared
			Thread.sleep(1000);
			((WebElement) Cancel).isDisplayed();
		} catch (Exception e) {
			Assert.assertTrue(true, "Add program is not displayed");
			return;
		}
		Assert.assertTrue(false, "Add program is still displaying");
	}
	
	
	public void Saveprogram() {
		driver.findElement(Save).click();
	}
	
	public void SearchClick() {
		  driver.findElement(Search).click();
	}
	public void SearchEnterText() {
		  driver.findElement(Search).sendKeys("Teamonethree");
	}
	public void XButtonClick() {
		driver.findElement(XButton).click();
	}

}
	
