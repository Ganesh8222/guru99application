package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilsLayer.handleDropDown;

import static UtilsLayer.utilClass.*;

public class RegisterPage extends BaseClass {

	
	@FindBy(name="firstName")
	private WebElement firstname;
	
	@FindBy(name="lastName")
	private WebElement lastName;
	
	@FindBy(name="phone")
	private WebElement phone;
	
	@FindBy(id="userName")
	private WebElement email;
	
	@FindBy(name="address1")
    private WebElement address1;
	
	@FindBy(name="city")
    private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(name="postalCode")
	private WebElement postalCode;
	
	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	
	@FindBy(name="confirmPassword")
	private WebElement confirmPassword;
	
	@FindBy(name="submit")
	private WebElement submit;
	
	public RegisterPage() {
		PageFactory.initElements(getDriver(), this);
	    
	}
	
	public void userInformation(String fname, String lname, String mPhone, String eMail, String aDress, String cName, String sState,String pCode,String nAtion,String uName,String pass,String cPass ) {
		
		sendKeys(firstname, fname);
		sendKeys(lastName, lname);
		sendKeys(phone, mPhone);
		sendKeys(email, eMail);
		sendKeys(address1, aDress);
		sendKeys(city, cName);
		sendKeys(state, sState);
		sendKeys(postalCode, pCode);
		handleDropDown.selectByVisibleText(country, nAtion);
		sendKeys(username, uName);
		sendKeys(password, pass);
		sendKeys(confirmPassword, cPass);
		click(submit);
	}
}
