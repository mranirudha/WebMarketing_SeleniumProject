package package01;

import org.testng.annotations.Test;

public class Test01 
{
	@Test(groups="Regression",description="Case-1")
	public void Case1()
	{
		System.out.println("package01--case01");
		//Assert.assertEquals("x", "y");
	}

	@Test(groups="Sanity")
	public void Case2()
	{
		System.out.println("package01--case02");
	}
	
	
	
	
}
