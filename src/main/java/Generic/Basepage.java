package Generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.net.EphemeralPortRangeDetector;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage extends Basetest {
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifyelement(WebElement elements)
	{
		try {
			WebDriverWait wait=new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
			Reporter.log("element is found",true);
			
		}
		catch(Exception e)
		{
			Reporter.log("element is not found",true);
			Assert.fail();
		}
	}
		
		public void verifytitle(String title)
		{
			try
			{
				WebDriverWait wait=new WebDriverWait(driver,10);
				wait.until(ExpectedConditions.titleContains(title));
				Reporter.log("title is matching",true);
			}
			catch(Exception e)
			{
				Reporter.log("title is not matching",true);
				Assert.fail();
			}
			
		}
	}


