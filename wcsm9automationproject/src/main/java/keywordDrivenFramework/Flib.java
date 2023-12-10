package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {

	//it is used to store generic reusable methods and all the generic reusable methods are non static
	public String readExelData(String excelPath,String sheetName,int rowCount,int cellCount) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet(sheetName);
		Row row = sheet.getRow(rowCount);
		Cell cell = row.getCell(cellCount);//local variable
		//String data = cell.getStringCellValue();
		//return data;// to read only string value
		String data= null;//to read string as well as numerical value
		if(cell.getCellType()==cell.getCellType().STRING)
		{
			data = cell.getStringCellValue();
		}
		else if(cell.getCellType()==cell.getCellType().NUMERIC)
		{
			data= cell.getStringCellValue().valueOf(cell.getNumericCellValue());//value of double
		}
		return data;
	}
	
		
	public void writeExcelData(String excelPath,String sheetName,int rowCount,int cellCount,String data) throws EncryptedDocumentException, IOException {
			
			FileInputStream fis = new FileInputStream(excelPath);//provide the path of excel path
			Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
			Sheet sheet = wb.getSheet(sheetName);//get into the sheet
			Row row = sheet.createRow(rowCount);//get into the desired row
			Cell cell = row.createCell(cellCount);//create the desired cell
			cell.setCellValue(data);//enter the data into created cell
			
			FileOutputStream fos = new FileOutputStream(excelPath);//provide the path of excel file
			wb.write(fos);//write the data in excel file
			
	}
	
	
    public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of excel path
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//get into the sheet
		int rc = sheet.getLastRowNum();//get the no. of rows present in the sheet
		return rc;//to switch the control from called method to calling method
    }
    
    public String readDataFromProperty(String propPath,String key) throws IOException {
    
      
    	FileInputStream fis = new FileInputStream(propPath);
    	Properties prop = new Properties();
    	prop.load(fis);
    	String data = prop.getProperty(key);
    	return  data;
   
	   
   }
}
