package org.nik;

import org.junit.Test;

import junit.framework.Assert;

public class Assert1 {
	@Test
	public void tc0() {
	String s="Java";
	System.out.println(s);
	
	Assert.assertEquals("Java", s);
	System.out.println(s);
	System.out.println(s);
	}
   @Test
	public void tc1() {
		System.out.println("aaa");

	}
}
