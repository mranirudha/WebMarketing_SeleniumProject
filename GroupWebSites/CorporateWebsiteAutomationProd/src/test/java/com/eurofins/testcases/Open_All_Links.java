package com.eurofins.testcases;


import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver.WindowType;

import com.eurofins.util.TestUtil;

public class Open_All_Links {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Anirudha_Project\\Eurofins_Project\\Selenium_Projects\\GroupWebSites\\CorporateWebsiteAutomationProd\\Drivers\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		ChromeOptions options = new ChromeOptions ();
		
		//options.addExtensions (new File(“/path/to/extension.crx”));
		options.addArguments("user-data-dir=C:/Users/UJ56/AppData/Local/Google/Chrome/User Data");
		DesiredCapabilities capabilities = new DesiredCapabilities ();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(capabilities);
		//WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT_TIMEOUT, TimeUnit.SECONDS);
		
		clearCookies(driver);
		List<WebElement> topnavLinks =driver.findElements(By.xpath("//nav[@id='nav']//a"));
//		List<WebElement> mainBodyLinks =driver.findElements(By.xpath("//div[@id=\"homebg\"]//a"));
		List<WebElement> mainorangenavLinks =driver.findElements(By.xpath("//div[@id='homebg']//a"));
		
		int totalLinks=topnavLinks.size()+mainorangenavLinks.size();
		Set<String> links= new HashSet<String>(); //this will give only unique urls
		String[] linksCheck= new String[totalLinks]; //this will give all the urls
		
		for(int i=0; i < topnavLinks.size(); i++)
		{
			String tablinks = topnavLinks.get(i).getAttribute("href");
			links.add(tablinks);
			linksCheck[i] = topnavLinks.get(i).getAttribute("href");
		}
		
		for(int i=0; i < mainorangenavLinks.size(); i++)
		{
			String tablinks = mainorangenavLinks.get(i).getAttribute("href");
			links.add(tablinks);
			linksCheck[topnavLinks.size()+i] = mainorangenavLinks.get(i).getAttribute("href");
		}
		
		//to check the count of urls available in the page//
		
		System.out.println("------Links Added Successfully to Set------");
		Iterator navTabIter = links.iterator();
		
		System.out.println("String Size: "+linksCheck.length);
		System.out.println("Set Size: "+links.size());
		System.out.println("---------------------------------------");
		
		for(int i=0; i < linksCheck.length; i++)
		{
			System.out.println(linksCheck[i]);
		}
		
		System.out.println("---------------------------------------");
		
		for(int i=0; i < links.size(); i++)
		{
			System.out.println(navTabIter.next());
		}
		
		OpenNewTabs(driver, links);
		
		}

		
	
	public static void clearCookies( WebDriver driver) throws InterruptedException {
				
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.eurofins.dk/");
		driver.switchTo().frame(0);
//		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Thread.sleep(50000);
		driver.findElement(By.xpath("//div[@class='pdynamicbutton']//a[@class='call']")).click();
		driver.findElement(By.xpath("//div[@class='pdynamicbutton']//a[@class='close']")).click();
		driver.switchTo().defaultContent();
	}
	
	public static void OpenNewTabs( WebDriver driver, Set<String> links) throws InterruptedException {
		
		Iterator<String> linkIter = links.iterator(); //to open the set
		
	
		for(int i=0; i < links.size(); i++)
		{
			Actions a = new Actions(driver);
			a.moveToElement(driver.findElement(By.xpath("//img[@id='imgLogo']"))).keyDown(Keys.CONTROL).click().build().perform();
			Set<String> handles=driver.getWindowHandles();
			Iterator<String> it=handles.iterator();
			String parentWindow = it.next();
			String childWindow = it.next();
			driver.switchTo().window(childWindow);
			driver.get(linkIter.next().toString());
			Thread.sleep(2000);
			driver.close();
			driver.switchTo().window(parentWindow);
		
			
		}
	}
}
