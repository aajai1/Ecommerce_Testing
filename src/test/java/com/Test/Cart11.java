package com.Test;

import java.time.LocalDateTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class Cart11 {
@Test
public void cartTese() {

	WebDriver driver=Browser.chromeDriver();
	SourcesLink.link(driver);
	LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]").click();
	WebElement subscription=LocatorsForElement.XpathLocator(driver, "//*[@id=\"footer\"]/div[1]/div/div/div[2]/div/h2");
	Assert.assertTrue(subscription.isDisplayed(), "Subscription is not displayed");
	LocatorsForElement.IdLocator(driver, "susbscribe_email").sendKeys("jospeh.bernhard@rohan.test");
	LocatorsForElement.IdLocator(driver, "subscribe").click();
	WebElement success=LocatorsForElement.IdLocator(driver, "success-subscribe");
	Assert.assertTrue(success.isDisplayed(), "You have been successfully subscribed! is not visible");
	driver.quit();
	
}
}
