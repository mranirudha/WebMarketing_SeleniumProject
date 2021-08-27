package mavenPackage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCloseBrowser 
{
	WebDriver driver;
	String 	url;
	
	@BeforeTest
	public void Open()
	{
		WebDriverManager.firefoxdriver().setup();
		
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	
	@AfterTest
	public void Close()
	{
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
			Reporter.log(rprt);
		}
		else
		{
			Reporter.log("<p><font color=\"green\">Method " +fn + "   PASSED</p>");
			Reporter.log("passed");			
		}
	}

}
