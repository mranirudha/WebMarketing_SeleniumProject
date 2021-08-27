package com.eurofins.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eurofins.base.TestBase;
import com.eurofins.pages.HomePage;

public class HomePageTest extends TestBase {
	
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		HomePage homepage = new HomePage();
	}	
	
	@Test(priority=1)
	public void homePageTitleTest() {
		String homepageTitle = homepage.validateHomePageTitle();
		Assert.assertEquals(homepageTitle, "Worldwide laboratory testing services\r\n" + 
				"- Eurofins Scientific");
	}
	
	@Test(priority=2)
	public void homePageLogoTest() {
		boolean homepagelogo = homepage.validateHomePageLogo();
		Assert.assertTrue(homepagelogo);
	}
	
	public void footerBottomLogo() {
		boolean footerbotomlogo = homepage.validateFooterLogo();
		Assert.assertTrue(footerbotomlogo);
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();	
	}
}