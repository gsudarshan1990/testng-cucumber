package dataproviderexample;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderexample {
	
	@DataProvider(name="data-provider")
	public Object[][] data_provider_function()
	{
		return new Object[][] {{"data one"},{"data-two"}};
	}
	
	@Test(dataProvider="data-provider")
	public void test_Case(String data)
	{
	
		System.out.println("Data:"+data);
	}

}
