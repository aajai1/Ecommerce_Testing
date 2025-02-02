package com.utils;

import org.openqa.selenium.WebDriver;

public class SourcesLink {
	
	public static void link(WebDriver driver) {
		String url="https://www.automationexercise.com/";
		driver.get(url);
		driver.manage().window().maximize();
	}

}
