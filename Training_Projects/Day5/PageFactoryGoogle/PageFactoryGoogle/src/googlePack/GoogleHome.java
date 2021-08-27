package googlePack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
