package com.eurofins.pages;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eurofins.base.TestBase;

public class HomePage extends TestBase {
	
	
	@FindBy(id="imgLogo")
	WebElement topeurofinslogo;
	
	@FindBy(className="call") 
	WebElement gdpragreeandproceedbtn;
	
	@FindBy(className="close")  
	WebElement frameclosebtn;
	
	@FindBy(xpath="//div[@class='homepage-banner cf']//a[1]")
	WebElement firstblueimage;
	
	@FindBy(xpath="//div[@class='homepage-banner cf']//a[2]")
	WebElement secondblueimage;
	
	@FindBy(xpath="//div[@class='homepage-banner cf']//a[3]")
	WebElement thirdblueimage;
	
	@FindBy(xpath="//span[contains(text(),'Eurofins Careers')]")
	WebElement Majornavigations1;
	
	@FindBy(xpath="//span[contains(text(),'COVID-19 Response')]")
	WebElement Majornavigations2;
	
	@FindBy(xpath="//span[contains(text(),'Investors')]")
	WebElement Majornavigations3;
	
	@FindBy(xpath="//*[@id='home']/div/footer/div/div[2]/a")   
	WebElement bottomeurofinslogo;
	
	@FindBy(xpath="//*[@id=\"toptabs\"]/li[2]/a")  
	WebElement groupMenuLink1;
	
	@FindBy(xpath="//*[@id=\"toptabs\"]/li[3]/a")  
	WebElement groupMenuLink2;
	
	@FindBy(xpath="//*[@id=\"toptabs\"]/li[4]/a")   
	WebElement groupMenuLink3;
	
	@FindBy(xpath="//*[@id=\"toptabs\"]/li[5]/a")   
	WebElement groupMenuLink4;
	
	@FindBy(xpath="//*[@id=\"toptabs\"]/li[6]/a")   
	WebElement groupMenuLink5;
	
	@FindBy(xpath="//*[@id=\"toptabs\"]/li[7]/a")   
	WebElement groupMenuLink6;
	
	@FindBy(xpath="//span[contains(text(),'Food & Feed Testing')]") 
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[1]/a[1]/span") 
	WebElement orangeNavLink1;
	
	@FindBy(xpath="//span[contains(text(),'BioPharma Services')]")   
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[1]/a[2]/span")
	WebElement orangeNavLink2;
	
	@FindBy(xpath="//span[contains(text(),'Agroscience Services')]")   
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[1]/a[3]/span")
	WebElement orangeNavLink3;
	
	@FindBy(xpath="//span[contains(text(),'Agro Testing')]") 
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[2]/a[1]/span") 
	WebElement orangeNavLink4;
	
	@FindBy(xpath="//span[contains(text(),'Genomic Services')]") 
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[2]/a[2]/span") 
	WebElement orangeNavLink5;
	
	@FindBy(xpath="//span[contains(text(),'Consumer Product Testing')]") 
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[2]/a[3]/span") 
	WebElement orangeNavLink6;
	
	@FindBy(xpath="//div[@class='landing-links cf']//div[4]//a[1]//span[1]")
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[3]/a[1]/span") 
	WebElement orangeNavLink7;
	
	@FindBy(xpath="//span[contains(text(),'Clinical Diagnostics')]")  
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[3]/a[2]/span") 
	WebElement orangeNavLink8;
	
	@FindBy(xpath="//span[contains(text(),'Forensic Services')]")
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[3]/a[3]/span") 
	WebElement orangeNavLink9;
	
	@FindBy(xpath="//span[contains(text(),'Materials & Engineering Sciences')]") 
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[4]/a[1]/span") 
	WebElement orangeNavLink10;
	
	@FindBy(xpath="//span[contains(text(),'Technologies')]")
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[4]/a[2]/span") 
	WebElement orangeNavLink11;
	
	@FindBy(xpath="//span[contains(text(),'Cosmetics & Personal Care')]")  
	//@FindBy(xpath="//*[@id=\"landing-content\"]/div[2]/div[4]/a[3]/span") 
	WebElement orangeNavLink12;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[1]/a[1]")   
	WebElement footerNavLink1;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[1]/a[2]")   
	WebElement footerNavLink2;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[1]/a[3]")   
	WebElement footerNavLink3;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[1]/a[4]")   
	WebElement footerNavLink4;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[1]/a[5]")   
	WebElement footerNavLink5;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[1]/a[6]")   
	WebElement footerNavLink6;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[2]/a[1]")   
	WebElement footerNavLink7;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[2]/a[2]")   
	WebElement footerNavLink8;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[2]/a[3]")   
	WebElement footerNavLink9;
	
	@FindBy(xpath="//*[@id=\"home\"]/div/footer/div/div[1]/p[2]/a[4]")   
//	@FindBy(xpath="/html/body/div/footer/div/div[1]/p[2]/a[4]")
	WebElement footerNavLink10;
	
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/a")   
	WebElement mainNavLink1;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[1]/a") 
	WebElement mainNavLink1SubLink1;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[2]/a") 
	WebElement mainNavLink1SubLink2;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[3]/a")   
	WebElement mainNavLink1SubLink3;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[4]/a")   
	WebElement mainNavLink1SubLink4;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[5]/a")   
	WebElement mainNavLink1SubLink5;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[6]/a")   
	WebElement mainNavLink1SubLink6;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[7]/a")   
	WebElement mainNavLink1SubLink7;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[8]/a")   
	WebElement mainNavLink1SubLink8;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[9]/a")   
	WebElement mainNavLink1SubLink9;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[10]/a")   
	WebElement mainNavLink1SubLink10;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[11]/a")   
	WebElement mainNavLink1SubLink11;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[12]/a")   
	WebElement mainNavLink1SubLink12;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[13]/a")   
	WebElement mainNavLink1SubLink13;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[14]/a")   
	WebElement mainNavLink1SubLink14;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[15]/a")   
	WebElement mainNavLink1SubLink15;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[16]/a")   
	WebElement mainNavLink1SubLink16;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[17]/a")   
	WebElement mainNavLink1SubLink17;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[1]/ul/li[18]/a")  
	WebElement mainNavLink1SubLink18;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/a")   
	WebElement mainNavLink2;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[1]/a")  
	WebElement mainNavLink2SubLink1;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[2]/a")  
	WebElement mainNavLink2SubLink2;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[3]/a")  
	WebElement mainNavLink2SubLink3;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[4]/a")  
	WebElement mainNavLink2SubLink4;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[5]/a")  
	WebElement mainNavLink2SubLink5;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[6]/a")  
	WebElement mainNavLink2SubLink6;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[7]/a")  
	WebElement mainNavLink2SubLink7;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[2]/ul/li[8]/a")  
	WebElement mainNavLink2SubLink8;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/a")   
	WebElement mainNavLink3;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[1]/a")  
	WebElement mainNavLink3SubLink1;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[2]/a")  
	WebElement mainNavLink3SubLink2;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[3]/a")  
	WebElement mainNavLink3SubLink3;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[4]/a")  
	WebElement mainNavLink3SubLink4;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[5]/a")  
	WebElement mainNavLink3SubLink5;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[6]/a")  
	WebElement mainNavLink3SubLink6;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[7]/a")  
	WebElement mainNavLink3SubLink7;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[8]/a")  
	WebElement mainNavLink3SubLink8;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[9]/a")  
	WebElement mainNavLink3SubLink9;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[10]/a")  
	WebElement mainNavLink3SubLink10;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[3]/ul/li[11]/a")  
	WebElement mainNavLink3SubLink11;
	
	@FindBy(xpath="//a[contains(text(),'COVID-19-Response')]")   
	WebElement mainNavLink4;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'CEO Letter')]")  
	WebElement mainNavLink4SubLink1;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Latest News')]")  
	WebElement mainNavLink4SubLink2;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Business Continuity')]")  
	WebElement mainNavLink4SubLink3;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'SAFER@WORK')]")  
	WebElement mainNavLink4SubLink4;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Clinical Diagnostic Services')]")  
	WebElement mainNavLink4SubLink5;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Product Testing of PPE')]")  
	WebElement mainNavLink4SubLink6;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Surface Testing Kits')]")  
	WebElement mainNavLink4SubLink7;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Serology Testing Kits')]")  
	WebElement mainNavLink4SubLink8;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Genomic Solutions')]")  
	WebElement mainNavLink4SubLink9;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'BioPharma Product Testing')]")  
	WebElement mainNavLink4SubLink10;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Medical Device Testing')]")  
	WebElement mainNavLink4SubLink11;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Clinical Testing PCR Kits')]")  
	WebElement mainNavLink4SubLink12;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Surface Testing Services')]")  
	WebElement mainNavLink4SubLink13;
	
	@FindBy(xpath="//nav[@class='nav 1127']//a[contains(text(),'Investors')]")   
	WebElement mainNavLink5;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Shareholder Information')]")  
	WebElement mainNavLink5SubLink1;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Reports and Presentations')]")  
	WebElement mainNavLink5SubLink2;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[5]/ul/li[3]/a")  
	WebElement mainNavLink5SubLink3;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Our Success in Numbers')]")  
	WebElement mainNavLink5SubLink4;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Board Committees')]")  
	WebElement mainNavLink5SubLink5;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Dealings Disclosures')]")  
	WebElement mainNavLink5SubLink6;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Analyst Coverage')]")  
	WebElement mainNavLink5SubLink7;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Shares in Issue')]")  
	WebElement mainNavLink5SubLink8;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Corporate Timetable')]")  
	WebElement mainNavLink5SubLink9;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'AGM 2020')]")  
	WebElement mainNavLink5SubLink10;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'AGM 2019')]")  
	WebElement mainNavLink5SubLink11;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Debt & Hybrid Capital Instruments')]")  
	WebElement mainNavLink5SubLink12;
	
	@FindBy(xpath="//ul[@class='cf']//ul//li//a[contains(text(),'Investor Relations Events Timetable')]")  
	WebElement mainNavLink5SubLink13;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[6]/a")   
	WebElement mainNavLink6;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[6]/ul/li[1]/a")  
	WebElement mainNavLink6SubLink1;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[6]/ul/li[2]/a")  
	WebElement mainNavLink6SubLink2;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[6]/ul/li[3]/a")  
	WebElement mainNavLink6SubLink3;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[7]/a")   
	WebElement mainNavLink7;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[7]/ul/li[1]/a")  
	WebElement mainNavLink7SubLink1;
	
	@FindBy(xpath="/html/body/div/nav[2]/ul/li[7]/ul/li[2]/a")  
	WebElement mainNavLink7SubLink2;
	
	@FindBy(xpath="/html/body/div/footer/div/div[2]/p[1]")  
	WebElement copyrightMessageTxt;
	
	@FindBy(xpath="/html/body/div/footer/div/div[2]/p[2]")  
	WebElement lastUpdateTxt;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[3]/a/img")  
	WebElement emailLink;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[2]/a/img")  
	WebElement pdfLink;
	
	@FindBy(xpath="/html/body/div[1]/header/div[2]/div[1]/a/img")  
	WebElement printLink;
	
	
	
	//Initializing the Page Objects
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	

	//Performing Actions
	
	public boolean validateGDPRAgreeAndProceedbtn() {
		gdpragreeandproceedbtn.click();
		return true;
	}
	
	public boolean validateFrameClosebtn() {
		frameclosebtn.click();
		return true;
	}
	
	public String validateHomePageTitle() {
		return driver.getTitle();
	}
	
	public String validatePageTitle() {
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
	
	public void validateMajorNavigations1Link() {
		Majornavigations1.click();
		//return new Page1();
	}
	
	public void validateMajornavigations2link() {
		Majornavigations2.click();
		//return new Page2();
	}
	
	public void validateMajorNavigations3Link() {
		Majornavigations3.click();
		//return new Page3();
	}
	
	public boolean validateFooterLogo() {
		return bottomeurofinslogo.isDisplayed();
	}
	
	public void validateGroupMenuLink1() {
		groupMenuLink1.click();
		//return new HomePage();
	}
	
	public void validateGroupMenuLink2() {
		groupMenuLink2.click();
		//return new Page4();
	}
	
	public void validateGroupMenuLink3() {
		groupMenuLink3.click();
		//return new Page2();
	}
	
	public void validateGroupMenuLink4() {
		groupMenuLink4.click();
		//return new Page3();
	}
	
	public void validateGroupMenuLink5() {
		groupMenuLink5.click();
		//return new Page5();
	}
	
	public void validateGroupMenuLink6() {
		groupMenuLink6.click();
		//return new Page6();
	}
	
	public void validateOrangeNavLink1() {
		orangeNavLink1.click();
		//return new Page7();
	}
	
//	public String validateOrangeNavLink1Value() {
//		return orangeNavLink1.
//		//return new Page7();
//	}
	
	public void validateOrangeNavLink2() {
		orangeNavLink2.click();
		//return new Page8();
	}
	
	public void validateOrangeNavLink3() {
		orangeNavLink3.click();
		//return new Page9();
	}
	
	public void validateOrangeNavLink4() {
		orangeNavLink4.click();
		//return new Page10();
	}
	
	public void validateOrangeNavLink5() {
		orangeNavLink5.click();
		//return new Page11();
	}
	
	public void validateOrangeNavLink6() {
		orangeNavLink6.click();
		//return new Page12();
	}
	
	public void validateOrangeNavLink7() {
		orangeNavLink7.click();
		//return new Page13();
	}
	
	public void validateOrangeNavLink8() {
		orangeNavLink8.click();
		//return new Page14();
	}
	
	public void validateOrangeNavLink9() {
		orangeNavLink9.click();
		//return new Page15();
	}
	
	public void validateOrangeNavLink10() {
		orangeNavLink10.click();
		//return new Page16();
	}
	
	public void validateOrangeNavLink11() {
		orangeNavLink11.click();
		//return new Page17();
	}
	
	public void validateOrangeNavLink12() {
		orangeNavLink12.click();
		//return new Page18();
	}
	
	public void validateFooterNavLink1() {
		footerNavLink1.click();
	}
	
	public void validateFooterNavLink2() {
		footerNavLink2.click();
	}
	
	public void validateFooterNavLink3() {
		footerNavLink3.click();
	}
	
	public void validateFooterNavLink4() {
		footerNavLink4.click();
	}
	
	public void validateFooterNavLink5() {
		footerNavLink5.click();
	}
	
	public void validateFooterNavLink6() {
		footerNavLink6.click();
	}
	
	public void validateFooterNavLink7() {
		footerNavLink7.click();
	}
	
	public void validateFooterNavLink8() {
		footerNavLink8.click();
	}
	
	public void validateFooterNavLink9() {
		footerNavLink9.click();
	}
	
	public void validateFooterNavLink10() {
		footerNavLink10.click();
	}
	
	public void validateMainNavLink1() {
//		Actions action = new Actions(driver);
//		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1.click();
	}
	
	public void validateMainNavLink1SubLink1() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink1.click();
	}
	
	public void validateMainNavLink1SubLink2() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink2.click();
	}
	
	public void validateMainNavLink1SubLink3() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink3.click();
	}
	
	public void validateMainNavLink1SubLink4() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink4.click();
	}
	
	public void validateMainNavLink1SubLink5() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink5.click();
	}
	
	public void validateMainNavLink1SubLink6() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink6.click();
	}
	
	public void validateMainNavLink1SubLink7() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink7.click();
	}
	
	public void validateMainNavLink1SubLink8() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink8.click();
	}
	
	public void validateMainNavLink1SubLink9() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink9.click();
	}
	
	public void validateMainNavLink1SubLink10() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink10.click();
	}
	
	public void validateMainNavLink1SubLink11() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink11.click();
	}
	
	public void validateMainNavLink1SubLink12() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink12.click();
	}
	
	public void validateMainNavLink1SubLink13() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink13.click();
	}
	
	public void validateMainNavLink1SubLink14() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink14.click();
	}
	
	public void validateMainNavLink1SubLink15() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink15.click();
	}
	
	public void validateMainNavLink1SubLink16() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink16.click();
	}
	
	public void validateMainNavLink1SubLink17() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink17.click();
	}
	
	public void validateMainNavLink1SubLink18() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink1).build().perform();
		mainNavLink1SubLink18.click();
	}
	
	public void validateMainNavLink2() {
		mainNavLink2.click();
	}
	
	public void validateMainNavLink2SubLink1() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink1.click();
	}
	
	public void validateMainNavLink2SubLink2() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink2.click();
	}
	
	public void validateMainNavLink2SubLink3() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink3.click();
	}
	
	public void validateMainNavLink2SubLink4() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink4.click();
	}
	
	public void validateMainNavLink2SubLink5() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink5.click();
	}
	
	public void validateMainNavLink2SubLink6() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink6.click();
	}
	
	public void validateMainNavLink2SubLink7() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink7.click();
	}
	
	public void validateMainNavLink2SubLink8() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink2).build().perform();
		mainNavLink2SubLink8.click();
	}
	
	public void validateMainNavLink3() {
		mainNavLink3.click();
	}
	
	public void validateMainNavLink3SubLink1() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink1.click();
	}
	
	public void validateMainNavLink3SubLink2() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink2.click();
	}
	
	public void validateMainNavLink3SubLink3() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink3.click();
	}
	
	public void validateMainNavLink3SubLink4() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink4.click();
	}
	
	public void validateMainNavLink3SubLink5() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink5.click();
	}
	
	public void validateMainNavLink3SubLink6() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink6.click();
	}
	
	public void validateMainNavLink3SubLink7() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink7.click();
	}
	
	public void validateMainNavLink3SubLink8() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink8.click();
	}
	
	public void validateMainNavLink3SubLink9() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink9.click();
	}
	
	public void validateMainNavLink3SubLink10() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink10.click();
	}
	
	public void validateMainNavLink3SubLink11() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink3).build().perform();
		mainNavLink3SubLink11.click();
	}
	
	public void validateMainNavLink4() {
		mainNavLink4.click();
	}
	
	public void validateMainNavLink4SubLink1() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink1.click();
	}
	
	public void validateMainNavLink4SubLink2() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink2.click();
	}
	
	public void validateMainNavLink4SubLink3() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink3.click();
	}
	
	public void validateMainNavLink4SubLink4() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink4.click();
	}
	
	public void validateMainNavLink4SubLink5() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink5.click();
	}
	
	public void validateMainNavLink4SubLink6() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink6.click();
	}
	
	public void validateMainNavLink4SubLink7() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink7.click();
	}
	
	public void validateMainNavLink4SubLink8() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink8.click();
	}
	
	public void validateMainNavLink4SubLink9() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink9.click();
	}
	
	public void validateMainNavLink4SubLink10() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink10.click();
	}
	
	public void validateMainNavLink4SubLink11() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink11.click();
	}
		
	public void validateMainNavLink4SubLink12() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink12.click();
	}
	
	public void validateMainNavLink4SubLink13() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink4).build().perform();
		mainNavLink4SubLink13.click();
	}
	
	public void validateMainNavLink5() {
		mainNavLink5.click();
	}
	
	public void validateMainNavLink5SubLink1() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink1.click();
	}
	
	public void validateMainNavLink5SubLink2() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink2.click();
	}
	
	public void validateMainNavLink5SubLink3() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink3.click();
	}
	
	public void validateMainNavLink5SubLink4() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink4.click();
	}
	
	public void validateMainNavLink5SubLink5() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink5.click();
	}
	
	public void validateMainNavLink5SubLink6() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink6.click();
	}
	
	public void validateMainNavLink5SubLink7() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink7.click();
	}
	
	public void validateMainNavLink5SubLink8() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink8.click();
	}
	
	public void validateMainNavLink5SubLink9() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink9.click();
	}
	
	public void validateMainNavLink5SubLink10() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink10.click();
	}
	
	public void validateMainNavLink5SubLink11() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink11.click();
	}
	
	public void validateMainNavLink5SubLink12() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink12.click();
	}
	
	public void validateMainNavLink5SubLink13() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink5).build().perform();
		mainNavLink5SubLink13.click();
	}
	
	public void validateMainNavLink6() {
		mainNavLink6.click();
	}
	
	public void validateMainNavLink6SubLink1() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink6).build().perform();
		mainNavLink6SubLink1.click();
	}
	
	public void validateMainNavLink6SubLink2() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink6).build().perform();
		mainNavLink6SubLink2.click();
	}
	
	public void validateMainNavLink6SubLink3() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink6).build().perform();
		mainNavLink6SubLink3.click();
	}
	
	public void validateMainNavLink7() {
		mainNavLink7.click();
	}
	
	public void validateMainNavLink7SubLink1() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink7).build().perform();
		mainNavLink7SubLink1.click();
	}
	
	public void validateMainNavLink7SubLink2() {
		Actions action = new Actions(driver);
		action.moveToElement(mainNavLink7).build().perform();
		mainNavLink7SubLink2.click();
	}
	
	public String validateCopyrightMessageTxt() {
		return copyrightMessageTxt.getText();
	}
	
	public String validateLastUpdatedTxt() {
		return lastUpdateTxt.getText();
	}
	
	public void validateEmailLink() {
		emailLink.click();
	}
	
	public void validatePdfLink() {
		pdfLink.click();
	}
	
	public void validatePrintLink() {
		printLink.click();
	}
	
	
}
