package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//read the data from TestData.xlsx file
		//to provide file path
		FileInputStream fis = new FileInputStream("./src/main/resources/TestData.xlsx");
		//call the class workbook
		//make the file ready to read
		Workbook wb = WorkbookFactory.create(fis);
		//make the file ready to read
		//read methods 
		Sheet sheet = wb.getSheet("IPL");
		//to read the row
		Row row = sheet.getRow(3);
		//to read the coloum
		Cell cell = row.getCell(1);
		String data = cell.getStringCellValue();
		System.out.println(data);
		
		
	}

}
