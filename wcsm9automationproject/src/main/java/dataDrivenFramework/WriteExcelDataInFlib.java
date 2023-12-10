package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelDataInFlib {
	public void writeExcelData(String excelPath,String sheetName,int rowNo,int cellNo,String data) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of excel path
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//get into the sheet
		Row row = sheet.getRow(rowNo);//get into the desired row
		Cell cell = row.getCell(cellNo);//create the desired cell
		cell.setCellValue(data);//enter the data into created cell
		
		FileOutputStream fos = new FileOutputStream(excelPath);//provide the path of excel file
		wb.write(fos);//write the data in excel file

}
	
	public int rowCount(String excelPath,String sheetName) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream(excelPath);//provide the path of excel path
		Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
		Sheet sheet = wb.getSheet(sheetName);//get into the sheet
		int rc = sheet.getLastRowNum();//get the no. of rows present in the sheet
		return rc;
		
		
	}
}