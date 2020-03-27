package printProduct;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

WebDriver driver;



	@FindBy(xpath="((//li[@class='a-spacing-micro']/..)[8]//span[@class='a-size-base a-color-base'])[1]")
	WebElement analougebox ;
	public void analougebox()
	{
		
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,700)", "");
		 Actions ac=new Actions(driver);
		ac.moveToElement(analougebox).perform();
		analougebox.click();
	}
	
	@FindBy(xpath="((//li[@class='a-spacing-micro']/..)[9]//span[@class='a-size-base a-color-base'])[2]")
    WebElement discount;
	public void discount()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", ""); 
		Actions ac=new Actions(driver);
		 ac.moveToElement(discount).perform();
		discount.click();
	}
	
	@FindBy(xpath="((//li[@class='a-spacing-micro']/..)[12]//span[@class='a-size-base a-color-base'])[2]")
	 WebElement leathercheck;
	public void leathercheck()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		Actions ac=new Actions(driver);
		 ac.moveToElement(leathercheck).perform();
		 //Thread.sleep(2000);
		 leathercheck.click(); 
	}
	
	@FindBy(xpath="//a[@class='a-expander-header a-declarative a-expander-extend-header s-expander-text']") 
	WebElement seebtn;
	public void seebtn()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", ""); 
		Actions ac=new Actions(driver);
		 ac.moveToElement(seebtn).perform();
		 seebtn.click();
		 js.executeScript("window.scrollBy(0,2000)", ""); 
	}
	
	@FindBy(xpath="(//li[@class='a-spacing-micro']/..)[4]//span[@class='a-size-base a-color-base']")List<WebElement> brandoptn;
	
	public void searchbrand()
	{
		int count1=brandoptn.size();
		for(int i=1;i<count1;i++)
		{
			WebElement onelink=brandoptn.get(i);
		
			if(onelink.getText().equalsIgnoreCase("titan"))
			{
				System.out.println(i);
				System.out.println(onelink.getText());
				onelink.click();
				break;
			}
			
		}
		
	}
	
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}
