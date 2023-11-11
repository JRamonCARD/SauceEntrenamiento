package loginTest;

import org.testng.annotations.Test;

import commonClasses.DriverSetUp;
import commonClasses.GlobalVariables;
import commonClasses.WrapClass;
import navigationPage.LoginPage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class TC02_Login_Wrong_Password {
	
	//Declare and initialized the WebDriver
	WebDriver driver = DriverSetUp.setDriver();
	
	
	//Declare and initialized the Login page constructor
	LoginPage loginPage = new LoginPage(driver);
	

	  
	  @BeforeClass
	  public void beforeClass() {
		  
		  //Use the driver to call the web page
		  driver.get(GlobalVariables.HOME_PAGE);
		  		 
	  }
	  
	  
	  @Test
	  public void TC02_Invalid_Password() {
		  
		  //Call the method Login from LopinPage class
		  loginPage.login(GlobalVariables.STANDARD_USER, GlobalVariables.WRONG_PASSWORD);
		  
		  //Declare boolean variable to validate the error message, calling the method "validaWrongPassword" from the class LoginPage
		  boolean errorWrongPassword = loginPage.validateErrorMessage();
		  
		  
		  //Validate if the content of the web element contains the expected message with an "assert"
		  Assert.assertTrue(errorWrongPassword);
		  

		  //I used below code just to confirm the text inside the web element, displaying it on the console
		  String validateError = WrapClass.getText(loginPage.wrongCredentials);
		  System.out.println(validateError);
		  
	  }
	
	  @AfterClass
	  public void afterClass() {
		  
		  driver.quit();
	  }

}
