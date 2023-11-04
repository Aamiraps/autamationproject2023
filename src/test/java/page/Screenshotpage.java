package page;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshotpage {
	WebDriver driver;
	
	public Screenshotpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void taking() throws Exception  
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./Screenshot//firstpage"));
		
		driver.quit();
	}


}
