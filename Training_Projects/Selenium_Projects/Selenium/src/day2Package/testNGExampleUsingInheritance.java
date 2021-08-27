package day2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class testNGExampleUsingInheritance extends openCloseBrowser 
{
	@Test
	public void GoogleSearch() 
	{
		url="https://www.google.com";
		driver.get(url);
		title=driver.getTitle();
		System.out.println("URL "+title);
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		driver.findElement(By.name("btnK")).click();
		wait.until(ExpectedConditions.titleContains("Testing"));
		title=driver.getTitle();
		System.out.println("Current URL "+title);
		driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
		wait.until(ExpectedConditions.urlContains("wikipedia"));
		System.out.println("2nd URL "+ driver.getCurrentUrl());
	}
}
