package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	public static WebDriver chromeDriver() {
		return new ChromeDriver();
		
	}
	
	public static WebDriver FirefoxBrowser() {
		return new FirefoxDriver();
		
	}

}
