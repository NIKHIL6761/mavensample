package org.nik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sel.Hotel;

public class SampleofPom extends Base {
	public static void main(String[] args) {
		Base base=new Base();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Task4day\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Hotel h=new Hotel();
		
	//	WebElement txtuser = driver1.findElement(By.id("username"));
	//	txtuser.sendKeys("green12345");
		base.SendKey(h.getUsername(), "nik");
		
		base.SendKey(h.getPassword(), "123");
		
		
		
		
		
	}

}
