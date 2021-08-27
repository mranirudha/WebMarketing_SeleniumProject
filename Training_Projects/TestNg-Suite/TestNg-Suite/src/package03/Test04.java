package package03;


import org.testng.annotations.Test;

public class Test04 
{
	@Test(groups="Regression")
	public void Case1()
	{
		System.out.println("package03--case01");
	}

	@Test(groups="Sanity")
	public void Case2()
	{
		System.out.println("package03--case02");
	}
}
