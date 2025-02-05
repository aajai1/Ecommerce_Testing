package com.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class Review21 {
	@Test
	public void review21() {
		WebDriver driver =  Browser.chromeDriver();
		SourcesLink.link(driver);
		LocatorsForElement.XpathLocator(driver, "//a[@href='/products']").click();
		Assert.assertTrue(LocatorsForElement.XpathLocator(driver, "//h2[@class='title text-center']").isDisplayed(), "Products Tab is not Displayed");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,943);");
		WebElement viewProduct = LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[2]/ul/li");
		viewProduct.click();
		WebElement name = LocatorsForElement.IdLocator(driver, "name");
		js.executeScript("window.scrollTo(0,633);");
		name.sendKeys("My Name");
		LocatorsForElement.IdLocator(driver, "email").sendKeys("email@gmail.com");
	LocatorsForElement.IdLocator(driver, "review").sendKeys("Nice Product");
	LocatorsForElement.IdLocator(driver, "button-review").click();
	WebElement success = LocatorsForElement.XpathLocator(driver, "//*[@id=\"review-section\"]/div/div");
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(success));	
	Assert.assertTrue(success.isDisplayed(), "success is not Displayed");
	driver.quit();
	}
	}
