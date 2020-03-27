package printProduct;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class HomePage {

	 WebDriver driver;
	 
	 /*storing address as a string*/
	String url="http://www.amazon.in";
	JavascriptExecutor js=(JavascriptExecutor) driver;
	/*storing search text box web element address through @FindBy and performing action by using variable searchInput*/
	@FindBy(xpath="//input[@id='twotabsearchtextbox']") WebElement SearchInput;
	public void Search(){
		SearchInput.clear();
		SearchInput.sendKeys("Wrist watches");
		SearchInput.sendKeys(Keys.ENTER);
		
	    }

	/* Constructor for HomePage */

	public HomePage(WebDriver driver){
		this.driver=driver;
		driver.get(url);
		PageFactory.initElements(driver, this);
	}
}
