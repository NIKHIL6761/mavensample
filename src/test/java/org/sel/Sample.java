package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Sample {
@Parameters({"email","pass"})
@Test
public void tc1(String email,String pass) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Task4day\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement user = driver.findElement(By.id("email"));
user.sendKeys(email);
WebElement txtpass = driver.findElement(By.id("pass"));
txtpass.sendKeys(pass);

}
}

