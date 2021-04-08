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

public class Eedits {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Excel\\excel\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fileinput=new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(fileinput);
		Sheet sheet = workbook.getSheet("Test");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
		String name = cell.getStringCellValue();
		
		if (name.equals("file")) {
			cell.setCellValue("sql");
			}
		FileOutputStream fileout=new FileOutputStream(file);
		workbook.write(fileout);
	System.out.println("done");	
	
		}
	

}
