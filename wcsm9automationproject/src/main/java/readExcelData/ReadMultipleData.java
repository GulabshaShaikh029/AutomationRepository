package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadMultipleData {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//provide the path of excel sheet
		  FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		  //to make the file ready to read
		  Workbook wb = WorkbookFactory.create(fis);
		  //to get the particular sheet
		  Sheet sheet = wb.getSheet("IPL");
		  //to get the no. of rows
		  int rc = sheet.getLastRowNum();
		  for(int i=1;i<=rc;i++)
			{
			  //to provide the file path 
			FileInputStream fis1 = new FileInputStream("./src/main/resources/TestData.xlsx");
			Workbook wb1 = WorkbookFactory.create(fis1);
			//make the file ready to read
			Sheet sheet1 = wb1.getSheet("IPL");
			//to get into particular row
			Row row1 = sheet1.getRow(i);
			//to get into particular column
			Cell cell1 = row1.getCell(0);
			//to read specific data from a particular cell
			String  data = cell1.getStringCellValue();
			
			System.out.println(data);
		}
	}

}
