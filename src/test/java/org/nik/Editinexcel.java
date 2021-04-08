package org.nik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorksheetDocument;

public class Editinexcel {
	public static void main(String[] args) throws IOException {
	File file=new File("C:\\Users\\User\\eclipse-workspace\\Excel\\excel\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fileinput=new FileInputStream(file);
		Workbook wrkbook=new XSSFWorkbook(fileinput);
		Sheet sheet = wrkbook.getSheet("Test");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		
		String stringCellValue = cell.getStringCellValue();
		
		
		
		if (stringCellValue.equals("sql")) {
			cell.setCellValue("nikhil");
			}
		FileOutputStream fileout=new FileOutputStream(file);
		wrkbook.write(fileout);
		System.out.println("v");
}
	
	}
