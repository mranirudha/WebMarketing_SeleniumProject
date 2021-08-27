package day2Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExampleMultipleElements extends openCloseBrowser 
{

	@Test
	public void CounOfLinks() 
	{
	
		url="http://www.softest-training.com/index.php";
		driver.get(url);
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int cnt=links.size();
		System.out.println("No of Links on the Homepage "+cnt);
		
		for (WebElement link:links) 
		{
		
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			System.out.println("----------------");			
		}
		
	}
}
