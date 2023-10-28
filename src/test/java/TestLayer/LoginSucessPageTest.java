package TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageLayer.LoginSucessPage;

public class LoginSucessPageTest {
 
	@Test(priority=6)
	public void  validateLoginSucess() {
		String actualurl=LoginSucessPage.getLoginSucessUrl();
		Assert.assertEquals(actualurl.contains("sucess"),true);
	}
	
		
	
}
