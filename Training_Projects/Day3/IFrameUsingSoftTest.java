package day3Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrameUsingSoftTest extends OpenCloseBrowser 
{
	@BeforeMethod
	public void SwitchMainFrame()
	{
		
		url="file:///F:/Selenium-SampleHTML/IframeExample.html";
		driver.get(url);
		WebElement frameMain=driver.findElement(By.id("Frame1"));
		driver.switchTo().frame(frameMain);
	}
	@Test(priority=1)
	public void Login() throws Exception
	{
		Reporter.log("LOGIN",true);
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("textfield")).sendKeys("smita");
		driver.findElement(By.id("textfield2")).sendKeys("password@12");
		driver.findElement(By.id("submit")).click();
		WebElement msg=driver.findElement(By.xpath("//td[@class='menu_link2']/p[8]"));
		Reporter.log(msg.getText(),true);
		driver.findElement(By.linkText("Sign Out")).click();	
	}
	@Test(priority=2)
	public void CountLikes()
	{
		Reporter.log("CountLikes",true);
		WebElement TopFrame=driver.findElements(By.tagName("iframe")).get(0);
		driver.switchTo().frame(TopFrame);
		WebElement like=driver.findElement(By.xpath("//span[text()='Like']/following-sibling::span[1]"));
		Reporter.log("No of Likes : " + like.getText(),true);		
	}
	
	@Test(priority=3)
	public void CountClientLogo()
	{
		Reporter.log("CountClientLogo",true);
		WebElement ImageSlideFrame=driver.findElements(By.tagName("iframe")).get(1);
		driver.switchTo().frame(ImageSlideFrame);
		WebElement scroll=driver.findElement(By.id("scroll_logo"));
		int cnt=scroll.findElements(By.xpath("descendant::td")).size();
		Reporter.log("No of images in Slide : " + cnt,true);
			
	}
	
	@AfterMethod
	public void SwitchDefaultPage()
	{
		driver.switchTo().defaultContent();
	}

}
