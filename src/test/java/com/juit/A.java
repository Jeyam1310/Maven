package com.juit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class A {

	@Test
	public void method1() {
		System.out.println("Method 1");
}
	@Test
	public void method2() {
		System.out.println("Method 2");
}
	@Ignore
	@Test
	public void metho3() {
		System.out.println("Method 3");
}
	
	@Test
	public void tco1() {
	Assert.assertFalse("Method tc01",false);
	
	}	
}
