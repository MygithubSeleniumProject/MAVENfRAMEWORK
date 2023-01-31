package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUtility {
	
	private Properties property;
	/*
	 * this  method is used to initialize properties file
	 * @param path
	 * 
	 */
public void propertiesInitialization(String path)
{
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(path);
	}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	 property = new Properties();
	try
	{
		property.load(fis);
	}
	catch(IOException e) 
	{
		e.printStackTrace();
	}
}
/*
 * this method is used to fetch the data from properties file
 * @param key
 * @return
 */
public String fecthProperty(String Key)
    {
	return property.getProperty(Key);
	}
}
