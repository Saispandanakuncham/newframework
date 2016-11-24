package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class  ExcelDataProvider {

	XSSFWorkbook wb;
	
	
	public ExcelDataProvider()
	{
		
		File src = new File("./Applicationtest Data/AppData.xslx");
		
	    try {
			FileInputStream fi = new FileInputStream(src);
			wb = new XSSFWorkbook(fi);
					
			
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Exception is"+e.getMessage());
		}
	    
	}
	    
	    
	    public String getData(int sheetIndex,int row,int column)
	    {
	    	String data = wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();
	    	return data;
	    }
	    
		
		
		
		
	}
	
	
	
	
	

