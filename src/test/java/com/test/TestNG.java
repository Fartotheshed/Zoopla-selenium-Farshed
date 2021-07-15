package com.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.generic.DriverManager;
import com.generic.Login;

public class TestNG {
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		driver=new DriverManager().getDriver();
	}
	
	@Test
	public void login() {
		Login obj = new Login();
		obj.login(driver);
	}
	
	@AfterTest
	
	public void teardown() {
		driver.quit();
	}
}
