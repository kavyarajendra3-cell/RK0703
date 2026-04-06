package ddt;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteBack {

	public static void main(String[] args) throws Throwable {
		FileInputStream fis = new FileInputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\ReadDataExcel.xlsx");
        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet("Sheet2");
        FileOutputStream fis1 = new FileOutputStream("C:\\Users\\Kavya Rajendran\\OneDrive\\Documents\\ReadDataExcel.xlsx");
        sheet.getRow(0).createCell(4).setCellValue("Sucess");
        workbook.write(fis1);   
	}
}
