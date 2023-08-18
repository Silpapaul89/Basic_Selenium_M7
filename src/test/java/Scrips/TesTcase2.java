package Scrips;

import org.testng.annotations.Test;

import POM_pages.Skillary_DemoApp;
import POM_pages.Skillary_LoginPage;

public class TesTcase2 extends Baseclass{
	
	@Test
	public void tc2() {
	Skillary_LoginPage s= new Skillary_LoginPage(driver);
	s.gearsbutton();
	s.Skillary_DemoApp();
	utilies.switchingtabs(driver);
	Skillary_DemoApp sd= new Skillary_DemoApp(driver);
	utilies.dropDown(sd.getcoursedd(), pdata.getPropertydata("courseadd"));
	TestingPage tp=new TestingPage(driver);
	utilies.dragdrop(driver,tp.getSeleniumtraining(),tp.getCartTab());
		
		
		
	}
}
	
	


