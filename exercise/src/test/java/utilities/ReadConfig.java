package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig 
{
   Properties properties;
  String path="C:\\Users\\LENOVO\\eclipse-workspace\\swagprj\\Configuration\\config.properties";
 public ReadConfig() {
		
			 try {
				 FileInputStream fis = new FileInputStream(path);

				 properties=new Properties();

				properties.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 		
 }
 public String getbaseurl() {
	 String val=properties.getProperty("baseurl");
	 if (val!=null)
		 return val;
	 else
		 throw new RuntimeException("url not specified in config file");
	 
 }
public String getbrowser() {
	 String val=properties.getProperty("browser");
	 if (val!=null)
		 return val;
	 else
		 throw new RuntimeException("browser not specified in config file");
}
public String gettitle() {
	 String val=properties.getProperty("browser");
	 if (val!=null)
		 return val;
	 else
		 throw new RuntimeException("title not specified in config file");
}
 
}
