package day4Package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.charts.XSSFScatterChartData;
import org.testng.annotations.Test;

public class ExampleDDT 
{
	@Test
	public void ReadXls () throws Exception 
	{
	String filepath="TestData/TestData.xlsx";
	FileInputStream fis=new FileInputStream(filepath);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet ws=wb.getSheet("Sheet1");
	int rc=ws.getLastRowNum()+1;
	int cc=ws.getRow(0).getLastCellNum();
	System.out.println("Count of Rows : "+rc);
	System.out.println("Count of Colums : "+cc);
	
	for (int i=1;i<rc;i++) 
	{
		XSSFRow row=ws.getRow(i);
		for (int k=0;k<cc;k++)
		{
			XSSFCell cell=row.getCell(k);
			String val =cell.getStringCellValue();
			System.out.println(val);
		}
	}
	wb.close();
	fis.close();
	}

}
