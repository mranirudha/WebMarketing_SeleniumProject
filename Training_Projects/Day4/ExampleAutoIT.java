package day4Package;

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
	public void DownLoadImage () throws Exception
	{
		
		String filePath="ImageUploadDownload\\Logo-Selenium.png";
		//String filepath="D:\\22 oct training";
		File file=new File(filePath);
		if(file.exists())
		{
			file.delete();
		}
		String autoITFile="ImageUploadDownload/AutoItSaveImage.exe";
		url="https://www.seleniumhq.org/";
		driver.get(url);
		WebElement logo=driver.findElement(By.cssSelector("div#sidebar>img"));		
		Actions act=new Actions(driver);
		act.contextClick(logo).perform();
		Thread.sleep(2000);
		//type the below lines is AutoIT ide 
		//save as AutiITSAveImage.au3 in project resources folder 
		//and compile --> To compile use command in autoit ide  --> Ctrl+f7 /Go to tools-->Compile
		//and provide name as  "AutoItSaveImage.exe"
		//AutoItSetOption("sendKeyDelay",400)
		//Send("v")
		//sleep(2000)
		//Send("F:\ProjectSelenium\ITC-Oct-18\Resources\seleniumLogo.png")
		//sleep(1000)
		//Send("{Enter}")
		Runtime.getRuntime().exec(autoITFile);
		Thread.sleep(60000);
	}

}
