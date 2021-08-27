package com.eurofins.testcases;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eurofins.base.TestBase;
import com.eurofins.pages.HomePage;
import com.eurofins.util.TestUtil;

public class MainNavSubNavLinkImageTest extends TestBase{
	
	HomePage homepage;
	TestUtil testUtil;
	boolean assertCheck;
	boolean value;
	MainNavSubNavLinkImageTest obj;
	
	
	/*<<<<<<<<<<To read the Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONArray jsonObject = GetJsonFile();

	JSONObject json = (JSONObject) jsonObject.get(0);
	
	/*<<<<<<<<<<To get the homepage title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject HomePage = (JSONObject) json.get("HomePage");	
	String title = HomePage.get("title").toString();
	
	/*<<<<<<<<<<To get the Main Nav title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject MainNav1 = (JSONObject) HomePage.get("MainNav1");
	String mainNav1title = MainNav1.get("title").toString();
	
	/*<<<<<<<<<<To get the Main Nav title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject MainNav2 = (JSONObject) HomePage.get("MainNav2");
	String mainNav2title = MainNav2.get("title").toString();
	
	/*<<<<<<<<<<To get the Main Nav title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject MainNav3 = (JSONObject) HomePage.get("MainNav3");
	String mainNav3title = MainNav3.get("title").toString();
	
	/*<<<<<<<<<<To get the Main Nav title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject MainNav4 = (JSONObject) HomePage.get("MainNav4");
	String mainNav4title = MainNav4.get("title").toString();
	
	/*<<<<<<<<<<To get the Main Nav title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject MainNav5 = (JSONObject) HomePage.get("MainNav5");
	String mainNav5title = MainNav5.get("title").toString();
	
	/*<<<<<<<<<<To get the Main Nav title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject MainNav6 = (JSONObject) HomePage.get("MainNav6");
	String mainNav6title = MainNav6.get("title").toString();
	
	/*<<<<<<<<<<To get the Main Nav title from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject MainNav7 = (JSONObject) HomePage.get("MainNav7");
	String mainNav7title = MainNav7.get("title").toString();
	
	/*<<<<<<<<<<To get the Text Below Footer Logo from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject TextBelowFooterLogo = (JSONObject) HomePage.get("TextBelowFooterLogo");
	String TextBelowFooterLogotitle = TextBelowFooterLogo.get("title").toString();
	
	/*<<<<<<<<<<To get the Last modified text from Json file>>>>>>>>>>>>>>>>>>>>*/
	JSONObject LastModifiedText = (JSONObject) HomePage.get("LastUpdatedTextMessage");
	String LastModifiedTextMessage = LastModifiedText.get("title").toString();
	
	JSONObject Orangenavigations = (JSONObject) HomePage.get("Orangenavigations");
	JSONObject GroupMenuNavigations = (JSONObject) HomePage.get("GroupMenuNavigations");
	JSONObject FooterMenuNavigations = (JSONObject) HomePage.get("FooterMenuNavigations");
	JSONObject MainNav1SubNavigations = (JSONObject) HomePage.get("MainNav1SubNavigations");
	JSONObject MainNav2SubNavigations = (JSONObject) HomePage.get("MainNav2SubNavigations");
	JSONObject MainNav3SubNavigations = (JSONObject) HomePage.get("MainNav3SubNavigations");
	JSONObject MainNav4SubNavigations = (JSONObject) HomePage.get("MainNav4SubNavigations");
	JSONObject MainNav5SubNavigations = (JSONObject) HomePage.get("MainNav5SubNavigations");
	JSONObject MainNav6SubNavigations = (JSONObject) HomePage.get("MainNav6SubNavigations");
	JSONObject MainNav7SubNavigations = (JSONObject) HomePage.get("MainNav7SubNavigations");
	
	/*<<<<<<<<<<To get the nav link count from Json file>>>>>>>>>>>>>>>>>>>>*/
	int orangeNavCount=Integer.parseInt( Orangenavigations.get("OrangenavigationsItemCount").toString());
	int groupMenuCount=Integer.parseInt( GroupMenuNavigations.get("GroupMenuNavigationLinksItemCount").toString());
	int footerMenuCount=Integer.parseInt( FooterMenuNavigations.get("FooterMenuNavigationLinksItemCount").toString());
	int mainMenu1SubMenuCount=Integer.parseInt( MainNav1SubNavigations.get("MainNav1SubNavLinkCount").toString());
	int mainMenu2SubMenuCount=Integer.parseInt( MainNav2SubNavigations.get("MainNav2SubNavLinkCount").toString());
	int mainMenu3Count=Integer.parseInt( MainNav3.get("MainNav3Count").toString());
	int mainMenu3SubMenuCount=Integer.parseInt( MainNav3SubNavigations.get("MainNav3SubNavLinkCount").toString());
	int mainMenu4Count=Integer.parseInt( MainNav4.get("MainNav4Count").toString());
	int mainMenu4SubMenuCount=Integer.parseInt( MainNav4SubNavigations.get("MainNav4SubNavLinkCount").toString());
	int mainMenu5Count=Integer.parseInt( MainNav5.get("MainNav5Count").toString());
	int mainMenu5SubMenuCount=Integer.parseInt( MainNav5SubNavigations.get("MainNav5SubNavLinkCount").toString());
	int mainMenu6Count=Integer.parseInt( MainNav6.get("MainNav6Count").toString());
	int mainMenu6SubMenuCount=Integer.parseInt( MainNav6SubNavigations.get("MainNav6SubNavLinkCount").toString());
	int mainMenu7Count=Integer.parseInt( MainNav7.get("MainNav7Count").toString());
	int mainMenu7SubMenuCount=Integer.parseInt( MainNav7SubNavigations.get("MainNav7SubNavLinkCount").toString());
	
	@BeforeTest
	public void loadWebBrowser() {
		initialization();
		testUtil = new TestUtil();
		homepage = new HomePage();
		boolean check = getGDPRCheck(homepage, testUtil);
		if (check) {
			testUtil.switchToDefaultContent();
		}
	}
	
	@BeforeMethod
	public void setUp() {
		obj = new MainNavSubNavLinkImageTest();
	}
	
	
//	@Test(priority = 1)
//	public void mainNav1SubNav1LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
//			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
//		if (mainMenu1SubMenuCount > 0) {
//			mainMenu1SubMenuCount--;
//			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink1");
//			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
//			homepage = new HomePage();
//			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
//			if (handles.size() > 1) {
//				Iterator<String> it = handles.iterator();
//				String parent = it.next();
//				String child = it.next();
//				// switch to child
//				driver.switchTo().window(child);
//				boolean value = obj.hyperLinkTest(mainNavpageUrl);
//				Assert.assertTrue(value);
//			}
//			else {
//				boolean value = obj.hyperLinkTest(mainNavpageUrl);
//				Assert.assertTrue(value);
//			}
//		}
//	}
	
	@Test(priority = 2)
	public void mainNav1SubNav2LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink2");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 3)
	public void mainNav1SubNav3LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink3");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 4)
	public void mainNav1SubNav4LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink4");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 5)
	public void mainNav1SubNav5LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink5");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 6)
	public void mainNav1SubNav6LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink6");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 7)
	public void mainNav1SubNav7LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink7");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 8)
	public void mainNav1SubNav8LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink8");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 9)
	public void mainNav1SubNav9LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink9");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 10)
	public void mainNav1SubNav10LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink10");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 11)
	public void mainNav1SubNav11LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink11");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 12)
	public void mainNav1SubNav12LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink12");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 13)
	public void mainNav1SubNav13LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink13");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 14)
	public void mainNav1SubNav14LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink14");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 15)
	public void mainNav1SubNav15LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink15");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 16)
	public void mainNav1SubNav16LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink16");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 17)
	public void mainNav1SubNav17LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink17");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 18)
	public void mainNav1SubNav18LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink18");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 19)
	public void mainNav1SubNav19LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink19");
			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 20)
	public void mainNav2SubNav1LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink1");
			String mainNavpageUrl = getUrlFromPage(mainNav2SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 21)
	public void mainNav2SubNav2LinkDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink2");
			String mainNavpageUrl = getUrlFromPage(mainNav2SubNavPageID);
			homepage = new HomePage();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
//	@Test(priority = 1)
//	public void mainNav1SubNav1ImageDetailTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
//			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
//		if (mainMenu1SubMenuCount > 0) {
//			mainMenu1SubMenuCount--;
//			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink1");
//			String mainNavpageUrl = getUrlFromPage(mainNav1SubNavPageID);
//			homepage.validateMainNavLink1SubLink1();
//			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
//			if (handles.size() > 1) {
//				Iterator<String> it = handles.iterator();
//				String parent = it.next();
//				String child = it.next();
//				// switch to child
//				driver.switchTo().window(child);
//				boolean value = obj.imageTest(mainNavpageUrl);
//				Assert.assertTrue(value);
//			}
//			else {
//				boolean value = obj.imageTest(mainNavpageUrl);
//				Assert.assertTrue(value);
//			}
//		}
//	}
	
	
	
	
	
	
	
	@AfterMethod
	public void pageSwitch() {
		obj.closeOpenedTabs();
		driver.get(prop.getProperty("url"));
	}
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
