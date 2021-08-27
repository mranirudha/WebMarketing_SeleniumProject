package day04Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class OpenCloseBrowser 
{
	public WebDriver driver;
	public WebDriverWait wait;
	
	public String fn,url,title;	
	@BeforeTest
	public void OpenBrowser()
	{
		fn="C:\\SeleniumSetup\\WebDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", fn);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,20);
	}
	@AfterTest
	public void CloseBrowser()
	{
		driver.quit();
	}

}
