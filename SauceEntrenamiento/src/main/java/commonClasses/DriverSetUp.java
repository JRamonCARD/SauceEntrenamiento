package commonClasses;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetUp {
	
	
	//Create ChromDriver method to call the browser and use it, also I'm adding 20 seconds to load and wait
	public static WebDriver setDriver() {
		
		WebDriver driver = new  ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //
		return driver;
	}
	
	
	

}
