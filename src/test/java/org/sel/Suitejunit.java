package org.sel;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({Samplejunit2.class, Samplejunit.class})

public class Suitejunit {
	public static void main(String[] args) {
	Result run=JUnitCore.runClasses(SuiteClasses.class);
	
	int failureCount = run.getFailureCount();		
	System.out.println("fc:"+failureCount);
	
	
	}
	
}
