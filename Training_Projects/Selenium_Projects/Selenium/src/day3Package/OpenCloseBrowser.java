package day3Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OpenCloseBrowser 
{

	WebDriverWait wait;
	WebDriver driver;
	String fn,url,title;	
	@BeforeTest	
	public void OpenBrowser() 
	{
		fn="D:\\22 oct training\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",fn);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Using ImplicitlyWait condition
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Using ExplicitlyWait condition
		 wait = new WebDriverWait(driver, 20);
	}
	@AfterTest
	public void ClseDriver() 
	{
		driver.quit();	
	}
}
