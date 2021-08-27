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

public class MajorNavigationLinkPageTest extends TestBase {
	
	HomePage homepage;
	TestUtil testUtil;
	boolean assertCheck;
	boolean value;
	MajorNavigationLinkPageTest obj;
	
	
	JSONArray jsonObject = GetJsonFile();

	JSONObject json = (JSONObject) jsonObject.get(0);
	JSONObject HomePage = (JSONObject) json.get("HomePage");
//	JSONObject Orangenavigations = (JSONObject) HomePage.get("Orangenavigations");
//	int orangeNavCount=Integer.parseInt( Orangenavigations.get("OrangenavigationsItemCount").toString());
	
	
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
		obj = new MajorNavigationLinkPageTest();
	}
	
	@Test(priority = 1)
	public void majorNav1HyperlinkTest() {
			String majorNavpageID = getIDFromJsonFileMajornavigations("Majornavigations1");
			String majorNavpageUrl = getUrlFromPage(majorNavpageID);
			homepage = new HomePage();
			homepage.validateMajorNavigations1Link();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
	}
	
	@Test(priority = 2)
	public void majorNav2HyperlinkTest() {
			String majorNavpageID = getIDFromJsonFileMajornavigations("Majornavigations2");
			String majorNavpageUrl = getUrlFromPage(majorNavpageID);
			homepage = new HomePage();
			homepage.validateMajornavigations2link();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
	}
	
	@Test(priority = 3)
	public void majorNav3HyperlinkTest() {
			String majorNavpageID = getIDFromJsonFileMajornavigations("Majornavigations3");
			String majorNavpageUrl = getUrlFromPage(majorNavpageID);
			homepage = new HomePage();
			homepage.validateMajorNavigations3Link();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.hyperLinkTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.hyperLinkTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
	}
	
	@Test(priority = 4)
	public void majorNav1imageTest() {
			String majorNavpageID = getIDFromJsonFileMajornavigations("Majornavigations1");
			String majorNavpageUrl = getUrlFromPage(majorNavpageID);
			homepage = new HomePage();
			homepage.validateMajorNavigations1Link();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
	}
	
	@Test(priority = 5)
	public void majorNav2imageTest() {
			String majorNavpageID = getIDFromJsonFileMajornavigations("Majornavigations2");
			String majorNavpageUrl = getUrlFromPage(majorNavpageID);
			homepage = new HomePage();
			homepage.validateMajornavigations2link();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
	}
	
	@Test(priority = 6)
	public void majorNav3imageTest() {
			String majorNavpageID = getIDFromJsonFileMajornavigations("Majornavigations3");
			String majorNavpageUrl = getUrlFromPage(majorNavpageID);
			homepage = new HomePage();
			homepage.validateMajorNavigations3Link();
			LinkedHashSet<String> handles = (LinkedHashSet<String>) driver.getWindowHandles();
			if (handles.size() > 1) {
				Iterator<String> it = handles.iterator();
				String parent = it.next();
				String child = it.next();
				// switch to child
				driver.switchTo().window(child);
				boolean value = obj.imageTest(majorNavpageUrl);
				Assert.assertTrue(value);
			}
			// driver.switchTo().window(win)
			else {
				boolean value = obj.imageTest(majorNavpageUrl);
				Assert.assertTrue(value);
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
