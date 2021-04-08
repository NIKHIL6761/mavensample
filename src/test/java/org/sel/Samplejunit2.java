package org.sel;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Samplejunit2 {

	
	@BeforeClass
	public static void befclass() {
		System.out.println("a");
		
	}
	@Before
	public void bef() {
		System.out.println("b");
	}
	@AfterClass
	public static void aftclass() {
		System.out.println("c");
		}
	@After
	public void aft() {
	System.out.println("d");
	}
	
	@Test
	public void tc1() {
		// TODO Auto-generated method stub
System.out.println("test");
	}
	
	}
