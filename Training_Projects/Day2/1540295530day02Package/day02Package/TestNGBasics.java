package day02Package;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNGBasics 
{
	@BeforeTest
	public void BT()	{
		System.out.println("Before test");
	}	
	@BeforeClass
	public void BC()	{
		System.out.println("Before Class");
	}	
	@BeforeMethod
	public void BM()	{
		System.out.println("Before Method");
	}	
	@AfterClass
	public void AC()	{
		System.out.println("After Class");
	}	
	@AfterTest
	public void AT()	{
		System.out.println("After test");
	}	
	@AfterMethod
	public void AM()	{
		System.out.println("After Method");
	}	
	@Test(priority=2,dependsOnMethods="TC3")
	public void TC1()	{
		System.out.println("Test Case -1");
	}	
	@Test(priority=4)
	public void TC2()	{
		System.out.println("Test Case -2");
	}		
	@Test(priority=1)
	public void TC3()	{
		System.out.println("Test Case -3");
		Assert.assertTrue(false);
	}	
	@Test(priority=3,enabled=false)
	public void TC4()	{
		System.out.println("Test Case -4");
	}
}
