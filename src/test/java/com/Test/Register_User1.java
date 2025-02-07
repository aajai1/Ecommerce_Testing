package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

import io.github.serpro69.kfaker.Faker;

public class Register_User1 {
	@Test
	public static void registerUser() {
		WebDriver driver = Browser.edgeDriver();
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
	
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]").sendKeys("jospeh.bernhard@rohan.notest");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[3]/div/form/button").click();
		WebElement enterAccInfo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div[1]/h2/b");
		if(enterAccInfo.isDisplayed()) {
			System.out.println("Enter Account Information is Displayed.. You can proceed");
		}else System.out.println("Enter Account Information is not Displayed.. STOP STOP");
		WebElement MrButton = LocatorsForElement.XpathLocator(driver, "//*[@id=\"id_gender1\"]");
		MrButton.click();
		//enter details
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,743);");
		LocatorsForElement.IdLocator(driver, "password").sendKeys("myname@1258");
		LocatorsForElement.IdLocator(driver, "days").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"days\"]/option[28]").click();
		LocatorsForElement.IdLocator(driver, "months").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"months\"]/option[8]").click();
		LocatorsForElement.IdLocator(driver, "years").click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"years\"]/option[14]").click();
		LocatorsForElement.IdLocator(driver, "newsletter").click();
		LocatorsForElement.IdLocator(driver, "optin").click();
		//Address Information
		LocatorsForElement.IdLocator(driver, "first_name").sendKeys("This");
		LocatorsForElement.IdLocator(driver, "last_name").sendKeys("Name");
		LocatorsForElement.IdLocator(driver, "address1").sendKeys("This address \n soo aon");
		LocatorsForElement.IdLocator(driver, "address2").sendKeys("This address \n soo aon");
		WebElement country = LocatorsForElement.IdLocator(driver, "country");
		country.click();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"country\"]/option[2]").click();
		LocatorsForElement.IdLocator(driver, "state").sendKeys("California");
		LocatorsForElement.IdLocator(driver, "city").sendKeys("That city");
		LocatorsForElement.IdLocator(driver, "zipcode").sendKeys("792722");
		LocatorsForElement.IdLocator(driver, "mobile_number").sendKeys("1257896342");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div[1]/form/button").click();
		WebElement accountCreated = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/h2/b");
		if(accountCreated.isDisplayed()) {
			System.out.println("Account Created! is Displayed.. You can proceed");
		}else System.out.println("Account Created! is not Displayed.. STOP STOP");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div/div/a").click();
		WebElement loggedInVerify =	LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a");
		if(loggedInVerify.isDisplayed()) {
			System.out.println(" Logged in as is Displayed You can proceed");
		}else System.out.println(" Logged in as  is not Displayed.. STOP STOP");
		driver.quit();
	}


}
