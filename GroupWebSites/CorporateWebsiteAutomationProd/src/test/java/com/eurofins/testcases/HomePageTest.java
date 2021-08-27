package com.eurofins.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hwpf.usermodel.OfficeDrawing.HorizontalRelativeElement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.eurofins.base.TestBase;
import com.eurofins.pages.HomePage;

import com.eurofins.util.TestUtil;


public class HomePageTest extends TestBase {

	HomePage homepage;
	TestUtil testUtil;	

	public HomePageTest() {
		super();
	}
	
	
	@BeforeTest
	public  void loadWebBrowser() {
		initialization();
		testUtil = new TestUtil();
//		homepage = new HomePage();
//		boolean check = getGDPRCheck(homepage, testUtil);
//		if (check) {
//			testUtil.switchToDefaultContent();
//		}
	}

	@BeforeMethod
	public void setUp() {
		homepage = new HomePage();
		driver.get(prop.getProperty("url"));
	}
	
	
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
	
	
//	/************Rough Area*******************/
//	
//	@Test(priority = 5)
//	public void groupNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
//			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
//		if (groupMenuCount > 0) {
//			groupMenuCount--;
//			String groupNavpageID = getIDFromJsonFileGroupnavigations("GroupMenunavigations3");
//			homepage = new HomePage();
//			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
//			// Object page = myClass.newInstance();
//			homepage.validateGroupMenuLink3();
//			Set<String> handles = driver.getWindowHandles();
//			if (handles.size() > 1) {
//				new TestBase().getNewTabPageTitle();
//				String pageTitle = getTitleFromPage(groupNavpageID);
//				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
//			} else {
//				String metaTitle = homepage.validatePageTitle();
//				String pageTitle = getTitleFromPage(groupNavpageID);
//				Assert.assertTrue(metaTitle.contains(pageTitle));
//			}
//		}
//	}
//	

	
//	/************Rough Area*******************/
	
	
	
	
	
	
	
	
	
	
	/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>This is my Final Code<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/
	

	/*<<<<<<<<<<To test Homepage Title>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 1)
	public void homePageTitleTest() {
		String homepageTitle = homepage.validateHomePageTitle();
		Assert.assertTrue(homepageTitle.contains(title));
	}

	/*<<<<<<<<<<To test Homepage Logo>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 2)
	public void homePageLogoTest() {
		boolean homepagelogo = homepage.validateHomePageLogo();
		Assert.assertTrue(homepagelogo);
	}
	
	
	/*<<<<<<<<<<This block is to test GroupNav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 3)
	public void groupNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (groupMenuCount > 0) {
			groupMenuCount--;
			String groupNavpageID = getIDFromJsonFileGroupnavigations("GroupMenunavigations1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateGroupMenuLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 4)
	public void groupNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (groupMenuCount > 0) {
			groupMenuCount--;
			String groupNavpageID = getIDFromJsonFileGroupnavigations("GroupMenunavigations2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateGroupMenuLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 5)
	public void groupNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (groupMenuCount > 0) {
			groupMenuCount--;
			String groupNavpageID = getIDFromJsonFileGroupnavigations("GroupMenunavigations3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateGroupMenuLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 6)
	public void groupNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (groupMenuCount > 0) {
			groupMenuCount--;
			String groupNavpageID = getIDFromJsonFileGroupnavigations("GroupMenunavigations4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateGroupMenuLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 7)
	public void groupNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (groupMenuCount > 0) {
			groupMenuCount--;
			String groupNavpageID = getIDFromJsonFileGroupnavigations("GroupMenunavigations5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateGroupMenuLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 8)
	public void groupNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (groupMenuCount > 0) {
			groupMenuCount--;
			String groupNavpageID = getIDFromJsonFileGroupnavigations("GroupMenunavigations6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateGroupMenuLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(groupNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Main Nav1 links>>>>>>>>>>>>>>>>>>>>*/
	
	@Test(priority=9)
	public void mainNavLink1Test() {
		homepage=new HomePage();
		homepage.validateMainNavLink1();
		String metaTitle = homepage.validatePageTitle();
		Assert.assertTrue(metaTitle.contains(mainNav1title));
	}
	
	
	/*<<<<<<<<<<This block is to test Main Nav1 sub Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 10)
	public void mainNav1SubNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	
	@Test(priority = 11)
	public void mainNav1SubNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 12)
	public void mainNav1SubNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 13)
	public void mainNav1SubNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 14)
	public void mainNav1SubNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 15)
	public void mainNav1SubNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 16)
	public void mainNav1SubNavLink7Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink7");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink7();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 17)
	public void mainNav1SubNavLink8Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink8");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink8();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 18)
	public void mainNav1SubNavLink9Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink9");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink9();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 19)
	public void mainNav1SubNavLink10Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink10");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink10();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 20)
	public void mainNav1SubNavLink11Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink11");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink11();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 21)
	public void mainNav1SubNavLink12Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink12");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink12();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 22)
	public void mainNav1SubNavLink13Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink13");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink13();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 23)
	public void mainNav1SubNavLink14Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink14");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink14();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 24)
	public void mainNav1SubNavLink15Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink15");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink15();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 25)
	public void mainNav1SubNavLink16Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink16");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink16();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 26)
	public void mainNav1SubNavLink17Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink17");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink17();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 27)
	public void mainNav1SubNavLink18Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu1SubMenuCount > 0) {
			mainMenu1SubMenuCount--;
			String mainNav1SubNavPageID = getIDFromJsonFileLink1SubLink1("MainNav1SubNavLink18");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink1SubLink18();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav1SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Main Nav2 links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority=28)
	public void mainNavLink2Test() {
		homepage=new HomePage();
		homepage.validateMainNavLink2();
		String metaTitle = homepage.validatePageTitle();
		Assert.assertTrue(metaTitle.contains(mainNav2title));
	}
	
	
	/*<<<<<<<<<<This block is to test Main Nav2 sub Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 29)
	public void mainNav2SubNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 30)
	public void mainNav2SubNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 31)
	public void mainNav2SubNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 32)
	public void mainNav2SubNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 33)
	public void mainNav2SubNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 34)
	public void mainNav2SubNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 35)
	public void mainNav2SubNavLink7Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink7");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink7();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 36)
	public void mainNav2SubNavLink8Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu2SubMenuCount > 0) {
			mainMenu2SubMenuCount--;
			String mainNav2SubNavPageID = getIDFromJsonFileLink2SubLink1("MainNav2SubNavLink8");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink2SubLink8();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav2SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Main Nav3 links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 37)
	public void mainNavLink3Test() {
		if (mainMenu3Count > 0) {
			mainMenu3Count--;
			homepage = new HomePage();
			homepage.validateMainNavLink3();

			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				Assert.assertTrue(TestBase.driverURLChild.contains(mainNav3title));
			} else {
				String metaTitle = homepage.validatePageTitle();
				Assert.assertTrue(metaTitle.contains(mainNav3title));
			}
		}
	}
	
	
//	/*<<<<<<<<<<This block is to test Main Nav3 sub Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 38)
	public void mainNav3SubNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 39)
	public void mainNav3SubNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 40)
	public void mainNav3SubNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 41)
	public void mainNav3SubNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 42)
	public void mainNav3SubNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 43)
	public void mainNav3SubNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 44)
	public void mainNav3SubNavLink7Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink7");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink7();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 45)
	public void mainNav3SubNavLink8Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink8");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink8();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 46)
	public void mainNav3SubNavLink9Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink9");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink9();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 47)
	public void mainNav3SubNavLink10Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink10");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink10();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 48)
	public void mainNav3SubNavLink11Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu3SubMenuCount > 0) {
			mainMenu3SubMenuCount--;
			String mainNav3SubNavPageID = getIDFromJsonFileLink3SubLink1("MainNav3SubNavLink11");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink3SubLink11();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav3SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Main Nav4 links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 49)
	public void mainNavLink4Test() {
		if (mainMenu4Count > 0) {
			mainMenu4Count--;
			homepage = new HomePage();
			homepage.validateMainNavLink4();
			String metaTitle = homepage.validatePageTitle();
			Assert.assertTrue(metaTitle.contains(mainNav4title));
		}
	}
	
	
	/*<<<<<<<<<<This block is to test Main Nav4 sub Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 50)
	public void mainNav4SubNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 51)
	public void mainNav4SubNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 52)
	public void mainNav4SubNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 53)
	public void mainNav4SubNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink7Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink7");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink7();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink8Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink8");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink8();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink9Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink9");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink9();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink10Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink10");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink10();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink11Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink11");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink11();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink12Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink12");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink12();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav4SubNavLink13Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu4SubMenuCount > 0) {
			mainMenu4SubMenuCount--;
			String mainNav4SubNavPageID = getIDFromJsonFileLink4SubLink1("MainNav4SubNavLink13");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink4SubLink13();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav4SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Main Nav5 links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 54)
	public void mainNavLink5Test() {
		if (mainMenu5Count > 0) {
			mainMenu5Count--;
			homepage = new HomePage();
			homepage.validateMainNavLink5();
			String metaTitle = homepage.validatePageTitle();
			Assert.assertTrue(metaTitle.contains(mainNav5title));
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink7Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink7");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink7();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink8Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink8");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink8();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink9Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink9");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink9();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink10Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink10");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink10();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink11Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink11");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink11();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink12Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink12");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink12();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 54)
	public void mainNav5SubNavLink13Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu5SubMenuCount > 0) {
			mainMenu5SubMenuCount--;
			String mainNav5SubNavPageID = getIDFromJsonFileLink5SubLink1("MainNav5SubNavLink13");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink5SubLink13();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav5SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Main Nav6 links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 55)
	public void mainNavLink6Test() {
		if (mainMenu6Count > 0) {
			mainMenu6Count--;
			homepage = new HomePage();
			homepage.validateMainNavLink6();
			String metaTitle = homepage.validatePageTitle();
			Assert.assertTrue(metaTitle.contains(mainNav6title));
		}
	}
	
	
	/*<<<<<<<<<<This block is to test Main Nav5 sub Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 56)
	public void mainNav6SubNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu6SubMenuCount > 0) {
			mainMenu6SubMenuCount--;
			String mainNav6SubNavPageID = getIDFromJsonFileLink6SubLink1("MainNav6SubNavLink1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink6SubLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav6SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav6SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 57)
	public void mainNav6SubNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu6SubMenuCount > 0) {
			mainMenu6SubMenuCount--;
			String mainNav6SubNavPageID = getIDFromJsonFileLink6SubLink1("MainNav6SubNavLink2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink6SubLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav6SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav6SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 58)
	public void mainNav6SubNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu6SubMenuCount > 0) {
			mainMenu6SubMenuCount--;
			String mainNav6SubNavPageID = getIDFromJsonFileLink6SubLink1("MainNav6SubNavLink3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink6SubLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav6SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav6SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Main Nav6 links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 59)
	public void mainNavLink7Test() {
		if (mainMenu7Count > 0) {
			mainMenu7Count--;
			homepage = new HomePage();
			homepage.validateMainNavLink7();
			String metaTitle = homepage.validatePageTitle();
			Assert.assertTrue(metaTitle.contains(mainNav7title));
		}
	}
	
	
	/*<<<<<<<<<<This block is to test Main Nav5 sub Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 60)
	public void mainNav7SubNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu7SubMenuCount > 0) {
			mainMenu7SubMenuCount--;
			String mainNav7SubNavPageID = getIDFromJsonFileLink7SubLink1("MainNav7SubNavLink1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink7SubLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav7SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav7SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 61)
	public void mainNav7SubNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (mainMenu7SubMenuCount > 0) {
			mainMenu7SubMenuCount--;
			String mainNav7SubNavPageID = getIDFromJsonFileLink7SubLink1("MainNav7SubNavLink2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateMainNavLink7SubLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(mainNav7SubNavPageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(mainNav7SubNavPageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	
	/*<<<<<<<<<<This block is to test Blue Images >>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 62)
	public void firstBlueImageTest() {
		homepage = new HomePage();
		boolean firstblueimage = homepage.validateFirstBlueImage();
		Assert.assertTrue(firstblueimage);
	}
	
	@Test(priority = 63)
	public void secondBlueImageTest() {
		homepage = new HomePage();
		boolean secondblueimage = homepage.validateSecondBlueImage();
		Assert.assertTrue(secondblueimage);
	}

	@Test(priority = 64)
	public void thirdBlueImageTest() {
		homepage = new HomePage();
		boolean thirdblueimage = homepage.validateThirdBlueImage();
		Assert.assertTrue(thirdblueimage);
	}
	
	/*<<<<<<<<<<This block is to test Major Nav links>>>>>>>>>>>>>>>>>>>>*/
	
	@Test(priority = 65)
	public void majorNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException {
		String majoreNavpageID = getIDFromJsonFileMajornavigations("Majornavigations1");
		homepage = new HomePage();
		
//		This code will be used at the time of internal page redirection
//		Class myClass = Class.forName("com.eurofins.pages." + majoreNavpageID);
//		Object page = myClass.newInstance();		

		homepage.validateMajorNavigations1Link();
		Set<String> handles = driver.getWindowHandles();
		if (handles.size() > 1) {
			new TestBase().getNewTabPageTitle();
			String pageTitle = getTitleFromPage(majoreNavpageID);
			Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
		} else {
			String metaTitle = homepage.validatePageTitle();
			String pageTitle = getTitleFromPage(majoreNavpageID);
			Assert.assertTrue(metaTitle.contains(pageTitle));
		}
	}
	
	@Test(priority = 66)
	public void majorNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException {
		String majoreNavpageID = getIDFromJsonFileMajornavigations("Majornavigations2");
		homepage = new HomePage();
		// Class myClass = Class.forName("com.eurofins.pages." + majoreNavpageID);
		// Object page = myClass.newInstance();
		homepage.validateMajornavigations2link();
		Set<String> handles = driver.getWindowHandles();
		if (handles.size() > 1) {
			new TestBase().getNewTabPageTitle();
			String pageTitle = getTitleFromPage(majoreNavpageID);
			Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
		} else {
			String metaTitle = homepage.validatePageTitle();
			String pageTitle = getTitleFromPage(majoreNavpageID);
			Assert.assertTrue(metaTitle.contains(pageTitle));
		}
	}
	
	@Test(priority = 67)
	public void majorNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException {
		String majoreNavpageID = getIDFromJsonFileMajornavigations("Majornavigations3");
		homepage = new HomePage();
		homepage.validateMajorNavigations3Link();
		// Class myClass = Class.forName("com.eurofins.pages." + majoreNavpageID);
		// Object page = myClass.newInstance();
		Set<String> handles = driver.getWindowHandles();
		if (handles.size() > 1) {
			new TestBase().getNewTabPageTitle();
			String pageTitle = getTitleFromPage(majoreNavpageID);
			Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
		} else {
			String metaTitle = homepage.validatePageTitle();
			String pageTitle = getTitleFromPage(majoreNavpageID);
			Assert.assertTrue(metaTitle.contains(pageTitle));
		}
	}
	
	
	/*<<<<<<<<<<This block is to test Orange Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 68)	
	public void orangeNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations1");
			homepage = new HomePage();
			homepage.validateOrangeNavLink1();


			// <<<<<<<<This code will be used at the time of internal page
			// redirection*>>>>>>>>>>>>
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			// <<<<<<<<This code will be used at the time of internal page
			// redirection*>>>>>>>>>>>>

			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 69)
	public void orangeNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations2");
			homepage = new HomePage();
			homepage.validateOrangeNavLink2();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 70)
	public void orangeNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations3");
			homepage = new HomePage();
			homepage.validateOrangeNavLink3();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 71)
	public void orangeNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 72)
	public void orangeNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 73)
	public void orangeNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 74)
	public void orangeNavLink7Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations7");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink7();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 75)
	public void orangeNavLink8Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations8");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink8();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 76)
	public void orangeNavLink9Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations9");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink9();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 77)
	public void orangeNavLink10Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations10");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink10();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 78)
	public void orangeNavLink11Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations11");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink11();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 79)
	public void orangeNavLink12Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (orangeNavCount > 0) {
			orangeNavCount--;
			String orangeNavpageID = getIDFromJsonFileOrangeNav("Orangenavigations12");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateOrangeNavLink12();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(orangeNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This block is to test Footer Nav links>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 80)
	public void footerNavLink1Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations1");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink1();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 81)
	public void footerNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations2");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink2();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 82)
	public void footerNavLink3Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations3");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink3();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 83)
	public void footerNavLink4Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations4");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink4();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 84)
	public void footerNavLink5Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations5");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink5();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 85)
	public void footerNavLink6Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations6");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink6();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 86)
	public void footerNavLink7Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations7");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink7();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 87)
	public void footerNavLink8Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations8");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink8();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 88)
	public void footerNavLink9Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations9");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink9();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	@Test(priority = 89)
	public void footerNavLink10Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException, RuntimeException, ReflectiveOperationException {
		if (footerMenuCount > 0) {
			footerMenuCount--;
			String footerNavpageID = getIDFromJsonFileFooterMenuNavigation("FooterMenunavigations10");
			homepage = new HomePage();
			// Class myClass = Class.forName("com.eurofins.pages." + orangeNavpageID);
			// Object page = myClass.newInstance();
			homepage.validateFooterNavLink10();
			Set<String> handles = driver.getWindowHandles();
			if (handles.size() > 1) {
				new TestBase().getNewTabPageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(TestBase.driverURLChild.contains(pageTitle));
			} else {
				String metaTitle = homepage.validatePageTitle();
				String pageTitle = getTitleFromPage(footerNavpageID);
				Assert.assertTrue(metaTitle.contains(pageTitle));
			}
		}
	}
	
	/*<<<<<<<<<<This is to test Footer logo>>>>>>>>>>>>>>>>>>>>*/
	@Test(priority = 90)
	public void footerBottomLogoTest() {
		homepage = new HomePage();
		boolean footerbotomlogo = homepage.validateFooterLogo();
		Assert.assertTrue(footerbotomlogo);
	}
	
	@Test(priority = 91)
	public void copyrightMessageTxtTest() {
		homepage = new HomePage();
		String copyrightMessageTxt = homepage.validateCopyrightMessageTxt();
		Assert.assertTrue(copyrightMessageTxt.contains(TextBelowFooterLogotitle));
	}
	
	@Test(priority = 92)
	public void LastUpdatedTxtTest() {
		homepage = new HomePage();
		String LastUpdatedTxt = homepage.validateLastUpdatedTxt(); //validateLastUpdatedTxt
		Assert.assertTrue(LastUpdatedTxt.contains(LastModifiedTextMessage));
	}
		
	
	
	

	
	/*>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>This is my Final Code<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/	
	
	

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
