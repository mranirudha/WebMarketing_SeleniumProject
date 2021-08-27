package day02Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ExampleVerify extends OpenCloseBrowser
{
	@Test(enabled=false)
	public void Verify_HardAssert()
	{
		url="http://google.com";
		driver.get(url);
		String expTitle="Google";
		String actTitle=driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		Reporter.log("Title is correct : " + actTitle,true);
		
		WebElement logo=driver.findElement(By.id("hplogo"));
		Assert.assertTrue(logo.isDisplayed(), "Verify Logo displayed");
		Reporter.log("Logo Displayed : " + logo.getAttribute("alt"));
		
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		String href=Gmail.getAttribute("href");
		Assert.assertTrue(href.contains("mail.google.com"), "Verify Gmail href");
		Reporter.log("Gmail Link correct");
		
	}
	@Test
	public void Verify_SoftAssert()
	{
		url="http://google.com";
		driver.get(url);
		String expTitle="Google";
		String actTitle=driver.getTitle();
		SoftAssert sAssert=new SoftAssert();
		sAssert.assertEquals(actTitle, expTitle);
		
		
		WebElement logo=driver.findElement(By.id("hplogo"));
		sAssert.assertFalse(logo.isDisplayed(), "Verify Logo displayed");
		
		
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		String href=Gmail.getAttribute("href");
		sAssert.assertTrue(href.contains("mail.yahoo.com"), "Verify Gmail href");
		
		sAssert.assertAll();
		
	}
}
