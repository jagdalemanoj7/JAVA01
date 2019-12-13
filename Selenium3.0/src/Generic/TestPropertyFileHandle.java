package Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class TestPropertyFileHandle {

	public static void main(String[] args) 
	{
		String path="../Selenium3.0/src/Generic/actitime.properties";
		
		//Propertyfilehandle p = new Propertyfilehandle();		
		String str = Propertyfilehandle.readData(path,"keyword");
		//System.out.println(str);
	}

}