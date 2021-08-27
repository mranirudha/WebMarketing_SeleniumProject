package com.eurofins.testcases;

import java.util.Iterator;
import java.util.LinkedHashSet;

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

public class MainNavigationLinkPageTest extends TestBase {
	
	HomePage homepage;
	TestUtil testUtil;
	boolean assertCheck;
	boolean value;
	MainNavigationLinkPageTest obj;
	
	
	JSONArray jsonObject = GetJsonFile();

	JSONObject json = (JSONObject) jsonObject.get(0);
	JSONObject HomePage = (JSONObject) json.get("HomePage");
	JSONObject MainNav1 = (JSONObject) HomePage.get("MainNav1");
	JSONObject MainNav2 = (JSONObject) HomePage.get("MainNav2");
	JSONObject MainNav3 = (JSONObject) HomePage.get("MainNav3");
	JSONObject MainNav4 = (JSONObject) HomePage.get("MainNav4");
	JSONObject MainNav5 = (JSONObject) HomePage.get("MainNav5");
	JSONObject MainNav6 = (JSONObject) HomePage.get("MainNav6");
	JSONObject MainNav7 = (JSONObject) HomePage.get("MainNav7");
	int mainMenu1Count=Integer.parseInt( MainNav1.get("MainNav1Count").toString());
	int mainMenu2Count=Integer.parseInt( MainNav2.get("MainNav2Count").toString());
	int mainMenu3Count=Integer.parseInt( MainNav3.get("MainNav3Count").toString());
	int mainMenu4Count=Integer.parseInt( MainNav4.get("MainNav4Count").toString());
	int mainMenu5Count=Integer.parseInt( MainNav5.get("MainNav5Count").toString());
	int mainMenu6Count=Integer.parseInt( MainNav6.get("MainNav6Count").toString());
	int mainMenu7Count=Integer.parseInt( MainNav7.get("MainNav7Count").toString());
	
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
		obj = new MainNavigationLinkPageTest();
	}
	
	@Test(priority = 1)
	public void mainNav1HyperlinkTest() {
		if (mainMenu1Count > 0) {
			mainMenu1Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation1("MainNav1");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink1();
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
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 2)
	public void mainNav2HyperlinkTest() {
		if (mainMenu2Count > 0) {
			mainMenu2Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation2("MainNav2");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink2();
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
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 3)
	public void mainNav3HyperlinkTest() {
		if (mainMenu3Count > 0) {
			mainMenu3Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation3("MainNav3");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink3();
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
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 4)
	public void mainNav4HyperlinkTest() {
		if (mainMenu4Count > 0) {
			mainMenu4Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation4("MainNav4");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink4();
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
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 5)
	public void mainNav5HyperlinkTest() {
		if (mainMenu5Count > 0) {
			mainMenu5Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation5("MainNav5");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink5();
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
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 6)
	public void mainNav6HyperlinkTest() {
		if (mainMenu6Count > 0) {
			mainMenu6Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation6("MainNav6");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink6();
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
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 7)
	public void mainNav7HyperlinkTest() {
		if (mainMenu7Count > 0) {
			mainMenu7Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation7("MainNav7");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink7();
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
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 8)
	public void mainNav1imageTest() {
		if (mainMenu1Count > 0) {
			mainMenu1Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation1("MainNav1");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink1();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 9)
	public void mainNav2imageTest() {
		if (mainMenu2Count > 0) {
			mainMenu2Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation2("MainNav2");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink2();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 10)
	public void mainNav3imageTest() {
		if (mainMenu3Count > 0) {
			mainMenu3Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation3("MainNav3");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink3();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 11)
	public void mainNav4imageTest() {
		if (mainMenu4Count > 0) {
			mainMenu4Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation4("MainNav4");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink4();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 12)
	public void mainNav5imageTest() {
		if (mainMenu5Count > 0) {
			mainMenu5Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation5("MainNav5");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink5();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 13)
	public void mainNav6imageTest() {
		if (mainMenu6Count > 0) {
			mainMenu6Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation6("MainNav6");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink6();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 14)
	public void mainNav7imageTest() {
		if (mainMenu7Count > 0) {
			mainMenu7Count--;
			String mainNavpageID = getIDFromJsonFileMainnavigation7("MainNav7");
			String mainNavpageUrl = getUrlFromPage(mainNavpageID);
			homepage = new HomePage();
			homepage.validateMainNavLink7();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(mainNavpageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	
	
	
	
	
	
	
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
