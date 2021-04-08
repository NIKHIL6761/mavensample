package org.sel;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assrtz {

	
	@Test	
	private void tc1() {
	System.out.println("Tc1");
	}
	@Test
	private void tc2() {
	System.out.println("tc2");

	SoftAssert s=new SoftAssert();
	s.assertTrue(false);
	s.assertAll();
	System.out.println("a");
	System.out.println("b");
	
	
}}
