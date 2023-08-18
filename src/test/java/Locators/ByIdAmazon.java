package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ByIdAmazon {
	
	public static void main(String[] args) throws Exception {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ ");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("dress");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}

}
