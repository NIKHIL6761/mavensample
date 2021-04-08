package org.sel;

import org.testng.annotations.Test;

public class Group3 {
	
@Test(groups="return")
	public void tc111() {
		System.out.println("tc111");
	}

@Test(groups="sign")
public void tc222() {
System.out.println("tc221");

}

@Test(groups="sanity")
public void tc333() {
	System.out.println("tc331");
}
}
