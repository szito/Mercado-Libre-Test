package seleniumFirstTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeleniumTest {
	

	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver", "/Users/szito/Desktop/ML-scripts/Drivers");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
	}

}
