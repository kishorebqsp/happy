package Scripts;

import org.testng.annotations.Test;

import Generic.Basetest;
import Generic.Excel;
import Pom.Login;

public class Testcase2 extends Basetest{
	@Test
	public void tcc2()
	{
	  String usname = Excel.getCellV(PATH,"invalidusername",1,0);
	   String pwdname = Excel.getCellV(PATH,"invalidusername", 1,1);
	  String at = Excel.getCellV(PATH,"invalidusername", 1,2);
		
		Login l=new Login(driver);
		l.username(usname);
		l.password(pwdname);
		l.login1();
		l.verifyelement(at);
	}
	

}
