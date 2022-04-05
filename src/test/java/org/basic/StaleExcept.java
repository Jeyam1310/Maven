package org.basic;

import org.base.BaseClassJunit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleExcept extends BaseClassJunit{
	static WebDriver dv;
public static void main(String[] args) throws InterruptedException {
	BaseClassJunit bs = new BaseClassJunit();
	WebDriverManager.chromedriver().setup();
	dv = new ChromeDriver();
	getDriver();
	loadUrl("https://www.facebook.com/");
	WebElement ids = bs.findLocatorById("email");
	ids.sendKeys("Hello@123");
	Thread.sleep(2000);
	dv.navigate().refresh();
	//Once sendKeys inserted then refersh same page 
	//again same locator to pass or insert the keys again that time 
	//StaleElementException happen but using Junit its not happen
	ids.sendKeys("hi123");
	
}
}
