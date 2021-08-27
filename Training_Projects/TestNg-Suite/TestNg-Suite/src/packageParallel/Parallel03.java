package packageParallel;

import org.testng.annotations.Test;

public class Parallel03 extends OpenCloseBrowserWithParameter
{
	@Test()
	public void TC_Linkedin()
	{
		url="http://linkedin.com";
		driver.get(url);
		System.out.println(driver.getTitle());
	}

}
