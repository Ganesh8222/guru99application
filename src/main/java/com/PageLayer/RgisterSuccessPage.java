package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.utilClass;

public class RgisterSuccessPage extends BaseClass {
	@FindBy(xpath = "//a[text()=' sign-in ']")
	private WebElement link;

	public RgisterSuccessPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public String captureTheUrl() {
		return  getDriver().getCurrentUrl();
	}

	public void clickOnSignUpLink() {
		utilClass.click(link);
	}

}
