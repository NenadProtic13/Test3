package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import objects.HomeNew;

public class LogInTest {
	
	private static WebDriver driver;
	
	@BeforeClass
	public void createDriver()  {
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();
}
	@Test
	public void testLogi() {
		driver.navigate().to(HomeNew.URL);
		HomeNew.clickLogin(driver);
		String currentUrl = driver.getCurrentUrl();
		String expectedUrl = HomeNew.URL;
		Assert.assertEquals(currentUrl, expectedUrl);
		}
	//ne stizem ovaj test, sad mi doslo iz ...  :( 
	@Test
	public void testLogin1() {
		File f = new File("Test")
	}
	
}