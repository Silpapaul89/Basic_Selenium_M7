package TestNg;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=-3,invocationCount=2)
	 
	public void demo1() 
	{
		
		System.out.println("Hi demo1");
	}
	@Test(priority=1,invocationCount=-1)
	
	public void Demo2() 
	{
		System.out.println("Hi Demo2");
	}
	@Test(priority=-5,invocationCount=3,enabled=false)
	public void Demo3() 
	{
		System.out.println("Hi Demo3");
	}
}
