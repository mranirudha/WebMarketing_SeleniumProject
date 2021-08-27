package com.eurofins.testcases;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eurofins.base.TestBase;
import com.eurofins.pages.HomePage;
import com.eurofins.util.TestUtil;

public class OrangeNavigationClickPageTest extends TestBase{

	HomePage homepage;
	TestUtil testUtil;
	boolean assertCheck;
	boolean value;
	OrangeNavigationClickPageTest obj;
	
	
	JSONArray jsonObject = GetJsonFile();

	JSONObject json = (JSONObject) jsonObject.get(0);
	JSONObject HomePage = (JSONObject) json.get("HomePage");
	JSONObject Orangenavigations = (JSONObject) HomePage.get("Orangenavigations");
	int orangeNavCount=Integer.parseInt( Orangenavigations.get("OrangenavigationsItemCount").toString());
	
//	public OrangeNavigationClickPageTest() {
//		super();
//	}

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
		obj = new OrangeNavigationClickPageTest();
	}
	
	
	
	@Test(priority = 1)
	public void orangeNav1HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations1");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink1();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 2)
	public void orangeNav2HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations2");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink2();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 3)
	public void orangeNav3HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations3");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink3();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 4)
	public void orangeNav4HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations4");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink4();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 5)
	public void orangeNav5HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations5");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink5();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 6)
	public void orangeNav6HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations6");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink6();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 7)
	public void orangeNav7HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations7");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink7();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 8)
	public void orangeNav8HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations8");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink8();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 9)
	public void orangeNav9HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations9");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink9();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 10)
	public void orangeNav10HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations10");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink10();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 11)
	public void orangeNav11HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations11");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink11();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 12)
	public void orangeNav12HyperlinkTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations12");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink12();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}	
	
	@Test(priority = 13)
	public void orangeNav1imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations1");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink1();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 14)
	public void orangeNav2imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations2");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink2();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 15)
	public void orangeNav3imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations3");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink3();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 16)
	public void orangeNav4imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations4");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink4();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 17)
	public void orangeNav5imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations5");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink5();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 18)
	public void orangeNav6imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations6");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink6();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 19)
	public void orangeNav7imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations7");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink7();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 20)
	public void orangeNav8imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations8");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink8();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 21)
	public void orangeNav9imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations9");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink9();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 22)
	public void orangeNav10imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations10");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink10();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 23)
	public void orangeNav11imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations11");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink11();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	@Test(priority = 24)
	public void orangeNav12imageTest() {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations12");
			String pageUrl = getUrlFromPage(orangeNavpageID);
			homepage = new HomePage();
			homepage.validateOrangeNavLink12();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(pageUrl);
				Assert.assertTrue(value);
			}
		}
	}
	
	
//	@Test(priority = 13)
//	public void emailLinkTest() {
//		homepage = new HomePage();
//		homepage.validateEmailLink();
//	}
//	
//	@Test(priority = 14)
//	public void pdfLinkTest() {
//		homepage = new HomePage();
//		homepage.validatePdfLink();
//	}
//	
//	@Test(priority = 15)
//	public void printLinkTest() {
//		homepage = new HomePage();
//		homepage.validatePrintLink();
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
