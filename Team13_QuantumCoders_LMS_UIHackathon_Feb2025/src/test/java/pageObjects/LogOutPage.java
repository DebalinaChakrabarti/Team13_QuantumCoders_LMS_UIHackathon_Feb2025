
package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Constants;



	public class LogOutPage extends Constants {
		WebDriver driver;
	WebDriverWait wait;
	private By username = By.xpath("//input[@id='username']");
	private By password = By.xpath("//input[@id='password']");
	private By logout =By.xpath ( "//button[@id='logout']");
 

public LogOutPage(WebDriver driver) {
     
	this.driver = driver;
  }


  public  void clickLogout() {
	  driver.findElement(logout).click(); 
   }
}


