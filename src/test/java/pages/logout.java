package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class logout
{

	WebDriver driver;
	
	public logout(WebDriver Idriver)
	{
		this.driver=Idriver;
	}
	
	@FindBy(xpath=".//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span") WebElement Kiran;
	@FindBy(xpath=".//*[@id='gb_71']") WebElement signout;

	 
	
	
	
	public void logoutk()
	{
		
	Kiran.click();
    signout.click();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
