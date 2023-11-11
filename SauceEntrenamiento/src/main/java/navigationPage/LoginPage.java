package navigationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonClasses.WrapClass;

public class LoginPage {
	
	//Constructor Method to instance the WebDriver, we should create one for each navigation page and ALWAYS should have the name of the MAIN CLASS
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);   //This line initialized all the web elements of the page even when the page is not loaded 100%
	}
	
	//Find Elements
	@FindBy(id = "user-name") private WebElement userNameTxt;  //Find an element using id, with the type=private as WebElement called "userNameTxt"
	@FindBy(id = "password") private WebElement passwordTxt;
	@FindBy(id = "login-button") private WebElement btnLogin;
	@FindBy(xpath = "//*[@class=\"error-message-container error\"]") public WebElement wrongPassword;
	
	
	//Methods to login 
	public void login(String user, String password) {
		WrapClass.sendKeys(userNameTxt, user);	
		WrapClass.sendKeys(passwordTxt, password);
		WrapClass.click(btnLogin);
	}
	
	//Method to validate error message using wrong password
	public boolean validateWrongPassword(){
		//Declare a boolean variable called "wrongPasswordMessage" to verify the content contains the message
		boolean wrongPasswordMessage = WrapClass.getText(wrongPassword).contains("Epic sadface: Username and password do not match any user in this service");	
		return wrongPasswordMessage;
	}
	

}
