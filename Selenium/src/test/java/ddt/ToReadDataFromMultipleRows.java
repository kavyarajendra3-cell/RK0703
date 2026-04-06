package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToReadDataFromMultipleRows {

	public static void main(String[] args) throws Throwable {
		
	FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\ReadDataExcel.xlsx");
	
	Workbook workbook = WorkbookFactory.create(fis);
	
	Sheet sheet = workbook.getSheet("Sheet2");
	
	int lastRowNum = sheet.getLastRowNum();
	
	for (int i = 1; i <=lastRowNum; i++) {
		String Company = sheet.getRow(i).getCell(0).getStringCellValue();
		String Brand = sheet.getRow(i).getCell(1).getStringCellValue();
		System.out.println(Company+"==="+Brand);
	}
  }
}
