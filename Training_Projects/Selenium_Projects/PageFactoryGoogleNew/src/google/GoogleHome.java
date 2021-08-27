package google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import googlePack.CacheLookup;
import googlePack.FindBy;
import googlePack.GoogleHome;
import googlePack.GoogleSearch;
import googlePack.String;

public class GoogleHome 
{
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.ID, using = "lst-ib")
	public WebElement searchBox;
	
	@FindBy(how = How.NAME, using = "btnK")
	public WebElement searchButton;
	
	public GoogleHome(WebDriver driver)
	{
		this.driver = driver;
	}
	public GoogleHome HomePage()
	{
		String url="http://google.com";
	    driver.get(url); 
	    return this;
	}
	
	public GoogleHome enterSearchKey(String searchText)
	{
		searchBox.sendKeys(searchText);
		return this;
		
	}
	public GoogleSearch clickSearchButton()
	{
		searchButton.click();
		return new GoogleSearch(driver);

	}
	

}

