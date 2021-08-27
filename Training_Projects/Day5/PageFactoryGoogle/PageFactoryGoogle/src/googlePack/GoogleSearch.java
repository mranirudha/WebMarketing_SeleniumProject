package googlePack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

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
