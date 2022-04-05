package com.juit;

import org.base.BaseClassJunit;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class ClassFb extends BaseClassJunit{
			BaseClassJunit bsj = new BaseClassJunit();
	@BeforeClass
	public static void beforeClass() {
		//Before Do this step change the baseclass method to static 
		//Then only accecss driver and url
		getDriver();
		loadUrl("https://www.facebook.com/");
	}
	@Test
	public void tc01() {
		WebElement textUserName = bsj.findLocatorById("email");
		bsj.type(textUserName, "Jeyamuthu");
	}
	
	@Test
	public void tc02() {
		WebElement textUserPassword = bsj.findLocatorById("pass");
		bsj.type(textUserPassword, "Hello@123");

	}

}

