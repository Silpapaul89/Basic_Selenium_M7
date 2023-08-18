package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Double_Click {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement course= driver.findElement(By.id("COURSE"));
		
		Actions a=new Actions(driver);
		a.moveToElement(course).perform();
		
		driver.findElement(By.xpath("(//a[text()='Selenium Training')][1]")).click();
		
		WebElement plus= driver.findElement(By.xpath("//i[@class='btn btn-default btn-flat btn-lg']"));
		a.doubleClick(plus).perform();
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
