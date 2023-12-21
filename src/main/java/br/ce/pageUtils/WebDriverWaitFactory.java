package br.ce.pageUtils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitFactory {
	private static final int awaitTime = 10;	
	
	public static WebDriverWait simpleWait() {
		return new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(awaitTime));
	}
	
	public static WebDriverWait simpleWait(int time) {
		return new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(time));
	}
	
	public static void esperarVisibilidade(By by) {
		simpleWait().until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	public static void esperar(By by){
		simpleWait().until(ExpectedConditions.presenceOfElementLocated(by));
	}
		  
	public static void esperarInteratividade(By by) {
		simpleWait().until(ExpectedConditions.elementToBeClickable(by));
	}
	
	public static void esperarElementoNaoEstaVisivel(By by) {
		 simpleWait().until(ExpectedConditions.invisibilityOfElementLocated(by));
	 }
	
}
