package googlePack;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleMain extends OpenAndCloseBrowser
{

	GoogleHome home;
	GoogleSearch search;
	
	@BeforeMethod
	public void initElem()
	{
		 home = PageFactory.initElements(driver, GoogleHome.class);
		 search = PageFactory.initElements(driver, GoogleSearch.class);		
	}
	
	@Test(dataProvider="Google",dataProviderClass=MyDataproviders.class)
	public void testLogin(String searchKey) throws Exception
	{
		/*home.HomePage();
		home.enterSearchKey(searchKey);
		home.clickSearchButton();
		search.VerifyTitle(searchKey);
		search.clickFirstSuggestion();*/
		
		home.HomePage().enterSearchKey(searchKey).clickSearchButton().VerifyTitle(searchKey).clickFirstSuggestion();
		
		
		//.enterSearchKey(searchKey).clickSearchButton().clickFirstSuggestion();
	}
	
	
}
