package day03Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExampleMultiTabs extends OpenCloseBrowser
{
	@Test
	public void TC_MultiTabs()
	{
		url="http://irctc.co.in";
		driver.get(url);		
		driver.findElement(By.partialLinkText("MEALS")).click();
		driver.findElement(By.partialLinkText("E-Catering")).click();		
		driver.findElement(By.partialLinkText("SERVICE AT STATIONS")).click();
		driver.findElement(By.partialLinkText("Battery Operated Cars")).click();
		driver.findElement(By.partialLinkText("E-wheelchair")).click();
		driver.findElement(By.partialLinkText("Retiring Room")).click();		
		String pwh=driver.getWindowHandle(); // returns the handle of the driver		
		wait.until(ExpectedConditions.numberOfWindowsToBe(5)); // wait until no of open windows are 5
		Set<String> winHandles=driver.getWindowHandles(); // returns a collection of handles of all open windows
		System.out.println("No of open Tabs : " + winHandles.size());		
		for(String wh:winHandles)		{
			driver.switchTo().window(wh); // switch to window with handle wh(iteration)
			System.out.println(driver.getCurrentUrl());			
			if(driver.getCurrentUrl().contains("ecatering"))			{
				int cnt=driver.findElements(By.xpath("//section[@class='partners__iagLb']//img")).size();
				System.out.println("No of partner images : " + cnt);
			}			
			if(!wh.equalsIgnoreCase(pwh)) // close all windows except the initial window
			{
				driver.close();
			}			
		}
		driver.switchTo().window(pwh); // switch back to the initial window
		System.out.println("Back to Home : " + driver.getCurrentUrl());		
	}
}





