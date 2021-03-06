package day2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verify_HardAssert extends openCloseBrowser 
{
	@Test
	public void HardAssert() 
	{
	
		url="https://www.google.com";
		driver.get(url);
		String expTitle="Google";
		String actTitle =driver.getTitle();
		Assert.assertEquals(actTitle, expTitle);
		Reporter.log("Title is correct: "+actTitle,true);
		
		WebElement logo=driver.findElement(By.id("hplogo"));
		Assert.assertTrue(logo.isDisplayed(),"Verify Logo displayed");
		Reporter.log("Logo Diplayed: "+logo.getAttribute("alt"));
		
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		String href=Gmail.getAttribute("href");
		Assert.assertTrue(href.contains("mail.google.com"),"verify Gmail href");
		Reporter.log("Gmail Link Correct");
		
	}
}
