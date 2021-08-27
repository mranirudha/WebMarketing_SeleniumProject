package day04Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExampleDDT extends OpenCloseBrowser
{
@Test(enabled=false)
public void ReadXL() throws Exception
{
	String filePath="Data/TestData.xlsx";
	FileInputStream fileIn=new FileInputStream(filePath);
	XSSFWorkbook wb=new XSSFWorkbook(fileIn);	
	XSSFSheet ws=wb.getSheetAt(0);
	int rc=ws.getLastRowNum()+1;
	int cc=ws.getRow(0).getLastCellNum();
	System.out.println("Rows : " + rc);
	System.out.println("Cols : " + cc);	
	for(int i=1;i<rc;i++)
	{
		XSSFRow row=ws.getRow(i);		
		for(int j=0;j<cc;j++)
		{
			XSSFCell cell=row.getCell(j);
			String val=cell.getStringCellValue();
			System.out.println(val);
		}
	}	
	wb.close();
	fileIn.close();	
}

@Test(dataProvider="ITC",dataProviderClass=MyDataProviders.class)
public void Google_DDT(String search)
{
	url="http://google.com";
	driver.get(url);
	title=driver.getTitle();
	System.out.println("Home Page Title : " + title);
	driver.findElement(By.id("lst-ib")).sendKeys(search);
	driver.findElement(By.name("btnK")).click();
	wait.until(ExpectedConditions.titleContains(search));
	title=driver.getTitle();
	System.out.println("Search Page : " + title);
	driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
	//wait.until(ExpectedConditions.urlContains("seleniumhq"));
	System.out.println("Selenium Page URL " + driver.getCurrentUrl());
}
}












