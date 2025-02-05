package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
	
	public static WebDriver chromeDriver() {
		return new ChromeDriver();
	}
	
	public static WebDriver edgeDriver() {
		return new EdgeDriver();

}
}