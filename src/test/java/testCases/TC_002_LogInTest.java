package testCases;
import pageObjects.HomePage;import org.testng.annotations.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;import pageObjects.LogInPage;
import java.util.List;import pageObjects.AccountRegistrationPage;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;import pageObjects.MyAccountPage;
import testBase.BaseClass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AccountRegistrationPage;import pageObjects.BasePage;import org.apache.logging.log4j.Logger; 
public class TC_002_LogInTest extends BaseClass{
	@Test(groups= {"Sanity","Master"})
	public void test_login(){
		//y {
		
		logger.info("*****started TC_002_logintest******");
	
	HomePage hp=new HomePage(driver);
	hp.myAccountClick();
	
	logger.info("clicked on my account");
	hp.logInClick();
	LogInPage lp=new LogInPage(driver);
	logger.info("providing login details");
	lp.emailAddress(rb.getString("email"));lp.passwordAddress(rb.getString("password"));lp.loginClick();
	
	logger.info("clicked on login button");
	/*AccountPage mcp=new MyAccountPage(driver);
Vlean targetpage=	mcp.isMyAccountPageExists();	
	Assert.assertEquals(targetpage, true,"Invalid login data");
		}
		catch(Exception e)
		{
			Assert.fail();
		}*/
logger.info("******Finished TC_002_logintest*****");
}
}