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
import org.openqa.selenium.firefox.FirefoxDriver;
public class SearchPage extends BasePage{
	public SearchPage(WebDriver driver) {
		super(driver);
		}

@FindBy(xpath="//button[@class='navbar-toggler']")
WebElement button;
@FindBy(xpath="//a[normalize-space()='Desktops']")

WebElement desktop;
@FindBy(xpath="//a[normalize-space()='Mac (1)']")
WebElement mac1;


@FindBy(xpath="//a[normalize-space()='iMac']")
WebElement mac;
public void buttonClick() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", button);
}
public void desktopClick()
{
	desktop.click();
}
public void macClick() {
JavascriptExecutor js = (JavascriptExecutor)driver;
js.executeScript("arguments[0].click();", mac1);
}
public void mac1Click()
{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", mac);	
}

}
