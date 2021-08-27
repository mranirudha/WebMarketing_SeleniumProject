package day02Package;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class TestNgExample
{
	WebDriver driver;
	String fn,url,title;	
	@BeforeMethod
	public void OpenBrowser()
	{
		fn="C:\\SeleniumSetup\\WebDriver\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", fn);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void CloseBrowser()
	{
		driver.quit();
	}
	@Test
	public void TC_Google()
	{
		url="http://google.com";
		driver.get(url);
		System.out.println(driver.getTitle());
	}
	@Test
	public void TC_Amazon()
	{
		url="http://amazon.in";
		driver.get(url);
		System.out.println(driver.getTitle());
	}
	@Test
	public void TC_FB()
	{
		url="http://facebook.com";
		driver.get(url);
		System.out.println(driver.getTitle());
	}
}
