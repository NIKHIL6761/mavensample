package org.nik;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Sample {
     @BeforeClass
	public static void beforeclass() {
		System.out.println("Before class");
	}
     @AfterClass
     public static void afterclass() {
		System.out.println("Afterclass");
	}
	@Before
	public void before() {
		System.out.println("Before");
		}
	@After
	public void after() {
		System.out.println("After");
	}
	@Test
	public void test() {
		System.out.println("Test");
}
	@Test
	public void test2() {
		System.out.println("test2");

	}

}	
