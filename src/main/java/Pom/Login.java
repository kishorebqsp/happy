package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Generic.Basepage;
public class Login extends Basepage{
	//declaration
	@FindBy(id="username")
	private WebElement Usernametextbox;
	
	@FindBy(name="pwd")
	private WebElement Passwordtextbox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errormsg;
	//initalization
	public Login(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	//utilization
	public void username(String usname)
	{
		Usernametextbox.sendKeys(usname);
	}
	public void password(String pwdname)
	{
		Passwordtextbox.sendKeys(pwdname);
	}
	public void login1()
	{
		 loginbtn.click();
	}
	
	public void verifyelement(String actualtext)
	{
		String text = errormsg.getText();
		Assert.assertEquals(text, actualtext);
	
	
	
	} 
	
}
