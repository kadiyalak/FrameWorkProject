package testCases;
import pageObjects.HomePage;import org.testng.annotations.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;import pageObjects.AccountRegistrationPage;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import testBase.BaseClass;import pageObjects.AccountRegistrationPage;import pageObjects.BasePage;import org.apache.logging.log4j.Logger;
public class TC_001_TestCaseRegistration extends BaseClass{

	@Test (groups= {"Regression","Master"})
public void test_account_Registration()throws InterruptedException{
	//logger=Logger.getLogger(TC_001_TestCaseRegistration.class.getName());
	logger.debug("application logs.......");
logger.info("***Starting Tc_001_AccountRegistrationTest***");
///*try {
HomePage hp=new HomePage(driver) ;
Thread.sleep(1000);

logger.info("clicked on my account link");
hp.myAccountClick();

logger.info("clicked on registerlink");
hp.register();
AccountRegistrationPage arp=new AccountRegistrationPage(driver);
logger.info("providing customer data");
arp.fname(randomString().toUpperCase());

arp.lname(randomString().toUpperCase());
arp.mail(randomString()+"@gmail.com");
arp.pwd(randomAlphNumeric());Thread.sleep(1000);
arp.rd_click();
arp.confirm();arp.submit();

logger.info("clicked on continue");logger.error(" message");
//arp.getMessage();


//Assert.assertEquals(driver.getTitle(),"Register Account")	;
//}

/*catch(Exception e)
{logger.error("test fail");
	Assert.fail();
}*/logger.info("***finish Tc_001_AccountRegistrationTest***");
}
}