package br.ce.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.pageUtils.WebDriverFactory;

public abstract class Page {
	protected Integer baseWaitTime = 30;
	protected String baseUrl = "https://bugbank.netlify.app/";
	protected WebDriver driver = WebDriverFactory.getDriver();
	protected Actions action = WebDriverFactory.getActions();
	
	public void urlGet() {
		driver.get(baseUrl);
	}
	
	public void urlQuit() {
		driver.quit();
	}
	
	
	
	public void write(By by, String keys) {
		driver.findElement(by).sendKeys(keys);
	}
	
	public String read(By by) {
		return driver.findElement(by).getText();
	}
	
	public void click(By by) {
		driver.findElement(by).click();
	}
	
	public WebElement find(By by) {
		return driver.findElement(by);
	}
	
}
