package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Addcartpage;
import page.Cartremovepage;
import page.Loginpage;
import page.Mouseoverpage;
import page.Registrationpage;
import page.Scrollingpage;
import page.Searchingstorepage;
import page.Titleverification;
import page.Windowhandlepage;
import page.Dropdwnchangepage;
import page.Screenshotpage;

public class Testingall {
WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demo.nopcommerce.com");
	}
	@Test(priority=1)
	public void test1() throws Exception 
	{
		Titleverification ob1=new Titleverification(driver);
		ob1.verification();
		
		Registrationpage ob2=new Registrationpage(driver);
	    ob2.registervalues("Aathir", "aathi","aathir@gmail.com", "aathi123", "aathi123");
	}
	@Test(priority=2)
	    
	    public void test2()
	    {
		
		
		Loginpage ob3=new Loginpage(driver);
		ob3.loginvalues("aathir@gmail.com", "aathi123");

		Searchingstorepage ob4=new Searchingstorepage(driver);
		ob4.searchvalues("books");
		ob4.srchclck();
	   }
	
	@Test(priority=3)
	
	public void test3()throws Exception
	{
	
		Addcartpage ob5=new Addcartpage(driver);
		ob5.adding();
		
		Mouseoverpage ob6=new Mouseoverpage(driver);
		ob6.moving();
		
		Scrollingpage ob7=new Scrollingpage(driver);
		ob7.scrolling();
		
		Windowhandlepage ob8=new Windowhandlepage(driver);
	    ob8.details();
	    
	    Cartremovepage ob9=new Cartremovepage(driver);
	    ob9.remove();
	} 
	    
	   @Test(priority=4)
	   public void test4()throws Exception
	   {
	   
	    Dropdwnchangepage ob10=new Dropdwnchangepage(driver);
	    ob10.change();
	    
	    Screenshotpage ob11=new Screenshotpage(driver);
	    ob11.taking();
	    
		
	}
	 
	    
}
		


