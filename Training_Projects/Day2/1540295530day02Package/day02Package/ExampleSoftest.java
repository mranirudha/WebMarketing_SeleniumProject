package day02Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExampleSoftest extends OpenCloseBrowser
{
	@Test
	public void TC_Softest_Login() 
	{
		String user="smita";
		String pwd="password@12";
		url="http://softest-training.com";
		driver.get(url);
		
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("textfield")).sendKeys(user);
		
		driver.findElement(By.id("textfield2")).sendKeys(pwd);
		
		driver.findElement(By.id("submit")).click();
		
		Assert.assertTrue(driver.getCurrentUrl().contains("student_home"));
		WebElement msg=driver.findElement(By.xpath("//td[@class='menu_link2']/p[8]"));
		Assert.assertTrue(msg.getText().contains(user), "UserName displayed on Student page");
		driver.findElement(By.linkText("Sign Out")).click();	
		Assert.assertTrue(driver.getCurrentUrl().contains("index"));
		}				
	}	

	
