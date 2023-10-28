package TestLayer;

import org.testng.annotations.Test;

import com.PageLayer.LoginPage;

import BaseLayer.BaseClass;

public class LoginPageTest extends BaseClass {
	
	

	@Test(priority = 4)
	public void validateUserLoginFunctionality() throws Exception {
	
		LoginPage login=new LoginPage();
		login.userLoginFunctionality("gani123", "Ganu123");
	}

	@Test(priority = 5)
	public void validateLoginpageFunctionality() {
		getDriver().getTitle();
	}

}
