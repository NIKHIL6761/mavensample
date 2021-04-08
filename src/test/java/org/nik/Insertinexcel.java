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

public class Insertinexcel {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\User\\eclipse-workspace\\Excel\\excel\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream fileinput=new FileInputStream(file);
		Workbook wrkbook=new XSSFWorkbook(fileinput);
		Sheet sheet = wrkbook.getSheet("Test");
		Row createRow = sheet.createRow(2);
		
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("nikhil");
		
		FileOutputStream fileOut=new FileOutputStream(file);
		wrkbook.write(fileOut);
		System.out.println("s");
	}
	
	

}
