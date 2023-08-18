package Pom_Usage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.Fb_LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Fb_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		Fb_LoginPage fbLogin=new Fb_LoginPage(driver);
		fbLogin.emailTextField("silpa");
		fbLogin.passwordTextField("paul");
		
		fbLogin.loginbutton();

	}

}
