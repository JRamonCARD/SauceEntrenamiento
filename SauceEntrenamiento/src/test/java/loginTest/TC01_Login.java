package loginTest;

import org.testng.annotations.Test;

import commonClasses.DriverSetUp;
import commonClasses.GlobalVariables;
import navigationPage.LoginPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;



public class TC01_Login {
	
		//Declare and Initialized an object type WebDriver called "driver" to assign the function inside the method "setDtiver"
		WebDriver driver = DriverSetUp.setDriver();
		
		
		//Page Objects
		LoginPage loginPage = new LoginPage(driver);
		
		
	@BeforeTest
		//Method to start page, calling the browser with the URL saved in GlobalVariables
		public void startWebPage() {
			driver.get(GlobalVariables.HOME_PAGE);
		}
  
 
	  @Test
	  public void TC01() {
		  
		  loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.STANDARD_PASSWORD);
		  
	  }
	  
	  @AfterTest
	  public void closeDriver() {
		  driver.quit();
	  }
	  
	  
	  

  
}
