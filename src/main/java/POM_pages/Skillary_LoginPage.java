package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillary_LoginPage {
	
	@FindBy(xpath="//a[text()=' GEARS '])")
	
	private WebElement gearsbtn;
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP '])[2]")
	
	private WebElement skillaryDemoApp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	@FindBy(xpath="//input[value='go']")
	private WebElement searchbtn;
	
	public Skillary_LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void gearsbtn() {
		gearsbtn.click();
	}
	
	public void skillaryDemoApplication() {
		skillaryDemoApp.click();
	}
	public void searchtextbox(String name) {
		searchtb.sendKeys(name);
	
	}
	public void goButton(){
	searchbtn.click();
	
	}
}
	
	
	
	
