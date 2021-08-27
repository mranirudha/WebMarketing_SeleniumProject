package day03Package;

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
@Test(enabled=false)
public void Amazon()
{
	url="http://amazon.in";
	driver.get(url);
	WebElement shop=driver.findElement(By.id("nav-link-shopall"));
	Actions act=new Actions(driver);
	act.moveToElement(shop).perform();
	WebElement mobComp=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
	act.moveToElement(mobComp).perform();
	driver.findElement(By.xpath("//span[text()='All Mobile Phones']")).click();
	System.out.println(driver.getCurrentUrl());	
}

@Test(enabled=false)
public void CopyPaste() throws Exception
{
	url="http://google.com";
	driver.get(url);
	WebElement textBox=driver.findElement(By.id("lst-ib"));
	textBox.sendKeys("java");
	Actions act=new Actions(driver);
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(1000);
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(1000);
	textBox.clear();
	Thread.sleep(1000);
	textBox.click();
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	Thread.sleep(3000);
}
@Test
public void SaveImage() throws Exception
{
	String filePath="C:\\Users\\smita\\Downloads\\big-logo.png";
	File file=new File(filePath);
	if(file.exists())
	{
		file.delete();
	}	
	url="http://seleniumhq.org";
	driver.get(url);
	WebElement logo=driver.findElement(By.cssSelector("div#sidebar>img"));	
	Actions act=new Actions(driver);
	act.contextClick(logo).perform();
	Thread.sleep(1000);	
	Robot rb=new Robot();
	rb.keyPress(KeyEvent.VK_V);
	rb.keyRelease(KeyEvent.VK_V);	
	Thread.sleep(1000);
	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);	
	Thread.sleep(7000);	
}
}























