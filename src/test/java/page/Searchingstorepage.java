package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Searchingstorepage {
	WebDriver driver;
	By Ssrchstr=By.xpath("//*[@id=\"small-searchterms\"]");
	By Ssrchbtn=By.xpath("//*[@id=\"small-search-box-form\"]/button");
	By Srchclk=By.xpath("/html/body/div[6]/div[1]/div[2]/div[2]/ul/li[3]/a/span");
	By Saddcrt=By.xpath("//*[@id=\"add-to-cart-button-6\"]");
	
	public Searchingstorepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchvalues(String srch)
	{
		driver.findElement(Ssrchstr).sendKeys(srch);
		
	}
	
	public void srchclck()
	{
		driver.findElement(Srchclk).click();
		driver.findElement(Saddcrt).click();
		driver.navigate().back();
		

	}
	


}
