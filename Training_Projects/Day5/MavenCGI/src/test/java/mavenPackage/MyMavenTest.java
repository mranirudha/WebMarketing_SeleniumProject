package mavenPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyMavenTest extends OpenCloseBrowser

{

	@Test
	public void TestCase01()
	{
		url="http://softest-training.com";
		driver.get(url);

		System.out.println(driver.getTitle());
		Assert.assertTrue(true);
	}
	
	@Test
	public void TestCase02()
	{
		url="http://amazon.in";
		driver.get(url);

		System.out.println(driver.getTitle());
		Assert.assertTrue(false);
	}
	
	@Test
	public void TestCase03()
	{
		url="http://google.com";
		driver.get(url);

		System.out.println(driver.getTitle());
		Assert.assertEquals("Goooogle", driver.getTitle());
	}
}
