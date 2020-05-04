package seleniumFirstTest;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class SeleniumTestFireFox {
	

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.gecko.driver", "/Users/szito/Desktop/ML-scripts/Drivers/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.mercadolibre.com.uy/");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
