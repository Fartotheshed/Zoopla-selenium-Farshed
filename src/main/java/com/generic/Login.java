package com.generic;

import org.openqa.selenium.WebDriver;

import com.util.BaseConfig;
import com.util.Highlighter;
import com.util.Screenshot;

public class Login {
	public MasterPageFactory login(WebDriver driver) {
		MasterPageFactory obj = new MasterPageFactory(driver);
		obj.getCookies().click();
		Highlighter.addColor(driver, obj.getSigninbtn());
		Screenshot.getScreenshot(driver, "before sign-in");
		obj.getSigninbtn().click();
		Highlighter.addColor(driver, obj.getEmail());
		obj.getEmail().sendKeys(BaseConfig.getData("user"));
		Screenshot.getScreenshot(driver, "after user");
		Highlighter.addColor(driver, obj.getPassword());
		obj.getPassword().sendKeys(BaseConfig.getData("password"));
		Highlighter.addColor(driver, obj.getLogin());
		obj.getLogin().click();
		return obj;
		
	}
}
