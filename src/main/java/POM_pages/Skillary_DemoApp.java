package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillary_DemoApp {
	
	@FindBy(id="COURSE")
	private WebElement courseTab;
	
	@FindBy(name="addresstype")
	private WebElement coursedd;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumTraining;
	
	public Skillary_DemoApp(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getcoursedd() {
		return coursedd;
		
	}
	public WebElement getcourseTab() {
		return courseTab;
	}
	public void seleniumTrainingtab() {
		seleniumTraining.click();
		
	}
		
	
	

}
