package com.eurofins.testcases;

import java.util.*;
import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.eurofins.base.TestBase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GetExecutionStatus extends TestBase {

	@Test

	public static void checkStatusCode()
			throws MalformedURLException, InterruptedException, NullPointerException, IOException {

		// Open a Blank Chrome Instance

		System.setProperty("webdriver.chrome.driver", "C://Anirudha_Project//Eurofins_Project//Selenium_Projects"
				+ "//GroupWebSites//CorporateWebsiteAutomationProd//Drivers/chromedriver.exe");

//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability("chrome.switches", Arrays.asList("--ignore-certificate-errors"));
		//driver = new ChromeDriver(capabilities);
		
		WebDriver driver = new ChromeDriver();
		
		

		// Delete Cookies

		// driver.manage().deleteAllCookies();

		FileReader reader = new FileReader("AllLinkFile.txt");
		FileWriter fw = new FileWriter("HTTPSatus.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line;
		int LinkCount = 0;

		while ((line = bufferedReader.readLine()) != null) {

			++LinkCount;
			driver.get(line);
			// wait of 5 seconds
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// establish and open connection with URL
			HttpURLConnection c = (HttpURLConnection) new URL(line).openConnection();
			// set the HEAD request with setRequestMethod
			c.setRequestMethod("HEAD");
			// connection started and get response code
			c.connect();
			int r = c.getResponseCode();
			System.out.println(LinkCount + ": Link : " + line + " --- StatusCode --- " + r);
			fw.write(LinkCount + ": Link : " + line + " --- StatusCode --- " + r + System.lineSeparator());

		}
		reader.close();
		fw.close();
		System.out.println("\n \n StatusCode Report Created Successfully");
		driver.close();

	}

}
