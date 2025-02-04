package com.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class Subscription10 {
	@Test
	public static void products8() throws InterruptedException  {

	WebDriver driver= Browser.chromeDriver();
		SourcesLink.link(driver);
	WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
	if(logo.isDisplayed()) {
		System.out.println("Logo is Displayed.. You can proceed");
	}else System.out.println("Logo is not Displayed.. STOP STOP");
	WebElement subscripion=LocatorsForElement.XpathLocator(driver, "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");
	System.out.println(subscripion.getLocation());
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("window.scrollTo(0,8385);");
	Assert.assertTrue(subscripion.isDisplayed()	, "No Subscriptionis not visible");
	driver.quit();
	}
}