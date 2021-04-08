package org.sel;

import org.testng.annotations.Test;

public class Suite2 {
	
	@Test(dataProvider="sampledata",dataProviderClass=Dataprovider.class)
	
	private void tc2(String email,String pass) {
		System.out.println(email);
		System.out.println(pass);
		System.out.println("x");

	}
	
	
	
}
