package day02Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExampleGoogle extends OpenCloseBrowser
{
	@Test
	public void GoogleSearch()
	{
		url="http://google.com";
		driver.get(url);
		title=driver.getTitle();
		System.out.println("Home Page Title : " + title);
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		wait.until(ExpectedConditions.titleContains("Selenium"));
		title=driver.getTitle();
		System.out.println("Search Page : " + title);
		driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
		wait.until(ExpectedConditions.urlContains("seleniumhq"));
		System.out.println("Selenium Page URL " + driver.getCurrentUrl());
	}		
}
