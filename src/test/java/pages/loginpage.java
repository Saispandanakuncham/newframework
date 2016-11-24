package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage
{

	WebDriver driver;
	
	public loginpage(WebDriver Idriver)
	{
		this.driver=Idriver;
	}
	
	@FindBy(id="Email") WebElement email;
	@FindBy(id="next") WebElement next;
	@FindBy(id="Passwd") WebElement pass;
	@FindBy(id="signIn") WebElement signin;
	 
	
	
	
	public void logingmail(String username,String password)
	{
		
	email.clear();
	email.sendKeys(username);
	next.click();
	pass.clear();
	pass.sendKeys(password);
	signin.click();
	}	
	
	
	
	
	
	
	
	
	
	
	
	
}
