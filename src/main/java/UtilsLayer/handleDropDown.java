package UtilsLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class handleDropDown extends BaseClass {
	public static void selectByVisibleText(WebElement wb, String value) {
		Select scl=new Select(wb);
		scl.selectByVisibleText(value);
		
	}
}
