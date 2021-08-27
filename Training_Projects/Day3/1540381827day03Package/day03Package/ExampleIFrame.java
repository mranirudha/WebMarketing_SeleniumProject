package day03Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ExampleIFrame extends OpenCloseBrowser
{
	@Test
	public void TC_IFrames()
	{
		url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe";
		driver.get(url);
		WebElement frame1=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame1);
		WebElement frame2=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.linkText("LEARN HTML")).click();
		System.out.println(driver.findElement(By.cssSelector("div#main>h1")).getText());
		driver.switchTo().defaultContent(); // main page
		
	//	driver.switchTo().parentFrame(); // immediate parent
		
		
	}

}
