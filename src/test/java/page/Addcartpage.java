package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Addcartpage {
	WebDriver driver;
	
	By Cmptrclck=By.xpath("/html[1]/body[1]/div[6]/div[2]/ul[1]/li[1]/a[1]");
	By Cdesk=By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]");
	By Cpdct2=By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[2]/div/div[2]/div[3]/div[2]/button[1]");
	
	public Addcartpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void adding()throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(Cmptrclck).click();
		driver.findElement(Cdesk).click();
		driver.findElement(Cpdct2).click();
		driver.navigate().back();
		driver.navigate().back();
		
	}

}
