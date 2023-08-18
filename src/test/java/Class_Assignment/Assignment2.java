package Class_Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		WebElement page= driver.findElement(By.xpath("//a[text()='Create a Page']"));
		Point coordinates =page.getLocation();
		
		System.out.println("X and Y coordinates of page textfield are below");
		System.out.println(coordinates.getX());
		System.out.println(coordinates.getY());
		
		System.out.println("Attribute :" + page.getAttribute("class"));
		System.out.println("Attribute :" + page.getTagName());

	}

}
