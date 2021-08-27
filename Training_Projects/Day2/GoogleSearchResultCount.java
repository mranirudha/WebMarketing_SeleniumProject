package day2Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class GoogleSearchResultCount extends openCloseBrowser 
{

	@Test (enabled=false)
	public void SearchResultCount() 
	{
		url="https://www.google.com/";
		driver.get(url);
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		List <WebElement> Suggestion = driver.findElements(By.className("sbqs_c")); 
		System.out.println(Suggestion.size());
		for (WebElement sugg:Suggestion) 
		{
		
			System.out.println(sugg.getText());
		}
		
	}
	
	@Test (enabled=false)
	public void SearchResultCount_1() 
	{
		url="https://www.google.com/";
		driver.get(url);
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		List <WebElement> Suggestion = driver.findElements(By.xpath("//div[starts-with(@id,'sbse')]/div[2]")); 
		System.out.println(Suggestion.size());
		for (WebElement sugg:Suggestion) 
		{
		
			System.out.println(sugg.getText());
		}
		
	}
	
	@Test (enabled=true)
	public void SearchResultCount_2() 
	{
		url="https://www.google.com/";
		driver.get(url);
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		//xpath--> //div[@id=sbse0']/div[2]
		String x1="//div[@id='sbse";
		int x2=0;
		String x3="']/div[2]";
		String xpath=x1+x2+x3;
		try
		{
			while (driver.findElement(By.xpath(xpath)).isDisplayed()) 
			{
			
				System.out.println(driver.findElement(By.xpath(xpath)).getText());
				x2++;
				xpath =x1+x2+x3;
			}
		}
		catch(Exception e)
		{
			System.out.println("No more suggestions");
		}
		
	}
	
}
