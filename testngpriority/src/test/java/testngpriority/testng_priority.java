package testngpriority;

import org.testng.annotations.Test;

public class testng_priority {
	
	@Test(priority=0)
	public void first_function()
	{
		System.out.println("This is the first function");
	}
	
	@Test(priority=5)
	public void second_function()
	{
		System.out.println("This is the Second function");

	}

	@Test(priority=3,invocationCount=5)
	public void third_function()
	{
		System.out.println("This is the third function");
	}
	
	@Test(priority=1,enabled=false)
	public void fourth_function()
	{
		System.out.println("This is the fourth function");
	}
	
	
}
