package org.sel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Samplejunit {

	@BeforeClass
	public static void befclass() {
		System.out.println("1");
	}
	@Before
	public void bef() {
		System.out.println("2");
	}
	@AfterClass
	public static void aftclass() {
		System.out.println("3");
		}
	@After
	public void aft() {
	System.out.println("4");
	}
	@Test
	public void tc0() {
		System.out.println("test");
	}
	
	
		
	
	
	
	
}
