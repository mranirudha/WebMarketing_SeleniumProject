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
	
	public void OpenHomePage()
	{
		String url="http://softest-training.com";
	    driver.get(url); 
	    String title=driver.getTitle();
	    Reporter.log("Home Page : " + title,true);
	 }
	
	public void VerifyLogo()
	{
		Boolean logoDisplayed=logo.isDisplayed();
		Reporter.log("Logo is Displayed : " + logoDisplayed,true);
	}
	
	public void clickOnLogin() throws Exception
	{
		loginLink.click();		
	}
}
