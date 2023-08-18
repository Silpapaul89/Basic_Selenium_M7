package Scrips;

import org.testng.annotations.Test;

import POM_pages.AddTo_Cart;
import POM_pages.Skillary_DemoApp;
import POM_pages.Skillary_LoginPage;

public class Testcase1 extends BaseClass{
	@Test
	
	public void tc1() {
		Skillary_LoginPage s= new Skillary_LoginPage(driver);
		s.gearsbutton();
		s.Skillary_DemoApp();
		utilies.switchingtabs(driver);
		Skillary_DemoApp sd= new Skillary_DemoApp(driver);
		utilies.mouseHover(driver, sd.getcourseTab());
		sd.seleniumTrainingtab();
		AddTo_Cart d=new AddTo_Cart(driver);
		utilies.doubleClick(driver, d.getaddbtn());
		d.carttocartbtn();
		utilies.alertPopup(driver);
	}

}
