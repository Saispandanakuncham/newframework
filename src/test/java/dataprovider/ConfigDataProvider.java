package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider
{
	Properties pro;
	public ConfigDataProvider()
	{
		File src = new File(".\\Configuaration\\config.properties");
		
		try {
			FileInputStream fi = new FileInputStream(src);
			pro = new Properties();
			pro.load(fi);
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception is" +e.getMessage());
		}
		
		
	}
	
		public String getApplicationurl()
		{
			
			String url = pro.getProperty("url");
			return url;
			
			
		}
		
		public String getUserid()
		{
			String userid = pro.getProperty("userid");
			return userid;
			
		}
			
		public String getPassword()
		{
			String password = pro.getProperty("password");
			return password;
			
		}
		public String getChromepath()
		{
			String path=pro.getProperty(getChromepath());
			
			return path;
		}
		
		
		
		
		
		
		
	}
	
	


