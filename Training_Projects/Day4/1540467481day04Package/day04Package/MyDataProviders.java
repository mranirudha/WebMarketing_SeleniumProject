package day04Package;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class MyDataProviders 
{

	@DataProvider(name="ITC")
	public static String[][] ReadXL() throws Exception
	{
		String filePath="Data/TestData.xlsx";
		FileInputStream fileIn=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(fileIn);	
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum()+1;
		int cc=ws.getRow(0).getLastCellNum();
		System.out.println("Rows : " + rc);
		System.out.println("Cols : " + cc);	
		String[][] dataArr=new String[rc-1][cc];
		for(int i=1;i<rc;i++)
		{
			XSSFRow row=ws.getRow(i);		
			for(int j=0;j<cc;j++)
			{
				XSSFCell cell=row.getCell(j);
				String val=cell.getStringCellValue();
				dataArr[i-1][j]=val;
			}
		}	
		wb.close();
		fileIn.close();	
		return dataArr;
	}
}
