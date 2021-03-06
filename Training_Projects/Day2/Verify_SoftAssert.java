package day2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Verify_SoftAssert extends openCloseBrowser
{

	@Test
	public void SoftAssertExample() 
	{
	
		url="https://www.google.com";
		driver.get(url);
		String expTitle="Googleyyy";
		String actTitle =driver.getTitle();
		SoftAssert sAssert = new SoftAssert() ;
		sAssert.assertEquals(actTitle, expTitle);
		
		
		WebElement logo=driver.findElement(By.id("hplogo"));
		sAssert.assertTrue(logo.isDisplayed(),"Verify Logo displayed");
		
		
		WebElement Gmail=driver.findElement(By.linkText("Gmail"));
		String href=Gmail.getAttribute("href");
		sAssert.assertTrue(href.contains("mail.google.com"),"verify Gmail href");
		
		sAssert.assertAll();
		
		Reporter.log("Title is correct: "+actTitle,true);
		Reporter.log("Logo Diplayed: "+logo.getAttribute("alt"));
		Reporter.log("Gmail Link Correct");
	}
}
