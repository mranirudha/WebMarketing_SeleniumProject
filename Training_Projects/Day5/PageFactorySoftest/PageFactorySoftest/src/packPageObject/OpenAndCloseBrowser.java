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
			System.setProperty("org.uncommons.reportng.escape-output", "false");			
			String FileName=fn+new SimpleDateFormat("dd-MM-yyyy_hh_mm_ss").format(new Date());
			File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String projectPath=System.getProperty("user.dir");
			System.out.println(projectPath);
			String dest=projectPath+"\\SnapShots\\"+FileName+".jpg";
			File destFile=new File(dest) ;
			FileUtils.copyFile(srcFile, destFile);
			String destPath=destFile.getAbsolutePath();
			destPath=destPath.replace('\\', '/');
			destPath="file:///"+destPath;
			String rprt="<Html><Body><p><font color=\"red\">Method " +fn + "   FAILED <a href=\"" +destPath+ "\" >SnapShot</a></p></Body></Html>";
			//String destPath = destFile.toString();
			//String path = "<img src=\"file://" + destPath + "\" alt=\"\"/>";
			Reporter.log(rprt);
		}
		else
		{
			Reporter.log("<p><font color=\"green\">Method " +fn + "   PASSED</p>");
			Reporter.log("passed");			
		}
	}
}
