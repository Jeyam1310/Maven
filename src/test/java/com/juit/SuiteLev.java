package com.juit;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
@RunWith(Suite.class)
@SuiteClasses({A.class,A2.class,A3.class,A4.class})
public class SuiteLev {

	@Test
	public void test() {
		
		Result runClasses = JUnitCore.runClasses(A.class,A2.class,A3.class,A4.class);
		
		int runCount = runClasses.getRunCount();
		System.out.println("Total number of runcount is:"+runCount);
		
		int ignoreCount = runClasses.getIgnoreCount();
		System.out.println("Total number of IgnoreCount is:"+ignoreCount);
		
		int failureCount = runClasses.getFailureCount();
		System.out.println("Total number of Fialurecount is:"+failureCount);
		

	}
}
