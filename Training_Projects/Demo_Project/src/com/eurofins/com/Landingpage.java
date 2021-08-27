package com.eurofins.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Landingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UJ56\\Desktop\\Selenium_Installation\\Selenium_Jars\\chromedriver_win32_Ver72\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eurofins.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.id("our-services-1145")).click();
		driver.close();

	}

}
