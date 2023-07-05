package testBase;
import org.testng.annotations.*;//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.time.Duration;
import java.util.List;
//import org.testng.annotations.DataProvider;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.WebElement;//import org.openqa.selenium.firefox;
import org.testng.Assert;
//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.edge.EdgeDriver;import java.io.IOException;import java.util.Date;import java.text.SimpleDateFormat;import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;import java.io.File;import org.openqa.selenium.OutputType;import org.apache.commons.io.FileUtils;
import org. apache. commons. lang3. RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
//import org.apache.poi.poifs.property.DirectoryProperty.PropertyComparator;

import java.util.ResourceBundle;
public class BaseClass {
	
	
public static	WebDriver driver;
	
public  Logger logger;
public ResourceBundle rb;
	
	@BeforeClass(groups= {"Regression","Sanity","Master"})

@Parameters("browser")
	public void setUp(String br) {
		logger= LogManager.getLogger(this.getClass());//rb=ResourceBundle.getBundle("config");
		if(br.equals("chrome")) {
			//WebDriverManager.chromedriver().setup();
			rb=ResourceBundle.getBundle("config");
			//logger=LogManager.getLogger(this.getClass());
			/*ChromeOptions options=new ChromeOptions();
			options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});*/
			driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get(rb.getString("appurl"));
			driver.manage().window().maximize();driver.manage().deleteAllCookies();//d////river.navigate().refresh();
			}
		
			else if(br.equals("edge")) {
				//WebDriverManager.edgedriver().setup();
				//logger=LogManager.getLogger(this.getClass());
				
				
				rb=ResourceBundle.getBundle("config");
				EdgeOptions options1=new EdgeOptions();
				options1.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
				driver=new EdgeDriver(options1);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(rb.getString("appurl"));
				driver.manage().window().maximize();driver.manage().deleteAllCookies();
				}
			
			
			else {
				//WebDriverManager.firefoxdriver().setup();
				//ChromeOptions options=new ChromeOptions();
				//options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});

				driver=new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.get(rb.getString("appurl"));
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
		
			}
		
		
		
		
		
		
		
		
		
		
		/*logger=LogManager.getLogger(this.getClass());
		//WebDriverManager.chromedriver().setup();
ChromeOptions options=new ChromeOptions();
options.setExperimentalOption("excludeSwitches",new String[] {"enable-automation"});
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().deleteAllCookies();
		driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();*/
			
	
	}
		//@AfterClass	
/*public void tearDown()(groups= {"Sanity","Master"}) {
	driver.close();


	}*/public  String randomString() {
		
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
		
	}
		
		public String randomNumeric()
		{
			String generatedString=RandomStringUtils.randomNumeric(10);
		
		return(generatedString); 
		
		}
		
		public String randomAlphNumeric()
		{
			String gSt=RandomStringUtils.randomAlphabetic(5);
		String num=RandomStringUtils.randomNumeric(10);
		return(gSt+num);
		}
		
		public String captureScreen(String tname) throws IOException{
		
		//SimpleDateFormat DF==new SimpleDateFormat();Date dt=new Date();String timestamp=df.format(df);
		String timestamp=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesscreenshot=(TakesScreenshot) driver;
		File source=takesscreenshot.getScreenshotAs(OutputType.FILE);
		String destination=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timestamp + ".png";	
		try {FileUtils.copyFile(source,new File(destination));
		}catch(Exception e) {e.getMessage();
		}return destination;}}