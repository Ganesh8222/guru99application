package BaseLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public static ThreadLocal<WebDriver> threadlocal = new ThreadLocal<WebDriver>();

	public static WebDriver getDriver() {
		return threadlocal.get();
	}

	public static void initliaztion(String broswer) {
		WebDriver driver = null;

		if (broswer.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (broswer.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();

		} else if (broswer.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();

		} else {
			System.out.println("invalid broswer");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().deleteAllCookies();
		threadlocal.set(driver);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
	}

}