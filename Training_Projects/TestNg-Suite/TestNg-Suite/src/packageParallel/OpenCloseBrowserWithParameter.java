package packageParallel;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class OpenCloseBrowserWithParameter
{
	WebDriver driver;
	String url,fn;
	WebDriverWait wait;
	
	@Parameters("browser")
	@BeforeTest
	public void OpenBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			fn="D:\\22 oct training\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", fn);
			driver=new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			File file=new File("D:\\22 oct training\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("ch"))
		{
			fn="D:\\22 oct training\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", fn);
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("No browser defined");
		}
		driver.manage().window().maximize();
		//Using ImplicitlyWait condition
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		//Using ExplicitlyWait condition
		 wait = new WebDriverWait(driver, 20);
	}
	@AfterTest
	public void CloseBrowser()
	{
		//driver.close();
		driver.quit();
	}
}
