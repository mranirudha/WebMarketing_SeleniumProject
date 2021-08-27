package packageParallel;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Parallel02 extends OpenCloseBrowserWithParameter
{
	
	@Test()
	public void TC_Flipkart()
	{
		url="http://flipkart.com";
		driver.get(url);
		System.out.println(driver.getTitle());
	}

}
