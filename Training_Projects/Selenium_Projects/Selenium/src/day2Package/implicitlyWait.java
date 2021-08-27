package day2Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class implicitlyWait 
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
		//Using ImplicitlyWait condition
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	@AfterTest
	public void ClseDriver() 
	{
		driver.quit();	
	}
}
