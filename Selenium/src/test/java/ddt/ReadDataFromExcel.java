package ddt;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.RichTextString;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Throwable {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\ReadDataExcel.xlsx");
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		Row row = sheet.getRow(3);
		
	    Cell cell = row.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();	
		
		System.out.println(stringCellValue);
		
		//wb.close();
		
	    String stringCellValue2 = wb.getSheet("Sheet1").getRow(3).getCell(2).getStringCellValue();
	    System.out.println(stringCellValue2);
	}

}
