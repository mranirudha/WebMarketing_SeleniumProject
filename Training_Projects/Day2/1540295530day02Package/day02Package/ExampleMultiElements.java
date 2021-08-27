package day02Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExampleMultiElements extends OpenCloseBrowser
{
	@Test(enabled=false)
	public void countLinks()
	{
		url="http://softest-training.com";
		driver.get(url);
		
		List <WebElement> links=driver.findElements(By.tagName("a"));
		int cnt=links.size();
		System.out.println("No of links on HomePage : " + cnt);
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
			System.out.println("=======");
		}
	}
	@Test(enabled=false)
	public void countClientLogo() throws Exception
	{
		url="http://softest-training.com/";
		driver.get(url);
		System.out.println(driver.getTitle());		
		driver.findElement(By.xpath("(//a[text()='Clients'])[2]")).click();
		WebElement clientList=driver.findElement(By.className("deti"));
		List <WebElement> clientLogo=clientList.findElements(By.tagName("img"));
		System.out.println("No of client Logo : " + clientLogo.size());		
		for(WebElement image:clientLogo)
		{
			System.out.println(image.getAttribute("src"));
		}		
	}
	@Test(enabled=false)
	public void cntSuggest_1()
	{
		url="http://google.com";
		driver.get(url);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		List<WebElement> suggestion=driver.findElements(By.className("sbqs_c"));
		System.out.println(suggestion.size());
		for(WebElement sugg:suggestion)
		{
			System.out.println(sugg.getText());
		}		
	}
	
	@Test(enabled=false)
	public void cntSuggest_2()
	{
		url="http://google.com";
		driver.get(url);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		List<WebElement> suggestion=driver.findElements(By.xpath("//div[starts-with(@id,'sbse')]/div[2]"));
		System.out.println(suggestion.size());
		for(WebElement sugg:suggestion)
		{
			System.out.println(sugg.getText());
		}	
	}
	
	@Test(enabled=true)
	public void cntSuggest_3()
	{
		url="http://google.com";
		driver.get(url);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		
		//div[@id='sbse0']/div[2]
		String x1="//div[@id='sbse";
		int x2=0;
		String x3="']/div[2]";
		String xpath=x1+x2+x3;
		
		try
		{
			while(driver.findElement(By.xpath(xpath)).isDisplayed())
			{
				System.out.println(driver.findElement(By.xpath(xpath)).getText());
				x2++;
				xpath=x1+x2+x3;
			}
		}
		catch(Exception e)
		{
			System.out.println("No more suggestions");
		}
	}
}







