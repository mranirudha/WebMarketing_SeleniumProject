package day2Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGExample3 
{	
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
	@Test (priority=2)
	public void GoogleSearch()
	{
	title=driver.getTitle();
	System.out.println("Current URL "+title);
	}
	@Test (priority=1)
	public void Flipkart() 
	{
	title=driver.getTitle();
	System.out.println("Current URL "+title);
	}
	@Test (priority=3)
	public void Amazon() 
	{
	title=driver.getTitle();
	System.out.println("Current URL "+title);
	}	
}
