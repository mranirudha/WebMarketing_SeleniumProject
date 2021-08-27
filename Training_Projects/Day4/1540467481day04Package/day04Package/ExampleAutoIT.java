package day04Package;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ExampleAutoIT extends OpenCloseBrowser
{
	@Test
	public void SaveImageToFolder() throws Exception
	{
		String filePath="Resources\\seleniumLogo.png";
		File file=new File(filePath);
		if(file.exists())
		{
			file.delete();
		}	
		String autoItFile="Resources/AutoItSaveImage.exe";
		url="http://seleniumhq.org";
		driver.get(url);
		WebElement logo=driver.findElement(By.cssSelector("div#sidebar>img"));	
		Actions act=new Actions(driver);
		act.contextClick(logo).perform();
		Thread.sleep(1000);	
		//Type the below lines in scite , save as AutoItSaveImage.au3 in project resources folder and compile
		// to AutoItSaveImage.exe
//		AutoItSetOption("SendKeyDelay", 400)
//		Send("v")
//		sleep(2000)
//		Send("F:\ProjectsSelenium\ITC-Oct-18\Resources\seleniumLogo.png")
//		sleep(1000)
//		Send("{Enter}")
		Runtime.getRuntime().exec(autoItFile);
		Thread.sleep(45000);	
	}

}
