package shopper.basictest;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.relevantcodes.extentreports.model.Log;

import shopper.pageobjects.login;

public class Baseclass implements Frameworkconstants
{
public WebDriver driver;
Properties pro;
FileInputStream fis;
login Lp;

@BeforeClass
public void openBrowser() throws  Exception 
{
	pro=new Properties();
	fis = new FileInputStream(Property_path);
	pro.load(fis);
	System.setProperty(Chrome_key,Chrome_Value);
	driver=new ChromeDriver();
	driver.get(pro.getProperty("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}
@BeforeMethod
public void loginpage()
{
Lp=new login(driver);
Lp.Enteremail().sendKeys("sushmaraju2413@gmail.com");
Lp.Enterpsw().sendKeys("Sushmaraju2413@");
Lp.clklog().click();

}
}
