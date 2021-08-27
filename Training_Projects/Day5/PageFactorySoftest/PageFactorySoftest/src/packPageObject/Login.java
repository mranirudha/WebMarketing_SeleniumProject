package packPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import org.testng.Reporter;

public class Login 
{
	private WebDriver driver;
	@CacheLookup
	@FindBy(how = How.ID, using = "textfield")
	WebElement username;
	
	@FindBy(how = How.ID, using = "textfield2")
	WebElement password;
	
	@FindBy(how = How.XPATH, using = "//*[@id='submit']")
	WebElement submit;
	
	@FindBy(how = How.CLASS_NAME, using = "style1")
	WebElement msgLoginFail;
	
	public Login(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public Login enterUser(String loginName) throws Exception
	{
		username.sendKeys(loginName);
		Reporter.log("UserName : "+ loginName,true);	
		return this;
	}
	
	public Login enterPwd(String pwd) throws Exception
	{
		password.sendKeys(pwd);
		Reporter.log("Password : " + pwd,true);	
		return this;
	}
	
	public void clickSubmit() throws Exception
	{
		submit.click();		
		Reporter.log("Clicked Submit");
	}
	
	
	public void VerifyMsg(String expMsg,String type) throws Exception
	{
		if(type.equalsIgnoreCase("Invalid"))
		{
			Reporter.log("Message displayed: " +msgLoginFail.getText(),true);
	    	Assert.assertEquals(msgLoginFail.getText(),expMsg); 
		}		
	}
	
}
