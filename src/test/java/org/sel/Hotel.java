package org.sel;

import org.nik.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Hotel extends Base {
	public Hotel() {
		PageFactory.initElements(driver, this);
	}
	
@CacheLookup
@FindBys({
@FindBy(id="email"),
@FindBy(xpath="//input[@name='email']")
})
private WebElement username;
@CacheLookup
@FindBys({
	@FindBy(name="pass"),
	@FindBy(xpath="//input[@name='pass']")
})
private WebElement password;





public WebElement getUsername() {
	return username;
}
public WebElement getPassword() {
	return password;
} 
	

}