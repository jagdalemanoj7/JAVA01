package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class Propertyfilehandle 
{
	public static String readData(String filepath, String keyword)
	{
		Properties p = new Properties();
		try {
			p.load(new FileInputStream(filepath));
		} 
		catch (Exception e) 
		{
			
		}		
		return p.getProperty(keyword);		
	}
}