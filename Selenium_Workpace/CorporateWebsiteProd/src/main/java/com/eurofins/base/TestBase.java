package com.eurofins.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.eurofins.util.TestUtil;

public class TestBase {
	
	public static Properties prop;
	public static WebDriver driver;
	
	
	//Create the constructor for the same class
	
	public TestBase(){
		
		//Code to read data from the Properties file
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Anirudha_Project\\Eurofins_Project\\Selenium_Projects\\GroupWebSites"
					+ "\\CorporateWebsiteAutomationProd\\src\\main\\java\\com\\eurofins\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	//Initializing Browser to test as defined in the Properties file
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Anirudha_Project\\Eurofins_Project\\"
				+ "Selenium_Projects\\Selenium_Workpace\\CorporateWebsiteProd\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
			}
	

}

