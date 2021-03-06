package day2Package;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftestPage extends openCloseBrowser
{

	@Test
	public void SoftAssertExample() 
	{
	
		url="http://www.softest-training.com/index.php";
		driver.get(url);
		String expTitle="Softest Training";
		String actTitle =driver.getTitle();
		SoftAssert sAssert = new SoftAssert() ;
		sAssert.assertEquals(actTitle, expTitle);
		
		//WebElement logo=driver.findElement(By.xpath("//div[@id='top']/a"));
		WebElement logo=driver.findElement(By.xpath("//div[@id='top']/descendant::img[1]"));
		sAssert.assertTrue(logo.isDisplayed(),"Verify Logo displayed");
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.name("username")).sendKeys("4564");
		driver.findElement(By.name("password")).sendKeys("password@12");
		driver.findElement(By.name("btn_login")).click();
		
		wait.until(ExpectedConditions.urlContains("softest-training"));
		System.out.println("2nd URL "+ driver.getCurrentUrl());
		
		WebElement msg=driver.findElement(By.xpath(("//td[@class='menu_link2']/p[8]")));
		String msgText=msg.getText();
		sAssert.assertTrue(msgText.contains("4564"));
		
		driver.findElement(By.linkText("Sign Out")).click();
		wait.until(ExpectedConditions.urlContains("index.php"));
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
		
		sAssert.assertAll();
		
		
	}
}
