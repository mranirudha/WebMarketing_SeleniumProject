package packPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;


public class Student 
{
	private WebDriver driver;
	
	@CacheLookup
	@FindBy(how = How.LINK_TEXT, using = "Sign Out")
	WebElement Signout;
	
	@FindBy(how = How.XPATH, using = "//td[@class='menu_link2']/p[8]")
	WebElement msgLoginSuccess;
	
	public Student(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public Student VerifyStudent(String expMsg)
	{
		Reporter.log("Message displayed : " + msgLoginSuccess.getText(),true);			
		Assert.assertTrue(msgLoginSuccess.getText().contains(expMsg));		
		return this;
	}
	public Home clickSignout() throws Exception
	{
		Signout.click();		
		Reporter.log("Back to Home after SignOut :" + driver.getCurrentUrl(),true);
		return new Home(driver);
	}
	


}
