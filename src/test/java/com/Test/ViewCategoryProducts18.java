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

public class ViewCategoryProducts18 {
	@Test
	public void viewCategoryProducts18() {
		WebDriver driver = Browser.chromeDriver();
		SourcesLink.link(driver);
		//feature
		Assert.assertTrue(LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div[1]/div/div[2]/div[1]/h2").isDisplayed(), "Product tab is not displayed");
		//plus
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,614);");
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a/span").click();
		//dress
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 WebElement dresButton=wait.until(ExpectedConditions.elementToBeClickable(LocatorsForElement.XpathLocator(driver, "/html/body/section[2]/div/div/div[1]/div/div[1]/div[1]/div[2]/div/ul/li[1]/a")));
		dresButton.click();
		//dressText.click();
		
		String dress = "WOMEN - DRESS PRODUCTS";
		WebElement dressElement = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div[2]/div[2]/div/h2");
		
		System.out.println(dressElement.getText());
		Assert.assertTrue(dress.equals(dressElement.getText()),"Category Page is not Displayed");
		//men
		LocatorsForElement.XpathLocator(driver, "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a/span").click();
		//jeans
		WebElement jeansButton=LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div[2]/div[1]/div/div[1]/div[2]/div[2]/div/ul/li[2]/a");
		WebElement jclick=wait.until(ExpectedConditions.elementToBeClickable(jeansButton));
		jclick.click();
		String jeans="MEN - JEANS PRODUCTS";
		WebElement jeansElement = LocatorsForElement.XpathLocator(driver, "/html/body/section/div/div[2]/div[2]/div/h2");
		
		Assert.assertTrue(jeansElement.getText().equals(jeans), "Jeans category is not Dispplayed");
		driver.quit();
		
	
	}

}
