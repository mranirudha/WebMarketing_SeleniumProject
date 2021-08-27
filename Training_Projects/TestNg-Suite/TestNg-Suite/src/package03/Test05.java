package package03;



import org.testng.Assert;
import org.testng.annotations.Test;

public class Test05 
{
	@Test(groups="Sanity")
	public void Case1()
	{
		System.out.println("package03--case01");
	}
	@Test(groups="Regression")
	public void Case2()
	{
		System.out.println("package03--case02");
		//Assert.assertEquals("a", "b");
	}
	@Test(groups="Regression")
	public void Case3()
	{
		System.out.println("package03--case03");
	}
	@Test(groups="Sanity")
	public void Case4()
	{
		System.out.println("package03--case04");
	}
	@Test(groups="Sanity")
	public void Case5()
	{
		System.out.println("package03--case05");
	}

}
