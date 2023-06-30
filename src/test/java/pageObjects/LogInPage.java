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
import org.openqa.selenium.WebElement;
import org.testng.Assert;import pageObjects.BasePage;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class LogInPage extends BasePage{
public LogInPage(WebDriver driver) {
super(driver);
}@FindBy(xpath="//input[@id='input-email']")
WebElement textemailaddress;

@FindBy(xpath="//input[@id='input-password']")
WebElement textemailpassword;


@FindBy(xpath="//button[normalize-space()='Login']")
WebElement login1;

public void  emailAddress(String email) {
textemailaddress.sendKeys(email);

}

public void passwordAddress(String password) {
textemailpassword.sendKeys(password);
}
public void loginClick() {
	
	
	login1.click();
}
}
