package WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Verification_Type {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		
		if(email.isDisplayed()) {
			email.sendKeys("Silpa");	
		}else {
			
			System.out.println("Element is not dispalyed");
		}
			WebElement login= driver.findElement(By.xpath("//button[@type='submit']"));
		
			
			if(login.isEnabled()) {
				login.click();
			}else {
				System.out.println("Button is enabled");
			}
		}
		
		

	}


