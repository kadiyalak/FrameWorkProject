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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;import pageObjects.MyAccountPage;
import testBase.BaseClass;
import pageObjects.SearchPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;import pageObjects.ShoppingCartPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AccountRegistrationPage;import pageObjects.BasePage;import org.apache.logging.log4j.Logger; 
public class TC_004_AddToCartTest extends BaseClass {
	@Test(groups= {"Regression"})
	public void shop_cart(){
		//y {
		
		logger.info("*****started TC_003_searchtest*****");
		SearchPage sp=new SearchPage(driver);
		
		sp.buttonClick();
	sp.macClick();
	sp.desktopClick();sp.mac1Click();logger.info("*****finished TC_003_searchtest*****");
	
	ShoppingCartPage scp=new ShoppingCartPage(driver);
	scp.addtocartClick();
String output1=scp.alertMessage();
	/*Alert alertwindow=driver.switchTo().alert();
	String output=alertwindow.getText();
	alertwindow.accept();S*/System.out.println(output1);
	String exp_output="Success: You have added iMac to your shopping cart!";
	if(output1.equals(exp_output))
	{
	System.out.println("test is passed");
	}
	else
	{
		System.out.println("test is failed");
	}
	scp.shopingcartClick();scp.moneyClick();String output2=scp.textClick();System.out.println(output2);
	String expoutput="Your shopping cart is empty!";Assert.assertEquals(output2,expoutput);
	scp.viewcartClick();String output =scp.message();String expectedoutput="Shopping Cart";System.out.println(output);
Assert.assertEquals(output, expectedoutput);	}
}
