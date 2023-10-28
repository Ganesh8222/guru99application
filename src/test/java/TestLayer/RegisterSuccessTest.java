package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageLayer.RgisterSuccessPage;

import BaseLayer.BaseClass;

public class RegisterSuccessTest extends BaseClass {
	RgisterSuccessPage obj;
	@Test(priority = 2)
	public void validateSuccessPageUrl() {
		obj=new RgisterSuccessPage();
		String actualUrl = obj.captureTheUrl();
		Assert.assertEquals(actualUrl.contains("sucess"), true);
	}

	@Test(priority = 3)
	public void clickOntheSignUpLinkInSuccessPage() {
		obj.clickOnSignUpLink();
	}
}
