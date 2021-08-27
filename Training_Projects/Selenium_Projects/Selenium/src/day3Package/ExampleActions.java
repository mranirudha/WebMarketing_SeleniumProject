package day3Package;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExampleActions extends OpenCloseBrowser
{
	@Test (enabled=false)
	public void AmazonKeyMouseActions()
	{
		url="https://www.amazon.in";
		driver.get(url);
		WebElement shop=driver.findElement(By.id("nav-link-shopall"));
		Actions act=new Actions(driver);
		act.moveToElement(shop).perform();
		WebElement MobileComputer=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		act.moveToElement(MobileComputer).perform();
		driver.findElement(By.xpath("//span[text()='All Mobile Phones']")).click();
		System.out.println("Clicked Url : "+driver.getCurrentUrl());
	}
	
	@Test (enabled=false)
	public void GoogleKeyBoardActions() throws Exception
	{
		url="https://www.google.com";
		driver.get(url);
		WebElement textBox=driver.findElement(By.id("lst-ib"));
		textBox.sendKeys("Flipkart");
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);
		textBox.clear();
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(2000);	
		textBox.click();
		System.out.println("Current Text : "+driver.findElement(By.id("lst-ib")).getText());
	}
	@Test (enabled=true)
	public void SaveImage() throws Exception
	{
		
		String filePath="Downloads";
		//String filepath="D:\\22 oct training";
		File file=new File(filePath);
		if(file.exists())
		{
			file.delete();
		}
		url="https://www.seleniumhq.org/";
		driver.get(url);
		WebElement logo=driver.findElement(By.cssSelector("div#sidebar>img"));		
		Actions act=new Actions(driver);
		act.contextClick(logo).perform();
		Thread.sleep(2000);
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
	}
}
