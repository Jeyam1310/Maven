package com.juit;

import org.junit.Assert;
import org.junit.Test;

public class JunitAssertConcept {

	@Test
	public void tc0()
	{
		String s="abc";	
		Assert.assertEquals("Abc", s);
		//If one method inside the logic fail then no other methods 
		//cannot run and call
		//If expected and given are same(s=abc),Assert.assertEquals("cbc", s);then all method 
		//Inside are run but here comparision time condition fail
		//So no other method called
		
		System.out.println("hi");
		System.out.println("hello");
		System.out.println(s);	
	}
	
	@Test
	public void tc01()
	{
		System.out.println("Method 1");
	}

	
}
