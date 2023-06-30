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
public class HomePage extends BasePage{

	public HomePage(WebDriver driver) {
		super(driver);
		}
@FindBy(xpath="//span[normalize-space()='My Account']")
WebElement myaccount;
@FindBy(xpath="//a[normalize-space()='Register']")

WebElement register;
@FindBy(xpath="//a[normalize-space()='Login']")
WebElement login;

public void myAccountClick()
{
	
	myaccount.click();
}
public void register() {JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", register);
}

public void logInClick()
{
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", login);
}}