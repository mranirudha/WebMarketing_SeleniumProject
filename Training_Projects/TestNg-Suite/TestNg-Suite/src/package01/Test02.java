package package01;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Test02 
{

	@Test(groups="Regression")
	public void Case1()
	{
		System.out.println("packae0g1--case01==regress");
	}
	
	
	@Test(groups="Regression")
	public void Case2()
	{
		System.out.println("package01--case02==reg");
	}
	
	@Test(groups="Sanity")
	public void Case3()
	{
		System.out.println("package01--case03==sanity");
	}
}
