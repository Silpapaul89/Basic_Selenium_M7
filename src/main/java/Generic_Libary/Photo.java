package Generic_Libary;

import java.io.File;

import org.openqa.selenium.OutputType;

public class Photo {
	
	public void getPhoto(WebDriver driver,String name)throws IOException{
		
		Date d= new Date();
		
		String currentdate= d.toString().replaceAll(":","-");
		TakeScreenshot ts= (TakeScreenshot) driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dest
		
		
	}

}
