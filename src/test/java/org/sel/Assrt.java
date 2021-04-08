package org.sel;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assrt {
@Test	
private void tc1() {
System.out.println("Tc1");
}
@Test
private void tc2() {
System.out.println("tc2");


Assert.assertTrue(false);

System.out.println("tc3");
System.out.println("tc4");
System.out.println("tc5");


}
@Test
private void tc5() {
	System.out.println("tc6");

}
}
