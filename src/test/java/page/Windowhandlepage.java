package page;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Windowhandlepage {
	
	WebDriver driver;
	
	public Windowhandlepage(WebDriver driver)
	
	{
		this.driver=driver;
	}
	
	public void details()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	String parentWindow=driver.getWindowHandle();
	System.out.println("parent window Title"+driver.getTitle());
	driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[2]/div[2]/ul/li[3]/a")).click();
	Set <String> allwindowhandles=driver.getWindowHandles();
	for(String handle:allwindowhandles)
	{
		System.out.println(handle);
		
	
	if(!handle.equalsIgnoreCase(parentWindow))
		driver.switchTo().window(handle);
	
	  driver.navigate().back();
	  driver.navigate().back();
	  
	  
	}
	
	}
}
