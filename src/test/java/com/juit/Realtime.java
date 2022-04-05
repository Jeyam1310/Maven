package com.juit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Realtime {

		static WebDriver dv;
		
		@BeforeClass
		public static void beforeClass() {
			WebDriverManager.chromedriver().setup();
			dv=new ChromeDriver();
			dv.get("https://www.facebook.com/");
			dv.manage().window().maximize();
		}
		
		
		@Test
		public void afterClass() {
			WebElement uId = dv.findElement(By.id("email"));
			uId.sendKeys("Greens");
			//Assert.assertEquals(Long Expected,actual);
			Assert.assertEquals(uId.getAttribute("value"),"Greens");
			
			WebElement pas = dv.findElement(By.id("pass"));
			pas.sendKeys("Hello@1234");
			//Assert.assertEquals(Long Expected,actual);
			Assert.assertEquals(pas.getAttribute("value"),"hello@123");
			
			WebElement log = dv.findElement(By.name("login"));
			log.click();
		}
		

}
