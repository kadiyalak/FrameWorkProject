package pageObjects;
import org.testng.annotations.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;
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
public class MyAccountPage extends BasePage{
	public MyAccountPage(WebDriver driver) {
		super(driver);}
	
	@FindBy(xpath="//h2[normalize-space()='My Account']")
	WebElement msgheading;
	
	public Boolean isMyAccountPageExists() {
	try
	{
	return	(msgheading.isDisplayed());
	}
	catch(Exception e)
	{
		return(false);
	}
}
}