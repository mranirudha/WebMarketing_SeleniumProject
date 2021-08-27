package com.eurofins.base;


import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.imageio.ImageIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eurofins.pages.HomePage;
import com.eurofins.util.TestUtil;
import com.eurofins.util.WebEventListener;

public class TestBase {

	public static Properties prop;
	public static WebDriver driver;
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;
	public static String driverURLChild;
	
	

	// Create the constructor for the same class

	public TestBase() {

		// Code to read data from the Properties file
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"C://Anirudha_Project//Eurofins_Project//Selenium_Projects//GroupWebSites"
							+ "//CorporateWebsiteAutomationProd//src//main//java//com//eurofins//config//config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Initializing Browser to test as defined in the Properties file

	/*
	 * public static void initialization() { try { String browserName =
	 * prop.getProperty("browser"); if (browserName.equals("chrome")) {
	 * System.setProperty("webdriver.chrome.driver",
	 * "C://Anirudha_Project//Eurofins_Project//Selenium_Projects" +
	 * "//GroupWebSites//CorporateWebsiteAutomationProd//Drivers//chromedriver.exe")
	 * ; driver = new ChromeDriver(); } } catch (Exception e) {
	 * 
	 * e.printStackTrace();
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C://Anirudha_Project//Eurofins_Project//Selenium_Projects" +
	 * "//GroupWebSites//CorporateWebsiteAutomationProd//Drivers/chromedriver.exe");
	 * driver = new ChromeDriver();
	 * 
	 * 
	 * driver.manage().window().maximize(); driver.manage().deleteAllCookies();
	 * driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,
	 * TimeUnit.SECONDS);
	 * driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT_TIMEOUT,
	 * TimeUnit.SECONDS); driver.get(prop.getProperty("url"));
	 * 
	 * }
	 */

	public static void initialization() {

		System.setProperty("webdriver.chrome.driver", "C://Anirudha_Project//Eurofins_Project//Selenium_Projects"
				+ "//GroupWebSites//CorporateWebsiteAutomationProd//Drivers/chromedriver.exe");

		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);

		driver = new ChromeDriver();		
		e_driver = new EventFiringWebDriver(driver);
		// Now create object of EventListerHandler to register it with
		// EventFiringWebDriver
		eventListener = new WebEventListener();
		e_driver.register(eventListener);
		driver = e_driver;

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
//		driver.get(prop.getProperty("url"));
//		driver.get("https://www.eurofins.in/");

	}
	
	public boolean getGDPRCheck(HomePage homepage, TestUtil testUtil) {
		boolean check =false;
		testUtil.switchToGDPRFrame();
		boolean validategdpragreeandproceedbtn= homepage.validateGDPRAgreeAndProceedbtn();
		boolean	validateframeclosebtn=homepage.validateFrameClosebtn();
		if(validategdpragreeandproceedbtn==true && validateframeclosebtn==true)
		{
			check=true;
		}
		
		return check;
	}
	
	
	public static JSONArray GetJsonFile() {
		try {
			String filename = "C:\\Anirudha_Project\\Eurofins_Project\\Selenium_Projects"
					+ "\\GroupWebSites\\CorporateWebsiteAutomationProd\\src\\main\\java\\com\\eurofins\\config\\json\\eurofinscorporate.json"; // eurofinsindia.//eurofinscorporate.
			JSONParser jsonParser = new JSONParser();
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename),"UTF-8"));
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			// JSONObject jsonObject = (JSONObject) obj;
			JSONArray result = (JSONArray) obj;
			// System.out.println(result);
			return result;
		} catch (FileNotFoundException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch (IOException e) {
			// TODO Auto-generated catch block

			e.printStackTrace();
			return null;
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
	JSONArray jsonObject = GetJsonFile();

	JSONObject json = (JSONObject) jsonObject.get(0);

	JSONObject HomePage = (JSONObject) json.get("HomePage");
	String title = HomePage.get("title").toString();

	public String getIDFromJsonFileMajornavigations(String majorNavItem) {
		JSONObject Majornavigations = (JSONObject) HomePage.get("Majornavigations");
		JSONObject Majornavigation = (JSONObject) Majornavigations.get(majorNavItem);
		String majorNavpageID = Majornavigation.get("id").toString();
		return majorNavpageID;
	}

	public String getIDFromJsonFileOrangeNav(String orangeNavItem) {
		JSONObject Orangenavigations = (JSONObject) HomePage.get("Orangenavigations");
		JSONObject Orangenavigation = (JSONObject) Orangenavigations.get(orangeNavItem);
		String orangeNavpageID = Orangenavigation.get("id").toString();
		return orangeNavpageID;

	}

	public String getIDFromJsonFileGroupnavigations(String groupNavItem) {
		JSONObject GroupMenuNavigations = (JSONObject) HomePage.get("GroupMenuNavigations");
		JSONObject GroupMenuNavigation = (JSONObject) GroupMenuNavigations.get(groupNavItem);
		String groupNavPageID = GroupMenuNavigation.get("id").toString();
		return groupNavPageID;
	}
	
	public String getIDFromJsonFileFooterMenuNavigation(String footerNavItem) {
		JSONObject FooterMenuNavigations = (JSONObject) HomePage.get("FooterMenuNavigations");
		JSONObject FooterMenuNavigation = (JSONObject) FooterMenuNavigations.get(footerNavItem);
		String footerNavPageID = FooterMenuNavigation.get("id").toString();
		return footerNavPageID;
	}
	
	public String getIDFromJsonFileLink1SubLink1(String mainNav1SubNavItem) {
		JSONObject MainNav1SubNavigations = (JSONObject) HomePage.get("MainNav1SubNavigations");
		JSONObject MainNav1SubNavigation = (JSONObject) MainNav1SubNavigations.get(mainNav1SubNavItem);
		String mainNav1SubNavPageID = MainNav1SubNavigation.get("id").toString();
		return mainNav1SubNavPageID;
	}
	
	public String getIDFromJsonFileLink2SubLink1(String mainNav2SubNavItem) {
		JSONObject MainNav2SubNavigations = (JSONObject) HomePage.get("MainNav2SubNavigations");
		JSONObject MainNav2SubNavigation = (JSONObject) MainNav2SubNavigations.get(mainNav2SubNavItem);
		String mainNav2SubNavPageID = MainNav2SubNavigation.get("id").toString();
		return mainNav2SubNavPageID;
	}
	
	public String getIDFromJsonFileLink3SubLink1(String mainNav3SubNavItem) {
		JSONObject MainNav3SubNavigations = (JSONObject) HomePage.get("MainNav3SubNavigations");
		JSONObject MainNav3SubNavigation = (JSONObject) MainNav3SubNavigations.get(mainNav3SubNavItem);
		String mainNav3SubNavPageID = MainNav3SubNavigation.get("id").toString();
		return mainNav3SubNavPageID;
	}
	
	public String getIDFromJsonFileLink4SubLink1(String mainNav4SubNavItem) {
		JSONObject MainNav4SubNavigations = (JSONObject) HomePage.get("MainNav4SubNavigations");
		JSONObject MainNav4SubNavigation = (JSONObject) MainNav4SubNavigations.get(mainNav4SubNavItem);
		String mainNav4SubNavPageID = MainNav4SubNavigation.get("id").toString();
		return mainNav4SubNavPageID;
	}
	
	
	public String getIDFromJsonFileLink5SubLink1(String mainNav5SubNavItem) {
		JSONObject MainNav5SubNavigations = (JSONObject) HomePage.get("MainNav5SubNavigations");
		JSONObject MainNav5SubNavigation = (JSONObject) MainNav5SubNavigations.get(mainNav5SubNavItem);
		String mainNav5SubNavPageID = MainNav5SubNavigation.get("id").toString();
		return mainNav5SubNavPageID;
	}
	
	public String getIDFromJsonFileLink6SubLink1(String mainNav6SubNavItem) {
		JSONObject MainNav6SubNavigations = (JSONObject) HomePage.get("MainNav6SubNavigations");
		JSONObject MainNav6SubNavigation = (JSONObject) MainNav6SubNavigations.get(mainNav6SubNavItem);
		String mainNav6SubNavPageID = MainNav6SubNavigation.get("id").toString();
		return mainNav6SubNavPageID;
	}
	
	public String getIDFromJsonFileLink7SubLink1(String mainNav7SubNavItem) {
		JSONObject MainNav7SubNavigations = (JSONObject) HomePage.get("MainNav7SubNavigations");
		JSONObject MainNav7SubNavigation = (JSONObject) MainNav7SubNavigations.get(mainNav7SubNavItem);
		String mainNav7SubNavPageID = MainNav7SubNavigation.get("id").toString();
		return mainNav7SubNavPageID;
	}

	public String getTitleFromPage(String pageNameParam) {
		JSONObject pageName = (JSONObject) HomePage.get(pageNameParam);
		String pageTitle = pageName.get("title").toString();
		return pageTitle;
	}
	
	public String getUrlFromPage(String pageNameParam) {
		JSONObject pageName = (JSONObject) HomePage.get(pageNameParam);
		String pageUrl = pageName.get("url").toString();
		return pageUrl;
	}
	
	
	public String getIDFromJsonFileMainnavigation1(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav1");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	public String getIDFromJsonFileMainnavigation2(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav2");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	public String getIDFromJsonFileMainnavigation3(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav3");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	public String getIDFromJsonFileMainnavigation4(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav4");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	public String getIDFromJsonFileMainnavigation5(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav5");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	public String getIDFromJsonFileMainnavigation6(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav6");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	public String getIDFromJsonFileMainnavigation7(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav7");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	public String getIDFromJsonFileMainnavigation8(String mainNavItem) {
		JSONObject Mainnavigations = (JSONObject) HomePage.get("MainNav8");
		JSONObject Mainnavigation = (JSONObject) Mainnavigations.get(mainNavItem);
		String mainNavpageID = Mainnavigation.get("id").toString();
		return mainNavpageID;
	}
	
	
	//<<<<<<<<<<<<<<<<To Switch between tabs and get the page title>>>>>>>>>>>>>>>>>>>>>
	public void getNewTabPageTitle() {
		Set<String> st = driver.getWindowHandles();
		Iterator<String> it = st.iterator();
		String parent = it.next();
		String child = it.next();

		// switch to child
		driver.switchTo().window(child);
		driverURLChild = driver.getTitle();
		driver.close();

		// swtich to parent
		driver.switchTo().window(parent);

	}
	
	//<<<<<<<<<<<<<<<<To Switch between tabs and get the page title>>>>>>>>>>>>>>>>>>>>>

	
//	>>>>>>>>>>>>>>>>>>>> Check for all anchor tags for a page >>>>>>>>>>>>>>>>>>>>
	
	public boolean hyperLinkTest(String orangeNavPageUrl) {
		boolean hyperLinkVal = false;
		List<WebElement> linkElements = driver.findElements(By.tagName("a"));
//		List<WebElement> linkElements = driver.findElements(By.xpath("//nav[@id='nav']"));
		
		//List<WebElement> linkElements = driver.findElements(By.xpath("//body//div//nav[@id='nav']//ul"));
		//List<WebElement> linkElements = driver.findElements(By.xpath("/html/body/div/nav[2]"));
		String[] linkTexts = new String[linkElements.size()];
		int i = 0;
		int count = 0;
		
		// extract the link texts of each link element
		for (WebElement e : linkElements) {
			linkTexts[i] = e.getText();
			i++;
			//count ++;
		}
		
		//System.out.println(count);

		// test each link

		for (String t : linkTexts) {
			if (!(t.isEmpty())) {
				if (t.trim() == "Contacts Page") {
					continue;
				} else if (t.trim() == "Careers Page") {
					continue;
				} else {
					try {
						driver.findElement(By.linkText(t)).click();
					} catch (Exception ignore) {

					}
				}
			} else if (t == "Cookie Preference") {
				HomePage homepage = new HomePage();
				TestUtil testUtil = new TestUtil();
				boolean check = getGDPRCheck(homepage, testUtil);
				if (check) {
					testUtil.switchToDefaultContent();
				}

			} else {
				continue;
			}
			driver.navigate().to(orangeNavPageUrl);
			hyperLinkVal = true;
		}
		return hyperLinkVal;
	}
	
	
//	public boolean hyperLinkTest1(String orangeNavPageUrl) {
//		boolean hyperLinkVal = false;
//		List<WebElement> linkElements = driver.findElements(By.xpath("//*[@href or @src]"));
//		String[] linkTexts = new String[linkElements.size()];
//		int i = 0;
//		// extract the link texts of each link element
//		for (WebElement e : linkElements) {
//			linkTexts[i] = e.getText();
//			i++;
//		}
//
//		// test each link
//
//		for (String t : linkTexts) {
//			if (!(t.isEmpty())) {
//				if (t.trim() == "Contacts Page") {
//					continue;
//				} else if (t.trim() == "Careers Page") {
//					continue;
//				} else {
//					try {
//						driver.findElement(By.linkText(t)).click();
//					} catch (Exception ignore) {
//
//					}
//				}
//			} else if (t == "Cookie Preference") {
//				HomePage homepage = new HomePage();
//				TestUtil testUtil = new TestUtil();
//				boolean check = getGDPRCheck(homepage, testUtil);
//				if (check) {
//					testUtil.switchToDefaultContent();
//				}
//
//			} else {
//				continue;
//			}
//			driver.navigate().to(orangeNavPageUrl);
//			hyperLinkVal = true;
//		}
//		return hyperLinkVal;
//	}

	
	
	
	
	
	
	// >>>>>>>>>>>>>>>>>>>>>>> End >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
	
//	>>>>>>>>>>>>>>>>>>>> Check for all broken images for a page >>>>>>>>>>>>>>>>>>>>
	
	public boolean imageTest(String pageUrl) {
		boolean isImageDisplay = false;
		List<WebElement> imgElements = driver.findElements(By.cssSelector("img"));
		String[] linkimageEles = new String[imgElements.size()];
		int i = 0;
		// extract the images in the page
		for (WebElement e : imgElements) {
			linkimageEles[i] = e.getAttribute("src");
			i++;
		}
		// test each image

		for (String img : linkimageEles) {
			if (!(img.isEmpty())) {
				try {
					URL url = new URL(img);
					HttpURLConnection http = (HttpURLConnection) url.openConnection();
					int statusCode = http.getResponseCode();
					if (statusCode == 404 || statusCode == 500) {
						isImageDisplay = false;
					} else {
						isImageDisplay = true;
					}
				} catch (MalformedURLException ignore) {
					// URL is not valid

				} catch (IOException ignore) {
					// Connection failed
				}

			} else {
				continue;
			}
			driver.navigate().to(pageUrl);
		}
		return isImageDisplay;
	}
	
	
	
//	>>>>>>>>>>>>>>>>>>>> Close all the opened tabs>>>>>>>>>>>>>>>>>>>>	
	public void closeOpenedTabs() {
		String originalHandle = driver.getWindowHandle();	    
	    for(String handle : driver.getWindowHandles()) {
	        if (!handle.equals(originalHandle)) {
	            driver.switchTo().window(handle);
	            driver.close();
	        }
	    }
	    driver.switchTo().window(originalHandle);
	}
}





