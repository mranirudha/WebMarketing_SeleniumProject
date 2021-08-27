package day1Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverBasics 
{
	public static void main(String[] args)
	{
		String fn,url,title;
		fn="D:\\22 oct training\\geckodriver.exe";
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver",fn);
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		url="https://www.google.com";
		driver.get(url);
		title=driver.getTitle();
		System.out.println("URL "+title);
		driver.findElement(By.id("lst-ib")).sendKeys("Testing");
		driver.findElement(By.name("btnK")).click();
		title=driver.getTitle();
		System.out.println("Current URL "+title);
		driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
		System.out.println("2nd URL "+ driver.getCurrentUrl());
		driver.quit();
	}	
}
