package TestNg_group;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class sample2 {
	
	@Test
	
		public void demo3() {
		
		System.out.println("Hi Demo3");
		
	}
	
	@Test(groups="smoke")
	 
	public void demo4() {
		System.out.println("Hi Demo4");
	}

}
