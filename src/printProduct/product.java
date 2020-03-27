package printProduct;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class product {
	WebDriver driver;
	
	@FindBy(xpath="//span[@class='a-size-base-plus a-color-base a-text-normal']") List<WebElement> prodname;
	
	@FindBy(xpath="//span[@class='a-price-whole']") List<WebElement> prodprice;
	FileLibrary flib=new FileLibrary(driver);
	String excelpath="F:\\signzy\\com.amzon\\product.xlsx";
	
	public void excel() throws Throwable
	{
		int count=prodname.size();
	 for(int i=1;i<count;i++)
	 {
		 WebElement onelink=prodname.get(i);
		 String text=onelink.getText();
		 System.out.println(text);
		flib.setCell0Data(excelpath, "Sheet2", i, 0, text);
		
		WebElement onelink1=prodprice.get(i);
		 String text1=onelink1.getText();
		flib.setCell1Data(excelpath, "Sheet2", i, 1, text1);
		
		
	 
	 }
	}

	public product(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

}
