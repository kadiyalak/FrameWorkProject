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
public class AccountRegistrationPage extends BasePage{

	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
@FindBy(xpath="//input[@id='input-firstname']")
WebElement firstname;



@FindBy(xpath="//input[@id='input-lastname']")
WebElement lastname;
@FindBy(xpath="//input[@id='input-email']")
WebElement email;
@FindBy(xpath="//input[@id='input-password']")

WebElement password;

@FindBy(xpath="(//input[@id='input-newsletter-yes'])[1]")

WebElement radioButton;


@FindBy(xpath="//input[@name='agree']")
WebElement agree;
@FindBy(xpath="//button[normalize-space()='Continue']")
WebElement continueclick;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
WebElement msgconfirmation;
public void fname(String fname)

{
firstname.sendKeys(fname);driver.navigate().refresh();firstname.sendKeys(fname);




}
public void lname(String lname) {
lastname.sendKeys(lname);
}

public void mail(String mail)
{email.sendKeys(mail);
	
}

public void pwd(String pwd)
{
	password.sendKeys(pwd);
}

public void rd_click() {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", radioButton);
}

public void confirm()
{

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", agree);

}


public void submit()

{
	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("arguments[0].click();", continueclick);
}
public String getMessage( ) {
	
	
	//try
	//{
		
	
	return(msgconfirmation.getText());
	//}
	/*catch(Exception e)
	{
		return(e.getMessage());
	}*/
	
}

}

