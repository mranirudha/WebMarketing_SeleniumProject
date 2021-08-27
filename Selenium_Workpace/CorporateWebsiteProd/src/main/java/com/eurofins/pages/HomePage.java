package com.eurofins.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eurofins.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(id="imgLogo")
	WebElement topeurofinslogo;
	
	@FindBy(xpath="//[@id=\"landing-content\"]/div[1]/a[1]")
	WebElement firstblueimage;
	
	@FindBy(xpath="//[@id=\"landing-content\"]/div[1]/a[2]")
	WebElement secondblueimage;
	
	@FindBy(xpath="//[@id=\"landing-content\"]/div[1]/a[3]")
	WebElement thirdblueimage;
	
	@FindBy(xpath="//[@id=\"landing-content\"]/div[1]/a[1]/span")
	WebElement firstblueimagelink;
	
	@FindBy(xpath="//[@id=\"landing-content\"]/div[1]/a[2]/span")
	WebElement secondblueimagelink;
	
	@FindBy(xpath="//[@id=\"landing-content\"]/div[1]/a[3]/span")
	WebElement thirdblueimagelink;
	
	@FindBy(xpath="//[@id=\"home\"]/div/footer/div/div[2]/a")
	WebElement bottomeurofinslogo;
	
	/*
	//Footer nav links to be prepared
	
	//a[contains(text(),'Homepage')]
	
	*/
	
	//Initializing the Page Objects
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	

	//Performing Actions
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateHomePageLogo() {
		return topeurofinslogo.isDisplayed();
	}
	
	public boolean validateFirstBlueImage() {
		return firstblueimage.isDisplayed();
	}
	
	public boolean validateSecondBlueImage() {
		return secondblueimage.isDisplayed();
	}
	
	public boolean validateThirdBlueImage() {
		return thirdblueimage.isDisplayed();
	}
	
	public WorldwideInteractiveMapPage validatefirstblueimagelink() {
		firstblueimagelink.click();
		return new WorldwideInteractiveMapPage();
	}
	
	public CareersEurofinsPage validatesecondblueimagelink() {
		secondblueimagelink.click();
		return new CareersEurofinsPage();
	}
	
	public InvestorRelationsPage validatethirdblueimagelink() {
		thirdblueimagelink.click();
		return new InvestorRelationsPage();
	}
	
	public boolean validateFooterLogo() {
		return bottomeurofinslogo.isDisplayed();
		
	}
	
	
}
