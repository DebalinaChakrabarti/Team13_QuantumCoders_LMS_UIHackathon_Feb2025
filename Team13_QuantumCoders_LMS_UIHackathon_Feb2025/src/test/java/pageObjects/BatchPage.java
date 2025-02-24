package pageObjects;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import utilities.Constants;

public class BatchPage extends Constants {
	WebDriver driver;
	WebDriverWait wait;
//Login
	private By username = By.xpath("//input[@id='username']");
	private By passwrd = By.xpath("//input[@id='password']");
	private By roleDropdown = By.xpath("//div[@id='mat-select-value-1']");
	private By roleOption = By.xpath("//span[contains(text(), 'Admin')]");
	private By login = By.xpath("//span[@class='mat-button-wrapper']");

	// Batch
	private By batchMenu = By.xpath("//span[normalize-space()='Batch']");
	public By lms = By.xpath("//span[normalize-space()='LMS - Learning Management System']");
	private By managBatch = By.xpath("//div[normalize-space()='Manage Batch']");
	private By multidelete = By.xpath("//button[@class='p-button-danger p-button p-component p-button-icon-only']");
	private By pagition = By.xpath("//div[@class='p-paginator-bottom p-paginator p-component ng-star-inserted']");
	private By checkBoxAll = By.xpath("//div[@class='p-checkbox-box p-component']");
	private By editAll = By.xpath(
			"//body[1]/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/span[1]/button[1]/span[1]");
	private By deleteAll = By.xpath(
			"//body[1]/app-root[1]/app-batch[1]/div[1]/mat-card[1]/mat-card-content[1]/p-table[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/div[1]/span[2]/button[1]");
	private By rowlocator = By.xpath("//p-table//table/tbody/tr");

	// Batch Page Header validation
	private By batchdptn = By.xpath("//th[normalize-space()='Batch Description']");
	private By batchName = By.xpath("//th[normalize-space()='Batch Name']");
	private By batchsts = By.xpath("//th[normalize-space()='Batch Status']");
	private By nOClass = By.xpath("//th[normalize-space()='No Of Classes']");
	private By headerpnme = By.xpath("//th[normalize-space()='Program Name']");
	private By editDlete = By.xpath("//th[normalize-space()='Edit / Delete']");
	private By checkBox = By.xpath("//div[@class='p-checkbox-box']");
	private By sortSymbol = By
			.xpath("//th[normalize-space()='Batch Name']//i[@class='p-sortable-column-icon pi pi-fw pi-sort-alt']");

	// Add New Batch Popup
	private By addnewbatch = By.xpath("//button[normalize-space()='Add New Batch']");
	private By prgmName = By.xpath("//p-dropdown[@id='programName']");
	private By bathNme1 = By.xpath("//input[@id='batchProg']");
	private By bathNme2 = By.xpath("//body//app-root//input[2]");
	private By batchdescription = By.xpath("//input[@id='batchDescription']");
	private By batchStatus = By.xpath("//div[@class='radio ng-star-inserted']");
	private By noOfClass = By.xpath("//input[@id='batchNoOfClasses']");
	// private By batchCancel = By.xpath("//span[normalize-space()='Cancel']");
	private By batchCancel = By
			.xpath("//button[@class='p-button-rounded p-button-danger p-button p-component ng-star-inserted']");
	private By batchSave = By
			.xpath("//button[@class='p-button-rounded p-button-success p-button p-component ng-star-inserted']");

	private By activeButton = By
			.xpath("//body//app-root//div[@role='dialog']//div//div[2]//p-radiobutton[1]//div[1]//div[2]");
	By InactiveButton = By.xpath("//div[contains(text(),'INACTIVE')]//div[2]");
	public By programDrop = By.xpath("//div[@role='button']");

	// Yes Or No
	public By delete = By.xpath("//tbody/tr[4]/td[7]/div[1]/span[2]/button[1]/span[1]");
	public By search = By.xpath("//input[@id='filterGlobal']");
	public By Yes = By.xpath(
			"//button[@class='ng-tns-c118-34 p-confirm-dialog-accept p-ripple p-button p-component ng-star-inserted']");
	private By no = By.xpath(
			"//button[@class='ng-tns-c118-34 p-confirm-dialog-reject p-ripple p-button p-component ng-star-inserted']");
	private By logout = By.xpath("//span[normalize-space()='Logout']");

	// AddNewBatchDetails
	private By alertmsg = By.xpath("//div[contains(@class, 'p-toast-detail')]");
	private By pName = By.xpath("//div[@role='button']");
	private By bNmae = By.xpath("//input[@id='batchProg']");

	private By edit = By.xpath("//tbody/tr[1]/td[7]/div[1]/span[1]/button[1]/span[1]");
	private By editPopup = By.xpath("//div[@role='dialog']");

	public BatchPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	}

	public void login() throws InterruptedException {
		driver.get(baseURL);
		Thread.sleep(5000);
		// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// wait.until(ExpectedConditions.urlToBe(baseURL));

		driver.findElement(username).sendKeys("sdetnumpyninja@gmail.com");
		driver.findElement(passwrd).sendKeys("Feb@2025");

		driver.findElement(roleDropdown).click();
		Thread.sleep(1000);
		WebElement option = wait.until(ExpectedConditions.elementToBeClickable(roleOption));
		option.click();
		WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(login));
		loginButton.click();

	}

	public void batchMenu() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement batchButton = wait.until(ExpectedConditions.visibilityOfElementLocated(batchMenu));
		batchButton.click();

	}

	public boolean isaddnewbatchDisplayed() {

		boolean isDisplayed = driver.findElement(addnewbatch).isDisplayed();
		System.out.println("Debug: Add New Batch is displayed: " + isDisplayed);
		return isDisplayed;
	}

	public void pageRefresh() {
		driver.navigate().refresh();
	}

	public boolean islmsDisplayed() {

		boolean isDisplayed = driver.findElement(lms).isDisplayed();
		System.out.println("Debug: lms is displayed: " + isDisplayed);
		return isDisplayed;
	}

	public boolean ismanagBatchDisplayed() {

		boolean isDisplayed = driver.findElement(managBatch).isDisplayed();
		System.out.println("Debug: ManageBatch is displayed: " + isDisplayed);
		return driver.findElement(managBatch).isDisplayed();
	}

	public boolean ismultideleteDisplayed() {
		boolean isDisplayed = driver.findElement(multidelete).isDisplayed();
		System.out.println("Debug: Delete is displayed: " + isDisplayed);
		boolean isEnabled = driver.findElement(multidelete).isEnabled();
		System.out.println("Debug: Delete is Enabled: " + isEnabled);
		return isDisplayed && isEnabled;
	}

	public boolean ispaginationDisplayed() {
		boolean isDisplayed = driver.findElement(pagition).isDisplayed();
		System.out.println("Debug: Pagination is displayed: " + isDisplayed);
		boolean isEnabled = driver.findElement(pagition).isEnabled();
		System.out.println("Debug: Pagination is Enabled: " + isEnabled);

		return isDisplayed && isEnabled;
	}

	public boolean isSortDisplayed() {
		boolean isDisplayed1 = driver.findElement(sortSymbol).isDisplayed();
		System.out.println("Debug: Sorting is displayed: " + isDisplayed1);

		return isDisplayed1;
	}

	public boolean isCheckboxDisplayed() {
		boolean isDisplayed = driver.findElement(checkBox).isDisplayed();
		System.out.println("Debug: CheckBox is displayed: " + isDisplayed);

		return isDisplayed;
	}

	public void checkTableElements() {

		List<WebElement> rows = driver.findElements(rowlocator);
		for (WebElement row : rows) {

			WebElement checkbox = row.findElement(checkBoxAll);
			Assert.assertTrue(checkbox.isDisplayed(), "Checkboxes are displayed");

			WebElement editButton = row.findElement(editAll);
			Assert.assertTrue(editButton.isDisplayed(), "Edit Boxes are displayed");

			WebElement deleteButton = row.findElement(deleteAll);
			Assert.assertTrue(deleteButton.isDisplayed(), "Delete Symbol are displayed");

		}

	}

	/*
	 * public void headersInBatchPage() throws IOException { }
	 */

	public void addNewBatch() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addButton = wait.until(ExpectedConditions.visibilityOfElementLocated(addnewbatch));
		addButton.click();

	}

	public void popupValidation() {

		List<By> fieldLocators = Arrays.asList(prgmName, bathNme1, bathNme2, batchdescription, batchStatus, batchCancel,
				batchSave);

		// Validate presence of all fields
		boolean allFieldsPresent = true;
		for (By locator : fieldLocators) {
			WebElement element = driver.findElement(locator);
			if (element == null || !element.isDisplayed()) {
				System.out.println("Missing field: " + locator.toString());
				allFieldsPresent = false;
			}
		}

		// Print final validation result
		if (allFieldsPresent) {
			System.out.println("All fields are displayed correctly.");
		} else {
			System.out.println("Some fields are missing.");
		}

	}

	public void clickCancel() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bCancel = wait.until(ExpectedConditions.visibilityOfElementLocated(batchCancel));

		bCancel.click();

	}

	public void clickSave() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bSave = wait.until(ExpectedConditions.visibilityOfElementLocated(batchSave));

		bSave.click();

	}

	public void clickActive() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bActive = wait.until(ExpectedConditions.visibilityOfElementLocated(activeButton));
		bActive.click();

	}

	public void clickInactive() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bInactive = wait.until(ExpectedConditions.visibilityOfElementLocated(InactiveButton));
		bInactive.click();

	}

	public void clickYes() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bYes = wait.until(ExpectedConditions.visibilityOfElementLocated(Yes));
		bYes.click();

	}

	public void clickNo() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bNo = wait.until(ExpectedConditions.visibilityOfElementLocated(Yes));
		bNo.click();

	}

	public void clickEdit() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bEdit = wait.until(ExpectedConditions.visibilityOfElementLocated(Yes));
		bEdit.click();

	}

	public void clickSearch() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(Yes));
		bSearch.click();

	}

	public void clickDelete() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bDelete = wait.until(ExpectedConditions.visibilityOfElementLocated(Yes));
		bDelete.click();

	}

	public void clickLogout() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		WebElement bLogout = wait.until(ExpectedConditions.visibilityOfElementLocated(Yes));
		bLogout.click();

	}

	public void clickDeleteMulti() {
		try {
			// Find all rows in the table
			List<WebElement> rows = driver.findElements(By.cssSelector(".p-datatable-tbody"));

			for (WebElement row : rows) {
				if (row.getText().contains("Application Testing")) {
					// Find the delete button in the same row and click it
					row.findElement(delete).click();
					System.out.println("Delete button clicked for batch: ");

					break;

				}
			}
		}

		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

		// driver.findElement(delete).click();

	}

	public void getErrorProgramNameMsg() {

		String errorMsg = "Program Name is required.";
		String actualMsg = driver.findElement(prgmName).getText();
		System.out.println(actualMsg);
		Assert.assertEquals(errorMsg, actualMsg);

	}

	public void getErrorBatch1Msg() {

		String errorMsg = "Batch Name is required.";
		String actualMsg = driver.findElement(alertmsg).getText();
		System.out.println(actualMsg);
		Assert.assertEquals(errorMsg, actualMsg);

	}

	public void getDescriptinMsg() {

		String errorMsg = "Batch Description is required.";
		String actualMsg = driver.findElement(alertmsg).getText();
		System.out.println(actualMsg);
		Assert.assertEquals(errorMsg, actualMsg);

	}

	public void getErrorStatusMsg() {

		String errorMsg = "Status is required.";
		String actualMsg = driver.findElement(alertmsg).getText();
		System.out.println(actualMsg);
		Assert.assertEquals(errorMsg, actualMsg);

	}

	public void getNoOfClassesMsg() {

		String errorMsg = "Number of classes is required..";
		String actualMsg = driver.findElement(alertmsg).getText();
		System.out.println(actualMsg);
		Assert.assertEquals(errorMsg, actualMsg);

	}

	public void sucessMessage() {

		Alert successMessage = driver.switchTo().alert();
		String message = successMessage.getText();
		System.out.println("Success Message: " + message);

	}

	public void datatableHeaderText() {

		String header1 = normalizeHeader(driver.findElement(batchName).getText());
		String header2 = normalizeHeader(driver.findElement(batchdptn).getText());
		String header3 = normalizeHeader(driver.findElement(batchsts).getText());
		String header4 = normalizeHeader(driver.findElement(nOClass).getText());
		String header5 = normalizeHeader(driver.findElement(headerpnme).getText());
		String header6 = normalizeHeader(driver.findElement(editDlete).getText());

		String actualHeaderText = header1 + " " + header2 + " " + header3 + " " + header4 + " " + header5 + " "
				+ header6;
		String expectedHeaderText = normalizeHeader(
				"Batch name Batch Description Batch Status No. of classes Program Name Edit/Delete");
		Assert.assertEquals("Datatable header text does not match", expectedHeaderText, actualHeaderText);
	}

	private String normalizeHeader(String headerText) {

		headerText = headerText.replace("/", " / ").replaceAll("\\s+", " ").trim();

		return headerText.replace(".", "").toLowerCase().trim();
	}

	public void addnewBatchData() throws IOException {
		try {
			Map<String, String> data = xlutils.getData("src\\test\\resources\\test_data\\TestData_LMS.xlsx", "Batch")
					.get(0);

			String pName = data.get("Program Name");
			String batchName = data.get("Batch Name");
			String batchNumber = data.get("BatchNumber");
			String description = data.get("Description");
			String status = data.get("Status");
			String noOfClasses = data.get("No Of Classes");

			// Print extracted values
			System.out.println("Program: " + pName + ", Batch Name: " + batchName + ", Batch Number: " + batchNumber
					+ ", Description: " + description + ", Status: " + status + ", No Of Classes: " + noOfClasses);

			// Select Program Name from Dropdown
			WebElement dropDown = driver.findElement(programDrop);
			dropDown.click();
			Select nameProgram = new Select(dropDown);
			nameProgram.selectByVisibleText(pName);

			// Validate Batch Name
			String bName = driver.findElement(bathNme1).getText();
			if (bName.equals(batchName)) {
				System.out.println("Both names match");
			} else {
				System.out.println("Both names do not match");
			}

			// Fill the batch details
			driver.findElement(bathNme2).sendKeys(batchNumber);
			driver.findElement(batchdescription).sendKeys(description);
			driver.findElement(activeButton).click();
			// WebElement statusButton = driver.findElement(activeButton);
			// statusButton.click();
			driver.findElement(batchStatus).sendKeys(status);
			driver.findElement(noOfClass).sendKeys(noOfClasses);

		} catch (NoSuchElementException e) {
			System.out.println("Element not found: " + e.getMessage());
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			System.out.println("No data found in Excel file: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
			e.printStackTrace();
		}

	}

	public void searchBatch() {
		try {
			WebElement searchBox = driver.findElement(search);
			searchBox.clear();
			searchBox.sendKeys("Application Testing");
			searchBox.click();

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement dataTable = wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//p-table[@responsivelayout='stack']")));
			List<WebElement> rows = dataTable.findElements(By.tagName("tr"));

			boolean isBatchFound = false;

			for (WebElement row : rows) {
				List<WebElement> columns = row.findElements(By.tagName("td"));
				for (WebElement column : columns) {
					if (column.getText().equals("Application Testing")) { // Match the batch name
						isBatchFound = true;
						break;
					}
				}
				if (isBatchFound) {
					break;
				}
			}

			if (isBatchFound) {
				System.out.println("Batch data found in the table.");
			} else {
				System.out.println("No matching batch data found.");
			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	public void editBatchData() throws IOException {

		driver.findElement(edit).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(editPopup));

		// Update batch name and other fields
		String batchNumber = "3";
		String description = "QA Testing";
		String noOfClasses = "10";

		driver.findElement(bathNme2).sendKeys(batchNumber);
		driver.findElement(batchdescription).sendKeys(description);
		driver.findElement(noOfClass).sendKeys(noOfClasses);
		driver.findElement(activeButton).click();

		driver.findElement(batchSave).click();
	}
}
