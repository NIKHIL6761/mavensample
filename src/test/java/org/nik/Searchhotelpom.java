package org.nik;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotelpom extends Base {
	public Searchhotelpom() {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="location")
	private WebElement dnlocation;
	@FindBy(id="hotels")
	private WebElement dnhotel;
    @FindBy(id="Submit")
	WebElement search;
	
	
	public WebElement getDnlocation() {
		return dnlocation;
	}
	public WebElement getDnhotel() {
		return dnhotel;
	}
	public WebElement getSearch() {
		return search;
	}
	
	
		
	}
	
	
	


