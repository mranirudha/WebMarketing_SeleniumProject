//package com.eurofins.pages;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//import org.json.simple.parser.ParseException;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;
//
//import com.eurofins.base.TestBase;
//import com.eurofins.util.TestUtil;
//
//public class TestingSam extends TestBase {
//	
//	HomePage homepage;
//	TestUtil testUtil;
//
//
//	public static void main(String[] args) {
//	
//		
//		System.setProperty("webdriver.chrome.driver", "C://Anirudha_Project//Eurofins_Project//Selenium_Projects"
//				+ "//GroupWebSites//CorporateWebsiteAutomationProd//Drivers/chromedriver.exe");
//
//		WebDriver driver = new ChromeDriver();
//
//		driver.manage().window().maximize();
//		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
//		driver.get("https://www.eurofins.com/");
//		
//		//driver.wait(3,L);
//		//driver.switchTo().frame(By.className("truste_box_overlay_inner"));
//		//driver.switchTo().frame(driver.findElement(By.cssSelector("[id^='pop-frame']"))); 
//		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[title='TrustArc Cookie Consent Manager']")));
//		driver.findElement(By.className("call")).click();
//		driver.findElement(By.className("close")).click();
//		driver.switchTo().defaultContent();
////		WebElement Majornavigations2 = driver.findElement(By.xpath("//*[@id=\"landing-content\"]/div[2]/div[1]/a[2]/span")).click();
////		System.out.println(Majornavigations2);
//		
//		//public boolean hyperLinkTest(String orangeNavPageUrl) {
//			boolean hyperLinkVal = false;
////			List<WebElement> linkElements = driver.findElements(By.tagName("a"));
//			List<WebElement> linkElements = driver.findElements(By.xpath("//body//div//nav[@id='nav']//ul"));
//			String[] linkTexts = new String[linkElements.size()];
//			int i = 0;
//			int count = 0;
//			
//			// extract the link texts of each link element
//			for (WebElement e : linkElements) {
//				linkTexts[i] = e.getText();
//				i++;
//				count ++;
//			}
//			
//			System.out.println(count);
//
//			// test each link
////
////			for (String t : linkTexts) {
////				if (!(t.isEmpty())) {
////					if (t.trim() == "Contacts Page") {
////						continue;
////					} else if (t.trim() == "Careers Page") {
////						continue;
////					} else {
////						try {
////							driver.findElement(By.linkText(t)).click();
////						} catch (Exception ignore) {
////
////						}
////					}
////				} else if (t == "Cookie Preference") {
////					HomePage homepage = new HomePage();
////					TestUtil testUtil = new TestUtil();
////					boolean check = getGDPRCheck(homepage, testUtil);
////					if (check) {
////						testUtil.switchToDefaultContent();
////					}
////
////				} else {
////					continue;
////				}
////				driver.navigate().to(orangeNavPageUrl);
////				hyperLinkVal = true;
////			}
////			return hyperLinkVal;
//		}
//		//driver.close();
//		
//	}
//		
//	
//	
//	
//		
//		/*public void majorNavLink2Test() throws ClassNotFoundException, NoSuchMethodException, SecurityException,
//		InstantiationException, IllegalAccessException {
//	String majoreNavpageID = getIDFromJsonFileMajornavigations("Majornavigations2");
//	homepage = new HomePage();
//	Class myClass = Class.forName("com.eurofins.pages." + majoreNavpageID);
//	Object page = myClass.newInstance();
//	
//	for (String windowHandle : driver.getWindowHandles()) {
//		driver.switchTo().window(windowHandle);
//		
//		homepage.validateMajornavigations2link();
//		
//		String metaTitle = homepage.validatePageTitle();
//		String pageTitle = getTitleFromPage(majoreNavpageID);
//		Assert.assertTrue(metaTitle.contains(pageTitle));
//		
//		driver.switchTo().window(tabs.get(0));
//
//		//Switch back to original window
//		driver.switchTo().window(mainWindowHandle);
//		
//
//	}
//}*/
//		
//	/*>>>>>>>>>>>>To read Json File starts>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//		
//		//driver.quit();
//		JSONArray jsonObject= GetJsonFile();
//
//		  JSONObject json = (JSONObject) jsonObject.get(0);
//		  
//	        
//	        JSONObject HomePage = (JSONObject)json.get("HomePage");
//	        
//	        JSONObject Majornavigations = (JSONObject)HomePage.get("Majornavigations");
//	        String Majornavigations1 = Majornavigations.get("Majornavigations1").toString();;
//	        String Majornavigations2 = Majornavigations.get("Majornavigations2").toString();;
//	        String Majornavigations3 = Majornavigations.get("Majornavigations3").toString();;
//	        
//	        JSONObject Orangenavigations = (JSONObject)HomePage.get("Orangenavigations");
//	        JSONObject Orangenavigations1 = (JSONObject)Orangenavigations.get("Orangenavigations1");
//	        JSONObject Orangenavigations2 = (JSONObject)Orangenavigations.get("Orangenavigations2");
//	        JSONObject Orangenavigations3 = (JSONObject)Orangenavigations.get("Orangenavigations3");
//	        JSONObject Orangenavigations4 = (JSONObject)Orangenavigations.get("Orangenavigations4");
//	        JSONObject Orangenavigations5 = (JSONObject)Orangenavigations.get("Orangenavigations5");
//	        JSONObject Orangenavigations6 = (JSONObject)Orangenavigations.get("Orangenavigations6");
//	        JSONObject Orangenavigations7 = (JSONObject)Orangenavigations.get("Orangenavigations7");
//	        JSONObject Orangenavigations8 = (JSONObject)Orangenavigations.get("Orangenavigations8");
//	        JSONObject Orangenavigations9 = (JSONObject)Orangenavigations.get("Orangenavigations9");
//	        JSONObject Orangenavigations10 = (JSONObject)Orangenavigations.get("Orangenavigations10");
//	        JSONObject Orangenavigations11 = (JSONObject)Orangenavigations.get("Orangenavigations11");
//	        JSONObject Orangenavigations12 = (JSONObject)Orangenavigations.get("Orangenavigations12");
//	        
//	        
//	        String title= Orangenavigations3.get("title").toString();
//	       // JSONObject Majornavigations1 = (JSONObject)Majornavigations.get("Majornavigations1");
//	      //  String title= Majornavigations1.get("title").toString();
//		
////		System.out.println(jsonObject);
//
//
// 
//		
//		try {
//			String filename ="C:\\Anirudha_Project\\Eurofins_Project\\Selenium_Projects"
//					+ "\\GroupWebSites\\CorporateWebsiteAutomationProd\\src\\main\\java\\com\\eurofins\\config\\json\\eurofinsindia.json";
//			JSONParser jsonParser = new JSONParser();
//			FileReader reader = new FileReader(filename);
//			// Read JSON file
//			Object obj = jsonParser.parse(reader);
//			//JSONObject jsonObject = (JSONObject) obj;
//			JSONArray result = (JSONArray) obj;
//			System.out.println(result);
////			return result;
//		} catch (FileNotFoundException e) {
//			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
////			return null;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
////			return null;
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
////			return null;
//		}
//		
//		
//		//System.out.println(title);
//		
//	}
//	
//	/*public void getIDFromJsonFile(){
//		JSONObject GroupMenunavigations3 = (JSONObject) json.get("GroupMenunavigations3");
//		String pageID = HomePage.get("id").toString();
//		}
//	//System.out.println(pageID);
//	System.out.println(pageID);
//	*/
//
//
//	
//	/*public static JSONArray GetJsonFile() {
//		try {
//			String filename ="C:\\Anirudha_Project\\Eurofins_Project\\Selenium_Projects"
//					+ "\\GroupWebSites\\CorporateWebsiteAutomationProd\\src\\main\\java\\com\\eurofins\\config\\json\\eurofinsindia.json";
//			JSONParser jsonParser = new JSONParser();
//			FileReader reader = new FileReader(filename);
//			// Read JSON file
//			Object obj = jsonParser.parse(reader);
//			//JSONObject jsonObject = (JSONObject) obj;
//			JSONArray result = (JSONArray) obj;
//			return result;
//		} catch (FileNotFoundException e) {
//			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//			return null;
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}    
//		
//		
//	}
//
//	 >>>>>>>>>>>>To read Json File starts>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>*/
//	
//
//	
//}
