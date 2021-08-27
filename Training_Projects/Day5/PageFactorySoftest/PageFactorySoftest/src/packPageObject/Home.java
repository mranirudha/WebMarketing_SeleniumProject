package packPageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Reporter;

public class Home 
{
private WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.LINK_TEXT, using = "Login")
	public WebElement loginLink;
	//OR
	
	
	//OR
		/*By loginElement=By.id("xxxx");
		By x=By.xpath("");
		By y=By.name("");*/
	//By logoElem=By.name("aaaa");
	//By signout=By.linkText("signout");

	@FindBy(how = How.XPATH, using = "//div[@id='top']/descendant::img[1]")
	public WebElement logo;
	
	public Home(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public Home OpenHomePage()
	{
		String url="http://softest-training.com";
	    driver.get(url); 
	    return this;
	}
	    
	public Home VerifyHome()
	{
		String title=driver.getCurrentUrl();
	    Reporter.log("Home Page : " + title,true);
	    return this;
	 }
	
	public Home VerifyLogo()
	{
		Boolean logoDisplayed=logo.isDisplayed();
		Reporter.log("Logo is Displayed : " + logoDisplayed,true);
		return this;
	}
	
	public Login clickOnLogin() throws Exception
	{
		loginLink.click();		
		return new Login(driver);
	}
}
