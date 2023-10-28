package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.*;
public class LoginPage extends BaseClass {

	@FindBy(name="userName")
	private WebElement userName;
	
	@FindBy(name="password")
	private WebElement password;

	@FindBy(name="submit")
	private WebElement submit;
	
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void userLoginFunctionality(String uname,String pass) {
		utilClass.sendKeys(userName,uname);
		utilClass.sendKeys(password,pass);
		utilClass.click(submit);
	}
}
