package objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomeNew {

	public static final String URL = "https://www.saucedemo.com/";
	
	
	public static void clickLogin(WebDriver driver) {
		driver.findElement(By.name("login-button")).click();
	}
}
