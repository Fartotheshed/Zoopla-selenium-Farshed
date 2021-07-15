package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MasterPageFactory {
	public MasterPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//*[@class='ui-button-primary ui-cookie-accept-all-medium-large']")
	private WebElement cookies;
	@FindBy(xpath="//*[@id='input-email-address']")
	private WebElement email;
	@FindBy(xpath="//*[@id='input-password']")
	private WebElement password;
	@FindBy(xpath="//*[@class='css-gi0wky-Button-SignInButton e1oiir0n4']")
	private WebElement login;
	public WebElement getEmail() {
		return email;
	}
	public void setEmail(WebElement email) {
		this.email = email;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public WebElement getCookies() {
		return cookies;
	}
	public void setCookies(WebElement cookies) {
		this.cookies = cookies;
	}
	public WebElement getSigninbtn() {
		return signinbtn;
	}
	public void setSigninbtn(WebElement signinbtn) {
		this.signinbtn = signinbtn;
	}
	@FindBy(xpath="(//*[@class='css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0'])[4]")
	private WebElement signinbtn;
}
