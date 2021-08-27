package day3Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExampleMultiTabs extends OpenCloseBrowser 
{
	@Test
	public void MultiTabs()
	{
	url="https://www.irctc.co.in/nget/train-search";
	driver.get(url);
	driver.findElement(By.partialLinkText("MEALS")).click();
	driver.findElement(By.partialLinkText("E-Catering")).click();
	driver.findElement(By.partialLinkText("SERVICE AT STATIONS")).click();
	driver.findElement(By.partialLinkText("Battery Operated Cars")).click();
	driver.findElement(By.partialLinkText("E-wheelchair")).click();
	driver.findElement(By.partialLinkText("Retiring Room")).click();
	
	String parentWindowId=driver.getWindowHandle(); //Returns the parentWindowId
	
	wait.until(ExpectedConditions.numberOfWindowsToBe(5));//wait until the no of open windows are 5
	Set <String> WinHandles=driver.getWindowHandles();//returns collection of handles of all open window
	System.out.println("No of Open Tabs: "+WinHandles.size());
	for(String wh:WinHandles)
	{
		driver.switchTo().window(wh);//switch to window with handle wh (iteration)
		System.out.println(driver.getCurrentUrl());
		if(driver.getCurrentUrl().contains("eCatering"))
		{
			int cnt=driver.findElements(By.xpath("//section[@class='partners__iagLb']//img")).size();
			System.out.println("No of Partner images: "+cnt);
		}
		//close all window except the initial window
		if(!wh.equalsIgnoreCase(parentWindowId))
		{
			driver.close();
		}
		driver.switchTo().window(parentWindowId);//switch back the control to the initial window
		System.out.println("Back to Home : "+driver.getCurrentUrl());
	}
	}
}
