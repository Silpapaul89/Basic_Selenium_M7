package TestNg_group;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class sample1 {
	
	
	@Test(groups="smoke")
	
	public void demo1() {
		
		System.out.println("Hi Demo1");
	}
	@Test
	public void demo2() {
		System.out.println("Hi Demo2");
	}

}
