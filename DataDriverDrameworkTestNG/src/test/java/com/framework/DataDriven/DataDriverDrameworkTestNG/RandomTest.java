package com.framework.DataDriven.DataDriverDrameworkTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RandomTest {

	public  WebDriver driver;
	
	
	@Test
	public void testingRoughTest(){
	driver = new FirefoxDriver();	
	driver.manage().window().maximize();
	
	driver.close();
	}
}
