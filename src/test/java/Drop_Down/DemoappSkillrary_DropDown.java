package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoappSkillrary_DropDown {

	public static void main(String[] args) throws Throwable {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/ ");
		
		WebElement opt= driver.findElement(By.id("cars"));
		Select s= new Select(opt);
		
		s.selectByIndex(1);
		Thread.sleep(3000);
		
		s.selectByVisibleText("INR 100 - INR 199 ( 1 ) ");
		Thread.sleep(3000);
		
		s.selectByValue("199");
		Thread.sleep(3000);
		
		List<WebElement> ele = s.getAllSelectedOptions();
		for(WebElement ele1:ele)
		{
			System.out.println(ele1.getText());
			
		}
		Thread.sleep(3000);
		driver.close();
		
		
		
		

	}

}
