package Scripts;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.Excel;
import Pom.Homepage;
import Pom.Login;

public class Testcase3 extends Basetest{
	
	@Test
	public void test3()
	{
		
		String us = Excel.getCellV(PATH,"Sheet2", 1, 0);
	    String pwd = Excel.getCellV(PATH, "Sheet2",1, 1);
	    String tt = Excel.getCellV(PATH, "Sheet2",1,2);
	 
		Login l=new Login(driver);
		l.username(us);
		l.password(pwd);
		l.login1();
		
		Homepage h=new Homepage(driver);
		h.help();
		h.about();
		h.verifytitle(tt);
		h.close();
		h.logout();
		
		
	}

}
