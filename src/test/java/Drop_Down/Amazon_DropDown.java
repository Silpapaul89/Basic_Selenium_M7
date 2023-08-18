package Drop_Down;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_DropDown {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/ ");
		
		WebElement dropDown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		
		Select s= new Select(dropDown);
		s.selectByIndex(8);
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty");
		Thread.sleep(3000);
		s.selectByVisibleText("Amazon Pharmacy");
		Thread.sleep(3000);
		System.out.println(s.isMultiple());
		
		List<WebElement> values = s.getOptions();
		
		for(WebElement b:values) {
			
			System.out.println(b.getText());
			
		}
		

	}

}
