package org.nik;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Task4day\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get(" http://demo.automationtesting.in/Alerts.html");
	
	driver.navigate().to("https://www.facebook.com/");
	
TakesScreenshot ss=(TakesScreenshot)driver;
	
	
	
	
	
	
	
	}}
		
	

