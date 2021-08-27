package packageParallel;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Parallel01 extends OpenCloseBrowserWithParameter

{
	
	@Test()
	public void TC_Google()
	{
		url="http://google.com";
		driver.get(url);
		System.out.println(driver.getTitle());
	}

}
