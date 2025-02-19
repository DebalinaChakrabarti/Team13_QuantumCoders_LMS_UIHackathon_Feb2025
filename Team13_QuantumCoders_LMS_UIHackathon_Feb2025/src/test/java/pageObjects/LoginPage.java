package pageObjects;

import java.util.List;
import org.openqa.selenium.Keys;

import javax.net.ssl.HttpsURLConnection;
import org.languagetool.JLanguageTool;
import org.languagetool.language.AmericanEnglish;
import org.languagetool.rules.RuleMatch;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import net.sourceforge.tess4j.ITesseract;
//import net.sourceforge.tess4j.Tesseract;
//import net.sourceforge.tess4j.TesseractException;
import utilities.Constants;
import java.net.HttpURLConnection;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.awt.Color;
import java.io.File;

public class LoginPage extends Constants {
	WebDriver driver;
	WebDriverWait wait;
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By roleDropdown = By.xpath("//div[@id='mat-select-value-1']");
	private By roleOption = By.xpath("//span[contains(text(), 'Admin')]");
	private By login = By.xpath("//button[@id='login']");
	
			
	public LoginPage(WebDriver driver){
			this.driver = driver;
		}
	
	public void getloginUrl() {
		System.out.println("============baseURL================ "+Constants.baseURL);
		driver.get(Constants.baseURL);
	}
	
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
	}


	public void getinvalidloginurl() {
		driver.get(Constants.InvalidbaseUrl);
	}

	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	    	
	
	public void clickLoginBtn() {
		driver.findElement(login).click();
	}
	
	
	public void clicklogin(String sheetname, String scenarioName) throws IOException, InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		System.out.println(sheetname);
	       System.out.println(scenarioName);
	       
	       String userName = null;
	       String passwd = null;
	       String role = null;
	       
	        // the column index we want to filter by (e.g., column 1)(0-based)
	        int filterColumnIndex = 0;  

	        List<String> rowData = xlutils.getRowData(sheetname, filterColumnIndex, scenarioName);
	       
	       userName = rowData.get(1);
	       passwd = rowData.get(2);
           role = rowData.get(3);
           
           System.out.println("==================Username===== "+userName);
           System.out.println("==================Password===== "+passwd);
           System.out.println("==================role===== "+role);
	
           Thread.sleep(1000);
    	   driver.findElement(username).sendKeys(userName);
    	   Thread.sleep(1000);
    	   driver.findElement(password).sendKeys(passwd);
    	   
//    	   if("Admin".equalsIgnoreCase(role))
		   driver.findElement(roleDropdown).click();
        	   Thread.sleep(1000);

//         	   WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("roleDropdown")));
//        	   dropdown.click();

        	   WebElement option = wait.until(ExpectedConditions.elementToBeClickable(roleOption));
        	   option.click();        	   
        	   WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(login));
        	   loginButton.click();    	   
 //   	   driver.findElement(login).click();
//    	   Thread.sleep(1000);
	
	}
		
	
	


}