package packPageObject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;

public class Library 
{
	private WebDriver driver;
	
	public Library(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void VerifyExpPage(String expectedUrl)
	{
		Reporter.log("Page after Login is : " + driver.getCurrentUrl(),true);
		Assert.assertTrue(driver.getCurrentUrl().contains(expectedUrl));
	}

}
