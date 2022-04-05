package com.juit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookExampl {

	static WebDriver dv;
	
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		dv=new ChromeDriver();
		dv.get("https://www.facebook.com/");
		dv.manage().window().maximize();
	}
	
	@Before
	public void beforeMethod() {
		long start = System.currentTimeMillis();
		System.out.println(start);
		}
	
	@After
	public void afterMethod() {
		long end = System.currentTimeMillis();
		System.out.println(end);
	}
	
	@Test
	public void afterClass() {
		WebElement uId = dv.findElement(By.id("email"));
		uId.sendKeys("Greens");
		WebElement pas = dv.findElement(By.id("pass"));
		pas.sendKeys("Hello@1234");
		WebElement log = dv.findElement(By.name("login"));
		log.click();
	}
	@AfterClass
	public static void AfterClass() throws InterruptedException {
		Thread.sleep(10000);
		dv.quit();

	}

	
}
