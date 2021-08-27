package com.eurofins.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Landingpage {

	public static void main(String[] args) {
		String fn,title;	
		fn="C:\\Users\\UJ56\\Desktop\\Selenium_Installation\\Selenium_Jars\\chromedriver_win32_Ver72\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", fn);
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.eurofins.com/");
		driver.manage().window().maximize();
		String url;
		//driver.get(url);
		title=driver.getTitle();
		System.out.println("URL "+title);
		//driver.switchTo().frame(frame1);
		//WebElement frame = driver.findElement(By.className("class="gwt-Frame"))"
		//driver.findElement(By.id("our-services-1145")).click();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.close();

	}

}
