package shopper.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login 
{
	@FindBy(id="Email")
	private WebElement email;

	@FindBy(name="Password")
	private WebElement psw;

	@FindBy(xpath="//span[text()='Login']")
	private WebElement lgn;

public login(WebDriver driver)
{
PageFactory.initElements(driver,this);	
}
public WebElement Enteremail()
{
	return email;
}
public WebElement Enterpsw()
{
	return psw;
}
public WebElement clklog()
{
	return lgn;
}
}


