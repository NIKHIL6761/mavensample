package org.nik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;

public class Base {

	public static WebDriver driver;

public void edit(String path,String sheetname,int RV,int CV,String stringcellv,String setcel,String success) throws IOException {
	
	File file=new File(path);
	FileInputStream fileinput=new FileInputStream(file);
	Workbook wrkbook=new XSSFWorkbook(fileinput);
	Sheet sheet = wrkbook.getSheet(sheetname);
	Row row = sheet.getRow(RV);
	Cell cell = row.getCell(CV);
	
	String stringCellValue = cell.getStringCellValue();
	
	if (stringCellValue.equals(stringcellv)) {
		cell.setCellValue(setcel);
		}
	FileOutputStream fileout=new FileOutputStream(file);
	wrkbook.write(fileout);
	System.out.println(success);
	
}



public void SendKey(WebElement element,String key) {
	element.sendKeys(key);
}

public void click(WebElement element) {

	element.click();

}

private void exceltoweb(String pathname,String sheetname,int rown,int celln) throws IOException {
	
	File file = new File(pathname);

	FileInputStream fileinput = new FileInputStream(file);
	Workbook wrkbook = new XSSFWorkbook(fileinput);
	Sheet sheet = wrkbook.getSheet(sheetname);
		Row row = sheet.getRow(rown);
		Cell cell = row.getCell(celln);
			int type = cell.getCellType();
			
			if(type==1)
			{
				String stringlValue = cell.getStringCellValue();
				System.out.println(stringlValue);
			}

			else if(type==0)
			{
				if (DateUtil.isCellDateFormatted(cell)) {
		//			Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-mmm-yy");
	//				String value = dateformat.format(dateCellValue);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					String valueOf = String.valueOf(l);

				}

			}}
	
	
}


