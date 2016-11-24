package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import factory.Browserfactory;
import factory.Dataproviderfactory;
import pages.loginpage;

public class gmaillogin 
{
	WebDriver driver;
	ExtentReports report;
	ExtentTest logger;
	

	@Test
	public void setUp()
	{
		report = new ExtentReports("C:\\Framework_workspace\\com.spandu.kiran\\Reports\\gmaillogin.html",true);
		logger = new ExtentTest("verify gmail login", "this page verifys gmail login for kiran");
		
		WebDriver driver = Browserfactory.getBrowser("firefox");
		driver.get(Dataproviderfactory.getConfig().getApplicationurl());
		logger.log(LogStatus.INFO,"Application up and running");
        loginpage glogin = PageFactory.initElements(driver, loginpage.class);
		
		glogin.logingmail(Dataproviderfactory.getConfig().getUserid(),Dataproviderfactory.getConfig().getPassword());
		report.endTest(logger);
		report.flush();
		
	}
	

	
	
	
	
	

}
