package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_Provider {
	
	@DataProvider
	
	public Object[][] getData(){
		
		Object [][] a= new Object[3][2];
		a[0][0]="ugitit";
		a[0][1]="jhsahcuhc";
		
		a[1][0]="112233";
		a[1][1]="SD099";
		
		a[2][0]="AS22222222##";
		a[2][1]="fgehhrh";
		
		return a;
	}
	@Test(dataProvider="getData")
	
	public void demo(String username,String pwd) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		
		driver.findElement(By.name("login")).click();
		
	}
	
	
	

}
