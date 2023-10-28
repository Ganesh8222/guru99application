package TestLayer;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.PageLayer.RegisterPage;

import BaseLayer.BaseClass;

public class RegisterPageTest extends BaseClass {
	

	@BeforeTest
	public void setup() {
		initliaztion("chrome");
	}

	@Test(priority=1)
	public void validateContactInformation() {
		RegisterPage rPage = new RegisterPage();
		rPage.userInformation("Gani", "kabra", "8055008055", "ganukabra12@gmail.com","nanded","Nanded","maharashtra","431605","INDIA","gani123","Ganu123","Ganu123");
	}

	@AfterTest
	public void tearDown() {

	}
}
