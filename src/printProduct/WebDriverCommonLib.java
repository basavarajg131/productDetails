package printProduct;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;


public class WebDriverCommonLib {
WebDriver driver;
	public void waitForPageLoad(){
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	
	
	
}
