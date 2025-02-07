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

public class SearchProduct20 {
	@Test
	public void searchProducts() throws InterruptedException {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);

		WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
		Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
		//product
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a").click();
		WebElement allProducts = LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/h2");
		Assert.assertTrue(allProducts.isDisplayed(),"All Products is Not Displayed");
		//search
		LocatorsForElement.IdLocator(driver, "search_product").sendKeys("T Shirt");
		LocatorsForElement.IdLocator(driver, "submit_search").click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,743);");
		//add
		LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div/div[2]/div/div[1]/div[1]/a").click();
		//cart
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement viewCart=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")));
		Assert.assertTrue(viewCart.isDisplayed(), "Element is not displayed");
		viewCart.click();
		//cartinfo
		Assert.assertTrue(LocatorsForElement.IdLocator(driver, "cart_info").isDisplayed(), "Cadrt Info is not Displayed");
		//login
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a").click();
		//email &password
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[2]").sendKeys("jospeh.bernhard@rohan.notest");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/input[3]").sendKeys("myname@1258");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"form\"]/div/div/div[1]/div[1]/form/button").click();
		//cart
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a").click();
		//Again cartinfo
		Assert.assertTrue(LocatorsForElement.IdLocator(driver, "cart_info").isDisplayed(), "Cadrt Info is not Displayed");
		driver.quit();
	}

}
