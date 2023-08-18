package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Locators {

	public static void main(String[] args) throws Throwable {
		
	WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[type()='text']")).sendKeys("silpa");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Paul");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).click();
		Thread.sleep(2000);
		
		driver.close();		
	}

}
