package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Registrationpage {
	WebDriver driver;
	By Register=By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a");
	By Rgender=By.xpath("//*[@id=\"gender\"]/span[2]/label");	
	By Rfirstname=By.xpath("/html[1]/body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[2]/input[1]");
	By Rlastname=By.xpath("//*[@id=\"LastName\"]");
	By Rday=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]");
	By Rmonth=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[2]");
	By Ryear=By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]");
	By Remail=By.id("Email");
	By Rpassword=By.id("Password");
	By Rconfirm=By.xpath("//*[@id=\"ConfirmPassword\"]");
	By Rregister=By.xpath("//*[@id=\"register-button\"]");
	
	
	public Registrationpage(WebDriver driver)
	{
		this.driver=driver;
	}
 
	public void registervalues(String fname,String lname,String email,String pwd,String confrm)throws Exception
	{	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(Register).click();
		driver.findElement(Rgender).click();

		driver.findElement(Rfirstname).sendKeys(fname);
		driver.findElement(Rlastname).sendKeys(lname);
		driver.findElement(Remail).sendKeys(email);
		driver.findElement(Rpassword).sendKeys(pwd);
		driver.findElement(Rconfirm).sendKeys(confrm);	
		
	
		WebElement dayelement=driver.findElement(Rday);
		Select day=new Select(dayelement);
		day.selectByValue("23");
		
		WebElement Month=driver.findElement(Rmonth);
		Select M=new Select(Month);
		M.selectByIndex(7);
		
		WebElement year=driver.findElement(Ryear);
		Select y=new Select(year);
		y.selectByVisibleText("2002");
		
		driver.findElement(Register).click();
		
		driver.findElement(Rregister).click();
		driver.navigate().back();
		

	}

}
