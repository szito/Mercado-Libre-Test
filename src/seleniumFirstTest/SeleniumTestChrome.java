package seleniumFirstTest;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
;



public class SeleniumTestChrome {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/szito/Desktop/ML-scripts/Drivers/chromedriver");
		ChromeOptions chromeoptions = new ChromeOptions();
		chromeoptions.addArguments("user-data-dir=/Users/szito/Library/Application Support/Google/Chrome/");
		//chromeoptions.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(chromeoptions);
		driver.get("https://www.mercadolibre.com.uy/");
		Thread.sleep(5000);
		driver.close();

	}

}
