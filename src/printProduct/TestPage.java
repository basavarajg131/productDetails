package printProduct;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
//import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPage extends WebDriverCommonLib{
	
	WebDriver driver;
	
	@BeforeTest
	public void openBrowser()throws Throwable
	{
		System.out.println("In which browser you want launch the script: chrome,firefox,internet explorer or safari");
		Scanner sc=new Scanner(System.in);
		
		String browserValue=sc.nextLine();
		if(browserValue.equalsIgnoreCase("chrome"))
		{
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if(browserValue.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		else if(browserValue.equalsIgnoreCase("internet explorer"))
		{
			driver=new InternetExplorerDriver();
		}
		else if(browserValue.equalsIgnoreCase("safari"))
		{
			driver=new SafariDriver();
		}
		else 
		{
			System.out.println("Please provide correct browser name");
		}
		sc.close();
	} 
	
	
	@Test
	  public void Amazon() throws Throwable {
	
		 HomePage home= new HomePage(driver);
		 home.Search();
		 
		 SearchPage sp=new SearchPage(driver);
		 sp.analougebox();
		 sp.leathercheck();
		 sp.discount();
		 sp.seebtn();
		 sp.searchbrand();
		 
		 FileLibrary flib= new FileLibrary(driver);
		 String excelpath="F:\\signzy\\com.amzon\\product.xlsx";
		 flib.setCell0Data(excelpath, "Sheet2",0,0,"Product_name");
		 flib.setCell1Data(excelpath, "Sheet2",0,1,"Product_Price");
		
		 product prod=new product(driver);
		 prod.excel();
	 
	} 
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	} 

}



