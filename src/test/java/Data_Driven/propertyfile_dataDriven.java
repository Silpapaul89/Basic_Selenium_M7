package Data_Driven;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class propertyfile_dataDriven {

	public static void main(String [] args) throws Throwable{
		
		Properties p= new Properties();
		//Basic_Selenium_M7/src/test/resources/Data.properties
		FileInputStream fis= new FileInputStream("./src/test/resources/Data.properties");
		p.load(fis);
		
		String Url = p.getProperty("url");
				
		String brow= p.getProperty("browser");
				
		WebDriver driver;
		if(brow.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(Url);
		

	}

}
