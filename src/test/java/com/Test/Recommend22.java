package com.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class Recommend22 {
	@Test
	public void recommend() throws InterruptedException {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,7583);");
		
		Assert.assertTrue(LocatorsForElement.XpathLocator(driver, "//h2[normalize-space()='recommended items']").isDisplayed(), "Recomended Products is not Displayed");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"recommended-item-carousel\"]/a[2]").click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement add1= LocatorsForElement.XpathLocator(driver, "//*[@id=\"recommended-item-carousel\"]/div/div[1]/div[1]/div/div/div/a");
		wait.until(ExpectedConditions.elementToBeClickable(add1));
		add1.click();
		WebElement cart =LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a");
		wait.until(ExpectedConditions.elementToBeClickable(cart));
		cart.click();
		Assert.assertTrue(LocatorsForElement.IdLocator(driver, "cart_info").isDisplayed(), "Cart Tab is Not Displayed");
		driver.quit();
	}

}
