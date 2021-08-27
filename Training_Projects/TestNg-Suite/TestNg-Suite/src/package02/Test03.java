package package02;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test03 
{
	@Test(groups="Sanity")
	public void Case1()
	{
		System.out.println("package02--case01");
	}
	
	@BeforeTest(groups="start")
	public void start2()
	{
		System.out.println("Before Test");
	}
	@Test(groups="Regression")
	public void Case2()
	{
		System.out.println("package02--case02");
	}
	@Test(groups="Regression")
	public void Case3()
	{
		System.out.println("package02--case03");
	}
	@Test(groups="Sanity")
	public void Case4()
	{
		System.out.println("package02--case04");
	}
	@Test(groups="Sanity")
	public void Case5()
	{
		System.out.println("package02--case05");
	}

}
