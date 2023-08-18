package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_LoginPage {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailTf;
	
	@FindBy(xpath="//input[@name='pass']")
	private WebElement PasswordTf;
	
	@FindBy(xpath="//button[@id=u_0_9_U7")
	private WebElement loginBtn;
	
	
	public Fb_LoginPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getEmailTf() {
		return emailTf;
	}
	
	public void setEmailTf(WebElement emailTf) {
		this.emailTf = emailTf;
	}
	public WebElement getPasswordTf() {
		return PasswordTf;
	}
	public void setPasswordTf(WebElement passwordTf) {
		PasswordTf = passwordTf;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public void setLoginBtn(WebElement loginBtn) {
		this.loginBtn = loginBtn;
	}
	
	public void emailTextField(String data) {
		emailTf.sendKeys(data);
	}

	public void passwordTextField(String data) {
		PasswordTf.sendKeys(data);
	}
	
	public void loginbutton() {
		loginBtn.click();
		
	}
}
