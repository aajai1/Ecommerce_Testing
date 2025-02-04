package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

import io.github.serpro69.kfaker.Faker;

public class accDelete2 {
	@Test
	public static void loginUser() {
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
		//delacc
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a").click();
		WebElement deleteAcc = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/h2");
		if(deleteAcc.isDisplayed()) {
			System.out.println(" Account Deleted! is Displayed You can proceed");
		}else System.out.println(" Account Deleted!  is not Displayed.. STOP STOP");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a").click();
		
		driver.quit();
	}
}
