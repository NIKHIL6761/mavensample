package org.nik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;

public class ExcelSheet {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\User\\eclipse-workspace\\Excel\\excel\\New Microsoft Excel Worksheet.xlsx");
	FileInputStream fileinput=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fileinput);
	Sheet sheet = workbook.getSheet("sheet1");
	
	for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
		
	
	Row row = sheet.getRow(i);
	for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
		

	Cell cell = row.getCell(j);
	System.out.println(cell);
	
	}
	}

	}}
