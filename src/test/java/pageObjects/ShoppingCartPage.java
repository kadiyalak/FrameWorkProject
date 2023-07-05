package pageObjects;
import org.testng.annotations.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;
//import org.testng.annotations.DataProvider;AZ                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          B N
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;import pageObjects.BasePage;
import org.testng.Assert;import pageObjects.BasePage;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;import org.openqa.selenium.Alert;
public class ShoppingCartPage extends BasePage {
	public ShoppingCartPage(WebDriver driver) {
		super(driver);
		}
	@FindBy(xpath="//button[@id='button-cart']")
	WebElement addtocart;
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	
	@FindBy(xpath="//span[normalize-space()='Shopping Cart']")
	WebElement  shopingcart;
	@FindBy(xpath="//button[normalize-space()='0 item(s) - $0.00']")
	WebElement money;
	@FindBy(xpath="//p[@class='text-center']")
	
	WebElement text;
	@FindBy(xpath="//strong[normalize-space()='View Cart']")
	
	
	WebElement viewcart;
	
	@FindBy(xpath="//span[normalize-space()='Checkout']")
	WebElement checkout;
	@FindBy(xpath="//h1[normalize-space()='Shopping Cart']")
	WebElement  shoppingcart;
	public void addtocartClick() {
	addtocart.click();
	}
	
	public String alertMessage()
	{
		return alert.getText();
	}
	
	public void shopingcartClick()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",shopingcart);	
	}
	public void moneyClick()
	{
		money.click();
	}
	public String textClick()
	{return text.getText();
	
	}
	public void viewcartClick()
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", checkout);	
	}
	public String message() {
		return shoppingcart.getText();
		
	}
}
