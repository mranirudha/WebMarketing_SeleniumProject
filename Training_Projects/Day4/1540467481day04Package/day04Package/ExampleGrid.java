package day04Package;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ExampleGrid 
{
	WebDriver driver;
//	String fn,url;
	
	@Test
	public void Grid1() throws Exception
	{
		URL NodeUrl1 = new URL("http://localhost:5555/wd/hub"); // ip of node 1
		DesiredCapabilities capabilities1 = new DesiredCapabilities();
		capabilities1.setBrowserName("firefox");
			
		driver = new RemoteWebDriver(NodeUrl1, capabilities1);
		driver.get("http://amazon.in");
		System.out.println(driver.getTitle());
	}
	@Test
	public void Grid2() throws Exception
	{
		URL NodeUrl2 = new URL("http://localhost:6666/wd/hub"); // ip of node 1
		DesiredCapabilities capabilities2 = new DesiredCapabilities();
		capabilities2.setBrowserName("chrome");
		
		driver = new RemoteWebDriver(NodeUrl2, capabilities2);
		driver.get("http://facebook.com");
		System.out.println(driver.getTitle());
	}
	@AfterMethod
	public void Close()
	{
		driver.quit();
	}

}
