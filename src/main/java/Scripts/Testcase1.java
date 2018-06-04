package Scripts;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.Excel;
import Generic.Propertyfile;
import Pom.Homepage;
import Pom.Login;

public class Testcase1 extends Basetest{
	@Test
	public void tcc1 () throws InterruptedException
	
	{
//		String us = Excel.getCellV(PATH, "validusername",1,0);
//		String pwd = Excel.getCellV(PATH,"validusername",1, 1);
		String p = Propertyfile.Propertiesfile(Filepath,"username");
		String pp=Propertyfile.Propertiesfile(Filepath,"password");
		 String title=Excel.getCellV(PATH, "validusername",1,2);
		
		         
		
		Login l=new Login(driver);
		l.username(p);
		l.password(pp);
		l.login1();
		Thread.sleep(2000);
		Homepage h=new Homepage(driver);
		h.verifytitle(title);
        Thread.sleep(2000);
	    h.logout();
		
	
		
	}

}

























































