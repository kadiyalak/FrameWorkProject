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
import pageObjects.SearchPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AccountRegistrationPage;import pageObjects.BasePage;import org.apache.logging.log4j.Logger; 
public class TC_003_Search extends BaseClass{
	@Test(groups= {"Sanity"})
	public void test_search(){
		//y {
		
		logger.info("*****started TC_003_searchtest*****");
		SearchPage sp=new SearchPage(driver);
		
		sp.buttonClick();
	sp.macClick();
	sp.desktopClick();sp.mac1Click();}
}
	