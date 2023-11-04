package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Dropdwnchangepage {
	
	WebDriver driver;
	
	By drop=By.xpath("//*[@id=\"customerCurrency\"]");
	
	public Dropdwnchangepage(WebDriver driver)
	{
		this.driver=driver;
	}
			
	public void change()
	{
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement mdollr=driver.findElement(drop);
	Select e=new Select(mdollr);
	e.selectByVisibleText("Euro");
	
	WebElement meuro =driver.findElement(drop);
	Select d=new Select(meuro);
	d.selectByVisibleText("US Dollar");
	
	}
			
}
