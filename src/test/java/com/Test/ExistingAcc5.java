package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class ExistingAcc5 {
	@Test
	public static void existingAcc() {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
		if(logo.isDisplayed()) {
			System.out.println("Logo is Displayed.. You can proceed");
		}else System.out.println("Logo is not Displayed.. STOP STOP");
		WebElement login =  LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
		login.click();
		WebElement signUpText = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/h2");
		if(signUpText.isDisplayed()) {
			System.out.println("signUpText is Displayed.. You can proceed");
		}else System.out.println("signUpText is not Displayed.. STOP STOP");
		//name and mail
		LocatorsForElement.NameLocator(driver, "name").sendKeys("My Name");
		//email
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]").sendKeys("jospeh.bernhard@rohan.notest");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/button").click();
		WebElement alreadyExist = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/p");
		if(alreadyExist.isDisplayed()) {
			System.out.println("Email Address already exist! is displayed");
		}else System.out.println("Email Address already exist! is not displayed");
		driver.quit();
	}
}