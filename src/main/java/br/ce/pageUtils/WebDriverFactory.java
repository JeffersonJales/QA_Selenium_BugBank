package br.ce.pageUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;

public class WebDriverFactory {
	private static final WebDriverType webDriverType = WebDriverType.CHROME;

	private static final ChromeOptions chromeOptions = new ChromeOptions();	
	private static final FirefoxOptions firefoxOptions = new FirefoxOptions();
	
	private static WebDriver driver;
	private static Actions actions;
	private static boolean driverInit = false;
	
	
	public static WebDriver getDriver() {
		if(!driverInit) 
			setDriver();
		
		
		return driver;
	}
	
	public static Actions getActions() {
		return actions;
	}
	
	public static void urlQuit() {
		driver.quit();
	}
	
	private static void setDriver() {
		driverInit = true;
		chromeOptions.addArguments("--start-maximized");
		
		switch(webDriverType) {
			case CHROME: 
				driver = new ChromeDriver(chromeOptions);
				break;
				
			case FIREFOX:
				driver = new FirefoxDriver(firefoxOptions);
				break;
		}
		
		actions = new Actions(driver);
	}
	
	
}
