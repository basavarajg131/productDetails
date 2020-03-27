package printProduct;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FileLibrary {

	WebDriver driver;
	
	/*this method is used to write the data in excel file*/
	public void setCell0Data(String excelpath,String sheet,int r,int c,String cellvalue) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheet).createRow(r).createCell(c).setCellValue(cellvalue);
	FileOutputStream fos=new FileOutputStream(excelpath);
	wb.write(fos);
	wb.close();
		
		
	}
	/*this method is used to write the data in excel file*/
	public void setCell1Data(String excelpath,String sheet,int r,int c,String cellvalue) throws Throwable
	{
		FileInputStream fis=new FileInputStream(excelpath);
	Workbook wb=WorkbookFactory.create(fis);
	wb.getSheet(sheet).getRow(r).createCell(c).setCellValue(cellvalue);
	FileOutputStream fos=new FileOutputStream(excelpath);
	wb.write(fos);
	wb.close();
		
		
	}
	
	public FileLibrary(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
}

