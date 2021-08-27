package day02Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExampleAjax extends OpenCloseBrowser
{

	@Test
	public void Ajax_TC()
	{
		url="https://www.w3schools.com/xml/ajax_intro.asp";
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement demoBox=driver.findElement(By.id("demo"));
		String oldText=demoBox.getText();
		System.out.println("Old Text : " + oldText);		
		 // xpath = "//button[text()='Change Content']"
		// xpath = "//div[@id='demo']/button"
		driver.findElement(By.cssSelector("div#demo>button")).click();
	//	wait.until(ExpectedConditions.textToBePresentInElement(demoBox, "Asynchronous"));
		wait.until(ExpectedConditions.not(ExpectedConditions.textToBePresentInElement(demoBox, oldText)));
		String newText=demoBox.getText();
		System.out.println("New Text : " + newText);		
	}
}
