package stepglu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class DriversUtil {
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Training_h2a.09.22\\Desktop\\seleniumbrowser\\chromedriver.exe");
			return new ChromeDriver();
	  }
		else if(browser.equalsIgnoreCase("ff")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\Training_h2a.09.22\\Desktop\\seleniumbrowser\\geckodriver.exe");
			return new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			return new InternetExplorerDriver();
		}
		else {
			return null;
		}
	}

}

