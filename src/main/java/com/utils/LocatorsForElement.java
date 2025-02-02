package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsForElement {
	
	public static WebElement IdLocator(WebDriver driver,String path) {
		return driver.findElement(By.id(path));
	}
	
	public static WebElement ClassNameLocator(WebDriver driver,String path) {
		return driver.findElement(By.className(path));
	}

	public static WebElement CssSelectorLocator(WebDriver driver,String path) {
		return driver.findElement(By.cssSelector(path));
	}

	public static WebElement LinkTextLocator(WebDriver driver,String path) {
		return driver.findElement(By.linkText(path));
	}

	public static WebElement NameLocator(WebDriver driver,String path) {
		return driver.findElement(By.name(path));
	}

	public static WebElement PartialLinkLocator(WebDriver driver,String path) {
		return driver.findElement(By.partialLinkText(path));
	}

	public static WebElement XpathLocator(WebDriver driver,String path) {
		return driver.findElement(By.xpath(path));
	}

	public static WebElement TagNameLocator(WebDriver driver,String path) {
		return driver.findElement(By.tagName(path));
	}


}
