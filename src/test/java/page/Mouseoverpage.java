package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Mouseoverpage {
	WebDriver driver;
	
public Mouseoverpage(WebDriver driver)
{
	this.driver=driver;
}
public void moving()throws Exception
	
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement drr=driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
		Actions tca=new Actions(driver);
		tca.moveToElement(drr);
		tca.perform();
		
		driver.findElement(By.xpath("//*[@id='flyout-cart']/div/div[4]/button")).click();
		
		
	}

}