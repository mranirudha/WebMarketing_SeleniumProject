package day03Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExampleWebTable extends OpenCloseBrowser
{
@Test(enabled=false)
public void WebTable01()
{
	url="file:///F:/Selenium-SampleHTML/WebTable.html";
	driver.get(url);
	driver.findElement(By.xpath("//td[text()='LoadRunner']/following-sibling::td[5]/a[text()='EDIT']")).click();
	System.out.println(driver.getCurrentUrl());
}
@Test(enabled=true)
public void WebTable02()
{
	url="file:///F:/Selenium-SampleHTML/WebTable.html";
	driver.get(url);
	WebElement table=driver.findElement(By.xpath("//table[@id='table1']/tbody"));
	List <WebElement> rows=table.findElements(By.tagName("tr"));
	for(WebElement row:rows)
	{
		List <WebElement> columns=row.findElements(By.tagName("td"));
		for(WebElement col:columns)
		{
			if(col.getText().equalsIgnoreCase("LoadRunner"))
			{
				int rowNo=rows.indexOf(row)+1;
				System.out.println("Row No :" + rowNo);
				row.findElement(By.xpath("td/a[text()='EDIT']")).click();
				System.out.println(driver.getCurrentUrl());
				break;
			}
		}
	}
}
}








