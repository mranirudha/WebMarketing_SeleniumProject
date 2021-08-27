package packPageObject;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import packPageObject.MyDataproviders;

public class SoftestRunner extends OpenAndCloseBrowser
{
	Home home ;
	Login login ;
	Student student;	
	Library lib;
	
	@BeforeMethod
	public void initElem()
	{
		 home = PageFactory.initElements(driver, Home.class);
		 login = PageFactory.initElements(driver, Login.class);
		 student=PageFactory.initElements(driver, Student.class);		
	}
		
	@Test(dataProvider="DP-XL",dataProviderClass=MyDataproviders.class)
	public void testLogin(String user,String pwd,String verify,String page,String type) throws Exception
	{
		Reporter.log("HOME : ",true);
		home.OpenHomePage().VerifyHome().VerifyLogo().clickOnLogin();

		Reporter.log("Login Type : " + type,true);		
		login.enterUser(user).enterPwd(pwd).clickSubmit();
		
		lib=new Library(driver);
		lib.VerifyExpPage(page);
		if(type.equalsIgnoreCase("Valid"))
		{
			student.VerifyStudent(verify).clickSignout().VerifyHome();
		}		
		else
		{
			login.VerifyMsg(verify, type);
		}
	}	
}
