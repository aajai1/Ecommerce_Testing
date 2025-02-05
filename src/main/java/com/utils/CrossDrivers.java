package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossDrivers {
static	WebDriver driver ;
	public static void drivers(String browser) {
	switch (browser) {
	case "Chrome":
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		
		break;
	case "Edge":
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
		break;

	default:
		System.out.println("browser is not found");
		break;
	}	
	SourcesLink.link(driver);
}
	public static WebDriver getDriver() {
		return driver;
	}


}
