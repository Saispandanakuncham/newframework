package factory;

import dataprovider.ConfigDataProvider;
import dataprovider.ExcelDataProvider;

public class Dataproviderfactory 
{
	
	
	public static ConfigDataProvider getConfig()
	{
		
		ConfigDataProvider con = new ConfigDataProvider();
		return con;
		
		
	}
	
	public static ExcelDataProvider getExcel()
	{
		
		ExcelDataProvider excel = new ExcelDataProvider();
		return excel;
		
		
	}
	
	

}
