package org.nik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Hallo {
public static void main(String[] args) throws IOException {

	Workbook workbook=new XSSFWorkbook();
	
	Sheet createSheet = workbook.createSheet("Test");
	
	Row CR = createSheet.createRow(2);
	Cell createCell = CR.createCell(0);
	createCell.setCellValue("JAVA");
		FileOutputStream fileout =new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\Excel\\excel\\New Microsoft Excel Worksheet.xlsx");
	workbook.write(fileout);
	System.out.println("xxx");
	
}
}
