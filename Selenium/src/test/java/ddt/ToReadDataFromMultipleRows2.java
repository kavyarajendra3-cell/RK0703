package ddt;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromMultipleRows2 {

	public static void main(String[] args) throws Throwable, Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\ReadDataExcel.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet3");
		
		int lastRowNum = sheet.getLastRowNum();
		
		for (int i = 1; i <=lastRowNum; i++) {
		String Name = sheet.getRow(i).getCell(0).getStringCellValue();
		String Value = sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(Name+":"+Value);
	  }
        
	}

}
