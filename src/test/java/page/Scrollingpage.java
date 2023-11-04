package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Scrollingpage {
	
	WebDriver driver;
	
	public Scrollingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void scrolling()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
		js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[1]/a")));
		driver.findElement(By.xpath("/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[1]/a")).click();

	}
}
