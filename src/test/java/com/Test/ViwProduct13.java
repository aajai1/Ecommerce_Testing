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

public class ViwProduct13 {
	@Test
	public static void products8() throws InterruptedException  {

		WebDriver driver= Browser.chromeDriver();
		SourcesLink.link(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
		if(logo.isDisplayed()) {
			System.out.println("Logo is Displayed.. You can proceed");
		}else System.out.println("Logo is not Displayed.. STOP STOP");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]").click();

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,743);");
		LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[2]/div[1]/div[2]/div/div[2]/ul/li/a").click();
		LocatorsForElement.IdLocator(driver, "quantity").clear();
		LocatorsForElement.IdLocator(driver, "quantity").sendKeys("4");
		LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div/div[2]/div[2]/div[2]/div/span/button").click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement viewCart= wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "//*[@id=\"cartModal\"]/div/div/div[2]/p[2]/a")));
		viewCart.click();
		WebElement 	 Proceed= LocatorsForElement.IdLocator(driver, "cart_items");
		Assert.assertTrue(Proceed.isDisplayed(), "Proceed to checout not visible");
		

	}
}
