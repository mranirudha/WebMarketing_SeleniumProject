package day2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGExample2 {
	
	WebDriver driver;
	String fn,url,title;	
	@BeforeTest	
	public void OpenBrowser() 
	{
		fn="D:\\22 oct training\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver",fn);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@AfterTest
	public void ClseDriver() 
	{
		driver.quit();	
	}
	@Test
	public void GoogleSearch() 
	{
		url="https://www.google.com";
		driver.get(url);
		title=driver.getTitle();
		System.out.println("URL "+title);
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		driver.findElement(By.name("btnK")).click();
		title=driver.getTitle();
		System.out.println("Current URL "+title);
		driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
		System.out.println("2nd URL "+ driver.getCurrentUrl());
	}
	

}
