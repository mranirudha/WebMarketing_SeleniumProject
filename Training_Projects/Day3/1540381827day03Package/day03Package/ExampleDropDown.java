package day03Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ExampleDropDown extends OpenCloseBrowser
{
	@Test(enabled=false)
	public void DropDown1()
	{
		url="file:///F:/Selenium-SampleHTML/DropDown.html";
		driver.get(url);
		
		WebElement drop1=driver.findElement(By.id("Drop01"));
		Select s1=new Select(drop1);
		int cnt1=s1.getOptions().size();
		System.out.println("No of options in Drop-1 : " + cnt1);
		for(WebElement opt: s1.getOptions())
		{
			System.out.println(opt.getText());
		}
		//s1.selectByValue("B");
		s1.selectByVisibleText("Business");
		System.out.println(drop1.getAttribute("value"));
	}
	@Test(enabled=true)
	public void DropDown2() throws Exception
	{
		url="file:///F:/Selenium-SampleHTML/DropDown.html";
		driver.get(url);
		
		WebElement drop2=driver.findElement(By.id("Drop02"));
		Select s2=new Select(drop2);
		int cnt2=s2.getOptions().size();
		System.out.println("No of options in Drop-2 : " + cnt2);
		s2.selectByValue("Flight");
		s2.selectByVisibleText("Train");
		s2.selectByIndex(3);
		Thread.sleep(1000);
		s2.deselectByValue("Train");
		Thread.sleep(1000);
		List <WebElement> selection=s2.getAllSelectedOptions();
		for(WebElement sel:selection)
		{
			System.out.println(sel.getText());
		}
	}

}
