package org.nik;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Whandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Task4day\\Driver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
		WebElement txtsearch = driver.findElement(By.id("twotabsearchtextbox"));
	txtsearch.sendKeys("iphone",Keys.ENTER);
	WebElement iphone = driver.findElement(By.xpath("//span[text()='New Apple iPhone 11 (64GB) - Purple']"));
	iphone.click();
	
	String pwin = driver.getWindowHandle();
	System.out.println(pwin);
	
	Set<String> parchild = driver.getWindowHandles();
	System.out.println(parchild);
	
	for (String eachwindow : parchild) {
		if (!pwin.equals(eachwindow)) {
	driver.switchTo().window(eachwindow);
	}
	}
			
			
	
	WebElement cartbtn = driver.findElement(By.id("add-to-cart-button"));
cartbtn.click();

driver.switchTo().window(pwin);

WebElement books = driver.findElement(By.id("twotabsearchtextbox"));
books.sendKeys("books");
	
	}
	
}
	
	
	

