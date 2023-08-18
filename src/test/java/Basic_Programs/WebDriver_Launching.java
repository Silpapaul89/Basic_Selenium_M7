package Basic_Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Launching {
	
	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("www.facebook.com");
		
		System.out.println("title is "+driver.getTitle());
		
		Thread.sleep(2000);
		
		driver.close();
		

	}
	
}
