package org.nik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellAlignment;
import org.openqa.selenium.WebElement;

public class Base2 {
	public String webpage(String pathname,String sheetname,int rown,int celln) throws IOException {
		
	File file = new File(pathname);

	FileInputStream fileinput = new FileInputStream(file);
	Workbook wrkbook = new XSSFWorkbook(fileinput);
	Sheet sheet = wrkbook.getSheet(sheetname);
		Row row = sheet.getRow(rown);
		Cell cell = row.getCell(celln);
			int type = cell.getCellType();
			String valueof ="";
			if(type==1)
			{
				 valueof = cell.getStringCellValue();
			}

			else if(type==0)
			{
				if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat dateformat = new SimpleDateFormat("dd-mmm-yy");
					 valueof = dateformat.format(dateCellValue);
				} else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					 valueof = String.valueOf(l);

				}

			}
			return valueof;
			}
	
	


public void SendKey(WebElement element,String key) {
	element.sendKeys(key);
}


public void click(WebElement element) {

	element.click();
}}
