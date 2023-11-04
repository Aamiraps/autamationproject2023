package page;

import org.openqa.selenium.WebDriver;


public class Titleverification {
	WebDriver driver;
	public Titleverification(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verification()
	{
	

	String title=driver.getTitle();
	System.out.println(title);
	if(title.equals("nopCommerce demo store"))
	{
		System.out.println("pass");
		
	}
	else
	{
		System.out.println("fail");
	}
	}

}
