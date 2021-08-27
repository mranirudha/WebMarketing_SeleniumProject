package day4Package;

import org.testng.annotations.Test;

public class ExampleFatcingDataFromDataProvider 
{
	@Test(dataProvider="Sample", dataProviderClass=ExampleDataProvider.class)
	public void ReadDataProvider (String Tool, String Type,String Vendor) 
	{
		System.out.println(Tool);
		System.out.println(Type);
		System.out.println(Vendor);
	}
}
