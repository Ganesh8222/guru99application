package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class LoginSucessPage extends BaseClass {

	public static String getLoginSucessUrl() {
		return getDriver().getCurrentUrl();
	}
	}

