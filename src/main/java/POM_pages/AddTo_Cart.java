package POM_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddTo_Cart {
	
	@FindBy(id="add")
	
	private WebElement addbtn;
	
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	public AddTo_Cart(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public WebElement getaddbtn() {
		return addbtn;
		
	}
	public void aadtocartbtn() {
		cartbtn.click();
		
	}
}