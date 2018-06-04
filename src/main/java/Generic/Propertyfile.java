package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfile {
	
	public static String Propertiesfile(String filepath,String key)
	{
		String pf="";
		try {
		Properties p=new Properties();
	    p.load(new FileInputStream(filepath));
	    pf = p.getProperty(key);
				
		}
		catch(Exception e)
		{
			
		}
		return pf;
	}

}
