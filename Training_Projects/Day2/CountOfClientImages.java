package day2Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class CountOfClientImages extends openCloseBrowser
{

	@Test
	public void CountOfClientImage() throws Exception
	{
	
		url="http://www.softest-training.com/index.php";
		driver.get(url);
		
		driver.findElement(By.xpath("(//a[text()='Clients'])[2]")).click();
		WebElement clientList=driver.findElement(By.className("deti"));
		wait.until(ExpectedConditions.not(ExpectedConditions.stalenessOf(clientList)));
		List <WebElement> clientLogo=clientList.findElements(By.tagName("img"));
		System.out.println("No of Images on the Page "+clientLogo.size());
		
		for (WebElement image:clientLogo) 
		{
		
			System.out.println(image.getAttribute("src"));
		}
		
	}	
}
