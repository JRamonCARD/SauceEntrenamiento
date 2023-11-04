package commonClasses;

import org.openqa.selenium.WebElement;

public class WrapClass {
	
	//Method to called "click"  to do clicks
	public static void click (WebElement webelementUI) {
		webelementUI.click();
	}

	
	//Method to called "sendKeys"  to do send data
	public static void sendKeys (WebElement webelementUI, String text) {
		webelementUI.sendKeys(text);
	}
	
}
