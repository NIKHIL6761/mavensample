package org.nik;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sri {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Task4day\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get(" http://demo.automationtesting.in/Alerts.html");
	
	WebElement box=driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
	box.click();
    
	WebElement clk = driver.findElement(By.xpath("//button[@class='btn btn-info']"));
	clk.click();
	Alert al=driver.switchTo().alert();
	al.sendKeys("vvvvv");
	al.accept();
	driver.close();
	
	
	
}
}
