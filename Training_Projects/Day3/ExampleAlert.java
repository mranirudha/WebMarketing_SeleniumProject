package day3Package;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExampleAlert extends OpenCloseBrowser
{
	@Test
	public void DropDown()
	{
		url="file:///C:/Users/training/Desktop/Anirudha/Day3/1400575597popup.html";
		driver.get(url);
		try 
		{
			driver.findElement(By.xpath("//input[@value='Show Alert Box']")).click();
			wait.until(ExpectedConditions.alertIsPresent());
			Alert a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.accept();
			System.out.println(driver.findElement(By.id("result")).getText());
			///********************************************
			driver.findElement(By.xpath("//input[@value='Show Confirm Box']")).click();
			wait.until(ExpectedConditions.alertIsPresent());
			a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.dismiss();
			System.out.println(driver.findElement(By.id("result")).getText());
			///********************************************
			driver.findElement(By.xpath("//input[@value='Show Prompt Box']")).click();
			wait.until(ExpectedConditions.alertIsPresent());
			a=driver.switchTo().alert();
			System.out.println(a.getText());
			a.sendKeys("Hello Sir");
			a.accept();
			System.out.println(driver.findElement(By.id("result")).getText());
		}
		catch (Exception e)
		{
			System.out.println("No Alerts");
		}
	}	
}
