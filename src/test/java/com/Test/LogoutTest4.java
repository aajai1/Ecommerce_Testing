package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

import io.github.serpro69.kfaker.Faker;

public class LogoutTest4 {
	@Test
	public static void logoutTest() {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
		if(logo.isDisplayed()) {
			System.out.println("Logo is Displayed.. You can proceed");
		}else System.out.println("Logo is not Displayed.. STOP STOP");
		WebElement login =  LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
		login.click();
		//email &password

		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]").sendKeys("jospeh.bernhard@rohan.notest");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]").sendKeys("myname@1258");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button").click();
		//loginsuccess
		WebElement loggedAs = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
		if(loggedAs.isDisplayed()) {
			System.out.println(" Logged in as is Displayed You can proceed");
		}else System.out.println(" Logged in as  is not Displayed.. STOP STOP");
		//logout
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a").click();
		String pageurl= "https://www.automationexercise.com/login";
		if(driver.getCurrentUrl().equals(pageurl)) {
			System.out.println("Logged out");
		}
		System.out.println("Error in Logout");
		driver.quit();

	}
}