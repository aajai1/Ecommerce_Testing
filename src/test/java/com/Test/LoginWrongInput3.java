package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

import io.github.serpro69.kfaker.Faker;

public class LoginWrongInput3 {
	@Test
	public static void loginUserWrongInput() {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
		if(logo.isDisplayed()) {
			System.out.println("Logo is Displayed.. You can proceed");
		}else System.out.println("Logo is not Displayed.. STOP STOP");
		WebElement login =  LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a");
		login.click();
		//email &password
		Faker fake = new Faker();
		String emaillFake= fake.getInternet().email();
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]").sendKeys("jospeh.bernhard@rohan.test");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]").sendKeys("myname@125");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button").click();
		WebElement loginFailed = LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div/form/p");
		if(loginFailed.isDisplayed()) {
			System.out.println("Your email or password is incorrect! is Visible");
		}else System.out.println("Your email or password is incorrect! is not visible");
		
		driver.quit();
	}
}
