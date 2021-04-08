package org.sel;

import java.sql.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.reporters.jq.Main;

public class Smple {
static WebDriver driver;
@BeforeClass
public static void beforeclass() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Task4day\\Driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
} 
@AfterClass
 public static void after() {
	driver.quit();
}
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("nik");
	}
	@AfterMethod
public void AfterMethod() {
	int date=10;
		System.out.println(date);
	}
	
@Test

public void login() {
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("nik@fb");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("123");
	
}	
}