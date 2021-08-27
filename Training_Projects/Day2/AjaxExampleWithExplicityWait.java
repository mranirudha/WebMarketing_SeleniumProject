package day2Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AjaxExampleWithExplicityWait extends openCloseBrowser
{
	@Test
	public void AjaxExample() 
	{
		url="https://www.w3schools.com/xml/ajax_intro.asp";
		driver.get(url);
		title=driver.getTitle();
		System.out.println("URL "+title);
		WebElement demoBox=driver.findElement(By.id("demo"));
		String oldText=demoBox.getText();
		System.out.println("Text appearing before click "+oldText);
		//Finding button element
		//xpath = "//button[text()='Change Content']"
		//xpath = "//div[@id='demo']/button"
		driver.findElement(By.cssSelector("div#demo>button")).click();
		wait.until(ExpectedConditions.textToBePresentInElement(demoBox, "Asynchronous"));
		//wait.unitl(ExpectedConditions.not(ExpectedCondition.textToBePresentInElement(demoBox,oldText)));
		String newText =demoBox.getText();
		System.out.println("New Text: "+newText);
	}
}
