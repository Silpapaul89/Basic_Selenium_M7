package TestNg_Parrelle;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook_Distributed {
	

	@Test
	
	public void facebook() throws Throwable
	{

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElement(By.id("email")).sendKeys("silpa");	
	
	Thread.sleep(3000);
	
	driver.close();

}
}
