package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cartremovepage {
	WebDriver driver;
	
	By shop=By.xpath("//*[@id=\"topcartlink\"]/a/span[1]");
	By Rpdt2=By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[1]/td[7]/button");
	By Rpdt1=By.xpath("//*[@id=\"shopping-cart-form\"]/div[1]/table/tbody/tr[2]/td[7]/button");
	
	public Cartremovepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void remove()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(shop).click();
		driver.findElement(Rpdt1).click();
		driver.findElement(Rpdt2).click();
		
		
	}

}
