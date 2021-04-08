package org.nik;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excelbase extends Base2 {

	public static void main(String[] args) throws IOException {
		Base2 b = new Base2();
		System.out.println("d");
		 System.setProperty("webdriver.chrome.driver",
		 "C:\\Users\\User\\eclipse-workspace\\Task4day\\Driver\\chromedriver.exe");
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		 WebElement mail = driver.findElement(By.id("email"));
	     b.SendKey(mail, b.webpage("C:\\Users\\User\\eclipse-workspace\\Excel\\excel\\aaaaaaaaaaaaaa.xlsx","Sheet1", 0, 0));
		 WebElement pswd = driver.findElement(By.id("pass"));
		 b.SendKey(pswd,b.webpage("C:\\Users\\User\\eclipse-workspace\\Excel\\excel\\aaaaaaaaaaaaaa.xlsx", "Sheet1",1,0));
		 WebElement btn = driver.findElement(By.name("login"));
		 b.click(btn);

	}
}
