package googlePack;


import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class MyDataproviders {
	@DataProvider(name="Google")
	public static Object[][] ReadXL() throws Exception
	{
		String filePath="TestData//Google.xlsx";
		FileInputStream file=new FileInputStream(filePath);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet ws=wb.getSheetAt(0);
		int rc=ws.getLastRowNum()+1;
		int cc=ws.getRow(0).getLastCellNum();
		String[][] data=new String[rc-1][cc];
		for(int i=1;i<rc;i++)
		{
			XSSFRow row=ws.getRow(i);
			for(int j=0;j<cc;j++)
			{
				XSSFCell cell=row.getCell(j);
				String val=cell.getStringCellValue();
				data[i-1][j]=val;
			}
		}
		wb.close();
		file.close();
		return data;
		
	}

}
