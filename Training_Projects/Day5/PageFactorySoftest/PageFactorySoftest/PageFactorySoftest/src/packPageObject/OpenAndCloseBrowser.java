package packPageObject;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class OpenAndCloseBrowser 
{
	WebDriver driver;
	String url,title,fn;
	WebDriverWait wait;
	
	@Parameters("browser")
	@BeforeTest
	public void OpenBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("ff"))
		{
			fn="C:\\SeleniumSetup\\GeckoDriver\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", fn);
			driver=new FirefoxDriver();				
		}
		else if(browser.equalsIgnoreCase("ie"))
		{
			File file=new File("C:\\SeleniumSetup\\IE-Driver\\IEDriverServer.exe");
			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
			driver=new InternetExplorerDriver();
		}
		else if(browser.equalsIgnoreCase("ch"))
		{
			fn="C:\\SeleniumSetup\\ChromeDriver\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", fn);
			driver=new ChromeDriver();
		}
		else
		{
			System.out.println("No browser defined");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void CloseBrowser()
	{
	//	driver.close();
		driver.quit();
	}

	@AfterMethod
	public void TestAfterMethod(ITestResult result) throws Exception
	{
		String fn1=result.getMethod().getMethodName();
		String fn=result.getTestClass().getName()+"_"+fn1;
		if(!result.isSuccess())
		{
			Reporter.log("<p><font color=\"red\"><b>Method " +fn + "   FAIL</b></p>");
			Reporter.log("passed");			
			String FileName=fn+new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss").format(new Date());
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			String dest=projectPath+"\\SnapShots\\"+FileName+".jpg";
			File destFile=new File(dest) ;
			FileUtils.copyFile(srcFile, destFile);
			Reporter.log("SnapShot saved in " + destFile,true);		
		}
		else
		{
			Reporter.log("<p><font color=\"green\"><b>Method " +fn + "   PASSED</b></p>");
			Reporter.log("passed");			
		}
}
}
