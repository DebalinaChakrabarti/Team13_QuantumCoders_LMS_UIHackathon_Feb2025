package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Constants;


public class ProgramPageTwo extends Constants {
	WebDriver driver;
	WebDriverWait wait;
	int numofrows;
	//Edit program xpaths
	private By Edit = By.xpath("//tbody/tr[1]/td[5]/div[1]/span[1]/button[1]/span[1]");
	private By saveBtn=By.xpath("//button[@id='saveProgram']");
	private By cancelBtn=By.xpath("//button[@class='p-button-rounded p-button-danger p-button p-component ng-star-inserted']");
	private By programName=By.xpath("//input[@id='programName']");
	private By programDescription=By.xpath("//input[@id='programDescription']");
	private By clickProgram=By.xpath("//span[normalize-space()='Program']");
	//private By closeBtn=By.xpath("//span[@class='p-dialog-header-close-icon ng-tns-c81-31 pi pi-times']");
	private By clickActiveBtn=By.xpath("//div[@class='p-radiobutton-box p-highlight']");
	private By clickInactiveBtn=By.xpath("//div[@class='p-radiobutton-box']");
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By roleDropdown = By.xpath("//div[@id='mat-select-value-1']");
	private By roleOption = By.xpath("//span[contains(text(), 'Admin')]");
	private By login = By.xpath("//button[@id='login']");
	private By successUpdated=By.xpath("//div[@class='p-toast-summary ng-tns-c20-16']");
	
	
	//Deleteprogram xpath
	private By DeleteBtn=By.xpath("(//button[@id='deleteProgram'])[1]");
	private By yesBtn=By.xpath("//span[normalize-space()='Yes']");
	private By noBtn=By.xpath("//span[text()='No']");
	private By CloseBtn=By.xpath("//span[contains(@class,'p-dialog-header-close-icon')]");
	private By confirmText=By.xpath("//span[text()='Confirm']");
	
	
	//Multiple Delete 
	private By checkbox1=By.xpath("(//div[@role='checkbox'])[3]");
	private By manyCheckbox=By.xpath("//tr[1]/td[1]");
	private By multipleDeleteBtn=By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	//button[@class='p-button-danger p-button p-component p-button-icon-only']
	//Search BAr xpath
	private By clickSearch=By.xpath("//input[@id='filterGlobal']");
	private By selectProgramname=By.xpath("//th[normalize-space()='Program Name']");
	private By selectProgramDescription=By.xpath("//th[normalize-space()='Program Description']");
	
	//Sorting xpath
	//(//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt'])[1]
	//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']
	private By programNameAscOrder=By.xpath("//th[@psortablecolumn='programName']");
	private By programNameDescOrder=By.xpath("//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']");
	private By programDescriptionAscOrder=By.xpath("//p-sorticon[@field='description']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']");
	private By programStatusAscOrder=By.xpath("//p-sorticon[@field='status']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']");
	public ProgramPageTwo(WebDriver driver){
		this.driver = driver;
	}
	public void getloginUrl() {
		System.out.println("============baseURL================ "+Constants.baseURL);
		driver.get(Constants.baseURL);
	}
	public void getprogramUrl() {
		driver.get(Constants.ProgramURL);
	}
	public void setUsername() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		 Thread.sleep(2000);
  	  // driver.findElement(username).sendKeys("sdetnumpyninja@gmail.com");
  	 driver.findElement(username).sendKeys(userName);
		//driver.get(Constants.userName);
		//driver.findElement(password).sendKeys(Passwd);
	//	driver.get(Constants.Password);
	}
	public void setPassword() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(password).sendKeys(Passwd);
		//driver.findElement(password).sendKeys("Feb@2025");
		//driver.get(Constants.Password);			
	}
	public void clickDropdown() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.findElement(roleDropdown).click();
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(roleOption));
 	   option.click(); 
 	  WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(login));
	   loginButton.click();
	}
	public void clickProgramBtn() throws InterruptedException {
		driver.findElement(clickProgram).click();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
	public void clickEdit() throws InterruptedException {
		Thread.sleep(1000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement editbutton=wait.until(ExpectedConditions.elementToBeClickable(Edit));
		editbutton.click();
		//driver.findElement(Edit).click();
	}
	public void pagerefresh() {
		driver.navigate().refresh();
	}
	public void editProgramname(String sheetname, String scenarioName) throws IOException, InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println(sheetname);
	       System.out.println(scenarioName);
	       String programname=null;
	       String msg=null;
	       int filterColumnIndex = 0;  
	       List<String> rowData = xlutils.getRowData(sheetname, filterColumnIndex, scenarioName);
	       programname=rowData.get(1);
	       msg=rowData.get(4);
	       driver.findElement(programName).sendKeys(programname);
	       Thread.sleep(2000);
	       driver.findElement(saveBtn).click();
	       System.out.println(""+msg);
	}
	public void editProgramDescription(String sheetname, String scenarioName) throws IOException, InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		System.out.println(sheetname);
	       System.out.println(scenarioName);
	       String programdescription=null;
	       String msg=null;
	       int filterColumnIndex = 0;  
	       List<String> rowData = xlutils.getRowData(sheetname, filterColumnIndex, scenarioName);
	       programdescription=rowData.get(3);
	       //msg=rowData.get(4);
	       driver.findElement(programDescription).sendKeys(programdescription);
	       Thread.sleep(2000);
	       driver.findElement(saveBtn).click();
	       System.out.println(""+msg);
	}

	public String appearonAlertMsg() {
		String hdng="Successful Program Updated";
		return hdng;
	}
	public String DisplayProgram() {
		String displaypopup="Program Details";
		return displaypopup;
	}
	public String DisappearMsg() {
		String disappearmsg="";
		return disappearmsg;
	}
	public String alertmsg() {
		return 
		driver.switchTo().alert().getText();
	}
	public boolean alertpopupano() {	
		Alert alert = driver.switchTo().alert(); 
		alert.accept();	
	alert.dismiss();
	return false;
	}



	public void changeStatus() {
		driver.findElement(clickActiveBtn).click();
		driver.findElement(saveBtn).click();
	}
	public void changeInactiveStatus() {
		driver.findElement(clickInactiveBtn).click();
		driver.findElement(saveBtn).click();
	}
	public void clickSaveBtn() {
		driver.findElement(saveBtn).click();
	}
	public void clickCancelBtn() {
		driver.findElement(cancelBtn).click();
	}
	public void clickDelete() {
		driver.findElement(DeleteBtn).click();
	}
	public String SuccessfulDeleteMsg() {
		String displaypopup="Successful Program Deleted";
		return displaypopup;
	}
	public String getConfirmTxt() {
		return driver.findElement(confirmText).getText();
	}
	public void clickYesBtn() {
		driver.findElement(yesBtn).click();
	}
	public void clickNoBtn() {
		driver.findElement(noBtn).click();
	}
	public void clickCloseBtn() {
		
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(CloseBtn));
	 	   option.click(); 
	}
	public void clickAnyCheckbox() {
		WebElement anycheckBox=driver.findElement(By.xpath("//tr[1]/td[1]"));
		anycheckBox.click();
	}

public void clickMultipleCheckbox() {
	clickAnyCheckbox();
	clickAnyCheckbox();
}
public void clickCheckBox() {
	driver.findElement(checkbox1).click();
}
public void click_DeleteBtn() {//multiple delete Button
	driver.findElement(multipleDeleteBtn).click();
}
public void searchProgramName() {
	driver.findElement(clickSearch).click();
	driver.findElement(clickSearch).sendKeys("CoreJava");
}
public void searchProgramDescription() {
	driver.findElement(clickSearch).click();
	driver.findElement(clickSearch).sendKeys("AuromationTesting");
}
public void searchNoprogram() {
	driver.findElement(clickSearch).click();
	driver.findElement(clickSearch).sendKeys("12");
}
public void searchPartialProgram() {
	driver.findElement(clickSearch).click();
	driver.findElement(clickSearch).sendKeys("Core");
}
public void clickArrowProgramName() {
	//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-down']
	//i[@class='p-sortable-column-icon pi pi-fw pi-sort-amount-up-alt']
	
	driver.findElement(programNameAscOrder).click();
}
public void clickArrowProgramDescription() {
	driver.findElement(programDescriptionAscOrder).click();
}
public void clickArrowProgramStatus() {
	driver.findElement(programStatusAscOrder).click();
}
}
