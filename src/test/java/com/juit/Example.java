package com.juit;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Example {

	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
		}
	@Before
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}
	
	@After
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	@Test
	public void login() {
		System.out.println("login");
	}
	@Test
	public void payment() {
		System.out.println("payment");
	}
	
		
}
