package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import googlePack.Exception;
import googlePack.FindBy;
import googlePack.GoogleSearch;
import googlePack.String;

public class GoogleSearch 
{
	private WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//div[@id='rso']/descendant::a[1]")
	public WebElement firstSuggestion;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void clickFirstSuggestion() throws Exception
	{
		firstSuggestion.click();
		Thread.sleep(1000);
		Reporter.log(driver.getCurrentUrl(),true);
	}
	
	public GoogleSearch VerifyTitle(String searchText)
	{
		Assert.assertTrue(driver.getTitle().contains(searchText));
		return this;
	}

}
