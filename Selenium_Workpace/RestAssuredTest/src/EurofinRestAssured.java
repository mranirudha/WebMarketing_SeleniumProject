import java.util.*;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.util.concurrent.TimeUnit;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class EurofinRestAssured {
	
	public static void SLLDisablexecute(){
		  TrustManager[] trustAllCerts = new TrustManager[] {
		        new X509TrustManager() {
		          public java.security.cert.X509Certificate[] getAcceptedIssuers() {
		           return null;
		          }
		          @Override
		          public void checkClientTrusted(X509Certificate[] arg0, String arg1)
		           throws CertificateException {}
		 
		          @Override
		          public void checkServerTrusted(X509Certificate[] arg0, String arg1)
		            throws CertificateException {}
		          }
		     };
		  SSLContext sc=null;
		  try {
		   sc = SSLContext.getInstance("SSL");
		  } catch (NoSuchAlgorithmException e) {
		   e.printStackTrace();
		  }
		  try {
		   sc.init(null, trustAllCerts, new java.security.SecureRandom());
		  } catch (KeyManagementException e) {
		   e.printStackTrace();
		  }
		  HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
		  // Create all-trusting host name verifier
		  HostnameVerifier validHosts = new HostnameVerifier() {
		  @Override
		  public boolean verify(String arg0, SSLSession arg1) {
		   return true;
		  }
		  };
		  // All hosts will be valid
		  HttpsURLConnection.setDefaultHostnameVerifier(validHosts);
		 }

	
	public static void ObtainAllLinks() throws InterruptedException, NullPointerException, IOException {

		// Open a Blank Chrome Instance

		WebDriver driver = new ChromeDriver();

		// Delete Cookies

		driver.manage().deleteAllCookies();

		// Open HomePage

		driver.get("https://www.eurofins.in");

		// Wait for Page Loading (5 Second)

		Thread.sleep(6000);

		// Collect All Anchor Tags

		List<WebElement> allAnchorTags = driver.findElements(By.tagName("a"));

		// Save all Links on HomePage in a 'Set' datatype to remove duplicates

		Set<String> hrefValues = new LinkedHashSet<String>();

		for (WebElement anchorTag : allAnchorTags) {

			if ((anchorTag.getAttribute("href").contains("eurofins"))
					&& (anchorTag.getAttribute("href").contains("http"))) {

				hrefValues.add(anchorTag.getAttribute("href"));

			}

			else {
				System.out.println("Link Skipped: " + anchorTag.getAttribute("href"));
			}

		}

		System.out.println("Total Links Collected from HomePage : " + hrefValues.size() + "\n\n");

		// Open all homePage Links and collect all SubLinks

		int URLNumber = 0;

		Set<String> AllSitesAndSubSiteshrefValues = new HashSet<String>();

		for (String hrefValue : hrefValues) {

			URLNumber = URLNumber + 1;

			driver.get(hrefValue);
			Thread.sleep(3000);

			List<WebElement> AllSitesAndSubSitesAnchorTag = driver.findElements(By.tagName("a"));

			System.out.println("URL No: " + URLNumber + " --- No of Anchor Tags in Website \"" + hrefValue + "\" is "
					+ AllSitesAndSubSitesAnchorTag.size());

			for (WebElement UniversalAnchorTag : AllSitesAndSubSitesAnchorTag) {

				if (UniversalAnchorTag.getAttribute("href") == null) {

					System.out.println("NullObjectSkipped");
					continue;

				}

				if ((UniversalAnchorTag.getAttribute("href").contains(".eurofins"))
						|| (UniversalAnchorTag.getAttribute("href").contains("eurofins."))) {

					if ((UniversalAnchorTag.getAttribute("href").contains("#"))
							|| (UniversalAnchorTag.getAttribute("href").contains("htm2pdf"))
							|| (UniversalAnchorTag.getAttribute("href").contains("mailto"))
							|| (UniversalAnchorTag.getAttribute("href").contains(".pdf"))) {

						System.out.println("Link Skipped: " + UniversalAnchorTag.getAttribute("href"));

					}

					else {
						AllSitesAndSubSiteshrefValues.add(UniversalAnchorTag.getAttribute("href"));

					}

				}

				else {
					System.out.println("Link Skipped: " + UniversalAnchorTag.getAttribute("href"));
				}

			}

		}

		System.out.println("\n \n Total number of Links collected is " + AllSitesAndSubSiteshrefValues.size());

		// Writing All the links to a textFile

		FileWriter fw = new FileWriter("AllLinkFile.txt");

		Iterator<String> it = AllSitesAndSubSiteshrefValues.iterator();

		while (it.hasNext()) {

			String Link = it.next();

			fw.write(Link + System.lineSeparator());

		}

		fw.close();

		System.out.println("\n \n Link File Created Successfully");
		driver.close();

	}

	public static void checkStatusCode() throws MalformedURLException, InterruptedException, NullPointerException, IOException {

		// Open a Blank Chrome Instance

		WebDriver driver = new ChromeDriver();

		// Delete Cookies

		driver.manage().deleteAllCookies();

		FileReader reader = new FileReader("AllLinkFile.txt");
		FileWriter fw = new FileWriter("HTTPSatus.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);

		String line;
		int LinkCount=0;

		while ((line = bufferedReader.readLine()) != null) {
			
			++LinkCount;
			driver.get(line);
			// wait of 5 seconds
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			// establish and open connection with URL
			HttpURLConnection c = (HttpURLConnection) new URL(line).openConnection();
			// set the HEAD request with setRequestMethod
			c.setRequestMethod("HEAD");
			// connection started and get response code
			c.connect();
			int r = c.getResponseCode();
			System.out.println(LinkCount+": Link : "+line +" --- StatusCode --- "+r);
			fw.write(LinkCount+": Link : "+line +" --- StatusCode --- "+r+ System.lineSeparator());

			
		}
		reader.close();
		fw.close();
		System.out.println("\n \n StatusCode Report Created Successfully");
		driver.close();

	}
	
	public static void checkStatusCodeRest()
	{
		SLLDisablexecute();
		RestAssured.baseURI="https://www.eurofins.in/";
		System.out.println(RestAssured.get("https://www.eurofins.in/").statusCode());
	}

	public static void main(String[] args) throws NullPointerException, InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Anirudha_Project\\Eurofins_Project\\Selenium_Projects\\GroupWebSites\\CorporateWebsiteAutomationProd\\Drivers\\chromedriver.exe");
		//ObtainAllLinks();
		//checkStatusCode();
		checkStatusCodeRest();

	}

}
