package day4Package;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExampleGoogleSearchUsingDDT extends OpenCloseBrowser
{
	@DataProvider(name ="SearchKeyWords")
	//@Test
	public static String[][] ReadXls () throws Exception 
	{
	String filepath="TestData/GoogleSearch.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	int rc=ws.getLastRowNum()+1;
	int cc=ws.getRow(0).getLastCellNum();
	System.out.println("Count of Rows : "+rc);
	System.out.println("Count of Colums : "+cc);
	String [][] dataArr=new String [rc-1][cc];
	for (int i=1;i<rc;i++) 
	{
		XSSFRow row=ws.getRow(i);
		for (int k=0;k<cc;k++)
		{
			XSSFCell cell=row.getCell(k);
			String val =cell.getStringCellValue();
			dataArr[i-1][k]=val;
		}
	}
	wb.close();
	fis.close();
	return dataArr;
	}
	@Test(dataProvider="SearchKeyWords", dataProviderClass=ExampleGoogleSearchUsingDDT.class)
	public void GoogleDDT (String Tool)  
	{
		String url = "https://www.google.com";
		driver.get(url);
		title=driver.getTitle();
		System.out.println("URL "+title);
		driver.findElement(By.id("lst-ib")).sendKeys(Tool);
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		wait.until(ExpectedConditions.titleContains(Tool));
		title=driver.getTitle();
		System.out.println("Current URL "+title);
		driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
		System.out.println("2nd URL "+ driver.getCurrentUrl());
		
	}
}
