package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	WebDriver driver;
	By Login=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a");
	By Lemail=By.id("Email");
	By Lpassword=By.id("Password");
	By Llogin=By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[3]/button[1]");

	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void loginvalues(String email,String passwrd)
	{	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(Login).click();
		driver.findElement(Lemail).sendKeys(email);
		driver.findElement(Lpassword).sendKeys(passwrd);
	
		driver.findElement(Llogin).click();
		driver.navigate().back();
	}
	

}
