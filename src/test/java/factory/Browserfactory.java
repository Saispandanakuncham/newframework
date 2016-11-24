package factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfactory 
{
	
	static WebDriver driver;
	public static WebDriver getBrowser(String browsername)
	{
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","C:\\Users\\Kiran\\Desktop\\Softwares\\softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browsername.equalsIgnoreCase("Chrome"))
		{
				
			System.setProperty("webdriver.chrome.driver",Dataproviderfactory.getConfig().getChromepath());
			driver = new ChromeDriver();
			
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
		

	}
	
	
	public static void closeBrowser(WebDriver Idriver)
	{
		
		Idriver.quit();
		
		
		
	}
	

}
