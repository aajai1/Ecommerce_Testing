package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class TestCasesTab7 {
	@Test
	public static void contactUs()  {
	WebDriver driver = Browser.chromeDriver();
	SourcesLink.link(driver);
	WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	if(logo.isDisplayed()) {
		System.out.println("Logo is Displayed.. You can proceed");
	}else System.out.println("Logo is not Displayed.. STOP STOP");
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a").click();
	WebElement tesCase = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div[1]/div/h2");
	if(tesCase.isDisplayed()) {
		System.out.println("Test Case Tab is displayed");
	}else System.out.println("Test Case Tab is not displayed");
	driver.quit();
	
	}}