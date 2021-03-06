package day3Package;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends OpenCloseBrowser 
{
	@Test (enabled=false)
	public void DropDown1()
	{
		url="file:///C:/Users/training/Desktop/Anirudha/Day3/1501486869DropDown.html";
		driver.get(url);
		
		WebElement drop1=driver.findElement(By.id("Drop01"));
		Select s1 = new Select(drop1);
		int cnt1 =s1.getOptions().size();
		System.out.println("No of options in Dropdown-1 : "+cnt1);
		for (WebElement opt:s1.getOptions())
		{
			System.out.println(opt.getText());
		}
		//s1.selectByValue("B");
		s1.selectByVisibleText("Business");
		System.out.println(drop1.getAttribute("Vale"));
	}
	@Test (enabled=true)
	public void DropDown2() throws Exception
	{
		url="file:///C:/Users/training/Desktop/Anirudha/Day3/1501486869DropDown.html";
		driver.get(url);
		
		WebElement drop2=driver.findElement(By.id("Drop02"));
		Select s2 = new Select(drop2);
		int cnt2 =s2.getOptions().size();
		System.out.println("No of options in Dropdown-2 : "+cnt2);
		s2.selectByValue("Flight");
		s2.selectByIndex(0);
		s2.selectByVisibleText("Taxi");
		s2.selectByVisibleText("Train");
		Thread.sleep(2000);
		s2.deselectByValue("Train");
		Thread.sleep(2000);
		List <WebElement> selection =s2.getAllSelectedOptions();
		for (WebElement sel:selection)
		{
			System.out.println(sel.getText());
		}
	}	
}
