package com.Test;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Browser;
import com.utils.LocatorsForElement;
import com.utils.SourcesLink;

public class WithoutArrow26 {
	@Test
	public void useArrow25() throws InterruptedException {
		WebDriver driver= Browser.edgeDriver();
		SourcesLink.link(driver);
		WebElement logo = LocatorsForElement.XpathLocator(driver, "//*[@id=\"header\"]/div/div/div/div[1]/div/a/img");
		Assert.assertTrue(logo.isDisplayed(), "logo is not Displayed");
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,8285);");
		//Thread.sleep(3000);
		LocatorsForElement.IdLocator(driver, "scrollUp").click();
		WebElement title = LocatorsForElement.XpathLocator(driver, "//*[@id=\"scrollUp\"]/i");
		Assert.assertTrue(title.isDisplayed(), "Full-Fledged Message is not displayed");
		driver.quit();
	}

}
