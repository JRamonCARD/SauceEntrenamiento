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

public class TC03_Login_Wrong_User {
	
	//Declare and initialized the web driver
	WebDriver driver = DriverSetUp.setDriver();
	
	//Declare and initialized the constructor
	LoginPage loginPage = new LoginPage(driver);
	
	
 
	  @BeforeClass
	  public void beforeClass() {
		  
		  //Calling the web page
		  driver.get(GlobalVariables.HOME_PAGE);
		 
	  }
	  
	  @Test
	  public void TC03_Invalid_User() {
		  
		  //Calling the method login from Login Page
		  loginPage.login(GlobalVariables.WRONG_USER, GlobalVariables.STANDARD_PASSWORD);
		  
		  //Declare boolean variable to validate the error message
		  boolean errorWrongUser = loginPage.validateErrorMessage();
		  
		  //Validate if the content of the web element contains the expected message with an "assert"
		  Assert.assertTrue(errorWrongUser);
		  
		  
		  //Validate the content of the web element  and print
		  String errorMessage = WrapClass.getText(loginPage.wrongCredentials);
		  System.out.println(errorMessage);
		  
		  
	  }
	
	  @AfterClass
	  public void afterClass() {
		  
		  driver.quit();
	  }

}
